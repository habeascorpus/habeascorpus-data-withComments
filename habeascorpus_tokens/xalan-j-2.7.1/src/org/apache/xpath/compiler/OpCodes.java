/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OpCodes.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OpCodes.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
/** * Operations codes for XPath. * * Code for the descriptions of the operations codes: * [UPPER CASE] indicates a literal value, * [lower case] is a description of a value, * ([length] always indicates the length of the operation, * including the operations code and the length integer.) * {UPPER CASE} indicates the given production, * {description} is the description of a new production, * (For instance, {boolean expression} means some expression * that should be resolved to a boolean.) * * means that it occurs zero or more times, * + means that it occurs one or more times, * ? means that it is optional. * * returns: indicates what the production should return. */	TokenNameCOMMENT_JAVADOC	 Operations codes for XPath. * Code for the descriptions of the operations codes: [UPPER CASE] indicates a literal value, [lower case] is a description of a value, ([length] always indicates the length of the operation, including the operations code and the length integer.) {UPPER CASE} indicates the given production, {description} is the description of a new production, (For instance, {boolean expression} means some expression that should be resolved to a boolean.) * means that it occurs zero or more times, + means that it occurs one or more times, ? means that it is optional. * returns: indicates what the production should return. 
public	TokenNamepublic	
class	TokenNameclass	
OpCodes	TokenNameIdentifier	 Op Codes
{	TokenNameLBRACE	
/** * [ENDOP] * Some operators may like to have a terminator. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [ENDOP] Some operators may like to have a terminator. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENDOP	TokenNameIdentifier	 ENDOP
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [EMPTY] * Empty slot to indicate NULL. */	TokenNameCOMMENT_JAVADOC	 [EMPTY] Empty slot to indicate NULL. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [ELEMWILDCARD] * Means ELEMWILDCARD ("*"), used instead * of string index in some places. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [ELEMWILDCARD] Means ELEMWILDCARD ("*"), used instead of string index in some places. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
=	TokenNameEQUAL	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_XPATH] * [length] * {expression} * * returns: * XNodeSet * XNumber * XString * XBoolean * XRTree * XObject * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_XPATH] [length] {expression} * returns: XNodeSet XNumber XString XBoolean XRTree XObject @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_XPATH	TokenNameIdentifier	 OP  XPATH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_OR] * [length] * {boolean expression} * {boolean expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_OR] [length] {boolean expression} {boolean expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_OR	TokenNameIdentifier	 OP  OR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_AND] * [length] * {boolean expression} * {boolean expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_AND] [length] {boolean expression} {boolean expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_AND	TokenNameIdentifier	 OP  AND
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_NOTEQUALS] * [length] * {expression} * {expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_NOTEQUALS] [length] {expression} {expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_NOTEQUALS	TokenNameIdentifier	 OP  NOTEQUALS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_EQUALS] * [length] * {expression} * {expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_EQUALS] [length] {expression} {expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_EQUALS	TokenNameIdentifier	 OP  EQUALS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_LTE] (less-than-or-equals) * [length] * {number expression} * {number expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_LTE] (less-than-or-equals) [length] {number expression} {number expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_LTE	TokenNameIdentifier	 OP  LTE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_LT] (less-than) * [length] * {number expression} * {number expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_LT] (less-than) [length] {number expression} {number expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_LT	TokenNameIdentifier	 OP  LT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_GTE] (greater-than-or-equals) * [length] * {number expression} * {number expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_GTE] (greater-than-or-equals) [length] {number expression} {number expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_GTE	TokenNameIdentifier	 OP  GTE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_GT] (greater-than) * [length] * {number expression} * {number expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_GT] (greater-than) [length] {number expression} {number expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_GT	TokenNameIdentifier	 OP  GT
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_PLUS] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_PLUS] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_PLUS	TokenNameIdentifier	 OP  PLUS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_MINUS] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_MINUS] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_MINUS	TokenNameIdentifier	 OP  MINUS
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_MULT] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_MULT] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_MULT	TokenNameIdentifier	 OP  MULT
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_DIV] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_DIV] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_DIV	TokenNameIdentifier	 OP  DIV
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_MOD] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_MOD] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_MOD	TokenNameIdentifier	 OP  MOD
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_QUO] * [length] * {number expression} * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_QUO] [length] {number expression} {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_QUO	TokenNameIdentifier	 OP  QUO
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_NEG] * [length] * {number expression} * * returns: * XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_NEG] [length] {number expression} * returns: XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_NEG	TokenNameIdentifier	 OP  NEG
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_STRING] (cast operation) * [length] * {expression} * * returns: * XString * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_STRING] (cast operation) [length] {expression} * returns: XString @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_STRING	TokenNameIdentifier	 OP  STRING
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_BOOL] (cast operation) * [length] * {expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_BOOL] (cast operation) [length] {expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_BOOL	TokenNameIdentifier	 OP  BOOL
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_NUMBER] (cast operation) * [length] * {expression} * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_NUMBER] (cast operation) [length] {expression} * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_NUMBER	TokenNameIdentifier	 OP  NUMBER
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_UNION] * [length] * {PathExpr}+ * * returns: * XNodeSet * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_UNION] [length] {PathExpr}+ * returns: XNodeSet @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_UNION	TokenNameIdentifier	 OP  UNION
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_LITERAL] * [3] * [index to token] * * returns: * XString * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_LITERAL] [3] [index to token] * returns: XString @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_LITERAL	TokenNameIdentifier	 OP  LITERAL
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The low opcode for nodesets, needed by getFirstPredicateOpPos and * getNextStepPos. */	TokenNameCOMMENT_JAVADOC	 The low opcode for nodesets, needed by getFirstPredicateOpPos and getNextStepPos. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIRST_NODESET_OP	TokenNameIdentifier	 FIRST  NODESET  OP
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_VARIABLE] * [4] * [index to namespace token, or EMPTY] * [index to function name token] * * returns: * XString * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_VARIABLE] [4] [index to namespace token, or EMPTY] [index to function name token] * returns: XString @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_VARIABLE	TokenNameIdentifier	 OP  VARIABLE
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_GROUP] * [length] * {expression} * * returns: * XNodeSet * XNumber * XString * XBoolean * XRTree * XObject * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_GROUP] [length] {expression} * returns: XNodeSet XNumber XString XBoolean XRTree XObject @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_GROUP	TokenNameIdentifier	 OP  GROUP
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_EXTFUNCTION] (Extension function.) * [length] * [index to namespace token] * [index to function name token] * {OP_ARGUMENT} * * returns: * XNodeSet * XNumber * XString * XBoolean * XRTree * XObject * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_EXTFUNCTION] (Extension function.) [length] [index to namespace token] [index to function name token] {OP_ARGUMENT} * returns: XNodeSet XNumber XString XBoolean XRTree XObject @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_EXTFUNCTION	TokenNameIdentifier	 OP  EXTFUNCTION
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_FUNCTION] * [length] * [FUNC_name] * {OP_ARGUMENT} * [ENDOP] * * returns: * XNodeSet * XNumber * XString * XBoolean * XRTree * XObject * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_FUNCTION] [length] [FUNC_name] {OP_ARGUMENT} [ENDOP] * returns: XNodeSet XNumber XString XBoolean XRTree XObject @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_FUNCTION	TokenNameIdentifier	 OP  FUNCTION
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The last opcode for stuff that can be a nodeset. */	TokenNameCOMMENT_JAVADOC	 The last opcode for stuff that can be a nodeset. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LAST_NODESET_OP	TokenNameIdentifier	 LAST  NODESET  OP
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_ARGUMENT] (Function argument.) * [length] * {expression} * * returns: * XNodeSet * XNumber * XString * XBoolean * XRTree * XObject * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_ARGUMENT] (Function argument.) [length] {expression} * returns: XNodeSet XNumber XString XBoolean XRTree XObject @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_ARGUMENT	TokenNameIdentifier	 OP  ARGUMENT
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_NUMBERLIT] (Number literal.) * [3] * [index to token] * * returns: * XString * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_NUMBERLIT] (Number literal.) [3] [index to token] * returns: XString @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_NUMBERLIT	TokenNameIdentifier	 OP  NUMBERLIT
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_LOCATIONPATH] * [length] * {FROM_stepType} * | {function} * {predicate} * [ENDOP] * * (Note that element and attribute namespaces and * names can be wildcarded '*'.) * * returns: * XNodeSet * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_LOCATIONPATH] [length] {FROM_stepType} | {function} {predicate} [ENDOP] * (Note that element and attribute namespaces and names can be wildcarded '*'.) * returns: XNodeSet @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_LOCATIONPATH	TokenNameIdentifier	 OP  LOCATIONPATH
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// public static final int LOCATIONPATHEX_MASK = 0x0000FFFF; 	TokenNameCOMMENT_LINE	public static final int LOCATIONPATHEX_MASK = 0x0000FFFF; 
// public static final int LOCATIONPATHEX_ISSIMPLE = 0x00010000; 	TokenNameCOMMENT_LINE	public static final int LOCATIONPATHEX_ISSIMPLE = 0x00010000; 
// public static final int OP_LOCATIONPATH_EX = (28 | 0x00010000); 	TokenNameCOMMENT_LINE	public static final int OP_LOCATIONPATH_EX = (28 | 0x00010000); 
/** * [OP_PREDICATE] * [length] * {expression} * [ENDOP] (For safety) * * returns: * XBoolean or XNumber * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_PREDICATE] [length] {expression} [ENDOP] (For safety) * returns: XBoolean or XNumber @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_PREDICATE	TokenNameIdentifier	 OP  PREDICATE
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_MATCHPATTERN] * [length] * {PathExpr}+ * * returns: * XNodeSet * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_MATCHPATTERN] [length] {PathExpr}+ * returns: XNodeSet @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_MATCHPATTERN	TokenNameIdentifier	 OP  MATCHPATTERN
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [OP_LOCATIONPATHPATTERN] * [length] * {FROM_stepType} * | {function}{predicate} * [ENDOP] * returns: * XNodeSet * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [OP_LOCATIONPATHPATTERN] [length] {FROM_stepType} | {function}{predicate} [ENDOP] returns: XNodeSet @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OP_LOCATIONPATHPATTERN	TokenNameIdentifier	 OP  LOCATIONPATHPATTERN
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_COMMENT] * No size or arguments. * Note: must not overlap function OP number! * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_COMMENT] No size or arguments. Note: must not overlap function OP number! * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_COMMENT	TokenNameIdentifier	 NODETYPE  COMMENT
=	TokenNameEQUAL	
1030	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_TEXT] * No size or arguments. * Note: must not overlap function OP number! * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_TEXT] No size or arguments. Note: must not overlap function OP number! * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_TEXT	TokenNameIdentifier	 NODETYPE  TEXT
=	TokenNameEQUAL	
1031	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_PI] * [index to token] * Note: must not overlap function OP number! * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_PI] [index to token] Note: must not overlap function OP number! * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
=	TokenNameEQUAL	
1032	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_NODE] * No size or arguments. * Note: must not overlap function OP number! * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_NODE] No size or arguments. Note: must not overlap function OP number! * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
=	TokenNameEQUAL	
1033	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODENAME] * [index to ns token or EMPTY] * [index to name token] * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODENAME] [index to ns token or EMPTY] [index to name token] * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODENAME	TokenNameIdentifier	 NODENAME
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_ROOT] * No size or arguments. * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_ROOT] No size or arguments. * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_ROOT	TokenNameIdentifier	 NODETYPE  ROOT
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_ANY] * No size or arguments. * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_ANY] No size or arguments. * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_ANYELEMENT	TokenNameIdentifier	 NODETYPE  ANYELEMENT
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [NODETYPE_ANY] * No size or arguments. * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [NODETYPE_ANY] No size or arguments. * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NODETYPE_FUNCTEST	TokenNameIdentifier	 NODETYPE  FUNCTEST
=	TokenNameEQUAL	
1034	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [FROM_stepType] * [length, including predicates] * [length of just the step, without the predicates] * {node test} * {predicates}? * * returns: * XBoolean * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 [FROM_stepType] [length, including predicates] [length of just the step, without the predicates] {node test} {predicates}? * returns: XBoolean @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AXES_START_TYPES	TokenNameIdentifier	 AXES  START  TYPES
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ancestor axes opcode. */	TokenNameCOMMENT_JAVADOC	 ancestor axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_ANCESTORS	TokenNameIdentifier	 FROM  ANCESTORS
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ancestor-or-self axes opcode. */	TokenNameCOMMENT_JAVADOC	 ancestor-or-self axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_ANCESTORS_OR_SELF	TokenNameIdentifier	 FROM  ANCESTORS  OR  SELF
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** attribute axes opcode. */	TokenNameCOMMENT_JAVADOC	 attribute axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_ATTRIBUTES	TokenNameIdentifier	 FROM  ATTRIBUTES
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** children axes opcode. */	TokenNameCOMMENT_JAVADOC	 children axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_CHILDREN	TokenNameIdentifier	 FROM  CHILDREN
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** descendants axes opcode. */	TokenNameCOMMENT_JAVADOC	 descendants axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_DESCENDANTS	TokenNameIdentifier	 FROM  DESCENDANTS
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** descendants-of-self axes opcode. */	TokenNameCOMMENT_JAVADOC	 descendants-of-self axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** following axes opcode. */	TokenNameCOMMENT_JAVADOC	 following axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_FOLLOWING	TokenNameIdentifier	 FROM  FOLLOWING
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** following-siblings axes opcode. */	TokenNameCOMMENT_JAVADOC	 following-siblings axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_FOLLOWING_SIBLINGS	TokenNameIdentifier	 FROM  FOLLOWING  SIBLINGS
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** parent axes opcode. */	TokenNameCOMMENT_JAVADOC	 parent axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_PARENT	TokenNameIdentifier	 FROM  PARENT
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** preceding axes opcode. */	TokenNameCOMMENT_JAVADOC	 preceding axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_PRECEDING	TokenNameIdentifier	 FROM  PRECEDING
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** preceding-sibling axes opcode. */	TokenNameCOMMENT_JAVADOC	 preceding-sibling axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_PRECEDING_SIBLINGS	TokenNameIdentifier	 FROM  PRECEDING  SIBLINGS
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** self axes opcode. */	TokenNameCOMMENT_JAVADOC	 self axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_SELF	TokenNameIdentifier	 FROM  SELF
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** namespace axes opcode. */	TokenNameCOMMENT_JAVADOC	 namespace axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_NAMESPACE	TokenNameIdentifier	 FROM  NAMESPACE
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** '/' axes opcode. */	TokenNameCOMMENT_JAVADOC	 '/' axes opcode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FROM_ROOT	TokenNameIdentifier	 FROM  ROOT
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * For match patterns. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 For match patterns. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCH_ATTRIBUTE	TokenNameIdentifier	 MATCH  ATTRIBUTE
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * For match patterns. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 For match patterns. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCH_ANY_ANCESTOR	TokenNameIdentifier	 MATCH  ANY  ANCESTOR
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * For match patterns. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 For match patterns. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCH_IMMEDIATE_ANCESTOR	TokenNameIdentifier	 MATCH  IMMEDIATE  ANCESTOR
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The end of the axes types. */	TokenNameCOMMENT_JAVADOC	 The end of the axes types. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AXES_END_TYPES	TokenNameIdentifier	 AXES  END  TYPES
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The next free ID. Please keep this up to date. */	TokenNameCOMMENT_JAVADOC	 The next free ID. Please keep this up to date. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NEXT_FREE_ID	TokenNameIdentifier	 NEXT  FREE  ID
=	TokenNameEQUAL	
99	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
