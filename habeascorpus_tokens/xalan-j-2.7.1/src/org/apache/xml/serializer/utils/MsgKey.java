/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MsgKey.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MsgKey.java 471981 2006-11-07 04:28:00Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * This class is not a public API, * It is used internally by serializer and is public, * in the Java sense, only because its use crosses * package boundaries. * <p> * This class holds only the message keys used * when generating messages. */	TokenNameCOMMENT_JAVADOC	 This class is not a public API, It is used internally by serializer and is public, in the Java sense, only because its use crosses package boundaries. <p> This class holds only the message keys used when generating messages. 
public	TokenNamepublic	
class	TokenNameclass	
MsgKey	TokenNameIdentifier	 Msg Key
{	TokenNameLBRACE	
/** An internal error with the messages, * this is the message to use if the message key can't be found */	TokenNameCOMMENT_JAVADOC	 An internal error with the messages, this is the message to use if the message key can't be found 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_MSGKEY	TokenNameIdentifier	 BAD  MSGKEY
=	TokenNameEQUAL	
"BAD_MSGKEY"	TokenNameStringLiteral	BAD_MSGKEY
;	TokenNameSEMICOLON	
/** * An internal error with the messages, * this is the message to use if the message format operation failed. */	TokenNameCOMMENT_JAVADOC	 An internal error with the messages, this is the message to use if the message format operation failed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_MSGFORMAT	TokenNameIdentifier	 BAD  MSGFORMAT
=	TokenNameEQUAL	
"BAD_MSGFORMAT"	TokenNameStringLiteral	BAD_MSGFORMAT
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
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
=	TokenNameEQUAL	
"ER_NAMESPACE_PREFIX"	TokenNameStringLiteral	ER_NAMESPACE_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STRAY_ATTRIBUTE	TokenNameIdentifier	 ER  STRAY  ATTRIBUTE
=	TokenNameEQUAL	
"ER_STRAY_ATTRIBUTE"	TokenNameStringLiteral	ER_STRAY_ATTRIBUTE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STRAY_NAMESPACE	TokenNameIdentifier	 ER  STRAY  NAMESPACE
=	TokenNameEQUAL	
"ER_STRAY_NAMESPACE"	TokenNameStringLiteral	ER_STRAY_NAMESPACE
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
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier	 ER  COULD  NOT  LOAD  METHOD  PROPERTY
=	TokenNameEQUAL	
"ER_COULD_NOT_LOAD_METHOD_PROPERTY"	TokenNameStringLiteral	ER_COULD_NOT_LOAD_METHOD_PROPERTY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
=	TokenNameEQUAL	
"ER_SERIALIZER_NOT_CONTENTHANDLER"	TokenNameStringLiteral	ER_SERIALIZER_NOT_CONTENTHANDLER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  POSITION
=	TokenNameEQUAL	
"ER_ILLEGAL_ATTRIBUTE_POSITION"	TokenNameStringLiteral	ER_ILLEGAL_ATTRIBUTE_POSITION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
=	TokenNameEQUAL	
"ER_ILLEGAL_CHARACTER"	TokenNameStringLiteral	ER_ILLEGAL_CHARACTER
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
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
=	TokenNameEQUAL	
"ER_PORT_WHEN_HOST_NULL"	TokenNameStringLiteral	ER_PORT_WHEN_HOST_NULL
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
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
=	TokenNameEQUAL	
"ER_SCHEME_NOT_CONFORMANT"	TokenNameStringLiteral	ER_SCHEME_NOT_CONFORMANT
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
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
=	TokenNameEQUAL	
"ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE"	TokenNameStringLiteral	ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE
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
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
=	TokenNameEQUAL	
"ER_NO_SCHEME_INURI"	TokenNameStringLiteral	ER_NO_SCHEME_INURI
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
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
=	TokenNameEQUAL	
"ER_FRAG_WHEN_PATH_NULL"	TokenNameStringLiteral	ER_FRAG_WHEN_PATH_NULL
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
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
=	TokenNameEQUAL	
"ER_NO_SCHEME_IN_URI"	TokenNameStringLiteral	ER_NO_SCHEME_IN_URI
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
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
=	TokenNameEQUAL	
"ER_NO_FRAGMENT_STRING_IN_PATH"	TokenNameStringLiteral	ER_NO_FRAGMENT_STRING_IN_PATH
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
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
=	TokenNameEQUAL	
"ER_NO_PORT_IF_NO_HOST"	TokenNameStringLiteral	ER_NO_PORT_IF_NO_HOST
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
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
=	TokenNameEQUAL	
"ER_SCHEME_REQUIRED"	TokenNameStringLiteral	ER_SCHEME_REQUIRED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier	 ER  XML  VERSION  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_XML_VERSION_NOT_SUPPORTED"	TokenNameStringLiteral	ER_XML_VERSION_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
=	TokenNameEQUAL	
"ER_FACTORY_PROPERTY_MISSING"	TokenNameStringLiteral	ER_FACTORY_PROPERTY_MISSING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_ENCODING_NOT_SUPPORTED"	TokenNameStringLiteral	ER_ENCODING_NOT_SUPPORTED
;	TokenNameSEMICOLON	
// DOM Exceptions 	TokenNameCOMMENT_LINE	DOM Exceptions 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FEATURE_NOT_FOUND	TokenNameIdentifier	 ER  FEATURE  NOT  FOUND
=	TokenNameEQUAL	
"FEATURE_NOT_FOUND"	TokenNameStringLiteral	FEATURE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 ER  FEATURE  NOT  SUPPORTED
=	TokenNameEQUAL	
"FEATURE_NOT_SUPPORTED"	TokenNameStringLiteral	FEATURE_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STRING_TOO_LONG	TokenNameIdentifier	 ER  STRING  TOO  LONG
=	TokenNameEQUAL	
"DOMSTRING_SIZE_ERR"	TokenNameStringLiteral	DOMSTRING_SIZE_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier	 ER  TYPE  MISMATCH  ERR
=	TokenNameEQUAL	
"TYPE_MISMATCH_ERR"	TokenNameStringLiteral	TYPE_MISMATCH_ERR
;	TokenNameSEMICOLON	
// DOM Level 3 load and save messages 	TokenNameCOMMENT_LINE	DOM Level 3 load and save messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
=	TokenNameEQUAL	
"no-output-specified"	TokenNameStringLiteral	no-output-specified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
=	TokenNameEQUAL	
"unsupported-encoding"	TokenNameStringLiteral	unsupported-encoding
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ELEM  UNBOUND  PREFIX  IN  ENTREF
=	TokenNameEQUAL	
"unbound-prefix-in-entity-reference"	TokenNameStringLiteral	unbound-prefix-in-entity-reference
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier	 ER  ATTR  UNBOUND  PREFIX  IN  ENTREF
=	TokenNameEQUAL	
"unbound-prefix-in-entity-reference"	TokenNameStringLiteral	unbound-prefix-in-entity-reference
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier	 ER  CDATA  SECTIONS  SPLIT
=	TokenNameEQUAL	
"cdata-sections-splitted"	TokenNameStringLiteral	cdata-sections-splitted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER
=	TokenNameEQUAL	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  NODE  NAME
=	TokenNameEQUAL	
"wf-invalid-character-in-node-name"	TokenNameStringLiteral	wf-invalid-character-in-node-name
;	TokenNameSEMICOLON	
// DOM Level 3 Implementation specific Exceptions 	TokenNameCOMMENT_LINE	DOM Level 3 Implementation specific Exceptions 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier	 ER  UNABLE  TO  SERIALIZE  NODE
=	TokenNameEQUAL	
"ER_UNABLE_TO_SERIALIZE_NODE"	TokenNameStringLiteral	ER_UNABLE_TO_SERIALIZE_NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier	 ER  WARNING  WF  NOT  CHECKED
=	TokenNameEQUAL	
"ER_WARNING_WF_NOT_CHECKED"	TokenNameStringLiteral	ER_WARNING_WF_NOT_CHECKED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  COMMENT
=	TokenNameEQUAL	
"ER_WF_INVALID_CHARACTER_IN_COMMENT"	TokenNameStringLiteral	ER_WF_INVALID_CHARACTER_IN_COMMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  PI
=	TokenNameEQUAL	
"ER_WF_INVALID_CHARACTER_IN_PI"	TokenNameStringLiteral	ER_WF_INVALID_CHARACTER_IN_PI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  CDATA
=	TokenNameEQUAL	
"ER_WF_INVALID_CHARACTER_IN_CDATA"	TokenNameStringLiteral	ER_WF_INVALID_CHARACTER_IN_CDATA
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier	 ER  WF  INVALID  CHARACTER  IN  TEXT
=	TokenNameEQUAL	
"ER_WF_INVALID_CHARACTER_IN_TEXT"	TokenNameStringLiteral	ER_WF_INVALID_CHARACTER_IN_TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier	 ER  WF  DASH  IN  COMMENT
=	TokenNameEQUAL	
"ER_WF_DASH_IN_COMMENT"	TokenNameStringLiteral	ER_WF_DASH_IN_COMMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier	 ER  WF  LT  IN  ATTVAL
=	TokenNameEQUAL	
"ER_WF_LT_IN_ATTVAL"	TokenNameStringLiteral	ER_WF_LT_IN_ATTVAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier	 ER  WF  REF  TO  UNPARSED  ENT
=	TokenNameEQUAL	
"ER_WF_REF_TO_UNPARSED_ENT"	TokenNameStringLiteral	ER_WF_REF_TO_UNPARSED_ENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier	 ER  WF  REF  TO  EXTERNAL  ENT
=	TokenNameEQUAL	
"ER_WF_REF_TO_EXTERNAL_ENT"	TokenNameStringLiteral	ER_WF_REF_TO_EXTERNAL_ENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier	 ER  NS  PREFIX  CANNOT  BE  BOUND
=	TokenNameEQUAL	
"ER_NS_PREFIX_CANNOT_BE_BOUND"	TokenNameStringLiteral	ER_NS_PREFIX_CANNOT_BE_BOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ELEMENT  NAME
=	TokenNameEQUAL	
"ER_NULL_LOCAL_ELEMENT_NAME"	TokenNameStringLiteral	ER_NULL_LOCAL_ELEMENT_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier	 ER  NULL  LOCAL  ATTR  NAME
=	TokenNameEQUAL	
"ER_NULL_LOCAL_ATTR_NAME"	TokenNameStringLiteral	ER_NULL_LOCAL_ATTR_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WRITING_INTERNAL_SUBSET	TokenNameIdentifier	 ER  WRITING  INTERNAL  SUBSET
=	TokenNameEQUAL	
"ER_WRITING_INTERNAL_SUBSET"	TokenNameStringLiteral	ER_WRITING_INTERNAL_SUBSET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
