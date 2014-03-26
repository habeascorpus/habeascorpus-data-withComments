package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
MessageImpl	TokenNameIdentifier	 Message Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
EscapeQuerySyntaxImpl	TokenNameIdentifier	 Escape Query Syntax Impl
implements	TokenNameimplements	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wildcardChars	TokenNameIdentifier	 wildcard Chars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'*'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'?'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escapableTermExtraFirstChars	TokenNameIdentifier	 escapable Term Extra First Chars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"+"	TokenNameStringLiteral	+
,	TokenNameCOMMA	
"-"	TokenNameStringLiteral	-
,	TokenNameCOMMA	
"@"	TokenNameStringLiteral	@
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escapableTermChars	TokenNameIdentifier	 escapable Term Chars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
"<"	TokenNameStringLiteral	<
,	TokenNameCOMMA	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
"="	TokenNameStringLiteral	=
,	TokenNameCOMMA	
"!"	TokenNameStringLiteral	!
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
,	TokenNameCOMMA	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
"^"	TokenNameStringLiteral	^
,	TokenNameCOMMA	
"["	TokenNameStringLiteral	[
,	TokenNameCOMMA	
"{"	TokenNameStringLiteral	{
,	TokenNameCOMMA	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
"}"	TokenNameStringLiteral	}
,	TokenNameCOMMA	
"~"	TokenNameStringLiteral	~
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// TODO: check what to do with these "*", "?", "\\" 	TokenNameCOMMENT_LINE	TODO: check what to do with these "*", "?", "\\" 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escapableQuotedChars	TokenNameIdentifier	 escapable Quoted Chars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"""	TokenNameStringLiteral	"
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escapableWhiteChars	TokenNameIdentifier	 escapable White Chars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escapableWordTokens	TokenNameIdentifier	 escapable Word Tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"AND"	TokenNameStringLiteral	AND
,	TokenNameCOMMA	
"OR"	TokenNameStringLiteral	OR
,	TokenNameCOMMA	
"NOT"	TokenNameStringLiteral	NOT
,	TokenNameCOMMA	
"TO"	TokenNameStringLiteral	TO
,	TokenNameCOMMA	
"WITHIN"	TokenNameStringLiteral	WITHIN
,	TokenNameCOMMA	
"SENTENCE"	TokenNameStringLiteral	SENTENCE
,	TokenNameCOMMA	
"PARAGRAPH"	TokenNameStringLiteral	PARAGRAPH
,	TokenNameCOMMA	
"INORDER"	TokenNameStringLiteral	INORDER
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
escapeChar	TokenNameIdentifier	 escape Char
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
// regular escapable Char for terms 	TokenNameCOMMENT_LINE	regular escapable Char for terms 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
escapableTermChars	TokenNameIdentifier	 escapable Term Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
replaceIgnoreCase	TokenNameIdentifier	 replace Ignore Case
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
escapableTermChars	TokenNameIdentifier	 escapable Term Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First Character of a term as more escaping chars 	TokenNameCOMMENT_LINE	First Character of a term as more escaping chars 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
escapableTermExtraFirstChars	TokenNameIdentifier	 escapable Term Extra First Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
escapableTermExtraFirstChars	TokenNameIdentifier	 escapable Term Extra First Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
escapeQuoted	TokenNameIdentifier	 escape Quoted
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
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
escapableQuotedChars	TokenNameIdentifier	 escapable Quoted Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
replaceIgnoreCase	TokenNameIdentifier	 replace Ignore Case
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
escapableTermChars	TokenNameIdentifier	 escapable Term Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
escapeTerm	TokenNameIdentifier	 escape Term
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
// Escape single Chars 	TokenNameCOMMENT_LINE	Escape single Chars 
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
escapeChar	TokenNameIdentifier	 escape Char
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
escapeWhiteChar	TokenNameIdentifier	 escape White Char
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Escape Parser Words 	TokenNameCOMMENT_LINE	Escape Parser Words 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
escapableWordTokens	TokenNameIdentifier	 escapable Word Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
escapableWordTokens	TokenNameIdentifier	 escapable Word Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * replace with ignore case * * @param string * string to get replaced * @param sequence1 * the old character sequence in lowercase * @param escapeChar * the new character to prefix sequence1 in return string. * @return the new String */	TokenNameCOMMENT_JAVADOC	 replace with ignore case * @param string string to get replaced @param sequence1 the old character sequence in lowercase @param escapeChar the new character to prefix sequence1 in return string. @return the new String 
private	TokenNameprivate	
static	TokenNamestatic	
CharSequence	TokenNameIdentifier	 Char Sequence
replaceIgnoreCase	TokenNameIdentifier	 replace Ignore Case
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
sequence1	TokenNameIdentifier	 sequence1
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
escapeChar	TokenNameIdentifier	 escape Char
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
escapeChar	TokenNameIdentifier	 escape Char
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
sequence1	TokenNameIdentifier	 sequence1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
string	TokenNameIdentifier	 string
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// empty string case 	TokenNameCOMMENT_LINE	empty string case 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sequence1Length	TokenNameIdentifier	 sequence1 Length
=	TokenNameEQUAL	
sequence1	TokenNameIdentifier	 sequence1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sequence1Length	TokenNameIdentifier	 sequence1 Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
escapeChar	TokenNameIdentifier	 escape Char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeChar	TokenNameIdentifier	 escape Char
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeChar	TokenNameIdentifier	 escape Char
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
// normal case 	TokenNameCOMMENT_LINE	normal case 
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
sequence1	TokenNameIdentifier	 sequence1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
copyStart	TokenNameIdentifier	 copy Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstIndex	TokenNameIdentifier	 first Index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstIndex	TokenNameIdentifier	 first Index
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sequence1	TokenNameIdentifier	 sequence1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstIndex	TokenNameIdentifier	 first Index
+	TokenNamePLUS	
sequence1Length	TokenNameIdentifier	 sequence1 Length
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
break	TokenNamebreak	
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
sequence1Length	TokenNameIdentifier	 sequence1 Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
firstIndex	TokenNameIdentifier	 first Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
sequence1	TokenNameIdentifier	 sequence1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
copyStart	TokenNameIdentifier	 copy Start
,	TokenNameCOMMA	
firstIndex	TokenNameIdentifier	 first Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeChar	TokenNameIdentifier	 escape Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
firstIndex	TokenNameIdentifier	 first Index
,	TokenNameCOMMA	
firstIndex	TokenNameIdentifier	 first Index
+	TokenNamePLUS	
sequence1Length	TokenNameIdentifier	 sequence1 Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyStart	TokenNameIdentifier	 copy Start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
firstIndex	TokenNameIdentifier	 first Index
+	TokenNamePLUS	
sequence1Length	TokenNameIdentifier	 sequence1 Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
firstIndex	TokenNameIdentifier	 first Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
copyStart	TokenNameIdentifier	 copy Start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
copyStart	TokenNameIdentifier	 copy Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * escape all tokens that are part of the parser syntax on a given string * * @param str * string to get replaced * @param locale * locale to be used when performing string compares * @return the new String */	TokenNameCOMMENT_JAVADOC	 escape all tokens that are part of the parser syntax on a given string * @param str string to get replaced @param locale locale to be used when performing string compares @return the new String 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
escapeWhiteChar	TokenNameIdentifier	 escape White Char
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
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
escapableWhiteChars	TokenNameIdentifier	 escapable White Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
replaceIgnoreCase	TokenNameIdentifier	 replace Ignore Case
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
escapableWhiteChars	TokenNameIdentifier	 escapable White Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
// escape wildcards and the escape char (this has to be perform before 	TokenNameCOMMENT_LINE	escape wildcards and the escape char (this has to be perform before 
// anything else) 	TokenNameCOMMENT_LINE	anything else) 
// since we need to preserve the UnescapedCharSequence and escape the 	TokenNameCOMMENT_LINE	since we need to preserve the UnescapedCharSequence and escape the 
// original escape chars 	TokenNameCOMMENT_LINE	original escape chars 
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
instanceof	TokenNameinstanceof	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
)	TokenNameRPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
toStringEscaped	TokenNameIdentifier	 to String Escaped
(	TokenNameLPAREN	
wildcardChars	TokenNameIdentifier	 wildcard Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
toStringEscaped	TokenNameIdentifier	 to String Escaped
(	TokenNameLPAREN	
wildcardChars	TokenNameIdentifier	 wildcard Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escapeQuoted	TokenNameIdentifier	 escape Quoted
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
escapeTerm	TokenNameIdentifier	 escape Term
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a String where the escape char has been removed, or kept only once * if there was a double escape. * * Supports escaped unicode characters, e. g. translates <code>A</code> to * <code>A</code>. * */	TokenNameCOMMENT_JAVADOC	 Returns a String where the escape char has been removed, or kept only once if there was a double escape. * Supports escaped unicode characters, e. g. translates <code>A</code> to <code>A</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
discardEscapeChar	TokenNameIdentifier	 discard Escape Char
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// Create char array to hold unescaped char sequence 	TokenNameCOMMENT_LINE	Create char array to hold unescaped char sequence 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wasEscaped	TokenNameIdentifier	 was Escaped
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// The length of the output can be less than the input 	TokenNameCOMMENT_LINE	The length of the output can be less than the input 
// due to discarded escape chars. This variable holds 	TokenNameCOMMENT_LINE	due to discarded escape chars. This variable holds 
// the actual length of the output 	TokenNameCOMMENT_LINE	the actual length of the output 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// We remember whether the last processed character was 	TokenNameCOMMENT_LINE	We remember whether the last processed character was 
// an escape character 	TokenNameCOMMENT_LINE	an escape character 
boolean	TokenNameboolean	
lastCharWasEscapeChar	TokenNameIdentifier	 last Char Was Escape Char
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// The multiplier the current unicode digit must be multiplied with. 	TokenNameCOMMENT_LINE	The multiplier the current unicode digit must be multiplied with. 
// E. g. the first digit must be multiplied with 16^3, the second with 	TokenNameCOMMENT_LINE	E. g. the first digit must be multiplied with 16^3, the second with 
// 16^2... 	TokenNameCOMMENT_LINE	16^2... 
int	TokenNameint	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Used to calculate the codepoint of the escaped unicode character 	TokenNameCOMMENT_LINE	Used to calculate the codepoint of the escaped unicode character 
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
curChar	TokenNameIdentifier	 cur Char
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codePoint	TokenNameIdentifier	 code Point
+=	TokenNamePLUS_EQUAL	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
curChar	TokenNameIdentifier	 cur Char
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
;	TokenNameSEMICOLON	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lastCharWasEscapeChar	TokenNameIdentifier	 last Char Was Escape Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curChar	TokenNameIdentifier	 cur Char
==	TokenNameEQUAL_EQUAL	
'u'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found an escaped unicode character 	TokenNameCOMMENT_LINE	found an escaped unicode character 
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this character was escaped 	TokenNameCOMMENT_LINE	this character was escaped 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curChar	TokenNameIdentifier	 cur Char
;	TokenNameSEMICOLON	
wasEscaped	TokenNameIdentifier	 was Escaped
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastCharWasEscapeChar	TokenNameIdentifier	 last Char Was Escape Char
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curChar	TokenNameIdentifier	 cur Char
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastCharWasEscapeChar	TokenNameIdentifier	 last Char Was Escape Char
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curChar	TokenNameIdentifier	 cur Char
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
codePointMultiplier	TokenNameIdentifier	 code Point Multiplier
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastCharWasEscapeChar	TokenNameIdentifier	 last Char Was Escape Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
INVALID_SYNTAX_ESCAPE_CHARACTER	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  CHARACTER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UnescapedCharSequence	TokenNameIdentifier	 Unescaped Char Sequence
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
wasEscaped	TokenNameIdentifier	 was Escaped
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the numeric value of the hexadecimal character */	TokenNameCOMMENT_JAVADOC	 Returns the numeric value of the hexadecimal character 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
hexToInt	TokenNameIdentifier	 hex To Int
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
INVALID_SYNTAX_ESCAPE_NONE_HEX_UNICODE	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  NONE  HEX  UNICODE
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
