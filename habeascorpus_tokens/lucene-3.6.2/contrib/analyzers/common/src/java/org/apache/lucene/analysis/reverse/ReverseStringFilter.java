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
reverse	TokenNameIdentifier	 reverse
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Reverse token string, for example "country" => "yrtnuoc". * <p> * If <code>marker</code> is supplied, then tokens will be also prepended by * that character. For example, with a marker of &#x5C;u0001, "country" => * "&#x5C;u0001yrtnuoc". This is useful when implementing efficient leading * wildcards search. * </p> * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating ReverseStringFilter, or when using any of * its static methods: * <ul> * <li> As of 3.1, supplementary characters are handled correctly * </ul> */	TokenNameCOMMENT_JAVADOC	 Reverse token string, for example "country" => "yrtnuoc". <p> If <code>marker</code> is supplied, then tokens will be also prepended by that character. For example, with a marker of &#x5C;u0001, "country" => "&#x5C;u0001yrtnuoc". This is useful when implementing efficient leading wildcards search. </p> <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating ReverseStringFilter, or when using any of its static methods: <ul> <li> As of 3.1, supplementary characters are handled correctly </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ReverseStringFilter	TokenNameIdentifier	 Reverse String Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
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
char	TokenNamechar	
marker	TokenNameIdentifier	 marker
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
NOMARKER	TokenNameIdentifier	 NOMARKER
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Example marker character: U+0001 (START OF HEADING) */	TokenNameCOMMENT_JAVADOC	 Example marker character: U+0001 (START OF HEADING) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
START_OF_HEADING_MARKER	TokenNameIdentifier	 START  OF  HEADING  MARKER
=	TokenNameEQUAL	
''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Example marker character: U+001F (INFORMATION SEPARATOR ONE) */	TokenNameCOMMENT_JAVADOC	 Example marker character: U+001F (INFORMATION SEPARATOR ONE) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
INFORMATION_SEPARATOR_MARKER	TokenNameIdentifier	 INFORMATION  SEPARATOR  MARKER
=	TokenNameEQUAL	
''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Example marker character: U+EC00 (PRIVATE USE AREA: EC00) */	TokenNameCOMMENT_JAVADOC	 Example marker character: U+EC00 (PRIVATE USE AREA: EC00) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
PUA_EC00_MARKER	TokenNameIdentifier	 PUA  E C00  MARKER
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Example marker character: U+200F (RIGHT-TO-LEFT MARK) */	TokenNameCOMMENT_JAVADOC	 Example marker character: U+200F (RIGHT-TO-LEFT MARK) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
RTL_DIRECTION_MARKER	TokenNameIdentifier	 RTL  DIRECTION  MARKER
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Create a new ReverseStringFilter that reverses all tokens in the * supplied {@link TokenStream}. * <p> * The reversed tokens will not be marked. * </p> * * @param in {@link TokenStream} to filter * @deprecated use {@link #ReverseStringFilter(Version, TokenStream)} * instead. This constructor will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Create a new ReverseStringFilter that reverses all tokens in the supplied {@link TokenStream}. <p> The reversed tokens will not be marked. </p> * @param in {@link TokenStream} to filter @deprecated use {@link #ReverseStringFilter(Version, TokenStream)} instead. This constructor will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ReverseStringFilter	TokenNameIdentifier	 Reverse String Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
NOMARKER	TokenNameIdentifier	 NOMARKER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new ReverseStringFilter that reverses and marks all tokens in the * supplied {@link TokenStream}. * <p> * The reversed tokens will be prepended (marked) by the <code>marker</code> * character. * </p> * * @param in {@link TokenStream} to filter * @param marker A character used to mark reversed tokens * @deprecated use {@link #ReverseStringFilter(Version, TokenStream, char)} * instead. This constructor will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Create a new ReverseStringFilter that reverses and marks all tokens in the supplied {@link TokenStream}. <p> The reversed tokens will be prepended (marked) by the <code>marker</code> character. </p> * @param in {@link TokenStream} to filter @param marker A character used to mark reversed tokens @deprecated use {@link #ReverseStringFilter(Version, TokenStream, char)} instead. This constructor will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ReverseStringFilter	TokenNameIdentifier	 Reverse String Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
char	TokenNamechar	
marker	TokenNameIdentifier	 marker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
marker	TokenNameIdentifier	 marker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new ReverseStringFilter that reverses all tokens in the * supplied {@link TokenStream}. * <p> * The reversed tokens will not be marked. * </p> * * @param matchVersion See <a href="#version">above</a> * @param in {@link TokenStream} to filter */	TokenNameCOMMENT_JAVADOC	 Create a new ReverseStringFilter that reverses all tokens in the supplied {@link TokenStream}. <p> The reversed tokens will not be marked. </p> * @param matchVersion See <a href="#version">above</a> @param in {@link TokenStream} to filter 
public	TokenNamepublic	
ReverseStringFilter	TokenNameIdentifier	 Reverse String Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
NOMARKER	TokenNameIdentifier	 NOMARKER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new ReverseStringFilter that reverses and marks all tokens in the * supplied {@link TokenStream}. * <p> * The reversed tokens will be prepended (marked) by the <code>marker</code> * character. * </p> * * @param matchVersion See <a href="#version">above</a> * @param in {@link TokenStream} to filter * @param marker A character used to mark reversed tokens */	TokenNameCOMMENT_JAVADOC	 Create a new ReverseStringFilter that reverses and marks all tokens in the supplied {@link TokenStream}. <p> The reversed tokens will be prepended (marked) by the <code>marker</code> character. </p> * @param matchVersion See <a href="#version">above</a> @param in {@link TokenStream} to filter @param marker A character used to mark reversed tokens 
public	TokenNamepublic	
ReverseStringFilter	TokenNameIdentifier	 Reverse String Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
char	TokenNamechar	
marker	TokenNameIdentifier	 marker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
marker	TokenNameIdentifier	 marker
=	TokenNameEQUAL	
marker	TokenNameIdentifier	 marker
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
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
marker	TokenNameIdentifier	 marker
!=	TokenNameNOT_EQUAL	
NOMARKER	TokenNameIdentifier	 NOMARKER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
marker	TokenNameIdentifier	 marker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reverses the given input string * * @param input the string to reverse * @return the given input string in reversed order * @deprecated use {@link #reverse(Version, String)} instead. This method * will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Reverses the given input string * @param input the string to reverse @return the given input string in reversed order @deprecated use {@link #reverse(Version, String)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reverses the given input string * * @param matchVersion See <a href="#version">above</a> * @param input the string to reverse * @return the given input string in reversed order */	TokenNameCOMMENT_JAVADOC	 Reverses the given input string * @param matchVersion See <a href="#version">above</a> @param input the string to reverse @return the given input string in reversed order 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charInput	TokenNameIdentifier	 char Input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
charInput	TokenNameIdentifier	 char Input
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charInput	TokenNameIdentifier	 char Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
charInput	TokenNameIdentifier	 char Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reverses the given input buffer in-place * @param buffer the input char array to reverse * @deprecated use {@link #reverse(Version, char[])} instead. This * method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Reverses the given input buffer in-place @param buffer the input char array to reverse @deprecated use {@link #reverse(Version, char[])} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reverses the given input buffer in-place * @param matchVersion See <a href="#version">above</a> * @param buffer the input char array to reverse */	TokenNameCOMMENT_JAVADOC	 Reverses the given input buffer in-place @param matchVersion See <a href="#version">above</a> @param buffer the input char array to reverse 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partially reverses the given input buffer in-place from offset 0 * up to the given length. * @param buffer the input char array to reverse * @param len the length in the buffer up to where the * buffer should be reversed * @deprecated use {@link #reverse(Version, char[], int)} instead. This * method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Partially reverses the given input buffer in-place from offset 0 up to the given length. @param buffer the input char array to reverse @param len the length in the buffer up to where the buffer should be reversed @deprecated use {@link #reverse(Version, char[], int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partially reverses the given input buffer in-place from offset 0 * up to the given length. * @param matchVersion See <a href="#version">above</a> * @param buffer the input char array to reverse * @param len the length in the buffer up to where the * buffer should be reversed */	TokenNameCOMMENT_JAVADOC	 Partially reverses the given input buffer in-place from offset 0 up to the given length. @param matchVersion See <a href="#version">above</a> @param buffer the input char array to reverse @param len the length in the buffer up to where the buffer should be reversed 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Partially reverses the given input buffer in-place from the given offset * up to the given length. * @param buffer the input char array to reverse * @param start the offset from where to reverse the buffer * @param len the length in the buffer up to where the * buffer should be reversed * @deprecated use {@link #reverse(Version, char[], int, int)} instead. This * method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Partially reverses the given input buffer in-place from the given offset up to the given length. @param buffer the input char array to reverse @param start the offset from where to reverse the buffer @param len the length in the buffer up to where the buffer should be reversed @deprecated use {@link #reverse(Version, char[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverseUnicode3	TokenNameIdentifier	 reverse Unicode3
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Remove this when support for 3.0 indexes is no longer needed. */	TokenNameCOMMENT_JAVADOC	 @deprecated Remove this when support for 3.0 indexes is no longer needed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
reverseUnicode3	TokenNameIdentifier	 reverse Unicode3
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Partially reverses the given input buffer in-place from the given offset * up to the given length. * @param matchVersion See <a href="#version">above</a> * @param buffer the input char array to reverse * @param start the offset from where to reverse the buffer * @param len the length in the buffer up to where the * buffer should be reversed */	TokenNameCOMMENT_JAVADOC	 Partially reverses the given input buffer in-place from the given offset up to the given length. @param matchVersion See <a href="#version">above</a> @param buffer the input char array to reverse @param start the offset from where to reverse the buffer @param len the length in the buffer up to where the buffer should be reversed 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverseUnicode3	TokenNameIdentifier	 reverse Unicode3
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* modified version of Apache Harmony AbstractStringBuilder reverse0() */	TokenNameCOMMENT_BLOCK	 modified version of Apache Harmony AbstractStringBuilder reverse0() 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
frontHigh	TokenNameIdentifier	 front High
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
endLow	TokenNameIdentifier	 end Low
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
=	TokenNameEQUAL	
true	TokenNametrue	
,	TokenNameCOMMA	
allowEndSur	TokenNameIdentifier	 allow End Sur
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
--	TokenNameMINUS_MINUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
frontLow	TokenNameIdentifier	 front Low
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
endHigh	TokenNameIdentifier	 end High
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
surAtFront	TokenNameIdentifier	 sur At Front
=	TokenNameEQUAL	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isSurrogatePair	TokenNameIdentifier	 is Surrogate Pair
(	TokenNameLPAREN	
frontHigh	TokenNameIdentifier	 front High
,	TokenNameCOMMA	
frontLow	TokenNameIdentifier	 front Low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
surAtFront	TokenNameIdentifier	 sur At Front
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do since surAtFront is allowed and 1 char left 	TokenNameCOMMENT_LINE	nothing to do since surAtFront is allowed and 1 char left 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
surAtEnd	TokenNameIdentifier	 sur At End
=	TokenNameEQUAL	
allowEndSur	TokenNameIdentifier	 allow End Sur
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isSurrogatePair	TokenNameIdentifier	 is Surrogate Pair
(	TokenNameLPAREN	
endHigh	TokenNameIdentifier	 end High
,	TokenNameCOMMA	
endLow	TokenNameIdentifier	 end Low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
=	TokenNameEQUAL	
allowEndSur	TokenNameIdentifier	 allow End Sur
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
surAtFront	TokenNameIdentifier	 sur At Front
==	TokenNameEQUAL_EQUAL	
surAtEnd	TokenNameIdentifier	 sur At End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
surAtFront	TokenNameIdentifier	 sur At Front
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both surrogates 	TokenNameCOMMENT_LINE	both surrogates 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frontLow	TokenNameIdentifier	 front Low
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frontHigh	TokenNameIdentifier	 front High
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endHigh	TokenNameIdentifier	 end High
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endLow	TokenNameIdentifier	 end Low
;	TokenNameSEMICOLON	
frontHigh	TokenNameIdentifier	 front High
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
endLow	TokenNameIdentifier	 end Low
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// neither surrogates 	TokenNameCOMMENT_LINE	neither surrogates 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frontHigh	TokenNameIdentifier	 front High
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endLow	TokenNameIdentifier	 end Low
;	TokenNameSEMICOLON	
frontHigh	TokenNameIdentifier	 front High
=	TokenNameEQUAL	
frontLow	TokenNameIdentifier	 front Low
;	TokenNameSEMICOLON	
endLow	TokenNameIdentifier	 end Low
=	TokenNameEQUAL	
endHigh	TokenNameIdentifier	 end High
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
surAtFront	TokenNameIdentifier	 sur At Front
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// surrogate only at the front 	TokenNameCOMMENT_LINE	surrogate only at the front 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frontLow	TokenNameIdentifier	 front Low
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endLow	TokenNameIdentifier	 end Low
;	TokenNameSEMICOLON	
endLow	TokenNameIdentifier	 end Low
=	TokenNameEQUAL	
endHigh	TokenNameIdentifier	 end High
;	TokenNameSEMICOLON	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// surrogate only at the end 	TokenNameCOMMENT_LINE	surrogate only at the end 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frontHigh	TokenNameIdentifier	 front High
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endHigh	TokenNameIdentifier	 end High
;	TokenNameSEMICOLON	
frontHigh	TokenNameIdentifier	 front High
=	TokenNameEQUAL	
frontLow	TokenNameIdentifier	 front Low
;	TokenNameSEMICOLON	
allowEndSur	TokenNameIdentifier	 allow End Sur
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
&&	TokenNameAND_AND	
allowEndSur	TokenNameIdentifier	 allow End Sur
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only if odd length 	TokenNameCOMMENT_LINE	only if odd length 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
allowFrontSur	TokenNameIdentifier	 allow Front Sur
?	TokenNameQUESTION	
endLow	TokenNameIdentifier	 end Low
:	TokenNameCOLON	
frontHigh	TokenNameIdentifier	 front High
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
