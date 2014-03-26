package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
/** * This class converts alphabetic, numeric, and symbolic Unicode characters * which are not in the first 127 ASCII characters (the "Basic Latin" Unicode * block) into their ASCII equivalents, if one exists. * * Characters from the following Unicode blocks are converted; however, only * those characters with reasonable ASCII alternatives are converted: * * <ul> * <li>C1 Controls and Latin-1 Supplement: <a href="http://www.unicode.org/charts/PDF/U0080.pdf">http://www.unicode.org/charts/PDF/U0080.pdf</a> * <li>Latin Extended-A: <a href="http://www.unicode.org/charts/PDF/U0100.pdf">http://www.unicode.org/charts/PDF/U0100.pdf</a> * <li>Latin Extended-B: <a href="http://www.unicode.org/charts/PDF/U0180.pdf">http://www.unicode.org/charts/PDF/U0180.pdf</a> * <li>Latin Extended Additional: <a href="http://www.unicode.org/charts/PDF/U1E00.pdf">http://www.unicode.org/charts/PDF/U1E00.pdf</a> * <li>Latin Extended-C: <a href="http://www.unicode.org/charts/PDF/U2C60.pdf">http://www.unicode.org/charts/PDF/U2C60.pdf</a> * <li>Latin Extended-D: <a href="http://www.unicode.org/charts/PDF/UA720.pdf">http://www.unicode.org/charts/PDF/UA720.pdf</a> * <li>IPA Extensions: <a href="http://www.unicode.org/charts/PDF/U0250.pdf">http://www.unicode.org/charts/PDF/U0250.pdf</a> * <li>Phonetic Extensions: <a href="http://www.unicode.org/charts/PDF/U1D00.pdf">http://www.unicode.org/charts/PDF/U1D00.pdf</a> * <li>Phonetic Extensions Supplement: <a href="http://www.unicode.org/charts/PDF/U1D80.pdf">http://www.unicode.org/charts/PDF/U1D80.pdf</a> * <li>General Punctuation: <a href="http://www.unicode.org/charts/PDF/U2000.pdf">http://www.unicode.org/charts/PDF/U2000.pdf</a> * <li>Superscripts and Subscripts: <a href="http://www.unicode.org/charts/PDF/U2070.pdf">http://www.unicode.org/charts/PDF/U2070.pdf</a> * <li>Enclosed Alphanumerics: <a href="http://www.unicode.org/charts/PDF/U2460.pdf">http://www.unicode.org/charts/PDF/U2460.pdf</a> * <li>Dingbats: <a href="http://www.unicode.org/charts/PDF/U2700.pdf">http://www.unicode.org/charts/PDF/U2700.pdf</a> * <li>Supplemental Punctuation: <a href="http://www.unicode.org/charts/PDF/U2E00.pdf">http://www.unicode.org/charts/PDF/U2E00.pdf</a> * <li>Alphabetic Presentation Forms: <a href="http://www.unicode.org/charts/PDF/UFB00.pdf">http://www.unicode.org/charts/PDF/UFB00.pdf</a> * <li>Halfwidth and Fullwidth Forms: <a href="http://www.unicode.org/charts/PDF/UFF00.pdf">http://www.unicode.org/charts/PDF/UFF00.pdf</a> * </ul> * * See: <a href="http://en.wikipedia.org/wiki/Latin_characters_in_Unicode">http://en.wikipedia.org/wiki/Latin_characters_in_Unicode</a> * * The set of character conversions supported by this class is a superset of * those supported by Lucene's {@link ISOLatin1AccentFilter} which strips * accents from Latin1 characters. For example, '&agrave;' will be replaced by * 'a'. */	TokenNameCOMMENT_JAVADOC	 This class converts alphabetic, numeric, and symbolic Unicode characters which are not in the first 127 ASCII characters (the "Basic Latin" Unicode block) into their ASCII equivalents, if one exists. * Characters from the following Unicode blocks are converted; however, only those characters with reasonable ASCII alternatives are converted: * <ul> <li>C1 Controls and Latin-1 Supplement: <a href="http://www.unicode.org/charts/PDF/U0080.pdf">http://www.unicode.org/charts/PDF/U0080.pdf</a> <li>Latin Extended-A: <a href="http://www.unicode.org/charts/PDF/U0100.pdf">http://www.unicode.org/charts/PDF/U0100.pdf</a> <li>Latin Extended-B: <a href="http://www.unicode.org/charts/PDF/U0180.pdf">http://www.unicode.org/charts/PDF/U0180.pdf</a> <li>Latin Extended Additional: <a href="http://www.unicode.org/charts/PDF/U1E00.pdf">http://www.unicode.org/charts/PDF/U1E00.pdf</a> <li>Latin Extended-C: <a href="http://www.unicode.org/charts/PDF/U2C60.pdf">http://www.unicode.org/charts/PDF/U2C60.pdf</a> <li>Latin Extended-D: <a href="http://www.unicode.org/charts/PDF/UA720.pdf">http://www.unicode.org/charts/PDF/UA720.pdf</a> <li>IPA Extensions: <a href="http://www.unicode.org/charts/PDF/U0250.pdf">http://www.unicode.org/charts/PDF/U0250.pdf</a> <li>Phonetic Extensions: <a href="http://www.unicode.org/charts/PDF/U1D00.pdf">http://www.unicode.org/charts/PDF/U1D00.pdf</a> <li>Phonetic Extensions Supplement: <a href="http://www.unicode.org/charts/PDF/U1D80.pdf">http://www.unicode.org/charts/PDF/U1D80.pdf</a> <li>General Punctuation: <a href="http://www.unicode.org/charts/PDF/U2000.pdf">http://www.unicode.org/charts/PDF/U2000.pdf</a> <li>Superscripts and Subscripts: <a href="http://www.unicode.org/charts/PDF/U2070.pdf">http://www.unicode.org/charts/PDF/U2070.pdf</a> <li>Enclosed Alphanumerics: <a href="http://www.unicode.org/charts/PDF/U2460.pdf">http://www.unicode.org/charts/PDF/U2460.pdf</a> <li>Dingbats: <a href="http://www.unicode.org/charts/PDF/U2700.pdf">http://www.unicode.org/charts/PDF/U2700.pdf</a> <li>Supplemental Punctuation: <a href="http://www.unicode.org/charts/PDF/U2E00.pdf">http://www.unicode.org/charts/PDF/U2E00.pdf</a> <li>Alphabetic Presentation Forms: <a href="http://www.unicode.org/charts/PDF/UFB00.pdf">http://www.unicode.org/charts/PDF/UFB00.pdf</a> <li>Halfwidth and Fullwidth Forms: <a href="http://www.unicode.org/charts/PDF/UFF00.pdf">http://www.unicode.org/charts/PDF/UFF00.pdf</a> </ul> * See: <a href="http://en.wikipedia.org/wiki/Latin_characters_in_Unicode">http://en.wikipedia.org/wiki/Latin_characters_in_Unicode</a> * The set of character conversions supported by this class is a superset of those supported by Lucene's {@link ISOLatin1AccentFilter} which strips accents from Latin1 characters. For example, '&agrave;' will be replaced by 'a'. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
512	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
outputPos	TokenNameIdentifier	 output Pos
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
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no characters actually require rewriting then we 	TokenNameCOMMENT_LINE	If no characters actually require rewriting then we 
// just return token as-is: 	TokenNameCOMMENT_LINE	just return token as-is: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foldToASCII	TokenNameIdentifier	 fold To ASCII
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
/** * Converts characters above ASCII to their ASCII equivalents. For example, * accents are removed from accented characters. * @param input The string to fold * @param length The number of characters in the input string */	TokenNameCOMMENT_JAVADOC	 Converts characters above ASCII to their ASCII equivalents. For example, accents are removed from accented characters. @param input The string to fold @param length The number of characters in the input string 
public	TokenNamepublic	
void	TokenNamevoid	
foldToASCII	TokenNameIdentifier	 fold To ASCII
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Worst-case length required: 	TokenNameCOMMENT_LINE	Worst-case length required: 
final	TokenNamefinal	
int	TokenNameint	
maxSizeNeeded	TokenNameIdentifier	 max Size Needed
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
maxSizeNeeded	TokenNameIdentifier	 max Size Needed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
maxSizeNeeded	TokenNameIdentifier	 max Size Needed
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputPos	TokenNameIdentifier	 output Pos
=	TokenNameEQUAL	
foldToASCII	TokenNameIdentifier	 fold To ASCII
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts characters above ASCII to their ASCII equivalents. For example, * accents are removed from accented characters. * @param input The characters to fold * @param inputPos Index of the first character to fold * @param output The result of the folding. Should be of size >= {@code length * 4}. * @param outputPos Index of output where to put the result of the folding * @param length The number of characters to fold * @return length of output * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Converts characters above ASCII to their ASCII equivalents. For example, accents are removed from accented characters. @param input The characters to fold @param inputPos Index of the first character to fold @param output The result of the folding. Should be of size >= {@code length 4}. @param outputPos Index of output where to put the result of the folding @param length The number of characters to fold @return length of output @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
foldToASCII	TokenNameIdentifier	 fold To ASCII
(	TokenNameLPAREN	
char	TokenNamechar	
input	TokenNameIdentifier	 input
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
inputPos	TokenNameIdentifier	 input Pos
,	TokenNameCOMMA	
char	TokenNamechar	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
outputPos	TokenNameIdentifier	 output Pos
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
inputPos	TokenNameIdentifier	 input Pos
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
inputPos	TokenNameIdentifier	 input Pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Quick test: if it's not in range then just keep current character 	TokenNameCOMMENT_LINE	Quick test: if it's not in range then just keep current character 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// À [LATIN CAPITAL LETTER A WITH GRAVE] 	TokenNameCOMMENT_LINE	À [LATIN CAPITAL LETTER A WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Á [LATIN CAPITAL LETTER A WITH ACUTE] 	TokenNameCOMMENT_LINE	Á [LATIN CAPITAL LETTER A WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Â [LATIN CAPITAL LETTER A WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Â [LATIN CAPITAL LETTER A WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ã [LATIN CAPITAL LETTER A WITH TILDE] 	TokenNameCOMMENT_LINE	Ã [LATIN CAPITAL LETTER A WITH TILDE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ä [LATIN CAPITAL LETTER A WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ä [LATIN CAPITAL LETTER A WITH DIAERESIS] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Å [LATIN CAPITAL LETTER A WITH RING ABOVE] 	TokenNameCOMMENT_LINE	Å [LATIN CAPITAL LETTER A WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ā [LATIN CAPITAL LETTER A WITH MACRON] 	TokenNameCOMMENT_LINE	Ā [LATIN CAPITAL LETTER A WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ă [LATIN CAPITAL LETTER A WITH BREVE] 	TokenNameCOMMENT_LINE	Ă [LATIN CAPITAL LETTER A WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ą [LATIN CAPITAL LETTER A WITH OGONEK] 	TokenNameCOMMENT_LINE	Ą [LATIN CAPITAL LETTER A WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ə http://en.wikipedia.org/wiki/Schwa [LATIN CAPITAL LETTER SCHWA] 	TokenNameCOMMENT_LINE	Ə http://en.wikipedia.org/wiki/Schwa [LATIN CAPITAL LETTER SCHWA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǎ [LATIN CAPITAL LETTER A WITH CARON] 	TokenNameCOMMENT_LINE	Ǎ [LATIN CAPITAL LETTER A WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǟ [LATIN CAPITAL LETTER A WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	Ǟ [LATIN CAPITAL LETTER A WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǡ [LATIN CAPITAL LETTER A WITH DOT ABOVE AND MACRON] 	TokenNameCOMMENT_LINE	Ǡ [LATIN CAPITAL LETTER A WITH DOT ABOVE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǻ [LATIN CAPITAL LETTER A WITH RING ABOVE AND ACUTE] 	TokenNameCOMMENT_LINE	Ǻ [LATIN CAPITAL LETTER A WITH RING ABOVE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȁ [LATIN CAPITAL LETTER A WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȁ [LATIN CAPITAL LETTER A WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȃ [LATIN CAPITAL LETTER A WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȃ [LATIN CAPITAL LETTER A WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȧ [LATIN CAPITAL LETTER A WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ȧ [LATIN CAPITAL LETTER A WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱥ [LATIN CAPITAL LETTER A WITH STROKE] 	TokenNameCOMMENT_LINE	Ⱥ [LATIN CAPITAL LETTER A WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴀ [LATIN LETTER SMALL CAPITAL A] 	TokenNameCOMMENT_LINE	ᴀ [LATIN LETTER SMALL CAPITAL A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḁ [LATIN CAPITAL LETTER A WITH RING BELOW] 	TokenNameCOMMENT_LINE	Ḁ [LATIN CAPITAL LETTER A WITH RING BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ạ [LATIN CAPITAL LETTER A WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ạ [LATIN CAPITAL LETTER A WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ả [LATIN CAPITAL LETTER A WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ả [LATIN CAPITAL LETTER A WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ấ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	Ấ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ầ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	Ầ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẩ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ẩ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẫ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	Ẫ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ậ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ậ [LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ắ [LATIN CAPITAL LETTER A WITH BREVE AND ACUTE] 	TokenNameCOMMENT_LINE	Ắ [LATIN CAPITAL LETTER A WITH BREVE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ằ [LATIN CAPITAL LETTER A WITH BREVE AND GRAVE] 	TokenNameCOMMENT_LINE	Ằ [LATIN CAPITAL LETTER A WITH BREVE AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẳ [LATIN CAPITAL LETTER A WITH BREVE AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ẳ [LATIN CAPITAL LETTER A WITH BREVE AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẵ [LATIN CAPITAL LETTER A WITH BREVE AND TILDE] 	TokenNameCOMMENT_LINE	Ẵ [LATIN CAPITAL LETTER A WITH BREVE AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ặ [LATIN CAPITAL LETTER A WITH BREVE AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ặ [LATIN CAPITAL LETTER A WITH BREVE AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓐ [CIRCLED LATIN CAPITAL LETTER A] 	TokenNameCOMMENT_LINE	Ⓐ [CIRCLED LATIN CAPITAL LETTER A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ａ [FULLWIDTH LATIN CAPITAL LETTER A] 	TokenNameCOMMENT_LINE	Ａ [FULLWIDTH LATIN CAPITAL LETTER A] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// à [LATIN SMALL LETTER A WITH GRAVE] 	TokenNameCOMMENT_LINE	à [LATIN SMALL LETTER A WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// á [LATIN SMALL LETTER A WITH ACUTE] 	TokenNameCOMMENT_LINE	á [LATIN SMALL LETTER A WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// â [LATIN SMALL LETTER A WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	â [LATIN SMALL LETTER A WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ã [LATIN SMALL LETTER A WITH TILDE] 	TokenNameCOMMENT_LINE	ã [LATIN SMALL LETTER A WITH TILDE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ä [LATIN SMALL LETTER A WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ä [LATIN SMALL LETTER A WITH DIAERESIS] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// å [LATIN SMALL LETTER A WITH RING ABOVE] 	TokenNameCOMMENT_LINE	å [LATIN SMALL LETTER A WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ā [LATIN SMALL LETTER A WITH MACRON] 	TokenNameCOMMENT_LINE	ā [LATIN SMALL LETTER A WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ă [LATIN SMALL LETTER A WITH BREVE] 	TokenNameCOMMENT_LINE	ă [LATIN SMALL LETTER A WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ą [LATIN SMALL LETTER A WITH OGONEK] 	TokenNameCOMMENT_LINE	ą [LATIN SMALL LETTER A WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǎ [LATIN SMALL LETTER A WITH CARON] 	TokenNameCOMMENT_LINE	ǎ [LATIN SMALL LETTER A WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǟ [LATIN SMALL LETTER A WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	ǟ [LATIN SMALL LETTER A WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǡ [LATIN SMALL LETTER A WITH DOT ABOVE AND MACRON] 	TokenNameCOMMENT_LINE	ǡ [LATIN SMALL LETTER A WITH DOT ABOVE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǻ [LATIN SMALL LETTER A WITH RING ABOVE AND ACUTE] 	TokenNameCOMMENT_LINE	ǻ [LATIN SMALL LETTER A WITH RING ABOVE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȁ [LATIN SMALL LETTER A WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȁ [LATIN SMALL LETTER A WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȃ [LATIN SMALL LETTER A WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȃ [LATIN SMALL LETTER A WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȧ [LATIN SMALL LETTER A WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ȧ [LATIN SMALL LETTER A WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɐ [LATIN SMALL LETTER TURNED A] 	TokenNameCOMMENT_LINE	ɐ [LATIN SMALL LETTER TURNED A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ə [LATIN SMALL LETTER SCHWA] 	TokenNameCOMMENT_LINE	ə [LATIN SMALL LETTER SCHWA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɚ [LATIN SMALL LETTER SCHWA WITH HOOK] 	TokenNameCOMMENT_LINE	ɚ [LATIN SMALL LETTER SCHWA WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶏ [LATIN SMALL LETTER A WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶏ [LATIN SMALL LETTER A WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶕ [LATIN SMALL LETTER SCHWA WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶕ [LATIN SMALL LETTER SCHWA WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ạ [LATIN SMALL LETTER A WITH RING BELOW] 	TokenNameCOMMENT_LINE	ạ [LATIN SMALL LETTER A WITH RING BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ả [LATIN SMALL LETTER A WITH RIGHT HALF RING] 	TokenNameCOMMENT_LINE	ả [LATIN SMALL LETTER A WITH RIGHT HALF RING] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ạ [LATIN SMALL LETTER A WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ạ [LATIN SMALL LETTER A WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ả [LATIN SMALL LETTER A WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ả [LATIN SMALL LETTER A WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ấ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	ấ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ầ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	ầ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẩ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ẩ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẫ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	ẫ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ậ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	ậ [LATIN SMALL LETTER A WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ắ [LATIN SMALL LETTER A WITH BREVE AND ACUTE] 	TokenNameCOMMENT_LINE	ắ [LATIN SMALL LETTER A WITH BREVE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ằ [LATIN SMALL LETTER A WITH BREVE AND GRAVE] 	TokenNameCOMMENT_LINE	ằ [LATIN SMALL LETTER A WITH BREVE AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẳ [LATIN SMALL LETTER A WITH BREVE AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ẳ [LATIN SMALL LETTER A WITH BREVE AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẵ [LATIN SMALL LETTER A WITH BREVE AND TILDE] 	TokenNameCOMMENT_LINE	ẵ [LATIN SMALL LETTER A WITH BREVE AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ặ [LATIN SMALL LETTER A WITH BREVE AND DOT BELOW] 	TokenNameCOMMENT_LINE	ặ [LATIN SMALL LETTER A WITH BREVE AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₐ [LATIN SUBSCRIPT SMALL LETTER A] 	TokenNameCOMMENT_LINE	ₐ [LATIN SUBSCRIPT SMALL LETTER A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₔ [LATIN SUBSCRIPT SMALL LETTER SCHWA] 	TokenNameCOMMENT_LINE	ₔ [LATIN SUBSCRIPT SMALL LETTER SCHWA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓐ [CIRCLED LATIN SMALL LETTER A] 	TokenNameCOMMENT_LINE	ⓐ [CIRCLED LATIN SMALL LETTER A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱥ [LATIN SMALL LETTER A WITH STROKE] 	TokenNameCOMMENT_LINE	ⱥ [LATIN SMALL LETTER A WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɐ [LATIN CAPITAL LETTER TURNED A] 	TokenNameCOMMENT_LINE	Ɐ [LATIN CAPITAL LETTER TURNED A] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ａ [FULLWIDTH LATIN SMALL LETTER A] 	TokenNameCOMMENT_LINE	ａ [FULLWIDTH LATIN SMALL LETTER A] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜳ [LATIN CAPITAL LETTER AA] 	TokenNameCOMMENT_LINE	Ꜳ [LATIN CAPITAL LETTER AA] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Æ [LATIN CAPITAL LETTER AE] 	TokenNameCOMMENT_LINE	Æ [LATIN CAPITAL LETTER AE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǣ [LATIN CAPITAL LETTER AE WITH MACRON] 	TokenNameCOMMENT_LINE	Ǣ [LATIN CAPITAL LETTER AE WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǽ [LATIN CAPITAL LETTER AE WITH ACUTE] 	TokenNameCOMMENT_LINE	Ǽ [LATIN CAPITAL LETTER AE WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴁ [LATIN LETTER SMALL CAPITAL AE] 	TokenNameCOMMENT_LINE	ᴁ [LATIN LETTER SMALL CAPITAL AE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜵ [LATIN CAPITAL LETTER AO] 	TokenNameCOMMENT_LINE	Ꜵ [LATIN CAPITAL LETTER AO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜷ [LATIN CAPITAL LETTER AU] 	TokenNameCOMMENT_LINE	Ꜷ [LATIN CAPITAL LETTER AU] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'U'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜹ [LATIN CAPITAL LETTER AV] 	TokenNameCOMMENT_LINE	Ꜹ [LATIN CAPITAL LETTER AV] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜻ [LATIN CAPITAL LETTER AV WITH HORIZONTAL BAR] 	TokenNameCOMMENT_LINE	Ꜻ [LATIN CAPITAL LETTER AV WITH HORIZONTAL BAR] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'V'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜽ [LATIN CAPITAL LETTER AY] 	TokenNameCOMMENT_LINE	Ꜽ [LATIN CAPITAL LETTER AY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒜ [PARENTHESIZED LATIN SMALL LETTER A] 	TokenNameCOMMENT_LINE	⒜ [PARENTHESIZED LATIN SMALL LETTER A] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜳ [LATIN SMALL LETTER AA] 	TokenNameCOMMENT_LINE	ꜳ [LATIN SMALL LETTER AA] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// æ [LATIN SMALL LETTER AE] 	TokenNameCOMMENT_LINE	æ [LATIN SMALL LETTER AE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǣ [LATIN SMALL LETTER AE WITH MACRON] 	TokenNameCOMMENT_LINE	ǣ [LATIN SMALL LETTER AE WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǽ [LATIN SMALL LETTER AE WITH ACUTE] 	TokenNameCOMMENT_LINE	ǽ [LATIN SMALL LETTER AE WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴂ [LATIN SMALL LETTER TURNED AE] 	TokenNameCOMMENT_LINE	ᴂ [LATIN SMALL LETTER TURNED AE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜵ [LATIN SMALL LETTER AO] 	TokenNameCOMMENT_LINE	ꜵ [LATIN SMALL LETTER AO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜷ [LATIN SMALL LETTER AU] 	TokenNameCOMMENT_LINE	ꜷ [LATIN SMALL LETTER AU] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜹ [LATIN SMALL LETTER AV] 	TokenNameCOMMENT_LINE	ꜹ [LATIN SMALL LETTER AV] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜻ [LATIN SMALL LETTER AV WITH HORIZONTAL BAR] 	TokenNameCOMMENT_LINE	ꜻ [LATIN SMALL LETTER AV WITH HORIZONTAL BAR] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜽ [LATIN SMALL LETTER AY] 	TokenNameCOMMENT_LINE	ꜽ [LATIN SMALL LETTER AY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɓ [LATIN CAPITAL LETTER B WITH HOOK] 	TokenNameCOMMENT_LINE	Ɓ [LATIN CAPITAL LETTER B WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƃ [LATIN CAPITAL LETTER B WITH TOPBAR] 	TokenNameCOMMENT_LINE	Ƃ [LATIN CAPITAL LETTER B WITH TOPBAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƀ [LATIN CAPITAL LETTER B WITH STROKE] 	TokenNameCOMMENT_LINE	Ƀ [LATIN CAPITAL LETTER B WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʙ [LATIN LETTER SMALL CAPITAL B] 	TokenNameCOMMENT_LINE	ʙ [LATIN LETTER SMALL CAPITAL B] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴃ [LATIN LETTER SMALL CAPITAL BARRED B] 	TokenNameCOMMENT_LINE	ᴃ [LATIN LETTER SMALL CAPITAL BARRED B] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḃ [LATIN CAPITAL LETTER B WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ḃ [LATIN CAPITAL LETTER B WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḅ [LATIN CAPITAL LETTER B WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ḅ [LATIN CAPITAL LETTER B WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḇ [LATIN CAPITAL LETTER B WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ḇ [LATIN CAPITAL LETTER B WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓑ [CIRCLED LATIN CAPITAL LETTER B] 	TokenNameCOMMENT_LINE	Ⓑ [CIRCLED LATIN CAPITAL LETTER B] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｂ [FULLWIDTH LATIN CAPITAL LETTER B] 	TokenNameCOMMENT_LINE	Ｂ [FULLWIDTH LATIN CAPITAL LETTER B] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'B'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƀ [LATIN SMALL LETTER B WITH STROKE] 	TokenNameCOMMENT_LINE	ƀ [LATIN SMALL LETTER B WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƃ [LATIN SMALL LETTER B WITH TOPBAR] 	TokenNameCOMMENT_LINE	ƃ [LATIN SMALL LETTER B WITH TOPBAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɓ [LATIN SMALL LETTER B WITH HOOK] 	TokenNameCOMMENT_LINE	ɓ [LATIN SMALL LETTER B WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵬ [LATIN SMALL LETTER B WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵬ [LATIN SMALL LETTER B WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶀ [LATIN SMALL LETTER B WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶀ [LATIN SMALL LETTER B WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḃ [LATIN SMALL LETTER B WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ḃ [LATIN SMALL LETTER B WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḅ [LATIN SMALL LETTER B WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ḅ [LATIN SMALL LETTER B WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḇ [LATIN SMALL LETTER B WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ḇ [LATIN SMALL LETTER B WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓑ [CIRCLED LATIN SMALL LETTER B] 	TokenNameCOMMENT_LINE	ⓑ [CIRCLED LATIN SMALL LETTER B] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｂ [FULLWIDTH LATIN SMALL LETTER B] 	TokenNameCOMMENT_LINE	ｂ [FULLWIDTH LATIN SMALL LETTER B] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'b'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒝ [PARENTHESIZED LATIN SMALL LETTER B] 	TokenNameCOMMENT_LINE	⒝ [PARENTHESIZED LATIN SMALL LETTER B] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'b'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ç [LATIN CAPITAL LETTER C WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ç [LATIN CAPITAL LETTER C WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ć [LATIN CAPITAL LETTER C WITH ACUTE] 	TokenNameCOMMENT_LINE	Ć [LATIN CAPITAL LETTER C WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĉ [LATIN CAPITAL LETTER C WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ĉ [LATIN CAPITAL LETTER C WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ċ [LATIN CAPITAL LETTER C WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ċ [LATIN CAPITAL LETTER C WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Č [LATIN CAPITAL LETTER C WITH CARON] 	TokenNameCOMMENT_LINE	Č [LATIN CAPITAL LETTER C WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƈ [LATIN CAPITAL LETTER C WITH HOOK] 	TokenNameCOMMENT_LINE	Ƈ [LATIN CAPITAL LETTER C WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȼ [LATIN CAPITAL LETTER C WITH STROKE] 	TokenNameCOMMENT_LINE	Ȼ [LATIN CAPITAL LETTER C WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʗ [LATIN LETTER STRETCHED C] 	TokenNameCOMMENT_LINE	ʗ [LATIN LETTER STRETCHED C] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴄ [LATIN LETTER SMALL CAPITAL C] 	TokenNameCOMMENT_LINE	ᴄ [LATIN LETTER SMALL CAPITAL C] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḉ [LATIN CAPITAL LETTER C WITH CEDILLA AND ACUTE] 	TokenNameCOMMENT_LINE	Ḉ [LATIN CAPITAL LETTER C WITH CEDILLA AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓒ [CIRCLED LATIN CAPITAL LETTER C] 	TokenNameCOMMENT_LINE	Ⓒ [CIRCLED LATIN CAPITAL LETTER C] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｃ [FULLWIDTH LATIN CAPITAL LETTER C] 	TokenNameCOMMENT_LINE	Ｃ [FULLWIDTH LATIN CAPITAL LETTER C] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ç [LATIN SMALL LETTER C WITH CEDILLA] 	TokenNameCOMMENT_LINE	ç [LATIN SMALL LETTER C WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ć [LATIN SMALL LETTER C WITH ACUTE] 	TokenNameCOMMENT_LINE	ć [LATIN SMALL LETTER C WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĉ [LATIN SMALL LETTER C WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ĉ [LATIN SMALL LETTER C WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ċ [LATIN SMALL LETTER C WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ċ [LATIN SMALL LETTER C WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// č [LATIN SMALL LETTER C WITH CARON] 	TokenNameCOMMENT_LINE	č [LATIN SMALL LETTER C WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƈ [LATIN SMALL LETTER C WITH HOOK] 	TokenNameCOMMENT_LINE	ƈ [LATIN SMALL LETTER C WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȼ [LATIN SMALL LETTER C WITH STROKE] 	TokenNameCOMMENT_LINE	ȼ [LATIN SMALL LETTER C WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɕ [LATIN SMALL LETTER C WITH CURL] 	TokenNameCOMMENT_LINE	ɕ [LATIN SMALL LETTER C WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḉ [LATIN SMALL LETTER C WITH CEDILLA AND ACUTE] 	TokenNameCOMMENT_LINE	ḉ [LATIN SMALL LETTER C WITH CEDILLA AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ↄ [LATIN SMALL LETTER REVERSED C] 	TokenNameCOMMENT_LINE	ↄ [LATIN SMALL LETTER REVERSED C] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓒ [CIRCLED LATIN SMALL LETTER C] 	TokenNameCOMMENT_LINE	ⓒ [CIRCLED LATIN SMALL LETTER C] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜿ [LATIN CAPITAL LETTER REVERSED C WITH DOT] 	TokenNameCOMMENT_LINE	Ꜿ [LATIN CAPITAL LETTER REVERSED C WITH DOT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜿ [LATIN SMALL LETTER REVERSED C WITH DOT] 	TokenNameCOMMENT_LINE	ꜿ [LATIN SMALL LETTER REVERSED C WITH DOT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｃ [FULLWIDTH LATIN SMALL LETTER C] 	TokenNameCOMMENT_LINE	ｃ [FULLWIDTH LATIN SMALL LETTER C] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒞ [PARENTHESIZED LATIN SMALL LETTER C] 	TokenNameCOMMENT_LINE	⒞ [PARENTHESIZED LATIN SMALL LETTER C] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ð [LATIN CAPITAL LETTER ETH] 	TokenNameCOMMENT_LINE	Ð [LATIN CAPITAL LETTER ETH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ď [LATIN CAPITAL LETTER D WITH CARON] 	TokenNameCOMMENT_LINE	Ď [LATIN CAPITAL LETTER D WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Đ [LATIN CAPITAL LETTER D WITH STROKE] 	TokenNameCOMMENT_LINE	Đ [LATIN CAPITAL LETTER D WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɖ [LATIN CAPITAL LETTER AFRICAN D] 	TokenNameCOMMENT_LINE	Ɖ [LATIN CAPITAL LETTER AFRICAN D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɗ [LATIN CAPITAL LETTER D WITH HOOK] 	TokenNameCOMMENT_LINE	Ɗ [LATIN CAPITAL LETTER D WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƌ [LATIN CAPITAL LETTER D WITH TOPBAR] 	TokenNameCOMMENT_LINE	Ƌ [LATIN CAPITAL LETTER D WITH TOPBAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴅ [LATIN LETTER SMALL CAPITAL D] 	TokenNameCOMMENT_LINE	ᴅ [LATIN LETTER SMALL CAPITAL D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴆ [LATIN LETTER SMALL CAPITAL ETH] 	TokenNameCOMMENT_LINE	ᴆ [LATIN LETTER SMALL CAPITAL ETH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḋ [LATIN CAPITAL LETTER D WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ḋ [LATIN CAPITAL LETTER D WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḍ [LATIN CAPITAL LETTER D WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ḍ [LATIN CAPITAL LETTER D WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḏ [LATIN CAPITAL LETTER D WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ḏ [LATIN CAPITAL LETTER D WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḑ [LATIN CAPITAL LETTER D WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ḑ [LATIN CAPITAL LETTER D WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḓ [LATIN CAPITAL LETTER D WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ḓ [LATIN CAPITAL LETTER D WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓓ [CIRCLED LATIN CAPITAL LETTER D] 	TokenNameCOMMENT_LINE	Ⓓ [CIRCLED LATIN CAPITAL LETTER D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝺ [LATIN CAPITAL LETTER INSULAR D] 	TokenNameCOMMENT_LINE	Ꝺ [LATIN CAPITAL LETTER INSULAR D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｄ [FULLWIDTH LATIN CAPITAL LETTER D] 	TokenNameCOMMENT_LINE	Ｄ [FULLWIDTH LATIN CAPITAL LETTER D] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'D'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ð [LATIN SMALL LETTER ETH] 	TokenNameCOMMENT_LINE	ð [LATIN SMALL LETTER ETH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ď [LATIN SMALL LETTER D WITH CARON] 	TokenNameCOMMENT_LINE	ď [LATIN SMALL LETTER D WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// đ [LATIN SMALL LETTER D WITH STROKE] 	TokenNameCOMMENT_LINE	đ [LATIN SMALL LETTER D WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƌ [LATIN SMALL LETTER D WITH TOPBAR] 	TokenNameCOMMENT_LINE	ƌ [LATIN SMALL LETTER D WITH TOPBAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȡ [LATIN SMALL LETTER D WITH CURL] 	TokenNameCOMMENT_LINE	ȡ [LATIN SMALL LETTER D WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɖ [LATIN SMALL LETTER D WITH TAIL] 	TokenNameCOMMENT_LINE	ɖ [LATIN SMALL LETTER D WITH TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɗ [LATIN SMALL LETTER D WITH HOOK] 	TokenNameCOMMENT_LINE	ɗ [LATIN SMALL LETTER D WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵭ [LATIN SMALL LETTER D WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵭ [LATIN SMALL LETTER D WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶁ [LATIN SMALL LETTER D WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶁ [LATIN SMALL LETTER D WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶑ [LATIN SMALL LETTER D WITH HOOK AND TAIL] 	TokenNameCOMMENT_LINE	ᶑ [LATIN SMALL LETTER D WITH HOOK AND TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḋ [LATIN SMALL LETTER D WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ḋ [LATIN SMALL LETTER D WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḍ [LATIN SMALL LETTER D WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ḍ [LATIN SMALL LETTER D WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḏ [LATIN SMALL LETTER D WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ḏ [LATIN SMALL LETTER D WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḑ [LATIN SMALL LETTER D WITH CEDILLA] 	TokenNameCOMMENT_LINE	ḑ [LATIN SMALL LETTER D WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḓ [LATIN SMALL LETTER D WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ḓ [LATIN SMALL LETTER D WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓓ [CIRCLED LATIN SMALL LETTER D] 	TokenNameCOMMENT_LINE	ⓓ [CIRCLED LATIN SMALL LETTER D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝺ [LATIN SMALL LETTER INSULAR D] 	TokenNameCOMMENT_LINE	ꝺ [LATIN SMALL LETTER INSULAR D] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｄ [FULLWIDTH LATIN SMALL LETTER D] 	TokenNameCOMMENT_LINE	ｄ [FULLWIDTH LATIN SMALL LETTER D] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'd'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǆ [LATIN CAPITAL LETTER DZ WITH CARON] 	TokenNameCOMMENT_LINE	Ǆ [LATIN CAPITAL LETTER DZ WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǳ [LATIN CAPITAL LETTER DZ] 	TokenNameCOMMENT_LINE	Ǳ [LATIN CAPITAL LETTER DZ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'D'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǅ [LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON] 	TokenNameCOMMENT_LINE	ǅ [LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǲ [LATIN CAPITAL LETTER D WITH SMALL LETTER Z] 	TokenNameCOMMENT_LINE	ǲ [LATIN CAPITAL LETTER D WITH SMALL LETTER Z] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'D'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒟ [PARENTHESIZED LATIN SMALL LETTER D] 	TokenNameCOMMENT_LINE	⒟ [PARENTHESIZED LATIN SMALL LETTER D] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'd'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȸ [LATIN SMALL LETTER DB DIGRAPH] 	TokenNameCOMMENT_LINE	ȸ [LATIN SMALL LETTER DB DIGRAPH] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'd'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'b'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǆ [LATIN SMALL LETTER DZ WITH CARON] 	TokenNameCOMMENT_LINE	ǆ [LATIN SMALL LETTER DZ WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǳ [LATIN SMALL LETTER DZ] 	TokenNameCOMMENT_LINE	ǳ [LATIN SMALL LETTER DZ] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʣ [LATIN SMALL LETTER DZ DIGRAPH] 	TokenNameCOMMENT_LINE	ʣ [LATIN SMALL LETTER DZ DIGRAPH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʥ [LATIN SMALL LETTER DZ DIGRAPH WITH CURL] 	TokenNameCOMMENT_LINE	ʥ [LATIN SMALL LETTER DZ DIGRAPH WITH CURL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'd'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// È [LATIN CAPITAL LETTER E WITH GRAVE] 	TokenNameCOMMENT_LINE	È [LATIN CAPITAL LETTER E WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// É [LATIN CAPITAL LETTER E WITH ACUTE] 	TokenNameCOMMENT_LINE	É [LATIN CAPITAL LETTER E WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ê [LATIN CAPITAL LETTER E WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ê [LATIN CAPITAL LETTER E WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ë [LATIN CAPITAL LETTER E WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ë [LATIN CAPITAL LETTER E WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ē [LATIN CAPITAL LETTER E WITH MACRON] 	TokenNameCOMMENT_LINE	Ē [LATIN CAPITAL LETTER E WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĕ [LATIN CAPITAL LETTER E WITH BREVE] 	TokenNameCOMMENT_LINE	Ĕ [LATIN CAPITAL LETTER E WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ė [LATIN CAPITAL LETTER E WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ė [LATIN CAPITAL LETTER E WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ę [LATIN CAPITAL LETTER E WITH OGONEK] 	TokenNameCOMMENT_LINE	Ę [LATIN CAPITAL LETTER E WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ě [LATIN CAPITAL LETTER E WITH CARON] 	TokenNameCOMMENT_LINE	Ě [LATIN CAPITAL LETTER E WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǝ [LATIN CAPITAL LETTER REVERSED E] 	TokenNameCOMMENT_LINE	Ǝ [LATIN CAPITAL LETTER REVERSED E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɛ [LATIN CAPITAL LETTER OPEN E] 	TokenNameCOMMENT_LINE	Ɛ [LATIN CAPITAL LETTER OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȅ [LATIN CAPITAL LETTER E WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȅ [LATIN CAPITAL LETTER E WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȇ [LATIN CAPITAL LETTER E WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȇ [LATIN CAPITAL LETTER E WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȩ [LATIN CAPITAL LETTER E WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ȩ [LATIN CAPITAL LETTER E WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɇ [LATIN CAPITAL LETTER E WITH STROKE] 	TokenNameCOMMENT_LINE	Ɇ [LATIN CAPITAL LETTER E WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴇ [LATIN LETTER SMALL CAPITAL E] 	TokenNameCOMMENT_LINE	ᴇ [LATIN LETTER SMALL CAPITAL E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḕ [LATIN CAPITAL LETTER E WITH MACRON AND GRAVE] 	TokenNameCOMMENT_LINE	Ḕ [LATIN CAPITAL LETTER E WITH MACRON AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḗ [LATIN CAPITAL LETTER E WITH MACRON AND ACUTE] 	TokenNameCOMMENT_LINE	Ḗ [LATIN CAPITAL LETTER E WITH MACRON AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḙ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ḙ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḛ [LATIN CAPITAL LETTER E WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	Ḛ [LATIN CAPITAL LETTER E WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḝ [LATIN CAPITAL LETTER E WITH CEDILLA AND BREVE] 	TokenNameCOMMENT_LINE	Ḝ [LATIN CAPITAL LETTER E WITH CEDILLA AND BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẹ [LATIN CAPITAL LETTER E WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ẹ [LATIN CAPITAL LETTER E WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẻ [LATIN CAPITAL LETTER E WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ẻ [LATIN CAPITAL LETTER E WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẽ [LATIN CAPITAL LETTER E WITH TILDE] 	TokenNameCOMMENT_LINE	Ẽ [LATIN CAPITAL LETTER E WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ế [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	Ế [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ề [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	Ề [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ể [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ể [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ễ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	Ễ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ệ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ệ [LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓔ [CIRCLED LATIN CAPITAL LETTER E] 	TokenNameCOMMENT_LINE	Ⓔ [CIRCLED LATIN CAPITAL LETTER E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱻ [LATIN LETTER SMALL CAPITAL TURNED E] 	TokenNameCOMMENT_LINE	ⱻ [LATIN LETTER SMALL CAPITAL TURNED E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｅ [FULLWIDTH LATIN CAPITAL LETTER E] 	TokenNameCOMMENT_LINE	Ｅ [FULLWIDTH LATIN CAPITAL LETTER E] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// è [LATIN SMALL LETTER E WITH GRAVE] 	TokenNameCOMMENT_LINE	è [LATIN SMALL LETTER E WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// é [LATIN SMALL LETTER E WITH ACUTE] 	TokenNameCOMMENT_LINE	é [LATIN SMALL LETTER E WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ê [LATIN SMALL LETTER E WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ê [LATIN SMALL LETTER E WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ë [LATIN SMALL LETTER E WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ë [LATIN SMALL LETTER E WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ē [LATIN SMALL LETTER E WITH MACRON] 	TokenNameCOMMENT_LINE	ē [LATIN SMALL LETTER E WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĕ [LATIN SMALL LETTER E WITH BREVE] 	TokenNameCOMMENT_LINE	ĕ [LATIN SMALL LETTER E WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ė [LATIN SMALL LETTER E WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ė [LATIN SMALL LETTER E WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ę [LATIN SMALL LETTER E WITH OGONEK] 	TokenNameCOMMENT_LINE	ę [LATIN SMALL LETTER E WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ě [LATIN SMALL LETTER E WITH CARON] 	TokenNameCOMMENT_LINE	ě [LATIN SMALL LETTER E WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǝ [LATIN SMALL LETTER TURNED E] 	TokenNameCOMMENT_LINE	ǝ [LATIN SMALL LETTER TURNED E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȅ [LATIN SMALL LETTER E WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȅ [LATIN SMALL LETTER E WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȇ [LATIN SMALL LETTER E WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȇ [LATIN SMALL LETTER E WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȩ [LATIN SMALL LETTER E WITH CEDILLA] 	TokenNameCOMMENT_LINE	ȩ [LATIN SMALL LETTER E WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɇ [LATIN SMALL LETTER E WITH STROKE] 	TokenNameCOMMENT_LINE	ɇ [LATIN SMALL LETTER E WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɘ [LATIN SMALL LETTER REVERSED E] 	TokenNameCOMMENT_LINE	ɘ [LATIN SMALL LETTER REVERSED E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɛ [LATIN SMALL LETTER OPEN E] 	TokenNameCOMMENT_LINE	ɛ [LATIN SMALL LETTER OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɜ [LATIN SMALL LETTER REVERSED OPEN E] 	TokenNameCOMMENT_LINE	ɜ [LATIN SMALL LETTER REVERSED OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɝ [LATIN SMALL LETTER REVERSED OPEN E WITH HOOK] 	TokenNameCOMMENT_LINE	ɝ [LATIN SMALL LETTER REVERSED OPEN E WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɞ [LATIN SMALL LETTER CLOSED REVERSED OPEN E] 	TokenNameCOMMENT_LINE	ɞ [LATIN SMALL LETTER CLOSED REVERSED OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʚ [LATIN SMALL LETTER CLOSED OPEN E] 	TokenNameCOMMENT_LINE	ʚ [LATIN SMALL LETTER CLOSED OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴈ [LATIN SMALL LETTER TURNED OPEN E] 	TokenNameCOMMENT_LINE	ᴈ [LATIN SMALL LETTER TURNED OPEN E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶒ [LATIN SMALL LETTER E WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶒ [LATIN SMALL LETTER E WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶓ [LATIN SMALL LETTER OPEN E WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶓ [LATIN SMALL LETTER OPEN E WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶔ [LATIN SMALL LETTER REVERSED OPEN E WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶔ [LATIN SMALL LETTER REVERSED OPEN E WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḕ [LATIN SMALL LETTER E WITH MACRON AND GRAVE] 	TokenNameCOMMENT_LINE	ḕ [LATIN SMALL LETTER E WITH MACRON AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḗ [LATIN SMALL LETTER E WITH MACRON AND ACUTE] 	TokenNameCOMMENT_LINE	ḗ [LATIN SMALL LETTER E WITH MACRON AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḙ [LATIN SMALL LETTER E WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ḙ [LATIN SMALL LETTER E WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḛ [LATIN SMALL LETTER E WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	ḛ [LATIN SMALL LETTER E WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḝ [LATIN SMALL LETTER E WITH CEDILLA AND BREVE] 	TokenNameCOMMENT_LINE	ḝ [LATIN SMALL LETTER E WITH CEDILLA AND BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẹ [LATIN SMALL LETTER E WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ẹ [LATIN SMALL LETTER E WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẻ [LATIN SMALL LETTER E WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ẻ [LATIN SMALL LETTER E WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẽ [LATIN SMALL LETTER E WITH TILDE] 	TokenNameCOMMENT_LINE	ẽ [LATIN SMALL LETTER E WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ế [LATIN SMALL LETTER E WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	ế [LATIN SMALL LETTER E WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ề [LATIN SMALL LETTER E WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	ề [LATIN SMALL LETTER E WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ể [LATIN SMALL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ể [LATIN SMALL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ễ [LATIN SMALL LETTER E WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	ễ [LATIN SMALL LETTER E WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ệ [LATIN SMALL LETTER E WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	ệ [LATIN SMALL LETTER E WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₑ [LATIN SUBSCRIPT SMALL LETTER E] 	TokenNameCOMMENT_LINE	ₑ [LATIN SUBSCRIPT SMALL LETTER E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓔ [CIRCLED LATIN SMALL LETTER E] 	TokenNameCOMMENT_LINE	ⓔ [CIRCLED LATIN SMALL LETTER E] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱸ [LATIN SMALL LETTER E WITH NOTCH] 	TokenNameCOMMENT_LINE	ⱸ [LATIN SMALL LETTER E WITH NOTCH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｅ [FULLWIDTH LATIN SMALL LETTER E] 	TokenNameCOMMENT_LINE	ｅ [FULLWIDTH LATIN SMALL LETTER E] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒠ [PARENTHESIZED LATIN SMALL LETTER E] 	TokenNameCOMMENT_LINE	⒠ [PARENTHESIZED LATIN SMALL LETTER E] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƒ [LATIN CAPITAL LETTER F WITH HOOK] 	TokenNameCOMMENT_LINE	Ƒ [LATIN CAPITAL LETTER F WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḟ [LATIN CAPITAL LETTER F WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ḟ [LATIN CAPITAL LETTER F WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓕ [CIRCLED LATIN CAPITAL LETTER F] 	TokenNameCOMMENT_LINE	Ⓕ [CIRCLED LATIN CAPITAL LETTER F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜰ [LATIN LETTER SMALL CAPITAL F] 	TokenNameCOMMENT_LINE	ꜰ [LATIN LETTER SMALL CAPITAL F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝼ [LATIN CAPITAL LETTER INSULAR F] 	TokenNameCOMMENT_LINE	Ꝼ [LATIN CAPITAL LETTER INSULAR F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꟻ [LATIN EPIGRAPHIC LETTER REVERSED F] 	TokenNameCOMMENT_LINE	ꟻ [LATIN EPIGRAPHIC LETTER REVERSED F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｆ [FULLWIDTH LATIN CAPITAL LETTER F] 	TokenNameCOMMENT_LINE	Ｆ [FULLWIDTH LATIN CAPITAL LETTER F] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'F'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƒ [LATIN SMALL LETTER F WITH HOOK] 	TokenNameCOMMENT_LINE	ƒ [LATIN SMALL LETTER F WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵮ [LATIN SMALL LETTER F WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵮ [LATIN SMALL LETTER F WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶂ [LATIN SMALL LETTER F WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶂ [LATIN SMALL LETTER F WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḟ [LATIN SMALL LETTER F WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ḟ [LATIN SMALL LETTER F WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẛ [LATIN SMALL LETTER LONG S WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ẛ [LATIN SMALL LETTER LONG S WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓕ [CIRCLED LATIN SMALL LETTER F] 	TokenNameCOMMENT_LINE	ⓕ [CIRCLED LATIN SMALL LETTER F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝼ [LATIN SMALL LETTER INSULAR F] 	TokenNameCOMMENT_LINE	ꝼ [LATIN SMALL LETTER INSULAR F] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｆ [FULLWIDTH LATIN SMALL LETTER F] 	TokenNameCOMMENT_LINE	ｆ [FULLWIDTH LATIN SMALL LETTER F] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒡ [PARENTHESIZED LATIN SMALL LETTER F] 	TokenNameCOMMENT_LINE	⒡ [PARENTHESIZED LATIN SMALL LETTER F] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬀ [LATIN SMALL LIGATURE FF] 	TokenNameCOMMENT_LINE	ﬀ [LATIN SMALL LIGATURE FF] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬃ [LATIN SMALL LIGATURE FFI] 	TokenNameCOMMENT_LINE	ﬃ [LATIN SMALL LIGATURE FFI] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬄ [LATIN SMALL LIGATURE FFL] 	TokenNameCOMMENT_LINE	ﬄ [LATIN SMALL LIGATURE FFL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬁ [LATIN SMALL LIGATURE FI] 	TokenNameCOMMENT_LINE	ﬁ [LATIN SMALL LIGATURE FI] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬂ [LATIN SMALL LIGATURE FL] 	TokenNameCOMMENT_LINE	ﬂ [LATIN SMALL LIGATURE FL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĝ [LATIN CAPITAL LETTER G WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ĝ [LATIN CAPITAL LETTER G WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ğ [LATIN CAPITAL LETTER G WITH BREVE] 	TokenNameCOMMENT_LINE	Ğ [LATIN CAPITAL LETTER G WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ġ [LATIN CAPITAL LETTER G WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ġ [LATIN CAPITAL LETTER G WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ģ [LATIN CAPITAL LETTER G WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ģ [LATIN CAPITAL LETTER G WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɠ [LATIN CAPITAL LETTER G WITH HOOK] 	TokenNameCOMMENT_LINE	Ɠ [LATIN CAPITAL LETTER G WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǥ [LATIN CAPITAL LETTER G WITH STROKE] 	TokenNameCOMMENT_LINE	Ǥ [LATIN CAPITAL LETTER G WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǥ [LATIN SMALL LETTER G WITH STROKE] 	TokenNameCOMMENT_LINE	ǥ [LATIN SMALL LETTER G WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǧ [LATIN CAPITAL LETTER G WITH CARON] 	TokenNameCOMMENT_LINE	Ǧ [LATIN CAPITAL LETTER G WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǧ [LATIN SMALL LETTER G WITH CARON] 	TokenNameCOMMENT_LINE	ǧ [LATIN SMALL LETTER G WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǵ [LATIN CAPITAL LETTER G WITH ACUTE] 	TokenNameCOMMENT_LINE	Ǵ [LATIN CAPITAL LETTER G WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɢ [LATIN LETTER SMALL CAPITAL G] 	TokenNameCOMMENT_LINE	ɢ [LATIN LETTER SMALL CAPITAL G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʛ [LATIN LETTER SMALL CAPITAL G WITH HOOK] 	TokenNameCOMMENT_LINE	ʛ [LATIN LETTER SMALL CAPITAL G WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḡ [LATIN CAPITAL LETTER G WITH MACRON] 	TokenNameCOMMENT_LINE	Ḡ [LATIN CAPITAL LETTER G WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓖ [CIRCLED LATIN CAPITAL LETTER G] 	TokenNameCOMMENT_LINE	Ⓖ [CIRCLED LATIN CAPITAL LETTER G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ᵹ [LATIN CAPITAL LETTER INSULAR G] 	TokenNameCOMMENT_LINE	Ᵹ [LATIN CAPITAL LETTER INSULAR G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝿ [LATIN CAPITAL LETTER TURNED INSULAR G] 	TokenNameCOMMENT_LINE	Ꝿ [LATIN CAPITAL LETTER TURNED INSULAR G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｇ [FULLWIDTH LATIN CAPITAL LETTER G] 	TokenNameCOMMENT_LINE	Ｇ [FULLWIDTH LATIN CAPITAL LETTER G] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'G'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĝ [LATIN SMALL LETTER G WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ĝ [LATIN SMALL LETTER G WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ğ [LATIN SMALL LETTER G WITH BREVE] 	TokenNameCOMMENT_LINE	ğ [LATIN SMALL LETTER G WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ġ [LATIN SMALL LETTER G WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ġ [LATIN SMALL LETTER G WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ģ [LATIN SMALL LETTER G WITH CEDILLA] 	TokenNameCOMMENT_LINE	ģ [LATIN SMALL LETTER G WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǵ [LATIN SMALL LETTER G WITH ACUTE] 	TokenNameCOMMENT_LINE	ǵ [LATIN SMALL LETTER G WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɠ [LATIN SMALL LETTER G WITH HOOK] 	TokenNameCOMMENT_LINE	ɠ [LATIN SMALL LETTER G WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɡ [LATIN SMALL LETTER SCRIPT G] 	TokenNameCOMMENT_LINE	ɡ [LATIN SMALL LETTER SCRIPT G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵷ [LATIN SMALL LETTER TURNED G] 	TokenNameCOMMENT_LINE	ᵷ [LATIN SMALL LETTER TURNED G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵹ [LATIN SMALL LETTER INSULAR G] 	TokenNameCOMMENT_LINE	ᵹ [LATIN SMALL LETTER INSULAR G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶃ [LATIN SMALL LETTER G WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶃ [LATIN SMALL LETTER G WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḡ [LATIN SMALL LETTER G WITH MACRON] 	TokenNameCOMMENT_LINE	ḡ [LATIN SMALL LETTER G WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓖ [CIRCLED LATIN SMALL LETTER G] 	TokenNameCOMMENT_LINE	ⓖ [CIRCLED LATIN SMALL LETTER G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝿ [LATIN SMALL LETTER TURNED INSULAR G] 	TokenNameCOMMENT_LINE	ꝿ [LATIN SMALL LETTER TURNED INSULAR G] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｇ [FULLWIDTH LATIN SMALL LETTER G] 	TokenNameCOMMENT_LINE	ｇ [FULLWIDTH LATIN SMALL LETTER G] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'g'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒢ [PARENTHESIZED LATIN SMALL LETTER G] 	TokenNameCOMMENT_LINE	⒢ [PARENTHESIZED LATIN SMALL LETTER G] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'g'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĥ [LATIN CAPITAL LETTER H WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ĥ [LATIN CAPITAL LETTER H WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ħ [LATIN CAPITAL LETTER H WITH STROKE] 	TokenNameCOMMENT_LINE	Ħ [LATIN CAPITAL LETTER H WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȟ [LATIN CAPITAL LETTER H WITH CARON] 	TokenNameCOMMENT_LINE	Ȟ [LATIN CAPITAL LETTER H WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʜ [LATIN LETTER SMALL CAPITAL H] 	TokenNameCOMMENT_LINE	ʜ [LATIN LETTER SMALL CAPITAL H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḣ [LATIN CAPITAL LETTER H WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ḣ [LATIN CAPITAL LETTER H WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḥ [LATIN CAPITAL LETTER H WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ḥ [LATIN CAPITAL LETTER H WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḧ [LATIN CAPITAL LETTER H WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ḧ [LATIN CAPITAL LETTER H WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḩ [LATIN CAPITAL LETTER H WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ḩ [LATIN CAPITAL LETTER H WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḫ [LATIN CAPITAL LETTER H WITH BREVE BELOW] 	TokenNameCOMMENT_LINE	Ḫ [LATIN CAPITAL LETTER H WITH BREVE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓗ [CIRCLED LATIN CAPITAL LETTER H] 	TokenNameCOMMENT_LINE	Ⓗ [CIRCLED LATIN CAPITAL LETTER H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱨ [LATIN CAPITAL LETTER H WITH DESCENDER] 	TokenNameCOMMENT_LINE	Ⱨ [LATIN CAPITAL LETTER H WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱶ [LATIN CAPITAL LETTER HALF H] 	TokenNameCOMMENT_LINE	Ⱶ [LATIN CAPITAL LETTER HALF H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｈ [FULLWIDTH LATIN CAPITAL LETTER H] 	TokenNameCOMMENT_LINE	Ｈ [FULLWIDTH LATIN CAPITAL LETTER H] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'H'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĥ [LATIN SMALL LETTER H WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ĥ [LATIN SMALL LETTER H WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ħ [LATIN SMALL LETTER H WITH STROKE] 	TokenNameCOMMENT_LINE	ħ [LATIN SMALL LETTER H WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȟ [LATIN SMALL LETTER H WITH CARON] 	TokenNameCOMMENT_LINE	ȟ [LATIN SMALL LETTER H WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɥ [LATIN SMALL LETTER TURNED H] 	TokenNameCOMMENT_LINE	ɥ [LATIN SMALL LETTER TURNED H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɦ [LATIN SMALL LETTER H WITH HOOK] 	TokenNameCOMMENT_LINE	ɦ [LATIN SMALL LETTER H WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʮ [LATIN SMALL LETTER TURNED H WITH FISHHOOK] 	TokenNameCOMMENT_LINE	ʮ [LATIN SMALL LETTER TURNED H WITH FISHHOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʯ [LATIN SMALL LETTER TURNED H WITH FISHHOOK AND TAIL] 	TokenNameCOMMENT_LINE	ʯ [LATIN SMALL LETTER TURNED H WITH FISHHOOK AND TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḣ [LATIN SMALL LETTER H WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ḣ [LATIN SMALL LETTER H WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḥ [LATIN SMALL LETTER H WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ḥ [LATIN SMALL LETTER H WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḧ [LATIN SMALL LETTER H WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ḧ [LATIN SMALL LETTER H WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḩ [LATIN SMALL LETTER H WITH CEDILLA] 	TokenNameCOMMENT_LINE	ḩ [LATIN SMALL LETTER H WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḫ [LATIN SMALL LETTER H WITH BREVE BELOW] 	TokenNameCOMMENT_LINE	ḫ [LATIN SMALL LETTER H WITH BREVE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẖ [LATIN SMALL LETTER H WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ẖ [LATIN SMALL LETTER H WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓗ [CIRCLED LATIN SMALL LETTER H] 	TokenNameCOMMENT_LINE	ⓗ [CIRCLED LATIN SMALL LETTER H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱨ [LATIN SMALL LETTER H WITH DESCENDER] 	TokenNameCOMMENT_LINE	ⱨ [LATIN SMALL LETTER H WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱶ [LATIN SMALL LETTER HALF H] 	TokenNameCOMMENT_LINE	ⱶ [LATIN SMALL LETTER HALF H] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｈ [FULLWIDTH LATIN SMALL LETTER H] 	TokenNameCOMMENT_LINE	ｈ [FULLWIDTH LATIN SMALL LETTER H] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƕ http://en.wikipedia.org/wiki/Hwair [LATIN CAPITAL LETTER HWAIR] 	TokenNameCOMMENT_LINE	Ƕ http://en.wikipedia.org/wiki/Hwair [LATIN CAPITAL LETTER HWAIR] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'H'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'V'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒣ [PARENTHESIZED LATIN SMALL LETTER H] 	TokenNameCOMMENT_LINE	⒣ [PARENTHESIZED LATIN SMALL LETTER H] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƕ [LATIN SMALL LETTER HV] 	TokenNameCOMMENT_LINE	ƕ [LATIN SMALL LETTER HV] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ì [LATIN CAPITAL LETTER I WITH GRAVE] 	TokenNameCOMMENT_LINE	Ì [LATIN CAPITAL LETTER I WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Í [LATIN CAPITAL LETTER I WITH ACUTE] 	TokenNameCOMMENT_LINE	Í [LATIN CAPITAL LETTER I WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Î [LATIN CAPITAL LETTER I WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Î [LATIN CAPITAL LETTER I WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ï [LATIN CAPITAL LETTER I WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ï [LATIN CAPITAL LETTER I WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĩ [LATIN CAPITAL LETTER I WITH TILDE] 	TokenNameCOMMENT_LINE	Ĩ [LATIN CAPITAL LETTER I WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ī [LATIN CAPITAL LETTER I WITH MACRON] 	TokenNameCOMMENT_LINE	Ī [LATIN CAPITAL LETTER I WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĭ [LATIN CAPITAL LETTER I WITH BREVE] 	TokenNameCOMMENT_LINE	Ĭ [LATIN CAPITAL LETTER I WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Į [LATIN CAPITAL LETTER I WITH OGONEK] 	TokenNameCOMMENT_LINE	Į [LATIN CAPITAL LETTER I WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// İ [LATIN CAPITAL LETTER I WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	İ [LATIN CAPITAL LETTER I WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɩ [LATIN CAPITAL LETTER IOTA] 	TokenNameCOMMENT_LINE	Ɩ [LATIN CAPITAL LETTER IOTA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɨ [LATIN CAPITAL LETTER I WITH STROKE] 	TokenNameCOMMENT_LINE	Ɨ [LATIN CAPITAL LETTER I WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǐ [LATIN CAPITAL LETTER I WITH CARON] 	TokenNameCOMMENT_LINE	Ǐ [LATIN CAPITAL LETTER I WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȉ [LATIN CAPITAL LETTER I WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȉ [LATIN CAPITAL LETTER I WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȋ [LATIN CAPITAL LETTER I WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȋ [LATIN CAPITAL LETTER I WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɪ [LATIN LETTER SMALL CAPITAL I] 	TokenNameCOMMENT_LINE	ɪ [LATIN LETTER SMALL CAPITAL I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵻ [LATIN SMALL CAPITAL LETTER I WITH STROKE] 	TokenNameCOMMENT_LINE	ᵻ [LATIN SMALL CAPITAL LETTER I WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḭ [LATIN CAPITAL LETTER I WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	Ḭ [LATIN CAPITAL LETTER I WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḯ [LATIN CAPITAL LETTER I WITH DIAERESIS AND ACUTE] 	TokenNameCOMMENT_LINE	Ḯ [LATIN CAPITAL LETTER I WITH DIAERESIS AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỉ [LATIN CAPITAL LETTER I WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ỉ [LATIN CAPITAL LETTER I WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ị [LATIN CAPITAL LETTER I WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ị [LATIN CAPITAL LETTER I WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓘ [CIRCLED LATIN CAPITAL LETTER I] 	TokenNameCOMMENT_LINE	Ⓘ [CIRCLED LATIN CAPITAL LETTER I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꟾ [LATIN EPIGRAPHIC LETTER I LONGA] 	TokenNameCOMMENT_LINE	ꟾ [LATIN EPIGRAPHIC LETTER I LONGA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｉ [FULLWIDTH LATIN CAPITAL LETTER I] 	TokenNameCOMMENT_LINE	Ｉ [FULLWIDTH LATIN CAPITAL LETTER I] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'I'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ì [LATIN SMALL LETTER I WITH GRAVE] 	TokenNameCOMMENT_LINE	ì [LATIN SMALL LETTER I WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// í [LATIN SMALL LETTER I WITH ACUTE] 	TokenNameCOMMENT_LINE	í [LATIN SMALL LETTER I WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// î [LATIN SMALL LETTER I WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	î [LATIN SMALL LETTER I WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ï [LATIN SMALL LETTER I WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ï [LATIN SMALL LETTER I WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĩ [LATIN SMALL LETTER I WITH TILDE] 	TokenNameCOMMENT_LINE	ĩ [LATIN SMALL LETTER I WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ī [LATIN SMALL LETTER I WITH MACRON] 	TokenNameCOMMENT_LINE	ī [LATIN SMALL LETTER I WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĭ [LATIN SMALL LETTER I WITH BREVE] 	TokenNameCOMMENT_LINE	ĭ [LATIN SMALL LETTER I WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// į [LATIN SMALL LETTER I WITH OGONEK] 	TokenNameCOMMENT_LINE	į [LATIN SMALL LETTER I WITH OGONEK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ı [LATIN SMALL LETTER DOTLESS I] 	TokenNameCOMMENT_LINE	ı [LATIN SMALL LETTER DOTLESS I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǐ [LATIN SMALL LETTER I WITH CARON] 	TokenNameCOMMENT_LINE	ǐ [LATIN SMALL LETTER I WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȉ [LATIN SMALL LETTER I WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȉ [LATIN SMALL LETTER I WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȋ [LATIN SMALL LETTER I WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȋ [LATIN SMALL LETTER I WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɨ [LATIN SMALL LETTER I WITH STROKE] 	TokenNameCOMMENT_LINE	ɨ [LATIN SMALL LETTER I WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴉ [LATIN SMALL LETTER TURNED I] 	TokenNameCOMMENT_LINE	ᴉ [LATIN SMALL LETTER TURNED I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵢ [LATIN SUBSCRIPT SMALL LETTER I] 	TokenNameCOMMENT_LINE	ᵢ [LATIN SUBSCRIPT SMALL LETTER I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵼ [LATIN SMALL LETTER IOTA WITH STROKE] 	TokenNameCOMMENT_LINE	ᵼ [LATIN SMALL LETTER IOTA WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶖ [LATIN SMALL LETTER I WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶖ [LATIN SMALL LETTER I WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḭ [LATIN SMALL LETTER I WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	ḭ [LATIN SMALL LETTER I WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḯ [LATIN SMALL LETTER I WITH DIAERESIS AND ACUTE] 	TokenNameCOMMENT_LINE	ḯ [LATIN SMALL LETTER I WITH DIAERESIS AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỉ [LATIN SMALL LETTER I WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ỉ [LATIN SMALL LETTER I WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ị [LATIN SMALL LETTER I WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ị [LATIN SMALL LETTER I WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁱ [SUPERSCRIPT LATIN SMALL LETTER I] 	TokenNameCOMMENT_LINE	ⁱ [SUPERSCRIPT LATIN SMALL LETTER I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓘ [CIRCLED LATIN SMALL LETTER I] 	TokenNameCOMMENT_LINE	ⓘ [CIRCLED LATIN SMALL LETTER I] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｉ [FULLWIDTH LATIN SMALL LETTER I] 	TokenNameCOMMENT_LINE	ｉ [FULLWIDTH LATIN SMALL LETTER I] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĳ [LATIN CAPITAL LIGATURE IJ] 	TokenNameCOMMENT_LINE	Ĳ [LATIN CAPITAL LIGATURE IJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'I'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'J'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒤ [PARENTHESIZED LATIN SMALL LETTER I] 	TokenNameCOMMENT_LINE	⒤ [PARENTHESIZED LATIN SMALL LETTER I] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĳ [LATIN SMALL LIGATURE IJ] 	TokenNameCOMMENT_LINE	ĳ [LATIN SMALL LIGATURE IJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĵ [LATIN CAPITAL LETTER J WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ĵ [LATIN CAPITAL LETTER J WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɉ [LATIN CAPITAL LETTER J WITH STROKE] 	TokenNameCOMMENT_LINE	Ɉ [LATIN CAPITAL LETTER J WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴊ [LATIN LETTER SMALL CAPITAL J] 	TokenNameCOMMENT_LINE	ᴊ [LATIN LETTER SMALL CAPITAL J] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓙ [CIRCLED LATIN CAPITAL LETTER J] 	TokenNameCOMMENT_LINE	Ⓙ [CIRCLED LATIN CAPITAL LETTER J] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｊ [FULLWIDTH LATIN CAPITAL LETTER J] 	TokenNameCOMMENT_LINE	Ｊ [FULLWIDTH LATIN CAPITAL LETTER J] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'J'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĵ [LATIN SMALL LETTER J WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ĵ [LATIN SMALL LETTER J WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǰ [LATIN SMALL LETTER J WITH CARON] 	TokenNameCOMMENT_LINE	ǰ [LATIN SMALL LETTER J WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȷ [LATIN SMALL LETTER DOTLESS J] 	TokenNameCOMMENT_LINE	ȷ [LATIN SMALL LETTER DOTLESS J] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɉ [LATIN SMALL LETTER J WITH STROKE] 	TokenNameCOMMENT_LINE	ɉ [LATIN SMALL LETTER J WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɟ [LATIN SMALL LETTER DOTLESS J WITH STROKE] 	TokenNameCOMMENT_LINE	ɟ [LATIN SMALL LETTER DOTLESS J WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʄ [LATIN SMALL LETTER DOTLESS J WITH STROKE AND HOOK] 	TokenNameCOMMENT_LINE	ʄ [LATIN SMALL LETTER DOTLESS J WITH STROKE AND HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʝ [LATIN SMALL LETTER J WITH CROSSED-TAIL] 	TokenNameCOMMENT_LINE	ʝ [LATIN SMALL LETTER J WITH CROSSED-TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓙ [CIRCLED LATIN SMALL LETTER J] 	TokenNameCOMMENT_LINE	ⓙ [CIRCLED LATIN SMALL LETTER J] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱼ [LATIN SUBSCRIPT SMALL LETTER J] 	TokenNameCOMMENT_LINE	ⱼ [LATIN SUBSCRIPT SMALL LETTER J] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｊ [FULLWIDTH LATIN SMALL LETTER J] 	TokenNameCOMMENT_LINE	ｊ [FULLWIDTH LATIN SMALL LETTER J] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒥ [PARENTHESIZED LATIN SMALL LETTER J] 	TokenNameCOMMENT_LINE	⒥ [PARENTHESIZED LATIN SMALL LETTER J] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ķ [LATIN CAPITAL LETTER K WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ķ [LATIN CAPITAL LETTER K WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƙ [LATIN CAPITAL LETTER K WITH HOOK] 	TokenNameCOMMENT_LINE	Ƙ [LATIN CAPITAL LETTER K WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǩ [LATIN CAPITAL LETTER K WITH CARON] 	TokenNameCOMMENT_LINE	Ǩ [LATIN CAPITAL LETTER K WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴋ [LATIN LETTER SMALL CAPITAL K] 	TokenNameCOMMENT_LINE	ᴋ [LATIN LETTER SMALL CAPITAL K] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḱ [LATIN CAPITAL LETTER K WITH ACUTE] 	TokenNameCOMMENT_LINE	Ḱ [LATIN CAPITAL LETTER K WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḳ [LATIN CAPITAL LETTER K WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ḳ [LATIN CAPITAL LETTER K WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḵ [LATIN CAPITAL LETTER K WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ḵ [LATIN CAPITAL LETTER K WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓚ [CIRCLED LATIN CAPITAL LETTER K] 	TokenNameCOMMENT_LINE	Ⓚ [CIRCLED LATIN CAPITAL LETTER K] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱪ [LATIN CAPITAL LETTER K WITH DESCENDER] 	TokenNameCOMMENT_LINE	Ⱪ [LATIN CAPITAL LETTER K WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝁ [LATIN CAPITAL LETTER K WITH STROKE] 	TokenNameCOMMENT_LINE	Ꝁ [LATIN CAPITAL LETTER K WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝃ [LATIN CAPITAL LETTER K WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	Ꝃ [LATIN CAPITAL LETTER K WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝅ [LATIN CAPITAL LETTER K WITH STROKE AND DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	Ꝅ [LATIN CAPITAL LETTER K WITH STROKE AND DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｋ [FULLWIDTH LATIN CAPITAL LETTER K] 	TokenNameCOMMENT_LINE	Ｋ [FULLWIDTH LATIN CAPITAL LETTER K] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'K'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ķ [LATIN SMALL LETTER K WITH CEDILLA] 	TokenNameCOMMENT_LINE	ķ [LATIN SMALL LETTER K WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƙ [LATIN SMALL LETTER K WITH HOOK] 	TokenNameCOMMENT_LINE	ƙ [LATIN SMALL LETTER K WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǩ [LATIN SMALL LETTER K WITH CARON] 	TokenNameCOMMENT_LINE	ǩ [LATIN SMALL LETTER K WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʞ [LATIN SMALL LETTER TURNED K] 	TokenNameCOMMENT_LINE	ʞ [LATIN SMALL LETTER TURNED K] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶄ [LATIN SMALL LETTER K WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶄ [LATIN SMALL LETTER K WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḱ [LATIN SMALL LETTER K WITH ACUTE] 	TokenNameCOMMENT_LINE	ḱ [LATIN SMALL LETTER K WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḳ [LATIN SMALL LETTER K WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ḳ [LATIN SMALL LETTER K WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḵ [LATIN SMALL LETTER K WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ḵ [LATIN SMALL LETTER K WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓚ [CIRCLED LATIN SMALL LETTER K] 	TokenNameCOMMENT_LINE	ⓚ [CIRCLED LATIN SMALL LETTER K] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱪ [LATIN SMALL LETTER K WITH DESCENDER] 	TokenNameCOMMENT_LINE	ⱪ [LATIN SMALL LETTER K WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝁ [LATIN SMALL LETTER K WITH STROKE] 	TokenNameCOMMENT_LINE	ꝁ [LATIN SMALL LETTER K WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝃ [LATIN SMALL LETTER K WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ꝃ [LATIN SMALL LETTER K WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝅ [LATIN SMALL LETTER K WITH STROKE AND DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ꝅ [LATIN SMALL LETTER K WITH STROKE AND DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｋ [FULLWIDTH LATIN SMALL LETTER K] 	TokenNameCOMMENT_LINE	ｋ [FULLWIDTH LATIN SMALL LETTER K] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'k'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒦ [PARENTHESIZED LATIN SMALL LETTER K] 	TokenNameCOMMENT_LINE	⒦ [PARENTHESIZED LATIN SMALL LETTER K] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'k'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĺ [LATIN CAPITAL LETTER L WITH ACUTE] 	TokenNameCOMMENT_LINE	Ĺ [LATIN CAPITAL LETTER L WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ļ [LATIN CAPITAL LETTER L WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ļ [LATIN CAPITAL LETTER L WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ľ [LATIN CAPITAL LETTER L WITH CARON] 	TokenNameCOMMENT_LINE	Ľ [LATIN CAPITAL LETTER L WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŀ [LATIN CAPITAL LETTER L WITH MIDDLE DOT] 	TokenNameCOMMENT_LINE	Ŀ [LATIN CAPITAL LETTER L WITH MIDDLE DOT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ł [LATIN CAPITAL LETTER L WITH STROKE] 	TokenNameCOMMENT_LINE	Ł [LATIN CAPITAL LETTER L WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƚ [LATIN CAPITAL LETTER L WITH BAR] 	TokenNameCOMMENT_LINE	Ƚ [LATIN CAPITAL LETTER L WITH BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʟ [LATIN LETTER SMALL CAPITAL L] 	TokenNameCOMMENT_LINE	ʟ [LATIN LETTER SMALL CAPITAL L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴌ [LATIN LETTER SMALL CAPITAL L WITH STROKE] 	TokenNameCOMMENT_LINE	ᴌ [LATIN LETTER SMALL CAPITAL L WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḷ [LATIN CAPITAL LETTER L WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ḷ [LATIN CAPITAL LETTER L WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḹ [LATIN CAPITAL LETTER L WITH DOT BELOW AND MACRON] 	TokenNameCOMMENT_LINE	Ḹ [LATIN CAPITAL LETTER L WITH DOT BELOW AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḻ [LATIN CAPITAL LETTER L WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ḻ [LATIN CAPITAL LETTER L WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḽ [LATIN CAPITAL LETTER L WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ḽ [LATIN CAPITAL LETTER L WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓛ [CIRCLED LATIN CAPITAL LETTER L] 	TokenNameCOMMENT_LINE	Ⓛ [CIRCLED LATIN CAPITAL LETTER L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱡ [LATIN CAPITAL LETTER L WITH DOUBLE BAR] 	TokenNameCOMMENT_LINE	Ⱡ [LATIN CAPITAL LETTER L WITH DOUBLE BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɫ [LATIN CAPITAL LETTER L WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	Ɫ [LATIN CAPITAL LETTER L WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝇ [LATIN CAPITAL LETTER BROKEN L] 	TokenNameCOMMENT_LINE	Ꝇ [LATIN CAPITAL LETTER BROKEN L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝉ [LATIN CAPITAL LETTER L WITH HIGH STROKE] 	TokenNameCOMMENT_LINE	Ꝉ [LATIN CAPITAL LETTER L WITH HIGH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꞁ [LATIN CAPITAL LETTER TURNED L] 	TokenNameCOMMENT_LINE	Ꞁ [LATIN CAPITAL LETTER TURNED L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｌ [FULLWIDTH LATIN CAPITAL LETTER L] 	TokenNameCOMMENT_LINE	Ｌ [FULLWIDTH LATIN CAPITAL LETTER L] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĺ [LATIN SMALL LETTER L WITH ACUTE] 	TokenNameCOMMENT_LINE	ĺ [LATIN SMALL LETTER L WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ļ [LATIN SMALL LETTER L WITH CEDILLA] 	TokenNameCOMMENT_LINE	ļ [LATIN SMALL LETTER L WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ľ [LATIN SMALL LETTER L WITH CARON] 	TokenNameCOMMENT_LINE	ľ [LATIN SMALL LETTER L WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŀ [LATIN SMALL LETTER L WITH MIDDLE DOT] 	TokenNameCOMMENT_LINE	ŀ [LATIN SMALL LETTER L WITH MIDDLE DOT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ł [LATIN SMALL LETTER L WITH STROKE] 	TokenNameCOMMENT_LINE	ł [LATIN SMALL LETTER L WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƚ [LATIN SMALL LETTER L WITH BAR] 	TokenNameCOMMENT_LINE	ƚ [LATIN SMALL LETTER L WITH BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȴ [LATIN SMALL LETTER L WITH CURL] 	TokenNameCOMMENT_LINE	ȴ [LATIN SMALL LETTER L WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɫ [LATIN SMALL LETTER L WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ɫ [LATIN SMALL LETTER L WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɬ [LATIN SMALL LETTER L WITH BELT] 	TokenNameCOMMENT_LINE	ɬ [LATIN SMALL LETTER L WITH BELT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɭ [LATIN SMALL LETTER L WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ɭ [LATIN SMALL LETTER L WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶅ [LATIN SMALL LETTER L WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶅ [LATIN SMALL LETTER L WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḷ [LATIN SMALL LETTER L WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ḷ [LATIN SMALL LETTER L WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḹ [LATIN SMALL LETTER L WITH DOT BELOW AND MACRON] 	TokenNameCOMMENT_LINE	ḹ [LATIN SMALL LETTER L WITH DOT BELOW AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḻ [LATIN SMALL LETTER L WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ḻ [LATIN SMALL LETTER L WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḽ [LATIN SMALL LETTER L WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ḽ [LATIN SMALL LETTER L WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓛ [CIRCLED LATIN SMALL LETTER L] 	TokenNameCOMMENT_LINE	ⓛ [CIRCLED LATIN SMALL LETTER L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱡ [LATIN SMALL LETTER L WITH DOUBLE BAR] 	TokenNameCOMMENT_LINE	ⱡ [LATIN SMALL LETTER L WITH DOUBLE BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝇ [LATIN SMALL LETTER BROKEN L] 	TokenNameCOMMENT_LINE	ꝇ [LATIN SMALL LETTER BROKEN L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝉ [LATIN SMALL LETTER L WITH HIGH STROKE] 	TokenNameCOMMENT_LINE	ꝉ [LATIN SMALL LETTER L WITH HIGH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꞁ [LATIN SMALL LETTER TURNED L] 	TokenNameCOMMENT_LINE	ꞁ [LATIN SMALL LETTER TURNED L] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｌ [FULLWIDTH LATIN SMALL LETTER L] 	TokenNameCOMMENT_LINE	ｌ [FULLWIDTH LATIN SMALL LETTER L] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǉ [LATIN CAPITAL LETTER LJ] 	TokenNameCOMMENT_LINE	Ǉ [LATIN CAPITAL LETTER LJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'J'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỻ [LATIN CAPITAL LETTER MIDDLE-WELSH LL] 	TokenNameCOMMENT_LINE	Ỻ [LATIN CAPITAL LETTER MIDDLE-WELSH LL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǈ [LATIN CAPITAL LETTER L WITH SMALL LETTER J] 	TokenNameCOMMENT_LINE	ǈ [LATIN CAPITAL LETTER L WITH SMALL LETTER J] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒧ [PARENTHESIZED LATIN SMALL LETTER L] 	TokenNameCOMMENT_LINE	⒧ [PARENTHESIZED LATIN SMALL LETTER L] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǉ [LATIN SMALL LETTER LJ] 	TokenNameCOMMENT_LINE	ǉ [LATIN SMALL LETTER LJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỻ [LATIN SMALL LETTER MIDDLE-WELSH LL] 	TokenNameCOMMENT_LINE	ỻ [LATIN SMALL LETTER MIDDLE-WELSH LL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʪ [LATIN SMALL LETTER LS DIGRAPH] 	TokenNameCOMMENT_LINE	ʪ [LATIN SMALL LETTER LS DIGRAPH] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʫ [LATIN SMALL LETTER LZ DIGRAPH] 	TokenNameCOMMENT_LINE	ʫ [LATIN SMALL LETTER LZ DIGRAPH] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɯ [LATIN CAPITAL LETTER TURNED M] 	TokenNameCOMMENT_LINE	Ɯ [LATIN CAPITAL LETTER TURNED M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴍ [LATIN LETTER SMALL CAPITAL M] 	TokenNameCOMMENT_LINE	ᴍ [LATIN LETTER SMALL CAPITAL M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ḿ [LATIN CAPITAL LETTER M WITH ACUTE] 	TokenNameCOMMENT_LINE	Ḿ [LATIN CAPITAL LETTER M WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṁ [LATIN CAPITAL LETTER M WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṁ [LATIN CAPITAL LETTER M WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṃ [LATIN CAPITAL LETTER M WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṃ [LATIN CAPITAL LETTER M WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓜ [CIRCLED LATIN CAPITAL LETTER M] 	TokenNameCOMMENT_LINE	Ⓜ [CIRCLED LATIN CAPITAL LETTER M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɱ [LATIN CAPITAL LETTER M WITH HOOK] 	TokenNameCOMMENT_LINE	Ɱ [LATIN CAPITAL LETTER M WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꟽ [LATIN EPIGRAPHIC LETTER INVERTED M] 	TokenNameCOMMENT_LINE	ꟽ [LATIN EPIGRAPHIC LETTER INVERTED M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꟿ [LATIN EPIGRAPHIC LETTER ARCHAIC M] 	TokenNameCOMMENT_LINE	ꟿ [LATIN EPIGRAPHIC LETTER ARCHAIC M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｍ [FULLWIDTH LATIN CAPITAL LETTER M] 	TokenNameCOMMENT_LINE	Ｍ [FULLWIDTH LATIN CAPITAL LETTER M] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'M'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɯ [LATIN SMALL LETTER TURNED M] 	TokenNameCOMMENT_LINE	ɯ [LATIN SMALL LETTER TURNED M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɰ [LATIN SMALL LETTER TURNED M WITH LONG LEG] 	TokenNameCOMMENT_LINE	ɰ [LATIN SMALL LETTER TURNED M WITH LONG LEG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɱ [LATIN SMALL LETTER M WITH HOOK] 	TokenNameCOMMENT_LINE	ɱ [LATIN SMALL LETTER M WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵯ [LATIN SMALL LETTER M WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵯ [LATIN SMALL LETTER M WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶆ [LATIN SMALL LETTER M WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶆ [LATIN SMALL LETTER M WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ḿ [LATIN SMALL LETTER M WITH ACUTE] 	TokenNameCOMMENT_LINE	ḿ [LATIN SMALL LETTER M WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṁ [LATIN SMALL LETTER M WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṁ [LATIN SMALL LETTER M WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṃ [LATIN SMALL LETTER M WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṃ [LATIN SMALL LETTER M WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓜ [CIRCLED LATIN SMALL LETTER M] 	TokenNameCOMMENT_LINE	ⓜ [CIRCLED LATIN SMALL LETTER M] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｍ [FULLWIDTH LATIN SMALL LETTER M] 	TokenNameCOMMENT_LINE	ｍ [FULLWIDTH LATIN SMALL LETTER M] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'm'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒨ [PARENTHESIZED LATIN SMALL LETTER M] 	TokenNameCOMMENT_LINE	⒨ [PARENTHESIZED LATIN SMALL LETTER M] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'm'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ñ [LATIN CAPITAL LETTER N WITH TILDE] 	TokenNameCOMMENT_LINE	Ñ [LATIN CAPITAL LETTER N WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ń [LATIN CAPITAL LETTER N WITH ACUTE] 	TokenNameCOMMENT_LINE	Ń [LATIN CAPITAL LETTER N WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ņ [LATIN CAPITAL LETTER N WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ņ [LATIN CAPITAL LETTER N WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ň [LATIN CAPITAL LETTER N WITH CARON] 	TokenNameCOMMENT_LINE	Ň [LATIN CAPITAL LETTER N WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŋ http://en.wikipedia.org/wiki/Eng_(letter) [LATIN CAPITAL LETTER ENG] 	TokenNameCOMMENT_LINE	Ŋ http://en.wikipedia.org/wiki/Eng_(letter) [LATIN CAPITAL LETTER ENG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɲ [LATIN CAPITAL LETTER N WITH LEFT HOOK] 	TokenNameCOMMENT_LINE	Ɲ [LATIN CAPITAL LETTER N WITH LEFT HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǹ [LATIN CAPITAL LETTER N WITH GRAVE] 	TokenNameCOMMENT_LINE	Ǹ [LATIN CAPITAL LETTER N WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƞ [LATIN CAPITAL LETTER N WITH LONG RIGHT LEG] 	TokenNameCOMMENT_LINE	Ƞ [LATIN CAPITAL LETTER N WITH LONG RIGHT LEG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɴ [LATIN LETTER SMALL CAPITAL N] 	TokenNameCOMMENT_LINE	ɴ [LATIN LETTER SMALL CAPITAL N] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴎ [LATIN LETTER SMALL CAPITAL REVERSED N] 	TokenNameCOMMENT_LINE	ᴎ [LATIN LETTER SMALL CAPITAL REVERSED N] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṅ [LATIN CAPITAL LETTER N WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṅ [LATIN CAPITAL LETTER N WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṇ [LATIN CAPITAL LETTER N WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṇ [LATIN CAPITAL LETTER N WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṉ [LATIN CAPITAL LETTER N WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ṉ [LATIN CAPITAL LETTER N WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṋ [LATIN CAPITAL LETTER N WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ṋ [LATIN CAPITAL LETTER N WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓝ [CIRCLED LATIN CAPITAL LETTER N] 	TokenNameCOMMENT_LINE	Ⓝ [CIRCLED LATIN CAPITAL LETTER N] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｎ [FULLWIDTH LATIN CAPITAL LETTER N] 	TokenNameCOMMENT_LINE	Ｎ [FULLWIDTH LATIN CAPITAL LETTER N] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'N'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ñ [LATIN SMALL LETTER N WITH TILDE] 	TokenNameCOMMENT_LINE	ñ [LATIN SMALL LETTER N WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ń [LATIN SMALL LETTER N WITH ACUTE] 	TokenNameCOMMENT_LINE	ń [LATIN SMALL LETTER N WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ņ [LATIN SMALL LETTER N WITH CEDILLA] 	TokenNameCOMMENT_LINE	ņ [LATIN SMALL LETTER N WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ň [LATIN SMALL LETTER N WITH CARON] 	TokenNameCOMMENT_LINE	ň [LATIN SMALL LETTER N WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŉ [LATIN SMALL LETTER N PRECEDED BY APOSTROPHE] 	TokenNameCOMMENT_LINE	ŉ [LATIN SMALL LETTER N PRECEDED BY APOSTROPHE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŋ http://en.wikipedia.org/wiki/Eng_(letter) [LATIN SMALL LETTER ENG] 	TokenNameCOMMENT_LINE	ŋ http://en.wikipedia.org/wiki/Eng_(letter) [LATIN SMALL LETTER ENG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƞ [LATIN SMALL LETTER N WITH LONG RIGHT LEG] 	TokenNameCOMMENT_LINE	ƞ [LATIN SMALL LETTER N WITH LONG RIGHT LEG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǹ [LATIN SMALL LETTER N WITH GRAVE] 	TokenNameCOMMENT_LINE	ǹ [LATIN SMALL LETTER N WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȵ [LATIN SMALL LETTER N WITH CURL] 	TokenNameCOMMENT_LINE	ȵ [LATIN SMALL LETTER N WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɲ [LATIN SMALL LETTER N WITH LEFT HOOK] 	TokenNameCOMMENT_LINE	ɲ [LATIN SMALL LETTER N WITH LEFT HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɳ [LATIN SMALL LETTER N WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ɳ [LATIN SMALL LETTER N WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵰ [LATIN SMALL LETTER N WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵰ [LATIN SMALL LETTER N WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶇ [LATIN SMALL LETTER N WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶇ [LATIN SMALL LETTER N WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṅ [LATIN SMALL LETTER N WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṅ [LATIN SMALL LETTER N WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṇ [LATIN SMALL LETTER N WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṇ [LATIN SMALL LETTER N WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṉ [LATIN SMALL LETTER N WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ṉ [LATIN SMALL LETTER N WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṋ [LATIN SMALL LETTER N WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ṋ [LATIN SMALL LETTER N WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁿ [SUPERSCRIPT LATIN SMALL LETTER N] 	TokenNameCOMMENT_LINE	ⁿ [SUPERSCRIPT LATIN SMALL LETTER N] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓝ [CIRCLED LATIN SMALL LETTER N] 	TokenNameCOMMENT_LINE	ⓝ [CIRCLED LATIN SMALL LETTER N] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｎ [FULLWIDTH LATIN SMALL LETTER N] 	TokenNameCOMMENT_LINE	ｎ [FULLWIDTH LATIN SMALL LETTER N] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǌ [LATIN CAPITAL LETTER NJ] 	TokenNameCOMMENT_LINE	Ǌ [LATIN CAPITAL LETTER NJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'N'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'J'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǋ [LATIN CAPITAL LETTER N WITH SMALL LETTER J] 	TokenNameCOMMENT_LINE	ǋ [LATIN CAPITAL LETTER N WITH SMALL LETTER J] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'N'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒩ [PARENTHESIZED LATIN SMALL LETTER N] 	TokenNameCOMMENT_LINE	⒩ [PARENTHESIZED LATIN SMALL LETTER N] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǌ [LATIN SMALL LETTER NJ] 	TokenNameCOMMENT_LINE	ǌ [LATIN SMALL LETTER NJ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ò [LATIN CAPITAL LETTER O WITH GRAVE] 	TokenNameCOMMENT_LINE	Ò [LATIN CAPITAL LETTER O WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ó [LATIN CAPITAL LETTER O WITH ACUTE] 	TokenNameCOMMENT_LINE	Ó [LATIN CAPITAL LETTER O WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ô [LATIN CAPITAL LETTER O WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ô [LATIN CAPITAL LETTER O WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Õ [LATIN CAPITAL LETTER O WITH TILDE] 	TokenNameCOMMENT_LINE	Õ [LATIN CAPITAL LETTER O WITH TILDE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ö [LATIN CAPITAL LETTER O WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ö [LATIN CAPITAL LETTER O WITH DIAERESIS] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ø [LATIN CAPITAL LETTER O WITH STROKE] 	TokenNameCOMMENT_LINE	Ø [LATIN CAPITAL LETTER O WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ō [LATIN CAPITAL LETTER O WITH MACRON] 	TokenNameCOMMENT_LINE	Ō [LATIN CAPITAL LETTER O WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŏ [LATIN CAPITAL LETTER O WITH BREVE] 	TokenNameCOMMENT_LINE	Ŏ [LATIN CAPITAL LETTER O WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ő [LATIN CAPITAL LETTER O WITH DOUBLE ACUTE] 	TokenNameCOMMENT_LINE	Ő [LATIN CAPITAL LETTER O WITH DOUBLE ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɔ [LATIN CAPITAL LETTER OPEN O] 	TokenNameCOMMENT_LINE	Ɔ [LATIN CAPITAL LETTER OPEN O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɵ [LATIN CAPITAL LETTER O WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	Ɵ [LATIN CAPITAL LETTER O WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ơ [LATIN CAPITAL LETTER O WITH HORN] 	TokenNameCOMMENT_LINE	Ơ [LATIN CAPITAL LETTER O WITH HORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǒ [LATIN CAPITAL LETTER O WITH CARON] 	TokenNameCOMMENT_LINE	Ǒ [LATIN CAPITAL LETTER O WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǫ [LATIN CAPITAL LETTER O WITH OGONEK] 	TokenNameCOMMENT_LINE	Ǫ [LATIN CAPITAL LETTER O WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǭ [LATIN CAPITAL LETTER O WITH OGONEK AND MACRON] 	TokenNameCOMMENT_LINE	Ǭ [LATIN CAPITAL LETTER O WITH OGONEK AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǿ [LATIN CAPITAL LETTER O WITH STROKE AND ACUTE] 	TokenNameCOMMENT_LINE	Ǿ [LATIN CAPITAL LETTER O WITH STROKE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȍ [LATIN CAPITAL LETTER O WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȍ [LATIN CAPITAL LETTER O WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȏ [LATIN CAPITAL LETTER O WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȏ [LATIN CAPITAL LETTER O WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȫ [LATIN CAPITAL LETTER O WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	Ȫ [LATIN CAPITAL LETTER O WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȭ [LATIN CAPITAL LETTER O WITH TILDE AND MACRON] 	TokenNameCOMMENT_LINE	Ȭ [LATIN CAPITAL LETTER O WITH TILDE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȯ [LATIN CAPITAL LETTER O WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ȯ [LATIN CAPITAL LETTER O WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȱ [LATIN CAPITAL LETTER O WITH DOT ABOVE AND MACRON] 	TokenNameCOMMENT_LINE	Ȱ [LATIN CAPITAL LETTER O WITH DOT ABOVE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴏ [LATIN LETTER SMALL CAPITAL O] 	TokenNameCOMMENT_LINE	ᴏ [LATIN LETTER SMALL CAPITAL O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴐ [LATIN LETTER SMALL CAPITAL OPEN O] 	TokenNameCOMMENT_LINE	ᴐ [LATIN LETTER SMALL CAPITAL OPEN O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṍ [LATIN CAPITAL LETTER O WITH TILDE AND ACUTE] 	TokenNameCOMMENT_LINE	Ṍ [LATIN CAPITAL LETTER O WITH TILDE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṏ [LATIN CAPITAL LETTER O WITH TILDE AND DIAERESIS] 	TokenNameCOMMENT_LINE	Ṏ [LATIN CAPITAL LETTER O WITH TILDE AND DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṑ [LATIN CAPITAL LETTER O WITH MACRON AND GRAVE] 	TokenNameCOMMENT_LINE	Ṑ [LATIN CAPITAL LETTER O WITH MACRON AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṓ [LATIN CAPITAL LETTER O WITH MACRON AND ACUTE] 	TokenNameCOMMENT_LINE	Ṓ [LATIN CAPITAL LETTER O WITH MACRON AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ọ [LATIN CAPITAL LETTER O WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ọ [LATIN CAPITAL LETTER O WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỏ [LATIN CAPITAL LETTER O WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ỏ [LATIN CAPITAL LETTER O WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ố [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	Ố [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ồ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	Ồ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ổ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ổ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỗ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	Ỗ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ộ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ộ [LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ớ [LATIN CAPITAL LETTER O WITH HORN AND ACUTE] 	TokenNameCOMMENT_LINE	Ớ [LATIN CAPITAL LETTER O WITH HORN AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ờ [LATIN CAPITAL LETTER O WITH HORN AND GRAVE] 	TokenNameCOMMENT_LINE	Ờ [LATIN CAPITAL LETTER O WITH HORN AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ở [LATIN CAPITAL LETTER O WITH HORN AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ở [LATIN CAPITAL LETTER O WITH HORN AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỡ [LATIN CAPITAL LETTER O WITH HORN AND TILDE] 	TokenNameCOMMENT_LINE	Ỡ [LATIN CAPITAL LETTER O WITH HORN AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ợ [LATIN CAPITAL LETTER O WITH HORN AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ợ [LATIN CAPITAL LETTER O WITH HORN AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓞ [CIRCLED LATIN CAPITAL LETTER O] 	TokenNameCOMMENT_LINE	Ⓞ [CIRCLED LATIN CAPITAL LETTER O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝋ [LATIN CAPITAL LETTER O WITH LONG STROKE OVERLAY] 	TokenNameCOMMENT_LINE	Ꝋ [LATIN CAPITAL LETTER O WITH LONG STROKE OVERLAY] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝍ [LATIN CAPITAL LETTER O WITH LOOP] 	TokenNameCOMMENT_LINE	Ꝍ [LATIN CAPITAL LETTER O WITH LOOP] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｏ [FULLWIDTH LATIN CAPITAL LETTER O] 	TokenNameCOMMENT_LINE	Ｏ [FULLWIDTH LATIN CAPITAL LETTER O] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ò [LATIN SMALL LETTER O WITH GRAVE] 	TokenNameCOMMENT_LINE	ò [LATIN SMALL LETTER O WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ó [LATIN SMALL LETTER O WITH ACUTE] 	TokenNameCOMMENT_LINE	ó [LATIN SMALL LETTER O WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ô [LATIN SMALL LETTER O WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ô [LATIN SMALL LETTER O WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// õ [LATIN SMALL LETTER O WITH TILDE] 	TokenNameCOMMENT_LINE	õ [LATIN SMALL LETTER O WITH TILDE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ö [LATIN SMALL LETTER O WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ö [LATIN SMALL LETTER O WITH DIAERESIS] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ø [LATIN SMALL LETTER O WITH STROKE] 	TokenNameCOMMENT_LINE	ø [LATIN SMALL LETTER O WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ō [LATIN SMALL LETTER O WITH MACRON] 	TokenNameCOMMENT_LINE	ō [LATIN SMALL LETTER O WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŏ [LATIN SMALL LETTER O WITH BREVE] 	TokenNameCOMMENT_LINE	ŏ [LATIN SMALL LETTER O WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ő [LATIN SMALL LETTER O WITH DOUBLE ACUTE] 	TokenNameCOMMENT_LINE	ő [LATIN SMALL LETTER O WITH DOUBLE ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ơ [LATIN SMALL LETTER O WITH HORN] 	TokenNameCOMMENT_LINE	ơ [LATIN SMALL LETTER O WITH HORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǒ [LATIN SMALL LETTER O WITH CARON] 	TokenNameCOMMENT_LINE	ǒ [LATIN SMALL LETTER O WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǫ [LATIN SMALL LETTER O WITH OGONEK] 	TokenNameCOMMENT_LINE	ǫ [LATIN SMALL LETTER O WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǭ [LATIN SMALL LETTER O WITH OGONEK AND MACRON] 	TokenNameCOMMENT_LINE	ǭ [LATIN SMALL LETTER O WITH OGONEK AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǿ [LATIN SMALL LETTER O WITH STROKE AND ACUTE] 	TokenNameCOMMENT_LINE	ǿ [LATIN SMALL LETTER O WITH STROKE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȍ [LATIN SMALL LETTER O WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȍ [LATIN SMALL LETTER O WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȏ [LATIN SMALL LETTER O WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȏ [LATIN SMALL LETTER O WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȫ [LATIN SMALL LETTER O WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	ȫ [LATIN SMALL LETTER O WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȭ [LATIN SMALL LETTER O WITH TILDE AND MACRON] 	TokenNameCOMMENT_LINE	ȭ [LATIN SMALL LETTER O WITH TILDE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȯ [LATIN SMALL LETTER O WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ȯ [LATIN SMALL LETTER O WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȱ [LATIN SMALL LETTER O WITH DOT ABOVE AND MACRON] 	TokenNameCOMMENT_LINE	ȱ [LATIN SMALL LETTER O WITH DOT ABOVE AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɔ [LATIN SMALL LETTER OPEN O] 	TokenNameCOMMENT_LINE	ɔ [LATIN SMALL LETTER OPEN O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɵ [LATIN SMALL LETTER BARRED O] 	TokenNameCOMMENT_LINE	ɵ [LATIN SMALL LETTER BARRED O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴖ [LATIN SMALL LETTER TOP HALF O] 	TokenNameCOMMENT_LINE	ᴖ [LATIN SMALL LETTER TOP HALF O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴗ [LATIN SMALL LETTER BOTTOM HALF O] 	TokenNameCOMMENT_LINE	ᴗ [LATIN SMALL LETTER BOTTOM HALF O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶗ [LATIN SMALL LETTER OPEN O WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶗ [LATIN SMALL LETTER OPEN O WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṍ [LATIN SMALL LETTER O WITH TILDE AND ACUTE] 	TokenNameCOMMENT_LINE	ṍ [LATIN SMALL LETTER O WITH TILDE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṏ [LATIN SMALL LETTER O WITH TILDE AND DIAERESIS] 	TokenNameCOMMENT_LINE	ṏ [LATIN SMALL LETTER O WITH TILDE AND DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṑ [LATIN SMALL LETTER O WITH MACRON AND GRAVE] 	TokenNameCOMMENT_LINE	ṑ [LATIN SMALL LETTER O WITH MACRON AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṓ [LATIN SMALL LETTER O WITH MACRON AND ACUTE] 	TokenNameCOMMENT_LINE	ṓ [LATIN SMALL LETTER O WITH MACRON AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ọ [LATIN SMALL LETTER O WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ọ [LATIN SMALL LETTER O WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỏ [LATIN SMALL LETTER O WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ỏ [LATIN SMALL LETTER O WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ố [LATIN SMALL LETTER O WITH CIRCUMFLEX AND ACUTE] 	TokenNameCOMMENT_LINE	ố [LATIN SMALL LETTER O WITH CIRCUMFLEX AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ồ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND GRAVE] 	TokenNameCOMMENT_LINE	ồ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ổ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ổ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỗ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND TILDE] 	TokenNameCOMMENT_LINE	ỗ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ộ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND DOT BELOW] 	TokenNameCOMMENT_LINE	ộ [LATIN SMALL LETTER O WITH CIRCUMFLEX AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ớ [LATIN SMALL LETTER O WITH HORN AND ACUTE] 	TokenNameCOMMENT_LINE	ớ [LATIN SMALL LETTER O WITH HORN AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ờ [LATIN SMALL LETTER O WITH HORN AND GRAVE] 	TokenNameCOMMENT_LINE	ờ [LATIN SMALL LETTER O WITH HORN AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ở [LATIN SMALL LETTER O WITH HORN AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ở [LATIN SMALL LETTER O WITH HORN AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỡ [LATIN SMALL LETTER O WITH HORN AND TILDE] 	TokenNameCOMMENT_LINE	ỡ [LATIN SMALL LETTER O WITH HORN AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ợ [LATIN SMALL LETTER O WITH HORN AND DOT BELOW] 	TokenNameCOMMENT_LINE	ợ [LATIN SMALL LETTER O WITH HORN AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₒ [LATIN SUBSCRIPT SMALL LETTER O] 	TokenNameCOMMENT_LINE	ₒ [LATIN SUBSCRIPT SMALL LETTER O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓞ [CIRCLED LATIN SMALL LETTER O] 	TokenNameCOMMENT_LINE	ⓞ [CIRCLED LATIN SMALL LETTER O] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱺ [LATIN SMALL LETTER O WITH LOW RING INSIDE] 	TokenNameCOMMENT_LINE	ⱺ [LATIN SMALL LETTER O WITH LOW RING INSIDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝋ [LATIN SMALL LETTER O WITH LONG STROKE OVERLAY] 	TokenNameCOMMENT_LINE	ꝋ [LATIN SMALL LETTER O WITH LONG STROKE OVERLAY] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝍ [LATIN SMALL LETTER O WITH LOOP] 	TokenNameCOMMENT_LINE	ꝍ [LATIN SMALL LETTER O WITH LOOP] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｏ [FULLWIDTH LATIN SMALL LETTER O] 	TokenNameCOMMENT_LINE	ｏ [FULLWIDTH LATIN SMALL LETTER O] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Œ [LATIN CAPITAL LIGATURE OE] 	TokenNameCOMMENT_LINE	Œ [LATIN CAPITAL LIGATURE OE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɶ [LATIN LETTER SMALL CAPITAL OE] 	TokenNameCOMMENT_LINE	ɶ [LATIN LETTER SMALL CAPITAL OE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝏ [LATIN CAPITAL LETTER OO] 	TokenNameCOMMENT_LINE	Ꝏ [LATIN CAPITAL LETTER OO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȣ http://en.wikipedia.org/wiki/OU [LATIN CAPITAL LETTER OU] 	TokenNameCOMMENT_LINE	Ȣ http://en.wikipedia.org/wiki/OU [LATIN CAPITAL LETTER OU] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴕ [LATIN LETTER SMALL CAPITAL OU] 	TokenNameCOMMENT_LINE	ᴕ [LATIN LETTER SMALL CAPITAL OU] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'U'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒪ [PARENTHESIZED LATIN SMALL LETTER O] 	TokenNameCOMMENT_LINE	⒪ [PARENTHESIZED LATIN SMALL LETTER O] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// œ [LATIN SMALL LIGATURE OE] 	TokenNameCOMMENT_LINE	œ [LATIN SMALL LIGATURE OE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴔ [LATIN SMALL LETTER TURNED OE] 	TokenNameCOMMENT_LINE	ᴔ [LATIN SMALL LETTER TURNED OE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝏ [LATIN SMALL LETTER OO] 	TokenNameCOMMENT_LINE	ꝏ [LATIN SMALL LETTER OO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȣ http://en.wikipedia.org/wiki/OU [LATIN SMALL LETTER OU] 	TokenNameCOMMENT_LINE	ȣ http://en.wikipedia.org/wiki/OU [LATIN SMALL LETTER OU] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƥ [LATIN CAPITAL LETTER P WITH HOOK] 	TokenNameCOMMENT_LINE	Ƥ [LATIN CAPITAL LETTER P WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴘ [LATIN LETTER SMALL CAPITAL P] 	TokenNameCOMMENT_LINE	ᴘ [LATIN LETTER SMALL CAPITAL P] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṕ [LATIN CAPITAL LETTER P WITH ACUTE] 	TokenNameCOMMENT_LINE	Ṕ [LATIN CAPITAL LETTER P WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṗ [LATIN CAPITAL LETTER P WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṗ [LATIN CAPITAL LETTER P WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓟ [CIRCLED LATIN CAPITAL LETTER P] 	TokenNameCOMMENT_LINE	Ⓟ [CIRCLED LATIN CAPITAL LETTER P] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ᵽ [LATIN CAPITAL LETTER P WITH STROKE] 	TokenNameCOMMENT_LINE	Ᵽ [LATIN CAPITAL LETTER P WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝑ [LATIN CAPITAL LETTER P WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	Ꝑ [LATIN CAPITAL LETTER P WITH STROKE THROUGH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝓ [LATIN CAPITAL LETTER P WITH FLOURISH] 	TokenNameCOMMENT_LINE	Ꝓ [LATIN CAPITAL LETTER P WITH FLOURISH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝕ [LATIN CAPITAL LETTER P WITH SQUIRREL TAIL] 	TokenNameCOMMENT_LINE	Ꝕ [LATIN CAPITAL LETTER P WITH SQUIRREL TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｐ [FULLWIDTH LATIN CAPITAL LETTER P] 	TokenNameCOMMENT_LINE	Ｐ [FULLWIDTH LATIN CAPITAL LETTER P] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'P'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƥ [LATIN SMALL LETTER P WITH HOOK] 	TokenNameCOMMENT_LINE	ƥ [LATIN SMALL LETTER P WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵱ [LATIN SMALL LETTER P WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵱ [LATIN SMALL LETTER P WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵽ [LATIN SMALL LETTER P WITH STROKE] 	TokenNameCOMMENT_LINE	ᵽ [LATIN SMALL LETTER P WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶈ [LATIN SMALL LETTER P WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶈ [LATIN SMALL LETTER P WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṕ [LATIN SMALL LETTER P WITH ACUTE] 	TokenNameCOMMENT_LINE	ṕ [LATIN SMALL LETTER P WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṗ [LATIN SMALL LETTER P WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṗ [LATIN SMALL LETTER P WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓟ [CIRCLED LATIN SMALL LETTER P] 	TokenNameCOMMENT_LINE	ⓟ [CIRCLED LATIN SMALL LETTER P] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝑ [LATIN SMALL LETTER P WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	ꝑ [LATIN SMALL LETTER P WITH STROKE THROUGH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝓ [LATIN SMALL LETTER P WITH FLOURISH] 	TokenNameCOMMENT_LINE	ꝓ [LATIN SMALL LETTER P WITH FLOURISH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝕ [LATIN SMALL LETTER P WITH SQUIRREL TAIL] 	TokenNameCOMMENT_LINE	ꝕ [LATIN SMALL LETTER P WITH SQUIRREL TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꟼ [LATIN EPIGRAPHIC LETTER REVERSED P] 	TokenNameCOMMENT_LINE	ꟼ [LATIN EPIGRAPHIC LETTER REVERSED P] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｐ [FULLWIDTH LATIN SMALL LETTER P] 	TokenNameCOMMENT_LINE	ｐ [FULLWIDTH LATIN SMALL LETTER P] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'p'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒫ [PARENTHESIZED LATIN SMALL LETTER P] 	TokenNameCOMMENT_LINE	⒫ [PARENTHESIZED LATIN SMALL LETTER P] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'p'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɋ [LATIN CAPITAL LETTER SMALL Q WITH HOOK TAIL] 	TokenNameCOMMENT_LINE	Ɋ [LATIN CAPITAL LETTER SMALL Q WITH HOOK TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓠ [CIRCLED LATIN CAPITAL LETTER Q] 	TokenNameCOMMENT_LINE	Ⓠ [CIRCLED LATIN CAPITAL LETTER Q] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝗ [LATIN CAPITAL LETTER Q WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	Ꝗ [LATIN CAPITAL LETTER Q WITH STROKE THROUGH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝙ [LATIN CAPITAL LETTER Q WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	Ꝙ [LATIN CAPITAL LETTER Q WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｑ [FULLWIDTH LATIN CAPITAL LETTER Q] 	TokenNameCOMMENT_LINE	Ｑ [FULLWIDTH LATIN CAPITAL LETTER Q] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Q'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĸ http://en.wikipedia.org/wiki/Kra_(letter) [LATIN SMALL LETTER KRA] 	TokenNameCOMMENT_LINE	ĸ http://en.wikipedia.org/wiki/Kra_(letter) [LATIN SMALL LETTER KRA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɋ [LATIN SMALL LETTER Q WITH HOOK TAIL] 	TokenNameCOMMENT_LINE	ɋ [LATIN SMALL LETTER Q WITH HOOK TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʠ [LATIN SMALL LETTER Q WITH HOOK] 	TokenNameCOMMENT_LINE	ʠ [LATIN SMALL LETTER Q WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓠ [CIRCLED LATIN SMALL LETTER Q] 	TokenNameCOMMENT_LINE	ⓠ [CIRCLED LATIN SMALL LETTER Q] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝗ [LATIN SMALL LETTER Q WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	ꝗ [LATIN SMALL LETTER Q WITH STROKE THROUGH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝙ [LATIN SMALL LETTER Q WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ꝙ [LATIN SMALL LETTER Q WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｑ [FULLWIDTH LATIN SMALL LETTER Q] 	TokenNameCOMMENT_LINE	ｑ [FULLWIDTH LATIN SMALL LETTER Q] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'q'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒬ [PARENTHESIZED LATIN SMALL LETTER Q] 	TokenNameCOMMENT_LINE	⒬ [PARENTHESIZED LATIN SMALL LETTER Q] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'q'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȹ [LATIN SMALL LETTER QP DIGRAPH] 	TokenNameCOMMENT_LINE	ȹ [LATIN SMALL LETTER QP DIGRAPH] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'q'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'p'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŕ [LATIN CAPITAL LETTER R WITH ACUTE] 	TokenNameCOMMENT_LINE	Ŕ [LATIN CAPITAL LETTER R WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŗ [LATIN CAPITAL LETTER R WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ŗ [LATIN CAPITAL LETTER R WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ř [LATIN CAPITAL LETTER R WITH CARON] 	TokenNameCOMMENT_LINE	Ř [LATIN CAPITAL LETTER R WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȓ [LATIN CAPITAL LETTER R WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȓ [LATIN CAPITAL LETTER R WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȓ [LATIN CAPITAL LETTER R WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȓ [LATIN CAPITAL LETTER R WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɍ [LATIN CAPITAL LETTER R WITH STROKE] 	TokenNameCOMMENT_LINE	Ɍ [LATIN CAPITAL LETTER R WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʀ [LATIN LETTER SMALL CAPITAL R] 	TokenNameCOMMENT_LINE	ʀ [LATIN LETTER SMALL CAPITAL R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʁ [LATIN LETTER SMALL CAPITAL INVERTED R] 	TokenNameCOMMENT_LINE	ʁ [LATIN LETTER SMALL CAPITAL INVERTED R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴙ [LATIN LETTER SMALL CAPITAL REVERSED R] 	TokenNameCOMMENT_LINE	ᴙ [LATIN LETTER SMALL CAPITAL REVERSED R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴚ [LATIN LETTER SMALL CAPITAL TURNED R] 	TokenNameCOMMENT_LINE	ᴚ [LATIN LETTER SMALL CAPITAL TURNED R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṙ [LATIN CAPITAL LETTER R WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṙ [LATIN CAPITAL LETTER R WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṛ [LATIN CAPITAL LETTER R WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṛ [LATIN CAPITAL LETTER R WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṝ [LATIN CAPITAL LETTER R WITH DOT BELOW AND MACRON] 	TokenNameCOMMENT_LINE	Ṝ [LATIN CAPITAL LETTER R WITH DOT BELOW AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṟ [LATIN CAPITAL LETTER R WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ṟ [LATIN CAPITAL LETTER R WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓡ [CIRCLED LATIN CAPITAL LETTER R] 	TokenNameCOMMENT_LINE	Ⓡ [CIRCLED LATIN CAPITAL LETTER R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɽ [LATIN CAPITAL LETTER R WITH TAIL] 	TokenNameCOMMENT_LINE	Ɽ [LATIN CAPITAL LETTER R WITH TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝛ [LATIN CAPITAL LETTER R ROTUNDA] 	TokenNameCOMMENT_LINE	Ꝛ [LATIN CAPITAL LETTER R ROTUNDA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꞃ [LATIN CAPITAL LETTER INSULAR R] 	TokenNameCOMMENT_LINE	Ꞃ [LATIN CAPITAL LETTER INSULAR R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｒ [FULLWIDTH LATIN CAPITAL LETTER R] 	TokenNameCOMMENT_LINE	Ｒ [FULLWIDTH LATIN CAPITAL LETTER R] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'R'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŕ [LATIN SMALL LETTER R WITH ACUTE] 	TokenNameCOMMENT_LINE	ŕ [LATIN SMALL LETTER R WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŗ [LATIN SMALL LETTER R WITH CEDILLA] 	TokenNameCOMMENT_LINE	ŗ [LATIN SMALL LETTER R WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ř [LATIN SMALL LETTER R WITH CARON] 	TokenNameCOMMENT_LINE	ř [LATIN SMALL LETTER R WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȑ [LATIN SMALL LETTER R WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȑ [LATIN SMALL LETTER R WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȓ [LATIN SMALL LETTER R WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȓ [LATIN SMALL LETTER R WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɍ [LATIN SMALL LETTER R WITH STROKE] 	TokenNameCOMMENT_LINE	ɍ [LATIN SMALL LETTER R WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɼ [LATIN SMALL LETTER R WITH LONG LEG] 	TokenNameCOMMENT_LINE	ɼ [LATIN SMALL LETTER R WITH LONG LEG] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɽ [LATIN SMALL LETTER R WITH TAIL] 	TokenNameCOMMENT_LINE	ɽ [LATIN SMALL LETTER R WITH TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɾ [LATIN SMALL LETTER R WITH FISHHOOK] 	TokenNameCOMMENT_LINE	ɾ [LATIN SMALL LETTER R WITH FISHHOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɿ [LATIN SMALL LETTER REVERSED R WITH FISHHOOK] 	TokenNameCOMMENT_LINE	ɿ [LATIN SMALL LETTER REVERSED R WITH FISHHOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵣ [LATIN SUBSCRIPT SMALL LETTER R] 	TokenNameCOMMENT_LINE	ᵣ [LATIN SUBSCRIPT SMALL LETTER R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵲ [LATIN SMALL LETTER R WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵲ [LATIN SMALL LETTER R WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵳ [LATIN SMALL LETTER R WITH FISHHOOK AND MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵳ [LATIN SMALL LETTER R WITH FISHHOOK AND MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶉ [LATIN SMALL LETTER R WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶉ [LATIN SMALL LETTER R WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṙ [LATIN SMALL LETTER R WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṙ [LATIN SMALL LETTER R WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṛ [LATIN SMALL LETTER R WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṛ [LATIN SMALL LETTER R WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṝ [LATIN SMALL LETTER R WITH DOT BELOW AND MACRON] 	TokenNameCOMMENT_LINE	ṝ [LATIN SMALL LETTER R WITH DOT BELOW AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṟ [LATIN SMALL LETTER R WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ṟ [LATIN SMALL LETTER R WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓡ [CIRCLED LATIN SMALL LETTER R] 	TokenNameCOMMENT_LINE	ⓡ [CIRCLED LATIN SMALL LETTER R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝛ [LATIN SMALL LETTER R ROTUNDA] 	TokenNameCOMMENT_LINE	ꝛ [LATIN SMALL LETTER R ROTUNDA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꞃ [LATIN SMALL LETTER INSULAR R] 	TokenNameCOMMENT_LINE	ꞃ [LATIN SMALL LETTER INSULAR R] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｒ [FULLWIDTH LATIN SMALL LETTER R] 	TokenNameCOMMENT_LINE	ｒ [FULLWIDTH LATIN SMALL LETTER R] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'r'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒭ [PARENTHESIZED LATIN SMALL LETTER R] 	TokenNameCOMMENT_LINE	⒭ [PARENTHESIZED LATIN SMALL LETTER R] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'r'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ś [LATIN CAPITAL LETTER S WITH ACUTE] 	TokenNameCOMMENT_LINE	Ś [LATIN CAPITAL LETTER S WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŝ [LATIN CAPITAL LETTER S WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ŝ [LATIN CAPITAL LETTER S WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ş [LATIN CAPITAL LETTER S WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ş [LATIN CAPITAL LETTER S WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Š [LATIN CAPITAL LETTER S WITH CARON] 	TokenNameCOMMENT_LINE	Š [LATIN CAPITAL LETTER S WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ș [LATIN CAPITAL LETTER S WITH COMMA BELOW] 	TokenNameCOMMENT_LINE	Ș [LATIN CAPITAL LETTER S WITH COMMA BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṡ [LATIN CAPITAL LETTER S WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṡ [LATIN CAPITAL LETTER S WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṣ [LATIN CAPITAL LETTER S WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṣ [LATIN CAPITAL LETTER S WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṥ [LATIN CAPITAL LETTER S WITH ACUTE AND DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṥ [LATIN CAPITAL LETTER S WITH ACUTE AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṧ [LATIN CAPITAL LETTER S WITH CARON AND DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṧ [LATIN CAPITAL LETTER S WITH CARON AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṩ [LATIN CAPITAL LETTER S WITH DOT BELOW AND DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṩ [LATIN CAPITAL LETTER S WITH DOT BELOW AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓢ [CIRCLED LATIN CAPITAL LETTER S] 	TokenNameCOMMENT_LINE	Ⓢ [CIRCLED LATIN CAPITAL LETTER S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜱ [LATIN LETTER SMALL CAPITAL S] 	TokenNameCOMMENT_LINE	ꜱ [LATIN LETTER SMALL CAPITAL S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꞅ [LATIN SMALL LETTER INSULAR S] 	TokenNameCOMMENT_LINE	ꞅ [LATIN SMALL LETTER INSULAR S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｓ [FULLWIDTH LATIN CAPITAL LETTER S] 	TokenNameCOMMENT_LINE	Ｓ [FULLWIDTH LATIN CAPITAL LETTER S] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'S'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ś [LATIN SMALL LETTER S WITH ACUTE] 	TokenNameCOMMENT_LINE	ś [LATIN SMALL LETTER S WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŝ [LATIN SMALL LETTER S WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ŝ [LATIN SMALL LETTER S WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ş [LATIN SMALL LETTER S WITH CEDILLA] 	TokenNameCOMMENT_LINE	ş [LATIN SMALL LETTER S WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// š [LATIN SMALL LETTER S WITH CARON] 	TokenNameCOMMENT_LINE	š [LATIN SMALL LETTER S WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ſ http://en.wikipedia.org/wiki/Long_S [LATIN SMALL LETTER LONG S] 	TokenNameCOMMENT_LINE	ſ http://en.wikipedia.org/wiki/Long_S [LATIN SMALL LETTER LONG S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ș [LATIN SMALL LETTER S WITH COMMA BELOW] 	TokenNameCOMMENT_LINE	ș [LATIN SMALL LETTER S WITH COMMA BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȿ [LATIN SMALL LETTER S WITH SWASH TAIL] 	TokenNameCOMMENT_LINE	ȿ [LATIN SMALL LETTER S WITH SWASH TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʂ [LATIN SMALL LETTER S WITH HOOK] 	TokenNameCOMMENT_LINE	ʂ [LATIN SMALL LETTER S WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵴ [LATIN SMALL LETTER S WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵴ [LATIN SMALL LETTER S WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶊ [LATIN SMALL LETTER S WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶊ [LATIN SMALL LETTER S WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṡ [LATIN SMALL LETTER S WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṡ [LATIN SMALL LETTER S WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṣ [LATIN SMALL LETTER S WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṣ [LATIN SMALL LETTER S WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṥ [LATIN SMALL LETTER S WITH ACUTE AND DOT ABOVE] 	TokenNameCOMMENT_LINE	ṥ [LATIN SMALL LETTER S WITH ACUTE AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṧ [LATIN SMALL LETTER S WITH CARON AND DOT ABOVE] 	TokenNameCOMMENT_LINE	ṧ [LATIN SMALL LETTER S WITH CARON AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṩ [LATIN SMALL LETTER S WITH DOT BELOW AND DOT ABOVE] 	TokenNameCOMMENT_LINE	ṩ [LATIN SMALL LETTER S WITH DOT BELOW AND DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẜ [LATIN SMALL LETTER LONG S WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ẜ [LATIN SMALL LETTER LONG S WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẝ [LATIN SMALL LETTER LONG S WITH HIGH STROKE] 	TokenNameCOMMENT_LINE	ẝ [LATIN SMALL LETTER LONG S WITH HIGH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓢ [CIRCLED LATIN SMALL LETTER S] 	TokenNameCOMMENT_LINE	ⓢ [CIRCLED LATIN SMALL LETTER S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꞅ [LATIN CAPITAL LETTER INSULAR S] 	TokenNameCOMMENT_LINE	Ꞅ [LATIN CAPITAL LETTER INSULAR S] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｓ [FULLWIDTH LATIN SMALL LETTER S] 	TokenNameCOMMENT_LINE	ｓ [FULLWIDTH LATIN SMALL LETTER S] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẞ [LATIN CAPITAL LETTER SHARP S] 	TokenNameCOMMENT_LINE	ẞ [LATIN CAPITAL LETTER SHARP S] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'S'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'S'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒮ [PARENTHESIZED LATIN SMALL LETTER S] 	TokenNameCOMMENT_LINE	⒮ [PARENTHESIZED LATIN SMALL LETTER S] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ß [LATIN SMALL LETTER SHARP S] 	TokenNameCOMMENT_LINE	ß [LATIN SMALL LETTER SHARP S] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬆ [LATIN SMALL LIGATURE ST] 	TokenNameCOMMENT_LINE	ﬆ [LATIN SMALL LIGATURE ST] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ţ [LATIN CAPITAL LETTER T WITH CEDILLA] 	TokenNameCOMMENT_LINE	Ţ [LATIN CAPITAL LETTER T WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ť [LATIN CAPITAL LETTER T WITH CARON] 	TokenNameCOMMENT_LINE	Ť [LATIN CAPITAL LETTER T WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŧ [LATIN CAPITAL LETTER T WITH STROKE] 	TokenNameCOMMENT_LINE	Ŧ [LATIN CAPITAL LETTER T WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƭ [LATIN CAPITAL LETTER T WITH HOOK] 	TokenNameCOMMENT_LINE	Ƭ [LATIN CAPITAL LETTER T WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ʈ [LATIN CAPITAL LETTER T WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	Ʈ [LATIN CAPITAL LETTER T WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ț [LATIN CAPITAL LETTER T WITH COMMA BELOW] 	TokenNameCOMMENT_LINE	Ț [LATIN CAPITAL LETTER T WITH COMMA BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱦ [LATIN CAPITAL LETTER T WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	Ⱦ [LATIN CAPITAL LETTER T WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴛ [LATIN LETTER SMALL CAPITAL T] 	TokenNameCOMMENT_LINE	ᴛ [LATIN LETTER SMALL CAPITAL T] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṫ [LATIN CAPITAL LETTER T WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ṫ [LATIN CAPITAL LETTER T WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṭ [LATIN CAPITAL LETTER T WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṭ [LATIN CAPITAL LETTER T WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṯ [LATIN CAPITAL LETTER T WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ṯ [LATIN CAPITAL LETTER T WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṱ [LATIN CAPITAL LETTER T WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ṱ [LATIN CAPITAL LETTER T WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓣ [CIRCLED LATIN CAPITAL LETTER T] 	TokenNameCOMMENT_LINE	Ⓣ [CIRCLED LATIN CAPITAL LETTER T] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꞇ [LATIN CAPITAL LETTER INSULAR T] 	TokenNameCOMMENT_LINE	Ꞇ [LATIN CAPITAL LETTER INSULAR T] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｔ [FULLWIDTH LATIN CAPITAL LETTER T] 	TokenNameCOMMENT_LINE	Ｔ [FULLWIDTH LATIN CAPITAL LETTER T] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'T'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ţ [LATIN SMALL LETTER T WITH CEDILLA] 	TokenNameCOMMENT_LINE	ţ [LATIN SMALL LETTER T WITH CEDILLA] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ť [LATIN SMALL LETTER T WITH CARON] 	TokenNameCOMMENT_LINE	ť [LATIN SMALL LETTER T WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŧ [LATIN SMALL LETTER T WITH STROKE] 	TokenNameCOMMENT_LINE	ŧ [LATIN SMALL LETTER T WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƫ [LATIN SMALL LETTER T WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ƫ [LATIN SMALL LETTER T WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƭ [LATIN SMALL LETTER T WITH HOOK] 	TokenNameCOMMENT_LINE	ƭ [LATIN SMALL LETTER T WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ț [LATIN SMALL LETTER T WITH COMMA BELOW] 	TokenNameCOMMENT_LINE	ț [LATIN SMALL LETTER T WITH COMMA BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȶ [LATIN SMALL LETTER T WITH CURL] 	TokenNameCOMMENT_LINE	ȶ [LATIN SMALL LETTER T WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʇ [LATIN SMALL LETTER TURNED T] 	TokenNameCOMMENT_LINE	ʇ [LATIN SMALL LETTER TURNED T] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʈ [LATIN SMALL LETTER T WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ʈ [LATIN SMALL LETTER T WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵵ [LATIN SMALL LETTER T WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵵ [LATIN SMALL LETTER T WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṫ [LATIN SMALL LETTER T WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ṫ [LATIN SMALL LETTER T WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṭ [LATIN SMALL LETTER T WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṭ [LATIN SMALL LETTER T WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṯ [LATIN SMALL LETTER T WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ṯ [LATIN SMALL LETTER T WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṱ [LATIN SMALL LETTER T WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ṱ [LATIN SMALL LETTER T WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẗ [LATIN SMALL LETTER T WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ẗ [LATIN SMALL LETTER T WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓣ [CIRCLED LATIN SMALL LETTER T] 	TokenNameCOMMENT_LINE	ⓣ [CIRCLED LATIN SMALL LETTER T] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱦ [LATIN SMALL LETTER T WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ⱦ [LATIN SMALL LETTER T WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｔ [FULLWIDTH LATIN SMALL LETTER T] 	TokenNameCOMMENT_LINE	ｔ [FULLWIDTH LATIN SMALL LETTER T] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Þ [LATIN CAPITAL LETTER THORN] 	TokenNameCOMMENT_LINE	Þ [LATIN CAPITAL LETTER THORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝧ [LATIN CAPITAL LETTER THORN WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	Ꝧ [LATIN CAPITAL LETTER THORN WITH STROKE THROUGH DESCENDER] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'T'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'H'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꜩ [LATIN CAPITAL LETTER TZ] 	TokenNameCOMMENT_LINE	Ꜩ [LATIN CAPITAL LETTER TZ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'T'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒯ [PARENTHESIZED LATIN SMALL LETTER T] 	TokenNameCOMMENT_LINE	⒯ [PARENTHESIZED LATIN SMALL LETTER T] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʨ [LATIN SMALL LETTER TC DIGRAPH WITH CURL] 	TokenNameCOMMENT_LINE	ʨ [LATIN SMALL LETTER TC DIGRAPH WITH CURL] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// þ [LATIN SMALL LETTER THORN] 	TokenNameCOMMENT_LINE	þ [LATIN SMALL LETTER THORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵺ [LATIN SMALL LETTER TH WITH STRIKETHROUGH] 	TokenNameCOMMENT_LINE	ᵺ [LATIN SMALL LETTER TH WITH STRIKETHROUGH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝧ [LATIN SMALL LETTER THORN WITH STROKE THROUGH DESCENDER] 	TokenNameCOMMENT_LINE	ꝧ [LATIN SMALL LETTER THORN WITH STROKE THROUGH DESCENDER] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʦ [LATIN SMALL LETTER TS DIGRAPH] 	TokenNameCOMMENT_LINE	ʦ [LATIN SMALL LETTER TS DIGRAPH] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꜩ [LATIN SMALL LETTER TZ] 	TokenNameCOMMENT_LINE	ꜩ [LATIN SMALL LETTER TZ] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ù [LATIN CAPITAL LETTER U WITH GRAVE] 	TokenNameCOMMENT_LINE	Ù [LATIN CAPITAL LETTER U WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ú [LATIN CAPITAL LETTER U WITH ACUTE] 	TokenNameCOMMENT_LINE	Ú [LATIN CAPITAL LETTER U WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Û [LATIN CAPITAL LETTER U WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Û [LATIN CAPITAL LETTER U WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ü [LATIN CAPITAL LETTER U WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ü [LATIN CAPITAL LETTER U WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ũ [LATIN CAPITAL LETTER U WITH TILDE] 	TokenNameCOMMENT_LINE	Ũ [LATIN CAPITAL LETTER U WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ū [LATIN CAPITAL LETTER U WITH MACRON] 	TokenNameCOMMENT_LINE	Ū [LATIN CAPITAL LETTER U WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŭ [LATIN CAPITAL LETTER U WITH BREVE] 	TokenNameCOMMENT_LINE	Ŭ [LATIN CAPITAL LETTER U WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ů [LATIN CAPITAL LETTER U WITH RING ABOVE] 	TokenNameCOMMENT_LINE	Ů [LATIN CAPITAL LETTER U WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ű [LATIN CAPITAL LETTER U WITH DOUBLE ACUTE] 	TokenNameCOMMENT_LINE	Ű [LATIN CAPITAL LETTER U WITH DOUBLE ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ų [LATIN CAPITAL LETTER U WITH OGONEK] 	TokenNameCOMMENT_LINE	Ų [LATIN CAPITAL LETTER U WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ư [LATIN CAPITAL LETTER U WITH HORN] 	TokenNameCOMMENT_LINE	Ư [LATIN CAPITAL LETTER U WITH HORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǔ [LATIN CAPITAL LETTER U WITH CARON] 	TokenNameCOMMENT_LINE	Ǔ [LATIN CAPITAL LETTER U WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǖ [LATIN CAPITAL LETTER U WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	Ǖ [LATIN CAPITAL LETTER U WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǘ [LATIN CAPITAL LETTER U WITH DIAERESIS AND ACUTE] 	TokenNameCOMMENT_LINE	Ǘ [LATIN CAPITAL LETTER U WITH DIAERESIS AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǚ [LATIN CAPITAL LETTER U WITH DIAERESIS AND CARON] 	TokenNameCOMMENT_LINE	Ǚ [LATIN CAPITAL LETTER U WITH DIAERESIS AND CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ǜ [LATIN CAPITAL LETTER U WITH DIAERESIS AND GRAVE] 	TokenNameCOMMENT_LINE	Ǜ [LATIN CAPITAL LETTER U WITH DIAERESIS AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȕ [LATIN CAPITAL LETTER U WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	Ȕ [LATIN CAPITAL LETTER U WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȗ [LATIN CAPITAL LETTER U WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	Ȗ [LATIN CAPITAL LETTER U WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ʉ [LATIN CAPITAL LETTER U BAR] 	TokenNameCOMMENT_LINE	Ʉ [LATIN CAPITAL LETTER U BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴜ [LATIN LETTER SMALL CAPITAL U] 	TokenNameCOMMENT_LINE	ᴜ [LATIN LETTER SMALL CAPITAL U] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵾ [LATIN SMALL CAPITAL LETTER U WITH STROKE] 	TokenNameCOMMENT_LINE	ᵾ [LATIN SMALL CAPITAL LETTER U WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṳ [LATIN CAPITAL LETTER U WITH DIAERESIS BELOW] 	TokenNameCOMMENT_LINE	Ṳ [LATIN CAPITAL LETTER U WITH DIAERESIS BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṵ [LATIN CAPITAL LETTER U WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	Ṵ [LATIN CAPITAL LETTER U WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṷ [LATIN CAPITAL LETTER U WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	Ṷ [LATIN CAPITAL LETTER U WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṹ [LATIN CAPITAL LETTER U WITH TILDE AND ACUTE] 	TokenNameCOMMENT_LINE	Ṹ [LATIN CAPITAL LETTER U WITH TILDE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṻ [LATIN CAPITAL LETTER U WITH MACRON AND DIAERESIS] 	TokenNameCOMMENT_LINE	Ṻ [LATIN CAPITAL LETTER U WITH MACRON AND DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ụ [LATIN CAPITAL LETTER U WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ụ [LATIN CAPITAL LETTER U WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ủ [LATIN CAPITAL LETTER U WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ủ [LATIN CAPITAL LETTER U WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ứ [LATIN CAPITAL LETTER U WITH HORN AND ACUTE] 	TokenNameCOMMENT_LINE	Ứ [LATIN CAPITAL LETTER U WITH HORN AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ừ [LATIN CAPITAL LETTER U WITH HORN AND GRAVE] 	TokenNameCOMMENT_LINE	Ừ [LATIN CAPITAL LETTER U WITH HORN AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ử [LATIN CAPITAL LETTER U WITH HORN AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ử [LATIN CAPITAL LETTER U WITH HORN AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ữ [LATIN CAPITAL LETTER U WITH HORN AND TILDE] 	TokenNameCOMMENT_LINE	Ữ [LATIN CAPITAL LETTER U WITH HORN AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ự [LATIN CAPITAL LETTER U WITH HORN AND DOT BELOW] 	TokenNameCOMMENT_LINE	Ự [LATIN CAPITAL LETTER U WITH HORN AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓤ [CIRCLED LATIN CAPITAL LETTER U] 	TokenNameCOMMENT_LINE	Ⓤ [CIRCLED LATIN CAPITAL LETTER U] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｕ [FULLWIDTH LATIN CAPITAL LETTER U] 	TokenNameCOMMENT_LINE	Ｕ [FULLWIDTH LATIN CAPITAL LETTER U] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'U'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ù [LATIN SMALL LETTER U WITH GRAVE] 	TokenNameCOMMENT_LINE	ù [LATIN SMALL LETTER U WITH GRAVE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ú [LATIN SMALL LETTER U WITH ACUTE] 	TokenNameCOMMENT_LINE	ú [LATIN SMALL LETTER U WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// û [LATIN SMALL LETTER U WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	û [LATIN SMALL LETTER U WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ü [LATIN SMALL LETTER U WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ü [LATIN SMALL LETTER U WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ũ [LATIN SMALL LETTER U WITH TILDE] 	TokenNameCOMMENT_LINE	ũ [LATIN SMALL LETTER U WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ū [LATIN SMALL LETTER U WITH MACRON] 	TokenNameCOMMENT_LINE	ū [LATIN SMALL LETTER U WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŭ [LATIN SMALL LETTER U WITH BREVE] 	TokenNameCOMMENT_LINE	ŭ [LATIN SMALL LETTER U WITH BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ů [LATIN SMALL LETTER U WITH RING ABOVE] 	TokenNameCOMMENT_LINE	ů [LATIN SMALL LETTER U WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ű [LATIN SMALL LETTER U WITH DOUBLE ACUTE] 	TokenNameCOMMENT_LINE	ű [LATIN SMALL LETTER U WITH DOUBLE ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ų [LATIN SMALL LETTER U WITH OGONEK] 	TokenNameCOMMENT_LINE	ų [LATIN SMALL LETTER U WITH OGONEK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ư [LATIN SMALL LETTER U WITH HORN] 	TokenNameCOMMENT_LINE	ư [LATIN SMALL LETTER U WITH HORN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǔ [LATIN SMALL LETTER U WITH CARON] 	TokenNameCOMMENT_LINE	ǔ [LATIN SMALL LETTER U WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǖ [LATIN SMALL LETTER U WITH DIAERESIS AND MACRON] 	TokenNameCOMMENT_LINE	ǖ [LATIN SMALL LETTER U WITH DIAERESIS AND MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǘ [LATIN SMALL LETTER U WITH DIAERESIS AND ACUTE] 	TokenNameCOMMENT_LINE	ǘ [LATIN SMALL LETTER U WITH DIAERESIS AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǚ [LATIN SMALL LETTER U WITH DIAERESIS AND CARON] 	TokenNameCOMMENT_LINE	ǚ [LATIN SMALL LETTER U WITH DIAERESIS AND CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ǜ [LATIN SMALL LETTER U WITH DIAERESIS AND GRAVE] 	TokenNameCOMMENT_LINE	ǜ [LATIN SMALL LETTER U WITH DIAERESIS AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȕ [LATIN SMALL LETTER U WITH DOUBLE GRAVE] 	TokenNameCOMMENT_LINE	ȕ [LATIN SMALL LETTER U WITH DOUBLE GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȗ [LATIN SMALL LETTER U WITH INVERTED BREVE] 	TokenNameCOMMENT_LINE	ȗ [LATIN SMALL LETTER U WITH INVERTED BREVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʉ [LATIN SMALL LETTER U BAR] 	TokenNameCOMMENT_LINE	ʉ [LATIN SMALL LETTER U BAR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵤ [LATIN SUBSCRIPT SMALL LETTER U] 	TokenNameCOMMENT_LINE	ᵤ [LATIN SUBSCRIPT SMALL LETTER U] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶙ [LATIN SMALL LETTER U WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ᶙ [LATIN SMALL LETTER U WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṳ [LATIN SMALL LETTER U WITH DIAERESIS BELOW] 	TokenNameCOMMENT_LINE	ṳ [LATIN SMALL LETTER U WITH DIAERESIS BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṵ [LATIN SMALL LETTER U WITH TILDE BELOW] 	TokenNameCOMMENT_LINE	ṵ [LATIN SMALL LETTER U WITH TILDE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṷ [LATIN SMALL LETTER U WITH CIRCUMFLEX BELOW] 	TokenNameCOMMENT_LINE	ṷ [LATIN SMALL LETTER U WITH CIRCUMFLEX BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṹ [LATIN SMALL LETTER U WITH TILDE AND ACUTE] 	TokenNameCOMMENT_LINE	ṹ [LATIN SMALL LETTER U WITH TILDE AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṻ [LATIN SMALL LETTER U WITH MACRON AND DIAERESIS] 	TokenNameCOMMENT_LINE	ṻ [LATIN SMALL LETTER U WITH MACRON AND DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ụ [LATIN SMALL LETTER U WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ụ [LATIN SMALL LETTER U WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ủ [LATIN SMALL LETTER U WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ủ [LATIN SMALL LETTER U WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ứ [LATIN SMALL LETTER U WITH HORN AND ACUTE] 	TokenNameCOMMENT_LINE	ứ [LATIN SMALL LETTER U WITH HORN AND ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ừ [LATIN SMALL LETTER U WITH HORN AND GRAVE] 	TokenNameCOMMENT_LINE	ừ [LATIN SMALL LETTER U WITH HORN AND GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ử [LATIN SMALL LETTER U WITH HORN AND HOOK ABOVE] 	TokenNameCOMMENT_LINE	ử [LATIN SMALL LETTER U WITH HORN AND HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ữ [LATIN SMALL LETTER U WITH HORN AND TILDE] 	TokenNameCOMMENT_LINE	ữ [LATIN SMALL LETTER U WITH HORN AND TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ự [LATIN SMALL LETTER U WITH HORN AND DOT BELOW] 	TokenNameCOMMENT_LINE	ự [LATIN SMALL LETTER U WITH HORN AND DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓤ [CIRCLED LATIN SMALL LETTER U] 	TokenNameCOMMENT_LINE	ⓤ [CIRCLED LATIN SMALL LETTER U] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｕ [FULLWIDTH LATIN SMALL LETTER U] 	TokenNameCOMMENT_LINE	ｕ [FULLWIDTH LATIN SMALL LETTER U] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒰ [PARENTHESIZED LATIN SMALL LETTER U] 	TokenNameCOMMENT_LINE	⒰ [PARENTHESIZED LATIN SMALL LETTER U] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵫ [LATIN SMALL LETTER UE] 	TokenNameCOMMENT_LINE	ᵫ [LATIN SMALL LETTER UE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ʋ [LATIN CAPITAL LETTER V WITH HOOK] 	TokenNameCOMMENT_LINE	Ʋ [LATIN CAPITAL LETTER V WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ʌ [LATIN CAPITAL LETTER TURNED V] 	TokenNameCOMMENT_LINE	Ʌ [LATIN CAPITAL LETTER TURNED V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴠ [LATIN LETTER SMALL CAPITAL V] 	TokenNameCOMMENT_LINE	ᴠ [LATIN LETTER SMALL CAPITAL V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṽ [LATIN CAPITAL LETTER V WITH TILDE] 	TokenNameCOMMENT_LINE	Ṽ [LATIN CAPITAL LETTER V WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ṿ [LATIN CAPITAL LETTER V WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ṿ [LATIN CAPITAL LETTER V WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỽ [LATIN CAPITAL LETTER MIDDLE-WELSH V] 	TokenNameCOMMENT_LINE	Ỽ [LATIN CAPITAL LETTER MIDDLE-WELSH V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓥ [CIRCLED LATIN CAPITAL LETTER V] 	TokenNameCOMMENT_LINE	Ⓥ [CIRCLED LATIN CAPITAL LETTER V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝟ [LATIN CAPITAL LETTER V WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	Ꝟ [LATIN CAPITAL LETTER V WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝩ [LATIN CAPITAL LETTER VEND] 	TokenNameCOMMENT_LINE	Ꝩ [LATIN CAPITAL LETTER VEND] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｖ [FULLWIDTH LATIN CAPITAL LETTER V] 	TokenNameCOMMENT_LINE	Ｖ [FULLWIDTH LATIN CAPITAL LETTER V] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'V'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʋ [LATIN SMALL LETTER V WITH HOOK] 	TokenNameCOMMENT_LINE	ʋ [LATIN SMALL LETTER V WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʌ [LATIN SMALL LETTER TURNED V] 	TokenNameCOMMENT_LINE	ʌ [LATIN SMALL LETTER TURNED V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵥ [LATIN SUBSCRIPT SMALL LETTER V] 	TokenNameCOMMENT_LINE	ᵥ [LATIN SUBSCRIPT SMALL LETTER V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶌ [LATIN SMALL LETTER V WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶌ [LATIN SMALL LETTER V WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṽ [LATIN SMALL LETTER V WITH TILDE] 	TokenNameCOMMENT_LINE	ṽ [LATIN SMALL LETTER V WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ṿ [LATIN SMALL LETTER V WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ṿ [LATIN SMALL LETTER V WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓥ [CIRCLED LATIN SMALL LETTER V] 	TokenNameCOMMENT_LINE	ⓥ [CIRCLED LATIN SMALL LETTER V] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱱ [LATIN SMALL LETTER V WITH RIGHT HOOK] 	TokenNameCOMMENT_LINE	ⱱ [LATIN SMALL LETTER V WITH RIGHT HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱴ [LATIN SMALL LETTER V WITH CURL] 	TokenNameCOMMENT_LINE	ⱴ [LATIN SMALL LETTER V WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝟ [LATIN SMALL LETTER V WITH DIAGONAL STROKE] 	TokenNameCOMMENT_LINE	ꝟ [LATIN SMALL LETTER V WITH DIAGONAL STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｖ [FULLWIDTH LATIN SMALL LETTER V] 	TokenNameCOMMENT_LINE	ｖ [FULLWIDTH LATIN SMALL LETTER V] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝡ [LATIN CAPITAL LETTER VY] 	TokenNameCOMMENT_LINE	Ꝡ [LATIN CAPITAL LETTER VY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'V'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒱ [PARENTHESIZED LATIN SMALL LETTER V] 	TokenNameCOMMENT_LINE	⒱ [PARENTHESIZED LATIN SMALL LETTER V] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝡ [LATIN SMALL LETTER VY] 	TokenNameCOMMENT_LINE	ꝡ [LATIN SMALL LETTER VY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŵ [LATIN CAPITAL LETTER W WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ŵ [LATIN CAPITAL LETTER W WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƿ http://en.wikipedia.org/wiki/Wynn [LATIN CAPITAL LETTER WYNN] 	TokenNameCOMMENT_LINE	Ƿ http://en.wikipedia.org/wiki/Wynn [LATIN CAPITAL LETTER WYNN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴡ [LATIN LETTER SMALL CAPITAL W] 	TokenNameCOMMENT_LINE	ᴡ [LATIN LETTER SMALL CAPITAL W] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẁ [LATIN CAPITAL LETTER W WITH GRAVE] 	TokenNameCOMMENT_LINE	Ẁ [LATIN CAPITAL LETTER W WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẃ [LATIN CAPITAL LETTER W WITH ACUTE] 	TokenNameCOMMENT_LINE	Ẃ [LATIN CAPITAL LETTER W WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẅ [LATIN CAPITAL LETTER W WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ẅ [LATIN CAPITAL LETTER W WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẇ [LATIN CAPITAL LETTER W WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ẇ [LATIN CAPITAL LETTER W WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẉ [LATIN CAPITAL LETTER W WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ẉ [LATIN CAPITAL LETTER W WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓦ [CIRCLED LATIN CAPITAL LETTER W] 	TokenNameCOMMENT_LINE	Ⓦ [CIRCLED LATIN CAPITAL LETTER W] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱳ [LATIN CAPITAL LETTER W WITH HOOK] 	TokenNameCOMMENT_LINE	Ⱳ [LATIN CAPITAL LETTER W WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｗ [FULLWIDTH LATIN CAPITAL LETTER W] 	TokenNameCOMMENT_LINE	Ｗ [FULLWIDTH LATIN CAPITAL LETTER W] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'W'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŵ [LATIN SMALL LETTER W WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ŵ [LATIN SMALL LETTER W WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƿ http://en.wikipedia.org/wiki/Wynn [LATIN LETTER WYNN] 	TokenNameCOMMENT_LINE	ƿ http://en.wikipedia.org/wiki/Wynn [LATIN LETTER WYNN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʍ [LATIN SMALL LETTER TURNED W] 	TokenNameCOMMENT_LINE	ʍ [LATIN SMALL LETTER TURNED W] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẁ [LATIN SMALL LETTER W WITH GRAVE] 	TokenNameCOMMENT_LINE	ẁ [LATIN SMALL LETTER W WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẃ [LATIN SMALL LETTER W WITH ACUTE] 	TokenNameCOMMENT_LINE	ẃ [LATIN SMALL LETTER W WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẅ [LATIN SMALL LETTER W WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ẅ [LATIN SMALL LETTER W WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẇ [LATIN SMALL LETTER W WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ẇ [LATIN SMALL LETTER W WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẉ [LATIN SMALL LETTER W WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ẉ [LATIN SMALL LETTER W WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẘ [LATIN SMALL LETTER W WITH RING ABOVE] 	TokenNameCOMMENT_LINE	ẘ [LATIN SMALL LETTER W WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓦ [CIRCLED LATIN SMALL LETTER W] 	TokenNameCOMMENT_LINE	ⓦ [CIRCLED LATIN SMALL LETTER W] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱳ [LATIN SMALL LETTER W WITH HOOK] 	TokenNameCOMMENT_LINE	ⱳ [LATIN SMALL LETTER W WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｗ [FULLWIDTH LATIN SMALL LETTER W] 	TokenNameCOMMENT_LINE	ｗ [FULLWIDTH LATIN SMALL LETTER W] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'w'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒲ [PARENTHESIZED LATIN SMALL LETTER W] 	TokenNameCOMMENT_LINE	⒲ [PARENTHESIZED LATIN SMALL LETTER W] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'w'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẋ [LATIN CAPITAL LETTER X WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ẋ [LATIN CAPITAL LETTER X WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẍ [LATIN CAPITAL LETTER X WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ẍ [LATIN CAPITAL LETTER X WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓧ [CIRCLED LATIN CAPITAL LETTER X] 	TokenNameCOMMENT_LINE	Ⓧ [CIRCLED LATIN CAPITAL LETTER X] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｘ [FULLWIDTH LATIN CAPITAL LETTER X] 	TokenNameCOMMENT_LINE	Ｘ [FULLWIDTH LATIN CAPITAL LETTER X] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'X'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶍ [LATIN SMALL LETTER X WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶍ [LATIN SMALL LETTER X WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẋ [LATIN SMALL LETTER X WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ẋ [LATIN SMALL LETTER X WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẍ [LATIN SMALL LETTER X WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ẍ [LATIN SMALL LETTER X WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₓ [LATIN SUBSCRIPT SMALL LETTER X] 	TokenNameCOMMENT_LINE	ₓ [LATIN SUBSCRIPT SMALL LETTER X] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓧ [CIRCLED LATIN SMALL LETTER X] 	TokenNameCOMMENT_LINE	ⓧ [CIRCLED LATIN SMALL LETTER X] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｘ [FULLWIDTH LATIN SMALL LETTER X] 	TokenNameCOMMENT_LINE	ｘ [FULLWIDTH LATIN SMALL LETTER X] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'x'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒳ [PARENTHESIZED LATIN SMALL LETTER X] 	TokenNameCOMMENT_LINE	⒳ [PARENTHESIZED LATIN SMALL LETTER X] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'x'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ý [LATIN CAPITAL LETTER Y WITH ACUTE] 	TokenNameCOMMENT_LINE	Ý [LATIN CAPITAL LETTER Y WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ŷ [LATIN CAPITAL LETTER Y WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ŷ [LATIN CAPITAL LETTER Y WITH CIRCUMFLEX] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ÿ [LATIN CAPITAL LETTER Y WITH DIAERESIS] 	TokenNameCOMMENT_LINE	Ÿ [LATIN CAPITAL LETTER Y WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƴ [LATIN CAPITAL LETTER Y WITH HOOK] 	TokenNameCOMMENT_LINE	Ƴ [LATIN CAPITAL LETTER Y WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȳ [LATIN CAPITAL LETTER Y WITH MACRON] 	TokenNameCOMMENT_LINE	Ȳ [LATIN CAPITAL LETTER Y WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ɏ [LATIN CAPITAL LETTER Y WITH STROKE] 	TokenNameCOMMENT_LINE	Ɏ [LATIN CAPITAL LETTER Y WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʏ [LATIN LETTER SMALL CAPITAL Y] 	TokenNameCOMMENT_LINE	ʏ [LATIN LETTER SMALL CAPITAL Y] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẏ [LATIN CAPITAL LETTER Y WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ẏ [LATIN CAPITAL LETTER Y WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỳ [LATIN CAPITAL LETTER Y WITH GRAVE] 	TokenNameCOMMENT_LINE	Ỳ [LATIN CAPITAL LETTER Y WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỵ [LATIN CAPITAL LETTER Y WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ỵ [LATIN CAPITAL LETTER Y WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỷ [LATIN CAPITAL LETTER Y WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	Ỷ [LATIN CAPITAL LETTER Y WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỹ [LATIN CAPITAL LETTER Y WITH TILDE] 	TokenNameCOMMENT_LINE	Ỹ [LATIN CAPITAL LETTER Y WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ỿ [LATIN CAPITAL LETTER Y WITH LOOP] 	TokenNameCOMMENT_LINE	Ỿ [LATIN CAPITAL LETTER Y WITH LOOP] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓨ [CIRCLED LATIN CAPITAL LETTER Y] 	TokenNameCOMMENT_LINE	Ⓨ [CIRCLED LATIN CAPITAL LETTER Y] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｙ [FULLWIDTH LATIN CAPITAL LETTER Y] 	TokenNameCOMMENT_LINE	Ｙ [FULLWIDTH LATIN CAPITAL LETTER Y] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ý [LATIN SMALL LETTER Y WITH ACUTE] 	TokenNameCOMMENT_LINE	ý [LATIN SMALL LETTER Y WITH ACUTE] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ÿ [LATIN SMALL LETTER Y WITH DIAERESIS] 	TokenNameCOMMENT_LINE	ÿ [LATIN SMALL LETTER Y WITH DIAERESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ŷ [LATIN SMALL LETTER Y WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ŷ [LATIN SMALL LETTER Y WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƴ [LATIN SMALL LETTER Y WITH HOOK] 	TokenNameCOMMENT_LINE	ƴ [LATIN SMALL LETTER Y WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȳ [LATIN SMALL LETTER Y WITH MACRON] 	TokenNameCOMMENT_LINE	ȳ [LATIN SMALL LETTER Y WITH MACRON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɏ [LATIN SMALL LETTER Y WITH STROKE] 	TokenNameCOMMENT_LINE	ɏ [LATIN SMALL LETTER Y WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʎ [LATIN SMALL LETTER TURNED Y] 	TokenNameCOMMENT_LINE	ʎ [LATIN SMALL LETTER TURNED Y] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẏ [LATIN SMALL LETTER Y WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ẏ [LATIN SMALL LETTER Y WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẙ [LATIN SMALL LETTER Y WITH RING ABOVE] 	TokenNameCOMMENT_LINE	ẙ [LATIN SMALL LETTER Y WITH RING ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỳ [LATIN SMALL LETTER Y WITH GRAVE] 	TokenNameCOMMENT_LINE	ỳ [LATIN SMALL LETTER Y WITH GRAVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỵ [LATIN SMALL LETTER Y WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ỵ [LATIN SMALL LETTER Y WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỷ [LATIN SMALL LETTER Y WITH HOOK ABOVE] 	TokenNameCOMMENT_LINE	ỷ [LATIN SMALL LETTER Y WITH HOOK ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỹ [LATIN SMALL LETTER Y WITH TILDE] 	TokenNameCOMMENT_LINE	ỹ [LATIN SMALL LETTER Y WITH TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ỿ [LATIN SMALL LETTER Y WITH LOOP] 	TokenNameCOMMENT_LINE	ỿ [LATIN SMALL LETTER Y WITH LOOP] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓨ [CIRCLED LATIN SMALL LETTER Y] 	TokenNameCOMMENT_LINE	ⓨ [CIRCLED LATIN SMALL LETTER Y] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｙ [FULLWIDTH LATIN SMALL LETTER Y] 	TokenNameCOMMENT_LINE	ｙ [FULLWIDTH LATIN SMALL LETTER Y] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒴ [PARENTHESIZED LATIN SMALL LETTER Y] 	TokenNameCOMMENT_LINE	⒴ [PARENTHESIZED LATIN SMALL LETTER Y] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ź [LATIN CAPITAL LETTER Z WITH ACUTE] 	TokenNameCOMMENT_LINE	Ź [LATIN CAPITAL LETTER Z WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ż [LATIN CAPITAL LETTER Z WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	Ż [LATIN CAPITAL LETTER Z WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ž [LATIN CAPITAL LETTER Z WITH CARON] 	TokenNameCOMMENT_LINE	Ž [LATIN CAPITAL LETTER Z WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ƶ [LATIN CAPITAL LETTER Z WITH STROKE] 	TokenNameCOMMENT_LINE	Ƶ [LATIN CAPITAL LETTER Z WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȝ http://en.wikipedia.org/wiki/Yogh [LATIN CAPITAL LETTER YOGH] 	TokenNameCOMMENT_LINE	Ȝ http://en.wikipedia.org/wiki/Yogh [LATIN CAPITAL LETTER YOGH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ȥ [LATIN CAPITAL LETTER Z WITH HOOK] 	TokenNameCOMMENT_LINE	Ȥ [LATIN CAPITAL LETTER Z WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᴢ [LATIN LETTER SMALL CAPITAL Z] 	TokenNameCOMMENT_LINE	ᴢ [LATIN LETTER SMALL CAPITAL Z] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẑ [LATIN CAPITAL LETTER Z WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	Ẑ [LATIN CAPITAL LETTER Z WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẓ [LATIN CAPITAL LETTER Z WITH DOT BELOW] 	TokenNameCOMMENT_LINE	Ẓ [LATIN CAPITAL LETTER Z WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ẕ [LATIN CAPITAL LETTER Z WITH LINE BELOW] 	TokenNameCOMMENT_LINE	Ẕ [LATIN CAPITAL LETTER Z WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⓩ [CIRCLED LATIN CAPITAL LETTER Z] 	TokenNameCOMMENT_LINE	Ⓩ [CIRCLED LATIN CAPITAL LETTER Z] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ⱬ [LATIN CAPITAL LETTER Z WITH DESCENDER] 	TokenNameCOMMENT_LINE	Ⱬ [LATIN CAPITAL LETTER Z WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ꝣ [LATIN CAPITAL LETTER VISIGOTHIC Z] 	TokenNameCOMMENT_LINE	Ꝣ [LATIN CAPITAL LETTER VISIGOTHIC Z] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ｚ [FULLWIDTH LATIN CAPITAL LETTER Z] 	TokenNameCOMMENT_LINE	Ｚ [FULLWIDTH LATIN CAPITAL LETTER Z] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ź [LATIN SMALL LETTER Z WITH ACUTE] 	TokenNameCOMMENT_LINE	ź [LATIN SMALL LETTER Z WITH ACUTE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ż [LATIN SMALL LETTER Z WITH DOT ABOVE] 	TokenNameCOMMENT_LINE	ż [LATIN SMALL LETTER Z WITH DOT ABOVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ž [LATIN SMALL LETTER Z WITH CARON] 	TokenNameCOMMENT_LINE	ž [LATIN SMALL LETTER Z WITH CARON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ƶ [LATIN SMALL LETTER Z WITH STROKE] 	TokenNameCOMMENT_LINE	ƶ [LATIN SMALL LETTER Z WITH STROKE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȝ http://en.wikipedia.org/wiki/Yogh [LATIN SMALL LETTER YOGH] 	TokenNameCOMMENT_LINE	ȝ http://en.wikipedia.org/wiki/Yogh [LATIN SMALL LETTER YOGH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ȥ [LATIN SMALL LETTER Z WITH HOOK] 	TokenNameCOMMENT_LINE	ȥ [LATIN SMALL LETTER Z WITH HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ɀ [LATIN SMALL LETTER Z WITH SWASH TAIL] 	TokenNameCOMMENT_LINE	ɀ [LATIN SMALL LETTER Z WITH SWASH TAIL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʐ [LATIN SMALL LETTER Z WITH RETROFLEX HOOK] 	TokenNameCOMMENT_LINE	ʐ [LATIN SMALL LETTER Z WITH RETROFLEX HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ʑ [LATIN SMALL LETTER Z WITH CURL] 	TokenNameCOMMENT_LINE	ʑ [LATIN SMALL LETTER Z WITH CURL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᵶ [LATIN SMALL LETTER Z WITH MIDDLE TILDE] 	TokenNameCOMMENT_LINE	ᵶ [LATIN SMALL LETTER Z WITH MIDDLE TILDE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ᶎ [LATIN SMALL LETTER Z WITH PALATAL HOOK] 	TokenNameCOMMENT_LINE	ᶎ [LATIN SMALL LETTER Z WITH PALATAL HOOK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẑ [LATIN SMALL LETTER Z WITH CIRCUMFLEX] 	TokenNameCOMMENT_LINE	ẑ [LATIN SMALL LETTER Z WITH CIRCUMFLEX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẓ [LATIN SMALL LETTER Z WITH DOT BELOW] 	TokenNameCOMMENT_LINE	ẓ [LATIN SMALL LETTER Z WITH DOT BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ẕ [LATIN SMALL LETTER Z WITH LINE BELOW] 	TokenNameCOMMENT_LINE	ẕ [LATIN SMALL LETTER Z WITH LINE BELOW] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓩ [CIRCLED LATIN SMALL LETTER Z] 	TokenNameCOMMENT_LINE	ⓩ [CIRCLED LATIN SMALL LETTER Z] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⱬ [LATIN SMALL LETTER Z WITH DESCENDER] 	TokenNameCOMMENT_LINE	ⱬ [LATIN SMALL LETTER Z WITH DESCENDER] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ꝣ [LATIN SMALL LETTER VISIGOTHIC Z] 	TokenNameCOMMENT_LINE	ꝣ [LATIN SMALL LETTER VISIGOTHIC Z] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｚ [FULLWIDTH LATIN SMALL LETTER Z] 	TokenNameCOMMENT_LINE	ｚ [FULLWIDTH LATIN SMALL LETTER Z] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒵ [PARENTHESIZED LATIN SMALL LETTER Z] 	TokenNameCOMMENT_LINE	⒵ [PARENTHESIZED LATIN SMALL LETTER Z] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁰ [SUPERSCRIPT ZERO] 	TokenNameCOMMENT_LINE	⁰ [SUPERSCRIPT ZERO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₀ [SUBSCRIPT ZERO] 	TokenNameCOMMENT_LINE	₀ [SUBSCRIPT ZERO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓪ [CIRCLED DIGIT ZERO] 	TokenNameCOMMENT_LINE	⓪ [CIRCLED DIGIT ZERO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓿ [NEGATIVE CIRCLED DIGIT ZERO] 	TokenNameCOMMENT_LINE	⓿ [NEGATIVE CIRCLED DIGIT ZERO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ０ [FULLWIDTH DIGIT ZERO] 	TokenNameCOMMENT_LINE	０ [FULLWIDTH DIGIT ZERO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ¹ [SUPERSCRIPT ONE] 	TokenNameCOMMENT_LINE	¹ [SUPERSCRIPT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₁ [SUBSCRIPT ONE] 	TokenNameCOMMENT_LINE	₁ [SUBSCRIPT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ① [CIRCLED DIGIT ONE] 	TokenNameCOMMENT_LINE	① [CIRCLED DIGIT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓵ [DOUBLE CIRCLED DIGIT ONE] 	TokenNameCOMMENT_LINE	⓵ [DOUBLE CIRCLED DIGIT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❶ [DINGBAT NEGATIVE CIRCLED DIGIT ONE] 	TokenNameCOMMENT_LINE	❶ [DINGBAT NEGATIVE CIRCLED DIGIT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➀ [DINGBAT CIRCLED SANS-SERIF DIGIT ONE] 	TokenNameCOMMENT_LINE	➀ [DINGBAT CIRCLED SANS-SERIF DIGIT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➊ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT ONE] 	TokenNameCOMMENT_LINE	➊ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT ONE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// １ [FULLWIDTH DIGIT ONE] 	TokenNameCOMMENT_LINE	１ [FULLWIDTH DIGIT ONE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒈ [DIGIT ONE FULL STOP] 	TokenNameCOMMENT_LINE	⒈ [DIGIT ONE FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑴ [PARENTHESIZED DIGIT ONE] 	TokenNameCOMMENT_LINE	⑴ [PARENTHESIZED DIGIT ONE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ² [SUPERSCRIPT TWO] 	TokenNameCOMMENT_LINE	² [SUPERSCRIPT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₂ [SUBSCRIPT TWO] 	TokenNameCOMMENT_LINE	₂ [SUBSCRIPT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ② [CIRCLED DIGIT TWO] 	TokenNameCOMMENT_LINE	② [CIRCLED DIGIT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓶ [DOUBLE CIRCLED DIGIT TWO] 	TokenNameCOMMENT_LINE	⓶ [DOUBLE CIRCLED DIGIT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❷ [DINGBAT NEGATIVE CIRCLED DIGIT TWO] 	TokenNameCOMMENT_LINE	❷ [DINGBAT NEGATIVE CIRCLED DIGIT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➁ [DINGBAT CIRCLED SANS-SERIF DIGIT TWO] 	TokenNameCOMMENT_LINE	➁ [DINGBAT CIRCLED SANS-SERIF DIGIT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➋ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT TWO] 	TokenNameCOMMENT_LINE	➋ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT TWO] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ２ [FULLWIDTH DIGIT TWO] 	TokenNameCOMMENT_LINE	２ [FULLWIDTH DIGIT TWO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒉ [DIGIT TWO FULL STOP] 	TokenNameCOMMENT_LINE	⒉ [DIGIT TWO FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑵ [PARENTHESIZED DIGIT TWO] 	TokenNameCOMMENT_LINE	⑵ [PARENTHESIZED DIGIT TWO] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ³ [SUPERSCRIPT THREE] 	TokenNameCOMMENT_LINE	³ [SUPERSCRIPT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₃ [SUBSCRIPT THREE] 	TokenNameCOMMENT_LINE	₃ [SUBSCRIPT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ③ [CIRCLED DIGIT THREE] 	TokenNameCOMMENT_LINE	③ [CIRCLED DIGIT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓷ [DOUBLE CIRCLED DIGIT THREE] 	TokenNameCOMMENT_LINE	⓷ [DOUBLE CIRCLED DIGIT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❸ [DINGBAT NEGATIVE CIRCLED DIGIT THREE] 	TokenNameCOMMENT_LINE	❸ [DINGBAT NEGATIVE CIRCLED DIGIT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➂ [DINGBAT CIRCLED SANS-SERIF DIGIT THREE] 	TokenNameCOMMENT_LINE	➂ [DINGBAT CIRCLED SANS-SERIF DIGIT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➌ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT THREE] 	TokenNameCOMMENT_LINE	➌ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT THREE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ３ [FULLWIDTH DIGIT THREE] 	TokenNameCOMMENT_LINE	３ [FULLWIDTH DIGIT THREE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒊ [DIGIT THREE FULL STOP] 	TokenNameCOMMENT_LINE	⒊ [DIGIT THREE FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑶ [PARENTHESIZED DIGIT THREE] 	TokenNameCOMMENT_LINE	⑶ [PARENTHESIZED DIGIT THREE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁴ [SUPERSCRIPT FOUR] 	TokenNameCOMMENT_LINE	⁴ [SUPERSCRIPT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₄ [SUBSCRIPT FOUR] 	TokenNameCOMMENT_LINE	₄ [SUBSCRIPT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ④ [CIRCLED DIGIT FOUR] 	TokenNameCOMMENT_LINE	④ [CIRCLED DIGIT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓸ [DOUBLE CIRCLED DIGIT FOUR] 	TokenNameCOMMENT_LINE	⓸ [DOUBLE CIRCLED DIGIT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❹ [DINGBAT NEGATIVE CIRCLED DIGIT FOUR] 	TokenNameCOMMENT_LINE	❹ [DINGBAT NEGATIVE CIRCLED DIGIT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➃ [DINGBAT CIRCLED SANS-SERIF DIGIT FOUR] 	TokenNameCOMMENT_LINE	➃ [DINGBAT CIRCLED SANS-SERIF DIGIT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➍ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FOUR] 	TokenNameCOMMENT_LINE	➍ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FOUR] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ４ [FULLWIDTH DIGIT FOUR] 	TokenNameCOMMENT_LINE	４ [FULLWIDTH DIGIT FOUR] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒋ [DIGIT FOUR FULL STOP] 	TokenNameCOMMENT_LINE	⒋ [DIGIT FOUR FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑷ [PARENTHESIZED DIGIT FOUR] 	TokenNameCOMMENT_LINE	⑷ [PARENTHESIZED DIGIT FOUR] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁵ [SUPERSCRIPT FIVE] 	TokenNameCOMMENT_LINE	⁵ [SUPERSCRIPT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₅ [SUBSCRIPT FIVE] 	TokenNameCOMMENT_LINE	₅ [SUBSCRIPT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑤ [CIRCLED DIGIT FIVE] 	TokenNameCOMMENT_LINE	⑤ [CIRCLED DIGIT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓹ [DOUBLE CIRCLED DIGIT FIVE] 	TokenNameCOMMENT_LINE	⓹ [DOUBLE CIRCLED DIGIT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❺ [DINGBAT NEGATIVE CIRCLED DIGIT FIVE] 	TokenNameCOMMENT_LINE	❺ [DINGBAT NEGATIVE CIRCLED DIGIT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➄ [DINGBAT CIRCLED SANS-SERIF DIGIT FIVE] 	TokenNameCOMMENT_LINE	➄ [DINGBAT CIRCLED SANS-SERIF DIGIT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➎ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FIVE] 	TokenNameCOMMENT_LINE	➎ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FIVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ５ [FULLWIDTH DIGIT FIVE] 	TokenNameCOMMENT_LINE	５ [FULLWIDTH DIGIT FIVE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒌ [DIGIT FIVE FULL STOP] 	TokenNameCOMMENT_LINE	⒌ [DIGIT FIVE FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑸ [PARENTHESIZED DIGIT FIVE] 	TokenNameCOMMENT_LINE	⑸ [PARENTHESIZED DIGIT FIVE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁶ [SUPERSCRIPT SIX] 	TokenNameCOMMENT_LINE	⁶ [SUPERSCRIPT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₆ [SUBSCRIPT SIX] 	TokenNameCOMMENT_LINE	₆ [SUBSCRIPT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑥ [CIRCLED DIGIT SIX] 	TokenNameCOMMENT_LINE	⑥ [CIRCLED DIGIT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓺ [DOUBLE CIRCLED DIGIT SIX] 	TokenNameCOMMENT_LINE	⓺ [DOUBLE CIRCLED DIGIT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❻ [DINGBAT NEGATIVE CIRCLED DIGIT SIX] 	TokenNameCOMMENT_LINE	❻ [DINGBAT NEGATIVE CIRCLED DIGIT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➅ [DINGBAT CIRCLED SANS-SERIF DIGIT SIX] 	TokenNameCOMMENT_LINE	➅ [DINGBAT CIRCLED SANS-SERIF DIGIT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➏ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SIX] 	TokenNameCOMMENT_LINE	➏ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SIX] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ６ [FULLWIDTH DIGIT SIX] 	TokenNameCOMMENT_LINE	６ [FULLWIDTH DIGIT SIX] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒍ [DIGIT SIX FULL STOP] 	TokenNameCOMMENT_LINE	⒍ [DIGIT SIX FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑹ [PARENTHESIZED DIGIT SIX] 	TokenNameCOMMENT_LINE	⑹ [PARENTHESIZED DIGIT SIX] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁷ [SUPERSCRIPT SEVEN] 	TokenNameCOMMENT_LINE	⁷ [SUPERSCRIPT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₇ [SUBSCRIPT SEVEN] 	TokenNameCOMMENT_LINE	₇ [SUBSCRIPT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑦ [CIRCLED DIGIT SEVEN] 	TokenNameCOMMENT_LINE	⑦ [CIRCLED DIGIT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓻ [DOUBLE CIRCLED DIGIT SEVEN] 	TokenNameCOMMENT_LINE	⓻ [DOUBLE CIRCLED DIGIT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❼ [DINGBAT NEGATIVE CIRCLED DIGIT SEVEN] 	TokenNameCOMMENT_LINE	❼ [DINGBAT NEGATIVE CIRCLED DIGIT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➆ [DINGBAT CIRCLED SANS-SERIF DIGIT SEVEN] 	TokenNameCOMMENT_LINE	➆ [DINGBAT CIRCLED SANS-SERIF DIGIT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➐ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SEVEN] 	TokenNameCOMMENT_LINE	➐ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ７ [FULLWIDTH DIGIT SEVEN] 	TokenNameCOMMENT_LINE	７ [FULLWIDTH DIGIT SEVEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒎ [DIGIT SEVEN FULL STOP] 	TokenNameCOMMENT_LINE	⒎ [DIGIT SEVEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑺ [PARENTHESIZED DIGIT SEVEN] 	TokenNameCOMMENT_LINE	⑺ [PARENTHESIZED DIGIT SEVEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁸ [SUPERSCRIPT EIGHT] 	TokenNameCOMMENT_LINE	⁸ [SUPERSCRIPT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₈ [SUBSCRIPT EIGHT] 	TokenNameCOMMENT_LINE	₈ [SUBSCRIPT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑧ [CIRCLED DIGIT EIGHT] 	TokenNameCOMMENT_LINE	⑧ [CIRCLED DIGIT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓼ [DOUBLE CIRCLED DIGIT EIGHT] 	TokenNameCOMMENT_LINE	⓼ [DOUBLE CIRCLED DIGIT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❽ [DINGBAT NEGATIVE CIRCLED DIGIT EIGHT] 	TokenNameCOMMENT_LINE	❽ [DINGBAT NEGATIVE CIRCLED DIGIT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➇ [DINGBAT CIRCLED SANS-SERIF DIGIT EIGHT] 	TokenNameCOMMENT_LINE	➇ [DINGBAT CIRCLED SANS-SERIF DIGIT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➑ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT EIGHT] 	TokenNameCOMMENT_LINE	➑ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT EIGHT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ８ [FULLWIDTH DIGIT EIGHT] 	TokenNameCOMMENT_LINE	８ [FULLWIDTH DIGIT EIGHT] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒏ [DIGIT EIGHT FULL STOP] 	TokenNameCOMMENT_LINE	⒏ [DIGIT EIGHT FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑻ [PARENTHESIZED DIGIT EIGHT] 	TokenNameCOMMENT_LINE	⑻ [PARENTHESIZED DIGIT EIGHT] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁹ [SUPERSCRIPT NINE] 	TokenNameCOMMENT_LINE	⁹ [SUPERSCRIPT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₉ [SUBSCRIPT NINE] 	TokenNameCOMMENT_LINE	₉ [SUBSCRIPT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑨ [CIRCLED DIGIT NINE] 	TokenNameCOMMENT_LINE	⑨ [CIRCLED DIGIT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓽ [DOUBLE CIRCLED DIGIT NINE] 	TokenNameCOMMENT_LINE	⓽ [DOUBLE CIRCLED DIGIT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❾ [DINGBAT NEGATIVE CIRCLED DIGIT NINE] 	TokenNameCOMMENT_LINE	❾ [DINGBAT NEGATIVE CIRCLED DIGIT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➈ [DINGBAT CIRCLED SANS-SERIF DIGIT NINE] 	TokenNameCOMMENT_LINE	➈ [DINGBAT CIRCLED SANS-SERIF DIGIT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➒ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT NINE] 	TokenNameCOMMENT_LINE	➒ [DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT NINE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ９ [FULLWIDTH DIGIT NINE] 	TokenNameCOMMENT_LINE	９ [FULLWIDTH DIGIT NINE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒐ [DIGIT NINE FULL STOP] 	TokenNameCOMMENT_LINE	⒐ [DIGIT NINE FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑼ [PARENTHESIZED DIGIT NINE] 	TokenNameCOMMENT_LINE	⑼ [PARENTHESIZED DIGIT NINE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑩ [CIRCLED NUMBER TEN] 	TokenNameCOMMENT_LINE	⑩ [CIRCLED NUMBER TEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓾ [DOUBLE CIRCLED NUMBER TEN] 	TokenNameCOMMENT_LINE	⓾ [DOUBLE CIRCLED NUMBER TEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❿ [DINGBAT NEGATIVE CIRCLED NUMBER TEN] 	TokenNameCOMMENT_LINE	❿ [DINGBAT NEGATIVE CIRCLED NUMBER TEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➉ [DINGBAT CIRCLED SANS-SERIF NUMBER TEN] 	TokenNameCOMMENT_LINE	➉ [DINGBAT CIRCLED SANS-SERIF NUMBER TEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ➓ [DINGBAT NEGATIVE CIRCLED SANS-SERIF NUMBER TEN] 	TokenNameCOMMENT_LINE	➓ [DINGBAT NEGATIVE CIRCLED SANS-SERIF NUMBER TEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒑ [NUMBER TEN FULL STOP] 	TokenNameCOMMENT_LINE	⒑ [NUMBER TEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑽ [PARENTHESIZED NUMBER TEN] 	TokenNameCOMMENT_LINE	⑽ [PARENTHESIZED NUMBER TEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑪ [CIRCLED NUMBER ELEVEN] 	TokenNameCOMMENT_LINE	⑪ [CIRCLED NUMBER ELEVEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓫ [NEGATIVE CIRCLED NUMBER ELEVEN] 	TokenNameCOMMENT_LINE	⓫ [NEGATIVE CIRCLED NUMBER ELEVEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒒ [NUMBER ELEVEN FULL STOP] 	TokenNameCOMMENT_LINE	⒒ [NUMBER ELEVEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑾ [PARENTHESIZED NUMBER ELEVEN] 	TokenNameCOMMENT_LINE	⑾ [PARENTHESIZED NUMBER ELEVEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑫ [CIRCLED NUMBER TWELVE] 	TokenNameCOMMENT_LINE	⑫ [CIRCLED NUMBER TWELVE] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓬ [NEGATIVE CIRCLED NUMBER TWELVE] 	TokenNameCOMMENT_LINE	⓬ [NEGATIVE CIRCLED NUMBER TWELVE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒓ [NUMBER TWELVE FULL STOP] 	TokenNameCOMMENT_LINE	⒓ [NUMBER TWELVE FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑿ [PARENTHESIZED NUMBER TWELVE] 	TokenNameCOMMENT_LINE	⑿ [PARENTHESIZED NUMBER TWELVE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑬ [CIRCLED NUMBER THIRTEEN] 	TokenNameCOMMENT_LINE	⑬ [CIRCLED NUMBER THIRTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓭ [NEGATIVE CIRCLED NUMBER THIRTEEN] 	TokenNameCOMMENT_LINE	⓭ [NEGATIVE CIRCLED NUMBER THIRTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒔ [NUMBER THIRTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒔ [NUMBER THIRTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒀ [PARENTHESIZED NUMBER THIRTEEN] 	TokenNameCOMMENT_LINE	⒀ [PARENTHESIZED NUMBER THIRTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑭ [CIRCLED NUMBER FOURTEEN] 	TokenNameCOMMENT_LINE	⑭ [CIRCLED NUMBER FOURTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓮ [NEGATIVE CIRCLED NUMBER FOURTEEN] 	TokenNameCOMMENT_LINE	⓮ [NEGATIVE CIRCLED NUMBER FOURTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒕ [NUMBER FOURTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒕ [NUMBER FOURTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒁ [PARENTHESIZED NUMBER FOURTEEN] 	TokenNameCOMMENT_LINE	⒁ [PARENTHESIZED NUMBER FOURTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑮ [CIRCLED NUMBER FIFTEEN] 	TokenNameCOMMENT_LINE	⑮ [CIRCLED NUMBER FIFTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓯ [NEGATIVE CIRCLED NUMBER FIFTEEN] 	TokenNameCOMMENT_LINE	⓯ [NEGATIVE CIRCLED NUMBER FIFTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒖ [NUMBER FIFTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒖ [NUMBER FIFTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒂ [PARENTHESIZED NUMBER FIFTEEN] 	TokenNameCOMMENT_LINE	⒂ [PARENTHESIZED NUMBER FIFTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑯ [CIRCLED NUMBER SIXTEEN] 	TokenNameCOMMENT_LINE	⑯ [CIRCLED NUMBER SIXTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓰ [NEGATIVE CIRCLED NUMBER SIXTEEN] 	TokenNameCOMMENT_LINE	⓰ [NEGATIVE CIRCLED NUMBER SIXTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒗ [NUMBER SIXTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒗ [NUMBER SIXTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒃ [PARENTHESIZED NUMBER SIXTEEN] 	TokenNameCOMMENT_LINE	⒃ [PARENTHESIZED NUMBER SIXTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑰ [CIRCLED NUMBER SEVENTEEN] 	TokenNameCOMMENT_LINE	⑰ [CIRCLED NUMBER SEVENTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓱ [NEGATIVE CIRCLED NUMBER SEVENTEEN] 	TokenNameCOMMENT_LINE	⓱ [NEGATIVE CIRCLED NUMBER SEVENTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒘ [NUMBER SEVENTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒘ [NUMBER SEVENTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒄ [PARENTHESIZED NUMBER SEVENTEEN] 	TokenNameCOMMENT_LINE	⒄ [PARENTHESIZED NUMBER SEVENTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑱ [CIRCLED NUMBER EIGHTEEN] 	TokenNameCOMMENT_LINE	⑱ [CIRCLED NUMBER EIGHTEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓲ [NEGATIVE CIRCLED NUMBER EIGHTEEN] 	TokenNameCOMMENT_LINE	⓲ [NEGATIVE CIRCLED NUMBER EIGHTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒙ [NUMBER EIGHTEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒙ [NUMBER EIGHTEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒅ [PARENTHESIZED NUMBER EIGHTEEN] 	TokenNameCOMMENT_LINE	⒅ [PARENTHESIZED NUMBER EIGHTEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'8'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑲ [CIRCLED NUMBER NINETEEN] 	TokenNameCOMMENT_LINE	⑲ [CIRCLED NUMBER NINETEEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓳ [NEGATIVE CIRCLED NUMBER NINETEEN] 	TokenNameCOMMENT_LINE	⓳ [NEGATIVE CIRCLED NUMBER NINETEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒚ [NUMBER NINETEEN FULL STOP] 	TokenNameCOMMENT_LINE	⒚ [NUMBER NINETEEN FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒆ [PARENTHESIZED NUMBER NINETEEN] 	TokenNameCOMMENT_LINE	⒆ [PARENTHESIZED NUMBER NINETEEN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⑳ [CIRCLED NUMBER TWENTY] 	TokenNameCOMMENT_LINE	⑳ [CIRCLED NUMBER TWENTY] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⓴ [NEGATIVE CIRCLED NUMBER TWENTY] 	TokenNameCOMMENT_LINE	⓴ [NEGATIVE CIRCLED NUMBER TWENTY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒛ [NUMBER TWENTY FULL STOP] 	TokenNameCOMMENT_LINE	⒛ [NUMBER TWENTY FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⒇ [PARENTHESIZED NUMBER TWENTY] 	TokenNameCOMMENT_LINE	⒇ [PARENTHESIZED NUMBER TWENTY] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// « [LEFT-POINTING DOUBLE ANGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	« [LEFT-POINTING DOUBLE ANGLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// » [RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	» [RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// “ [LEFT DOUBLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	“ [LEFT DOUBLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ” [RIGHT DOUBLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	” [RIGHT DOUBLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// „ [DOUBLE LOW-9 QUOTATION MARK] 	TokenNameCOMMENT_LINE	„ [DOUBLE LOW-9 QUOTATION MARK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ″ [DOUBLE PRIME] 	TokenNameCOMMENT_LINE	″ [DOUBLE PRIME] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‶ [REVERSED DOUBLE PRIME] 	TokenNameCOMMENT_LINE	‶ [REVERSED DOUBLE PRIME] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❝ [HEAVY DOUBLE TURNED COMMA QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❝ [HEAVY DOUBLE TURNED COMMA QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❞ [HEAVY DOUBLE COMMA QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❞ [HEAVY DOUBLE COMMA QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❮ [HEAVY LEFT-POINTING ANGLE QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❮ [HEAVY LEFT-POINTING ANGLE QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❯ [HEAVY RIGHT-POINTING ANGLE QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❯ [HEAVY RIGHT-POINTING ANGLE QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＂ [FULLWIDTH QUOTATION MARK] 	TokenNameCOMMENT_LINE	＂ [FULLWIDTH QUOTATION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‘ [LEFT SINGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	‘ [LEFT SINGLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ’ [RIGHT SINGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	’ [RIGHT SINGLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‚ [SINGLE LOW-9 QUOTATION MARK] 	TokenNameCOMMENT_LINE	‚ [SINGLE LOW-9 QUOTATION MARK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‛ [SINGLE HIGH-REVERSED-9 QUOTATION MARK] 	TokenNameCOMMENT_LINE	‛ [SINGLE HIGH-REVERSED-9 QUOTATION MARK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ′ [PRIME] 	TokenNameCOMMENT_LINE	′ [PRIME] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‵ [REVERSED PRIME] 	TokenNameCOMMENT_LINE	‵ [REVERSED PRIME] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‹ [SINGLE LEFT-POINTING ANGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	‹ [SINGLE LEFT-POINTING ANGLE QUOTATION MARK] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// › [SINGLE RIGHT-POINTING ANGLE QUOTATION MARK] 	TokenNameCOMMENT_LINE	› [SINGLE RIGHT-POINTING ANGLE QUOTATION MARK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❛ [HEAVY SINGLE TURNED COMMA QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❛ [HEAVY SINGLE TURNED COMMA QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❜ [HEAVY SINGLE COMMA QUOTATION MARK ORNAMENT] 	TokenNameCOMMENT_LINE	❜ [HEAVY SINGLE COMMA QUOTATION MARK ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＇ [FULLWIDTH APOSTROPHE] 	TokenNameCOMMENT_LINE	＇ [FULLWIDTH APOSTROPHE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‐ [HYPHEN] 	TokenNameCOMMENT_LINE	‐ [HYPHEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‑ [NON-BREAKING HYPHEN] 	TokenNameCOMMENT_LINE	‑ [NON-BREAKING HYPHEN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‒ [FIGURE DASH] 	TokenNameCOMMENT_LINE	‒ [FIGURE DASH] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// – [EN DASH] 	TokenNameCOMMENT_LINE	– [EN DASH] 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// — [EM DASH] 	TokenNameCOMMENT_LINE	— [EM DASH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁻ [SUPERSCRIPT MINUS] 	TokenNameCOMMENT_LINE	⁻ [SUPERSCRIPT MINUS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₋ [SUBSCRIPT MINUS] 	TokenNameCOMMENT_LINE	₋ [SUBSCRIPT MINUS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// － [FULLWIDTH HYPHEN-MINUS] 	TokenNameCOMMENT_LINE	－ [FULLWIDTH HYPHEN-MINUS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁅ [LEFT SQUARE BRACKET WITH QUILL] 	TokenNameCOMMENT_LINE	⁅ [LEFT SQUARE BRACKET WITH QUILL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❲ [LIGHT LEFT TORTOISE SHELL BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❲ [LIGHT LEFT TORTOISE SHELL BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ［ [FULLWIDTH LEFT SQUARE BRACKET] 	TokenNameCOMMENT_LINE	［ [FULLWIDTH LEFT SQUARE BRACKET] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'['	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁆ [RIGHT SQUARE BRACKET WITH QUILL] 	TokenNameCOMMENT_LINE	⁆ [RIGHT SQUARE BRACKET WITH QUILL] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❳ [LIGHT RIGHT TORTOISE SHELL BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❳ [LIGHT RIGHT TORTOISE SHELL BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ］ [FULLWIDTH RIGHT SQUARE BRACKET] 	TokenNameCOMMENT_LINE	］ [FULLWIDTH RIGHT SQUARE BRACKET] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
']'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁽ [SUPERSCRIPT LEFT PARENTHESIS] 	TokenNameCOMMENT_LINE	⁽ [SUPERSCRIPT LEFT PARENTHESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₍ [SUBSCRIPT LEFT PARENTHESIS] 	TokenNameCOMMENT_LINE	₍ [SUBSCRIPT LEFT PARENTHESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❨ [MEDIUM LEFT PARENTHESIS ORNAMENT] 	TokenNameCOMMENT_LINE	❨ [MEDIUM LEFT PARENTHESIS ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❪ [MEDIUM FLATTENED LEFT PARENTHESIS ORNAMENT] 	TokenNameCOMMENT_LINE	❪ [MEDIUM FLATTENED LEFT PARENTHESIS ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// （ [FULLWIDTH LEFT PARENTHESIS] 	TokenNameCOMMENT_LINE	（ [FULLWIDTH LEFT PARENTHESIS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⸨ [LEFT DOUBLE PARENTHESIS] 	TokenNameCOMMENT_LINE	⸨ [LEFT DOUBLE PARENTHESIS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'('	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁾ [SUPERSCRIPT RIGHT PARENTHESIS] 	TokenNameCOMMENT_LINE	⁾ [SUPERSCRIPT RIGHT PARENTHESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₎ [SUBSCRIPT RIGHT PARENTHESIS] 	TokenNameCOMMENT_LINE	₎ [SUBSCRIPT RIGHT PARENTHESIS] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❩ [MEDIUM RIGHT PARENTHESIS ORNAMENT] 	TokenNameCOMMENT_LINE	❩ [MEDIUM RIGHT PARENTHESIS ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❫ [MEDIUM FLATTENED RIGHT PARENTHESIS ORNAMENT] 	TokenNameCOMMENT_LINE	❫ [MEDIUM FLATTENED RIGHT PARENTHESIS ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ） [FULLWIDTH RIGHT PARENTHESIS] 	TokenNameCOMMENT_LINE	） [FULLWIDTH RIGHT PARENTHESIS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⸩ [RIGHT DOUBLE PARENTHESIS] 	TokenNameCOMMENT_LINE	⸩ [RIGHT DOUBLE PARENTHESIS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❬ [MEDIUM LEFT-POINTING ANGLE BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❬ [MEDIUM LEFT-POINTING ANGLE BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❰ [HEAVY LEFT-POINTING ANGLE BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❰ [HEAVY LEFT-POINTING ANGLE BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＜ [FULLWIDTH LESS-THAN SIGN] 	TokenNameCOMMENT_LINE	＜ [FULLWIDTH LESS-THAN SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'<'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❭ [MEDIUM RIGHT-POINTING ANGLE BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❭ [MEDIUM RIGHT-POINTING ANGLE BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❱ [HEAVY RIGHT-POINTING ANGLE BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❱ [HEAVY RIGHT-POINTING ANGLE BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＞ [FULLWIDTH GREATER-THAN SIGN] 	TokenNameCOMMENT_LINE	＞ [FULLWIDTH GREATER-THAN SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'>'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❴ [MEDIUM LEFT CURLY BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❴ [MEDIUM LEFT CURLY BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｛ [FULLWIDTH LEFT CURLY BRACKET] 	TokenNameCOMMENT_LINE	｛ [FULLWIDTH LEFT CURLY BRACKET] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'{'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ❵ [MEDIUM RIGHT CURLY BRACKET ORNAMENT] 	TokenNameCOMMENT_LINE	❵ [MEDIUM RIGHT CURLY BRACKET ORNAMENT] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ｝ [FULLWIDTH RIGHT CURLY BRACKET] 	TokenNameCOMMENT_LINE	｝ [FULLWIDTH RIGHT CURLY BRACKET] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁺ [SUPERSCRIPT PLUS SIGN] 	TokenNameCOMMENT_LINE	⁺ [SUPERSCRIPT PLUS SIGN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₊ [SUBSCRIPT PLUS SIGN] 	TokenNameCOMMENT_LINE	₊ [SUBSCRIPT PLUS SIGN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＋ [FULLWIDTH PLUS SIGN] 	TokenNameCOMMENT_LINE	＋ [FULLWIDTH PLUS SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁼ [SUPERSCRIPT EQUALS SIGN] 	TokenNameCOMMENT_LINE	⁼ [SUPERSCRIPT EQUALS SIGN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ₌ [SUBSCRIPT EQUALS SIGN] 	TokenNameCOMMENT_LINE	₌ [SUBSCRIPT EQUALS SIGN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＝ [FULLWIDTH EQUALS SIGN] 	TokenNameCOMMENT_LINE	＝ [FULLWIDTH EQUALS SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'='	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ！ [FULLWIDTH EXCLAMATION MARK] 	TokenNameCOMMENT_LINE	！ [FULLWIDTH EXCLAMATION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'!'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‼ [DOUBLE EXCLAMATION MARK] 	TokenNameCOMMENT_LINE	‼ [DOUBLE EXCLAMATION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'!'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'!'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁉ [EXCLAMATION QUESTION MARK] 	TokenNameCOMMENT_LINE	⁉ [EXCLAMATION QUESTION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'!'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＃ [FULLWIDTH NUMBER SIGN] 	TokenNameCOMMENT_LINE	＃ [FULLWIDTH NUMBER SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'#'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＄ [FULLWIDTH DOLLAR SIGN] 	TokenNameCOMMENT_LINE	＄ [FULLWIDTH DOLLAR SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'$'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁒ [COMMERCIAL MINUS SIGN] 	TokenNameCOMMENT_LINE	⁒ [COMMERCIAL MINUS SIGN] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ％ [FULLWIDTH PERCENT SIGN] 	TokenNameCOMMENT_LINE	％ [FULLWIDTH PERCENT SIGN] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'%'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＆ [FULLWIDTH AMPERSAND] 	TokenNameCOMMENT_LINE	＆ [FULLWIDTH AMPERSAND] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'&'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁎ [LOW ASTERISK] 	TokenNameCOMMENT_LINE	⁎ [LOW ASTERISK] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＊ [FULLWIDTH ASTERISK] 	TokenNameCOMMENT_LINE	＊ [FULLWIDTH ASTERISK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'*'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ， [FULLWIDTH COMMA] 	TokenNameCOMMENT_LINE	， [FULLWIDTH COMMA] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
','	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ． [FULLWIDTH FULL STOP] 	TokenNameCOMMENT_LINE	． [FULLWIDTH FULL STOP] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁄ [FRACTION SLASH] 	TokenNameCOMMENT_LINE	⁄ [FRACTION SLASH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ／ [FULLWIDTH SOLIDUS] 	TokenNameCOMMENT_LINE	／ [FULLWIDTH SOLIDUS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ： [FULLWIDTH COLON] 	TokenNameCOMMENT_LINE	： [FULLWIDTH COLON] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
':'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁏ [REVERSED SEMICOLON] 	TokenNameCOMMENT_LINE	⁏ [REVERSED SEMICOLON] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ； [FULLWIDTH SEMICOLON] 	TokenNameCOMMENT_LINE	； [FULLWIDTH SEMICOLON] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
';'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ？ [FULLWIDTH QUESTION MARK] 	TokenNameCOMMENT_LINE	？ [FULLWIDTH QUESTION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁇ [DOUBLE QUESTION MARK] 	TokenNameCOMMENT_LINE	⁇ [DOUBLE QUESTION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁈ [QUESTION EXCLAMATION MARK] 	TokenNameCOMMENT_LINE	⁈ [QUESTION EXCLAMATION MARK] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'!'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＠ [FULLWIDTH COMMERCIAL AT] 	TokenNameCOMMENT_LINE	＠ [FULLWIDTH COMMERCIAL AT] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'@'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＼ [FULLWIDTH REVERSE SOLIDUS] 	TokenNameCOMMENT_LINE	＼ [FULLWIDTH REVERSE SOLIDUS] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\\'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ‸ [CARET] 	TokenNameCOMMENT_LINE	‸ [CARET] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＾ [FULLWIDTH CIRCUMFLEX ACCENT] 	TokenNameCOMMENT_LINE	＾ [FULLWIDTH CIRCUMFLEX ACCENT] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'^'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ＿ [FULLWIDTH LOW LINE] 	TokenNameCOMMENT_LINE	＿ [FULLWIDTH LOW LINE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'_'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ⁓ [SWUNG DASH] 	TokenNameCOMMENT_LINE	⁓ [SWUNG DASH] 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ～ [FULLWIDTH TILDE] 	TokenNameCOMMENT_LINE	～ [FULLWIDTH TILDE] 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'~'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
outputPos	TokenNameIdentifier	 output Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
