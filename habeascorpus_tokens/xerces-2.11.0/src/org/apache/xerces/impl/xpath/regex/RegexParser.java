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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * A Regular Expression Parser. * * @xerces.internal * * @version $Id: RegexParser.java 1033661 2010-11-10 19:31:44Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 A Regular Expression Parser. * @xerces.internal * @version $Id: RegexParser.java 1033661 2010-11-10 19:31:44Z knoaman $ 
class	TokenNameclass	
RegexParser	TokenNameIdentifier	 Regex Parser
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_CHAR	TokenNameIdentifier	 T  CHAR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_EOF	TokenNameIdentifier	 T  EOF
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_OR	TokenNameIdentifier	 T  OR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '|' 	TokenNameCOMMENT_LINE	'|' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_STAR	TokenNameIdentifier	 T  STAR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '*' 	TokenNameCOMMENT_LINE	'*' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_PLUS	TokenNameIdentifier	 T  PLUS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '+' 	TokenNameCOMMENT_LINE	'+' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '?' 	TokenNameCOMMENT_LINE	'?' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_LPAREN	TokenNameIdentifier	 T  LPAREN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(' 	TokenNameCOMMENT_LINE	'(' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_RPAREN	TokenNameIdentifier	 T  RPAREN
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ')' 	TokenNameCOMMENT_LINE	')' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_DOT	TokenNameIdentifier	 T  DOT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '.' 	TokenNameCOMMENT_LINE	'.' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_LBRACKET	TokenNameIdentifier	 T  LBRACKET
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '[' 	TokenNameCOMMENT_LINE	'[' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '\' 	TokenNameCOMMENT_LINE	'\' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_CARET	TokenNameIdentifier	 T  CARET
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '^' 	TokenNameCOMMENT_LINE	'^' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_DOLLAR	TokenNameIdentifier	 T  DOLLAR
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '$' 	TokenNameCOMMENT_LINE	'$' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_LPAREN2	TokenNameIdentifier	 T  LPARE N2
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?:' 	TokenNameCOMMENT_LINE	'(?:' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_LOOKAHEAD	TokenNameIdentifier	 T  LOOKAHEAD
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?=' 	TokenNameCOMMENT_LINE	'(?=' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_NEGATIVELOOKAHEAD	TokenNameIdentifier	 T  NEGATIVELOOKAHEAD
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?!' 	TokenNameCOMMENT_LINE	'(?!' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_LOOKBEHIND	TokenNameIdentifier	 T  LOOKBEHIND
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?<=' 	TokenNameCOMMENT_LINE	'(?<=' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_NEGATIVELOOKBEHIND	TokenNameIdentifier	 T  NEGATIVELOOKBEHIND
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?<!' 	TokenNameCOMMENT_LINE	'(?<!' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_INDEPENDENT	TokenNameIdentifier	 T  INDEPENDENT
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?>' 	TokenNameCOMMENT_LINE	'(?>' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_SET_OPERATIONS	TokenNameIdentifier	 T  SET  OPERATIONS
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?[' 	TokenNameCOMMENT_LINE	'(?[' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_POSIX_CHARCLASS_START	TokenNameIdentifier	 T  POSIX  CHARCLASS  START
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '[:' in a character class 	TokenNameCOMMENT_LINE	'[:' in a character class 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_COMMENT	TokenNameIdentifier	 T  COMMENT
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?#' 	TokenNameCOMMENT_LINE	'(?#' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_MODIFIERS	TokenNameIdentifier	 T  MODIFIERS
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?' [\-,a-z,A-Z] 	TokenNameCOMMENT_LINE	'(?' [\-,a-z,A-Z] 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_CONDITION	TokenNameIdentifier	 T  CONDITION
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '(?(' 	TokenNameCOMMENT_LINE	'(?(' 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_XMLSCHEMA_CC_SUBTRACTION	TokenNameIdentifier	 T  XMLSCHEMA  CC  SUBTRACTION
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// '-[' in a character class 	TokenNameCOMMENT_LINE	'-[' in a character class 
static	TokenNamestatic	
class	TokenNameclass	
ReferencePosition	TokenNameIdentifier	 Reference Position
{	TokenNameLBRACE	
int	TokenNameint	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
ReferencePosition	TokenNameIdentifier	 Reference Position
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
int	TokenNameint	
regexlen	TokenNameIdentifier	 regexlen
;	TokenNameSEMICOLON	
int	TokenNameint	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
int	TokenNameint	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
int	TokenNameint	
nexttoken	TokenNameIdentifier	 nexttoken
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
S_NORMAL	TokenNameIdentifier	 S  NORMAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
S_INBRACKETS	TokenNameIdentifier	 S  INBRACKETS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
S_INXBRACKETS	TokenNameIdentifier	 S  INXBRACKETS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
S_NORMAL	TokenNameIdentifier	 S  NORMAL
;	TokenNameSEMICOLON	
int	TokenNameint	
parenOpened	TokenNameIdentifier	 paren Opened
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
parennumber	TokenNameIdentifier	 parennumber
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasBackReferences	TokenNameIdentifier	 has Back References
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
references	TokenNameIdentifier	 references
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RegexParser	TokenNameIdentifier	 Regex Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RegexParser	TokenNameIdentifier	 Regex Parser
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.xpath.regex.message"	TokenNameStringLiteral	org.apache.xerces.impl.xpath.regex.message
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.xerces.impl.xpath.regex.message"	TokenNameStringLiteral	org.apache.xerces.impl.xpath.regex.message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Installation Problem??? Couldn't load messages: "	TokenNameStringLiteral	Installation Problem??? Couldn't load messages: 
+	TokenNamePLUS	
mre	TokenNameIdentifier	 mre
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
&	TokenNameAND	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
Token	TokenNameIdentifier	 Token
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setContext	TokenNameIdentifier	 set Context
(	TokenNameLPAREN	
S_NORMAL	TokenNameIdentifier	 S  NORMAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parenOpened	TokenNameIdentifier	 paren Opened
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
EXTENDED_COMMENT	TokenNameIdentifier	 EXTENDED  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
stripExtendedComment	TokenNameIdentifier	 strip Extended Comment
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.parse.1"	TokenNameStringLiteral	parser.parse.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReferencePosition	TokenNameIdentifier	 Reference Position
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReferencePosition	TokenNameIdentifier	 Reference Position
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
<=	TokenNameLESS_EQUAL	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.parse.2"	TokenNameStringLiteral	parser.parse.2
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public RegularExpression createRegex(String regex, int options) throws ParseException { Token tok = this.parse(regex, options); return new RegularExpression(regex, tok, this.parennumber, this.hasBackReferences, options); } */	TokenNameCOMMENT_BLOCK	 public RegularExpression createRegex(String regex, int options) throws ParseException { Token tok = this.parse(regex, options); return new RegularExpression(regex, tok, this.parennumber, this.hasBackReferences, options); } 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setContext	TokenNameIdentifier	 set Context
(	TokenNameLPAREN	
int	TokenNameint	
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
nexttoken	TokenNameIdentifier	 nexttoken
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nexttoken	TokenNameIdentifier	 nexttoken
=	TokenNameEQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
S_INBRACKETS	TokenNameIdentifier	 S  INBRACKETS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In a character class, this.chardata has one character, that is to say, 	TokenNameCOMMENT_LINE	In a character class, this.chardata has one character, that is to say, 
// a pair of surrogates is composed and stored to this.chardata. 	TokenNameCOMMENT_LINE	a pair of surrogates is composed and stored to this.chardata. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
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
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Allow character class subtraction (regardless of whether we are in 	TokenNameCOMMENT_LINE	Allow character class subtraction (regardless of whether we are in 
// XML Schema mode or not) 	TokenNameCOMMENT_LINE	XML Schema mode or not) 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_XMLSCHEMA_CC_SUBTRACTION	TokenNameIdentifier	 T  XMLSCHEMA  CC  SUBTRACTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_POSIX_CHARCLASS_START	TokenNameIdentifier	 T  POSIX  CHARCLASS  START
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Through down 	TokenNameCOMMENT_LINE	Through down 
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nexttoken	TokenNameIdentifier	 nexttoken
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_OR	TokenNameIdentifier	 T  OR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_STAR	TokenNameIdentifier	 T  STAR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_PLUS	TokenNameIdentifier	 T  PLUS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_RPAREN	TokenNameIdentifier	 T  RPAREN
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_DOT	TokenNameIdentifier	 T  DOT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_LBRACKET	TokenNameIdentifier	 T  LBRACKET
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'^'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CARET	TokenNameIdentifier	 T  CARET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'$'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_DOLLAR	TokenNameIdentifier	 T  DOLLAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_LPAREN	TokenNameIdentifier	 T  LPAREN
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.2"	TokenNameStringLiteral	parser.next.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
':'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_LPAREN2	TokenNameIdentifier	 T  LPARE N2
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'='	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_LOOKAHEAD	TokenNameIdentifier	 T  LOOKAHEAD
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_NEGATIVELOOKAHEAD	TokenNameIdentifier	 T  NEGATIVELOOKAHEAD
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_SET_OPERATIONS	TokenNameIdentifier	 T  SET  OPERATIONS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_INDEPENDENT	TokenNameIdentifier	 T  INDEPENDENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.2"	TokenNameStringLiteral	parser.next.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_LOOKBEHIND	TokenNameIdentifier	 T  LOOKBEHIND
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_NEGATIVELOOKBEHIND	TokenNameIdentifier	 T  NEGATIVELOOKBEHIND
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.3"	TokenNameStringLiteral	parser.next.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'#'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.4"	TokenNameStringLiteral	parser.next.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_COMMENT	TokenNameIdentifier	 T  COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
'a'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
'A'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Options 	TokenNameCOMMENT_LINE	Options 
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_MODIFIERS	TokenNameIdentifier	 T  MODIFIERS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// conditional 	TokenNameCOMMENT_LINE	conditional 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CONDITION	TokenNameIdentifier	 T  CONDITION
;	TokenNameSEMICOLON	
// this.offsets points the next of '('. 	TokenNameCOMMENT_LINE	this.offsets points the next of '('. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.next.2"	TokenNameStringLiteral	parser.next.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
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
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nexttoken	TokenNameIdentifier	 nexttoken
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * regex ::= term (`|` term)* * term ::= factor+ * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>' * | atom (('*' | '+' | '?' | minmax ) '?'? )?) * | '(?=' regex ')' | '(?!' regex ')' | '(?&lt;=' regex ')' | '(?&lt;!' regex ')' * atom ::= char | '.' | range | '(' regex ')' | '(?:' regex ')' | '\' [0-9] * | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block */	TokenNameCOMMENT_JAVADOC	 regex ::= term (`|` term)* term ::= factor+ factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>' | atom (('*' | '+' | '?' | minmax ) '?'? )?) | '(?=' regex ')' | '(?!' regex ')' | '(?&lt;=' regex ')' | '(?&lt;!' regex ')' atom ::= char | '.' | range | '(' regex ')' | '(?:' regex ')' | '\' [0-9] | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block 
Token	TokenNameIdentifier	 Token
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseTerm	TokenNameIdentifier	 parse Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_OR	TokenNameIdentifier	 T  OR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// '|' 	TokenNameCOMMENT_LINE	'|' 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parseTerm	TokenNameIdentifier	 parse Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * term ::= factor+ */	TokenNameCOMMENT_JAVADOC	 term ::= factor+ 
Token	TokenNameIdentifier	 Token
parseTerm	TokenNameIdentifier	 parse Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
T_OR	TokenNameIdentifier	 T  OR
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
T_RPAREN	TokenNameIdentifier	 T  RPAREN
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createEmpty	TokenNameIdentifier	 create Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseFactor	TokenNameIdentifier	 parse Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
concat	TokenNameIdentifier	 concat
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
T_OR	TokenNameIdentifier	 T  OR
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
T_RPAREN	TokenNameIdentifier	 T  RPAREN
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
T_EOF	TokenNameIdentifier	 T  EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
concat	TokenNameIdentifier	 concat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
concat	TokenNameIdentifier	 concat
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
concat	TokenNameIdentifier	 concat
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
concat	TokenNameIdentifier	 concat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
concat	TokenNameIdentifier	 concat
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parseFactor	TokenNameIdentifier	 parse Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//tok = Token.createConcat(tok, this.parseFactor()); 	TokenNameCOMMENT_LINE	tok = Token.createConcat(tok, this.parseFactor()); 
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------- 
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
token_linebeginning	TokenNameIdentifier	 token linebeginning
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
token_lineend	TokenNameIdentifier	 token lineend
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processLookahead	TokenNameIdentifier	 process Lookahead
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
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// ')' 	TokenNameCOMMENT_LINE	')' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processNegativelookahead	TokenNameIdentifier	 process Negativelookahead
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
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// ')' 	TokenNameCOMMENT_LINE	')' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processLookbehind	TokenNameIdentifier	 process Lookbehind
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
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// ')' 	TokenNameCOMMENT_LINE	')' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processNegativelookbehind	TokenNameIdentifier	 process Negativelookbehind
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
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// ')' 	TokenNameCOMMENT_LINE	')' 
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_A	TokenNameIdentifier	 process Backsolidus  A
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
token_stringbeginning	TokenNameIdentifier	 token stringbeginning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_Z	TokenNameIdentifier	 process Backsolidus  Z
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
token_stringend2	TokenNameIdentifier	 token stringend2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_z	TokenNameIdentifier	 process Backsolidus z
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
token_stringend	TokenNameIdentifier	 token stringend
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_b	TokenNameIdentifier	 process Backsolidus b
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
token_wordedge	TokenNameIdentifier	 token wordedge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_B	TokenNameIdentifier	 process Backsolidus  B
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
token_not_wordedge	TokenNameIdentifier	 token not wordedge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_lt	TokenNameIdentifier	 process Backsolidus lt
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
token_wordbeginning	TokenNameIdentifier	 token wordbeginning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_gt	TokenNameIdentifier	 process Backsolidus gt
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
token_wordend	TokenNameIdentifier	 token wordend
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
)	TokenNameRPAREN	
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
createNGClosure	TokenNameIdentifier	 create NG Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
)	TokenNameRPAREN	
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
createConcat	TokenNameIdentifier	 create Concat
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createNGClosure	TokenNameIdentifier	 create NG Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
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
off	TokenNameIdentifier	 off
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
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
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parenOpened	TokenNameIdentifier	 paren Opened
++	TokenNamePLUS_PLUS	
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
p	TokenNameIdentifier	 p
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
parennumber	TokenNameIdentifier	 parennumber
++	TokenNamePLUS_PLUS	
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
processCondition	TokenNameIdentifier	 process Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// this.offset points the next of '(' 	TokenNameCOMMENT_LINE	this.offset points the next of '(' 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.4"	TokenNameStringLiteral	parser.factor.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parses a condition. 	TokenNameCOMMENT_LINE	Parses a condition. 
int	TokenNameint	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
'1'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
finalRefno	TokenNameIdentifier	 final Refno
=	TokenNameEQUAL	
refno	TokenNameIdentifier	 refno
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
<=	TokenNameLESS_EQUAL	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.parse.2"	TokenNameStringLiteral	parser.parse.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finalRefno	TokenNameIdentifier	 final Refno
=	TokenNameEQUAL	
refno	TokenNameIdentifier	 refno
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
ReferencePosition	TokenNameIdentifier	 Reference Position
(	TokenNameLPAREN	
finalRefno	TokenNameIdentifier	 final Refno
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.1"	TokenNameStringLiteral	parser.factor.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// Points '('. 	TokenNameCOMMENT_LINE	Points '('. 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseFactor	TokenNameIdentifier	 parse Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.5"	TokenNameStringLiteral	parser.factor.5
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Parses yes/no-patterns. 	TokenNameCOMMENT_LINE	Parses yes/no-patterns. 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
yesPattern	TokenNameIdentifier	 yes Pattern
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
noPattern	TokenNameIdentifier	 no Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yesPattern	TokenNameIdentifier	 yes Pattern
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yesPattern	TokenNameIdentifier	 yes Pattern
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.6"	TokenNameStringLiteral	parser.factor.6
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
noPattern	TokenNameIdentifier	 no Pattern
=	TokenNameEQUAL	
yesPattern	TokenNameIdentifier	 yes Pattern
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yesPattern	TokenNameIdentifier	 yes Pattern
=	TokenNameEQUAL	
yesPattern	TokenNameIdentifier	 yes Pattern
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
yesPattern	TokenNameIdentifier	 yes Pattern
,	TokenNameCOMMA	
noPattern	TokenNameIdentifier	 no Pattern
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
// this.offset points the next of '?'. 	TokenNameCOMMENT_LINE	this.offset points the next of '?'. 
// modifiers ::= [imsw]* ('-' [imsw]*)? ':' 	TokenNameCOMMENT_LINE	modifiers ::= [imsw]* ('-' [imsw]*)? ':' 
int	TokenNameint	
add	TokenNameIdentifier	 add
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// '-' or ':'? 	TokenNameCOMMENT_LINE	'-' or ':'? 
add	TokenNameIdentifier	 add
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.2"	TokenNameStringLiteral	parser.factor.2
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
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// ':'? 	TokenNameCOMMENT_LINE	':'? 
mask	TokenNameIdentifier	 mask
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.2"	TokenNameStringLiteral	parser.factor.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createModifierGroup	TokenNameIdentifier	 create Modifier Group
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
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
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// such as (?-i) 	TokenNameCOMMENT_LINE	such as (?-i) 
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createModifierGroup	TokenNameIdentifier	 create Modifier Group
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.factor.3"	TokenNameStringLiteral	parser.factor.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processIndependent	TokenNameIdentifier	 process Independent
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
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
parseRegex	TokenNameIdentifier	 parse Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
processBacksolidus_c	TokenNameIdentifier	 process Backsolidus c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
// Must be in 0x0040-0x005f 	TokenNameCOMMENT_LINE	Must be in 0x0040-0x005f 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xffe0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x0040	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.1"	TokenNameStringLiteral	parser.atom.1
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
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
-	TokenNameMINUS	
0x40	TokenNameIntegerLiteral	
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
processBacksolidus_i	TokenNameIdentifier	 process Backsolidus i
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
processBacksolidus_I	TokenNameIdentifier	 process Backsolidus  I
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
processBacksolidus_g	TokenNameIdentifier	 process Backsolidus g
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
getGraphemePattern	TokenNameIdentifier	 get Grapheme Pattern
(	TokenNameLPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getCombiningCharacterSequence	TokenNameIdentifier	 get Combining Character Sequence
(	TokenNameLPAREN	
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
int	TokenNameint	
refnum	TokenNameIdentifier	 refnum
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
finalRefnum	TokenNameIdentifier	 final Refnum
=	TokenNameEQUAL	
refnum	TokenNameIdentifier	 refnum
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
<=	TokenNameLESS_EQUAL	
refnum	TokenNameIdentifier	 refnum
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.parse.2"	TokenNameStringLiteral	parser.parse.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refnum	TokenNameIdentifier	 refnum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
refnum	TokenNameIdentifier	 refnum
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refnum	TokenNameIdentifier	 refnum
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
finalRefnum	TokenNameIdentifier	 final Refnum
=	TokenNameEQUAL	
refnum	TokenNameIdentifier	 refnum
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createBackReference	TokenNameIdentifier	 create Back Reference
(	TokenNameLPAREN	
finalRefnum	TokenNameIdentifier	 final Refnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
ReferencePosition	TokenNameIdentifier	 Reference Position
(	TokenNameLPAREN	
finalRefnum	TokenNameIdentifier	 final Refnum
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------- 
/** * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>' * | atom (('*' | '+' | '?' | minmax ) '?'? )?) * | '(?=' regex ')' | '(?!' regex ')' | '(?&lt;=' regex ')' | '(?&lt;!' regex ')' * | '(?#' [^)]* ')' * minmax ::= '{' min (',' max?)? '}' * min ::= [0-9]+ * max ::= [0-9]+ */	TokenNameCOMMENT_JAVADOC	 factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>' | atom (('*' | '+' | '?' | minmax ) '?'? )?) | '(?=' regex ')' | '(?!' regex ')' | '(?&lt;=' regex ')' | '(?&lt;!' regex ')' | '(?#' [^)]* ')' minmax ::= '{' min (',' max?)? '}' min ::= [0-9]+ max ::= [0-9]+ 
Token	TokenNameIdentifier	 Token
parseFactor	TokenNameIdentifier	 parse Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
T_CARET	TokenNameIdentifier	 T  CARET
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processCaret	TokenNameIdentifier	 process Caret
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_DOLLAR	TokenNameIdentifier	 T  DOLLAR
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processDollar	TokenNameIdentifier	 process Dollar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_LOOKAHEAD	TokenNameIdentifier	 T  LOOKAHEAD
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processLookahead	TokenNameIdentifier	 process Lookahead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_NEGATIVELOOKAHEAD	TokenNameIdentifier	 T  NEGATIVELOOKAHEAD
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processNegativelookahead	TokenNameIdentifier	 process Negativelookahead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_LOOKBEHIND	TokenNameIdentifier	 T  LOOKBEHIND
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processLookbehind	TokenNameIdentifier	 process Lookbehind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_NEGATIVELOOKBEHIND	TokenNameIdentifier	 T  NEGATIVELOOKBEHIND
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processNegativelookbehind	TokenNameIdentifier	 process Negativelookbehind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_COMMENT	TokenNameIdentifier	 T  COMMENT
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createEmpty	TokenNameIdentifier	 create Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_A	TokenNameIdentifier	 process Backsolidus  A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_Z	TokenNameIdentifier	 process Backsolidus  Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_z	TokenNameIdentifier	 process Backsolidus z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_b	TokenNameIdentifier	 process Backsolidus b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'B'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_B	TokenNameIdentifier	 process Backsolidus  B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_lt	TokenNameIdentifier	 process Backsolidus lt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_gt	TokenNameIdentifier	 process Backsolidus gt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// through down 	TokenNameCOMMENT_LINE	through down 
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseAtom	TokenNameIdentifier	 parse Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
T_STAR	TokenNameIdentifier	 T  STAR
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processStar	TokenNameIdentifier	 process Star
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_PLUS	TokenNameIdentifier	 T  PLUS
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processPlus	TokenNameIdentifier	 process Plus
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_QUESTION	TokenNameIdentifier	 T  QUESTION
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processQuestion	TokenNameIdentifier	 process Question
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_CHAR	TokenNameIdentifier	 T  CHAR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// this.offset -> next of '{' 	TokenNameCOMMENT_LINE	this.offset -> next of '{' 
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.5"	TokenNameStringLiteral	parser.quantifier.5
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.1"	TokenNameStringLiteral	parser.quantifier.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.3"	TokenNameStringLiteral	parser.quantifier.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// {min,max} 	TokenNameCOMMENT_LINE	{min,max} 
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.5"	TokenNameStringLiteral	parser.quantifier.5
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.4"	TokenNameStringLiteral	parser.quantifier.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// assume {min,} 	TokenNameCOMMENT_LINE	assume {min,} 
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.quantifier.2"	TokenNameStringLiteral	parser.quantifier.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
checkQuestion	TokenNameIdentifier	 check Question
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// off -> next of '}' 	TokenNameCOMMENT_LINE	off -> next of '}' 
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createNGClosure	TokenNameIdentifier	 create NG Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("CLOSURE: "+min+", "+max); 	TokenNameCOMMENT_LINE	System.err.println("CLOSURE: "+min+", "+max); 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9] * | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block * | '(?>' regex ')' * char ::= '\\' | '\' [efnrt] | bmp-code | character-1 */	TokenNameCOMMENT_JAVADOC	 atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9] | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block | '(?>' regex ')' char ::= '\\' | '\' [efnrt] | bmp-code | character-1 
Token	TokenNameIdentifier	 Token
parseAtom	TokenNameIdentifier	 parse Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
T_LPAREN	TokenNameIdentifier	 T  LPAREN
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processParen	TokenNameIdentifier	 process Paren
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_LPAREN2	TokenNameIdentifier	 T  LPARE N2
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processParen2	TokenNameIdentifier	 process Paren2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// '(?:' 	TokenNameCOMMENT_LINE	'(?:' 
case	TokenNamecase	
T_CONDITION	TokenNameIdentifier	 T  CONDITION
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processCondition	TokenNameIdentifier	 process Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// '(?(' 	TokenNameCOMMENT_LINE	'(?(' 
case	TokenNamecase	
T_MODIFIERS	TokenNameIdentifier	 T  MODIFIERS
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processModifiers	TokenNameIdentifier	 process Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (?modifiers ... ) 	TokenNameCOMMENT_LINE	(?modifiers ... ) 
case	TokenNamecase	
T_INDEPENDENT	TokenNameIdentifier	 T  INDEPENDENT
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processIndependent	TokenNameIdentifier	 process Independent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_DOT	TokenNameIdentifier	 T  DOT
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skips '.' 	TokenNameCOMMENT_LINE	Skips '.' 
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_dot	TokenNameIdentifier	 token dot
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
/** * char-class ::= '[' ( '^'? range ','?)+ ']' * range ::= '\d' | '\w' | '\s' | category-block | range-char * | range-char '-' range-char * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2 * bmp-char ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] */	TokenNameCOMMENT_JAVADOC	 char-class ::= '[' ( '^'? range ','?)+ ']' range ::= '\d' | '\w' | '\s' | category-block | range-char | range-char '-' range-char range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2 bmp-char ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] 
case	TokenNamecase	
T_LBRACKET	TokenNameIdentifier	 T  LBRACKET
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
parseCharacterClass	TokenNameIdentifier	 parse Character Class
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_SET_OPERATIONS	TokenNameIdentifier	 T  SET  OPERATIONS
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
parseSetOperations	TokenNameIdentifier	 parse Set Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
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
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
decomposeToSurrogates	TokenNameIdentifier	 decompose To Surrogates
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_c	TokenNameIdentifier	 process Backsolidus c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_C	TokenNameIdentifier	 process Backsolidus  C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_i	TokenNameIdentifier	 process Backsolidus i
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_I	TokenNameIdentifier	 process Backsolidus  I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'g'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_g	TokenNameIdentifier	 process Backsolidus g
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'X'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBacksolidus_X	TokenNameIdentifier	 process Backsolidus  X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processBackreference	TokenNameIdentifier	 process Backreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
pstart	TokenNameIdentifier	 pstart
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
processBacksolidus_pP	TokenNameIdentifier	 process Backsolidus p P
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
T_CHAR	TokenNameIdentifier	 T  CHAR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.4"	TokenNameStringLiteral	parser.atom.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
T_CHAR	TokenNameIdentifier	 T  CHAR
&&	TokenNameAND_AND	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sur	TokenNameIdentifier	 sur
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sur	TokenNameIdentifier	 sur
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
;	TokenNameSEMICOLON	
sur	TokenNameIdentifier	 sur
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createParen	TokenNameIdentifier	 create Paren
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
sur	TokenNameIdentifier	 sur
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.4"	TokenNameStringLiteral	parser.atom.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
processBacksolidus_pP	TokenNameIdentifier	 process Backsolidus p P
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
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
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.2"	TokenNameStringLiteral	parser.atom.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handle category escape 	TokenNameCOMMENT_LINE	handle category escape 
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'p'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
namestart	TokenNameIdentifier	 namestart
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
nameend	TokenNameIdentifier	 nameend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
namestart	TokenNameIdentifier	 namestart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameend	TokenNameIdentifier	 nameend
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.atom.3"	TokenNameStringLiteral	parser.atom.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pname	TokenNameIdentifier	 pname
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
namestart	TokenNameIdentifier	 namestart
,	TokenNameCOMMA	
nameend	TokenNameIdentifier	 nameend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
nameend	TokenNameIdentifier	 nameend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
pname	TokenNameIdentifier	 pname
,	TokenNameCOMMA	
positive	TokenNameIdentifier	 positive
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
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
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * char-class ::= '[' ( '^'? range ','?)+ ']' * range ::= '\d' | '\w' | '\s' | category-block | range-char * | range-char '-' range-char * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2 * bmp-code ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] */	TokenNameCOMMENT_JAVADOC	 char-class ::= '[' ( '^'? range ','?)+ ']' range ::= '\d' | '\w' | '\s' | category-block | range-char | range-char '-' range-char range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2 bmp-code ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] 
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
if	TokenNameif	
(	TokenNameLPAREN	
useNrange	TokenNameIdentifier	 use Nrange
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createNRange	TokenNameIdentifier	 create N Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
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
// POSIX Character class such as [:alnum:] 	TokenNameCOMMENT_LINE	POSIX Character class such as [:alnum:] 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_POSIX_CHARCLASS_START	TokenNameIdentifier	 T  POSIX  CHARCLASS  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nameend	TokenNameIdentifier	 nameend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameend	TokenNameIdentifier	 nameend
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.1"	TokenNameStringLiteral	parser.cc.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
nameend	TokenNameIdentifier	 nameend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.3"	TokenNameStringLiteral	parser.cc.3
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameend	TokenNameIdentifier	 nameend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
regexlen	TokenNameIdentifier	 regexlen
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
nameend	TokenNameIdentifier	 nameend
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.cc.1"	TokenNameStringLiteral	parser.cc.1
,	TokenNameCOMMA	
nameend	TokenNameIdentifier	 nameend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
nameend	TokenNameIdentifier	 nameend
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
nrange	TokenNameIdentifier	 nrange
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nrange	TokenNameIdentifier	 nrange
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useNrange	TokenNameIdentifier	 use Nrange
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
complementRanges	TokenNameIdentifier	 complement Ranges
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
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
T_BACKSOLIDUS	TokenNameIdentifier	 T  BACKSOLIDUS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rangeend	TokenNameIdentifier	 rangeend
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeEscaped	TokenNameIdentifier	 decode Escaped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
SPECIAL_COMMA	TokenNameIdentifier	 SPECIAL  COMMA
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
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
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
useNrange	TokenNameIdentifier	 use Nrange
&&	TokenNameAND_AND	
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
/** * '(?[' ... ']' (('-' | '+' | '&') '[' ... ']')? ')' */	TokenNameCOMMENT_JAVADOC	 '(?[' ... ']' (('-' | '+' | '&') '[' ... ']')? ')' 
protected	TokenNameprotected	
RangeToken	TokenNameIdentifier	 Range Token
parseSetOperations	TokenNameIdentifier	 parse Set Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseCharacterClass	TokenNameIdentifier	 parse Character Class
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
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
T_RPAREN	TokenNameIdentifier	 T  RPAREN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
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
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_PLUS	TokenNameIdentifier	 T  PLUS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
T_LBRACKET	TokenNameIdentifier	 T  LBRACKET
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.ope.1"	TokenNameStringLiteral	parser.ope.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RangeToken	TokenNameIdentifier	 Range Token
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
parseCharacterClass	TokenNameIdentifier	 parse Character Class
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
T_PLUS	TokenNameIdentifier	 T  PLUS
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
mergeRanges	TokenNameIdentifier	 merge Ranges
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
subtractRanges	TokenNameIdentifier	 subtract Ranges
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
intersectRanges	TokenNameIdentifier	 intersect Ranges
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ASSERT"	TokenNameStringLiteral	ASSERT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.ope.2"	TokenNameStringLiteral	parser.ope.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
getTokenForShorthand	TokenNameIdentifier	 get Token For Shorthand
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"Nd"	TokenNameStringLiteral	Nd
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_0to9	TokenNameIdentifier	 token 0to9
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"Nd"	TokenNameStringLiteral	Nd
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_0to9	TokenNameIdentifier	 token not 0to9
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'w'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_wordchars	TokenNameIdentifier	 token wordchars
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'W'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_wordchars	TokenNameIdentifier	 token not wordchars
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"IsSpace"	TokenNameStringLiteral	IsSpace
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_spaces	TokenNameIdentifier	 token spaces
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"IsSpace"	TokenNameStringLiteral	IsSpace
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
token_not_spaces	TokenNameIdentifier	 token not spaces
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
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
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0x1b	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// ESCAPE U+001B 	TokenNameCOMMENT_LINE	ESCAPE U+001B 
case	TokenNamecase	
'f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// FORM FEED U+000C 	TokenNameCOMMENT_LINE	FORM FEED U+000C 
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
//case 'v': c = 0x0b; break; // VERTICAL TABULATION U+000B 	TokenNameCOMMENT_LINE	case 'v': c = 0x0b; break; // VERTICAL TABULATION U+000B 
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
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
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uv	TokenNameIdentifier	 uv
>	TokenNameGREATER	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.2"	TokenNameStringLiteral	parser.descape.2
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
!=	TokenNameNOT_EQUAL	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.3"	TokenNameStringLiteral	parser.descape.3
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
uv	TokenNameIdentifier	 uv
>	TokenNameGREATER	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.4"	TokenNameStringLiteral	parser.descape.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.1"	TokenNameStringLiteral	parser.descape.1
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uv	TokenNameIdentifier	 uv
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uv	TokenNameIdentifier	 uv
>	TokenNameGREATER	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UTF16_MAX	TokenNameIdentifier	 UT F16  MAX
)	TokenNameRPAREN	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descappe.4"	TokenNameStringLiteral	parser.descappe.4
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
uv	TokenNameIdentifier	 uv
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
"parser.descape.5"	TokenNameStringLiteral	parser.descape.5
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hexChar	TokenNameIdentifier	 hex Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
addCaseInsensitiveChar	TokenNameIdentifier	 add Case Insensitive Char
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
caseMap	TokenNameIdentifier	 case Map
=	TokenNameEQUAL	
CaseInsensitiveMap	TokenNameIdentifier	 Case Insensitive Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
caseMap	TokenNameIdentifier	 case Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
caseMap	TokenNameIdentifier	 case Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
caseMap	TokenNameIdentifier	 case Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
caseMap	TokenNameIdentifier	 case Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
addCaseInsensitiveCharRange	TokenNameIdentifier	 add Case Insensitive Char Range
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
caseMap	TokenNameIdentifier	 case Map
;	TokenNameSEMICOLON	
int	TokenNameint	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseMap	TokenNameIdentifier	 case Map
=	TokenNameEQUAL	
CaseInsensitiveMap	TokenNameIdentifier	 Case Insensitive Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
caseMap	TokenNameIdentifier	 case Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
caseMap	TokenNameIdentifier	 case Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
caseMap	TokenNameIdentifier	 case Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
caseMap	TokenNameIdentifier	 case Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
