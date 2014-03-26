/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Keywords.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Keywords.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * Table of strings to operation code lookups. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Table of strings to operation code lookups. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
Keywords	TokenNameIdentifier	 Keywords
{	TokenNameLBRACE	
/** Table of keywords to opcode associations. */	TokenNameCOMMENT_JAVADOC	 Table of keywords to opcode associations. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_keywords	TokenNameIdentifier	 m keywords
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Table of axes names to opcode associations. */	TokenNameCOMMENT_JAVADOC	 Table of axes names to opcode associations. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_axisnames	TokenNameIdentifier	 m axisnames
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Table of function name to function ID associations. */	TokenNameCOMMENT_JAVADOC	 Table of function name to function ID associations. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_nodetests	TokenNameIdentifier	 m nodetests
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Table of node type strings to opcode associations. */	TokenNameCOMMENT_JAVADOC	 Table of node type strings to opcode associations. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_nodetypes	TokenNameIdentifier	 m nodetypes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** ancestor axes string. */	TokenNameCOMMENT_JAVADOC	 ancestor axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_ANCESTORS_STRING	TokenNameIdentifier	 FROM  ANCESTORS  STRING
=	TokenNameEQUAL	
"ancestor"	TokenNameStringLiteral	ancestor
;	TokenNameSEMICOLON	
/** ancestor-or-self axes string. */	TokenNameCOMMENT_JAVADOC	 ancestor-or-self axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_ANCESTORS_OR_SELF_STRING	TokenNameIdentifier	 FROM  ANCESTORS  OR  SELF  STRING
=	TokenNameEQUAL	
"ancestor-or-self"	TokenNameStringLiteral	ancestor-or-self
;	TokenNameSEMICOLON	
/** attribute axes string. */	TokenNameCOMMENT_JAVADOC	 attribute axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_ATTRIBUTES_STRING	TokenNameIdentifier	 FROM  ATTRIBUTES  STRING
=	TokenNameEQUAL	
"attribute"	TokenNameStringLiteral	attribute
;	TokenNameSEMICOLON	
/** child axes string. */	TokenNameCOMMENT_JAVADOC	 child axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_CHILDREN_STRING	TokenNameIdentifier	 FROM  CHILDREN  STRING
=	TokenNameEQUAL	
"child"	TokenNameStringLiteral	child
;	TokenNameSEMICOLON	
/** descendant-or-self axes string. */	TokenNameCOMMENT_JAVADOC	 descendant-or-self axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_DESCENDANTS_STRING	TokenNameIdentifier	 FROM  DESCENDANTS  STRING
=	TokenNameEQUAL	
"descendant"	TokenNameStringLiteral	descendant
;	TokenNameSEMICOLON	
/** ancestor axes string. */	TokenNameCOMMENT_JAVADOC	 ancestor axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_DESCENDANTS_OR_SELF_STRING	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF  STRING
=	TokenNameEQUAL	
"descendant-or-self"	TokenNameStringLiteral	descendant-or-self
;	TokenNameSEMICOLON	
/** following axes string. */	TokenNameCOMMENT_JAVADOC	 following axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_FOLLOWING_STRING	TokenNameIdentifier	 FROM  FOLLOWING  STRING
=	TokenNameEQUAL	
"following"	TokenNameStringLiteral	following
;	TokenNameSEMICOLON	
/** following-sibling axes string. */	TokenNameCOMMENT_JAVADOC	 following-sibling axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_FOLLOWING_SIBLINGS_STRING	TokenNameIdentifier	 FROM  FOLLOWING  SIBLINGS  STRING
=	TokenNameEQUAL	
"following-sibling"	TokenNameStringLiteral	following-sibling
;	TokenNameSEMICOLON	
/** parent axes string. */	TokenNameCOMMENT_JAVADOC	 parent axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_PARENT_STRING	TokenNameIdentifier	 FROM  PARENT  STRING
=	TokenNameEQUAL	
"parent"	TokenNameStringLiteral	parent
;	TokenNameSEMICOLON	
/** preceding axes string. */	TokenNameCOMMENT_JAVADOC	 preceding axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_PRECEDING_STRING	TokenNameIdentifier	 FROM  PRECEDING  STRING
=	TokenNameEQUAL	
"preceding"	TokenNameStringLiteral	preceding
;	TokenNameSEMICOLON	
/** preceding-sibling axes string. */	TokenNameCOMMENT_JAVADOC	 preceding-sibling axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_PRECEDING_SIBLINGS_STRING	TokenNameIdentifier	 FROM  PRECEDING  SIBLINGS  STRING
=	TokenNameEQUAL	
"preceding-sibling"	TokenNameStringLiteral	preceding-sibling
;	TokenNameSEMICOLON	
/** self axes string. */	TokenNameCOMMENT_JAVADOC	 self axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_SELF_STRING	TokenNameIdentifier	 FROM  SELF  STRING
=	TokenNameEQUAL	
"self"	TokenNameStringLiteral	self
;	TokenNameSEMICOLON	
/** namespace axes string. */	TokenNameCOMMENT_JAVADOC	 namespace axes string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_NAMESPACE_STRING	TokenNameIdentifier	 FROM  NAMESPACE  STRING
=	TokenNameEQUAL	
"namespace"	TokenNameStringLiteral	namespace
;	TokenNameSEMICOLON	
/** self axes abreviated string. */	TokenNameCOMMENT_JAVADOC	 self axes abreviated string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FROM_SELF_ABBREVIATED_STRING	TokenNameIdentifier	 FROM  SELF  ABBREVIATED  STRING
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
/** comment node test string. */	TokenNameCOMMENT_JAVADOC	 comment node test string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODETYPE_COMMENT_STRING	TokenNameIdentifier	 NODETYPE  COMMENT  STRING
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
;	TokenNameSEMICOLON	
/** text node test string. */	TokenNameCOMMENT_JAVADOC	 text node test string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODETYPE_TEXT_STRING	TokenNameIdentifier	 NODETYPE  TEXT  STRING
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
/** processing-instruction node test string. */	TokenNameCOMMENT_JAVADOC	 processing-instruction node test string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODETYPE_PI_STRING	TokenNameIdentifier	 NODETYPE  PI  STRING
=	TokenNameEQUAL	
"processing-instruction"	TokenNameStringLiteral	processing-instruction
;	TokenNameSEMICOLON	
/** Any node test string. */	TokenNameCOMMENT_JAVADOC	 Any node test string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODETYPE_NODE_STRING	TokenNameIdentifier	 NODETYPE  NODE  STRING
=	TokenNameEQUAL	
"node"	TokenNameStringLiteral	node
;	TokenNameSEMICOLON	
/** Wildcard element string. */	TokenNameCOMMENT_JAVADOC	 Wildcard element string. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODETYPE_ANYELEMENT_STRING	TokenNameIdentifier	 NODETYPE  ANYELEMENT  STRING
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
/** current function string. */	TokenNameCOMMENT_JAVADOC	 current function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_CURRENT_STRING	TokenNameIdentifier	 FUNC  CURRENT  STRING
=	TokenNameEQUAL	
"current"	TokenNameStringLiteral	current
;	TokenNameSEMICOLON	
/** last function string. */	TokenNameCOMMENT_JAVADOC	 last function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_LAST_STRING	TokenNameIdentifier	 FUNC  LAST  STRING
=	TokenNameEQUAL	
"last"	TokenNameStringLiteral	last
;	TokenNameSEMICOLON	
/** position function string. */	TokenNameCOMMENT_JAVADOC	 position function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_POSITION_STRING	TokenNameIdentifier	 FUNC  POSITION  STRING
=	TokenNameEQUAL	
"position"	TokenNameStringLiteral	position
;	TokenNameSEMICOLON	
/** count function string. */	TokenNameCOMMENT_JAVADOC	 count function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_COUNT_STRING	TokenNameIdentifier	 FUNC  COUNT  STRING
=	TokenNameEQUAL	
"count"	TokenNameStringLiteral	count
;	TokenNameSEMICOLON	
/** id function string. */	TokenNameCOMMENT_JAVADOC	 id function string. 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_ID_STRING	TokenNameIdentifier	 FUNC  ID  STRING
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
;	TokenNameSEMICOLON	
/** key function string (XSLT). */	TokenNameCOMMENT_JAVADOC	 key function string (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_KEY_STRING	TokenNameIdentifier	 FUNC  KEY  STRING
=	TokenNameEQUAL	
"key"	TokenNameStringLiteral	key
;	TokenNameSEMICOLON	
/** local-name function string. */	TokenNameCOMMENT_JAVADOC	 local-name function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_LOCAL_PART_STRING	TokenNameIdentifier	 FUNC  LOCAL  PART  STRING
=	TokenNameEQUAL	
"local-name"	TokenNameStringLiteral	local-name
;	TokenNameSEMICOLON	
/** namespace-uri function string. */	TokenNameCOMMENT_JAVADOC	 namespace-uri function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_NAMESPACE_STRING	TokenNameIdentifier	 FUNC  NAMESPACE  STRING
=	TokenNameEQUAL	
"namespace-uri"	TokenNameStringLiteral	namespace-uri
;	TokenNameSEMICOLON	
/** name function string. */	TokenNameCOMMENT_JAVADOC	 name function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_NAME_STRING	TokenNameIdentifier	 FUNC  NAME  STRING
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
;	TokenNameSEMICOLON	
/** generate-id function string (XSLT). */	TokenNameCOMMENT_JAVADOC	 generate-id function string (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_GENERATE_ID_STRING	TokenNameIdentifier	 FUNC  GENERATE  ID  STRING
=	TokenNameEQUAL	
"generate-id"	TokenNameStringLiteral	generate-id
;	TokenNameSEMICOLON	
/** not function string. */	TokenNameCOMMENT_JAVADOC	 not function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_NOT_STRING	TokenNameIdentifier	 FUNC  NOT  STRING
=	TokenNameEQUAL	
"not"	TokenNameStringLiteral	not
;	TokenNameSEMICOLON	
/** true function string. */	TokenNameCOMMENT_JAVADOC	 true function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_TRUE_STRING	TokenNameIdentifier	 FUNC  TRUE  STRING
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
/** false function string. */	TokenNameCOMMENT_JAVADOC	 false function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_FALSE_STRING	TokenNameIdentifier	 FUNC  FALSE  STRING
=	TokenNameEQUAL	
"false"	TokenNameStringLiteral	false
;	TokenNameSEMICOLON	
/** boolean function string. */	TokenNameCOMMENT_JAVADOC	 boolean function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_BOOLEAN_STRING	TokenNameIdentifier	 FUNC  BOOLEAN  STRING
=	TokenNameEQUAL	
"boolean"	TokenNameStringLiteral	boolean
;	TokenNameSEMICOLON	
/** lang function string. */	TokenNameCOMMENT_JAVADOC	 lang function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_LANG_STRING	TokenNameIdentifier	 FUNC  LANG  STRING
=	TokenNameEQUAL	
"lang"	TokenNameStringLiteral	lang
;	TokenNameSEMICOLON	
/** number function string. */	TokenNameCOMMENT_JAVADOC	 number function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_NUMBER_STRING	TokenNameIdentifier	 FUNC  NUMBER  STRING
=	TokenNameEQUAL	
"number"	TokenNameStringLiteral	number
;	TokenNameSEMICOLON	
/** floor function string. */	TokenNameCOMMENT_JAVADOC	 floor function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_FLOOR_STRING	TokenNameIdentifier	 FUNC  FLOOR  STRING
=	TokenNameEQUAL	
"floor"	TokenNameStringLiteral	floor
;	TokenNameSEMICOLON	
/** ceiling function string. */	TokenNameCOMMENT_JAVADOC	 ceiling function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_CEILING_STRING	TokenNameIdentifier	 FUNC  CEILING  STRING
=	TokenNameEQUAL	
"ceiling"	TokenNameStringLiteral	ceiling
;	TokenNameSEMICOLON	
/** round function string. */	TokenNameCOMMENT_JAVADOC	 round function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_ROUND_STRING	TokenNameIdentifier	 FUNC  ROUND  STRING
=	TokenNameEQUAL	
"round"	TokenNameStringLiteral	round
;	TokenNameSEMICOLON	
/** sum function string. */	TokenNameCOMMENT_JAVADOC	 sum function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_SUM_STRING	TokenNameIdentifier	 FUNC  SUM  STRING
=	TokenNameEQUAL	
"sum"	TokenNameStringLiteral	sum
;	TokenNameSEMICOLON	
/** string function string. */	TokenNameCOMMENT_JAVADOC	 string function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_STRING_STRING	TokenNameIdentifier	 FUNC  STRING  STRING
=	TokenNameEQUAL	
"string"	TokenNameStringLiteral	string
;	TokenNameSEMICOLON	
/** starts-with function string. */	TokenNameCOMMENT_JAVADOC	 starts-with function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_STARTS_WITH_STRING	TokenNameIdentifier	 FUNC  STARTS  WITH  STRING
=	TokenNameEQUAL	
"starts-with"	TokenNameStringLiteral	starts-with
;	TokenNameSEMICOLON	
/** contains function string. */	TokenNameCOMMENT_JAVADOC	 contains function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_CONTAINS_STRING	TokenNameIdentifier	 FUNC  CONTAINS  STRING
=	TokenNameEQUAL	
"contains"	TokenNameStringLiteral	contains
;	TokenNameSEMICOLON	
/** substring-before function string. */	TokenNameCOMMENT_JAVADOC	 substring-before function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_SUBSTRING_BEFORE_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  BEFORE  STRING
=	TokenNameEQUAL	
"substring-before"	TokenNameStringLiteral	substring-before
;	TokenNameSEMICOLON	
/** substring-after function string. */	TokenNameCOMMENT_JAVADOC	 substring-after function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_SUBSTRING_AFTER_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  AFTER  STRING
=	TokenNameEQUAL	
"substring-after"	TokenNameStringLiteral	substring-after
;	TokenNameSEMICOLON	
/** normalize-space function string. */	TokenNameCOMMENT_JAVADOC	 normalize-space function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_NORMALIZE_SPACE_STRING	TokenNameIdentifier	 FUNC  NORMALIZE  SPACE  STRING
=	TokenNameEQUAL	
"normalize-space"	TokenNameStringLiteral	normalize-space
;	TokenNameSEMICOLON	
/** translate function string. */	TokenNameCOMMENT_JAVADOC	 translate function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_TRANSLATE_STRING	TokenNameIdentifier	 FUNC  TRANSLATE  STRING
=	TokenNameEQUAL	
"translate"	TokenNameStringLiteral	translate
;	TokenNameSEMICOLON	
/** concat function string. */	TokenNameCOMMENT_JAVADOC	 concat function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_CONCAT_STRING	TokenNameIdentifier	 FUNC  CONCAT  STRING
=	TokenNameEQUAL	
"concat"	TokenNameStringLiteral	concat
;	TokenNameSEMICOLON	
/** system-property function string. */	TokenNameCOMMENT_JAVADOC	 system-property function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_SYSTEM_PROPERTY_STRING	TokenNameIdentifier	 FUNC  SYSTEM  PROPERTY  STRING
=	TokenNameEQUAL	
"system-property"	TokenNameStringLiteral	system-property
;	TokenNameSEMICOLON	
/** function-available function string (XSLT). */	TokenNameCOMMENT_JAVADOC	 function-available function string (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_EXT_FUNCTION_AVAILABLE_STRING	TokenNameIdentifier	 FUNC  EXT  FUNCTION  AVAILABLE  STRING
=	TokenNameEQUAL	
"function-available"	TokenNameStringLiteral	function-available
;	TokenNameSEMICOLON	
/** element-available function string (XSLT). */	TokenNameCOMMENT_JAVADOC	 element-available function string (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_EXT_ELEM_AVAILABLE_STRING	TokenNameIdentifier	 FUNC  EXT  ELEM  AVAILABLE  STRING
=	TokenNameEQUAL	
"element-available"	TokenNameStringLiteral	element-available
;	TokenNameSEMICOLON	
/** substring function string. */	TokenNameCOMMENT_JAVADOC	 substring function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_SUBSTRING_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  STRING
=	TokenNameEQUAL	
"substring"	TokenNameStringLiteral	substring
;	TokenNameSEMICOLON	
/** string-length function string. */	TokenNameCOMMENT_JAVADOC	 string-length function string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_STRING_LENGTH_STRING	TokenNameIdentifier	 FUNC  STRING  LENGTH  STRING
=	TokenNameEQUAL	
"string-length"	TokenNameStringLiteral	string-length
;	TokenNameSEMICOLON	
/** unparsed-entity-uri function string (XSLT). */	TokenNameCOMMENT_JAVADOC	 unparsed-entity-uri function string (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_UNPARSED_ENTITY_URI_STRING	TokenNameIdentifier	 FUNC  UNPARSED  ENTITY  URI  STRING
=	TokenNameEQUAL	
"unparsed-entity-uri"	TokenNameStringLiteral	unparsed-entity-uri
;	TokenNameSEMICOLON	
// Proprietary, built in functions 	TokenNameCOMMENT_LINE	Proprietary, built in functions 
/** current function string (Proprietary). */	TokenNameCOMMENT_JAVADOC	 current function string (Proprietary). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FUNC_DOCLOCATION_STRING	TokenNameIdentifier	 FUNC  DOCLOCATION  STRING
=	TokenNameEQUAL	
"document-location"	TokenNameStringLiteral	document-location
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_ANCESTORS_STRING	TokenNameIdentifier	 FROM  ANCESTORS  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ANCESTORS	TokenNameIdentifier	 FROM  ANCESTORS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_ANCESTORS_OR_SELF_STRING	TokenNameIdentifier	 FROM  ANCESTORS  OR  SELF  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ANCESTORS_OR_SELF	TokenNameIdentifier	 FROM  ANCESTORS  OR  SELF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_ATTRIBUTES_STRING	TokenNameIdentifier	 FROM  ATTRIBUTES  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ATTRIBUTES	TokenNameIdentifier	 FROM  ATTRIBUTES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_CHILDREN_STRING	TokenNameIdentifier	 FROM  CHILDREN  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_CHILDREN	TokenNameIdentifier	 FROM  CHILDREN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_DESCENDANTS_STRING	TokenNameIdentifier	 FROM  DESCENDANTS  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_DESCENDANTS	TokenNameIdentifier	 FROM  DESCENDANTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_DESCENDANTS_OR_SELF_STRING	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_FOLLOWING_STRING	TokenNameIdentifier	 FROM  FOLLOWING  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_FOLLOWING	TokenNameIdentifier	 FROM  FOLLOWING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_FOLLOWING_SIBLINGS_STRING	TokenNameIdentifier	 FROM  FOLLOWING  SIBLINGS  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_FOLLOWING_SIBLINGS	TokenNameIdentifier	 FROM  FOLLOWING  SIBLINGS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_PARENT_STRING	TokenNameIdentifier	 FROM  PARENT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_PARENT	TokenNameIdentifier	 FROM  PARENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_PRECEDING_STRING	TokenNameIdentifier	 FROM  PRECEDING  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_PRECEDING	TokenNameIdentifier	 FROM  PRECEDING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_PRECEDING_SIBLINGS_STRING	TokenNameIdentifier	 FROM  PRECEDING  SIBLINGS  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_PRECEDING_SIBLINGS	TokenNameIdentifier	 FROM  PRECEDING  SIBLINGS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_SELF_STRING	TokenNameIdentifier	 FROM  SELF  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_SELF	TokenNameIdentifier	 FROM  SELF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_NAMESPACE_STRING	TokenNameIdentifier	 FROM  NAMESPACE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_NAMESPACE	TokenNameIdentifier	 FROM  NAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_COMMENT_STRING	TokenNameIdentifier	 NODETYPE  COMMENT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_COMMENT	TokenNameIdentifier	 NODETYPE  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_TEXT_STRING	TokenNameIdentifier	 NODETYPE  TEXT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_TEXT	TokenNameIdentifier	 NODETYPE  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_PI_STRING	TokenNameIdentifier	 NODETYPE  PI  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_NODE_STRING	TokenNameIdentifier	 NODETYPE  NODE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_ANYELEMENT_STRING	TokenNameIdentifier	 NODETYPE  ANYELEMENT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_ANYELEMENT	TokenNameIdentifier	 NODETYPE  ANYELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keywords	TokenNameIdentifier	 m keywords
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FROM_SELF_ABBREVIATED_STRING	TokenNameIdentifier	 FROM  SELF  ABBREVIATED  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_SELF	TokenNameIdentifier	 FROM  SELF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keywords	TokenNameIdentifier	 m keywords
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FUNC_ID_STRING	TokenNameIdentifier	 FUNC  ID  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_ID	TokenNameIdentifier	 FUNC  ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keywords	TokenNameIdentifier	 m keywords
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FUNC_KEY_STRING	TokenNameIdentifier	 FUNC  KEY  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_KEY	TokenNameIdentifier	 FUNC  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetests	TokenNameIdentifier	 m nodetests
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_COMMENT_STRING	TokenNameIdentifier	 NODETYPE  COMMENT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_COMMENT	TokenNameIdentifier	 NODETYPE  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetests	TokenNameIdentifier	 m nodetests
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_TEXT_STRING	TokenNameIdentifier	 NODETYPE  TEXT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_TEXT	TokenNameIdentifier	 NODETYPE  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetests	TokenNameIdentifier	 m nodetests
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_PI_STRING	TokenNameIdentifier	 NODETYPE  PI  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodetests	TokenNameIdentifier	 m nodetests
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NODETYPE_NODE_STRING	TokenNameIdentifier	 NODETYPE  NODE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getAxisName	TokenNameIdentifier	 get Axis Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_axisnames	TokenNameIdentifier	 m axisnames
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
lookupNodeTest	TokenNameIdentifier	 lookup Node Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nodetests	TokenNameIdentifier	 m nodetests
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getKeyWord	TokenNameIdentifier	 get Key Word
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_keywords	TokenNameIdentifier	 m keywords
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nodetypes	TokenNameIdentifier	 m nodetypes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
