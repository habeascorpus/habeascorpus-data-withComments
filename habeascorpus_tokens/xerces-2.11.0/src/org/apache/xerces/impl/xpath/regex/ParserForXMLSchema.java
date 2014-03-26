/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * A regular expression parser for the XML Schema. * * @xerces.internal * * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; * @version $Id: ParserForXMLSchema.java 831926 2009-11-02 15:38:53Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 A regular expression parser for the XML Schema. * @xerces.internal * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; @version $Id: ParserForXMLSchema.java 831926 2009-11-02 15:38:53Z knoaman $ 
class	TokenNameclass	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
extends	TokenNameextends	
RegexParser	TokenNameIdentifier	 Regex Parser
{	TokenNameLBRACE	
public	TokenNamepublic	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this.setLocale(Locale.getDefault()); 	TokenNameCOMMENT_LINE	this.setLocale(Locale.getDefault()); 
}	TokenNameRBRACE	
public	TokenNamepublic	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processCaret	TokenNameIdentifier	 process Caret
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processDollar	TokenNameIdentifier	 process Dollar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processLookahead	TokenNameIdentifier	 process Lookahead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processNegativelookahead	TokenNameIdentifier	 process Negativelookahead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processLookbehind	TokenNameIdentifier	 process Lookbehind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processNegativelookbehind	TokenNameIdentifier	 process Negativelookbehind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_A	TokenNameIdentifier	 process Backsolidus  A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_Z	TokenNameIdentifier	 process Backsolidus  Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_z	TokenNameIdentifier	 process Backsolidus z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_b	TokenNameIdentifier	 process Backsolidus b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_B	TokenNameIdentifier	 process Backsolidus  B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_lt	TokenNameIdentifier	 process Backsolidus lt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_gt	TokenNameIdentifier	 process Backsolidus gt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processStar	TokenNameIdentifier	 process Star
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processPlus	TokenNameIdentifier	 process Plus
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// X+ -> XX* 	TokenNameCOMMENT_LINE	X+ -> XX* 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processQuestion	TokenNameIdentifier	 process Question
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// X? -> X| 	TokenNameCOMMENT_LINE	X? -> X| 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
par	TokenNameIdentifier	 par
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createEmpty	TokenNameIdentifier	 create Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
par	TokenNameIdentifier	 par
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
checkQuestion	TokenNameIdentifier	 check Question
(	TokenNameLPAREN	
int	TokenNameint	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processParen	TokenNameIdentifier	 process Paren
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createParen	TokenNameIdentifier	 create Paren
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_RPAREN	TokenNameIdentifier	 T  RPAREN
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.1"	TokenNameStringLiteral	parser.factor.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skips ')' 	TokenNameCOMMENT_LINE	Skips ')' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processParen2	TokenNameIdentifier	 process Paren2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processCondition	TokenNameIdentifier	 process Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processModifiers	TokenNameIdentifier	 process Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processIndependent	TokenNameIdentifier	 process Independent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_c	TokenNameIdentifier	 process Backsolidus c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_C	TokenNameIdentifier	 process Backsolidus  C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
'C'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_i	TokenNameIdentifier	 process Backsolidus i
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_I	TokenNameIdentifier	 process Backsolidus  I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
'I'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_g	TokenNameIdentifier	 process Backsolidus g
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_X	TokenNameIdentifier	 process Backsolidus  X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBackreference	TokenNameIdentifier	 process Backreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
processCIinCharacterClass	TokenNameIdentifier	 process C Iin Character Class
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a character-class-expression, not a character-class-escape. * * c-c-expression ::= '[' c-group ']' * c-group ::= positive-c-group | negative-c-group | c-c-subtraction * positive-c-group ::= (c-range | c-c-escape)+ * negative-c-group ::= '^' positive-c-group * c-c-subtraction ::= (positive-c-group | negative-c-group) subtraction * subtraction ::= '-' c-c-expression * c-range ::= single-range | from-to-range * single-range ::= multi-c-escape | category-c-escape | block-c-escape | &lt;any XML char&gt; * cc-normal-c ::= &lt;any character except [, ], \&gt; * from-to-range ::= cc-normal-c '-' cc-normal-c * * @param useNrage Ignored. * @return This returns no NrageToken. */	TokenNameCOMMENT_JAVADOC	 Parses a character-class-expression, not a character-class-escape. * c-c-expression ::= '[' c-group ']' c-group ::= positive-c-group | negative-c-group | c-c-subtraction positive-c-group ::= (c-range | c-c-escape)+ negative-c-group ::= '^' positive-c-group c-c-subtraction ::= (positive-c-group | negative-c-group) subtraction subtraction ::= '-' c-c-expression c-range ::= single-range | from-to-range single-range ::= multi-c-escape | category-c-escape | block-c-escape | &lt;any XML char&gt; cc-normal-c ::= &lt;any character except [, ], \&gt; from-to-range ::= cc-normal-c '-' cc-normal-c * @param useNrage Ignored. @return This returns no NrageToken. 
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
parseCharacterClass	TokenNameIdentifier	 parse Character Class
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useNrange	TokenNameIdentifier	 use Nrange
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setContext	TokenNameIdentifier	 set Context
(	TokenNameLPAREN	
S_INBRACKETS	TokenNameIdentifier	 S  INBRACKETS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// '[' 	TokenNameCOMMENT_LINE	'[' 
boolean	TokenNameboolean	
nrange	TokenNameIdentifier	 nrange
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
wasDecoded	TokenNameIdentifier	 was Decoded
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// used to detect if the last - was escaped. 	TokenNameCOMMENT_LINE	used to detect if the last - was escaped. 
RangeToken	TokenNameIdentifier	 Range Token
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nrange	TokenNameIdentifier	 nrange
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// '^' 	TokenNameCOMMENT_LINE	'^' 
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstloop	TokenNameIdentifier	 firstloop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't use 'cotinue' for this loop. 	TokenNameCOMMENT_LINE	Don't use 'cotinue' for this loop. 
wasDecoded	TokenNameIdentifier	 was Decoded
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// single-range | from-to-range | subtraction 	TokenNameCOMMENT_LINE	single-range | from-to-range | subtraction 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
firstloop	TokenNameIdentifier	 firstloop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nrange	TokenNameIdentifier	 nrange
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'w'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'W'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processCIinCharacterClass	TokenNameIdentifier	 process C Iin Character Class
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
pstart	TokenNameIdentifier	 pstart
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
tok2	TokenNameIdentifier	 tok2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_pP	TokenNameIdentifier	 process Backsolidus p P
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok2	TokenNameIdentifier	 tok2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.5"	TokenNameStringLiteral	parser.atom.5
,	TokenNameCOMMA	
pstart	TokenNameIdentifier	 pstart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
tok2	TokenNameIdentifier	 tok2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wasDecoded	TokenNameIdentifier	 was Decoded
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// \ + c 	TokenNameCOMMENT_LINE	\ + c 
}	TokenNameRBRACE	
// backsolidus 	TokenNameCOMMENT_LINE	backsolidus 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_XMLSCHEMA_CC_SUBTRACTION	TokenNameIdentifier	 T  XMLSCHEMA  CC  SUBTRACTION
&&	TokenNameAND_AND	
!	TokenNameNOT	
firstloop	TokenNameIdentifier	 firstloop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Subraction 	TokenNameCOMMENT_LINE	Subraction 
if	TokenNameif	
(	TokenNameLPAREN	
nrange	TokenNameIdentifier	 nrange
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseCharacterClass	TokenNameIdentifier	 parse Character Class
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.5"	TokenNameStringLiteral	parser.cc.5
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Exit this loop 	TokenNameCOMMENT_LINE	Exit this loop 
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if not shorthands... 	TokenNameCOMMENT_LINE	if not shorthands... 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.6"	TokenNameStringLiteral	parser.cc.6
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.7"	TokenNameStringLiteral	parser.cc.7
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
firstloop	TokenNameIdentifier	 firstloop
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.8"	TokenNameStringLiteral	parser.cc.8
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if regex = '[-]' then invalid 	TokenNameCOMMENT_LINE	if regex = '[-]' then invalid 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
firstloop	TokenNameIdentifier	 firstloop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here is no '-'. 	TokenNameCOMMENT_LINE	Here is no '-'. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addCaseInsensitiveChar	TokenNameIdentifier	 add Case Insensitive Char
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Found '-' 	TokenNameCOMMENT_LINE	Found '-' 
// Is this '-' is a from-to token?? 	TokenNameCOMMENT_LINE	Is this '-' is a from-to token?? 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skips '-' 	TokenNameCOMMENT_LINE	Skips '-' 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.2"	TokenNameStringLiteral	parser.cc.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// c '-' ']' -> '-' is a single-range. 	TokenNameCOMMENT_LINE	c '-' ']' -> '-' is a single-range. 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if - is at the last position of the group 	TokenNameCOMMENT_LINE	if - is at the last position of the group 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addCaseInsensitiveChar	TokenNameIdentifier	 add Case Insensitive Char
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_XMLSCHEMA_CC_SUBTRACTION	TokenNameIdentifier	 T  XMLSCHEMA  CC  SUBTRACTION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.8"	TokenNameStringLiteral	parser.cc.8
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
rangeend	TokenNameIdentifier	 rangeend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rangeend	TokenNameIdentifier	 rangeend
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.6"	TokenNameStringLiteral	parser.cc.6
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rangeend	TokenNameIdentifier	 rangeend
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.7"	TokenNameStringLiteral	parser.cc.7
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rangeend	TokenNameIdentifier	 rangeend
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.8"	TokenNameStringLiteral	parser.cc.8
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
)	TokenNameRPAREN	
rangeend	TokenNameIdentifier	 rangeend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
rangeend	TokenNameIdentifier	 rangeend
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.ope.3"	TokenNameStringLiteral	parser.ope.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rangeend	TokenNameIdentifier	 rangeend
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
rangeend	TokenNameIdentifier	 rangeend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addCaseInsensitiveCharRange	TokenNameIdentifier	 add Case Insensitive Char Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
rangeend	TokenNameIdentifier	 rangeend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
firstloop	TokenNameIdentifier	 firstloop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.2"	TokenNameStringLiteral	parser.cc.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//tok.dumpRanges(); 	TokenNameCOMMENT_LINE	tok.dumpRanges(); 
this	TokenNamethis	
.	TokenNameDOT	
setContext	TokenNameIdentifier	 set Context
(	TokenNameLPAREN	
S_NORMAL	TokenNameIdentifier	 S  NORMAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skips ']' 	TokenNameCOMMENT_LINE	Skips ']' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
parseSetOperations	TokenNameIdentifier	 parse Set Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'w'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isWord"	TokenNameStringLiteral	xml:isWord
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'W'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isWord"	TokenNameStringLiteral	xml:isWord
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isSpace"	TokenNameStringLiteral	xml:isSpace
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isSpace"	TokenNameStringLiteral	xml:isSpace
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isNameChar"	TokenNameStringLiteral	xml:isNameChar
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isNameChar"	TokenNameStringLiteral	xml:isNameChar
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isInitialNameChar"	TokenNameStringLiteral	xml:isInitialNameChar
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"xml:isInitialNameChar"	TokenNameStringLiteral	xml:isInitialNameChar
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: shorthands: \u"	TokenNameStringLiteral	Internal Error: shorthands: \u
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.1"	TokenNameStringLiteral	parser.next.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// LINE FEED U+000A 	TokenNameCOMMENT_LINE	LINE FEED U+000A 
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\r'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// CRRIAGE RETURN U+000D 	TokenNameCOMMENT_LINE	CRRIAGE RETURN U+000D 
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// HORIZONTAL TABULATION U+0009 	TokenNameCOMMENT_LINE	HORIZONTAL TABULATION U+0009 
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'^'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'}'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// return actucal char 	TokenNameCOMMENT_LINE	return actucal char 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.process.1"	TokenNameStringLiteral	parser.process.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
ranges2	TokenNameIdentifier	 ranges2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
SPACES	TokenNameIdentifier	 SPACES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isSpace"	TokenNameStringLiteral	xml:isSpace
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isSpace"	TokenNameStringLiteral	xml:isSpace
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
DIGITS	TokenNameIdentifier	 DIGITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
DIGITS	TokenNameIdentifier	 DIGITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
LETTERS	TokenNameIdentifier	 LETTERS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"xml:isDigit"	TokenNameStringLiteral	xml:isDigit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isWord"	TokenNameStringLiteral	xml:isWord
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isWord"	TokenNameStringLiteral	xml:isWord
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
NAMECHARS	TokenNameIdentifier	 NAMECHARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isNameChar"	TokenNameStringLiteral	xml:isNameChar
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isNameChar"	TokenNameStringLiteral	xml:isNameChar
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
LETTERS	TokenNameIdentifier	 LETTERS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isInitialNameChar"	TokenNameStringLiteral	xml:isInitialNameChar
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml:isInitialNameChar"	TokenNameStringLiteral	xml:isInitialNameChar
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
positive	TokenNameIdentifier	 positive
?	TokenNameQUESTION	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
ranges2	TokenNameIdentifier	 ranges2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
setupRange	TokenNameIdentifier	 setup Range
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SPACES	TokenNameIdentifier	 SPACES
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMECHARS	TokenNameIdentifier	 NAMECHARS
=	TokenNameEQUAL	
"-.0:AZ__azááË…"	TokenNameStringLiteral	-.0:AZ__azááË…
+	TokenNamePLUS	
"¯š¿õ??????????"	TokenNameStringLiteral	¯š¿õ??????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LETTERS	TokenNameIdentifier	 LETTERS
=	TokenNameEQUAL	
"AZazË…¯š¿õ????"	TokenNameStringLiteral	AZazË…¯š¿õ????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DIGITS	TokenNameIdentifier	 DIGITS
=	TokenNameEQUAL	
"09????????????"	TokenNameStringLiteral	09????????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
