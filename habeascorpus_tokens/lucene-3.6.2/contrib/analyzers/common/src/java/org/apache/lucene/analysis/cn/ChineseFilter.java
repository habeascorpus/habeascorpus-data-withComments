package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
CharArraySet	TokenNameIdentifier	 Char Array Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
StopFilter	TokenNameIdentifier	 Stop Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * A {@link TokenFilter} with a stop word table. * <ul> * <li>Numeric tokens are removed. * <li>English tokens must be larger than 1 character. * <li>One Chinese character as one Chinese word. * </ul> * TO DO: * <ol> * <li>Add Chinese stop words, such as ?	TokenNameCOMMENT_JAVADOC	 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ChineseFilter	TokenNameIdentifier	 Chinese Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
// Only English now, Chinese to be added later. 	TokenNameCOMMENT_LINE	Only English now, Chinese to be added later. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
STOP_WORDS	TokenNameIdentifier	 STOP  WORDS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"are"	TokenNameStringLiteral	are
,	TokenNameCOMMA	
"as"	TokenNameStringLiteral	as
,	TokenNameCOMMA	
"at"	TokenNameStringLiteral	at
,	TokenNameCOMMA	
"be"	TokenNameStringLiteral	be
,	TokenNameCOMMA	
"but"	TokenNameStringLiteral	but
,	TokenNameCOMMA	
"by"	TokenNameStringLiteral	by
,	TokenNameCOMMA	
"for"	TokenNameStringLiteral	for
,	TokenNameCOMMA	
"if"	TokenNameStringLiteral	if
,	TokenNameCOMMA	
"in"	TokenNameStringLiteral	in
,	TokenNameCOMMA	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"it"	TokenNameStringLiteral	it
,	TokenNameCOMMA	
"no"	TokenNameStringLiteral	no
,	TokenNameCOMMA	
"not"	TokenNameStringLiteral	not
,	TokenNameCOMMA	
"of"	TokenNameStringLiteral	of
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
,	TokenNameCOMMA	
"or"	TokenNameStringLiteral	or
,	TokenNameCOMMA	
"such"	TokenNameStringLiteral	such
,	TokenNameCOMMA	
"that"	TokenNameStringLiteral	that
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"their"	TokenNameStringLiteral	their
,	TokenNameCOMMA	
"then"	TokenNameStringLiteral	then
,	TokenNameCOMMA	
"there"	TokenNameStringLiteral	there
,	TokenNameCOMMA	
"these"	TokenNameStringLiteral	these
,	TokenNameCOMMA	
"they"	TokenNameStringLiteral	they
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"to"	TokenNameStringLiteral	to
,	TokenNameCOMMA	
"was"	TokenNameStringLiteral	was
,	TokenNameCOMMA	
"will"	TokenNameStringLiteral	will
,	TokenNameCOMMA	
"with"	TokenNameStringLiteral	with
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopTable	TokenNameIdentifier	 stop Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ChineseFilter	TokenNameIdentifier	 Chinese Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopTable	TokenNameIdentifier	 stop Table
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
STOP_WORDS	TokenNameIdentifier	 STOP  WORDS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
termLength	TokenNameIdentifier	 term Length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// why not key off token type here assuming ChineseTokenizer comes first? 	TokenNameCOMMENT_LINE	why not key off token type here assuming ChineseTokenizer comes first? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stopTable	TokenNameIdentifier	 stop Table
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termLength	TokenNameIdentifier	 term Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LOWERCASE_LETTER	TokenNameIdentifier	 LOWERCASE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UPPERCASE_LETTER	TokenNameIdentifier	 UPPERCASE  LETTER
:	TokenNameCOLON	
// English word/token should larger than 1 character. 	TokenNameCOMMENT_LINE	English word/token should larger than 1 character. 
if	TokenNameif	
(	TokenNameLPAREN	
termLength	TokenNameIdentifier	 term Length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_LETTER	TokenNameIdentifier	 OTHER  LETTER
:	TokenNameCOLON	
// One Chinese character as one Chinese word. 	TokenNameCOMMENT_LINE	One Chinese character as one Chinese word. 
// Chinese word extraction to be added later here. 	TokenNameCOMMENT_LINE	Chinese word extraction to be added later here. 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
