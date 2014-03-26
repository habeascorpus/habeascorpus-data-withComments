/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Constants.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Constants.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
/** * Primary constants used in the TransformerImpl classes. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Primary constants used in the TransformerImpl classes. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
Constants	TokenNameIdentifier	 Constants
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
/** * IDs for XSL element types. These are associated * with the string literals in the TransformerImpl class. * Don't change the numbers. NOTE THAT THESE ARE NOT IN * ALPHABETICAL ORDER! * (It's a pity Java doesn't have a real Enumerated Mnemonic * datatype... or a C-like preprocessor in lieu thereof which * could be used to generate and maintain synch between these lists.) */	TokenNameCOMMENT_JAVADOC	 IDs for XSL element types. These are associated with the string literals in the TransformerImpl class. Don't change the numbers. NOTE THAT THESE ARE NOT IN ALPHABETICAL ORDER! (It's a pity Java doesn't have a real Enumerated Mnemonic datatype... or a C-like preprocessor in lieu thereof which could be used to generate and maintain synch between these lists.) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEMNAME_UNDEFINED	TokenNameIdentifier	 ELEMNAME  UNDEFINED
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_WITHPARAM	TokenNameIdentifier	 ELEMNAME  WITHPARAM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_ADDATTRIBUTE	TokenNameIdentifier	 ELEMNAME  ADDATTRIBUTE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_ANCHOR	TokenNameIdentifier	 ELEMNAME  ANCHOR
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ELEMNAME_ANCHOR_PATTERN = 23, 	TokenNameCOMMENT_LINE	ELEMNAME_ANCHOR_PATTERN = 23, 
ELEMNAME_APPLY_TEMPLATES	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_USE	TokenNameIdentifier	 ELEMNAME  USE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_CHILDREN	TokenNameIdentifier	 ELEMNAME  CHILDREN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_CHOOSE	TokenNameIdentifier	 ELEMNAME  CHOOSE
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COMMENT	TokenNameIdentifier	 ELEMNAME  COMMENT
=	TokenNameEQUAL	
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_CONSTRUCT	TokenNameIdentifier	 ELEMNAME  CONSTRUCT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_CONTENTS	TokenNameIdentifier	 ELEMNAME  CONTENTS
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COPY	TokenNameIdentifier	 ELEMNAME  COPY
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COPY_OF	TokenNameIdentifier	 ELEMNAME  COPY  OF
=	TokenNameEQUAL	
74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_DECIMALFORMAT	TokenNameIdentifier	 ELEMNAME  DECIMALFORMAT
=	TokenNameEQUAL	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_DEFINEATTRIBUTESET	TokenNameIdentifier	 ELEMNAME  DEFINEATTRIBUTESET
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ELEMNAME_DEFINECONSTANT = 29, 	TokenNameCOMMENT_LINE	ELEMNAME_DEFINECONSTANT = 29, 
// ELEMNAME_DEFINEMACRO = 10, 	TokenNameCOMMENT_LINE	ELEMNAME_DEFINEMACRO = 10, 
ELEMNAME_DEFINESCRIPT	TokenNameIdentifier	 ELEMNAME  DEFINESCRIPT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_DISPLAYIF	TokenNameIdentifier	 ELEMNAME  DISPLAYIF
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_EMPTY	TokenNameIdentifier	 ELEMNAME  EMPTY
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EVAL	TokenNameIdentifier	 ELEMNAME  EVAL
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXPECTEDCHILDREN	TokenNameIdentifier	 ELEMNAME  EXPECTEDCHILDREN
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXTENSION	TokenNameIdentifier	 ELEMNAME  EXTENSION
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXTENSIONHANDLER	TokenNameIdentifier	 ELEMNAME  EXTENSIONHANDLER
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_KEY	TokenNameIdentifier	 ELEMNAME  KEY
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_IF	TokenNameIdentifier	 ELEMNAME  IF
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_IMPORT	TokenNameIdentifier	 ELEMNAME  IMPORT
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_INCLUDE	TokenNameIdentifier	 ELEMNAME  INCLUDE
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_NUMBER	TokenNameIdentifier	 ELEMNAME  NUMBER
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_NSALIAS	TokenNameIdentifier	 ELEMNAME  NSALIAS
=	TokenNameEQUAL	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_OTHERWISE	TokenNameIdentifier	 ELEMNAME  OTHERWISE
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_PI	TokenNameIdentifier	 ELEMNAME  PI
=	TokenNameEQUAL	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_PRESERVESPACE	TokenNameIdentifier	 ELEMNAME  PRESERVESPACE
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_REMOVEATTRIBUTE	TokenNameIdentifier	 ELEMNAME  REMOVEATTRIBUTE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_SORT	TokenNameIdentifier	 ELEMNAME  SORT
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_STRIPSPACE	TokenNameIdentifier	 ELEMNAME  STRIPSPACE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_STYLESHEET	TokenNameIdentifier	 ELEMNAME  STYLESHEET
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_TEXT	TokenNameIdentifier	 ELEMNAME  TEXT
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_VALUEOF	TokenNameIdentifier	 ELEMNAME  VALUEOF
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_WHEN	TokenNameIdentifier	 ELEMNAME  WHEN
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// Pattern by example support 	TokenNameCOMMENT_LINE	Pattern by example support 
ELEMNAME_ROOT	TokenNameIdentifier	 ELEMNAME  ROOT
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_ANY	TokenNameIdentifier	 ELEMNAME  ANY
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_ELEMENT	TokenNameIdentifier	 ELEMNAME  ELEMENT
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_TARGETELEMENT	TokenNameIdentifier	 ELEMNAME  TARGETELEMENT
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_ATTRIBUTE	TokenNameIdentifier	 ELEMNAME  ATTRIBUTE
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_TARGETATTRIBUTE	TokenNameIdentifier	 ELEMNAME  TARGETATTRIBUTE
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_URL	TokenNameIdentifier	 ELEMNAME  URL
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_CALL	TokenNameIdentifier	 ELEMNAME  CALL
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
// ELEMNAME_WITHPARAM = 56, 	TokenNameCOMMENT_LINE	ELEMNAME_WITHPARAM = 56, 
ELEMNAME_FALLBACK	TokenNameIdentifier	 ELEMNAME  FALLBACK
=	TokenNameEQUAL	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_TARGETPI	TokenNameIdentifier	 ELEMNAME  TARGETPI
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_TARGETCOMMENT	TokenNameIdentifier	 ELEMNAME  TARGETCOMMENT
=	TokenNameEQUAL	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_TARGETTEXT	TokenNameIdentifier	 ELEMNAME  TARGETTEXT
=	TokenNameEQUAL	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_CSSSTYLECONVERSION	TokenNameIdentifier	 ELEMNAME  CSSSTYLECONVERSION
=	TokenNameEQUAL	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_COUNTER	TokenNameIdentifier	 ELEMNAME  COUNTER
=	TokenNameEQUAL	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COUNTERS	TokenNameIdentifier	 ELEMNAME  COUNTERS
=	TokenNameEQUAL	
67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COUNTERINCREMENT	TokenNameIdentifier	 ELEMNAME  COUNTERINCREMENT
=	TokenNameEQUAL	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COUNTERRESET	TokenNameIdentifier	 ELEMNAME  COUNTERRESET
=	TokenNameEQUAL	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COUNTERSCOPE	TokenNameIdentifier	 ELEMNAME  COUNTERSCOPE
=	TokenNameEQUAL	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_APPLY_IMPORTS	TokenNameIdentifier	 ELEMNAME  APPLY  IMPORTS
=	TokenNameEQUAL	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
=	TokenNameEQUAL	
73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_MESSAGE	TokenNameIdentifier	 ELEMNAME  MESSAGE
=	TokenNameEQUAL	
75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_LOCALE	TokenNameIdentifier	 ELEMNAME  LOCALE
=	TokenNameEQUAL	
76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_LITERALRESULT	TokenNameIdentifier	 ELEMNAME  LITERALRESULT
=	TokenNameEQUAL	
77	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
=	TokenNameEQUAL	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXTENSIONCALL	TokenNameIdentifier	 ELEMNAME  EXTENSIONCALL
=	TokenNameEQUAL	
79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXTENSIONDECL	TokenNameIdentifier	 ELEMNAME  EXTENSIONDECL
=	TokenNameEQUAL	
85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_EXTENSIONSCRIPT	TokenNameIdentifier	 ELEMNAME  EXTENSIONSCRIPT
=	TokenNameEQUAL	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_OUTPUT	TokenNameIdentifier	 ELEMNAME  OUTPUT
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_COMPONENT	TokenNameIdentifier	 ELEMNAME  COMPONENT
=	TokenNameEQUAL	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMNAME_SCRIPT	TokenNameIdentifier	 ELEMNAME  SCRIPT
=	TokenNameEQUAL	
82	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Next free number: 90 (88 and 89 used for EXSLT elements); 	TokenNameCOMMENT_LINE	Next free number: 90 (88 and 89 used for EXSLT elements); 
/** * Literals for XSL element names. Note that there are more * names than IDs, because some names map to the same ID. */	TokenNameCOMMENT_JAVADOC	 Literals for XSL element names. Note that there are more names than IDs, because some names map to the same ID. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELEMNAME_ANCHOR_STRING	TokenNameIdentifier	 ELEMNAME  ANCHOR  STRING
=	TokenNameEQUAL	
"anchor"	TokenNameStringLiteral	anchor
,	TokenNameCOMMA	
ELEMNAME_ANY_STRING	TokenNameIdentifier	 ELEMNAME  ANY  STRING
=	TokenNameEQUAL	
"any"	TokenNameStringLiteral	any
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_APPLY_IMPORTS_STRING	TokenNameIdentifier	 ELEMNAME  APPLY  IMPORTS  STRING
=	TokenNameEQUAL	
"apply-imports"	TokenNameStringLiteral	apply-imports
,	TokenNameCOMMA	
ELEMNAME_APPLY_TEMPLATES_STRING	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES  STRING
=	TokenNameEQUAL	
"apply-templates"	TokenNameStringLiteral	apply-templates
,	TokenNameCOMMA	
ELEMNAME_ARG_STRING	TokenNameIdentifier	 ELEMNAME  ARG  STRING
=	TokenNameEQUAL	
"arg"	TokenNameStringLiteral	arg
,	TokenNameCOMMA	
ELEMNAME_ATTRIBUTESET_STRING	TokenNameIdentifier	 ELEMNAME  ATTRIBUTESET  STRING
=	TokenNameEQUAL	
"attribute-set"	TokenNameStringLiteral	attribute-set
,	TokenNameCOMMA	
ELEMNAME_ATTRIBUTE_STRING	TokenNameIdentifier	 ELEMNAME  ATTRIBUTE  STRING
=	TokenNameEQUAL	
"attribute"	TokenNameStringLiteral	attribute
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_CALLTEMPLATEARG_STRING	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATEARG  STRING
=	TokenNameEQUAL	
"invoke-arg"	TokenNameStringLiteral	invoke-arg
,	TokenNameCOMMA	
ELEMNAME_CALLTEMPLATE_STRING	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE  STRING
=	TokenNameEQUAL	
"call-template"	TokenNameStringLiteral	call-template
,	TokenNameCOMMA	
ELEMNAME_CALL_STRING	TokenNameIdentifier	 ELEMNAME  CALL  STRING
=	TokenNameEQUAL	
"call"	TokenNameStringLiteral	call
,	TokenNameCOMMA	
ELEMNAME_CHILDREN_STRING	TokenNameIdentifier	 ELEMNAME  CHILDREN  STRING
=	TokenNameEQUAL	
"children"	TokenNameStringLiteral	children
,	TokenNameCOMMA	
ELEMNAME_CHOOSE_STRING	TokenNameIdentifier	 ELEMNAME  CHOOSE  STRING
=	TokenNameEQUAL	
"choose"	TokenNameStringLiteral	choose
,	TokenNameCOMMA	
ELEMNAME_COMMENT_STRING	TokenNameIdentifier	 ELEMNAME  COMMENT  STRING
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
,	TokenNameCOMMA	
ELEMNAME_COMPONENT_STRING	TokenNameIdentifier	 ELEMNAME  COMPONENT  STRING
=	TokenNameEQUAL	
"component"	TokenNameStringLiteral	component
,	TokenNameCOMMA	
ELEMNAME_CONSTRUCT_STRING	TokenNameIdentifier	 ELEMNAME  CONSTRUCT  STRING
=	TokenNameEQUAL	
"construct"	TokenNameStringLiteral	construct
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_CONTENTS_STRING	TokenNameIdentifier	 ELEMNAME  CONTENTS  STRING
=	TokenNameEQUAL	
"contents"	TokenNameStringLiteral	contents
,	TokenNameCOMMA	
ELEMNAME_COPY_OF_STRING	TokenNameIdentifier	 ELEMNAME  COPY  OF  STRING
=	TokenNameEQUAL	
"copy-of"	TokenNameStringLiteral	copy-of
,	TokenNameCOMMA	
ELEMNAME_COPY_STRING	TokenNameIdentifier	 ELEMNAME  COPY  STRING
=	TokenNameEQUAL	
"copy"	TokenNameStringLiteral	copy
,	TokenNameCOMMA	
ELEMNAME_COUNTERINCREMENT_STRING	TokenNameIdentifier	 ELEMNAME  COUNTERINCREMENT  STRING
=	TokenNameEQUAL	
"counter-increment"	TokenNameStringLiteral	counter-increment
,	TokenNameCOMMA	
ELEMNAME_COUNTERRESET_STRING	TokenNameIdentifier	 ELEMNAME  COUNTERRESET  STRING
=	TokenNameEQUAL	
"counter-reset"	TokenNameStringLiteral	counter-reset
,	TokenNameCOMMA	
ELEMNAME_COUNTERSCOPE_STRING	TokenNameIdentifier	 ELEMNAME  COUNTERSCOPE  STRING
=	TokenNameEQUAL	
"counter-scope"	TokenNameStringLiteral	counter-scope
,	TokenNameCOMMA	
ELEMNAME_COUNTERS_STRING	TokenNameIdentifier	 ELEMNAME  COUNTERS  STRING
=	TokenNameEQUAL	
"counters"	TokenNameStringLiteral	counters
,	TokenNameCOMMA	
ELEMNAME_COUNTER_STRING	TokenNameIdentifier	 ELEMNAME  COUNTER  STRING
=	TokenNameEQUAL	
"counter"	TokenNameStringLiteral	counter
,	TokenNameCOMMA	
ELEMNAME_CSSSTYLECONVERSION_STRING	TokenNameIdentifier	 ELEMNAME  CSSSTYLECONVERSION  STRING
=	TokenNameEQUAL	
"css-style-conversion"	TokenNameStringLiteral	css-style-conversion
,	TokenNameCOMMA	
ELEMNAME_DECIMALFORMAT_STRING	TokenNameIdentifier	 ELEMNAME  DECIMALFORMAT  STRING
=	TokenNameEQUAL	
"decimal-format"	TokenNameStringLiteral	decimal-format
,	TokenNameCOMMA	
ELEMNAME_DISPLAYIF_STRING	TokenNameIdentifier	 ELEMNAME  DISPLAYIF  STRING
=	TokenNameEQUAL	
"display-if"	TokenNameStringLiteral	display-if
,	TokenNameCOMMA	
// my own 	TokenNameCOMMENT_LINE	my own 
ELEMNAME_ELEMENT_STRING	TokenNameIdentifier	 ELEMNAME  ELEMENT  STRING
=	TokenNameEQUAL	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_EMPTY_STRING	TokenNameIdentifier	 ELEMNAME  EMPTY  STRING
=	TokenNameEQUAL	
"empty"	TokenNameStringLiteral	empty
,	TokenNameCOMMA	
ELEMNAME_EVAL_STRING	TokenNameIdentifier	 ELEMNAME  EVAL  STRING
=	TokenNameEQUAL	
"eval"	TokenNameStringLiteral	eval
,	TokenNameCOMMA	
ELEMNAME_EXPECTEDCHILDREN_STRING	TokenNameIdentifier	 ELEMNAME  EXPECTEDCHILDREN  STRING
=	TokenNameEQUAL	
"expectedchildren"	TokenNameStringLiteral	expectedchildren
,	TokenNameCOMMA	
ELEMNAME_EXTENSIONHANDLER_STRING	TokenNameIdentifier	 ELEMNAME  EXTENSIONHANDLER  STRING
=	TokenNameEQUAL	
"code-dispatcher"	TokenNameStringLiteral	code-dispatcher
,	TokenNameCOMMA	
ELEMNAME_EXTENSION_STRING	TokenNameIdentifier	 ELEMNAME  EXTENSION  STRING
=	TokenNameEQUAL	
"functions"	TokenNameStringLiteral	functions
,	TokenNameCOMMA	
ELEMNAME_FALLBACK_STRING	TokenNameIdentifier	 ELEMNAME  FALLBACK  STRING
=	TokenNameEQUAL	
"fallback"	TokenNameStringLiteral	fallback
,	TokenNameCOMMA	
ELEMNAME_FOREACH_STRING	TokenNameIdentifier	 ELEMNAME  FOREACH  STRING
=	TokenNameEQUAL	
"for-each"	TokenNameStringLiteral	for-each
,	TokenNameCOMMA	
ELEMNAME_IF_STRING	TokenNameIdentifier	 ELEMNAME  IF  STRING
=	TokenNameEQUAL	
"if"	TokenNameStringLiteral	if
,	TokenNameCOMMA	
ELEMNAME_IMPORT_STRING	TokenNameIdentifier	 ELEMNAME  IMPORT  STRING
=	TokenNameEQUAL	
"import"	TokenNameStringLiteral	import
,	TokenNameCOMMA	
ELEMNAME_INCLUDE_STRING	TokenNameIdentifier	 ELEMNAME  INCLUDE  STRING
=	TokenNameEQUAL	
"include"	TokenNameStringLiteral	include
,	TokenNameCOMMA	
ELEMNAME_KEY_STRING	TokenNameIdentifier	 ELEMNAME  KEY  STRING
=	TokenNameEQUAL	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
ELEMNAME_LOCALE_STRING	TokenNameIdentifier	 ELEMNAME  LOCALE  STRING
=	TokenNameEQUAL	
"locale"	TokenNameStringLiteral	locale
,	TokenNameCOMMA	
ELEMNAME_MESSAGE_STRING	TokenNameIdentifier	 ELEMNAME  MESSAGE  STRING
=	TokenNameEQUAL	
"message"	TokenNameStringLiteral	message
,	TokenNameCOMMA	
ELEMNAME_NSALIAS_STRING	TokenNameIdentifier	 ELEMNAME  NSALIAS  STRING
=	TokenNameEQUAL	
"namespace-alias"	TokenNameStringLiteral	namespace-alias
,	TokenNameCOMMA	
ELEMNAME_NUMBER_STRING	TokenNameIdentifier	 ELEMNAME  NUMBER  STRING
=	TokenNameEQUAL	
"number"	TokenNameStringLiteral	number
,	TokenNameCOMMA	
ELEMNAME_OTHERWISE_STRING	TokenNameIdentifier	 ELEMNAME  OTHERWISE  STRING
=	TokenNameEQUAL	
"otherwise"	TokenNameStringLiteral	otherwise
,	TokenNameCOMMA	
ELEMNAME_OUTPUT_STRING	TokenNameIdentifier	 ELEMNAME  OUTPUT  STRING
=	TokenNameEQUAL	
"output"	TokenNameStringLiteral	output
,	TokenNameCOMMA	
ELEMNAME_PARAMVARIABLE_STRING	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE  STRING
=	TokenNameEQUAL	
"param"	TokenNameStringLiteral	param
,	TokenNameCOMMA	
ELEMNAME_PI_OLD_STRING	TokenNameIdentifier	 ELEMNAME  PI  OLD  STRING
=	TokenNameEQUAL	
"pi"	TokenNameStringLiteral	pi
,	TokenNameCOMMA	
ELEMNAME_PI_STRING	TokenNameIdentifier	 ELEMNAME  PI  STRING
=	TokenNameEQUAL	
"processing-instruction"	TokenNameStringLiteral	processing-instruction
,	TokenNameCOMMA	
ELEMNAME_PRESERVESPACE_STRING	TokenNameIdentifier	 ELEMNAME  PRESERVESPACE  STRING
=	TokenNameEQUAL	
"preserve-space"	TokenNameStringLiteral	preserve-space
,	TokenNameCOMMA	
ELEMNAME_ROOT_STRING	TokenNameIdentifier	 ELEMNAME  ROOT  STRING
=	TokenNameEQUAL	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_SCRIPT_STRING	TokenNameIdentifier	 ELEMNAME  SCRIPT  STRING
=	TokenNameEQUAL	
"script"	TokenNameStringLiteral	script
,	TokenNameCOMMA	
ELEMNAME_SORT_STRING	TokenNameIdentifier	 ELEMNAME  SORT  STRING
=	TokenNameEQUAL	
"sort"	TokenNameStringLiteral	sort
,	TokenNameCOMMA	
ELEMNAME_STRIPSPACE_STRING	TokenNameIdentifier	 ELEMNAME  STRIPSPACE  STRING
=	TokenNameEQUAL	
"strip-space"	TokenNameStringLiteral	strip-space
,	TokenNameCOMMA	
ELEMNAME_STYLESHEET_STRING	TokenNameIdentifier	 ELEMNAME  STYLESHEET  STRING
=	TokenNameEQUAL	
"stylesheet"	TokenNameStringLiteral	stylesheet
,	TokenNameCOMMA	
ELEMNAME_TARGETATTRIBUTE_STRING	TokenNameIdentifier	 ELEMNAME  TARGETATTRIBUTE  STRING
=	TokenNameEQUAL	
"target-attribute"	TokenNameStringLiteral	target-attribute
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_TARGETCOMMENT_STRING	TokenNameIdentifier	 ELEMNAME  TARGETCOMMENT  STRING
=	TokenNameEQUAL	
"target-comment"	TokenNameStringLiteral	target-comment
,	TokenNameCOMMA	
ELEMNAME_TARGETELEMENT_STRING	TokenNameIdentifier	 ELEMNAME  TARGETELEMENT  STRING
=	TokenNameEQUAL	
"target-element"	TokenNameStringLiteral	target-element
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_TARGETPI_STRING	TokenNameIdentifier	 ELEMNAME  TARGETPI  STRING
=	TokenNameEQUAL	
"target-pi"	TokenNameStringLiteral	target-pi
,	TokenNameCOMMA	
ELEMNAME_TARGETTEXT_STRING	TokenNameIdentifier	 ELEMNAME  TARGETTEXT  STRING
=	TokenNameEQUAL	
"target-text"	TokenNameStringLiteral	target-text
,	TokenNameCOMMA	
ELEMNAME_TEMPLATE_STRING	TokenNameIdentifier	 ELEMNAME  TEMPLATE  STRING
=	TokenNameEQUAL	
"template"	TokenNameStringLiteral	template
,	TokenNameCOMMA	
ELEMNAME_TEXT_STRING	TokenNameIdentifier	 ELEMNAME  TEXT  STRING
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
ELEMNAME_TRANSFORM_STRING	TokenNameIdentifier	 ELEMNAME  TRANSFORM  STRING
=	TokenNameEQUAL	
"transform"	TokenNameStringLiteral	transform
,	TokenNameCOMMA	
ELEMNAME_URL_STRING	TokenNameIdentifier	 ELEMNAME  URL  STRING
=	TokenNameEQUAL	
"uri"	TokenNameStringLiteral	uri
,	TokenNameCOMMA	
// pattern-by-example support 	TokenNameCOMMENT_LINE	pattern-by-example support 
ELEMNAME_USE_STRING	TokenNameIdentifier	 ELEMNAME  USE  STRING
=	TokenNameEQUAL	
"use"	TokenNameStringLiteral	use
,	TokenNameCOMMA	
ELEMNAME_VALUEOF_STRING	TokenNameIdentifier	 ELEMNAME  VALUEOF  STRING
=	TokenNameEQUAL	
"value-of"	TokenNameStringLiteral	value-of
,	TokenNameCOMMA	
ELEMNAME_VARIABLE_STRING	TokenNameIdentifier	 ELEMNAME  VARIABLE  STRING
=	TokenNameEQUAL	
"variable"	TokenNameStringLiteral	variable
,	TokenNameCOMMA	
ELEMNAME_WHEN_STRING	TokenNameIdentifier	 ELEMNAME  WHEN  STRING
=	TokenNameEQUAL	
"when"	TokenNameStringLiteral	when
,	TokenNameCOMMA	
ELEMNAME_WITHPARAM_STRING	TokenNameIdentifier	 ELEMNAME  WITHPARAM  STRING
=	TokenNameEQUAL	
"with-param"	TokenNameStringLiteral	with-param
;	TokenNameSEMICOLON	
/** * Literals for EXSLT function elements. */	TokenNameCOMMENT_JAVADOC	 Literals for EXSLT function elements. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_ELEMNAME_FUNCTION_STRING	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCTION  STRING
=	TokenNameEQUAL	
"function"	TokenNameStringLiteral	function
,	TokenNameCOMMA	
EXSLT_ELEMNAME_FUNCRESULT_STRING	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCRESULT  STRING
=	TokenNameEQUAL	
"result"	TokenNameStringLiteral	result
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXSLT_ELEMNAME_FUNCTION	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCTION
=	TokenNameEQUAL	
88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXSLT_ELEMNAME_FUNCRESULT	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCRESULT
=	TokenNameEQUAL	
89	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Literals for XSL attribute names. Note that there may be more * names than IDs, because some names may map to the same ID. */	TokenNameCOMMENT_JAVADOC	 Literals for XSL attribute names. Note that there may be more names than IDs, because some names may map to the same ID. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRNAME_AMOUNT	TokenNameIdentifier	 ATTRNAME  AMOUNT
=	TokenNameEQUAL	
"amount"	TokenNameStringLiteral	amount
,	TokenNameCOMMA	
ATTRNAME_ANCESTOR	TokenNameIdentifier	 ATTRNAME  ANCESTOR
=	TokenNameEQUAL	
"ancestor"	TokenNameStringLiteral	ancestor
,	TokenNameCOMMA	
ATTRNAME_ARCHIVE	TokenNameIdentifier	 ATTRNAME  ARCHIVE
=	TokenNameEQUAL	
"archive"	TokenNameStringLiteral	archive
,	TokenNameCOMMA	
ATTRNAME_ATTRIBUTE	TokenNameIdentifier	 ATTRNAME  ATTRIBUTE
=	TokenNameEQUAL	
"attribute"	TokenNameStringLiteral	attribute
,	TokenNameCOMMA	
ATTRNAME_ATTRIBUTE_SET	TokenNameIdentifier	 ATTRNAME  ATTRIBUTE  SET
=	TokenNameEQUAL	
"attribute-set"	TokenNameStringLiteral	attribute-set
,	TokenNameCOMMA	
ATTRNAME_CASEORDER	TokenNameIdentifier	 ATTRNAME  CASEORDER
=	TokenNameEQUAL	
"case-order"	TokenNameStringLiteral	case-order
,	TokenNameCOMMA	
ATTRNAME_CLASS	TokenNameIdentifier	 ATTRNAME  CLASS
=	TokenNameEQUAL	
"class"	TokenNameStringLiteral	class
,	TokenNameCOMMA	
ATTRNAME_CLASSID	TokenNameIdentifier	 ATTRNAME  CLASSID
=	TokenNameEQUAL	
"classid"	TokenNameStringLiteral	classid
,	TokenNameCOMMA	
ATTRNAME_CODEBASE	TokenNameIdentifier	 ATTRNAME  CODEBASE
=	TokenNameEQUAL	
"codebase"	TokenNameStringLiteral	codebase
,	TokenNameCOMMA	
ATTRNAME_CODETYPE	TokenNameIdentifier	 ATTRNAME  CODETYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
ATTRNAME_CONDITION	TokenNameIdentifier	 ATTRNAME  CONDITION
=	TokenNameEQUAL	
"condition"	TokenNameStringLiteral	condition
,	TokenNameCOMMA	
ATTRNAME_COPYTYPE	TokenNameIdentifier	 ATTRNAME  COPYTYPE
=	TokenNameEQUAL	
"copy-type"	TokenNameStringLiteral	copy-type
,	TokenNameCOMMA	
ATTRNAME_COUNT	TokenNameIdentifier	 ATTRNAME  COUNT
=	TokenNameEQUAL	
"count"	TokenNameStringLiteral	count
,	TokenNameCOMMA	
ATTRNAME_DATATYPE	TokenNameIdentifier	 ATTRNAME  DATATYPE
=	TokenNameEQUAL	
"data-type"	TokenNameStringLiteral	data-type
,	TokenNameCOMMA	
ATTRNAME_DECIMALSEPARATOR	TokenNameIdentifier	 ATTRNAME  DECIMALSEPARATOR
=	TokenNameEQUAL	
"decimal-separator"	TokenNameStringLiteral	decimal-separator
,	TokenNameCOMMA	
ATTRNAME_DEFAULT	TokenNameIdentifier	 ATTRNAME  DEFAULT
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
ATTRNAME_DEFAULTSPACE	TokenNameIdentifier	 ATTRNAME  DEFAULTSPACE
=	TokenNameEQUAL	
"default-space"	TokenNameStringLiteral	default-space
,	TokenNameCOMMA	
ATTRNAME_DEPTH	TokenNameIdentifier	 ATTRNAME  DEPTH
=	TokenNameEQUAL	
"with-children"	TokenNameStringLiteral	with-children
,	TokenNameCOMMA	
ATTRNAME_DIGIT	TokenNameIdentifier	 ATTRNAME  DIGIT
=	TokenNameEQUAL	
"digit"	TokenNameStringLiteral	digit
,	TokenNameCOMMA	
ATTRNAME_DIGITGROUPSEP	TokenNameIdentifier	 ATTRNAME  DIGITGROUPSEP
=	TokenNameEQUAL	
"digit-group-sep"	TokenNameStringLiteral	digit-group-sep
,	TokenNameCOMMA	
ATTRNAME_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 ATTRNAME  DISABLE  OUTPUT  ESCAPING
=	TokenNameEQUAL	
"disable-output-escaping"	TokenNameStringLiteral	disable-output-escaping
,	TokenNameCOMMA	
ATTRNAME_ELEMENT	TokenNameIdentifier	 ATTRNAME  ELEMENT
=	TokenNameEQUAL	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
ATTRNAME_ELEMENTS	TokenNameIdentifier	 ATTRNAME  ELEMENTS
=	TokenNameEQUAL	
"elements"	TokenNameStringLiteral	elements
,	TokenNameCOMMA	
ATTRNAME_EXCLUDE_RESULT_PREFIXES	TokenNameIdentifier	 ATTRNAME  EXCLUDE  RESULT  PREFIXES
=	TokenNameEQUAL	
"exclude-result-prefixes"	TokenNameStringLiteral	exclude-result-prefixes
,	TokenNameCOMMA	
ATTRNAME_EXPR	TokenNameIdentifier	 ATTRNAME  EXPR
=	TokenNameEQUAL	
"expr"	TokenNameStringLiteral	expr
,	TokenNameCOMMA	
ATTRNAME_EXTENSIONELEMENTPREFIXES	TokenNameIdentifier	 ATTRNAME  EXTENSIONELEMENTPREFIXES
=	TokenNameEQUAL	
"extension-element-prefixes"	TokenNameStringLiteral	extension-element-prefixes
,	TokenNameCOMMA	
ATTRNAME_FORMAT	TokenNameIdentifier	 ATTRNAME  FORMAT
=	TokenNameEQUAL	
"format"	TokenNameStringLiteral	format
,	TokenNameCOMMA	
ATTRNAME_FROM	TokenNameIdentifier	 ATTRNAME  FROM
=	TokenNameEQUAL	
"from"	TokenNameStringLiteral	from
,	TokenNameCOMMA	
ATTRNAME_GROUPINGSEPARATOR	TokenNameIdentifier	 ATTRNAME  GROUPINGSEPARATOR
=	TokenNameEQUAL	
"grouping-separator"	TokenNameStringLiteral	grouping-separator
,	TokenNameCOMMA	
ATTRNAME_GROUPINGSIZE	TokenNameIdentifier	 ATTRNAME  GROUPINGSIZE
=	TokenNameEQUAL	
"grouping-size"	TokenNameStringLiteral	grouping-size
,	TokenNameCOMMA	
ATTRNAME_HREF	TokenNameIdentifier	 ATTRNAME  HREF
=	TokenNameEQUAL	
"href"	TokenNameStringLiteral	href
,	TokenNameCOMMA	
ATTRNAME_ID	TokenNameIdentifier	 ATTRNAME  ID
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
ATTRNAME_IMPORTANCE	TokenNameIdentifier	 ATTRNAME  IMPORTANCE
=	TokenNameEQUAL	
"importance"	TokenNameStringLiteral	importance
,	TokenNameCOMMA	
ATTRNAME_INDENTRESULT	TokenNameIdentifier	 ATTRNAME  INDENTRESULT
=	TokenNameEQUAL	
"indent-result"	TokenNameStringLiteral	indent-result
,	TokenNameCOMMA	
ATTRNAME_INFINITY	TokenNameIdentifier	 ATTRNAME  INFINITY
=	TokenNameEQUAL	
"infinity"	TokenNameStringLiteral	infinity
,	TokenNameCOMMA	
ATTRNAME_LANG	TokenNameIdentifier	 ATTRNAME  LANG
=	TokenNameEQUAL	
"lang"	TokenNameStringLiteral	lang
,	TokenNameCOMMA	
ATTRNAME_LETTERVALUE	TokenNameIdentifier	 ATTRNAME  LETTERVALUE
=	TokenNameEQUAL	
"letter-value"	TokenNameStringLiteral	letter-value
,	TokenNameCOMMA	
ATTRNAME_LEVEL	TokenNameIdentifier	 ATTRNAME  LEVEL
=	TokenNameEQUAL	
"level"	TokenNameStringLiteral	level
,	TokenNameCOMMA	
ATTRNAME_MATCH	TokenNameIdentifier	 ATTRNAME  MATCH
=	TokenNameEQUAL	
"match"	TokenNameStringLiteral	match
,	TokenNameCOMMA	
ATTRNAME_METHOD	TokenNameIdentifier	 ATTRNAME  METHOD
=	TokenNameEQUAL	
"calls"	TokenNameStringLiteral	calls
,	TokenNameCOMMA	
ATTRNAME_MINUSSIGN	TokenNameIdentifier	 ATTRNAME  MINUSSIGN
=	TokenNameEQUAL	
"minus-sign"	TokenNameStringLiteral	minus-sign
,	TokenNameCOMMA	
ATTRNAME_MODE	TokenNameIdentifier	 ATTRNAME  MODE
=	TokenNameEQUAL	
"mode"	TokenNameStringLiteral	mode
,	TokenNameCOMMA	
ATTRNAME_NAME	TokenNameIdentifier	 ATTRNAME  NAME
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
ATTRNAME_NAMESPACE	TokenNameIdentifier	 ATTRNAME  NAMESPACE
=	TokenNameEQUAL	
"namespace"	TokenNameStringLiteral	namespace
,	TokenNameCOMMA	
ATTRNAME_NAN	TokenNameIdentifier	 ATTRNAME  NAN
=	TokenNameEQUAL	
"NaN"	TokenNameStringLiteral	NaN
,	TokenNameCOMMA	
ATTRNAME_NDIGITSPERGROUP	TokenNameIdentifier	 ATTRNAME  NDIGITSPERGROUP
=	TokenNameEQUAL	
"n-digits-per-group"	TokenNameStringLiteral	n-digits-per-group
,	TokenNameCOMMA	
ATTRNAME_NS	TokenNameIdentifier	 ATTRNAME  NS
=	TokenNameEQUAL	
"ns"	TokenNameStringLiteral	ns
,	TokenNameCOMMA	
ATTRNAME_ONLY	TokenNameIdentifier	 ATTRNAME  ONLY
=	TokenNameEQUAL	
"only"	TokenNameStringLiteral	only
,	TokenNameCOMMA	
ATTRNAME_ORDER	TokenNameIdentifier	 ATTRNAME  ORDER
=	TokenNameEQUAL	
"order"	TokenNameStringLiteral	order
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 ATTRNAME  OUTPUT  CDATA  SECTION  ELEMENTS
=	TokenNameEQUAL	
"cdata-section-elements"	TokenNameStringLiteral	cdata-section-elements
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_DOCTYPE_PUBLIC	TokenNameIdentifier	 ATTRNAME  OUTPUT  DOCTYPE  PUBLIC
=	TokenNameEQUAL	
"doctype-public"	TokenNameStringLiteral	doctype-public
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_DOCTYPE_SYSTEM	TokenNameIdentifier	 ATTRNAME  OUTPUT  DOCTYPE  SYSTEM
=	TokenNameEQUAL	
"doctype-system"	TokenNameStringLiteral	doctype-system
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_ENCODING	TokenNameIdentifier	 ATTRNAME  OUTPUT  ENCODING
=	TokenNameEQUAL	
"encoding"	TokenNameStringLiteral	encoding
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_INDENT	TokenNameIdentifier	 ATTRNAME  OUTPUT  INDENT
=	TokenNameEQUAL	
"indent"	TokenNameStringLiteral	indent
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_MEDIATYPE	TokenNameIdentifier	 ATTRNAME  OUTPUT  MEDIATYPE
=	TokenNameEQUAL	
"media-type"	TokenNameStringLiteral	media-type
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_METHOD	TokenNameIdentifier	 ATTRNAME  OUTPUT  METHOD
=	TokenNameEQUAL	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
// qname, 	TokenNameCOMMENT_LINE	qname, 
ATTRNAME_OUTPUT_OMITXMLDECL	TokenNameIdentifier	 ATTRNAME  OUTPUT  OMITXMLDECL
=	TokenNameEQUAL	
"omit-xml-declaration"	TokenNameStringLiteral	omit-xml-declaration
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_STANDALONE	TokenNameIdentifier	 ATTRNAME  OUTPUT  STANDALONE
=	TokenNameEQUAL	
"standalone"	TokenNameStringLiteral	standalone
,	TokenNameCOMMA	
ATTRNAME_OUTPUT_VERSION	TokenNameIdentifier	 ATTRNAME  OUTPUT  VERSION
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
ATTRNAME_PATTERNSEPARATOR	TokenNameIdentifier	 ATTRNAME  PATTERNSEPARATOR
=	TokenNameEQUAL	
"pattern-separator"	TokenNameStringLiteral	pattern-separator
,	TokenNameCOMMA	
ATTRNAME_PERCENT	TokenNameIdentifier	 ATTRNAME  PERCENT
=	TokenNameEQUAL	
"percent"	TokenNameStringLiteral	percent
,	TokenNameCOMMA	
ATTRNAME_PERMILLE	TokenNameIdentifier	 ATTRNAME  PERMILLE
=	TokenNameEQUAL	
"per-mille"	TokenNameStringLiteral	per-mille
,	TokenNameCOMMA	
ATTRNAME_PRIORITY	TokenNameIdentifier	 ATTRNAME  PRIORITY
=	TokenNameEQUAL	
"priority"	TokenNameStringLiteral	priority
,	TokenNameCOMMA	
ATTRNAME_REFID	TokenNameIdentifier	 ATTRNAME  REFID
=	TokenNameEQUAL	
"refID"	TokenNameStringLiteral	refID
,	TokenNameCOMMA	
ATTRNAME_RESULTNS	TokenNameIdentifier	 ATTRNAME  RESULTNS
=	TokenNameEQUAL	
"result-ns"	TokenNameStringLiteral	result-ns
,	TokenNameCOMMA	
ATTRNAME_RESULT_PREFIX	TokenNameIdentifier	 ATTRNAME  RESULT  PREFIX
=	TokenNameEQUAL	
"result-prefix"	TokenNameStringLiteral	result-prefix
,	TokenNameCOMMA	
ATTRNAME_SELECT	TokenNameIdentifier	 ATTRNAME  SELECT
=	TokenNameEQUAL	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
ATTRNAME_SEQUENCESRC	TokenNameIdentifier	 ATTRNAME  SEQUENCESRC
=	TokenNameEQUAL	
"sequence-src"	TokenNameStringLiteral	sequence-src
,	TokenNameCOMMA	
ATTRNAME_STYLE	TokenNameIdentifier	 ATTRNAME  STYLE
=	TokenNameEQUAL	
"style"	TokenNameStringLiteral	style
,	TokenNameCOMMA	
ATTRNAME_STYLESHEET_PREFIX	TokenNameIdentifier	 ATTRNAME  STYLESHEET  PREFIX
=	TokenNameEQUAL	
"stylesheet-prefix"	TokenNameStringLiteral	stylesheet-prefix
,	TokenNameCOMMA	
ATTRNAME_TERMINATE	TokenNameIdentifier	 ATTRNAME  TERMINATE
=	TokenNameEQUAL	
"terminate"	TokenNameStringLiteral	terminate
,	TokenNameCOMMA	
ATTRNAME_TEST	TokenNameIdentifier	 ATTRNAME  TEST
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
ATTRNAME_TOSTRING	TokenNameIdentifier	 ATTRNAME  TOSTRING
=	TokenNameEQUAL	
"to-string"	TokenNameStringLiteral	to-string
,	TokenNameCOMMA	
ATTRNAME_TYPE	TokenNameIdentifier	 ATTRNAME  TYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
ATTRNAME_USE	TokenNameIdentifier	 ATTRNAME  USE
=	TokenNameEQUAL	
"use"	TokenNameStringLiteral	use
,	TokenNameCOMMA	
ATTRNAME_USEATTRIBUTESETS	TokenNameIdentifier	 ATTRNAME  USEATTRIBUTESETS
=	TokenNameEQUAL	
"use-attribute-sets"	TokenNameStringLiteral	use-attribute-sets
,	TokenNameCOMMA	
ATTRNAME_VALUE	TokenNameIdentifier	 ATTRNAME  VALUE
=	TokenNameEQUAL	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
ATTRNAME_VERSION	TokenNameIdentifier	 ATTRNAME  VERSION
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
ATTRNAME_XMLNS	TokenNameIdentifier	 ATTRNAME  XMLNS
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
,	TokenNameCOMMA	
// namespace declaration prefix -- NOT an attribute by itself 	TokenNameCOMMENT_LINE	namespace declaration prefix -- NOT an attribute by itself 
ATTRNAME_XMLNSDEF	TokenNameIdentifier	 ATTRNAME  XMLNSDEF
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
,	TokenNameCOMMA	
// default namespace 	TokenNameCOMMENT_LINE	default namespace 
ATTRNAME_XMLSPACE	TokenNameIdentifier	 ATTRNAME  XMLSPACE
=	TokenNameEQUAL	
"xml:space"	TokenNameStringLiteral	xml:space
,	TokenNameCOMMA	
ATTRNAME_ZERODIGIT	TokenNameIdentifier	 ATTRNAME  ZERODIGIT
=	TokenNameEQUAL	
"zero-digit"	TokenNameStringLiteral	zero-digit
;	TokenNameSEMICOLON	
/** IDs for XSL attribute types. These are associated * with the string literals in the TransformerImpl class. * Don't change the numbers. NOTE THAT THESE ARE NOT IN * ALPHABETICAL ORDER! */	TokenNameCOMMENT_JAVADOC	 IDs for XSL attribute types. These are associated with the string literals in the TransformerImpl class. Don't change the numbers. NOTE THAT THESE ARE NOT IN ALPHABETICAL ORDER! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TATTRNAME_OUTPUT_METHOD	TokenNameIdentifier	 TATTRNAME  OUTPUT  METHOD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_AMOUNT	TokenNameIdentifier	 TATTRNAME  AMOUNT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ANCESTOR	TokenNameIdentifier	 TATTRNAME  ANCESTOR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ARCHIVE	TokenNameIdentifier	 TATTRNAME  ARCHIVE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ATTRIBUTE	TokenNameIdentifier	 TATTRNAME  ATTRIBUTE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ATTRIBUTE_SET	TokenNameIdentifier	 TATTRNAME  ATTRIBUTE  SET
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CASEORDER	TokenNameIdentifier	 TATTRNAME  CASEORDER
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CLASS	TokenNameIdentifier	 TATTRNAME  CLASS
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CLASSID	TokenNameIdentifier	 TATTRNAME  CLASSID
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CODEBASE	TokenNameIdentifier	 TATTRNAME  CODEBASE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CODETYPE	TokenNameIdentifier	 TATTRNAME  CODETYPE
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_CONDITION	TokenNameIdentifier	 TATTRNAME  CONDITION
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_COPYTYPE	TokenNameIdentifier	 TATTRNAME  COPYTYPE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_COUNT	TokenNameIdentifier	 TATTRNAME  COUNT
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DATATYPE	TokenNameIdentifier	 TATTRNAME  DATATYPE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DEFAULT	TokenNameIdentifier	 TATTRNAME  DEFAULT
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DEFAULTSPACE	TokenNameIdentifier	 TATTRNAME  DEFAULTSPACE
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DEPTH	TokenNameIdentifier	 TATTRNAME  DEPTH
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DIGITGROUPSEP	TokenNameIdentifier	 TATTRNAME  DIGITGROUPSEP
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 TATTRNAME  DISABLE  OUTPUT  ESCAPING
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ELEMENT	TokenNameIdentifier	 TATTRNAME  ELEMENT
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ELEMENTS	TokenNameIdentifier	 TATTRNAME  ELEMENTS
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_EXPR	TokenNameIdentifier	 TATTRNAME  EXPR
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_EXTENSIONELEMENTPREFIXES	TokenNameIdentifier	 TATTRNAME  EXTENSIONELEMENTPREFIXES
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_FORMAT	TokenNameIdentifier	 TATTRNAME  FORMAT
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_FROM	TokenNameIdentifier	 TATTRNAME  FROM
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_GROUPINGSEPARATOR	TokenNameIdentifier	 TATTRNAME  GROUPINGSEPARATOR
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_GROUPINGSIZE	TokenNameIdentifier	 TATTRNAME  GROUPINGSIZE
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_HREF	TokenNameIdentifier	 TATTRNAME  HREF
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ID	TokenNameIdentifier	 TATTRNAME  ID
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_IMPORTANCE	TokenNameIdentifier	 TATTRNAME  IMPORTANCE
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_INDENTRESULT	TokenNameIdentifier	 TATTRNAME  INDENTRESULT
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_LANG	TokenNameIdentifier	 TATTRNAME  LANG
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_LETTERVALUE	TokenNameIdentifier	 TATTRNAME  LETTERVALUE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_LEVEL	TokenNameIdentifier	 TATTRNAME  LEVEL
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_MATCH	TokenNameIdentifier	 TATTRNAME  MATCH
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_METHOD	TokenNameIdentifier	 TATTRNAME  METHOD
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_MODE	TokenNameIdentifier	 TATTRNAME  MODE
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_NAME	TokenNameIdentifier	 TATTRNAME  NAME
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_NAMESPACE	TokenNameIdentifier	 TATTRNAME  NAMESPACE
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_NDIGITSPERGROUP	TokenNameIdentifier	 TATTRNAME  NDIGITSPERGROUP
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_NS	TokenNameIdentifier	 TATTRNAME  NS
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ONLY	TokenNameIdentifier	 TATTRNAME  ONLY
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_ORDER	TokenNameIdentifier	 TATTRNAME  ORDER
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 TATTRNAME  OUTPUT  CDATA  SECTION  ELEMENTS
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_DOCTYPE_PUBLIC	TokenNameIdentifier	 TATTRNAME  OUTPUT  DOCTYPE  PUBLIC
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_DOCTYPE_SYSTEM	TokenNameIdentifier	 TATTRNAME  OUTPUT  DOCTYPE  SYSTEM
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_ENCODING	TokenNameIdentifier	 TATTRNAME  OUTPUT  ENCODING
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_INDENT	TokenNameIdentifier	 TATTRNAME  OUTPUT  INDENT
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_MEDIATYPE	TokenNameIdentifier	 TATTRNAME  OUTPUT  MEDIATYPE
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_STANDALONE	TokenNameIdentifier	 TATTRNAME  OUTPUT  STANDALONE
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_VERSION	TokenNameIdentifier	 TATTRNAME  OUTPUT  VERSION
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_OUTPUT_OMITXMLDECL	TokenNameIdentifier	 TATTRNAME  OUTPUT  OMITXMLDECL
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_PRIORITY	TokenNameIdentifier	 TATTRNAME  PRIORITY
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_REFID	TokenNameIdentifier	 TATTRNAME  REFID
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_RESULTNS	TokenNameIdentifier	 TATTRNAME  RESULTNS
=	TokenNameEQUAL	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_SELECT	TokenNameIdentifier	 TATTRNAME  SELECT
=	TokenNameEQUAL	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_SEQUENCESRC	TokenNameIdentifier	 TATTRNAME  SEQUENCESRC
=	TokenNameEQUAL	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_STYLE	TokenNameIdentifier	 TATTRNAME  STYLE
=	TokenNameEQUAL	
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_TEST	TokenNameIdentifier	 TATTRNAME  TEST
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_TOSTRING	TokenNameIdentifier	 TATTRNAME  TOSTRING
=	TokenNameEQUAL	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_TYPE	TokenNameIdentifier	 TATTRNAME  TYPE
=	TokenNameEQUAL	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_USE	TokenNameIdentifier	 TATTRNAME  USE
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_USEATTRIBUTESETS	TokenNameIdentifier	 TATTRNAME  USEATTRIBUTESETS
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_VALUE	TokenNameIdentifier	 TATTRNAME  VALUE
=	TokenNameEQUAL	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_XMLNSDEF	TokenNameIdentifier	 TATTRNAME  XMLNSDEF
=	TokenNameEQUAL	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_XMLNS	TokenNameIdentifier	 TATTRNAME  XMLNS
=	TokenNameEQUAL	
67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_XMLSPACE	TokenNameIdentifier	 TATTRNAME  XMLSPACE
=	TokenNameEQUAL	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TATTRNAME_EXCLUDE_RESULT_PREFIXES	TokenNameIdentifier	 TATTRNAME  EXCLUDE  RESULT  PREFIXES
=	TokenNameEQUAL	
69	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Mnemonics for the possible values of the xsl:output element's * method= attribute: * <ul> * <li>ATTRVAL_OUTPUT_METHOD_XML = Use an XML formatter to * produce the output document (basic XSLT operation).</li> * <li>ATTRVAL_OUTPUT_METHOD_HTML: Use an HTML formatter to * produce the output document. When generating HTML documents, * this may yield better results; it does things like escaping * characters in href attributes.</li> * </li>ATTRVAL_OUTPUT_METHOD_TEXT: Use a Text formatter to * produce the output document. Generally the right choice if your * stylesheet wants to take over _all_ the details of formatting, * most often when producing something that isn't an XML or HTML * document.</li> * </ul> * */	TokenNameCOMMENT_JAVADOC	 Mnemonics for the possible values of the xsl:output element's method= attribute: <ul> <li>ATTRVAL_OUTPUT_METHOD_XML = Use an XML formatter to produce the output document (basic XSLT operation).</li> <li>ATTRVAL_OUTPUT_METHOD_HTML: Use an HTML formatter to produce the output document. When generating HTML documents, this may yield better results; it does things like escaping characters in href attributes.</li> </li>ATTRVAL_OUTPUT_METHOD_TEXT: Use a Text formatter to produce the output document. Generally the right choice if your stylesheet wants to take over _all_ the details of formatting, most often when producing something that isn't an XML or HTML document.</li> </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_OUTPUT_METHOD_HTML	TokenNameIdentifier	 ATTRVAL  OUTPUT  METHOD  HTML
=	TokenNameEQUAL	
"html"	TokenNameStringLiteral	html
,	TokenNameCOMMA	
ATTRVAL_OUTPUT_METHOD_XML	TokenNameIdentifier	 ATTRVAL  OUTPUT  METHOD  XML
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
ATTRVAL_OUTPUT_METHOD_TEXT	TokenNameIdentifier	 ATTRVAL  OUTPUT  METHOD  TEXT
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
/* For space-att*/	TokenNameCOMMENT_BLOCK	 For space-att
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTRVAL_PRESERVE	TokenNameIdentifier	 ATTRVAL  PRESERVE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ATTRVAL_STRIP	TokenNameIdentifier	 ATTRVAL  STRIP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** For indent-result */	TokenNameCOMMENT_JAVADOC	 For indent-result 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
ATTRVAL_YES	TokenNameIdentifier	 ATTRVAL  YES
=	TokenNameEQUAL	
true	TokenNametrue	
,	TokenNameCOMMA	
ATTRVAL_NO	TokenNameIdentifier	 ATTRVAL  NO
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** For letter-value attribute (part of conversion attributes). */	TokenNameCOMMENT_JAVADOC	 For letter-value attribute (part of conversion attributes). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_ALPHABETIC	TokenNameIdentifier	 ATTRVAL  ALPHABETIC
=	TokenNameEQUAL	
"alphabetic"	TokenNameStringLiteral	alphabetic
,	TokenNameCOMMA	
ATTRVAL_OTHER	TokenNameIdentifier	 ATTRVAL  OTHER
=	TokenNameEQUAL	
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
ATTRVAL_TRADITIONAL	TokenNameIdentifier	 ATTRVAL  TRADITIONAL
=	TokenNameEQUAL	
"traditional"	TokenNameStringLiteral	traditional
;	TokenNameSEMICOLON	
/** For level attribute in xsl:number. */	TokenNameCOMMENT_JAVADOC	 For level attribute in xsl:number. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_SINGLE	TokenNameIdentifier	 ATTRVAL  SINGLE
=	TokenNameEQUAL	
"single"	TokenNameStringLiteral	single
,	TokenNameCOMMA	
ATTRVAL_MULTI	TokenNameIdentifier	 ATTRVAL  MULTI
=	TokenNameEQUAL	
"multiple"	TokenNameStringLiteral	multiple
,	TokenNameCOMMA	
ATTRVAL_ANY	TokenNameIdentifier	 ATTRVAL  ANY
=	TokenNameEQUAL	
"any"	TokenNameStringLiteral	any
;	TokenNameSEMICOLON	
/** For Stylesheet-prefix and result-prefix in xsl:namespace-alias */	TokenNameCOMMENT_JAVADOC	 For Stylesheet-prefix and result-prefix in xsl:namespace-alias 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_DEFAULT_PREFIX	TokenNameIdentifier	 ATTRVAL  DEFAULT  PREFIX
=	TokenNameEQUAL	
"#default"	TokenNameStringLiteral	#default
;	TokenNameSEMICOLON	
/** Integer equivalents for above */	TokenNameCOMMENT_JAVADOC	 Integer equivalents for above 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUMBERLETTER_ALPHABETIC	TokenNameIdentifier	 NUMBERLETTER  ALPHABETIC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUMBERLETTER_TRADITIONAL	TokenNameIdentifier	 NUMBERLETTER  TRADITIONAL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Integer equivelents for above */	TokenNameCOMMENT_JAVADOC	 Integer equivelents for above 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUMBERLEVEL_SINGLE	TokenNameIdentifier	 NUMBERLEVEL  SINGLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUMBERLEVEL_MULTI	TokenNameIdentifier	 NUMBERLEVEL  MULTI
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUMBERLEVEL_ANY	TokenNameIdentifier	 NUMBERLEVEL  ANY
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MAX_MULTI_COUNTING_DEPTH	TokenNameIdentifier	 MAX  MULTI  COUNTING  DEPTH
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** some stuff for my patterns-by-example */	TokenNameCOMMENT_JAVADOC	 some stuff for my patterns-by-example 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_THIS	TokenNameIdentifier	 ATTRVAL  THIS
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
ATTRVAL_PARENT	TokenNameIdentifier	 ATTRVAL  PARENT
=	TokenNameEQUAL	
".."	TokenNameStringLiteral	..
,	TokenNameCOMMA	
ATTRVAL_ANCESTOR	TokenNameIdentifier	 ATTRVAL  ANCESTOR
=	TokenNameEQUAL	
"ancestor"	TokenNameStringLiteral	ancestor
,	TokenNameCOMMA	
ATTRVAL_ID	TokenNameIdentifier	 ATTRVAL  ID
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
;	TokenNameSEMICOLON	
/** Stuff for sorting */	TokenNameCOMMENT_JAVADOC	 Stuff for sorting 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_DATATYPE_TEXT	TokenNameIdentifier	 ATTRVAL  DATATYPE  TEXT
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
ATTRVAL_DATATYPE_NUMBER	TokenNameIdentifier	 ATTRVAL  DATATYPE  NUMBER
=	TokenNameEQUAL	
"number"	TokenNameStringLiteral	number
,	TokenNameCOMMA	
ATTRVAL_ORDER_ASCENDING	TokenNameIdentifier	 ATTRVAL  ORDER  ASCENDING
=	TokenNameEQUAL	
"ascending"	TokenNameStringLiteral	ascending
,	TokenNameCOMMA	
ATTRVAL_ORDER_DESCENDING	TokenNameIdentifier	 ATTRVAL  ORDER  DESCENDING
=	TokenNameEQUAL	
"descending"	TokenNameStringLiteral	descending
,	TokenNameCOMMA	
ATTRVAL_CASEORDER_UPPER	TokenNameIdentifier	 ATTRVAL  CASEORDER  UPPER
=	TokenNameEQUAL	
"upper-first"	TokenNameStringLiteral	upper-first
,	TokenNameCOMMA	
ATTRVAL_CASEORDER_LOWER	TokenNameIdentifier	 ATTRVAL  CASEORDER  LOWER
=	TokenNameEQUAL	
"lower-first"	TokenNameStringLiteral	lower-first
;	TokenNameSEMICOLON	
/** Integer equivelents for DATATYPE attribute */	TokenNameCOMMENT_JAVADOC	 Integer equivelents for DATATYPE attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SORTDATATYPE_TEXT	TokenNameIdentifier	 SORTDATATYPE  TEXT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SORTDATATYPE_NUMBER	TokenNameIdentifier	 SORTDATATYPE  NUMBER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Integer equivelents for ORDER attribute */	TokenNameCOMMENT_JAVADOC	 Integer equivelents for ORDER attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SORTORDER_ASCENDING	TokenNameIdentifier	 SORTORDER  ASCENDING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SORTORDER_DESCENDING	TokenNameIdentifier	 SORTORDER  DESCENDING
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Integer equivelents for CASE-ORDER attribute */	TokenNameCOMMENT_JAVADOC	 Integer equivelents for CASE-ORDER attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SORTCASEORDER_UPPERFIRST	TokenNameIdentifier	 SORTCASEORDER  UPPERFIRST
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SORTCASEORDER_LOWERFIRST	TokenNameIdentifier	 SORTCASEORDER  LOWERFIRST
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** some stuff for Decimal-format */	TokenNameCOMMENT_JAVADOC	 some stuff for Decimal-format 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRVAL_INFINITY	TokenNameIdentifier	 ATTRVAL  INFINITY
=	TokenNameEQUAL	
"Infinity"	TokenNameStringLiteral	Infinity
,	TokenNameCOMMA	
ATTRVAL_NAN	TokenNameIdentifier	 ATTRVAL  NAN
=	TokenNameEQUAL	
"NaN"	TokenNameStringLiteral	NaN
,	TokenNameCOMMA	
DEFAULT_DECIMAL_FORMAT	TokenNameIdentifier	 DEFAULT  DECIMAL  FORMAT
=	TokenNameEQUAL	
"#default"	TokenNameStringLiteral	#default
;	TokenNameSEMICOLON	
/** temp dummy */	TokenNameCOMMENT_JAVADOC	 temp dummy 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRNAME_XXXX	TokenNameIdentifier	 ATTRNAME  XXXX
=	TokenNameEQUAL	
"XXXX"	TokenNameStringLiteral	XXXX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
