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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * This class represents a node in parse tree. * * @xerces.internal * * @version $Id: Token.java 831926 2009-11-02 15:38:53Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. * @xerces.internal * @version $Id: Token.java 831926 2009-11-02 15:38:53Z knoaman $ 
class	TokenNameclass	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8484976002585487481L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR	TokenNameIdentifier	 CHAR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Literal char 	TokenNameCOMMENT_LINE	Literal char 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOT	TokenNameIdentifier	 DOT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// . 	TokenNameCOMMENT_LINE	. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONCAT	TokenNameIdentifier	 CONCAT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// XY 	TokenNameCOMMENT_LINE	XY 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNION	TokenNameIdentifier	 UNION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X|Y|Z 	TokenNameCOMMENT_LINE	X|Y|Z 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSURE	TokenNameIdentifier	 CLOSURE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X* 	TokenNameCOMMENT_LINE	X* 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RANGE	TokenNameIdentifier	 RANGE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// [a-zA-Z] etc. 	TokenNameCOMMENT_LINE	[a-zA-Z] etc. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NRANGE	TokenNameIdentifier	 NRANGE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// [^a-zA-Z] etc. 	TokenNameCOMMENT_LINE	[^a-zA-Z] etc. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAREN	TokenNameIdentifier	 PAREN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (X) or (?:X) 	TokenNameCOMMENT_LINE	(X) or (?:X) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCHOR	TokenNameIdentifier	 ANCHOR
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ^ $ \b \B \< \> \A \Z \z 	TokenNameCOMMENT_LINE	^ $ \b \B \< \> \A \Z \z 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// *? +? 	TokenNameCOMMENT_LINE	*? +? 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// strings 	TokenNameCOMMENT_LINE	strings 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// back references 	TokenNameCOMMENT_LINE	back references 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?=...) 	TokenNameCOMMENT_LINE	(?=...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?!...) 	TokenNameCOMMENT_LINE	(?!...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?<=...) 	TokenNameCOMMENT_LINE	(?<=...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?<!...) 	TokenNameCOMMENT_LINE	(?<!...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?>...) 	TokenNameCOMMENT_LINE	(?>...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?ims-ims:...) 	TokenNameCOMMENT_LINE	(?ims-ims:...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONDITION	TokenNameIdentifier	 CONDITION
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?(...)yes|no) 	TokenNameCOMMENT_LINE	(?(...)yes|no) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
=	TokenNameEQUAL	
0x10ffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_dot	TokenNameIdentifier	 token dot
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_0to9	TokenNameIdentifier	 token 0to9
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_wordchars	TokenNameIdentifier	 token wordchars
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_not_0to9	TokenNameIdentifier	 token not 0to9
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_not_wordchars	TokenNameIdentifier	 token not wordchars
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_spaces	TokenNameIdentifier	 token spaces
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_not_spaces	TokenNameIdentifier	 token not spaces
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_empty	TokenNameIdentifier	 token empty
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_linebeginning	TokenNameIdentifier	 token linebeginning
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_linebeginning2	TokenNameIdentifier	 token linebeginning2
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_lineend	TokenNameIdentifier	 token lineend
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_stringbeginning	TokenNameIdentifier	 token stringbeginning
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_stringend	TokenNameIdentifier	 token stringend
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_stringend2	TokenNameIdentifier	 token stringend2
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_wordedge	TokenNameIdentifier	 token wordedge
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_not_wordedge	TokenNameIdentifier	 token not wordedge
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_wordbeginning	TokenNameIdentifier	 token wordbeginning
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
token_wordend	TokenNameIdentifier	 token wordend
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_empty	TokenNameIdentifier	 token empty
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_linebeginning	TokenNameIdentifier	 token linebeginning
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_linebeginning2	TokenNameIdentifier	 token linebeginning2
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_lineend	TokenNameIdentifier	 token lineend
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_stringbeginning	TokenNameIdentifier	 token stringbeginning
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_stringend	TokenNameIdentifier	 token stringend
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_stringend2	TokenNameIdentifier	 token stringend2
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordedge	TokenNameIdentifier	 token wordedge
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_wordedge	TokenNameIdentifier	 token not wordedge
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'B'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordbeginning	TokenNameIdentifier	 token wordbeginning
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordend	TokenNameIdentifier	 token wordend
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_dot	TokenNameIdentifier	 token dot
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_0to9	TokenNameIdentifier	 token 0to9
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_0to9	TokenNameIdentifier	 token 0to9
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'\f'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_0to9	TokenNameIdentifier	 token not 0to9
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_0to9	TokenNameIdentifier	 token 0to9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_wordchars	TokenNameIdentifier	 token not wordchars
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_spaces	TokenNameIdentifier	 token not spaces
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ParenToken	TokenNameIdentifier	 Paren Token
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ParenToken	TokenNameIdentifier	 Paren Token
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ParenToken	TokenNameIdentifier	 Paren Token
createParen	TokenNameIdentifier	 create Paren
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
int	TokenNameint	
pnumber	TokenNameIdentifier	 pnumber
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ParenToken	TokenNameIdentifier	 Paren Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
PAREN	TokenNameIdentifier	 PAREN
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
pnumber	TokenNameIdentifier	 pnumber
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ClosureToken	TokenNameIdentifier	 Closure Token
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ClosureToken	TokenNameIdentifier	 Closure Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ClosureToken	TokenNameIdentifier	 Closure Token
createNGClosure	TokenNameIdentifier	 create NG Closure
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ClosureToken	TokenNameIdentifier	 Closure Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConcatToken	TokenNameIdentifier	 Concat Token
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok1	TokenNameIdentifier	 tok1
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
tok2	TokenNameIdentifier	 tok2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConcatToken	TokenNameIdentifier	 Concat Token
(	TokenNameLPAREN	
tok1	TokenNameIdentifier	 tok1
,	TokenNameCOMMA	
tok2	TokenNameIdentifier	 tok2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UnionToken	TokenNameIdentifier	 Union Token
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UnionToken	TokenNameIdentifier	 Union Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CONCAT	TokenNameIdentifier	 CONCAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// *** It is not a bug. 	TokenNameCOMMENT_LINE	*** It is not a bug. 
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UnionToken	TokenNameIdentifier	 Union Token
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UnionToken	TokenNameIdentifier	 Union Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
createEmpty	TokenNameIdentifier	 create Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_empty	TokenNameIdentifier	 token empty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
RangeToken	TokenNameIdentifier	 Range Token
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RangeToken	TokenNameIdentifier	 Range Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
RangeToken	TokenNameIdentifier	 Range Token
createNRange	TokenNameIdentifier	 create N Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RangeToken	TokenNameIdentifier	 Range Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NRANGE	TokenNameIdentifier	 NRANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CharToken	TokenNameIdentifier	 Char Token
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CharToken	TokenNameIdentifier	 Char Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CharToken	TokenNameIdentifier	 Char Token
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CharToken	TokenNameIdentifier	 Char Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
StringToken	TokenNameIdentifier	 String Token
createBackReference	TokenNameIdentifier	 create Back Reference
(	TokenNameLPAREN	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
StringToken	TokenNameIdentifier	 String Token
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ModifierToken	TokenNameIdentifier	 Modifier Token
createModifierGroup	TokenNameIdentifier	 create Modifier Group
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
int	TokenNameint	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ModifierToken	TokenNameIdentifier	 Modifier Token
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConditionToken	TokenNameIdentifier	 Condition Token
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
yespat	TokenNameIdentifier	 yespat
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
nopat	TokenNameIdentifier	 nopat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COUNTTOKENS	TokenNameIdentifier	 COUNTTOKENS
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConditionToken	TokenNameIdentifier	 Condition Token
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
yespat	TokenNameIdentifier	 yespat
,	TokenNameCOMMA	
nopat	TokenNameIdentifier	 nopat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A number of children. */	TokenNameCOMMENT_JAVADOC	 A number of children. 
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for RANGE or NRANGE 	TokenNameCOMMENT_LINE	for RANGE or NRANGE 
protected	TokenNameprotected	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
sortRanges	TokenNameIdentifier	 sort Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
intersectRanges	TokenNameIdentifier	 intersect Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not supported."	TokenNameStringLiteral	Not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RangeToken	TokenNameIdentifier	 Range Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for CLOSURE 	TokenNameCOMMENT_LINE	for CLOSURE 
}	TokenNameRBRACE	
void	TokenNamevoid	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for CLOSURE 	TokenNameCOMMENT_LINE	for CLOSURE 
}	TokenNameRBRACE	
int	TokenNameint	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for CLOSURE 	TokenNameCOMMENT_LINE	for CLOSURE 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for CLOSURE 	TokenNameCOMMENT_LINE	for CLOSURE 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getReferenceNumber	TokenNameIdentifier	 get Reference Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for STRING 	TokenNameCOMMENT_LINE	for STRING 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for STRING 	TokenNameCOMMENT_LINE	for STRING 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
?	TokenNameQUESTION	
"."	TokenNameStringLiteral	.
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * How many characters are needed? */	TokenNameCOMMENT_JAVADOC	 How many characters are needed? 
final	TokenNamefinal	
int	TokenNameint	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CONCAT	TokenNameIdentifier	 CONCAT
:	TokenNameCOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
case	TokenNamecase	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
<	TokenNameLESS	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EMPTY	TokenNameIdentifier	 EMPTY
:	TokenNameCOLON	
case	TokenNamecase	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
case	TokenNamecase	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
case	TokenNamecase	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
case	TokenNamecase	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
case	TokenNamecase	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
case	TokenNamecase	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ******* 	TokenNameCOMMENT_LINE	******* 
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ***** Really? 	TokenNameCOMMENT_LINE	***** Really? 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#getMinLength(): Invalid Type: "	TokenNameStringLiteral	Token#getMinLength(): Invalid Type: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CONCAT	TokenNameIdentifier	 CONCAT
:	TokenNameCOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
case	TokenNamecase	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// infinity 	TokenNameCOMMENT_LINE	infinity 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// When this.child.getMaxLength() < 0, 	TokenNameCOMMENT_LINE	When this.child.getMaxLength() < 0, 
// this returns minus value 	TokenNameCOMMENT_LINE	this returns minus value 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EMPTY	TokenNameIdentifier	 EMPTY
:	TokenNameCOLON	
case	TokenNamecase	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
case	TokenNamecase	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
case	TokenNamecase	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
case	TokenNamecase	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
case	TokenNamecase	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ****** 	TokenNameCOMMENT_LINE	****** 
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ***** Really? 	TokenNameCOMMENT_LINE	***** Really? 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#getMaxLength(): Invalid Type: "	TokenNameStringLiteral	Token#getMaxLength(): Invalid Type: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FC_ANY	TokenNameIdentifier	 FC  ANY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CONCAT	TokenNameIdentifier	 CONCAT
:	TokenNameCOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
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
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
/* * a|b|c -> FC_TERMINAL * a|.|c -> FC_ANY * a|b| -> FC_CONTINUE */	TokenNameCOMMENT_BLOCK	 a|b|c -> FC_TERMINAL a|.|c -> FC_ANY a|b| -> FC_CONTINUE 
int	TokenNameint	
ret2	TokenNameIdentifier	 ret2
=	TokenNameEQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasEmpty	TokenNameIdentifier	 has Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
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
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret2	TokenNameIdentifier	 ret2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret2	TokenNameIdentifier	 ret2
==	TokenNameEQUAL_EQUAL	
FC_ANY	TokenNameIdentifier	 FC  ANY
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ret2	TokenNameIdentifier	 ret2
==	TokenNameEQUAL_EQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
)	TokenNameRPAREN	
hasEmpty	TokenNameIdentifier	 has Empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hasEmpty	TokenNameIdentifier	 has Empty
?	TokenNameQUESTION	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
:	TokenNameCOLON	
ret2	TokenNameIdentifier	 ret2
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
int	TokenNameint	
ret3	TokenNameIdentifier	 ret3
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret3	TokenNameIdentifier	 ret3
==	TokenNameEQUAL_EQUAL	
FC_ANY	TokenNameIdentifier	 FC  ANY
)	TokenNameRPAREN	
return	TokenNamereturn	
ret3	TokenNameIdentifier	 ret3
;	TokenNameSEMICOLON	
int	TokenNameint	
ret4	TokenNameIdentifier	 ret4
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret4	TokenNameIdentifier	 ret4
==	TokenNameEQUAL_EQUAL	
FC_ANY	TokenNameIdentifier	 FC  ANY
)	TokenNameRPAREN	
return	TokenNamereturn	
ret4	TokenNameIdentifier	 ret4
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret3	TokenNameIdentifier	 ret3
==	TokenNameEQUAL_EQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
||	TokenNameOR_OR	
ret4	TokenNameIdentifier	 ret4
==	TokenNameEQUAL_EQUAL	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
?	TokenNameQUESTION	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
:	TokenNameCOLON	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
EMPTY	TokenNameIdentifier	 EMPTY
:	TokenNameCOLON	
case	TokenNamecase	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
return	TokenNamereturn	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
return	TokenNamereturn	
FC_ANY	TokenNameIdentifier	 FC  ANY
;	TokenNameSEMICOLON	
case	TokenNamecase	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
// **** 	TokenNameCOMMENT_LINE	**** 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
case	TokenNamecase	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
:	TokenNameCOLON	
options	TokenNameIdentifier	 options
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptionsMask	TokenNameIdentifier	 get Options Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// **** We can not optimize. 	TokenNameCOMMENT_LINE	**** We can not optimize. 
return	TokenNamereturn	
FC_ANY	TokenNameIdentifier	 FC  ANY
;	TokenNameSEMICOLON	
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
int	TokenNameint	
cha	TokenNameIdentifier	 cha
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cha	TokenNameIdentifier	 cha
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
,	TokenNameCOMMA	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
,	TokenNameCOMMA	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cha	TokenNameIdentifier	 cha
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
,	TokenNameCOMMA	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cha	TokenNameIdentifier	 cha
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
cha	TokenNameIdentifier	 cha
,	TokenNameCOMMA	
cha	TokenNameIdentifier	 cha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
return	TokenNamereturn	
FC_CONTINUE	TokenNameIdentifier	 FC  CONTINUE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#analyzeHeadCharacter(): Invalid Type: "	TokenNameStringLiteral	Token#analyzeHeadCharacter(): Invalid Type: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isShorterThan	TokenNameIdentifier	 is Shorter Than
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* int mylength; if (this.type == STRING) mylength = this.getString().length(); else if (this.type == CHAR) mylength = this.getChar() >= 0x10000 ? 2 : 1; else throw new RuntimeException("Internal Error: Illegal type: "+this.type); int otherlength; if (tok.type == STRING) otherlength = tok.getString().length(); else if (tok.type == CHAR) otherlength = tok.getChar() >= 0x10000 ? 2 : 1; else throw new RuntimeException("Internal Error: Illegal type: "+tok.type); */	TokenNameCOMMENT_BLOCK	 int mylength; if (this.type == STRING) mylength = this.getString().length(); else if (this.type == CHAR) mylength = this.getChar() >= 0x10000 ? 2 : 1; else throw new RuntimeException("Internal Error: Illegal type: "+this.type); int otherlength; if (tok.type == STRING) otherlength = tok.getString().length(); else if (tok.type == CHAR) otherlength = tok.getChar() >= 0x10000 ? 2 : 1; else throw new RuntimeException("Internal Error: Illegal type: "+tok.type); 
int	TokenNameint	
mylength	TokenNameIdentifier	 mylength
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
mylength	TokenNameIdentifier	 mylength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: Illegal type: "	TokenNameStringLiteral	Internal Error: Illegal type: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherlength	TokenNameIdentifier	 otherlength
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
otherlength	TokenNameIdentifier	 otherlength
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: Illegal type: "	TokenNameStringLiteral	Internal Error: Illegal type: 
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mylength	TokenNameIdentifier	 mylength
<	TokenNameLESS	
otherlength	TokenNameIdentifier	 otherlength
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
FixedStringContainer	TokenNameIdentifier	 Fixed String Container
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FixedStringContainer	TokenNameIdentifier	 Fixed String Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
findFixedString	TokenNameIdentifier	 find Fixed String
(	TokenNameLPAREN	
FixedStringContainer	TokenNameIdentifier	 Fixed String Container
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CONCAT	TokenNameIdentifier	 CONCAT
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
prevToken	TokenNameIdentifier	 prev Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevOptions	TokenNameIdentifier	 prev Options
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
findFixedString	TokenNameIdentifier	 find Fixed String
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevToken	TokenNameIdentifier	 prev Token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prevToken	TokenNameIdentifier	 prev Token
.	TokenNameDOT	
isShorterThan	TokenNameIdentifier	 is Shorter Than
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prevToken	TokenNameIdentifier	 prev Token
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
prevOptions	TokenNameIdentifier	 prev Options
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
prevToken	TokenNameIdentifier	 prev Token
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
prevOptions	TokenNameIdentifier	 prev Options
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
case	TokenNamecase	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
EMPTY	TokenNameIdentifier	 EMPTY
:	TokenNameCOLON	
case	TokenNamecase	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
case	TokenNamecase	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
case	TokenNamecase	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
case	TokenNamecase	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
case	TokenNamecase	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
case	TokenNamecase	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
// Ignore CHAR tokens. 	TokenNameCOMMENT_LINE	Ignore CHAR tokens. 
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ** 	TokenNameCOMMENT_LINE	** 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// ** 	TokenNameCOMMENT_LINE	** 
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
case	TokenNamecase	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
findFixedString	TokenNameIdentifier	 find Fixed String
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
:	TokenNameCOLON	
options	TokenNameIdentifier	 options
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptionsMask	TokenNameIdentifier	 get Options Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
findFixedString	TokenNameIdentifier	 find Fixed String
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#findFixedString(): Invalid Type: "	TokenNameStringLiteral	Token#findFixedString(): Invalid Type: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"NFAArrow#match(): Internal error: "	TokenNameStringLiteral	NFAArrow#match(): Internal error: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
categories	TokenNameIdentifier	 categories
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
categories2	TokenNameIdentifier	 categories2
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
categoryNames	TokenNameIdentifier	 category Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Cn"	TokenNameStringLiteral	Cn
,	TokenNameCOMMA	
"Lu"	TokenNameStringLiteral	Lu
,	TokenNameCOMMA	
"Ll"	TokenNameStringLiteral	Ll
,	TokenNameCOMMA	
"Lt"	TokenNameStringLiteral	Lt
,	TokenNameCOMMA	
"Lm"	TokenNameStringLiteral	Lm
,	TokenNameCOMMA	
"Lo"	TokenNameStringLiteral	Lo
,	TokenNameCOMMA	
"Mn"	TokenNameStringLiteral	Mn
,	TokenNameCOMMA	
"Me"	TokenNameStringLiteral	Me
,	TokenNameCOMMA	
"Mc"	TokenNameStringLiteral	Mc
,	TokenNameCOMMA	
"Nd"	TokenNameStringLiteral	Nd
,	TokenNameCOMMA	
"Nl"	TokenNameStringLiteral	Nl
,	TokenNameCOMMA	
"No"	TokenNameStringLiteral	No
,	TokenNameCOMMA	
"Zs"	TokenNameStringLiteral	Zs
,	TokenNameCOMMA	
"Zl"	TokenNameStringLiteral	Zl
,	TokenNameCOMMA	
"Zp"	TokenNameStringLiteral	Zp
,	TokenNameCOMMA	
"Cc"	TokenNameStringLiteral	Cc
,	TokenNameCOMMA	
"Cf"	TokenNameStringLiteral	Cf
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"Co"	TokenNameStringLiteral	Co
,	TokenNameCOMMA	
"Cs"	TokenNameStringLiteral	Cs
,	TokenNameCOMMA	
"Pd"	TokenNameStringLiteral	Pd
,	TokenNameCOMMA	
"Ps"	TokenNameStringLiteral	Ps
,	TokenNameCOMMA	
"Pe"	TokenNameStringLiteral	Pe
,	TokenNameCOMMA	
"Pc"	TokenNameStringLiteral	Pc
,	TokenNameCOMMA	
"Po"	TokenNameStringLiteral	Po
,	TokenNameCOMMA	
"Sm"	TokenNameStringLiteral	Sm
,	TokenNameCOMMA	
"Sc"	TokenNameStringLiteral	Sc
,	TokenNameCOMMA	
"Sk"	TokenNameStringLiteral	Sk
,	TokenNameCOMMA	
"So"	TokenNameStringLiteral	So
,	TokenNameCOMMA	
// 28 	TokenNameCOMMENT_LINE	28 
"Pi"	TokenNameStringLiteral	Pi
,	TokenNameCOMMA	
"Pf"	TokenNameStringLiteral	Pf
,	TokenNameCOMMA	
// 29, 30 	TokenNameCOMMENT_LINE	29, 30 
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
"S"	TokenNameStringLiteral	S
,	TokenNameCOMMA	
// 31-37 	TokenNameCOMMENT_LINE	31-37 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Schema Rec. {Datatypes} - Punctuation 	TokenNameCOMMENT_LINE	Schema Rec. {Datatypes} - Punctuation 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_INIT_QUOTE	TokenNameIdentifier	 CHAR  INIT  QUOTE
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Pi - initial quote 	TokenNameCOMMENT_LINE	Pi - initial quote 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_FINAL_QUOTE	TokenNameIdentifier	 CHAR  FINAL  QUOTE
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Pf - final quote 	TokenNameCOMMENT_LINE	Pf - final quote 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_LETTER	TokenNameIdentifier	 CHAR  LETTER
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_MARK	TokenNameIdentifier	 CHAR  MARK
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_NUMBER	TokenNameIdentifier	 CHAR  NUMBER
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_SEPARATOR	TokenNameIdentifier	 CHAR  SEPARATOR
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_OTHER	TokenNameIdentifier	 CHAR  OTHER
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_PUNCTUATION	TokenNameIdentifier	 CHAR  PUNCTUATION
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_SYMBOL	TokenNameIdentifier	 CHAR  SYMBOL
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//blockNames in UNICODE 3.1 that supported by XML Schema REC 	TokenNameCOMMENT_LINE	blockNames in UNICODE 3.1 that supported by XML Schema REC 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blockNames	TokenNameIdentifier	 block Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
/*0000..007F;*/	TokenNameCOMMENT_BLOCK	0000..007F;
"Basic Latin"	TokenNameStringLiteral	Basic Latin
,	TokenNameCOMMA	
/*0080..00FF;*/	TokenNameCOMMENT_BLOCK	0080..00FF;
"Latin-1 Supplement"	TokenNameStringLiteral	Latin-1 Supplement
,	TokenNameCOMMA	
/*0100..017F;*/	TokenNameCOMMENT_BLOCK	0100..017F;
"Latin Extended-A"	TokenNameStringLiteral	Latin Extended-A
,	TokenNameCOMMA	
/*0180..024F;*/	TokenNameCOMMENT_BLOCK	0180..024F;
"Latin Extended-B"	TokenNameStringLiteral	Latin Extended-B
,	TokenNameCOMMA	
/*0250..02AF;*/	TokenNameCOMMENT_BLOCK	0250..02AF;
"IPA Extensions"	TokenNameStringLiteral	IPA Extensions
,	TokenNameCOMMA	
/*02B0..02FF;*/	TokenNameCOMMENT_BLOCK	02B0..02FF;
"Spacing Modifier Letters"	TokenNameStringLiteral	Spacing Modifier Letters
,	TokenNameCOMMA	
/*0300..036F;*/	TokenNameCOMMENT_BLOCK	0300..036F;
"Combining Diacritical Marks"	TokenNameStringLiteral	Combining Diacritical Marks
,	TokenNameCOMMA	
/*0370..03FF;*/	TokenNameCOMMENT_BLOCK	0370..03FF;
"Greek"	TokenNameStringLiteral	Greek
,	TokenNameCOMMA	
/*0400..04FF;*/	TokenNameCOMMENT_BLOCK	0400..04FF;
"Cyrillic"	TokenNameStringLiteral	Cyrillic
,	TokenNameCOMMA	
/*0530..058F;*/	TokenNameCOMMENT_BLOCK	0530..058F;
"Armenian"	TokenNameStringLiteral	Armenian
,	TokenNameCOMMA	
/*0590..05FF;*/	TokenNameCOMMENT_BLOCK	0590..05FF;
"Hebrew"	TokenNameStringLiteral	Hebrew
,	TokenNameCOMMA	
/*0600..06FF;*/	TokenNameCOMMENT_BLOCK	0600..06FF;
"Arabic"	TokenNameStringLiteral	Arabic
,	TokenNameCOMMA	
/*0700..074F;*/	TokenNameCOMMENT_BLOCK	0700..074F;
"Syriac"	TokenNameStringLiteral	Syriac
,	TokenNameCOMMA	
/*0780..07BF;*/	TokenNameCOMMENT_BLOCK	0780..07BF;
"Thaana"	TokenNameStringLiteral	Thaana
,	TokenNameCOMMA	
/*0900..097F;*/	TokenNameCOMMENT_BLOCK	0900..097F;
"Devanagari"	TokenNameStringLiteral	Devanagari
,	TokenNameCOMMA	
/*0980..09FF;*/	TokenNameCOMMENT_BLOCK	0980..09FF;
"Bengali"	TokenNameStringLiteral	Bengali
,	TokenNameCOMMA	
/*0A00..0A7F;*/	TokenNameCOMMENT_BLOCK	0A00..0A7F;
"Gurmukhi"	TokenNameStringLiteral	Gurmukhi
,	TokenNameCOMMA	
/*0A80..0AFF;*/	TokenNameCOMMENT_BLOCK	0A80..0AFF;
"Gujarati"	TokenNameStringLiteral	Gujarati
,	TokenNameCOMMA	
/*0B00..0B7F;*/	TokenNameCOMMENT_BLOCK	0B00..0B7F;
"Oriya"	TokenNameStringLiteral	Oriya
,	TokenNameCOMMA	
/*0B80..0BFF;*/	TokenNameCOMMENT_BLOCK	0B80..0BFF;
"Tamil"	TokenNameStringLiteral	Tamil
,	TokenNameCOMMA	
/*0C00..0C7F;*/	TokenNameCOMMENT_BLOCK	0C00..0C7F;
"Telugu"	TokenNameStringLiteral	Telugu
,	TokenNameCOMMA	
/*0C80..0CFF;*/	TokenNameCOMMENT_BLOCK	0C80..0CFF;
"Kannada"	TokenNameStringLiteral	Kannada
,	TokenNameCOMMA	
/*0D00..0D7F;*/	TokenNameCOMMENT_BLOCK	0D00..0D7F;
"Malayalam"	TokenNameStringLiteral	Malayalam
,	TokenNameCOMMA	
/*0D80..0DFF;*/	TokenNameCOMMENT_BLOCK	0D80..0DFF;
"Sinhala"	TokenNameStringLiteral	Sinhala
,	TokenNameCOMMA	
/*0E00..0E7F;*/	TokenNameCOMMENT_BLOCK	0E00..0E7F;
"Thai"	TokenNameStringLiteral	Thai
,	TokenNameCOMMA	
/*0E80..0EFF;*/	TokenNameCOMMENT_BLOCK	0E80..0EFF;
"Lao"	TokenNameStringLiteral	Lao
,	TokenNameCOMMA	
/*0F00..0FFF;*/	TokenNameCOMMENT_BLOCK	0F00..0FFF;
"Tibetan"	TokenNameStringLiteral	Tibetan
,	TokenNameCOMMA	
/*1000..109F;*/	TokenNameCOMMENT_BLOCK	1000..109F;
"Myanmar"	TokenNameStringLiteral	Myanmar
,	TokenNameCOMMA	
/*10A0..10FF;*/	TokenNameCOMMENT_BLOCK	10A0..10FF;
"Georgian"	TokenNameStringLiteral	Georgian
,	TokenNameCOMMA	
/*1100..11FF;*/	TokenNameCOMMENT_BLOCK	1100..11FF;
"Hangul Jamo"	TokenNameStringLiteral	Hangul Jamo
,	TokenNameCOMMA	
/*1200..137F;*/	TokenNameCOMMENT_BLOCK	1200..137F;
"Ethiopic"	TokenNameStringLiteral	Ethiopic
,	TokenNameCOMMA	
/*13A0..13FF;*/	TokenNameCOMMENT_BLOCK	13A0..13FF;
"Cherokee"	TokenNameStringLiteral	Cherokee
,	TokenNameCOMMA	
/*1400..167F;*/	TokenNameCOMMENT_BLOCK	1400..167F;
"Unified Canadian Aboriginal Syllabics"	TokenNameStringLiteral	Unified Canadian Aboriginal Syllabics
,	TokenNameCOMMA	
/*1680..169F;*/	TokenNameCOMMENT_BLOCK	1680..169F;
"Ogham"	TokenNameStringLiteral	Ogham
,	TokenNameCOMMA	
/*16A0..16FF;*/	TokenNameCOMMENT_BLOCK	16A0..16FF;
"Runic"	TokenNameStringLiteral	Runic
,	TokenNameCOMMA	
/*1780..17FF;*/	TokenNameCOMMENT_BLOCK	1780..17FF;
"Khmer"	TokenNameStringLiteral	Khmer
,	TokenNameCOMMA	
/*1800..18AF;*/	TokenNameCOMMENT_BLOCK	1800..18AF;
"Mongolian"	TokenNameStringLiteral	Mongolian
,	TokenNameCOMMA	
/*1E00..1EFF;*/	TokenNameCOMMENT_BLOCK	1E00..1EFF;
"Latin Extended Additional"	TokenNameStringLiteral	Latin Extended Additional
,	TokenNameCOMMA	
/*1F00..1FFF;*/	TokenNameCOMMENT_BLOCK	1F00..1FFF;
"Greek Extended"	TokenNameStringLiteral	Greek Extended
,	TokenNameCOMMA	
/*2000..206F;*/	TokenNameCOMMENT_BLOCK	2000..206F;
"General Punctuation"	TokenNameStringLiteral	General Punctuation
,	TokenNameCOMMA	
/*2070..209F;*/	TokenNameCOMMENT_BLOCK	2070..209F;
"Superscripts and Subscripts"	TokenNameStringLiteral	Superscripts and Subscripts
,	TokenNameCOMMA	
/*20A0..20CF;*/	TokenNameCOMMENT_BLOCK	20A0..20CF;
"Currency Symbols"	TokenNameStringLiteral	Currency Symbols
,	TokenNameCOMMA	
/*20D0..20FF;*/	TokenNameCOMMENT_BLOCK	20D0..20FF;
"Combining Marks for Symbols"	TokenNameStringLiteral	Combining Marks for Symbols
,	TokenNameCOMMA	
/*2100..214F;*/	TokenNameCOMMENT_BLOCK	2100..214F;
"Letterlike Symbols"	TokenNameStringLiteral	Letterlike Symbols
,	TokenNameCOMMA	
/*2150..218F;*/	TokenNameCOMMENT_BLOCK	2150..218F;
"Number Forms"	TokenNameStringLiteral	Number Forms
,	TokenNameCOMMA	
/*2190..21FF;*/	TokenNameCOMMENT_BLOCK	2190..21FF;
"Arrows"	TokenNameStringLiteral	Arrows
,	TokenNameCOMMA	
/*2200..22FF;*/	TokenNameCOMMENT_BLOCK	2200..22FF;
"Mathematical Operators"	TokenNameStringLiteral	Mathematical Operators
,	TokenNameCOMMA	
/*2300..23FF;*/	TokenNameCOMMENT_BLOCK	2300..23FF;
"Miscellaneous Technical"	TokenNameStringLiteral	Miscellaneous Technical
,	TokenNameCOMMA	
/*2400..243F;*/	TokenNameCOMMENT_BLOCK	2400..243F;
"Control Pictures"	TokenNameStringLiteral	Control Pictures
,	TokenNameCOMMA	
/*2440..245F;*/	TokenNameCOMMENT_BLOCK	2440..245F;
"Optical Character Recognition"	TokenNameStringLiteral	Optical Character Recognition
,	TokenNameCOMMA	
/*2460..24FF;*/	TokenNameCOMMENT_BLOCK	2460..24FF;
"Enclosed Alphanumerics"	TokenNameStringLiteral	Enclosed Alphanumerics
,	TokenNameCOMMA	
/*2500..257F;*/	TokenNameCOMMENT_BLOCK	2500..257F;
"Box Drawing"	TokenNameStringLiteral	Box Drawing
,	TokenNameCOMMA	
/*2580..259F;*/	TokenNameCOMMENT_BLOCK	2580..259F;
"Block Elements"	TokenNameStringLiteral	Block Elements
,	TokenNameCOMMA	
/*25A0..25FF;*/	TokenNameCOMMENT_BLOCK	25A0..25FF;
"Geometric Shapes"	TokenNameStringLiteral	Geometric Shapes
,	TokenNameCOMMA	
/*2600..26FF;*/	TokenNameCOMMENT_BLOCK	2600..26FF;
"Miscellaneous Symbols"	TokenNameStringLiteral	Miscellaneous Symbols
,	TokenNameCOMMA	
/*2700..27BF;*/	TokenNameCOMMENT_BLOCK	2700..27BF;
"Dingbats"	TokenNameStringLiteral	Dingbats
,	TokenNameCOMMA	
/*2800..28FF;*/	TokenNameCOMMENT_BLOCK	2800..28FF;
"Braille Patterns"	TokenNameStringLiteral	Braille Patterns
,	TokenNameCOMMA	
/*2E80..2EFF;*/	TokenNameCOMMENT_BLOCK	2E80..2EFF;
"CJK Radicals Supplement"	TokenNameStringLiteral	CJK Radicals Supplement
,	TokenNameCOMMA	
/*2F00..2FDF;*/	TokenNameCOMMENT_BLOCK	2F00..2FDF;
"Kangxi Radicals"	TokenNameStringLiteral	Kangxi Radicals
,	TokenNameCOMMA	
/*2FF0..2FFF;*/	TokenNameCOMMENT_BLOCK	2FF0..2FFF;
"Ideographic Description Characters"	TokenNameStringLiteral	Ideographic Description Characters
,	TokenNameCOMMA	
/*3000..303F;*/	TokenNameCOMMENT_BLOCK	3000..303F;
"CJK Symbols and Punctuation"	TokenNameStringLiteral	CJK Symbols and Punctuation
,	TokenNameCOMMA	
/*3040..309F;*/	TokenNameCOMMENT_BLOCK	3040..309F;
"Hiragana"	TokenNameStringLiteral	Hiragana
,	TokenNameCOMMA	
/*30A0..30FF;*/	TokenNameCOMMENT_BLOCK	30A0..30FF;
"Katakana"	TokenNameStringLiteral	Katakana
,	TokenNameCOMMA	
/*3100..312F;*/	TokenNameCOMMENT_BLOCK	3100..312F;
"Bopomofo"	TokenNameStringLiteral	Bopomofo
,	TokenNameCOMMA	
/*3130..318F;*/	TokenNameCOMMENT_BLOCK	3130..318F;
"Hangul Compatibility Jamo"	TokenNameStringLiteral	Hangul Compatibility Jamo
,	TokenNameCOMMA	
/*3190..319F;*/	TokenNameCOMMENT_BLOCK	3190..319F;
"Kanbun"	TokenNameStringLiteral	Kanbun
,	TokenNameCOMMA	
/*31A0..31BF;*/	TokenNameCOMMENT_BLOCK	31A0..31BF;
"Bopomofo Extended"	TokenNameStringLiteral	Bopomofo Extended
,	TokenNameCOMMA	
/*3200..32FF;*/	TokenNameCOMMENT_BLOCK	3200..32FF;
"Enclosed CJK Letters and Months"	TokenNameStringLiteral	Enclosed CJK Letters and Months
,	TokenNameCOMMA	
/*3300..33FF;*/	TokenNameCOMMENT_BLOCK	3300..33FF;
"CJK Compatibility"	TokenNameStringLiteral	CJK Compatibility
,	TokenNameCOMMA	
/*3400..4DB5;*/	TokenNameCOMMENT_BLOCK	3400..4DB5;
"CJK Unified Ideographs Extension A"	TokenNameStringLiteral	CJK Unified Ideographs Extension A
,	TokenNameCOMMA	
/*4E00..9FFF;*/	TokenNameCOMMENT_BLOCK	4E00..9FFF;
"CJK Unified Ideographs"	TokenNameStringLiteral	CJK Unified Ideographs
,	TokenNameCOMMA	
/*A000..A48F;*/	TokenNameCOMMENT_BLOCK	A000..A48F;
"Yi Syllables"	TokenNameStringLiteral	Yi Syllables
,	TokenNameCOMMA	
/*A490..A4CF;*/	TokenNameCOMMENT_BLOCK	A490..A4CF;
"Yi Radicals"	TokenNameStringLiteral	Yi Radicals
,	TokenNameCOMMA	
/*AC00..D7A3;*/	TokenNameCOMMENT_BLOCK	AC00..D7A3;
"Hangul Syllables"	TokenNameStringLiteral	Hangul Syllables
,	TokenNameCOMMA	
/*E000..F8FF;*/	TokenNameCOMMENT_BLOCK	E000..F8FF;
"Private Use"	TokenNameStringLiteral	Private Use
,	TokenNameCOMMA	
/*F900..FAFF;*/	TokenNameCOMMENT_BLOCK	F900..FAFF;
"CJK Compatibility Ideographs"	TokenNameStringLiteral	CJK Compatibility Ideographs
,	TokenNameCOMMA	
/*FB00..FB4F;*/	TokenNameCOMMENT_BLOCK	FB00..FB4F;
"Alphabetic Presentation Forms"	TokenNameStringLiteral	Alphabetic Presentation Forms
,	TokenNameCOMMA	
/*FB50..FDFF;*/	TokenNameCOMMENT_BLOCK	FB50..FDFF;
"Arabic Presentation Forms-A"	TokenNameStringLiteral	Arabic Presentation Forms-A
,	TokenNameCOMMA	
/*FE20..FE2F;*/	TokenNameCOMMENT_BLOCK	FE20..FE2F;
"Combining Half Marks"	TokenNameStringLiteral	Combining Half Marks
,	TokenNameCOMMA	
/*FE30..FE4F;*/	TokenNameCOMMENT_BLOCK	FE30..FE4F;
"CJK Compatibility Forms"	TokenNameStringLiteral	CJK Compatibility Forms
,	TokenNameCOMMA	
/*FE50..FE6F;*/	TokenNameCOMMENT_BLOCK	FE50..FE6F;
"Small Form Variants"	TokenNameStringLiteral	Small Form Variants
,	TokenNameCOMMA	
/*FE70..FEFE;*/	TokenNameCOMMENT_BLOCK	FE70..FEFE;
"Arabic Presentation Forms-B"	TokenNameStringLiteral	Arabic Presentation Forms-B
,	TokenNameCOMMA	
/*FEFF..FEFF;*/	TokenNameCOMMENT_BLOCK	FEFF..FEFF;
"Specials"	TokenNameStringLiteral	Specials
,	TokenNameCOMMA	
/*FF00..FFEF;*/	TokenNameCOMMENT_BLOCK	FF00..FFEF;
"Halfwidth and Fullwidth Forms"	TokenNameStringLiteral	Halfwidth and Fullwidth Forms
,	TokenNameCOMMA	
//missing Specials add manually 	TokenNameCOMMENT_LINE	missing Specials add manually 
/*10300..1032F;*/	TokenNameCOMMENT_BLOCK	10300..1032F;
"Old Italic"	TokenNameStringLiteral	Old Italic
,	TokenNameCOMMA	
// 84 	TokenNameCOMMENT_LINE	84 
/*10330..1034F;*/	TokenNameCOMMENT_BLOCK	10330..1034F;
"Gothic"	TokenNameStringLiteral	Gothic
,	TokenNameCOMMA	
/*10400..1044F;*/	TokenNameCOMMENT_BLOCK	10400..1044F;
"Deseret"	TokenNameStringLiteral	Deseret
,	TokenNameCOMMA	
/*1D000..1D0FF;*/	TokenNameCOMMENT_BLOCK	1D000..1D0FF;
"Byzantine Musical Symbols"	TokenNameStringLiteral	Byzantine Musical Symbols
,	TokenNameCOMMA	
/*1D100..1D1FF;*/	TokenNameCOMMENT_BLOCK	1D100..1D1FF;
"Musical Symbols"	TokenNameStringLiteral	Musical Symbols
,	TokenNameCOMMA	
/*1D400..1D7FF;*/	TokenNameCOMMENT_BLOCK	1D400..1D7FF;
"Mathematical Alphanumeric Symbols"	TokenNameStringLiteral	Mathematical Alphanumeric Symbols
,	TokenNameCOMMA	
/*20000..2A6D6;*/	TokenNameCOMMENT_BLOCK	20000..2A6D6;
"CJK Unified Ideographs Extension B"	TokenNameStringLiteral	CJK Unified Ideographs Extension B
,	TokenNameCOMMA	
/*2F800..2FA1F;*/	TokenNameCOMMENT_BLOCK	2F800..2FA1F;
"CJK Compatibility Ideographs Supplement"	TokenNameStringLiteral	CJK Compatibility Ideographs Supplement
,	TokenNameCOMMA	
/*E0000..E007F;*/	TokenNameCOMMENT_BLOCK	E0000..E007F;
"Tags"	TokenNameStringLiteral	Tags
,	TokenNameCOMMA	
//missing 2 private use add manually 	TokenNameCOMMENT_LINE	missing 2 private use add manually 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//ADD THOSE MANUALLY 	TokenNameCOMMENT_LINE	ADD THOSE MANUALLY 
//F0000..FFFFD; "Private Use", 	TokenNameCOMMENT_LINE	F0000..FFFFD; "Private Use", 
//100000..10FFFD; "Private Use" 	TokenNameCOMMENT_LINE	100000..10FFFD; "Private Use" 
//FFF0..FFFD; "Specials", 	TokenNameCOMMENT_LINE	FFF0..FFFD; "Specials", 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
blockRanges	TokenNameIdentifier	 block Ranges
=	TokenNameEQUAL	
" ?Ø??????????"	TokenNameStringLiteral	 ?Ø??????????
+	TokenNamePLUS	
"??????????????"	TokenNameStringLiteral	??????????????
+	TokenNamePLUS	
"????????????????"	TokenNameStringLiteral	????????????????
+	TokenNamePLUS	
"????????????????"	TokenNameStringLiteral	????????????????
+	TokenNamePLUS	
"????????????????"	TokenNameStringLiteral	????????????????
+	TokenNamePLUS	
"??????????????????"	TokenNameStringLiteral	??????????????????
+	TokenNamePLUS	
"??????????????????"	TokenNameStringLiteral	??????????????????
+	TokenNamePLUS	
"??????????????????"	TokenNameStringLiteral	??????????????????
+	TokenNamePLUS	
"????????????????"	TokenNameStringLiteral	????????????????
+	TokenNamePLUS	
"???ð??????"	TokenNameStringLiteral	???ð??????
+	TokenNamePLUS	
"????????????"	TokenNameStringLiteral	????????????
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nonBMPBlockRanges	TokenNameIdentifier	 non BMP Block Ranges
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x10300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1032F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 84 	TokenNameCOMMENT_LINE	84 
0x10330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1034F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1044F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D0FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D1FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D7FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2A6D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2F800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2FA1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xE0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xE007F	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NONBMP_BLOCK_START	TokenNameIdentifier	 NONBMP  BLOCK  START
=	TokenNameEQUAL	
84	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
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
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categoryNames	TokenNameIdentifier	 category Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
START_PUNCTUATION	TokenNameIdentifier	 START  PUNCTUATION
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
END_PUNCTUATION	TokenNameIdentifier	 END  PUNCTUATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//build table of Pi values 	TokenNameCOMMENT_LINE	build table of Pi values 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x00AB	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x2018	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x201B	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x201C	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x201F	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x2039	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_INIT_QUOTE	TokenNameIdentifier	 CHAR  INIT  QUOTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//build table of Pf values 	TokenNameCOMMENT_LINE	build table of Pf values 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x00BB	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x2019	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x201D	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0x203A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_FINAL_QUOTE	TokenNameIdentifier	 CHAR  FINAL  QUOTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UPPERCASE_LETTER	TokenNameIdentifier	 UPPERCASE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LOWERCASE_LETTER	TokenNameIdentifier	 LOWERCASE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TITLECASE_LETTER	TokenNameIdentifier	 TITLECASE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MODIFIER_LETTER	TokenNameIdentifier	 MODIFIER  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_LETTER	TokenNameIdentifier	 OTHER  LETTER
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_LETTER	TokenNameIdentifier	 CHAR  LETTER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
COMBINING_SPACING_MARK	TokenNameIdentifier	 COMBINING  SPACING  MARK
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
ENCLOSING_MARK	TokenNameIdentifier	 ENCLOSING  MARK
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_MARK	TokenNameIdentifier	 CHAR  MARK
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
DECIMAL_DIGIT_NUMBER	TokenNameIdentifier	 DECIMAL  DIGIT  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LETTER_NUMBER	TokenNameIdentifier	 LETTER  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_NUMBER	TokenNameIdentifier	 OTHER  NUMBER
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_NUMBER	TokenNameIdentifier	 CHAR  NUMBER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
SPACE_SEPARATOR	TokenNameIdentifier	 SPACE  SEPARATOR
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
PARAGRAPH_SEPARATOR	TokenNameIdentifier	 PARAGRAPH  SEPARATOR
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_SEPARATOR	TokenNameIdentifier	 CHAR  SEPARATOR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
CONTROL	TokenNameIdentifier	 CONTROL
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
FORMAT	TokenNameIdentifier	 FORMAT
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
SURROGATE	TokenNameIdentifier	 SURROGATE
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
PRIVATE_USE	TokenNameIdentifier	 PRIVATE  USE
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UNASSIGNED	TokenNameIdentifier	 UNASSIGNED
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_OTHER	TokenNameIdentifier	 CHAR  OTHER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
CONNECTOR_PUNCTUATION	TokenNameIdentifier	 CONNECTOR  PUNCTUATION
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
DASH_PUNCTUATION	TokenNameIdentifier	 DASH  PUNCTUATION
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
START_PUNCTUATION	TokenNameIdentifier	 START  PUNCTUATION
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
END_PUNCTUATION	TokenNameIdentifier	 END  PUNCTUATION
:	TokenNameCOLON	
case	TokenNamecase	
CHAR_INIT_QUOTE	TokenNameIdentifier	 CHAR  INIT  QUOTE
:	TokenNameCOLON	
case	TokenNamecase	
CHAR_FINAL_QUOTE	TokenNameIdentifier	 CHAR  FINAL  QUOTE
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_PUNCTUATION	TokenNameIdentifier	 OTHER  PUNCTUATION
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_PUNCTUATION	TokenNameIdentifier	 CHAR  PUNCTUATION
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MATH_SYMBOL	TokenNameIdentifier	 MATH  SYMBOL
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
CURRENCY_SYMBOL	TokenNameIdentifier	 CURRENCY  SYMBOL
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MODIFIER_SYMBOL	TokenNameIdentifier	 MODIFIER  SYMBOL
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_SYMBOL	TokenNameIdentifier	 OTHER  SYMBOL
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CHAR_SYMBOL	TokenNameIdentifier	 CHAR  SYMBOL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"org.apache.xerces.utils.regex.Token#getRange(): Unknown Unicode category: "	TokenNameStringLiteral	org.apache.xerces.utils.regex.Token#getRange(): Unknown Unicode category: 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for all characters 	TokenNameCOMMENT_LINE	for all characters 
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UNASSIGNED	TokenNameIdentifier	 UNASSIGNED
]	TokenNameRBRACKET	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
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
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categoryNames	TokenNameIdentifier	 category Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UNASSIGNED	TokenNameIdentifier	 UNASSIGNED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Unassigned 	TokenNameCOMMENT_LINE	Unassigned 
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0x10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categoryNames	TokenNameIdentifier	 category Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categoryNames	TokenNameIdentifier	 category Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//REVISIT: do we really need to support block names as in Unicode 3.1 	TokenNameCOMMENT_LINE	REVISIT: do we really need to support block names as in Unicode 3.1 
// or we can just create all the names in IsBLOCKNAME format (XML Schema REC)? 	TokenNameCOMMENT_LINE	or we can just create all the names in IsBLOCKNAME format (XML Schema REC)? 
// 	TokenNameCOMMENT_LINE	 
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
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
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
blockNames	TokenNameIdentifier	 block Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
NONBMP_BLOCK_START	TokenNameIdentifier	 NONBMP  BLOCK  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
rstart	TokenNameIdentifier	 rstart
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
blockRanges	TokenNameIdentifier	 block Ranges
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rend	TokenNameIdentifier	 rend
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
blockRanges	TokenNameIdentifier	 block Ranges
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//DEBUGING 	TokenNameCOMMENT_LINE	DEBUGING 
//System.out.println(n+" " +Integer.toHexString(rstart) 	TokenNameCOMMENT_LINE	System.out.println(n+" " +Integer.toHexString(rstart) 
// +"-"+ Integer.toHexString(rend)); 	TokenNameCOMMENT_LINE	+"-"+ Integer.toHexString(rend)); 
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
rstart	TokenNameIdentifier	 rstart
,	TokenNameCOMMA	
rend	TokenNameIdentifier	 rend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
NONBMP_BLOCK_START	TokenNameIdentifier	 NONBMP  BLOCK  START
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonBMPBlockRanges	TokenNameIdentifier	 non BMP Block Ranges
[	TokenNameLBRACKET	
location	TokenNameIdentifier	 location
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonBMPBlockRanges	TokenNameIdentifier	 non BMP Block Ranges
[	TokenNameLBRACKET	
location	TokenNameIdentifier	 location
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
blockNames	TokenNameIdentifier	 block Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Specials"	TokenNameStringLiteral	Specials
)	TokenNameRPAREN	
)	TokenNameRPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0xfff0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xfffd	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Private Use"	TokenNameStringLiteral	Private Use
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0xF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFFD	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0x100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10FFFD	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Is"	TokenNameStringLiteral	Is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ci	TokenNameIdentifier	 ci
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
<	TokenNameLESS	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TR#18 1.2 	TokenNameCOMMENT_LINE	TR#18 1.2 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"ASSIGNED"	TokenNameStringLiteral	ASSIGNED
,	TokenNameCOMMA	
"Cn"	TokenNameStringLiteral	Cn
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"UNASSIGNED"	TokenNameStringLiteral	UNASSIGNED
,	TokenNameCOMMA	
"Cn"	TokenNameStringLiteral	Cn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
all	TokenNameIdentifier	 all
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
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ALL"	TokenNameStringLiteral	ALL
,	TokenNameCOMMA	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ALL"	TokenNameStringLiteral	ALL
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"ASSIGNED"	TokenNameStringLiteral	ASSIGNED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"UNASSIGNED"	TokenNameStringLiteral	UNASSIGNED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"ALL"	TokenNameStringLiteral	ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isalpha	TokenNameIdentifier	 isalpha
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isalpha	TokenNameIdentifier	 isalpha
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UPPERCASE_LETTER	TokenNameIdentifier	 UPPERCASE  LETTER
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lu 	TokenNameCOMMENT_LINE	Lu 
isalpha	TokenNameIdentifier	 isalpha
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LOWERCASE_LETTER	TokenNameIdentifier	 LOWERCASE  LETTER
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ll 	TokenNameCOMMENT_LINE	Ll 
isalpha	TokenNameIdentifier	 isalpha
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_LETTER	TokenNameIdentifier	 OTHER  LETTER
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lo 	TokenNameCOMMENT_LINE	Lo 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsAlpha"	TokenNameStringLiteral	IsAlpha
,	TokenNameCOMMA	
isalpha	TokenNameIdentifier	 isalpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsAlpha"	TokenNameStringLiteral	IsAlpha
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isalpha	TokenNameIdentifier	 isalpha
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsAlpha"	TokenNameStringLiteral	IsAlpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isalnum	TokenNameIdentifier	 isalnum
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isalnum	TokenNameIdentifier	 isalnum
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
isalpha	TokenNameIdentifier	 isalpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lu Ll Lo 	TokenNameCOMMENT_LINE	Lu Ll Lo 
isalnum	TokenNameIdentifier	 isalnum
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
DECIMAL_DIGIT_NUMBER	TokenNameIdentifier	 DECIMAL  DIGIT  NUMBER
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Nd 	TokenNameCOMMENT_LINE	Nd 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsAlnum"	TokenNameStringLiteral	IsAlnum
,	TokenNameCOMMA	
isalnum	TokenNameIdentifier	 isalnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsAlnum"	TokenNameStringLiteral	IsAlnum
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isalnum	TokenNameIdentifier	 isalnum
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsAlnum"	TokenNameStringLiteral	IsAlnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isspace	TokenNameIdentifier	 isspace
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isspace	TokenNameIdentifier	 isspace
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isspace	TokenNameIdentifier	 isspace
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
CHAR_SEPARATOR	TokenNameIdentifier	 CHAR  SEPARATOR
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Z 	TokenNameCOMMENT_LINE	Z 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsSpace"	TokenNameStringLiteral	IsSpace
,	TokenNameCOMMA	
isspace	TokenNameIdentifier	 isspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsSpace"	TokenNameStringLiteral	IsSpace
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isspace	TokenNameIdentifier	 isspace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsSpace"	TokenNameStringLiteral	IsSpace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isword	TokenNameIdentifier	 isword
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isword	TokenNameIdentifier	 isword
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
isalnum	TokenNameIdentifier	 isalnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lu Ll Lo Nd 	TokenNameCOMMENT_LINE	Lu Ll Lo Nd 
isword	TokenNameIdentifier	 isword
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
isword	TokenNameIdentifier	 isword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isword	TokenNameIdentifier	 isword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isascii	TokenNameIdentifier	 isascii
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isascii	TokenNameIdentifier	 isascii
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsASCII"	TokenNameStringLiteral	IsASCII
,	TokenNameCOMMA	
isascii	TokenNameIdentifier	 isascii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsASCII"	TokenNameStringLiteral	IsASCII
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isascii	TokenNameIdentifier	 isascii
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsASCII"	TokenNameStringLiteral	IsASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isnotgraph	TokenNameIdentifier	 isnotgraph
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isnotgraph	TokenNameIdentifier	 isnotgraph
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
[	TokenNameLBRACKET	
CHAR_OTHER	TokenNameIdentifier	 CHAR  OTHER
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isnotgraph	TokenNameIdentifier	 isnotgraph
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsGraph"	TokenNameStringLiteral	IsGraph
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isnotgraph	TokenNameIdentifier	 isnotgraph
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsGraph"	TokenNameStringLiteral	IsGraph
,	TokenNameCOMMA	
isnotgraph	TokenNameIdentifier	 isnotgraph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsGraph"	TokenNameStringLiteral	IsGraph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
isxdigit	TokenNameIdentifier	 isxdigit
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isxdigit	TokenNameIdentifier	 isxdigit
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isxdigit	TokenNameIdentifier	 isxdigit
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isxdigit	TokenNameIdentifier	 isxdigit
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsXDigit"	TokenNameStringLiteral	IsXDigit
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
isxdigit	TokenNameIdentifier	 isxdigit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IsXDigit"	TokenNameStringLiteral	IsXDigit
,	TokenNameCOMMA	
isxdigit	TokenNameIdentifier	 isxdigit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsXDigit"	TokenNameStringLiteral	IsXDigit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsDigit"	TokenNameStringLiteral	IsDigit
,	TokenNameCOMMA	
"Nd"	TokenNameStringLiteral	Nd
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsUpper"	TokenNameStringLiteral	IsUpper
,	TokenNameCOMMA	
"Lu"	TokenNameStringLiteral	Lu
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsLower"	TokenNameStringLiteral	IsLower
,	TokenNameCOMMA	
"Ll"	TokenNameStringLiteral	Ll
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsCntrl"	TokenNameStringLiteral	IsCntrl
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsPrint"	TokenNameStringLiteral	IsPrint
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"IsPunct"	TokenNameStringLiteral	IsPunct
,	TokenNameCOMMA	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsDigit"	TokenNameStringLiteral	IsDigit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsUpper"	TokenNameStringLiteral	IsUpper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsLower"	TokenNameStringLiteral	IsLower
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsCntrl"	TokenNameStringLiteral	IsCntrl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsPrint"	TokenNameStringLiteral	IsPrint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"IsPunct"	TokenNameStringLiteral	IsPunct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"IsAlpha"	TokenNameStringLiteral	IsAlpha
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"alnum"	TokenNameStringLiteral	alnum
,	TokenNameCOMMA	
"IsAlnum"	TokenNameStringLiteral	IsAlnum
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"ascii"	TokenNameStringLiteral	ascii
,	TokenNameCOMMA	
"IsASCII"	TokenNameStringLiteral	IsASCII
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"cntrl"	TokenNameStringLiteral	cntrl
,	TokenNameCOMMA	
"IsCntrl"	TokenNameStringLiteral	IsCntrl
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"digit"	TokenNameStringLiteral	digit
,	TokenNameCOMMA	
"IsDigit"	TokenNameStringLiteral	IsDigit
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"graph"	TokenNameStringLiteral	graph
,	TokenNameCOMMA	
"IsGraph"	TokenNameStringLiteral	IsGraph
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"lower"	TokenNameStringLiteral	lower
,	TokenNameCOMMA	
"IsLower"	TokenNameStringLiteral	IsLower
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"print"	TokenNameStringLiteral	print
,	TokenNameCOMMA	
"IsPrint"	TokenNameStringLiteral	IsPrint
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"punct"	TokenNameStringLiteral	punct
,	TokenNameCOMMA	
"IsPunct"	TokenNameStringLiteral	IsPunct
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
"IsSpace"	TokenNameStringLiteral	IsSpace
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"upper"	TokenNameStringLiteral	upper
,	TokenNameCOMMA	
"IsUpper"	TokenNameStringLiteral	IsUpper
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Perl extension 	TokenNameCOMMENT_LINE	Perl extension 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"xdigit"	TokenNameStringLiteral	xdigit
,	TokenNameCOMMA	
"IsXDigit"	TokenNameStringLiteral	IsXDigit
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"alpha"	TokenNameStringLiteral	alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"alnum"	TokenNameStringLiteral	alnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"ascii"	TokenNameStringLiteral	ascii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"cntrl"	TokenNameStringLiteral	cntrl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"digit"	TokenNameStringLiteral	digit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"graph"	TokenNameStringLiteral	graph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"lower"	TokenNameStringLiteral	lower
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"print"	TokenNameStringLiteral	print
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"punct"	TokenNameStringLiteral	punct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"space"	TokenNameStringLiteral	space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"upper"	TokenNameStringLiteral	upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"word"	TokenNameStringLiteral	word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
"xdigit"	TokenNameStringLiteral	xdigit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronized 	TokenNameCOMMENT_LINE	synchronized 
}	TokenNameRBRACE	
// if null 	TokenNameCOMMENT_LINE	if null 
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
positive	TokenNameIdentifier	 positive
?	TokenNameQUESTION	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if (tok == null) System.out.println(name); 	TokenNameCOMMENT_LINE	if (tok == null) System.out.println(name); 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
xs	TokenNameIdentifier	 xs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeToken	TokenNameIdentifier	 Range Token
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
positive	TokenNameIdentifier	 positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xs	TokenNameIdentifier	 xs
&&	TokenNameAND_AND	
range	TokenNameIdentifier	 range
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
isRegisterNonXS	TokenNameIdentifier	 is Register Non XS
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
nonxs	TokenNameIdentifier	 nonxs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This method is called by only getRange(). * So this method need not MT-safe. */	TokenNameCOMMENT_JAVADOC	 This method is called by only getRange(). So this method need not MT-safe. 
static	TokenNamestatic	
protected	TokenNameprotected	
void	TokenNamevoid	
registerNonXS	TokenNameIdentifier	 register Non XS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonxs	TokenNameIdentifier	 nonxs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonxs	TokenNameIdentifier	 nonxs
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonxs	TokenNameIdentifier	 nonxs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isRegisterNonXS	TokenNameIdentifier	 is Register Non XS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonxs	TokenNameIdentifier	 nonxs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//DEBUG 	TokenNameCOMMENT_LINE	DEBUG 
//System.err.println("isRegisterNonXS: "+name); 	TokenNameCOMMENT_LINE	System.err.println("isRegisterNonXS: "+name); 
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
nonxs	TokenNameIdentifier	 nonxs
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positive	TokenNameIdentifier	 positive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories2	TokenNameIdentifier	 categories2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newName	TokenNameIdentifier	 new Name
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
viramaString	TokenNameIdentifier	 virama String
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
// ;DEVANAGARI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;DEVANAGARI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;BENGALI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;BENGALI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;GURMUKHI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;GURMUKHI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;GUJARATI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;GUJARATI SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;ORIYA SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;ORIYA SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;TAMIL SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;TAMIL SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;TELUGU SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;TELUGU SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;KANNADA SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;KANNADA SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;MALAYALAM SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 	TokenNameCOMMENT_LINE	;MALAYALAM SIGN VIRAMA;Mn;9;ON;;;;;N;;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
//;THAI CHARACTER PHINTHU;Mn;9;ON;;;;;N;THAI VOWEL SIGN PHINTHU;;;; 	TokenNameCOMMENT_LINE	;THAI CHARACTER PHINTHU;Mn;9;ON;;;;;N;THAI VOWEL SIGN PHINTHU;;;; 
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
//;TIBETAN MARK HALANTA;Mn;9;ON;;;;;N;TIBETAN VIRAMA;;;; 	TokenNameCOMMENT_LINE	;TIBETAN MARK HALANTA;Mn;9;ON;;;;;N;TIBETAN VIRAMA;;;; 
static	TokenNamestatic	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
token_grapheme	TokenNameIdentifier	 token grapheme
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
Token	TokenNameIdentifier	 Token
getGraphemePattern	TokenNameIdentifier	 get Grapheme Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_grapheme	TokenNameIdentifier	 token grapheme
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_grapheme	TokenNameIdentifier	 token grapheme
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
base_char	TokenNameIdentifier	 base char
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// [{ASSIGNED}]-[{M},{C}] 	TokenNameCOMMENT_LINE	[{ASSIGNED}]-[{M},{C}] 
base_char	TokenNameIdentifier	 base char
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"ASSIGNED"	TokenNameStringLiteral	ASSIGNED
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base_char	TokenNameIdentifier	 base char
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base_char	TokenNameIdentifier	 base char
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
virama	TokenNameIdentifier	 virama
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
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
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
viramaString	TokenNameIdentifier	 virama String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
virama	TokenNameIdentifier	 virama
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
combiner_wo_virama	TokenNameIdentifier	 combiner wo virama
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
combiner_wo_virama	TokenNameIdentifier	 combiner wo virama
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
combiner_wo_virama	TokenNameIdentifier	 combiner wo virama
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0x1160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hangul_medial and hangul_final 	TokenNameCOMMENT_LINE	hangul_medial and hangul_final 
combiner_wo_virama	TokenNameIdentifier	 combiner wo virama
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
0xff9e	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xff9f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extras 	TokenNameCOMMENT_LINE	extras 
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// base_char? 	TokenNameCOMMENT_LINE	base_char? 
left	TokenNameIdentifier	 left
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
base_char	TokenNameIdentifier	 base char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_empty	TokenNameIdentifier	 token empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
virama	TokenNameIdentifier	 virama
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
combiner_wo_virama	TokenNameIdentifier	 combiner wo virama
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
foo	TokenNameIdentifier	 foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
foo	TokenNameIdentifier	 foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_grapheme	TokenNameIdentifier	 token grapheme
=	TokenNameEQUAL	
foo	TokenNameIdentifier	 foo
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_grapheme	TokenNameIdentifier	 token grapheme
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Combing Character Sequence in Perl 5.6. */	TokenNameCOMMENT_JAVADOC	 Combing Character Sequence in Perl 5.6. 
static	TokenNamestatic	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
token_ccs	TokenNameIdentifier	 token ccs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
Token	TokenNameIdentifier	 Token
getCombiningCharacterSequence	TokenNameIdentifier	 get Combining Character Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_ccs	TokenNameIdentifier	 token ccs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_ccs	TokenNameIdentifier	 token ccs
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// \pM* 	TokenNameCOMMENT_LINE	\pM* 
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
foo	TokenNameIdentifier	 foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// \PM + \pM* 	TokenNameCOMMENT_LINE	\PM + \pM* 
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_ccs	TokenNameIdentifier	 token ccs
=	TokenNameEQUAL	
foo	TokenNameIdentifier	 foo
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_ccs	TokenNameIdentifier	 token ccs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
/** * This class represents a node in parse tree. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. 
static	TokenNamestatic	
class	TokenNameclass	
StringToken	TokenNameIdentifier	 String Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4614366944218504172L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getReferenceNumber	TokenNameIdentifier	 get Reference Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for STRING 	TokenNameCOMMENT_LINE	for STRING 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for STRING 	TokenNameCOMMENT_LINE	for STRING 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
)	TokenNameRPAREN	
return	TokenNamereturn	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
quoteMeta	TokenNameIdentifier	 quote Meta
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents a node in parse tree. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. 
static	TokenNamestatic	
class	TokenNameclass	
ConcatToken	TokenNameIdentifier	 Concat Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8717321425541346381L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
child2	TokenNameIdentifier	 child2
;	TokenNameSEMICOLON	
ConcatToken	TokenNameIdentifier	 Concat Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CONCAT	TokenNameIdentifier	 CONCAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CLOSURE	TokenNameIdentifier	 CLOSURE
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+?"	TokenNameStringLiteral	+?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents a node in parse tree. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. 
static	TokenNamestatic	
class	TokenNameclass	
CharToken	TokenNameIdentifier	 Char Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4394272816279496989L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
CharToken	TokenNameIdentifier	 Char Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\f"	TokenNameStringLiteral	\f
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\n"	TokenNameStringLiteral	\n
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\r"	TokenNameStringLiteral	\r
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\t"	TokenNameStringLiteral	\t
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x1b	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\e"	TokenNameStringLiteral	\e
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
//case 0x0b: ret = "\\v"; break; 	TokenNameCOMMENT_LINE	case 0x0b: ret = "\\v"; break; 
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\v"	TokenNameStringLiteral	\v
+	TokenNamePLUS	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_linebeginning	TokenNameIdentifier	 token linebeginning
||	TokenNameOR_OR	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_lineend	TokenNameIdentifier	 token lineend
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"NFAArrow#match(): Internal error: "	TokenNameStringLiteral	NFAArrow#match(): Internal error: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents a node in parse tree. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. 
static	TokenNamestatic	
class	TokenNameclass	
ClosureToken	TokenNameIdentifier	 Closure Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1308971930673997452L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
ClosureToken	TokenNameIdentifier	 Closure Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CLOSURE	TokenNameIdentifier	 CLOSURE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
",}"	TokenNameStringLiteral	,}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#toString(): CLOSURE "	TokenNameStringLiteral	Token#toString(): CLOSURE 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"*?"	TokenNameStringLiteral	*?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}?"	TokenNameStringLiteral	}?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}?"	TokenNameStringLiteral	}?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
",}?"	TokenNameStringLiteral	,}?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Token#toString(): NONGREEDYCLOSURE "	TokenNameStringLiteral	Token#toString(): NONGREEDYCLOSURE 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents a node in parse tree. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. 
static	TokenNamestatic	
class	TokenNameclass	
ParenToken	TokenNameIdentifier	 Paren Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5938014719827987704L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
parennumber	TokenNameIdentifier	 parennumber
;	TokenNameSEMICOLON	
ParenToken	TokenNameIdentifier	 Paren Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
paren	TokenNameIdentifier	 paren
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
=	TokenNameEQUAL	
paren	TokenNameIdentifier	 paren
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?:"	TokenNameStringLiteral	(?:
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?="	TokenNameStringLiteral	(?=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?!"	TokenNameStringLiteral	(?!
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?<="	TokenNameStringLiteral	(?<=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?<!"	TokenNameStringLiteral	(?<!
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?>"	TokenNameStringLiteral	(?>
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * (?(condition)yes-pattern|no-pattern) */	TokenNameCOMMENT_JAVADOC	 (?(condition)yes-pattern|no-pattern) 
static	TokenNamestatic	
class	TokenNameclass	
ConditionToken	TokenNameIdentifier	 Condition Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4353765277910594411L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
yes	TokenNameIdentifier	 yes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
ConditionToken	TokenNameIdentifier	 Condition Token
(	TokenNameLPAREN	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
cond	TokenNameIdentifier	 cond
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
yespat	TokenNameIdentifier	 yespat
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
nopat	TokenNameIdentifier	 nopat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CONDITION	TokenNameIdentifier	 CONDITION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
=	TokenNameEQUAL	
refno	TokenNameIdentifier	 refno
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
cond	TokenNameIdentifier	 cond
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
=	TokenNameEQUAL	
yespat	TokenNameIdentifier	 yespat
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
=	TokenNameEQUAL	
nopat	TokenNameIdentifier	 nopat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: "	TokenNameStringLiteral	Internal Error: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refNumber	TokenNameIdentifier	 ref Number
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?("	TokenNameStringLiteral	(?(
+	TokenNamePLUS	
refNumber	TokenNameIdentifier	 ref Number
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?("	TokenNameStringLiteral	(?(
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
"(?"	TokenNameStringLiteral	(?
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * (ims-ims: .... ) */	TokenNameCOMMENT_JAVADOC	 (ims-ims: .... ) 
static	TokenNamestatic	
class	TokenNameclass	
ModifierToken	TokenNameIdentifier	 Modifier Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
9114536559696480356L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
ModifierToken	TokenNameIdentifier	 Modifier Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
=	TokenNameEQUAL	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getOptionsMask	TokenNameIdentifier	 get Options Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"(?"	TokenNameStringLiteral	(?
+	TokenNamePLUS	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
createOptionString	TokenNameIdentifier	 create Option String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mask	TokenNameIdentifier	 mask
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
createOptionString	TokenNameIdentifier	 create Option String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents a node in parse tree. * for UNION or CONCAT. */	TokenNameCOMMENT_JAVADOC	 This class represents a node in parse tree. for UNION or CONCAT. 
static	TokenNamestatic	
class	TokenNameclass	
UnionToken	TokenNameIdentifier	 Union Token
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2568843945989489861L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
UnionToken	TokenNameIdentifier	 Union Token
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
UNION	TokenNameIdentifier	 UNION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is CONCAT, and new child is CONCAT. 	TokenNameCOMMENT_LINE	This is CONCAT, and new child is CONCAT. 
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CONCAT	TokenNameIdentifier	 CONCAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Recursion 	TokenNameCOMMENT_LINE	Recursion 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
||	TokenNameOR_OR	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
||	TokenNameOR_OR	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.err.println("Merge '"+previous+"' and '"+tok+"'."); 	TokenNameCOMMENT_LINE	System.err.println("Merge '"+previous+"' and '"+tok+"'."); 
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
int	TokenNameint	
nextMaxLength	TokenNameIdentifier	 next Max Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Replace previous token by STRING 	TokenNameCOMMENT_LINE	Replace previous token by STRING 
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
nextMaxLength	TokenNameIdentifier	 next Max Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
decomposeToSurrogates	TokenNameIdentifier	 decompose To Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// STRING 	TokenNameCOMMENT_LINE	STRING 
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
nextMaxLength	TokenNameIdentifier	 next Max Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
decomposeToSurrogates	TokenNameIdentifier	 decompose To Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringToken	TokenNameIdentifier	 String Token
)	TokenNameRPAREN	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CONCAT	TokenNameIdentifier	 CONCAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
CLOSURE	TokenNameIdentifier	 CLOSURE
&&	TokenNameAND_AND	
ch2	TokenNameIdentifier	 ch2
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
&&	TokenNameAND_AND	
ch2	TokenNameIdentifier	 ch2
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+?"	TokenNameStringLiteral	+?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
ch2	TokenNameIdentifier	 ch2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
