/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
wikipedia	TokenNameIdentifier	 wikipedia
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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
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
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
AttributeSource	TokenNameIdentifier	 Attribute Source
;	TokenNameSEMICOLON	
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Extension of StandardTokenizer that is aware of Wikipedia syntax. It is based off of the * Wikipedia tutorial available at http://en.wikipedia.org/wiki/Wikipedia:Tutorial, but it may not be complete. * <p/> * <p/> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Extension of StandardTokenizer that is aware of Wikipedia syntax. It is based off of the Wikipedia tutorial available at http://en.wikipedia.org/wiki/Wikipedia:Tutorial, but it may not be complete. <p/> <p/> @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
=	TokenNameEQUAL	
"il"	TokenNameStringLiteral	il
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
=	TokenNameEQUAL	
"el"	TokenNameStringLiteral	el
;	TokenNameSEMICOLON	
//The URL part of the link, i.e. the first token 	TokenNameCOMMENT_LINE	The URL part of the link, i.e. the first token 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
=	TokenNameEQUAL	
"elu"	TokenNameStringLiteral	elu
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CITATION	TokenNameIdentifier	 CITATION
=	TokenNameEQUAL	
"ci"	TokenNameStringLiteral	ci
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CATEGORY	TokenNameIdentifier	 CATEGORY
=	TokenNameEQUAL	
"c"	TokenNameStringLiteral	c
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOLD	TokenNameIdentifier	 BOLD
=	TokenNameEQUAL	
"b"	TokenNameStringLiteral	b
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ITALICS	TokenNameIdentifier	 ITALICS
=	TokenNameEQUAL	
"i"	TokenNameStringLiteral	i
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOLD_ITALICS	TokenNameIdentifier	 BOLD  ITALICS
=	TokenNameEQUAL	
"bi"	TokenNameStringLiteral	bi
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADING	TokenNameIdentifier	 HEADING
=	TokenNameEQUAL	
"h"	TokenNameStringLiteral	h
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUB_HEADING	TokenNameIdentifier	 SUB  HEADING
=	TokenNameEQUAL	
"sh"	TokenNameStringLiteral	sh
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALPHANUM_ID	TokenNameIdentifier	 ALPHANUM  ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
APOSTROPHE_ID	TokenNameIdentifier	 APOSTROPHE  ID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACRONYM_ID	TokenNameIdentifier	 ACRONYM  ID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPANY_ID	TokenNameIdentifier	 COMPANY  ID
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMAIL_ID	TokenNameIdentifier	 EMAIL  ID
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HOST_ID	TokenNameIdentifier	 HOST  ID
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM_ID	TokenNameIdentifier	 NUM  ID
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CJ_ID	TokenNameIdentifier	 CJ  ID
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTERNAL_LINK_ID	TokenNameIdentifier	 INTERNAL  LINK  ID
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXTERNAL_LINK_ID	TokenNameIdentifier	 EXTERNAL  LINK  ID
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CITATION_ID	TokenNameIdentifier	 CITATION  ID
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CATEGORY_ID	TokenNameIdentifier	 CATEGORY  ID
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BOLD_ID	TokenNameIdentifier	 BOLD  ID
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ITALICS_ID	TokenNameIdentifier	 ITALICS  ID
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BOLD_ITALICS_ID	TokenNameIdentifier	 BOLD  ITALICS  ID
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADING_ID	TokenNameIdentifier	 HEADING  ID
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUB_HEADING_ID	TokenNameIdentifier	 SUB  HEADING  ID
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXTERNAL_LINK_URL_ID	TokenNameIdentifier	 EXTERNAL  LINK  URL  ID
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** String token types that correspond to token type int constants */	TokenNameCOMMENT_JAVADOC	 String token types that correspond to token type int constants 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<APOSTROPHE>"	TokenNameStringLiteral	<APOSTROPHE>
,	TokenNameCOMMA	
"<ACRONYM>"	TokenNameStringLiteral	<ACRONYM>
,	TokenNameCOMMA	
"<COMPANY>"	TokenNameStringLiteral	<COMPANY>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<HOST>"	TokenNameStringLiteral	<HOST>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<CJ>"	TokenNameStringLiteral	<CJ>
,	TokenNameCOMMA	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
CITATION	TokenNameIdentifier	 CITATION
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
BOLD	TokenNameIdentifier	 BOLD
,	TokenNameCOMMA	
ITALICS	TokenNameIdentifier	 ITALICS
,	TokenNameCOMMA	
BOLD_ITALICS	TokenNameIdentifier	 BOLD  ITALICS
,	TokenNameCOMMA	
HEADING	TokenNameIdentifier	 HEADING
,	TokenNameCOMMA	
SUB_HEADING	TokenNameIdentifier	 SUB  HEADING
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Only output tokens */	TokenNameCOMMENT_JAVADOC	 Only output tokens 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Only output untokenized tokens, which are tokens that would normally be split into several tokens */	TokenNameCOMMENT_JAVADOC	 Only output untokenized tokens, which are tokens that would normally be split into several tokens 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNTOKENIZED_ONLY	TokenNameIdentifier	 UNTOKENIZED  ONLY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Output the both the untokenized token and the splits */	TokenNameCOMMENT_JAVADOC	 Output the both the untokenized token and the splits 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BOTH	TokenNameIdentifier	 BOTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This flag is used to indicate that the produced "Token" would, if {@link #TOKENS_ONLY} was used, produce multiple tokens. */	TokenNameCOMMENT_JAVADOC	 This flag is used to indicate that the produced "Token" would, if {@link #TOKENS_ONLY} was used, produce multiple tokens. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A private instance of the JFlex-constructed scanner */	TokenNameCOMMENT_JAVADOC	 A private instance of the JFlex-constructed scanner 
private	TokenNameprivate	
final	TokenNamefinal	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
scanner	TokenNameIdentifier	 scanner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokenOutput	TokenNameIdentifier	 token Output
=	TokenNameEQUAL	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
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
private	TokenNameprivate	
final	TokenNamefinal	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt	TokenNameIdentifier	 flags Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
/** * Creates a new instance of the {@link WikipediaTokenizer}. Attaches the * <code>input</code> to a newly created JFlex scanner. * * @param input The Input Reader */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the {@link WikipediaTokenizer}. Attaches the <code>input</code> to a newly created JFlex scanner. * @param input The Input Reader 
public	TokenNamepublic	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the * <code>input</code> to a the newly created JFlex scanner. * * @param input The input * @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} * @param untokenizedTypes */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the <code>input</code> to a the newly created JFlex scanner. * @param input The input @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} @param untokenizedTypes 
public	TokenNamepublic	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the * <code>input</code> to a the newly created JFlex scanner. Uses the given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @param input The input * @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} * @param untokenizedTypes */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the <code>input</code> to a the newly created JFlex scanner. Uses the given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @param input The input @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} @param untokenizedTypes 
public	TokenNamepublic	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the * <code>input</code> to a the newly created JFlex scanner. Uses the given {@link AttributeSource}. * * @param input The input * @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} * @param untokenizedTypes */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the {@link org.apache.lucene.analysis.wikipedia.WikipediaTokenizer}. Attaches the <code>input</code> to a the newly created JFlex scanner. Uses the given {@link AttributeSource}. * @param input The input @param tokenOutput One of {@link #TOKENS_ONLY}, {@link #UNTOKENIZED_ONLY}, {@link #BOTH} @param untokenizedTypes 
public	TokenNamepublic	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
tokenOutput	TokenNameIdentifier	 token Output
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: cutover to enum 	TokenNameCOMMENT_LINE	TODO: cutover to enum 
if	TokenNameif	
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
!=	TokenNameNOT_EQUAL	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
&&	TokenNameAND_AND	
tokenOutput	TokenNameIdentifier	 token Output
!=	TokenNameNOT_EQUAL	
UNTOKENIZED_ONLY	TokenNameIdentifier	 UNTOKENIZED  ONLY
&&	TokenNameAND_AND	
tokenOutput	TokenNameIdentifier	 token Output
!=	TokenNameNOT_EQUAL	
BOTH	TokenNameIdentifier	 BOTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"tokenOutput must be TOKENS_ONLY, UNTOKENIZED_ONLY or BOTH"	TokenNameStringLiteral	tokenOutput must be TOKENS_ONLY, UNTOKENIZED_ONLY or BOTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokenOutput	TokenNameIdentifier	 token Output
=	TokenNameEQUAL	
tokenOutput	TokenNameIdentifier	 token Output
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
=	TokenNameEQUAL	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.analysis.TokenStream#next() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.analysis.TokenStream#next() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
==	TokenNameEQUAL_EQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
tokenType	TokenNameIdentifier	 token Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
==	TokenNameEQUAL_EQUAL	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
||	TokenNameOR_OR	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setupToken	TokenNameIdentifier	 setup Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
==	TokenNameEQUAL_EQUAL	
UNTOKENIZED_ONLY	TokenNameIdentifier	 UNTOKENIZED  ONLY
&&	TokenNameAND_AND	
untokenizedTypes	TokenNameIdentifier	 untokenized Types
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapseTokens	TokenNameIdentifier	 collapse Tokens
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenOutput	TokenNameIdentifier	 token Output
==	TokenNameEQUAL_EQUAL	
BOTH	TokenNameIdentifier	 BOTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//collapse into a single token, add it to tokens AND output the individual tokens 	TokenNameCOMMENT_LINE	collapse into a single token, add it to tokens AND output the individual tokens 
//output the untokenized Token first 	TokenNameCOMMENT_LINE	output the untokenized Token first 
collapseAndSaveTokens	TokenNameIdentifier	 collapse And Save Tokens
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
posinc	TokenNameIdentifier	 posinc
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
posinc	TokenNameIdentifier	 posinc
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posinc	TokenNameIdentifier	 posinc
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// don't emit posinc=0 for the first token! 	TokenNameCOMMENT_LINE	don't emit posinc=0 for the first token! 
}	TokenNameRBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
posinc	TokenNameIdentifier	 posinc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
collapseAndSaveTokens	TokenNameIdentifier	 collapse And Save Tokens
(	TokenNameLPAREN	
int	TokenNameint	
tokenType	TokenNameIdentifier	 token Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//collapse 	TokenNameCOMMENT_LINE	collapse 
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numAdded	TokenNameIdentifier	 num Added
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//TODO: how to know how much whitespace to add 	TokenNameCOMMENT_LINE	TODO: how to know how much whitespace to add 
int	TokenNameint	
theStart	TokenNameIdentifier	 the Start
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
theStart	TokenNameIdentifier	 the Start
+	TokenNamePLUS	
numAdded	TokenNameIdentifier	 num Added
;	TokenNameSEMICOLON	
int	TokenNameint	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
;	TokenNameSEMICOLON	
int	TokenNameint	
numSeen	TokenNameIdentifier	 num Seen
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupSavedToken	TokenNameIdentifier	 setup Saved Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//while we can get a token and that token is the same type and we have not transitioned to a new wiki-item of the same type 	TokenNameCOMMENT_LINE	while we can get a token and that token is the same type and we have not transitioned to a new wiki-item of the same type 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
&&	TokenNameAND_AND	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
==	TokenNameEQUAL_EQUAL	
tokenType	TokenNameIdentifier	 token Type
&&	TokenNameAND_AND	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNumWikiTokensSeen	TokenNameIdentifier	 get Num Wiki Tokens Seen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
numSeen	TokenNameIdentifier	 num Seen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currPos	TokenNameIdentifier	 curr Pos
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//append whitespace 	TokenNameCOMMENT_LINE	append whitespace 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
currPos	TokenNameIdentifier	 curr Pos
-	TokenNameMINUS	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numAdded	TokenNameIdentifier	 num Added
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupSavedToken	TokenNameIdentifier	 setup Saved Token
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numSeen	TokenNameIdentifier	 num Seen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
currPos	TokenNameIdentifier	 curr Pos
+	TokenNamePLUS	
numAdded	TokenNameIdentifier	 num Added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//trim the buffer 	TokenNameCOMMENT_LINE	trim the buffer 
// TODO: this is inefficient 	TokenNameCOMMENT_LINE	TODO: this is inefficient 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
theStart	TokenNameIdentifier	 the Start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
theStart	TokenNameIdentifier	 the Start
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//The way the loop is written, we will have proceeded to the next token. We need to pushback the scanner to lastPos 	TokenNameCOMMENT_LINE	The way the loop is written, we will have proceeded to the next token. We need to pushback the scanner to lastPos 
if	TokenNameif	
(	TokenNameLPAREN	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
!=	TokenNameNOT_EQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yypushback	TokenNameIdentifier	 yypushback
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupSavedToken	TokenNameIdentifier	 setup Saved Token
(	TokenNameLPAREN	
int	TokenNameint	
positionInc	TokenNameIdentifier	 position Inc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setupToken	TokenNameIdentifier	 setup Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
positionInc	TokenNameIdentifier	 position Inc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
collapseTokens	TokenNameIdentifier	 collapse Tokens
(	TokenNameLPAREN	
int	TokenNameint	
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//collapse 	TokenNameCOMMENT_LINE	collapse 
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numAdded	TokenNameIdentifier	 num Added
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//TODO: how to know how much whitespace to add 	TokenNameCOMMENT_LINE	TODO: how to know how much whitespace to add 
int	TokenNameint	
theStart	TokenNameIdentifier	 the Start
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
theStart	TokenNameIdentifier	 the Start
+	TokenNamePLUS	
numAdded	TokenNameIdentifier	 num Added
;	TokenNameSEMICOLON	
int	TokenNameint	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
;	TokenNameSEMICOLON	
int	TokenNameint	
numSeen	TokenNameIdentifier	 num Seen
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//while we can get a token and that token is the same type and we have not transitioned to a new wiki-item of the same type 	TokenNameCOMMENT_LINE	while we can get a token and that token is the same type and we have not transitioned to a new wiki-item of the same type 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
&&	TokenNameAND_AND	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
==	TokenNameEQUAL_EQUAL	
tokenType	TokenNameIdentifier	 token Type
&&	TokenNameAND_AND	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNumWikiTokensSeen	TokenNameIdentifier	 get Num Wiki Tokens Seen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
numSeen	TokenNameIdentifier	 num Seen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currPos	TokenNameIdentifier	 curr Pos
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//append whitespace 	TokenNameCOMMENT_LINE	append whitespace 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
currPos	TokenNameIdentifier	 curr Pos
-	TokenNameMINUS	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numAdded	TokenNameIdentifier	 num Added
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numSeen	TokenNameIdentifier	 num Seen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
currPos	TokenNameIdentifier	 curr Pos
+	TokenNamePLUS	
numAdded	TokenNameIdentifier	 num Added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//trim the buffer 	TokenNameCOMMENT_LINE	trim the buffer 
// TODO: this is inefficient 	TokenNameCOMMENT_LINE	TODO: this is inefficient 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
theStart	TokenNameIdentifier	 the Start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
theStart	TokenNameIdentifier	 the Start
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//The way the loop is written, we will have proceeded to the next token. We need to pushback the scanner to lastPos 	TokenNameCOMMENT_LINE	The way the loop is written, we will have proceeded to the next token. We need to pushback the scanner to lastPos 
if	TokenNameif	
(	TokenNameLPAREN	
tmpTokType	TokenNameIdentifier	 tmp Tok Type
!=	TokenNameNOT_EQUAL	
WikipediaTokenizerImpl	TokenNameIdentifier	 Wikipedia Tokenizer Impl
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yypushback	TokenNameIdentifier	 yypushback
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupToken	TokenNameIdentifier	 setup Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.analysis.TokenStream#reset() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.analysis.TokenStream#reset() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yyreset	TokenNameIdentifier	 yyreset
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// set final offset 	TokenNameCOMMENT_LINE	set final offset 
final	TokenNamefinal	
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
