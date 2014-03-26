/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMsg.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMsg.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
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
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author G. Todd Miller * @author Erwin Bolwidt <ejb@klomp.org> * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author G. Todd Miller @author Erwin Bolwidt <ejb@klomp.org> @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ErrorMsg	TokenNameIdentifier	 Error Msg
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_isWarningError	TokenNameIdentifier	 is Warning Error
;	TokenNameSEMICOLON	
// Compiler error messages 	TokenNameCOMMENT_LINE	Compiler error messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MULTIPLE_STYLESHEET_ERR	TokenNameIdentifier	 MULTIPLE  STYLESHEET  ERR
=	TokenNameEQUAL	
"MULTIPLE_STYLESHEET_ERR"	TokenNameStringLiteral	MULTIPLE_STYLESHEET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEMPLATE_REDEF_ERR	TokenNameIdentifier	 TEMPLATE  REDEF  ERR
=	TokenNameEQUAL	
"TEMPLATE_REDEF_ERR"	TokenNameStringLiteral	TEMPLATE_REDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEMPLATE_UNDEF_ERR	TokenNameIdentifier	 TEMPLATE  UNDEF  ERR
=	TokenNameEQUAL	
"TEMPLATE_UNDEF_ERR"	TokenNameStringLiteral	TEMPLATE_UNDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VARIABLE_REDEF_ERR	TokenNameIdentifier	 VARIABLE  REDEF  ERR
=	TokenNameEQUAL	
"VARIABLE_REDEF_ERR"	TokenNameStringLiteral	VARIABLE_REDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
=	TokenNameEQUAL	
"VARIABLE_UNDEF_ERR"	TokenNameStringLiteral	VARIABLE_UNDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
=	TokenNameEQUAL	
"CLASS_NOT_FOUND_ERR"	TokenNameStringLiteral	CLASS_NOT_FOUND_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
METHOD_NOT_FOUND_ERR	TokenNameIdentifier	 METHOD  NOT  FOUND  ERR
=	TokenNameEQUAL	
"METHOD_NOT_FOUND_ERR"	TokenNameStringLiteral	METHOD_NOT_FOUND_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier	 ARGUMENT  CONVERSION  ERR
=	TokenNameEQUAL	
"ARGUMENT_CONVERSION_ERR"	TokenNameStringLiteral	ARGUMENT_CONVERSION_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_NOT_FOUND_ERR	TokenNameIdentifier	 FILE  NOT  FOUND  ERR
=	TokenNameEQUAL	
"FILE_NOT_FOUND_ERR"	TokenNameStringLiteral	FILE_NOT_FOUND_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_URI_ERR	TokenNameIdentifier	 INVALID  URI  ERR
=	TokenNameEQUAL	
"INVALID_URI_ERR"	TokenNameStringLiteral	INVALID_URI_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_ACCESS_ERR	TokenNameIdentifier	 FILE  ACCESS  ERR
=	TokenNameEQUAL	
"FILE_ACCESS_ERR"	TokenNameStringLiteral	FILE_ACCESS_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MISSING_ROOT_ERR	TokenNameIdentifier	 MISSING  ROOT  ERR
=	TokenNameEQUAL	
"MISSING_ROOT_ERR"	TokenNameStringLiteral	MISSING_ROOT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_UNDEF_ERR	TokenNameIdentifier	 NAMESPACE  UNDEF  ERR
=	TokenNameEQUAL	
"NAMESPACE_UNDEF_ERR"	TokenNameStringLiteral	NAMESPACE_UNDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNCTION_RESOLVE_ERR	TokenNameIdentifier	 FUNCTION  RESOLVE  ERR
=	TokenNameEQUAL	
"FUNCTION_RESOLVE_ERR"	TokenNameStringLiteral	FUNCTION_RESOLVE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEED_LITERAL_ERR	TokenNameIdentifier	 NEED  LITERAL  ERR
=	TokenNameEQUAL	
"NEED_LITERAL_ERR"	TokenNameStringLiteral	NEED_LITERAL_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XPATH_PARSER_ERR	TokenNameIdentifier	 XPATH  PARSER  ERR
=	TokenNameEQUAL	
"XPATH_PARSER_ERR"	TokenNameStringLiteral	XPATH_PARSER_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
=	TokenNameEQUAL	
"REQUIRED_ATTR_ERR"	TokenNameStringLiteral	REQUIRED_ATTR_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_CHAR_ERR	TokenNameIdentifier	 ILLEGAL  CHAR  ERR
=	TokenNameEQUAL	
"ILLEGAL_CHAR_ERR"	TokenNameStringLiteral	ILLEGAL_CHAR_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_PI_ERR	TokenNameIdentifier	 ILLEGAL  PI  ERR
=	TokenNameEQUAL	
"ILLEGAL_PI_ERR"	TokenNameStringLiteral	ILLEGAL_PI_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
=	TokenNameEQUAL	
"STRAY_ATTRIBUTE_ERR"	TokenNameStringLiteral	STRAY_ATTRIBUTE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier	 ILLEGAL  ATTRIBUTE  ERR
=	TokenNameEQUAL	
"ILLEGAL_ATTRIBUTE_ERR"	TokenNameStringLiteral	ILLEGAL_ATTRIBUTE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier	 CIRCULAR  INCLUDE  ERR
=	TokenNameEQUAL	
"CIRCULAR_INCLUDE_ERR"	TokenNameStringLiteral	CIRCULAR_INCLUDE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESULT_TREE_SORT_ERR	TokenNameIdentifier	 RESULT  TREE  SORT  ERR
=	TokenNameEQUAL	
"RESULT_TREE_SORT_ERR"	TokenNameStringLiteral	RESULT_TREE_SORT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYMBOLS_REDEF_ERR	TokenNameIdentifier	 SYMBOLS  REDEF  ERR
=	TokenNameEQUAL	
"SYMBOLS_REDEF_ERR"	TokenNameStringLiteral	SYMBOLS_REDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSL_VERSION_ERR	TokenNameIdentifier	 XSL  VERSION  ERR
=	TokenNameEQUAL	
"XSL_VERSION_ERR"	TokenNameStringLiteral	XSL_VERSION_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
=	TokenNameEQUAL	
"CIRCULAR_VARIABLE_ERR"	TokenNameStringLiteral	CIRCULAR_VARIABLE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
=	TokenNameEQUAL	
"ILLEGAL_BINARY_OP_ERR"	TokenNameStringLiteral	ILLEGAL_BINARY_OP_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_ARG_ERR	TokenNameIdentifier	 ILLEGAL  ARG  ERR
=	TokenNameEQUAL	
"ILLEGAL_ARG_ERR"	TokenNameStringLiteral	ILLEGAL_ARG_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_ARG_ERR	TokenNameIdentifier	 DOCUMENT  ARG  ERR
=	TokenNameEQUAL	
"DOCUMENT_ARG_ERR"	TokenNameStringLiteral	DOCUMENT_ARG_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MISSING_WHEN_ERR	TokenNameIdentifier	 MISSING  WHEN  ERR
=	TokenNameEQUAL	
"MISSING_WHEN_ERR"	TokenNameStringLiteral	MISSING_WHEN_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier	 MULTIPLE  OTHERWISE  ERR
=	TokenNameEQUAL	
"MULTIPLE_OTHERWISE_ERR"	TokenNameStringLiteral	MULTIPLE_OTHERWISE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRAY_OTHERWISE_ERR	TokenNameIdentifier	 STRAY  OTHERWISE  ERR
=	TokenNameEQUAL	
"STRAY_OTHERWISE_ERR"	TokenNameStringLiteral	STRAY_OTHERWISE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
=	TokenNameEQUAL	
"STRAY_WHEN_ERR"	TokenNameStringLiteral	STRAY_WHEN_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WHEN_ELEMENT_ERR	TokenNameIdentifier	 WHEN  ELEMENT  ERR
=	TokenNameEQUAL	
"WHEN_ELEMENT_ERR"	TokenNameStringLiteral	WHEN_ELEMENT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier	 UNNAMED  ATTRIBSET  ERR
=	TokenNameEQUAL	
"UNNAMED_ATTRIBSET_ERR"	TokenNameStringLiteral	UNNAMED_ATTRIBSET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_CHILD_ERR	TokenNameIdentifier	 ILLEGAL  CHILD  ERR
=	TokenNameEQUAL	
"ILLEGAL_CHILD_ERR"	TokenNameStringLiteral	ILLEGAL_CHILD_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ELEM  NAME  ERR
=	TokenNameEQUAL	
"ILLEGAL_ELEM_NAME_ERR"	TokenNameStringLiteral	ILLEGAL_ELEM_NAME_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ATTR  NAME  ERR
=	TokenNameEQUAL	
"ILLEGAL_ATTR_NAME_ERR"	TokenNameStringLiteral	ILLEGAL_ATTR_NAME_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier	 ILLEGAL  TEXT  NODE  ERR
=	TokenNameEQUAL	
"ILLEGAL_TEXT_NODE_ERR"	TokenNameStringLiteral	ILLEGAL_TEXT_NODE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier	 SAX  PARSER  CONFIG  ERR
=	TokenNameEQUAL	
"SAX_PARSER_CONFIG_ERR"	TokenNameStringLiteral	SAX_PARSER_CONFIG_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTERNAL_ERR	TokenNameIdentifier	 INTERNAL  ERR
=	TokenNameEQUAL	
"INTERNAL_ERR"	TokenNameStringLiteral	INTERNAL_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
=	TokenNameEQUAL	
"UNSUPPORTED_XSL_ERR"	TokenNameStringLiteral	UNSUPPORTED_XSL_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
=	TokenNameEQUAL	
"UNSUPPORTED_EXT_ERR"	TokenNameStringLiteral	UNSUPPORTED_EXT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MISSING_XSLT_URI_ERR	TokenNameIdentifier	 MISSING  XSLT  URI  ERR
=	TokenNameEQUAL	
"MISSING_XSLT_URI_ERR"	TokenNameStringLiteral	MISSING_XSLT_URI_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier	 MISSING  XSLT  TARGET  ERR
=	TokenNameEQUAL	
"MISSING_XSLT_TARGET_ERR"	TokenNameStringLiteral	MISSING_XSLT_TARGET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_IMPLEMENTED_ERR	TokenNameIdentifier	 NOT  IMPLEMENTED  ERR
=	TokenNameEQUAL	
"NOT_IMPLEMENTED_ERR"	TokenNameStringLiteral	NOT_IMPLEMENTED_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_STYLESHEET_ERR	TokenNameIdentifier	 NOT  STYLESHEET  ERR
=	TokenNameEQUAL	
"NOT_STYLESHEET_ERR"	TokenNameStringLiteral	NOT_STYLESHEET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELEMENT_PARSE_ERR	TokenNameIdentifier	 ELEMENT  PARSE  ERR
=	TokenNameEQUAL	
"ELEMENT_PARSE_ERR"	TokenNameStringLiteral	ELEMENT_PARSE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_USE_ATTR_ERR	TokenNameIdentifier	 KEY  USE  ATTR  ERR
=	TokenNameEQUAL	
"KEY_USE_ATTR_ERR"	TokenNameStringLiteral	KEY_USE_ATTR_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTPUT_VERSION_ERR	TokenNameIdentifier	 OUTPUT  VERSION  ERR
=	TokenNameEQUAL	
"OUTPUT_VERSION_ERR"	TokenNameStringLiteral	OUTPUT_VERSION_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier	 ILLEGAL  RELAT  OP  ERR
=	TokenNameEQUAL	
"ILLEGAL_RELAT_OP_ERR"	TokenNameStringLiteral	ILLEGAL_RELAT_OP_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier	 ATTRIBSET  UNDEF  ERR
=	TokenNameEQUAL	
"ATTRIBSET_UNDEF_ERR"	TokenNameStringLiteral	ATTRIBSET_UNDEF_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier	 ATTR  VAL  TEMPLATE  ERR
=	TokenNameEQUAL	
"ATTR_VAL_TEMPLATE_ERR"	TokenNameStringLiteral	ATTR_VAL_TEMPLATE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier	 UNKNOWN  SIG  TYPE  ERR
=	TokenNameEQUAL	
"UNKNOWN_SIG_TYPE_ERR"	TokenNameStringLiteral	UNKNOWN_SIG_TYPE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
=	TokenNameEQUAL	
"DATA_CONVERSION_ERR"	TokenNameStringLiteral	DATA_CONVERSION_ERR
;	TokenNameSEMICOLON	
// JAXP/TrAX error messages 	TokenNameCOMMENT_LINE	JAXP/TrAX error messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier	 NO  TRANSLET  CLASS  ERR
=	TokenNameEQUAL	
"NO_TRANSLET_CLASS_ERR"	TokenNameStringLiteral	NO_TRANSLET_CLASS_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier	 NO  MAIN  TRANSLET  ERR
=	TokenNameEQUAL	
"NO_MAIN_TRANSLET_ERR"	TokenNameStringLiteral	NO_MAIN_TRANSLET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_CLASS_ERR	TokenNameIdentifier	 TRANSLET  CLASS  ERR
=	TokenNameEQUAL	
"TRANSLET_CLASS_ERR"	TokenNameStringLiteral	TRANSLET_CLASS_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_OBJECT_ERR	TokenNameIdentifier	 TRANSLET  OBJECT  ERR
=	TokenNameEQUAL	
"TRANSLET_OBJECT_ERR"	TokenNameStringLiteral	TRANSLET_OBJECT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
=	TokenNameEQUAL	
"ERROR_LISTENER_NULL_ERR"	TokenNameStringLiteral	ERROR_LISTENER_NULL_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  SOURCE  ERR
=	TokenNameEQUAL	
"JAXP_UNKNOWN_SOURCE_ERR"	TokenNameStringLiteral	JAXP_UNKNOWN_SOURCE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
=	TokenNameEQUAL	
"JAXP_NO_SOURCE_ERR"	TokenNameStringLiteral	JAXP_NO_SOURCE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
=	TokenNameEQUAL	
"JAXP_COMPILE_ERR"	TokenNameStringLiteral	JAXP_COMPILE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
=	TokenNameEQUAL	
"JAXP_INVALID_ATTR_ERR"	TokenNameStringLiteral	JAXP_INVALID_ATTR_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_SET_RESULT_ERR	TokenNameIdentifier	 JAXP  SET  RESULT  ERR
=	TokenNameEQUAL	
"JAXP_SET_RESULT_ERR"	TokenNameStringLiteral	JAXP_SET_RESULT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
=	TokenNameEQUAL	
"JAXP_NO_TRANSLET_ERR"	TokenNameStringLiteral	JAXP_NO_TRANSLET_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
=	TokenNameEQUAL	
"JAXP_NO_HANDLER_ERR"	TokenNameStringLiteral	JAXP_NO_HANDLER_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
=	TokenNameEQUAL	
"JAXP_NO_RESULT_ERR"	TokenNameStringLiteral	JAXP_NO_RESULT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
=	TokenNameEQUAL	
"JAXP_UNKNOWN_PROP_ERR"	TokenNameStringLiteral	JAXP_UNKNOWN_PROP_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier	 SA X2 DOM  ADAPTER  ERR
=	TokenNameEQUAL	
"SAX2DOM_ADAPTER_ERR"	TokenNameStringLiteral	SAX2DOM_ADAPTER_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
=	TokenNameEQUAL	
"XSLTC_SOURCE_ERR"	TokenNameStringLiteral	XSLTC_SOURCE_ERR
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
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 JAXP  INVALID  SET  PARAM  VALUE
=	TokenNameEQUAL	
"JAXP_INVALID_SET_PARAM_VALUE"	TokenNameStringLiteral	JAXP_INVALID_SET_PARAM_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  SET  FEATURE  NULL  NAME
=	TokenNameEQUAL	
"JAXP_SET_FEATURE_NULL_NAME"	TokenNameStringLiteral	JAXP_SET_FEATURE_NULL_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  GET  FEATURE  NULL  NAME
=	TokenNameEQUAL	
"JAXP_GET_FEATURE_NULL_NAME"	TokenNameStringLiteral	JAXP_GET_FEATURE_NULL_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier	 JAXP  UNSUPPORTED  FEATURE
=	TokenNameEQUAL	
"JAXP_UNSUPPORTED_FEATURE"	TokenNameStringLiteral	JAXP_UNSUPPORTED_FEATURE
;	TokenNameSEMICOLON	
// Command-line error messages 	TokenNameCOMMENT_LINE	Command-line error messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
=	TokenNameEQUAL	
"COMPILE_STDIN_ERR"	TokenNameStringLiteral	COMPILE_STDIN_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
=	TokenNameEQUAL	
"COMPILE_USAGE_STR"	TokenNameStringLiteral	COMPILE_USAGE_STR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSFORM_USAGE_STR	TokenNameIdentifier	 TRANSFORM  USAGE  STR
=	TokenNameEQUAL	
"TRANSFORM_USAGE_STR"	TokenNameStringLiteral	TRANSFORM_USAGE_STR
;	TokenNameSEMICOLON	
// Recently added error messages 	TokenNameCOMMENT_LINE	Recently added error messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRAY_SORT_ERR	TokenNameIdentifier	 STRAY  SORT  ERR
=	TokenNameEQUAL	
"STRAY_SORT_ERR"	TokenNameStringLiteral	STRAY_SORT_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSUPPORTED_ENCODING	TokenNameIdentifier	 UNSUPPORTED  ENCODING
=	TokenNameEQUAL	
"UNSUPPORTED_ENCODING"	TokenNameStringLiteral	UNSUPPORTED_ENCODING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
=	TokenNameEQUAL	
"SYNTAX_ERR"	TokenNameStringLiteral	SYNTAX_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier	 CONSTRUCTOR  NOT  FOUND
=	TokenNameEQUAL	
"CONSTRUCTOR_NOT_FOUND"	TokenNameStringLiteral	CONSTRUCTOR_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier	 NO  JAVA  FUNCT  THIS  REF
=	TokenNameEQUAL	
"NO_JAVA_FUNCT_THIS_REF"	TokenNameStringLiteral	NO_JAVA_FUNCT_THIS_REF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_CHECK_ERR	TokenNameIdentifier	 TYPE  CHECK  ERR
=	TokenNameEQUAL	
"TYPE_CHECK_ERR"	TokenNameStringLiteral	TYPE_CHECK_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier	 TYPE  CHECK  UNK  LOC  ERR
=	TokenNameEQUAL	
"TYPE_CHECK_UNK_LOC_ERR"	TokenNameStringLiteral	TYPE_CHECK_UNK_LOC_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier	 ILLEGAL  CMDLINE  OPTION  ERR
=	TokenNameEQUAL	
"ILLEGAL_CMDLINE_OPTION_ERR"	TokenNameStringLiteral	ILLEGAL_CMDLINE_OPTION_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier	 CMDLINE  OPT  MISSING  ARG  ERR
=	TokenNameEQUAL	
"CMDLINE_OPT_MISSING_ARG_ERR"	TokenNameStringLiteral	CMDLINE_OPT_MISSING_ARG_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
=	TokenNameEQUAL	
"WARNING_PLUS_WRAPPED_MSG"	TokenNameStringLiteral	WARNING_PLUS_WRAPPED_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
=	TokenNameEQUAL	
"WARNING_MSG"	TokenNameStringLiteral	WARNING_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
=	TokenNameEQUAL	
"FATAL_ERR_PLUS_WRAPPED_MSG"	TokenNameStringLiteral	FATAL_ERR_PLUS_WRAPPED_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
=	TokenNameEQUAL	
"FATAL_ERR_MSG"	TokenNameStringLiteral	FATAL_ERR_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
=	TokenNameEQUAL	
"ERROR_PLUS_WRAPPED_MSG"	TokenNameStringLiteral	ERROR_PLUS_WRAPPED_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
=	TokenNameEQUAL	
"ERROR_MSG"	TokenNameStringLiteral	ERROR_MSG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier	 TRANSFORM  WITH  TRANSLET  STR
=	TokenNameEQUAL	
"TRANSFORM_WITH_TRANSLET_STR"	TokenNameStringLiteral	TRANSFORM_WITH_TRANSLET_STR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier	 TRANSFORM  WITH  JAR  STR
=	TokenNameEQUAL	
"TRANSFORM_WITH_JAR_STR"	TokenNameStringLiteral	TRANSFORM_WITH_JAR_STR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier	 COULD  NOT  CREATE  TRANS  FACT
=	TokenNameEQUAL	
"COULD_NOT_CREATE_TRANS_FACT"	TokenNameStringLiteral	COULD_NOT_CREATE_TRANS_FACT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier	 TRANSLET  NAME  JAVA  CONFLICT
=	TokenNameEQUAL	
"TRANSLET_NAME_JAVA_CONFLICT"	TokenNameStringLiteral	TRANSLET_NAME_JAVA_CONFLICT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_QNAME_ERR	TokenNameIdentifier	 INVALID  QNAME  ERR
=	TokenNameEQUAL	
"INVALID_QNAME_ERR"	TokenNameStringLiteral	INVALID_QNAME_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_NCNAME_ERR	TokenNameIdentifier	 INVALID  NCNAME  ERR
=	TokenNameEQUAL	
"INVALID_NCNAME_ERR"	TokenNameStringLiteral	INVALID_NCNAME_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier	 INVALID  METHOD  IN  OUTPUT
=	TokenNameEQUAL	
"INVALID_METHOD_IN_OUTPUT"	TokenNameStringLiteral	INVALID_METHOD_IN_OUTPUT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTLINE_ERR_TRY_CATCH	TokenNameIdentifier	 OUTLINE  ERR  TRY  CATCH
=	TokenNameEQUAL	
"OUTLINE_ERR_TRY_CATCH"	TokenNameStringLiteral	OUTLINE_ERR_TRY_CATCH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTLINE_ERR_UNBALANCED_MARKERS	TokenNameIdentifier	 OUTLINE  ERR  UNBALANCED  MARKERS
=	TokenNameEQUAL	
"OUTLINE_ERR_UNBALANCED_MARKERS"	TokenNameStringLiteral	OUTLINE_ERR_UNBALANCED_MARKERS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTLINE_ERR_DELETED_TARGET	TokenNameIdentifier	 OUTLINE  ERR  DELETED  TARGET
=	TokenNameEQUAL	
"OUTLINE_ERR_DELETED_TARGET"	TokenNameStringLiteral	OUTLINE_ERR_DELETED_TARGET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTLINE_ERR_METHOD_TOO_BIG	TokenNameIdentifier	 OUTLINE  ERR  METHOD  TOO  BIG
=	TokenNameEQUAL	
"OUTLINE_ERR_METHOD_TOO_BIG"	TokenNameStringLiteral	OUTLINE_ERR_METHOD_TOO_BIG
;	TokenNameSEMICOLON	
// All error messages are localized and are stored in resource bundles. 	TokenNameCOMMENT_LINE	All error messages are localized and are stored in resource bundles. 
// This array and the following 4 strings are read from that bundle. 	TokenNameCOMMENT_LINE	This array and the following 4 strings are read from that bundle. 
private	TokenNameprivate	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
_bundle	TokenNameIdentifier	 bundle
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ERROR_MESSAGES_KEY	TokenNameIdentifier	 ERROR  MESSAGES  KEY
=	TokenNameEQUAL	
"ERROR_MESSAGES_KEY"	TokenNameStringLiteral	ERROR_MESSAGES_KEY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
COMPILER_ERROR_KEY	TokenNameIdentifier	 COMPILER  ERROR  KEY
=	TokenNameEQUAL	
"COMPILER_ERROR_KEY"	TokenNameStringLiteral	COMPILER_ERROR_KEY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
COMPILER_WARNING_KEY	TokenNameIdentifier	 COMPILER  WARNING  KEY
=	TokenNameEQUAL	
"COMPILER_WARNING_KEY"	TokenNameStringLiteral	COMPILER_WARNING_KEY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
RUNTIME_ERROR_KEY	TokenNameIdentifier	 RUNTIME  ERROR  KEY
=	TokenNameEQUAL	
"RUNTIME_ERROR_KEY"	TokenNameStringLiteral	RUNTIME_ERROR_KEY
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
_bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xalan.xsltc.compiler.util.ErrorMessages"	TokenNameStringLiteral	org.apache.xalan.xsltc.compiler.util.ErrorMessages
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
param	TokenNameIdentifier	 param
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param1	TokenNameIdentifier	 param1
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param2	TokenNameIdentifier	 param2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
_url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
_url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param1	TokenNameIdentifier	 param1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
_url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param1	TokenNameIdentifier	 param1
;	TokenNameSEMICOLON	
_params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param2	TokenNameIdentifier	 param2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatLine	TokenNameIdentifier	 format Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"line "	TokenNameStringLiteral	line 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
_line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This version of toString() uses the _params instance variable * to format the message. If the <code>_code</code> is negative * the use _message as the error string. */	TokenNameCOMMENT_JAVADOC	 This version of toString() uses the _params instance variable to format the message. If the <code>_code</code> is negative the use _message as the error string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_params	TokenNameIdentifier	 params
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
_code	TokenNameIdentifier	 code
?	TokenNameQUESTION	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
_message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
:	TokenNameCOLON	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
formatLine	TokenNameIdentifier	 format Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
formatLine	TokenNameIdentifier	 format Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj0	TokenNameIdentifier	 obj0
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj1	TokenNameIdentifier	 obj1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
obj0	TokenNameIdentifier	 obj0
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
obj1	TokenNameIdentifier	 obj1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
formatLine	TokenNameIdentifier	 format Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an ErrorMessages string corresponding to the _code * This function is temporary until the three special-cased keys * below are moved into ErrorMessages * * @return ErrorMessages string */	TokenNameCOMMENT_JAVADOC	 Return an ErrorMessages string corresponding to the _code This function is temporary until the three special-cased keys below are moved into ErrorMessages * @return ErrorMessages string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
_code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the _isWarningError flag is true, the error is treated as 	TokenNameCOMMENT_LINE	If the _isWarningError flag is true, the error is treated as 
// a warning by the compiler, but should be reported as an error 	TokenNameCOMMENT_LINE	a warning by the compiler, but should be reported as an error 
// to the ErrorListener. This is a workaround for the TCK failure 	TokenNameCOMMENT_LINE	to the ErrorListener. This is a workaround for the TCK failure 
// ErrorListener.errorTests.error001. 	TokenNameCOMMENT_LINE	ErrorListener.errorTests.error001. 
public	TokenNamepublic	
void	TokenNamevoid	
setWarningError	TokenNameIdentifier	 set Warning Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isWarningError	TokenNameIdentifier	 is Warning Error
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isWarningError	TokenNameIdentifier	 is Warning Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_isWarningError	TokenNameIdentifier	 is Warning Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
