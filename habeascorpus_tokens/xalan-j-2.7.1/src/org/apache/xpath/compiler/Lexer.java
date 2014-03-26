/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Lexer.java 524810 2007-04-02 15:51:55Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: Lexer.java 524810 2007-04-02 15:51:55Z zongaro $ 
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class is in charge of lexical processing of the XPath * expression into tokens. */	TokenNameCOMMENT_JAVADOC	 This class is in charge of lexical processing of the XPath expression into tokens. 
class	TokenNameclass	
Lexer	TokenNameIdentifier	 Lexer
{	TokenNameLBRACE	
/** * The target XPath. */	TokenNameCOMMENT_JAVADOC	 The target XPath. 
private	TokenNameprivate	
Compiler	TokenNameIdentifier	 Compiler
m_compiler	TokenNameIdentifier	 m compiler
;	TokenNameSEMICOLON	
/** * The prefix resolver to map prefixes to namespaces in the XPath. */	TokenNameCOMMENT_JAVADOC	 The prefix resolver to map prefixes to namespaces in the XPath. 
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
m_namespaceContext	TokenNameIdentifier	 m namespace Context
;	TokenNameSEMICOLON	
/** * The XPath processor object. */	TokenNameCOMMENT_JAVADOC	 The XPath processor object. 
XPathParser	TokenNameIdentifier	 X Path Parser
m_processor	TokenNameIdentifier	 m processor
;	TokenNameSEMICOLON	
/** * This value is added to each element name in the TARGETEXTRA * that is a 'target' (right-most top-level element name). */	TokenNameCOMMENT_JAVADOC	 This value is added to each element name in the TARGETEXTRA that is a 'target' (right-most top-level element name). 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TARGETEXTRA	TokenNameIdentifier	 TARGETEXTRA
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Ignore this, it is going away. * This holds a map to the m_tokenQueue that tells where the top-level elements are. * It is used for pattern matching so the m_tokenQueue can be walked backwards. * Each element that is a 'target', (right-most top level element name) has * TARGETEXTRA added to it. * */	TokenNameCOMMENT_JAVADOC	 Ignore this, it is going away. This holds a map to the m_tokenQueue that tells where the top-level elements are. It is used for pattern matching so the m_tokenQueue can be walked backwards. Each element that is a 'target', (right-most top level element name) has TARGETEXTRA added to it. 
private	TokenNameprivate	
int	TokenNameint	
m_patternMap	TokenNameIdentifier	 m pattern Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Ignore this, it is going away. * The number of elements that m_patternMap maps; */	TokenNameCOMMENT_JAVADOC	 Ignore this, it is going away. The number of elements that m_patternMap maps; 
private	TokenNameprivate	
int	TokenNameint	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
;	TokenNameSEMICOLON	
/** * Create a Lexer object. * * @param compiler The owning compiler for this lexer. * @param resolver The prefix resolver for mapping qualified name prefixes * to namespace URIs. * @param xpathProcessor The parser that is processing strings to opcodes. */	TokenNameCOMMENT_JAVADOC	 Create a Lexer object. * @param compiler The owning compiler for this lexer. @param resolver The prefix resolver for mapping qualified name prefixes to namespace URIs. @param xpathProcessor The parser that is processing strings to opcodes. 
Lexer	TokenNameIdentifier	 Lexer
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
XPathParser	TokenNameIdentifier	 X Path Parser
xpathProcessor	TokenNameIdentifier	 xpath Processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_compiler	TokenNameIdentifier	 m compiler
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
m_processor	TokenNameIdentifier	 m processor
=	TokenNameEQUAL	
xpathProcessor	TokenNameIdentifier	 xpath Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Walk through the expression and build a token queue, and a map of the top-level * elements. * @param pat XSLT Expression. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Walk through the expression and build a token queue, and a map of the top-level elements. @param pat XSLT Expression. * @throws javax.xml.transform.TransformerException 
void	TokenNamevoid	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Walk through the expression and build a token queue, and a map of the top-level * elements. * @param pat XSLT Expression. * @param targetStrings Vector to hold Strings, may be null. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Walk through the expression and build a token queue, and a map of the top-level elements. @param pat XSLT Expression. @param targetStrings Vector to hold Strings, may be null. * @throws javax.xml.transform.TransformerException 
void	TokenNamevoid	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
m_currentPattern	TokenNameIdentifier	 m current Pattern
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
;	TokenNameSEMICOLON	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// This needs to grow too. Use a conservative estimate that the OpMapVector 	TokenNameCOMMENT_LINE	This needs to grow too. Use a conservative estimate that the OpMapVector 
// needs about five time the length of the input path expression - to a 	TokenNameCOMMENT_LINE	needs about five time the length of the input path expression - to a 
// maximum of MAXTOKENQUEUESIZE*5. If the OpMapVector needs to grow, grow 	TokenNameCOMMENT_LINE	maximum of MAXTOKENQUEUESIZE*5. If the OpMapVector needs to grow, grow 
// it freely (second argument to constructor). 	TokenNameCOMMENT_LINE	it freely (second argument to constructor). 
int	TokenNameint	
initTokQueueSize	TokenNameIdentifier	 init Tok Queue Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAXTOKENQUEUESIZE	TokenNameIdentifier	 MAXTOKENQUEUESIZE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAXTOKENQUEUESIZE	TokenNameIdentifier	 MAXTOKENQUEUESIZE
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
m_opMap	TokenNameIdentifier	 m op Map
=	TokenNameEQUAL	
new	TokenNamenew	
OpMapVector	TokenNameIdentifier	 Op Map Vector
(	TokenNameLPAREN	
initTokQueueSize	TokenNameIdentifier	 init Tok Queue Size
,	TokenNameCOMMA	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
BLOCKTOKENQUEUESIZE	TokenNameIdentifier	 BLOCKTOKENQUEUESIZE
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Nesting of '[' so we can know if the given element should be 	TokenNameCOMMENT_LINE	Nesting of '[' so we can know if the given element should be 
// counted inside the m_patternMap. 	TokenNameCOMMENT_LINE	counted inside the m_patternMap. 
int	TokenNameint	
nesting	TokenNameIdentifier	 nesting
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// char[] chars = pat.toCharArray(); 	TokenNameCOMMENT_LINE	char[] chars = pat.toCharArray(); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nChars	TokenNameIdentifier	 n Chars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_DOUBLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  DOUBLE  QUOTE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"misquoted literal... expected double quote!"); 	TokenNameCOMMENT_LINE	"misquoted literal... expected double quote!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_SINGLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  SINGLE  QUOTE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"misquoted literal... expected single quote!"); 	TokenNameCOMMENT_LINE	"misquoted literal... expected single quote!"); 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x0A	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x0D	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'@'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// fall-through on purpose 	TokenNameCOMMENT_LINE	fall-through on purpose 
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
isNum	TokenNameIdentifier	 is Num
||	TokenNameOR_OR	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fall-through on purpose 	TokenNameCOMMENT_LINE	fall-through on purpose 
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'='	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Unused at the moment 	TokenNameCOMMENT_LINE	Unused at the moment 
case	TokenNamecase	
'^'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Unused at the moment 	TokenNameCOMMENT_LINE	Unused at the moment 
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Unused at the moment 	TokenNameCOMMENT_LINE	Unused at the moment 
case	TokenNamecase	
'$'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
nesting	TokenNameIdentifier	 nesting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recordTokenString	TokenNameIdentifier	 record Token String
(	TokenNameLPAREN	
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nesting	TokenNameIdentifier	 nesting
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nesting	TokenNameIdentifier	 nesting
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
':'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
<	TokenNameLESS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isAttrName	TokenNameIdentifier	 is Attr Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// fall through on purpose 	TokenNameCOMMENT_LINE	fall through on purpose 
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
startSubstring	TokenNameIdentifier	 start Substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startSubstring	TokenNameIdentifier	 start Substring
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isNum	TokenNameIdentifier	 is Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNum	TokenNameIdentifier	 is Num
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
=	TokenNameEQUAL	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
isStartOfPat	TokenNameIdentifier	 is Start Of Pat
,	TokenNameCOMMA	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
.	TokenNameDOT	
handlesNullPrefixes	TokenNameIdentifier	 handles Null Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
=	TokenNameEQUAL	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
nChars	TokenNameIdentifier	 n Chars
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EMPTY_EXPRESSION	TokenNameIdentifier	 ER  EMPTY  EXPRESSION
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Empty expression!"); 	TokenNameCOMMENT_LINE	"Empty expression!"); 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recordTokenString	TokenNameIdentifier	 record Token String
(	TokenNameLPAREN	
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_queueMark	TokenNameIdentifier	 m queue Mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Record the current position on the token queue as long as * this is a top-level element. Must be called before the * next token is added to the m_tokenQueue. * * @param nesting The nesting count for the pattern element. * @param isStart true if this is the start of a pattern. * @param isAttrName true if we have determined that this is an attribute name. * * @return true if this is the start of a pattern. */	TokenNameCOMMENT_JAVADOC	 Record the current position on the token queue as long as this is a top-level element. Must be called before the next token is added to the m_tokenQueue. * @param nesting The nesting count for the pattern element. @param isStart true if this is the start of a pattern. @param isAttrName true if we have determined that this is an attribute name. * @return true if this is the start of a pattern. 
private	TokenNameprivate	
boolean	TokenNameboolean	
mapPatternElemPos	TokenNameIdentifier	 map Pattern Elem Pos
(	TokenNameLPAREN	
int	TokenNameint	
nesting	TokenNameIdentifier	 nesting
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isStart	TokenNameIdentifier	 is Start
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isAttrName	TokenNameIdentifier	 is Attr Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
nesting	TokenNameIdentifier	 nesting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
>=	TokenNameGREATER_EQUAL	
m_patternMap	TokenNameIdentifier	 m pattern Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
patternMap	TokenNameIdentifier	 pattern Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_patternMap	TokenNameIdentifier	 m pattern Map
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
m_patternMap	TokenNameIdentifier	 m pattern Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
m_patternMap	TokenNameIdentifier	 m pattern Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
+	TokenNamePLUS	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
patternMap	TokenNameIdentifier	 pattern Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_patternMap	TokenNameIdentifier	 m pattern Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isStart	TokenNameIdentifier	 is Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_patternMap	TokenNameIdentifier	 m pattern Map
[	TokenNameLBRACKET	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
TARGETEXTRA	TokenNameIdentifier	 TARGETEXTRA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_patternMap	TokenNameIdentifier	 m pattern Map
[	TokenNameLBRACKET	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
isAttrName	TokenNameIdentifier	 is Attr Name
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TARGETEXTRA	TokenNameIdentifier	 TARGETEXTRA
;	TokenNameSEMICOLON	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
isStart	TokenNameIdentifier	 is Start
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isStart	TokenNameIdentifier	 is Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a map pos, return the corresponding token queue pos. * * @param i The index in the m_patternMap. * * @return the token queue position. */	TokenNameCOMMENT_JAVADOC	 Given a map pos, return the corresponding token queue pos. * @param i The index in the m_patternMap. * @return the token queue position. 
private	TokenNameprivate	
int	TokenNameint	
getTokenQueuePosFromMap	TokenNameIdentifier	 get Token Queue Pos From Map
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
m_patternMap	TokenNameIdentifier	 m pattern Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
TARGETEXTRA	TokenNameIdentifier	 TARGETEXTRA
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
TARGETEXTRA	TokenNameIdentifier	 TARGETEXTRA
)	TokenNameRPAREN	
:	TokenNameCOLON	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset token queue mark and m_token to a * given position. * @param mark The new position. */	TokenNameCOMMENT_JAVADOC	 Reset token queue mark and m_token to a given position. @param mark The new position. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
resetTokenMark	TokenNameIdentifier	 reset Token Mark
(	TokenNameLPAREN	
int	TokenNameint	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
qsz	TokenNameIdentifier	 qsz
=	TokenNameEQUAL	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_queueMark	TokenNameIdentifier	 m queue Mark
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
<=	TokenNameLESS_EQUAL	
qsz	TokenNameIdentifier	 qsz
)	TokenNameRPAREN	
?	TokenNameQUESTION	
mark	TokenNameIdentifier	 mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_queueMark	TokenNameIdentifier	 m queue Mark
<	TokenNameLESS	
qsz	TokenNameIdentifier	 qsz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueue	TokenNameIdentifier	 get Token Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_queueMark	TokenNameIdentifier	 m queue Mark
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a string, return the corresponding keyword token. * * @param key The keyword. * * @return An opcode value. */	TokenNameCOMMENT_JAVADOC	 Given a string, return the corresponding keyword token. * @param key The keyword. * @return An opcode value. 
final	TokenNamefinal	
int	TokenNameint	
getKeywordToken	TokenNameIdentifier	 get Keyword Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
itok	TokenNameIdentifier	 itok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
getKeyWord	TokenNameIdentifier	 get Key Word
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
itok	TokenNameIdentifier	 itok
)	TokenNameRPAREN	
?	TokenNameQUESTION	
itok	TokenNameIdentifier	 itok
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
cce	TokenNameIdentifier	 cce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Record the current token in the passed vector. * * @param targetStrings Vector of string. */	TokenNameCOMMENT_JAVADOC	 Record the current token in the passed vector. * @param targetStrings Vector of string. 
private	TokenNameprivate	
void	TokenNamevoid	
recordTokenString	TokenNameIdentifier	 record Token String
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
targetStrings	TokenNameIdentifier	 target Strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tokPos	TokenNameIdentifier	 tok Pos
=	TokenNameEQUAL	
getTokenQueuePosFromMap	TokenNameIdentifier	 get Token Queue Pos From Map
(	TokenNameLPAREN	
m_patternMapSize	TokenNameIdentifier	 m pattern Map Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetTokenMark	TokenNameIdentifier	 reset Token Mark
(	TokenNameLPAREN	
tokPos	TokenNameIdentifier	 tok Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
getKeywordToken	TokenNameIdentifier	 get Keyword Token
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_COMMENT	TokenNameIdentifier	 NODETYPE  COMMENT
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_COMMENT	TokenNameIdentifier	 PSEUDONAME  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_TEXT	TokenNameIdentifier	 NODETYPE  TEXT
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_TEXT	TokenNameIdentifier	 PSEUDONAME  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_ROOT	TokenNameIdentifier	 NODETYPE  ROOT
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ROOT	TokenNameIdentifier	 PSEUDONAME  ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_ANYELEMENT	TokenNameIdentifier	 NODETYPE  ANYELEMENT
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ANY	TokenNameIdentifier	 PSEUDONAME  ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokPos	TokenNameIdentifier	 tok Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
resetTokenMark	TokenNameIdentifier	 reset Token Mark
(	TokenNameLPAREN	
tokPos	TokenNameIdentifier	 tok Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokPos	TokenNameIdentifier	 tok Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
targetStrings	TokenNameIdentifier	 target Strings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueue	TokenNameIdentifier	 get Token Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
tokPos	TokenNameIdentifier	 tok Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a token to the token queue. * * * @param s The token. */	TokenNameCOMMENT_JAVADOC	 Add a token to the token queue. * @param s The token. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_compiler	TokenNameIdentifier	 m compiler
.	TokenNameDOT	
getTokenQueue	TokenNameIdentifier	 get Token Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When a seperator token is found, see if there's a element name or * the like to map. * * @param pat The XPath name string. * @param startSubstring The start of the name string. * @param posOfNSSep The position of the namespace seperator (':'). * @param posOfScan The end of the name index. * * @throws javax.xml.transform.TransformerException * * @return -1 always. */	TokenNameCOMMENT_JAVADOC	 When a seperator token is found, see if there's a element name or the like to map. * @param pat The XPath name string. @param startSubstring The start of the name string. @param posOfNSSep The position of the namespace seperator (':'). @param posOfScan The end of the name index. * @throws javax.xml.transform.TransformerException * @return -1 always. 
private	TokenNameprivate	
int	TokenNameint	
mapNSTokens	TokenNameIdentifier	 map NS Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
,	TokenNameCOMMA	
int	TokenNameint	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
int	TokenNameint	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
,	TokenNameCOMMA	
int	TokenNameint	
posOfScan	TokenNameIdentifier	 pos Of Scan
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startSubstring	TokenNameIdentifier	 start Substring
,	TokenNameCOMMA	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
uName	TokenNameIdentifier	 u Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
uName	TokenNameIdentifier	 u Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
)	TokenNameRPAREN	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume last was wildcard. This is not legal according 	TokenNameCOMMENT_LINE	Assume last was wildcard. This is not legal according 
// to the draft. Set the below to true to make namespace 	TokenNameCOMMENT_LINE	to the draft. Set the below to true to make namespace 
// wildcards work. 	TokenNameCOMMENT_LINE	wildcards work. 
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
posOfScan	TokenNameIdentifier	 pos Of Scan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uName	TokenNameIdentifier	 u Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
)	TokenNameRPAREN	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
cce	TokenNameIdentifier	 cce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uName	TokenNameIdentifier	 u Name
=	TokenNameEQUAL	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uName	TokenNameIdentifier	 u Name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
uName	TokenNameIdentifier	 u Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
uName	TokenNameIdentifier	 u Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
uName	TokenNameIdentifier	 u Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
posOfNSSep	TokenNameIdentifier	 pos Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
posOfScan	TokenNameIdentifier	 pos Of Scan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
addToTokenQueue	TokenNameIdentifier	 add To Token Queue
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// To older XPath code it doesn't matter if 	TokenNameCOMMENT_LINE	To older XPath code it doesn't matter if 
// error() is called or errorForDOM3(). 	TokenNameCOMMENT_LINE	error() is called or errorForDOM3(). 
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
errorForDOM3	TokenNameIdentifier	 error For DO M3
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Prefix must resolve to a namespace: {0}"; 	TokenNameCOMMENT_LINE	"Prefix must resolve to a namespace: {0}"; 
/** old code commented out 17-Sep-2004 // error("Could not locate namespace for prefix: "+prefix); // m_processor.error(XPATHErrorResources.ER_PREFIX_MUST_RESOLVE, // new String[] {prefix}); //"Prefix must resolve to a namespace: {0}"; */	TokenNameCOMMENT_JAVADOC	 old code commented out 17-Sep-2004 // error("Could not locate namespace for prefix: "+prefix); // m_processor.error(XPATHErrorResources.ER_PREFIX_MUST_RESOLVE, // new String[] {prefix}); //"Prefix must resolve to a namespace: {0}"; 
/*** Old code commented out 10-Jan-2001 addToTokenQueue(prefix); addToTokenQueue(":"); String s = pat.substring(posOfNSSep + 1, posOfScan); if (s.length() > 0) addToTokenQueue(s); ***/	TokenNameCOMMENT_JAVADOC	* Old code commented out 10-Jan-2001 addToTokenQueue(prefix); addToTokenQueue(":"); String s = pat.substring(posOfNSSep + 1, posOfScan); if (s.length() > 0) addToTokenQueue(s); **
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
