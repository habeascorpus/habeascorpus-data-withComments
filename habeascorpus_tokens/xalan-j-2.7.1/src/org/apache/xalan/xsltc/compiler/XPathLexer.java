/* * Copyright 2001-2004 The Apache Software Foundation. * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Copyright 2001-2004 The Apache Software Foundation. * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: xpath.lex 351910 2005-12-03 10:55:53Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: xpath.lex 351910 2005-12-03 10:55:53Z zongaro $ 
/* * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen * */	TokenNameCOMMENT_BLOCK	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java_cup	TokenNameIdentifier	 java cup
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
Symbol	TokenNameIdentifier	 Symbol
;	TokenNameSEMICOLON	
class	TokenNameclass	
XPathLexer	TokenNameIdentifier	 X Path Lexer
implements	TokenNameimplements	
java_cup	TokenNameIdentifier	 java cup
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
Scanner	TokenNameIdentifier	 Scanner
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_BUFFER_SIZE	TokenNameIdentifier	 YY  BUFFER  SIZE
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_F	TokenNameIdentifier	 YY  F
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_START	TokenNameIdentifier	 YY  START
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_END	TokenNameIdentifier	 YY  END
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_BOL	TokenNameIdentifier	 YY  BOL
=	TokenNameEQUAL	
65536	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_EOF	TokenNameIdentifier	 YY  EOF
=	TokenNameEQUAL	
65537	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
YYEOF	TokenNameIdentifier	 YYEOF
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If symbol is not followed by '::' or '(', then treat it as a * name instead of an axis or function (Jira-1912). */	TokenNameCOMMENT_JAVADOC	 If symbol is not followed by '::' or '(', then treat it as a name instead of an axis or function (Jira-1912). 
Symbol	TokenNameIdentifier	 Symbol
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Peek in the input buffer without changing the internal state 	TokenNameCOMMENT_LINE	Peek in the input buffer without changing the internal state 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
;	TokenNameSEMICOLON	
// Skip whitespace 	TokenNameCOMMENT_LINE	Skip whitespace 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
&&	TokenNameAND_AND	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If end of buffer, can't disambiguate :( 	TokenNameCOMMENT_LINE	If end of buffer, can't disambiguate :( 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can't disambiguate, so return as symbol 	TokenNameCOMMENT_LINE	Can't disambiguate, so return as symbol 
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return symbol if next token is '::' or '(' 	TokenNameCOMMENT_LINE	Return symbol if next token is '::' or '(' 
return	TokenNamereturn	
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
:	TokenNameCOLON	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If symbol is first token or if it follows any of the operators * listed in http://www.w3.org/TR/xpath#exprlex then treat as a * name instead of a keyword (Jira-1912). */	TokenNameCOMMENT_JAVADOC	 If symbol is first token or if it follows any of the operators listed in http://www.w3.org/TR/xpath#exprlex then treat as a name instead of a keyword (Jira-1912). 
Symbol	TokenNameIdentifier	 Symbol
disambiguateOperator	TokenNameIdentifier	 disambiguate Operator
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// first token 	TokenNameCOMMENT_LINE	first token 
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ATSIGN	TokenNameIdentifier	 ATSIGN
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DCOLON	TokenNameIdentifier	 DCOLON
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LPAREN	TokenNameIdentifier	 LPAREN
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LBRACK	TokenNameIdentifier	 LBRACK
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
AND	TokenNameIdentifier	 AND
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
OR	TokenNameIdentifier	 OR
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MOD	TokenNameIdentifier	 MOD
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DIV	TokenNameIdentifier	 DIV
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MULT	TokenNameIdentifier	 MULT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
SLASH	TokenNameIdentifier	 SLASH
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DSLASH	TokenNameIdentifier	 DSLASH
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
VBAR	TokenNameIdentifier	 VBAR
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MINUS	TokenNameIdentifier	 MINUS
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NE	TokenNameIdentifier	 NE
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LE	TokenNameIdentifier	 LE
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GT	TokenNameIdentifier	 GT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GE	TokenNameIdentifier	 GE
:	TokenNameCOLON	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If symbol is first token or if it follows any of the operators * listed in http://www.w3.org/TR/xpath#exprlex then treat as a * wildcard instead of a multiplication operator */	TokenNameCOMMENT_JAVADOC	 If symbol is first token or if it follows any of the operators listed in http://www.w3.org/TR/xpath#exprlex then treat as a wildcard instead of a multiplication operator 
Symbol	TokenNameIdentifier	 Symbol
disambiguateStar	TokenNameIdentifier	 disambiguate Star
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// first token 	TokenNameCOMMENT_LINE	first token 
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ATSIGN	TokenNameIdentifier	 ATSIGN
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DCOLON	TokenNameIdentifier	 DCOLON
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LPAREN	TokenNameIdentifier	 LPAREN
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LBRACK	TokenNameIdentifier	 LBRACK
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
AND	TokenNameIdentifier	 AND
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
OR	TokenNameIdentifier	 OR
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MOD	TokenNameIdentifier	 MOD
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DIV	TokenNameIdentifier	 DIV
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MULT	TokenNameIdentifier	 MULT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
SLASH	TokenNameIdentifier	 SLASH
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DSLASH	TokenNameIdentifier	 DSLASH
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
VBAR	TokenNameIdentifier	 VBAR
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MINUS	TokenNameIdentifier	 MINUS
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NE	TokenNameIdentifier	 NE
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LE	TokenNameIdentifier	 LE
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GT	TokenNameIdentifier	 GT
:	TokenNameCOLON	
case	TokenNamecase	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GE	TokenNameIdentifier	 GE
:	TokenNameCOLON	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
STAR	TokenNameIdentifier	 STAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MULT	TokenNameIdentifier	 MULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Symbol	TokenNameIdentifier	 Symbol
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Symbol	TokenNameIdentifier	 Symbol
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Symbol	TokenNameIdentifier	 Symbol
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Symbol	TokenNameIdentifier	 Symbol
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
yy_reader	TokenNameIdentifier	 yy reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
yy_at_bol	TokenNameIdentifier	 yy at bol
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
yy_lexical_state	TokenNameIdentifier	 yy lexical state
;	TokenNameSEMICOLON	
XPathLexer	TokenNameIdentifier	 X Path Lexer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Error: Bad input stream initializer."	TokenNameStringLiteral	Error: Bad input stream initializer.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_reader	TokenNameIdentifier	 yy reader
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XPathLexer	TokenNameIdentifier	 X Path Lexer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
instream	TokenNameIdentifier	 instream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
instream	TokenNameIdentifier	 instream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Error: Bad input stream initializer."	TokenNameStringLiteral	Error: Bad input stream initializer.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_reader	TokenNameIdentifier	 yy reader
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
instream	TokenNameIdentifier	 instream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
XPathLexer	TokenNameIdentifier	 X Path Lexer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer	TokenNameIdentifier	 yy buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
YY_BUFFER_SIZE	TokenNameIdentifier	 YY  BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yy_at_bol	TokenNameIdentifier	 yy at bol
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
yy_lexical_state	TokenNameIdentifier	 yy lexical state
=	TokenNameEQUAL	
YYINITIAL	TokenNameIdentifier	 YYINITIAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
yy_eof_done	TokenNameIdentifier	 yy eof done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YYINITIAL	TokenNameIdentifier	 YYINITIAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
yy_state_dtrans	TokenNameIdentifier	 yy state dtrans
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
yybegin	TokenNameIdentifier	 yybegin
(	TokenNameLPAREN	
int	TokenNameint	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_lexical_state	TokenNameIdentifier	 yy lexical state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
yy_advance	TokenNameIdentifier	 yy advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
next_read	TokenNameIdentifier	 next read
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
<	TokenNameLESS	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
=	TokenNameEQUAL	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
;	TokenNameSEMICOLON	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
next_read	TokenNameIdentifier	 next read
=	TokenNameEQUAL	
yy_reader	TokenNameIdentifier	 yy reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
,	TokenNameCOMMA	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
,	TokenNameCOMMA	
yy_buffer	TokenNameIdentifier	 yy buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
next_read	TokenNameIdentifier	 next read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
YY_EOF	TokenNameIdentifier	 YY  EOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
=	TokenNameEQUAL	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
+	TokenNamePLUS	
next_read	TokenNameIdentifier	 next read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
>=	TokenNameGREATER_EQUAL	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
>=	TokenNameGREATER_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer	TokenNameIdentifier	 yy buffer
=	TokenNameEQUAL	
yy_double	TokenNameIdentifier	 yy double
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next_read	TokenNameIdentifier	 next read
=	TokenNameEQUAL	
yy_reader	TokenNameIdentifier	 yy reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
,	TokenNameCOMMA	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
,	TokenNameCOMMA	
yy_buffer	TokenNameIdentifier	 yy buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
next_read	TokenNameIdentifier	 next read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
YY_EOF	TokenNameIdentifier	 YY  EOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
=	TokenNameEQUAL	
yy_buffer_read	TokenNameIdentifier	 yy buffer read
+	TokenNamePLUS	
next_read	TokenNameIdentifier	 next read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
yy_move_end	TokenNameIdentifier	 yy move end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
>	TokenNameGREATER	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
&&	TokenNameAND_AND	
'\n'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
>	TokenNameGREATER	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
&&	TokenNameAND_AND	
'\r'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
yy_last_was_cr	TokenNameIdentifier	 yy last was cr
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
yy_mark_start	TokenNameIdentifier	 yy mark start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
=	TokenNameEQUAL	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
yy_mark_end	TokenNameIdentifier	 yy mark end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
=	TokenNameEQUAL	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
yy_to_mark	TokenNameIdentifier	 yy to mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_buffer_index	TokenNameIdentifier	 yy buffer index
=	TokenNameEQUAL	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
;	TokenNameSEMICOLON	
yy_at_bol	TokenNameIdentifier	 yy at bol
=	TokenNameEQUAL	
(	TokenNameLPAREN	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
>	TokenNameGREATER	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
'\n'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
2028	TokenNameIntegerLiteral	
/*LS*/	TokenNameCOMMENT_BLOCK	LS
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
2029	TokenNameIntegerLiteral	
/*PS*/	TokenNameCOMMENT_BLOCK	PS
==	TokenNameEQUAL_EQUAL	
yy_buffer	TokenNameIdentifier	 yy buffer
[	TokenNameLBRACKET	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
yy_buffer	TokenNameIdentifier	 yy buffer
,	TokenNameCOMMA	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
,	TokenNameCOMMA	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yy_buffer_end	TokenNameIdentifier	 yy buffer end
-	TokenNameMINUS	
yy_buffer_start	TokenNameIdentifier	 yy buffer start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yy_double	TokenNameIdentifier	 yy double
(	TokenNameLPAREN	
char	TokenNamechar	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
char	TokenNamechar	
newbuf	TokenNameIdentifier	 newbuf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newbuf	TokenNameIdentifier	 newbuf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newbuf	TokenNameIdentifier	 newbuf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newbuf	TokenNameIdentifier	 newbuf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_E_INTERNAL	TokenNameIdentifier	 YY  E  INTERNAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
YY_E_MATCH	TokenNameIdentifier	 YY  E  MATCH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
yy_error_string	TokenNameIdentifier	 yy error string
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Error: Internal error. "	TokenNameStringLiteral	Error: Internal error. 
,	TokenNameCOMMA	
"Error: Unmatched input. "	TokenNameStringLiteral	Error: Unmatched input. 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
yy_error	TokenNameIdentifier	 yy error
(	TokenNameLPAREN	
int	TokenNameint	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fatal	TokenNameIdentifier	 fatal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
yy_error_string	TokenNameIdentifier	 yy error string
[	TokenNameLBRACKET	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fatal	TokenNameIdentifier	 fatal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Fatal Error. "	TokenNameStringLiteral	Fatal Error. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unpackFromString	TokenNameIdentifier	 unpack From String
(	TokenNameLPAREN	
int	TokenNameint	
size1	TokenNameIdentifier	 size1
,	TokenNameCOMMA	
int	TokenNameint	
size2	TokenNameIdentifier	 size2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lengthString	TokenNameIdentifier	 length String
;	TokenNameSEMICOLON	
int	TokenNameint	
sequenceLength	TokenNameIdentifier	 sequence Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sequenceInteger	TokenNameIdentifier	 sequence Integer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
commaIndex	TokenNameIdentifier	 comma Index
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
workString	TokenNameIdentifier	 work String
;	TokenNameSEMICOLON	
int	TokenNameint	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size1	TokenNameIdentifier	 size1
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
size2	TokenNameIdentifier	 size2
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
size1	TokenNameIdentifier	 size1
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
size2	TokenNameIdentifier	 size2
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sequenceLength	TokenNameIdentifier	 sequence Length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sequenceInteger	TokenNameIdentifier	 sequence Integer
;	TokenNameSEMICOLON	
sequenceLength	TokenNameIdentifier	 sequence Length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commaIndex	TokenNameIdentifier	 comma Index
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workString	TokenNameIdentifier	 work String
=	TokenNameEQUAL	
(	TokenNameLPAREN	
commaIndex	TokenNameIdentifier	 comma Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
commaIndex	TokenNameIdentifier	 comma Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
commaIndex	TokenNameIdentifier	 comma Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
workString	TokenNameIdentifier	 work String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
workString	TokenNameIdentifier	 work String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthString	TokenNameIdentifier	 length String
=	TokenNameEQUAL	
workString	TokenNameIdentifier	 work String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sequenceLength	TokenNameIdentifier	 sequence Length
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
lengthString	TokenNameIdentifier	 length String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workString	TokenNameIdentifier	 work String
=	TokenNameEQUAL	
workString	TokenNameIdentifier	 work String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonIndex	TokenNameIdentifier	 colon Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sequenceInteger	TokenNameIdentifier	 sequence Integer
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
workString	TokenNameIdentifier	 work String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sequenceInteger	TokenNameIdentifier	 sequence Integer
;	TokenNameSEMICOLON	
sequenceLength	TokenNameIdentifier	 sequence Length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
yy_acpt	TokenNameIdentifier	 yy acpt
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
/* 0 */	TokenNameCOMMENT_BLOCK	 0 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 1 */	TokenNameCOMMENT_BLOCK	 1 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 2 */	TokenNameCOMMENT_BLOCK	 2 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 3 */	TokenNameCOMMENT_BLOCK	 3 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 4 */	TokenNameCOMMENT_BLOCK	 4 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 5 */	TokenNameCOMMENT_BLOCK	 5 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 6 */	TokenNameCOMMENT_BLOCK	 6 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 7 */	TokenNameCOMMENT_BLOCK	 7 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 8 */	TokenNameCOMMENT_BLOCK	 8 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 9 */	TokenNameCOMMENT_BLOCK	 9 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 10 */	TokenNameCOMMENT_BLOCK	 10 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 11 */	TokenNameCOMMENT_BLOCK	 11 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 12 */	TokenNameCOMMENT_BLOCK	 12 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 13 */	TokenNameCOMMENT_BLOCK	 13 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 14 */	TokenNameCOMMENT_BLOCK	 14 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 15 */	TokenNameCOMMENT_BLOCK	 15 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 16 */	TokenNameCOMMENT_BLOCK	 16 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 17 */	TokenNameCOMMENT_BLOCK	 17 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 18 */	TokenNameCOMMENT_BLOCK	 18 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 19 */	TokenNameCOMMENT_BLOCK	 19 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 20 */	TokenNameCOMMENT_BLOCK	 20 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 21 */	TokenNameCOMMENT_BLOCK	 21 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 22 */	TokenNameCOMMENT_BLOCK	 22 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 23 */	TokenNameCOMMENT_BLOCK	 23 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 24 */	TokenNameCOMMENT_BLOCK	 24 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 25 */	TokenNameCOMMENT_BLOCK	 25 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 26 */	TokenNameCOMMENT_BLOCK	 26 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 27 */	TokenNameCOMMENT_BLOCK	 27 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 28 */	TokenNameCOMMENT_BLOCK	 28 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 29 */	TokenNameCOMMENT_BLOCK	 29 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 30 */	TokenNameCOMMENT_BLOCK	 30 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 31 */	TokenNameCOMMENT_BLOCK	 31 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 32 */	TokenNameCOMMENT_BLOCK	 32 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 33 */	TokenNameCOMMENT_BLOCK	 33 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 34 */	TokenNameCOMMENT_BLOCK	 34 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 35 */	TokenNameCOMMENT_BLOCK	 35 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 36 */	TokenNameCOMMENT_BLOCK	 36 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 37 */	TokenNameCOMMENT_BLOCK	 37 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 38 */	TokenNameCOMMENT_BLOCK	 38 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 39 */	TokenNameCOMMENT_BLOCK	 39 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 40 */	TokenNameCOMMENT_BLOCK	 40 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 41 */	TokenNameCOMMENT_BLOCK	 41 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 42 */	TokenNameCOMMENT_BLOCK	 42 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 43 */	TokenNameCOMMENT_BLOCK	 43 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 44 */	TokenNameCOMMENT_BLOCK	 44 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 45 */	TokenNameCOMMENT_BLOCK	 45 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 46 */	TokenNameCOMMENT_BLOCK	 46 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 47 */	TokenNameCOMMENT_BLOCK	 47 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 48 */	TokenNameCOMMENT_BLOCK	 48 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 49 */	TokenNameCOMMENT_BLOCK	 49 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 50 */	TokenNameCOMMENT_BLOCK	 50 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 51 */	TokenNameCOMMENT_BLOCK	 51 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 52 */	TokenNameCOMMENT_BLOCK	 52 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 53 */	TokenNameCOMMENT_BLOCK	 53 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 54 */	TokenNameCOMMENT_BLOCK	 54 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 55 */	TokenNameCOMMENT_BLOCK	 55 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 56 */	TokenNameCOMMENT_BLOCK	 56 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 57 */	TokenNameCOMMENT_BLOCK	 57 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 58 */	TokenNameCOMMENT_BLOCK	 58 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 59 */	TokenNameCOMMENT_BLOCK	 59 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 60 */	TokenNameCOMMENT_BLOCK	 60 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 61 */	TokenNameCOMMENT_BLOCK	 61 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 62 */	TokenNameCOMMENT_BLOCK	 62 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 63 */	TokenNameCOMMENT_BLOCK	 63 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 64 */	TokenNameCOMMENT_BLOCK	 64 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 65 */	TokenNameCOMMENT_BLOCK	 65 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 66 */	TokenNameCOMMENT_BLOCK	 66 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 67 */	TokenNameCOMMENT_BLOCK	 67 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 68 */	TokenNameCOMMENT_BLOCK	 68 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 69 */	TokenNameCOMMENT_BLOCK	 69 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 70 */	TokenNameCOMMENT_BLOCK	 70 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 71 */	TokenNameCOMMENT_BLOCK	 71 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 72 */	TokenNameCOMMENT_BLOCK	 72 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 73 */	TokenNameCOMMENT_BLOCK	 73 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 74 */	TokenNameCOMMENT_BLOCK	 74 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 75 */	TokenNameCOMMENT_BLOCK	 75 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 76 */	TokenNameCOMMENT_BLOCK	 76 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 77 */	TokenNameCOMMENT_BLOCK	 77 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 78 */	TokenNameCOMMENT_BLOCK	 78 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 79 */	TokenNameCOMMENT_BLOCK	 79 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 80 */	TokenNameCOMMENT_BLOCK	 80 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 81 */	TokenNameCOMMENT_BLOCK	 81 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 82 */	TokenNameCOMMENT_BLOCK	 82 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 83 */	TokenNameCOMMENT_BLOCK	 83 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 84 */	TokenNameCOMMENT_BLOCK	 84 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 85 */	TokenNameCOMMENT_BLOCK	 85 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 86 */	TokenNameCOMMENT_BLOCK	 86 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 87 */	TokenNameCOMMENT_BLOCK	 87 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 88 */	TokenNameCOMMENT_BLOCK	 88 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 89 */	TokenNameCOMMENT_BLOCK	 89 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 90 */	TokenNameCOMMENT_BLOCK	 90 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 91 */	TokenNameCOMMENT_BLOCK	 91 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 92 */	TokenNameCOMMENT_BLOCK	 92 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 93 */	TokenNameCOMMENT_BLOCK	 93 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 94 */	TokenNameCOMMENT_BLOCK	 94 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 95 */	TokenNameCOMMENT_BLOCK	 95 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 96 */	TokenNameCOMMENT_BLOCK	 96 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 97 */	TokenNameCOMMENT_BLOCK	 97 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 98 */	TokenNameCOMMENT_BLOCK	 98 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 99 */	TokenNameCOMMENT_BLOCK	 99 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 100 */	TokenNameCOMMENT_BLOCK	 100 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 101 */	TokenNameCOMMENT_BLOCK	 101 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 102 */	TokenNameCOMMENT_BLOCK	 102 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 103 */	TokenNameCOMMENT_BLOCK	 103 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 104 */	TokenNameCOMMENT_BLOCK	 104 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 105 */	TokenNameCOMMENT_BLOCK	 105 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 106 */	TokenNameCOMMENT_BLOCK	 106 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 107 */	TokenNameCOMMENT_BLOCK	 107 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 108 */	TokenNameCOMMENT_BLOCK	 108 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 109 */	TokenNameCOMMENT_BLOCK	 109 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 110 */	TokenNameCOMMENT_BLOCK	 110 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 111 */	TokenNameCOMMENT_BLOCK	 111 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 112 */	TokenNameCOMMENT_BLOCK	 112 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 113 */	TokenNameCOMMENT_BLOCK	 113 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 114 */	TokenNameCOMMENT_BLOCK	 114 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 115 */	TokenNameCOMMENT_BLOCK	 115 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 116 */	TokenNameCOMMENT_BLOCK	 116 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 117 */	TokenNameCOMMENT_BLOCK	 117 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 118 */	TokenNameCOMMENT_BLOCK	 118 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 119 */	TokenNameCOMMENT_BLOCK	 119 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 120 */	TokenNameCOMMENT_BLOCK	 120 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 121 */	TokenNameCOMMENT_BLOCK	 121 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 122 */	TokenNameCOMMENT_BLOCK	 122 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 123 */	TokenNameCOMMENT_BLOCK	 123 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 124 */	TokenNameCOMMENT_BLOCK	 124 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 125 */	TokenNameCOMMENT_BLOCK	 125 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 126 */	TokenNameCOMMENT_BLOCK	 126 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 127 */	TokenNameCOMMENT_BLOCK	 127 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 128 */	TokenNameCOMMENT_BLOCK	 128 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 129 */	TokenNameCOMMENT_BLOCK	 129 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 130 */	TokenNameCOMMENT_BLOCK	 130 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 131 */	TokenNameCOMMENT_BLOCK	 131 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 132 */	TokenNameCOMMENT_BLOCK	 132 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 133 */	TokenNameCOMMENT_BLOCK	 133 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 134 */	TokenNameCOMMENT_BLOCK	 134 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 135 */	TokenNameCOMMENT_BLOCK	 135 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 136 */	TokenNameCOMMENT_BLOCK	 136 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 137 */	TokenNameCOMMENT_BLOCK	 137 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 138 */	TokenNameCOMMENT_BLOCK	 138 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 139 */	TokenNameCOMMENT_BLOCK	 139 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 140 */	TokenNameCOMMENT_BLOCK	 140 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 141 */	TokenNameCOMMENT_BLOCK	 141 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 142 */	TokenNameCOMMENT_BLOCK	 142 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 143 */	TokenNameCOMMENT_BLOCK	 143 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 144 */	TokenNameCOMMENT_BLOCK	 144 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 145 */	TokenNameCOMMENT_BLOCK	 145 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 146 */	TokenNameCOMMENT_BLOCK	 146 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 147 */	TokenNameCOMMENT_BLOCK	 147 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 148 */	TokenNameCOMMENT_BLOCK	 148 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 149 */	TokenNameCOMMENT_BLOCK	 149 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 150 */	TokenNameCOMMENT_BLOCK	 150 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 151 */	TokenNameCOMMENT_BLOCK	 151 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 152 */	TokenNameCOMMENT_BLOCK	 152 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 153 */	TokenNameCOMMENT_BLOCK	 153 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 154 */	TokenNameCOMMENT_BLOCK	 154 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 155 */	TokenNameCOMMENT_BLOCK	 155 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 156 */	TokenNameCOMMENT_BLOCK	 156 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 157 */	TokenNameCOMMENT_BLOCK	 157 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 158 */	TokenNameCOMMENT_BLOCK	 158 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 159 */	TokenNameCOMMENT_BLOCK	 159 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 160 */	TokenNameCOMMENT_BLOCK	 160 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 161 */	TokenNameCOMMENT_BLOCK	 161 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 162 */	TokenNameCOMMENT_BLOCK	 162 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 163 */	TokenNameCOMMENT_BLOCK	 163 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 164 */	TokenNameCOMMENT_BLOCK	 164 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 165 */	TokenNameCOMMENT_BLOCK	 165 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 166 */	TokenNameCOMMENT_BLOCK	 166 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 167 */	TokenNameCOMMENT_BLOCK	 167 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 168 */	TokenNameCOMMENT_BLOCK	 168 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 169 */	TokenNameCOMMENT_BLOCK	 169 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 170 */	TokenNameCOMMENT_BLOCK	 170 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 171 */	TokenNameCOMMENT_BLOCK	 171 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 172 */	TokenNameCOMMENT_BLOCK	 172 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 173 */	TokenNameCOMMENT_BLOCK	 173 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 174 */	TokenNameCOMMENT_BLOCK	 174 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 175 */	TokenNameCOMMENT_BLOCK	 175 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 176 */	TokenNameCOMMENT_BLOCK	 176 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 177 */	TokenNameCOMMENT_BLOCK	 177 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 178 */	TokenNameCOMMENT_BLOCK	 178 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 179 */	TokenNameCOMMENT_BLOCK	 179 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 180 */	TokenNameCOMMENT_BLOCK	 180 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 181 */	TokenNameCOMMENT_BLOCK	 181 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 182 */	TokenNameCOMMENT_BLOCK	 182 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 183 */	TokenNameCOMMENT_BLOCK	 183 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 184 */	TokenNameCOMMENT_BLOCK	 184 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 185 */	TokenNameCOMMENT_BLOCK	 185 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 186 */	TokenNameCOMMENT_BLOCK	 186 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 187 */	TokenNameCOMMENT_BLOCK	 187 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 188 */	TokenNameCOMMENT_BLOCK	 188 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 189 */	TokenNameCOMMENT_BLOCK	 189 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 190 */	TokenNameCOMMENT_BLOCK	 190 
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
,	TokenNameCOMMA	
/* 191 */	TokenNameCOMMENT_BLOCK	 191 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 192 */	TokenNameCOMMENT_BLOCK	 192 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 193 */	TokenNameCOMMENT_BLOCK	 193 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 194 */	TokenNameCOMMENT_BLOCK	 194 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 195 */	TokenNameCOMMENT_BLOCK	 195 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 196 */	TokenNameCOMMENT_BLOCK	 196 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 197 */	TokenNameCOMMENT_BLOCK	 197 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 198 */	TokenNameCOMMENT_BLOCK	 198 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 199 */	TokenNameCOMMENT_BLOCK	 199 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 200 */	TokenNameCOMMENT_BLOCK	 200 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 201 */	TokenNameCOMMENT_BLOCK	 201 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 202 */	TokenNameCOMMENT_BLOCK	 202 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 203 */	TokenNameCOMMENT_BLOCK	 203 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 204 */	TokenNameCOMMENT_BLOCK	 204 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 205 */	TokenNameCOMMENT_BLOCK	 205 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 206 */	TokenNameCOMMENT_BLOCK	 206 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 207 */	TokenNameCOMMENT_BLOCK	 207 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 208 */	TokenNameCOMMENT_BLOCK	 208 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 209 */	TokenNameCOMMENT_BLOCK	 209 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 210 */	TokenNameCOMMENT_BLOCK	 210 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 211 */	TokenNameCOMMENT_BLOCK	 211 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 212 */	TokenNameCOMMENT_BLOCK	 212 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 213 */	TokenNameCOMMENT_BLOCK	 213 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 214 */	TokenNameCOMMENT_BLOCK	 214 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 215 */	TokenNameCOMMENT_BLOCK	 215 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 216 */	TokenNameCOMMENT_BLOCK	 216 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 217 */	TokenNameCOMMENT_BLOCK	 217 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 218 */	TokenNameCOMMENT_BLOCK	 218 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 219 */	TokenNameCOMMENT_BLOCK	 219 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 220 */	TokenNameCOMMENT_BLOCK	 220 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 221 */	TokenNameCOMMENT_BLOCK	 221 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 222 */	TokenNameCOMMENT_BLOCK	 222 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 223 */	TokenNameCOMMENT_BLOCK	 223 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 224 */	TokenNameCOMMENT_BLOCK	 224 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 225 */	TokenNameCOMMENT_BLOCK	 225 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 226 */	TokenNameCOMMENT_BLOCK	 226 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 227 */	TokenNameCOMMENT_BLOCK	 227 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 228 */	TokenNameCOMMENT_BLOCK	 228 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 229 */	TokenNameCOMMENT_BLOCK	 229 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 230 */	TokenNameCOMMENT_BLOCK	 230 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 231 */	TokenNameCOMMENT_BLOCK	 231 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 232 */	TokenNameCOMMENT_BLOCK	 232 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
,	TokenNameCOMMA	
/* 233 */	TokenNameCOMMENT_BLOCK	 233 
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
int	TokenNameint	
yy_cmap	TokenNameIdentifier	 yy cmap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
unpackFromString	TokenNameIdentifier	 unpack From String
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65538	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"54:9,27:2,54,27:2,54:18,27,17,53,54,15,54:2,55,25,26,1,3,11,4,13,2,56:10,10"	TokenNameStringLiteral	54:9,27:2,54,27:2,54:18,27,17,53,54,15,54:2,55,25,26,1,3,11,4,13,2,56:10,10
+	TokenNamePLUS	
",54,18,16,19,54,12,44,57:3,46,57:3,51,57:4,48,52,43,57,47,50,45,57:3,49,57:"	TokenNameStringLiteral	,54,18,16,19,54,12,44,57:3,46,57:3,51,57:4,48,52,43,57,47,50,45,57:3,49,57:
+	TokenNamePLUS	
"2,41,54,42,54,58,54,35,38,29,5,21,39,33,36,6,57,20,37,8,28,9,30,57,31,32,23"	TokenNameStringLiteral	2,41,54,42,54,58,54,35,38,29,5,21,39,33,36,6,57,20,37,8,28,9,30,57,31,32,23
+	TokenNamePLUS	
",34,7,40,24,22,57,54,14,54:58,60,54:8,57:23,54,57:31,54,57:58,58:2,57:11,58"	TokenNameStringLiteral	,34,7,40,24,22,57,54,14,54:58,60,54:8,57:23,54,57:31,54,57:58,58:2,57:11,58
+	TokenNamePLUS	
":2,57:8,58,57:53,58,57:68,58:9,57:36,58:3,57:2,58:4,57:30,58:56,57:89,58:18"	TokenNameStringLiteral	:2,57:8,58,57:53,58,57:68,58:9,57:36,58:3,57:2,58:4,57:30,58:56,57:89,58:18
+	TokenNamePLUS	
",57:7,58:62,60:70,54:26,60:2,54:14,58:14,54,58:7,57,58,57:3,58,57,58,57:20,"	TokenNameStringLiteral	,57:7,58:62,60:70,54:26,60:2,54:14,58:14,54,58:7,57,58,57:3,58,57,58,57:20,
+	TokenNamePLUS	
"58,57:44,58,57:7,58:3,57,58,57,58,57,58,57,58,57:18,58:13,57:12,58,57:66,58"	TokenNameStringLiteral	58,57:44,58,57:7,58:3,57,58,57,58,57,58,57,58,57:18,58:13,57:12,58,57:66,58
+	TokenNamePLUS	
",57:12,58,57:36,58:14,57:53,58:2,57:2,58:2,57:2,58:3,57:28,58:2,57:8,58:2,5"	TokenNameStringLiteral	,57:12,58,57:36,58:14,57:53,58:2,57:2,58:2,57:2,58:3,57:28,58:2,57:8,58:2,5
+	TokenNamePLUS	
"7:2,58:55,57:38,58:2,57,58:7,57:38,58:73,57:27,58:5,57:3,58:46,57:26,58:6,5"	TokenNameStringLiteral	7:2,58:55,57:38,58:2,57,58:7,57:38,58:73,57:27,58:5,57:3,58:46,57:26,58:6,5
+	TokenNamePLUS	
"7:10,58:21,59:10,58:7,57:71,58:2,57:5,58,57:15,58,57:4,58,57,58:15,57:2,58:"	TokenNameStringLiteral	7:10,58:21,59:10,58:7,57:71,58:2,57:5,58,57:15,58,57:4,58,57,58:15,57:2,58:
+	TokenNamePLUS	
"9,59:10,58:523,57:53,58:3,57,58:26,57:10,58:4,59:10,58:21,57:8,58:2,57:2,58"	TokenNameStringLiteral	9,59:10,58:523,57:53,58:3,57,58:26,57:10,58:4,59:10,58:21,57:8,58:2,57:2,58
+	TokenNamePLUS	
":2,57:22,58,57:7,58,57,58:3,57:4,58:34,57:2,58,57:3,58:4,59:10,57:2,58:19,5"	TokenNameStringLiteral	:2,57:22,58,57:7,58,57,58:3,57:4,58:34,57:2,58,57:3,58:4,59:10,57:2,58:19,5
+	TokenNamePLUS	
"7:6,58:4,57:2,58:2,57:22,58,57:7,58,57:2,58,57:2,58,57:2,58:31,57:4,58,57,5"	TokenNameStringLiteral	7:6,58:4,57:2,58:2,57:22,58,57:7,58,57:2,58,57:2,58,57:2,58:31,57:4,58,57,5
+	TokenNamePLUS	
"8:7,59:10,58:2,57:3,58:16,57:7,58,57,58,57:3,58,57:22,58,57:7,58,57:2,58,57"	TokenNameStringLiteral	8:7,59:10,58:2,57:3,58:16,57:7,58,57,58,57:3,58,57:22,58,57:7,58,57:2,58,57
+	TokenNamePLUS	
":5,58:3,57,58:34,57,58:5,59:10,58:21,57:8,58:2,57:2,58:2,57:22,58,57:7,58,5"	TokenNameStringLiteral	:5,58:3,57,58:34,57,58:5,59:10,58:21,57:8,58:2,57:2,58:2,57:22,58,57:7,58,5
+	TokenNamePLUS	
"7:2,58:2,57:4,58:3,57,58:30,57:2,58,57:3,58:4,59:10,58:21,57:6,58:3,57:3,58"	TokenNameStringLiteral	7:2,58:2,57:4,58:3,57,58:30,57:2,58,57:3,58:4,59:10,58:21,57:6,58:3,57:3,58
+	TokenNamePLUS	
",57:4,58:3,57:2,58,57,58,57:2,58:3,57:2,58:3,57:3,58:3,57:8,58,57:3,58:45,5"	TokenNameStringLiteral	,57:4,58:3,57:2,58,57,58,57:2,58:3,57:2,58:3,57:3,58:3,57:8,58,57:3,58:45,5
+	TokenNamePLUS	
"9:9,58:21,57:8,58,57:3,58,57:23,58,57:10,58,57:5,58:38,57:2,58:4,59:10,58:2"	TokenNameStringLiteral	9:9,58:21,57:8,58,57:3,58,57:23,58,57:10,58,57:5,58:38,57:2,58:4,59:10,58:2
+	TokenNamePLUS	
"1,57:8,58,57:3,58,57:23,58,57:10,58,57:5,58:36,57,58,57:2,58:4,59:10,58:21,"	TokenNameStringLiteral	1,57:8,58,57:3,58,57:23,58,57:10,58,57:5,58:36,57,58,57:2,58:4,59:10,58:21,
+	TokenNamePLUS	
"57:8,58,57:3,58,57:23,58,57:16,58:38,57:2,58:4,59:10,58:145,57:46,58,57,58,"	TokenNameStringLiteral	57:8,58,57:3,58,57:23,58,57:16,58:38,57:2,58:4,59:10,58:145,57:46,58,57,58,
+	TokenNamePLUS	
"57:2,58:12,57:6,58:10,59:10,58:39,57:2,58,57,58:2,57:2,58,57,58:2,57,58:6,5"	TokenNameStringLiteral	57:2,58:12,57:6,58:10,59:10,58:39,57:2,58,57,58:2,57:2,58,57,58:2,57,58:6,5
+	TokenNamePLUS	
"7:4,58,57:7,58,57:3,58,57,58,57,58:2,57:2,58,57:2,58,57,58,57:2,58:9,57,58:"	TokenNameStringLiteral	7:4,58,57:7,58,57:3,58,57,58,57,58:2,57:2,58,57:2,58,57,58,57:2,58:9,57,58:
+	TokenNamePLUS	
"2,57:5,58:11,59:10,58:70,59:10,58:22,57:8,58,57:33,58:310,57:38,58:10,57:39"	TokenNameStringLiteral	2,57:5,58:11,59:10,58:70,59:10,58:22,57:8,58,57:33,58:310,57:38,58:10,57:39
+	TokenNamePLUS	
",58:9,57,58,57:2,58,57:3,58,57,58,57:2,58,57:5,58:41,57,58,57,58,57,58:11,5"	TokenNameStringLiteral	,58:9,57,58,57:2,58,57:3,58,57,58,57:2,58,57:5,58:41,57,58,57,58,57,58:11,5
+	TokenNamePLUS	
"7,58,57,58,57,58:3,57:2,58:3,57,58:5,57:3,58,57,58,57,58,57,58,57,58:3,57:2"	TokenNameStringLiteral	7,58,57,58,57,58:3,57:2,58:3,57,58:5,57:3,58,57,58,57,58,57,58,57,58:3,57:2
+	TokenNamePLUS	
",58:3,57:2,58,57,58:40,57,58:9,57,58:2,57,58:2,57:2,58:7,57:2,58,57,58,57:7"	TokenNameStringLiteral	,58:3,57:2,58,57,58:40,57,58:9,57,58:2,57,58:2,57:2,58:7,57:2,58,57,58,57:7
+	TokenNamePLUS	
",58:40,57,58:4,57,58:8,57,58:3078,57:156,58:4,57:90,58:6,57:22,58:2,57:6,58"	TokenNameStringLiteral	,58:40,57,58:4,57,58:8,57,58:3078,57:156,58:4,57:90,58:6,57:22,58:2,57:6,58
+	TokenNamePLUS	
":2,57:38,58:2,57:6,58:2,57:8,58,57,58,57,58,57,58,57:31,58:2,57:53,58,57:7,"	TokenNameStringLiteral	:2,57:38,58:2,57:6,58:2,57:8,58,57,58,57,58,57,58,57:31,58:2,57:53,58,57:7,
+	TokenNamePLUS	
"58,57,58:3,57:3,58,57:7,58:3,57:4,58:2,57:6,58:4,57:13,58:5,57:3,58,57:7,58"	TokenNameStringLiteral	58,57,58:3,57:3,58,57:7,58:3,57:4,58:2,57:6,58:4,57:13,58:5,57:3,58,57:7,58
+	TokenNamePLUS	
":3,54:12,58:2,54:98,58:182,57,58:3,57:2,58:2,57,58:81,57:3,58:13,54:2672,58"	TokenNameStringLiteral	:3,54:12,58:2,54:98,58:182,57,58:3,57:2,58:2,57,58:81,57:3,58:13,54:2672,58
+	TokenNamePLUS	
":1008,54:17,58:64,57:84,58:12,57:90,58:10,57:40,58:31443,57:11172,58:92,54:"	TokenNameStringLiteral	:1008,54:17,58:64,57:84,58:12,57:90,58:10,57:40,58:31443,57:11172,58:92,54:
+	TokenNamePLUS	
"8448,58:1232,54:32,58:526,54:2,0:2"	TokenNameStringLiteral	8448,58:1232,54:32,58:526,54:2,0:2
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
int	TokenNameint	
yy_rmap	TokenNameIdentifier	 yy rmap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
unpackFromString	TokenNameIdentifier	 unpack From String
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"0,1:2,2,1:2,3,4,1,5,6,1:3,7,8,1:5,9,1,10:2,1:3,11,1:5,12,10,1,10:5,1:2,10,1"	TokenNameStringLiteral	0,1:2,2,1:2,3,4,1,5,6,1:3,7,8,1:5,9,1,10:2,1:3,11,1:5,12,10,1,10:5,1:2,10,1
+	TokenNamePLUS	
":2,13,1,10,1,14,10,15,16,1:2,10:4,17,1:2,18,19,20,21,22,23,24,25,26,27,1,25"	TokenNameStringLiteral	:2,13,1,10,1,14,10,15,16,1:2,10:4,17,1:2,18,19,20,21,22,23,24,25,26,27,1,25
+	TokenNamePLUS	
",10,28:2,29,5,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,5"	TokenNameStringLiteral	,10,28:2,29,5,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,5
+	TokenNamePLUS	
"0,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,7"	TokenNameStringLiteral	0,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,7
+	TokenNamePLUS	
"5,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,1"	TokenNameStringLiteral	5,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,1
+	TokenNamePLUS	
"00,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,"	TokenNameStringLiteral	00,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,
+	TokenNamePLUS	
"119,120,121,122,123,124,125,126,127,128,129,130,131,132,10,133,134,135,136,"	TokenNameStringLiteral	119,120,121,122,123,124,125,126,127,128,129,130,131,132,10,133,134,135,136,
+	TokenNamePLUS	
"137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155"	TokenNameStringLiteral	137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155
+	TokenNamePLUS	
",156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,17"	TokenNameStringLiteral	,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,17
+	TokenNamePLUS	
"4,175,176,177,178,179,180,181"	TokenNameStringLiteral	4,175,176,177,178,179,180,181
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
int	TokenNameint	
yy_nxt	TokenNameIdentifier	 yy nxt
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
unpackFromString	TokenNameIdentifier	 unpack From String
(	TokenNameLPAREN	
182	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1,2,3,4,5,6,65,184,204,70,7,8,9,10,11,12,13,66,14,15,211,184:2,215,184,16,1"	TokenNameStringLiteral	1,2,3,4,5,6,65,184,204,70,7,8,9,10,11,12,13,66,14,15,211,184:2,215,184,16,1
+	TokenNamePLUS	
"7,18,218,220,221,184,222,184:2,223,184:3,224,184,19,20,184:10,71,74,77,21,1"	TokenNameStringLiteral	7,18,218,220,221,184,222,184:2,223,184:3,224,184,19,20,184:10,71,74,77,21,1
+	TokenNamePLUS	
"84:2,67,74,-1:63,22,-1:62,184:2,73,184:3,64,-1:2,76,-1:6,184,79,184:3,-1:3,"	TokenNameStringLiteral	84:2,67,74,-1:63,22,-1:62,184:2,73,184:3,64,-1:2,76,-1:6,184,79,184:3,-1:3,
+	TokenNamePLUS	
"184:13,-1:2,184:10,-1:3,76,184,76:3,-1:10,25,-1:51,26,-1:72,27,-1:42,28,-1:"	TokenNameStringLiteral	184:13,-1:2,184:10,-1:3,76,184,76:3,-1:10,25,-1:51,26,-1:72,27,-1:42,28,-1:
+	TokenNamePLUS	
"2,28,-1:17,30,-1:26,69,-1:2,72,-1:30,31,-1:57,34,-1:42,21,-1:2,21,-1:5,184:"	TokenNameStringLiteral	2,28,-1:17,30,-1:26,69,-1:2,72,-1:30,31,-1:57,34,-1:42,21,-1:2,21,-1:5,184:
+	TokenNamePLUS	
"6,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:56,28,-"	TokenNameStringLiteral	6,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:56,28,-
+	TokenNamePLUS	
"1:2,28,-1:57,34,-1:2,34,-1:5,155,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1"	TokenNameStringLiteral	1:2,28,-1:57,34,-1:2,34,-1:5,155,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1
+	TokenNamePLUS	
":2,184:10,-1:3,76,184,76:3,-1:4,209,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13"	TokenNameStringLiteral	:2,184:10,-1:3,76,184,76:3,-1:4,209,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13
+	TokenNamePLUS	
",-1:2,184:10,-1:3,76,184,76:3,-1:4,233,184:5,64,-1:2,76,-1:6,184:5,-1:3,184"	TokenNameStringLiteral	,-1:2,184:10,-1:3,76,184,76:3,-1:4,233,184:5,64,-1:2,76,-1:6,184:5,-1:3,184
+	TokenNamePLUS	
":13,-1:2,184:10,-1:3,76,184,76:3,-1:4,158,184:5,64,-1:2,76,-1:6,184:5,-1:3,"	TokenNameStringLiteral	:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,158,184:5,64,-1:2,76,-1:6,184:5,-1:3,
+	TokenNamePLUS	
"184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,122,-1"	TokenNameStringLiteral	184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,122,-1
+	TokenNamePLUS	
",124,183,184:12,-1:2,184:10,-1:3,76,184,76:3,-1,36,-1:3,103:5,-1:2,80,-1:7,"	TokenNameStringLiteral	,124,183,184:12,-1:2,184:10,-1:3,76,184,76:3,-1,36,-1:3,103:5,-1:2,80,-1:7,
+	TokenNamePLUS	
"103:5,-1:3,103:13,-1:2,103:10,-1:4,103:3,-1:5,184,23,184:4,64,-1:2,76,-1:6,"	TokenNameStringLiteral	103:5,-1:3,103:13,-1:2,103:10,-1:4,103:3,-1:5,184,23,184:4,64,-1:2,76,-1:6,
+	TokenNamePLUS	
"184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:16,29,-1:48,184:6,64,-1:2"	TokenNameStringLiteral	184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:16,29,-1:48,184:6,64,-1:2
+	TokenNamePLUS	
",68,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,67,184,76,67,76,-1:4,184:6,64,-"	TokenNameStringLiteral	,68,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,67,184,76,67,76,-1:4,184:6,64,-
+	TokenNamePLUS	
"1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,68,184,76,68,76,-1:44,82,-1:"	TokenNameStringLiteral	1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,68,184,76,68,76,-1:44,82,-1:
+	TokenNamePLUS	
"20,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,24,184:9,-1:2,184:10,-1:3,76,184,"	TokenNameStringLiteral	20,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,24,184:9,-1:2,184:10,-1:3,76,184,
+	TokenNamePLUS	
"76:3,-1,75:52,32,75:7,-1:49,84,-1:15,184:3,35,184:2,64,-1:2,76,-1:6,184:5,-"	TokenNameStringLiteral	76:3,-1,75:52,32,75:7,-1:49,84,-1:15,184:3,35,184:2,64,-1:2,76,-1:6,184:5,-
+	TokenNamePLUS	
"1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1,78:54,33,78:5,-1:4,184:6,64,-1:2"	TokenNameStringLiteral	1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1,78:54,33,78:5,-1:4,184:6,64,-1:2
+	TokenNamePLUS	
",76,-1:6,184:5,-1:3,184:4,105,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184,3"	TokenNameStringLiteral	,76,-1:6,184:5,-1:3,184:4,105,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184,3
+	TokenNamePLUS	
"7,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4"	TokenNameStringLiteral	7,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4
+	TokenNamePLUS	
"5,185,-1:19,184:6,64,-1:2,76,-1:6,184:2,38,184:2,-1:3,184:13,-1:2,184:10,-1"	TokenNameStringLiteral	5,185,-1:19,184:6,64,-1:2,76,-1:6,184:2,38,184:2,-1:3,184:13,-1:2,184:10,-1
+	TokenNamePLUS	
":3,76,184,76:3,-1:43,86,-1:21,184:6,64,-1:2,76,-1:6,184:4,191,-1:3,184:13,-"	TokenNameStringLiteral	:3,76,184,76:3,-1:43,86,-1:21,184:6,64,-1:2,76,-1:6,184:4,191,-1:3,184:13,-
+	TokenNamePLUS	
"1:2,184:10,-1:3,76,184,76:3,-1:47,186,-1:17,184,107,184:4,64,-1:2,76,-1:6,1"	TokenNameStringLiteral	1:2,184:10,-1:3,76,184,76:3,-1:47,186,-1:17,184,107,184:4,64,-1:2,76,-1:6,1
+	TokenNamePLUS	
"84:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:46,96,-1:18,184:4,193,184,"	TokenNameStringLiteral	84:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:46,96,-1:18,184:4,193,184,
+	TokenNamePLUS	
"64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:26,42,-1:"	TokenNameStringLiteral	64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:26,42,-1:
+	TokenNamePLUS	
"38,184:2,205,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,18"	TokenNameStringLiteral	38,184:2,205,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,18
+	TokenNamePLUS	
"4,76:3,-1:25,100,-1,92,-1:37,184:5,192,64,-1:2,76,-1:6,184,228,184:3,-1:3,1"	TokenNameStringLiteral	4,76:3,-1:25,100,-1,92,-1:37,184:5,192,64,-1:2,76,-1:6,184,228,184:3,-1:3,1
+	TokenNamePLUS	
"84:13,-1:2,184:10,-1:3,76,184,76:3,-1:26,43,-1:38,184:6,64,-1:2,76,-1:6,184"	TokenNameStringLiteral	84:13,-1:2,184:10,-1:3,76,184,76:3,-1:26,43,-1:38,184:6,64,-1:2,76,-1:6,184
+	TokenNamePLUS	
":5,-1:3,184:3,206,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:47,104,-1:17,184:6,"	TokenNameStringLiteral	:5,-1:3,184:3,206,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:47,104,-1:17,184:6,
+	TokenNamePLUS	
"64,-1:2,76,-1:6,184:5,-1:3,184:9,111,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:"	TokenNameStringLiteral	64,-1:2,76,-1:6,184:5,-1:3,184:9,111,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:
+	TokenNamePLUS	
"50,190,-1:14,184:6,64,-1:2,76,-1:6,184:3,113,184,-1:3,184:13,-1:2,184:10,-1"	TokenNameStringLiteral	50,190,-1:14,184:6,64,-1:2,76,-1:6,184:3,113,184,-1:3,184:13,-1:2,184:10,-1
+	TokenNamePLUS	
":3,76,184,76:3,-1:26,45,-1:38,184,39,184:4,64,-1:2,76,-1:6,184:5,-1:3,184,2"	TokenNameStringLiteral	:3,76,184,76:3,-1:26,45,-1:38,184,39,184:4,64,-1:2,76,-1:6,184:5,-1:3,184,2
+	TokenNamePLUS	
"12,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:26,46,-1:38,103:6,-1:3,103,-1:6,1"	TokenNameStringLiteral	12,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:26,46,-1:38,103:6,-1:3,103,-1:6,1
+	TokenNamePLUS	
"03:5,-1:3,103:13,-1:2,103:10,-1:3,103:5,-1:48,106,-1:16,184:6,64,-1:2,76,-1"	TokenNameStringLiteral	03:5,-1:3,103:13,-1:2,103:10,-1:3,103:5,-1:48,106,-1:16,184:6,64,-1:2,76,-1
+	TokenNamePLUS	
":6,184:5,-1:3,184,216,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:19,48,-1:45,18"	TokenNameStringLiteral	:6,184:5,-1:3,184,216,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:19,48,-1:45,18
+	TokenNamePLUS	
"4:6,64,-1:2,76,-1:6,184,119,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,"	TokenNameStringLiteral	4:6,64,-1:2,76,-1:6,184,119,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,
+	TokenNamePLUS	
"-1:51,114,-1:13,184:4,123,184,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10"	TokenNameStringLiteral	-1:51,114,-1:13,184:4,123,184,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10
+	TokenNamePLUS	
",-1:3,76,184,76:3,-1:26,50,-1:38,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:11,40"	TokenNameStringLiteral	,-1:3,76,184,76:3,-1:26,50,-1:38,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:11,40
+	TokenNamePLUS	
",184,-1:2,184:10,-1:3,76,184,76:3,-1:25,116,-1,112,-1:37,184:6,64,-1:2,76,-"	TokenNameStringLiteral	,184,-1:2,184:10,-1:3,76,184,76:3,-1:25,116,-1,112,-1:37,184:6,64,-1:2,76,-
+	TokenNamePLUS	
"1:6,184:5,-1:3,184:3,128,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:52,118,-1:12"	TokenNameStringLiteral	1:6,184:5,-1:3,184:3,128,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:52,118,-1:12
+	TokenNamePLUS	
",184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,129,184:3,-1:2,184:10,-1:3,76,184,7"	TokenNameStringLiteral	,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,129,184:3,-1:2,184:10,-1:3,76,184,7
+	TokenNamePLUS	
"6:3,-1:26,55,-1:38,184:6,64,-1:2,76,-1:6,184:3,130,184,90,-1,92,184:13,-1:2"	TokenNameStringLiteral	6:3,-1:26,55,-1:38,184:6,64,-1:2,76,-1:6,184:3,130,184,90,-1,92,184:13,-1:2
+	TokenNamePLUS	
",184:10,-1:3,76,184,76:3,-1:48,120,-1:16,184:6,64,-1:2,76,-1:6,184,131,184:"	TokenNameStringLiteral	,184:10,-1:3,76,184,76:3,-1:48,120,-1:16,184:6,64,-1:2,76,-1:6,184,131,184:
+	TokenNamePLUS	
"3,94,-1,188,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:19,56,-1:45,184:6,64,-1:"	TokenNameStringLiteral	3,94,-1,188,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:19,56,-1:45,184:6,64,-1:
+	TokenNamePLUS	
"2,76,-1:6,184:5,-1:3,184:4,132,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:26,62,"	TokenNameStringLiteral	2,76,-1:6,184:5,-1:3,184:4,132,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:26,62,
+	TokenNamePLUS	
"-1:38,184:6,64,-1:2,76,-1:6,184,208,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,1"	TokenNameStringLiteral	-1:38,184:6,64,-1:2,76,-1:6,184,208,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,1
+	TokenNamePLUS	
"84,76:3,-1:25,126,-1,124,-1:37,184,41,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:"	TokenNameStringLiteral	84,76:3,-1:25,126,-1,124,-1:37,184,41,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:
+	TokenNamePLUS	
"13,-1:2,184:10,-1:3,76,184,76:3,-1:26,63,-1:38,184:6,64,-1:2,76,-1:6,184:5,"	TokenNameStringLiteral	13,-1:2,184:10,-1:3,76,184,76:3,-1:26,63,-1:38,184:6,64,-1:2,76,-1:6,184:5,
+	TokenNamePLUS	
"-1:3,135,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,136,184:3,64,-1:2,7"	TokenNameStringLiteral	-1:3,135,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,136,184:3,64,-1:2,7
+	TokenNamePLUS	
"6,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,138,64,-1:"	TokenNameStringLiteral	6,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,138,64,-1:
+	TokenNamePLUS	
"2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2"	TokenNameStringLiteral	2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2
+	TokenNamePLUS	
",76,-1:6,184:3,130,184,-1:2,92,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184"	TokenNameStringLiteral	,76,-1:6,184:3,130,184,-1:2,92,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184
+	TokenNamePLUS	
":6,64,-1:2,76,-1:6,184,131,184:3,-1:2,188,184:13,-1:2,184:10,-1:3,76,184,76"	TokenNameStringLiteral	:6,64,-1:2,76,-1:6,184,131,184:3,-1:2,188,184:13,-1:2,184:10,-1:3,76,184,76
+	TokenNamePLUS	
":3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:2,139,184:10,-1:2,184:10,-1:3,"	TokenNameStringLiteral	:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:2,139,184:10,-1:2,184:10,-1:3,
+	TokenNamePLUS	
"76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,197,184:8,-1:2,184:"	TokenNameStringLiteral	76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,197,184:8,-1:2,184:
+	TokenNamePLUS	
"10,-1:3,76,184,76:3,-1:4,184,140,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1"	TokenNameStringLiteral	10,-1:3,76,184,76:3,-1:4,184,140,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1
+	TokenNamePLUS	
":2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,44,184,-1:3,184"	TokenNameStringLiteral	:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,44,184,-1:3,184
+	TokenNamePLUS	
":13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:"	TokenNameStringLiteral	:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:
+	TokenNamePLUS	
"10,141,184:2,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,"	TokenNameStringLiteral	10,141,184:2,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,
+	TokenNamePLUS	
"142,184,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6"	TokenNameStringLiteral	142,184,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6
+	TokenNamePLUS	
",184:5,-1:3,184:12,225,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-"	TokenNameStringLiteral	,184:5,-1:3,184:12,225,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-
+	TokenNamePLUS	
"1:6,184:5,-1:3,184:7,143,184:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,145,"	TokenNameStringLiteral	1:6,184:5,-1:3,184:7,143,184:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,145,
+	TokenNamePLUS	
"184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,1"	TokenNameStringLiteral	184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,1
+	TokenNamePLUS	
"84:6,64,-1:2,76,-1:6,184:5,-1:3,184:6,146,184:6,-1:2,184:10,-1:3,76,184,76:"	TokenNameStringLiteral	84:6,64,-1:2,76,-1:6,184:5,-1:3,184:6,146,184:6,-1:2,184:10,-1:3,76,184,76:
+	TokenNamePLUS	
"3,-1:4,184:5,147,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,"	TokenNameStringLiteral	3,-1:4,184:5,147,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,
+	TokenNamePLUS	
"76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184,148,184:11,-1:2,184:10,-1:3,"	TokenNameStringLiteral	76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184,148,184:11,-1:2,184:10,-1:3,
+	TokenNamePLUS	
"76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,149,184,110,-1,112,184:13,-1:2"	TokenNameStringLiteral	76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,149,184,110,-1,112,184:13,-1:2
+	TokenNamePLUS	
",184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,150,184:12,-"	TokenNameStringLiteral	,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,150,184:12,-
+	TokenNamePLUS	
"1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,151,184,-1:3,1"	TokenNameStringLiteral	1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,151,184,-1:3,1
+	TokenNamePLUS	
"84:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,18"	TokenNameStringLiteral	84:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,18
+	TokenNamePLUS	
"4:3,47,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,49"	TokenNameStringLiteral	4:3,47,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,49
+	TokenNamePLUS	
",184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,"	TokenNameStringLiteral	,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,
+	TokenNamePLUS	
"184:3,149,184,-1:2,112,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1"	TokenNameStringLiteral	184:3,149,184,-1:2,112,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1
+	TokenNamePLUS	
":2,76,-1:6,184:5,-1:3,184:5,51,184:7,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:"	TokenNameStringLiteral	:2,76,-1:6,184:5,-1:3,184:5,51,184:7,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:
+	TokenNamePLUS	
"6,64,-1:2,76,-1:6,184,52,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:"	TokenNameStringLiteral	6,64,-1:2,76,-1:6,184,52,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:
+	TokenNamePLUS	
"4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,53,184:7,-1:2,184:10,-1:3,76,184,7"	TokenNameStringLiteral	4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,53,184:7,-1:2,184:10,-1:3,76,184,7
+	TokenNamePLUS	
"6:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,54,184,-1:3,184:13,-1:2,184:10,-1:3,76"	TokenNameStringLiteral	6:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,54,184,-1:3,184:13,-1:2,184:10,-1:3,76
+	TokenNamePLUS	
",184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,156,184:7,-1:2,184:10"	TokenNameStringLiteral	,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,156,184:7,-1:2,184:10
+	TokenNamePLUS	
",-1:3,76,184,76:3,-1:4,184:5,157,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184"	TokenNameStringLiteral	,-1:3,76,184,76:3,-1:4,184:5,157,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184
+	TokenNamePLUS	
":10,-1:3,76,184,76:3,-1:4,159,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,"	TokenNameStringLiteral	:10,-1:3,76,184,76:3,-1:4,159,184:5,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,
+	TokenNamePLUS	
"184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,160,184"	TokenNameStringLiteral	184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,160,184
+	TokenNamePLUS	
":9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,161,64,-1:2,76,-1:6,184:5,-1:3,1"	TokenNameStringLiteral	:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,161,64,-1:2,76,-1:6,184:5,-1:3,1
+	TokenNamePLUS	
"84:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,162,184:3,64,-1:2,76,-1:6,184"	TokenNameStringLiteral	84:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,162,184:3,64,-1:2,76,-1:6,184
+	TokenNamePLUS	
":5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,213,184:5,64,-1:2,76,-1:6,"	TokenNameStringLiteral	:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,213,184:5,64,-1:2,76,-1:6,
+	TokenNamePLUS	
"184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,1"	TokenNameStringLiteral	184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,1
+	TokenNamePLUS	
"84:5,-1:3,184:3,226,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,7"	TokenNameStringLiteral	84:5,-1:3,184:3,226,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,7
+	TokenNamePLUS	
"6,-1:6,184:5,-1:3,217,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:"	TokenNameStringLiteral	6,-1:6,184:5,-1:3,217,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:
+	TokenNamePLUS	
"2,76,-1:6,184:5,-1:3,184:10,164,184:2,-1:2,184:10,-1:3,76,184,76:3,-1:4,184"	TokenNameStringLiteral	2,76,-1:6,184:5,-1:3,184:10,164,184:2,-1:2,184:10,-1:3,76,184,76:3,-1:4,184
+	TokenNamePLUS	
":6,64,-1:2,76,-1:6,184:5,-1:3,184:9,167,184:3,-1:2,184:10,-1:3,76,184,76:3,"	TokenNameStringLiteral	:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,167,184:3,-1:2,184:10,-1:3,76,184,76:3,
+	TokenNamePLUS	
"-1:4,184:6,64,-1:2,76,-1:6,184,168,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,18"	TokenNameStringLiteral	-1:4,184:6,64,-1:2,76,-1:6,184,168,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,18
+	TokenNamePLUS	
"4,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,170,184,-1:3,184:13,-1:2,184:10,-1:"	TokenNameStringLiteral	4,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,170,184,-1:3,184:13,-1:2,184:10,-1:
+	TokenNamePLUS	
"3,76,184,76:3,-1:4,184:2,171,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,1"	TokenNameStringLiteral	3,76,184,76:3,-1:4,184:2,171,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,1
+	TokenNamePLUS	
"84:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,172,184:"	TokenNameStringLiteral	84:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,172,184:
+	TokenNamePLUS	
"3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,173,184:3,-1:"	TokenNameStringLiteral	3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,173,184:3,-1:
+	TokenNamePLUS	
"3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3"	TokenNameStringLiteral	3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3
+	TokenNamePLUS	
",184:3,174,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,18"	TokenNameStringLiteral	,184:3,174,184:9,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,18
+	TokenNamePLUS	
"4:5,-1:3,175,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6"	TokenNameStringLiteral	4:5,-1:3,175,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6
+	TokenNamePLUS	
",184:5,-1:3,184:11,57,184,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,7"	TokenNameStringLiteral	,184:5,-1:3,184:11,57,184,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,7
+	TokenNamePLUS	
"6,-1:6,184:5,-1:3,184:9,177,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,6"	TokenNameStringLiteral	6,-1:6,184:5,-1:3,184:9,177,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,6
+	TokenNamePLUS	
"4,-1:2,76,-1:6,184:5,-1:3,184:6,178,184:6,-1:2,184:10,-1:3,76,184,76:3,-1:4"	TokenNameStringLiteral	4,-1:2,76,-1:6,184:5,-1:3,184:6,178,184:6,-1:2,184:10,-1:3,76,184,76:3,-1:4
+	TokenNamePLUS	
",184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,58,184:7,-1:2,184:10,-1:3,76,184,76"	TokenNameStringLiteral	,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,58,184:7,-1:2,184:10,-1:3,76,184,76
+	TokenNamePLUS	
":3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,59,184:7,-1:2,184:10,-1:3,76"	TokenNameStringLiteral	:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:5,59,184:7,-1:2,184:10,-1:3,76
+	TokenNamePLUS	
",184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:11,60,184,-1:2,184:10,-"	TokenNameStringLiteral	,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:11,60,184,-1:2,184:10,-
+	TokenNamePLUS	
"1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184,179,184:11,-1:2,1"	TokenNameStringLiteral	1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184,179,184:11,-1:2,1
+	TokenNamePLUS	
"84:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,180,184,-1:3,184:13"	TokenNameStringLiteral	84:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,180,184,-1:3,184:13
+	TokenNamePLUS	
",-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,181,184:3,64,-1:2,76,-1:6,184:5,-1"	TokenNameStringLiteral	,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,181,184:3,64,-1:2,76,-1:6,184:5,-1
+	TokenNamePLUS	
":3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,182,64,-1:2,76,-1:6,184:5"	TokenNameStringLiteral	:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,182,64,-1:2,76,-1:6,184:5
+	TokenNamePLUS	
",-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,"	TokenNameStringLiteral	,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,
+	TokenNamePLUS	
"-1:3,61,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:"	TokenNameStringLiteral	-1:3,61,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:
+	TokenNamePLUS	
"5,-1:2,124,183,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:45,88,-1:61,98,-1:18,"	TokenNameStringLiteral	5,-1:2,124,183,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:45,88,-1:61,98,-1:18,
+	TokenNamePLUS	
"184:4,109,184,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:"	TokenNameStringLiteral	184:4,109,184,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:
+	TokenNamePLUS	
"3,-1:25,102,-1,188,-1:37,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,115,184:3,-"	TokenNameStringLiteral	3,-1:25,102,-1,188,-1:37,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,115,184:3,-
+	TokenNamePLUS	
"1:2,184:10,-1:3,76,184,76:3,-1:50,108,-1:14,184:6,64,-1:2,76,-1:6,184:3,117"	TokenNameStringLiteral	1:2,184:10,-1:3,76,184,76:3,-1:50,108,-1:14,184:6,64,-1:2,76,-1:6,184:3,117
+	TokenNamePLUS	
",184,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,18"	TokenNameStringLiteral	,184,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,18
+	TokenNamePLUS	
"4:5,-1:3,184,195,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,"	TokenNameStringLiteral	4:5,-1:3,184,195,184:11,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,
+	TokenNamePLUS	
"-1:6,184,121,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-"	TokenNameStringLiteral	-1:6,184,121,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-
+	TokenNamePLUS	
"1:2,76,-1:6,184:5,-1:3,184:4,137,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,18"	TokenNameStringLiteral	1:2,76,-1:6,184:5,-1:3,184:4,137,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,18
+	TokenNamePLUS	
"4:6,64,-1:2,76,-1:6,184,133,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,"	TokenNameStringLiteral	4:6,64,-1:2,76,-1:6,184,133,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,
+	TokenNamePLUS	
"-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,198,184:12,-1:2,184:10,-1:3,76,184,76"	TokenNameStringLiteral	-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,198,184:12,-1:2,184:10,-1:3,76,184,76
+	TokenNamePLUS	
":3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,229,184:8,-1:2,184:10,-1:3,7"	TokenNameStringLiteral	:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,229,184:8,-1:2,184:10,-1:3,7
+	TokenNamePLUS	
"6,184,76:3,-1:4,184,200,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10"	TokenNameStringLiteral	6,184,76:3,-1:4,184,200,184:4,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10
+	TokenNamePLUS	
",-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,144,184,-1:3,184:13,-1:2"	TokenNameStringLiteral	,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,144,184,-1:3,184:13,-1:2
+	TokenNamePLUS	
",184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:7,210,18"	TokenNameStringLiteral	,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:7,210,18
+	TokenNamePLUS	
"4:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,152,"	TokenNameStringLiteral	4:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,152,
+	TokenNamePLUS	
"184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,163,184:3,64,-1:2,76,-1:6,18"	TokenNameStringLiteral	184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,163,184:3,64,-1:2,76,-1:6,18
+	TokenNamePLUS	
"4:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184"	TokenNameStringLiteral	4:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184
+	TokenNamePLUS	
":5,-1:3,176,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,81,64,-1:2,76,-1"	TokenNameStringLiteral	:5,-1:3,176,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,81,64,-1:2,76,-1
+	TokenNamePLUS	
":6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:"	TokenNameStringLiteral	:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:
+	TokenNamePLUS	
"6,184:5,-1:3,184:9,125,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:"	TokenNameStringLiteral	6,184:5,-1:3,184:9,125,184:3,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:
+	TokenNamePLUS	
"2,76,-1:6,184,127,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6"	TokenNameStringLiteral	2,76,-1:6,184,127,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6
+	TokenNamePLUS	
",64,-1:2,76,-1:6,184,134,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:"	TokenNameStringLiteral	,64,-1:2,76,-1:6,184,134,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:
+	TokenNamePLUS	
"4,184:6,64,-1:2,76,-1:6,184:5,-1:3,199,184:12,-1:2,184:10,-1:3,76,184,76:3,"	TokenNameStringLiteral	4,184:6,64,-1:2,76,-1:6,184:5,-1:3,199,184:12,-1:2,184:10,-1:3,76,184,76:3,
+	TokenNamePLUS	
"-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,202,184:8,-1:2,184:10,-1:3,76,1"	TokenNameStringLiteral	-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,202,184:8,-1:2,184:10,-1:3,76,1
+	TokenNamePLUS	
"84,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,153,184:12,-1:2,184:10,-1:3,7"	TokenNameStringLiteral	84,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,153,184:12,-1:2,184:10,-1:3,7
+	TokenNamePLUS	
"6,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,83,184:3,-1:3,184:13,-1:2,184:10,"	TokenNameStringLiteral	6,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,83,184:3,-1:3,184:13,-1:2,184:10,
+	TokenNamePLUS	
"-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,194,184:3,-1:3,184:13,-1:2,"	TokenNameStringLiteral	-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,194,184:3,-1:3,184:13,-1:2,
+	TokenNamePLUS	
"184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,165,184"	TokenNameStringLiteral	184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:4,165,184
+	TokenNamePLUS	
":8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,154,1"	TokenNameStringLiteral	:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,154,1
+	TokenNamePLUS	
"84:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,85,184:3,"	TokenNameStringLiteral	84:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,85,184:3,
+	TokenNamePLUS	
"-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,196"	TokenNameStringLiteral	-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,196
+	TokenNamePLUS	
",184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,"	TokenNameStringLiteral	,184:3,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,
+	TokenNamePLUS	
"184:5,-1:3,184:4,166,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,87,64,-1"	TokenNameStringLiteral	184:5,-1:3,184:4,166,184:8,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,87,64,-1
+	TokenNamePLUS	
":2,76,-1:6,184:5,-1:3,184:7,89,184:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:"	TokenNameStringLiteral	:2,76,-1:6,184:5,-1:3,184:7,89,184:5,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:
+	TokenNamePLUS	
"6,64,-1:2,76,-1:6,184:5,-1:3,184:4,169,184:8,-1:2,184:10,-1:3,76,184,76:3,-"	TokenNameStringLiteral	6,64,-1:2,76,-1:6,184:5,-1:3,184:4,169,184:8,-1:2,184:10,-1:3,76,184,76:3,-
+	TokenNamePLUS	
"1:4,184:5,187,64,-1:2,76,-1:6,184:5,-1:3,184:8,91,184:4,-1:2,184:10,-1:3,76"	TokenNameStringLiteral	1:4,184:5,187,64,-1:2,76,-1:6,184:5,-1:3,184:8,91,184:4,-1:2,184:10,-1:3,76
+	TokenNamePLUS	
",184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,93,184:3,95,184:5,-1:"	TokenNameStringLiteral	,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:3,93,184:3,95,184:5,-1:
+	TokenNamePLUS	
"2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,97,184:3,-1:3,184:"	TokenNameStringLiteral	2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184,97,184:3,-1:3,184:
+	TokenNamePLUS	
"13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,99,184,-1:"	TokenNameStringLiteral	13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:3,99,184,-1:
+	TokenNamePLUS	
"3,101,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,189,64,-1:2,76,-1:6,18"	TokenNameStringLiteral	3,101,184:12,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:5,189,64,-1:2,76,-1:6,18
+	TokenNamePLUS	
"4:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,201,184:3,64,-1:2,7"	TokenNameStringLiteral	4:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,201,184:3,64,-1:2,7
+	TokenNamePLUS	
"6,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,219,184:5,64,-1:"	TokenNameStringLiteral	6,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,219,184:5,64,-1:
+	TokenNamePLUS	
"2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,203,184"	TokenNameStringLiteral	2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:2,203,184
+	TokenNamePLUS	
":3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:"	TokenNameStringLiteral	:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:
+	TokenNamePLUS	
"6,64,-1:2,76,-1:6,184:5,-1:3,184,207,184:11,-1:2,184:10,-1:3,76,184,76:3,-1"	TokenNameStringLiteral	6,64,-1:2,76,-1:6,184:5,-1:3,184,207,184:11,-1:2,184:10,-1:3,76,184,76:3,-1
+	TokenNamePLUS	
":4,184:2,214,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,18"	TokenNameStringLiteral	:4,184:2,214,184:3,64,-1:2,76,-1:6,184:5,-1:3,184:13,-1:2,184:10,-1:3,76,18
+	TokenNamePLUS	
"4,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,227,184:3,-1:2,184:10,-1"	TokenNameStringLiteral	4,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:9,227,184:3,-1:2,184:10,-1
+	TokenNamePLUS	
":3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:10,230,184:2,-1:2,"	TokenNameStringLiteral	:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:10,230,184:2,-1:2,
+	TokenNamePLUS	
"184:10,-1:3,76,184,76:3,-1:4,184:2,231,184:3,64,-1:2,76,-1:6,184:5,-1:3,184"	TokenNameStringLiteral	184:10,-1:3,76,184,76:3,-1:4,184:2,231,184:3,64,-1:2,76,-1:6,184:5,-1:3,184
+	TokenNamePLUS	
":13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:"	TokenNameStringLiteral	:13,-1:2,184:10,-1:3,76,184,76:3,-1:4,184:6,64,-1:2,76,-1:6,184:5,-1:3,184:
+	TokenNamePLUS	
"4,232,184:8,-1:2,184:10,-1:3,76,184,76:3"	TokenNameStringLiteral	4,232,184:8,-1:2,184:10,-1:3,76,184,76:3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
java_cup	TokenNameIdentifier	 java cup
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
Symbol	TokenNameIdentifier	 Symbol
next_token	TokenNameIdentifier	 next token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
yy_lookahead	TokenNameIdentifier	 yy lookahead
;	TokenNameSEMICOLON	
int	TokenNameint	
yy_anchor	TokenNameIdentifier	 yy anchor
=	TokenNameEQUAL	
YY_NO_ANCHOR	TokenNameIdentifier	 YY  NO  ANCHOR
;	TokenNameSEMICOLON	
int	TokenNameint	
yy_state	TokenNameIdentifier	 yy state
=	TokenNameEQUAL	
yy_state_dtrans	TokenNameIdentifier	 yy state dtrans
[	TokenNameLBRACKET	
yy_lexical_state	TokenNameIdentifier	 yy lexical state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
yy_next_state	TokenNameIdentifier	 yy next state
=	TokenNameEQUAL	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
;	TokenNameSEMICOLON	
int	TokenNameint	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
=	TokenNameEQUAL	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
yy_initial	TokenNameIdentifier	 yy initial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
yy_this_accept	TokenNameIdentifier	 yy this accept
;	TokenNameSEMICOLON	
yy_mark_start	TokenNameIdentifier	 yy mark start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yy_this_accept	TokenNameIdentifier	 yy this accept
=	TokenNameEQUAL	
yy_acpt	TokenNameIdentifier	 yy acpt
[	TokenNameLBRACKET	
yy_state	TokenNameIdentifier	 yy state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
!=	TokenNameNOT_EQUAL	
yy_this_accept	TokenNameIdentifier	 yy this accept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
=	TokenNameEQUAL	
yy_state	TokenNameIdentifier	 yy state
;	TokenNameSEMICOLON	
yy_mark_end	TokenNameIdentifier	 yy mark end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yy_initial	TokenNameIdentifier	 yy initial
&&	TokenNameAND_AND	
yy_at_bol	TokenNameIdentifier	 yy at bol
)	TokenNameRPAREN	
yy_lookahead	TokenNameIdentifier	 yy lookahead
=	TokenNameEQUAL	
YY_BOL	TokenNameIdentifier	 YY  BOL
;	TokenNameSEMICOLON	
else	TokenNameelse	
yy_lookahead	TokenNameIdentifier	 yy lookahead
=	TokenNameEQUAL	
yy_advance	TokenNameIdentifier	 yy advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yy_next_state	TokenNameIdentifier	 yy next state
=	TokenNameEQUAL	
YY_F	TokenNameIdentifier	 YY  F
;	TokenNameSEMICOLON	
yy_next_state	TokenNameIdentifier	 yy next state
=	TokenNameEQUAL	
yy_nxt	TokenNameIdentifier	 yy nxt
[	TokenNameLBRACKET	
yy_rmap	TokenNameIdentifier	 yy rmap
[	TokenNameLBRACKET	
yy_state	TokenNameIdentifier	 yy state
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
yy_cmap	TokenNameIdentifier	 yy cmap
[	TokenNameLBRACKET	
yy_lookahead	TokenNameIdentifier	 yy lookahead
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
YY_EOF	TokenNameIdentifier	 YY  EOF
==	TokenNameEQUAL_EQUAL	
yy_lookahead	TokenNameIdentifier	 yy lookahead
&&	TokenNameAND_AND	
true	TokenNametrue	
==	TokenNameEQUAL_EQUAL	
yy_initial	TokenNameIdentifier	 yy initial
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
YY_F	TokenNameIdentifier	 YY  F
!=	TokenNameNOT_EQUAL	
yy_next_state	TokenNameIdentifier	 yy next state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_state	TokenNameIdentifier	 yy state
=	TokenNameEQUAL	
yy_next_state	TokenNameIdentifier	 yy next state
;	TokenNameSEMICOLON	
yy_initial	TokenNameIdentifier	 yy initial
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
yy_this_accept	TokenNameIdentifier	 yy this accept
=	TokenNameEQUAL	
yy_acpt	TokenNameIdentifier	 yy acpt
[	TokenNameLBRACKET	
yy_state	TokenNameIdentifier	 yy state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
!=	TokenNameNOT_EQUAL	
yy_this_accept	TokenNameIdentifier	 yy this accept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
=	TokenNameEQUAL	
yy_state	TokenNameIdentifier	 yy state
;	TokenNameSEMICOLON	
yy_mark_end	TokenNameIdentifier	 yy mark end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
==	TokenNameEQUAL_EQUAL	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Lexical Error: Unmatched Input."	TokenNameStringLiteral	Lexical Error: Unmatched Input.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
yy_anchor	TokenNameIdentifier	 yy anchor
=	TokenNameEQUAL	
yy_acpt	TokenNameIdentifier	 yy acpt
[	TokenNameLBRACKET	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
YY_END	TokenNameIdentifier	 YY  END
&	TokenNameAND	
yy_anchor	TokenNameIdentifier	 yy anchor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_move_end	TokenNameIdentifier	 yy move end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy_to_mark	TokenNameIdentifier	 yy to mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateStar	TokenNameIdentifier	 disambiguate Star
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
SLASH	TokenNameIdentifier	 SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MINUS	TokenNameIdentifier	 MINUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ATSIGN	TokenNameIdentifier	 ATSIGN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
11	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
11	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
VBAR	TokenNameIdentifier	 VBAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
12	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
12	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DOLLAR	TokenNameIdentifier	 DOLLAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
14	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
15	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GT	TokenNameIdentifier	 GT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LPAREN	TokenNameIdentifier	 LPAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
17	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
17	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
RPAREN	TokenNameIdentifier	 RPAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
18	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
18	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
/* ignore white space. */	TokenNameCOMMENT_BLOCK	 ignore white space. 
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
19	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LBRACK	TokenNameIdentifier	 LBRACK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
RBRACK	TokenNameIdentifier	 RBRACK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
21	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
21	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
22	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
22	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DSLASH	TokenNameIdentifier	 DSLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
23	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
23	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
24	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
24	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateOperator	TokenNameIdentifier	 disambiguate Operator
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
OR	TokenNameIdentifier	 OR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
25	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
25	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DCOLON	TokenNameIdentifier	 DCOLON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
26	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
26	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
27	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
27	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DDOT	TokenNameIdentifier	 DDOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
28	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
28	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
REAL	TokenNameIdentifier	 REAL
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
29	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
29	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NE	TokenNameIdentifier	 NE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
30	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
30	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
LE	TokenNameIdentifier	 LE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
31	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
31	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
GE	TokenNameIdentifier	 GE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
Literal	TokenNameIdentifier	 Literal
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
33	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
33	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
Literal	TokenNameIdentifier	 Literal
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
34	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
34	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
REAL	TokenNameIdentifier	 REAL
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
35	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
35	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateOperator	TokenNameIdentifier	 disambiguate Operator
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DIV	TokenNameIdentifier	 DIV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
36	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
36	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
37	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
37	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateOperator	TokenNameIdentifier	 disambiguate Operator
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
MOD	TokenNameIdentifier	 MOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
38	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
38	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
KEY	TokenNameIdentifier	 KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
39	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
39	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateOperator	TokenNameIdentifier	 disambiguate Operator
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
AND	TokenNameIdentifier	 AND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
40	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
40	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
41	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
41	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
42	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
42	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
43	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
43	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
44	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
44	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
45	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
45	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
46	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
46	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
47	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
47	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ANCESTOR	TokenNameIdentifier	 ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
48	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
48	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PATTERN	TokenNameIdentifier	 PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
49	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
49	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
50	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
50	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
51	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
51	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PRECEDING	TokenNameIdentifier	 PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
52	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
52	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
53	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
53	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
54	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
54	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
55	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
55	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
56	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
56	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Symbol	TokenNameIdentifier	 Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
EXPRESSION	TokenNameIdentifier	 EXPRESSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
57	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
57	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
ANCESTORORSELF	TokenNameIdentifier	 ANCESTORORSELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
58	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
58	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
59	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
59	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
FOLLOWINGSIBLING	TokenNameIdentifier	 FOLLOWINGSIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
60	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
60	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
61	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
61	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
disambiguateAxisOrFunction	TokenNameIdentifier	 disambiguate Axis Or Function
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PIPARAM	TokenNameIdentifier	 PIPARAM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
62	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
62	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
63	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
63	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
65	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
65	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
66	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
66	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
67	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
67	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
68	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
REAL	TokenNameIdentifier	 REAL
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
68	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
70	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
69	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
71	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
70	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
73	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
71	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
74	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
72	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
76	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
73	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
77	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
74	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
79	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
75	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
81	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
76	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
83	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
77	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
85	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
78	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
87	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
79	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
89	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
80	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
91	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
81	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
93	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
82	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
95	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
83	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
97	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
84	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
99	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
85	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
101	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
86	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
103	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
105	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
88	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
107	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
89	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
109	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
90	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
111	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
91	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
113	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
92	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
115	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
93	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
117	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
94	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
119	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
95	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
121	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
96	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
123	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
97	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
125	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
98	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
127	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
99	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
128	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
100	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
129	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
101	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
130	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
102	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
131	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
103	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
132	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
104	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
133	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
105	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
134	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
106	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
135	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
107	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
136	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
108	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
137	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
109	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
138	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
110	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
139	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
111	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
140	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
112	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
141	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
113	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
142	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
114	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
143	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
115	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
144	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
116	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
145	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
117	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
146	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
118	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
147	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
119	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
148	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
120	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
149	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
121	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
150	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
122	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
151	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
123	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
152	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
124	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
153	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
125	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
154	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
126	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
155	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
127	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
156	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
128	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
157	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
129	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
158	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
130	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
159	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
131	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
160	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
132	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
161	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
133	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
162	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
134	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
163	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
135	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
164	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
136	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
165	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
137	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
166	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
138	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
167	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
139	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
168	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
140	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
169	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
141	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
170	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
142	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
171	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
143	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
172	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
144	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
173	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
145	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
174	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
146	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
175	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
147	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
176	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
148	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
177	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
149	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
178	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
150	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
179	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
151	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
180	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
152	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
181	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
153	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
182	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
154	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
183	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
155	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
184	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
156	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
187	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
157	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
189	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
158	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
191	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
159	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
192	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
160	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
193	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
161	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
194	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
162	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
195	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
163	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
196	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
164	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
197	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
165	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
198	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
166	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
199	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
167	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
200	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
168	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
201	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
169	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
202	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
170	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
203	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
171	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
204	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
172	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
205	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
173	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
206	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
174	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
207	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
175	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
208	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
176	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
209	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
177	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
210	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
178	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
211	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
179	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
212	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
213	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
181	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
214	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
182	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
215	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
183	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
216	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
184	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
217	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
185	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
218	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
186	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
219	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
187	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
220	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
188	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
221	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
189	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
222	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
190	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
223	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
191	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
224	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
192	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
225	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
193	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
226	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
194	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
227	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
195	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
228	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
196	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
229	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
197	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
230	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
198	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
199	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
232	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
200	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
233	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSymbol	TokenNameIdentifier	 new Symbol
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
yytext	TokenNameIdentifier	 yytext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
201	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
yy_error	TokenNameIdentifier	 yy error
(	TokenNameLPAREN	
YY_E_INTERNAL	TokenNameIdentifier	 YY  E  INTERNAL
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
yy_initial	TokenNameIdentifier	 yy initial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
yy_state	TokenNameIdentifier	 yy state
=	TokenNameEQUAL	
yy_state_dtrans	TokenNameIdentifier	 yy state dtrans
[	TokenNameLBRACKET	
yy_lexical_state	TokenNameIdentifier	 yy lexical state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yy_next_state	TokenNameIdentifier	 yy next state
=	TokenNameEQUAL	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
;	TokenNameSEMICOLON	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
=	TokenNameEQUAL	
YY_NO_STATE	TokenNameIdentifier	 YY  NO  STATE
;	TokenNameSEMICOLON	
yy_mark_start	TokenNameIdentifier	 yy mark start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yy_this_accept	TokenNameIdentifier	 yy this accept
=	TokenNameEQUAL	
yy_acpt	TokenNameIdentifier	 yy acpt
[	TokenNameLBRACKET	
yy_state	TokenNameIdentifier	 yy state
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
YY_NOT_ACCEPT	TokenNameIdentifier	 YY  NOT  ACCEPT
!=	TokenNameNOT_EQUAL	
yy_this_accept	TokenNameIdentifier	 yy this accept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy_last_accept_state	TokenNameIdentifier	 yy last accept state
=	TokenNameEQUAL	
yy_state	TokenNameIdentifier	 yy state
;	TokenNameSEMICOLON	
yy_mark_end	TokenNameIdentifier	 yy mark end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
