/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NumeratorFormatter.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NumeratorFormatter.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Converts enumerated numbers into strings, using the XSL conversion attributes. * Having this in a class helps avoid being forced to extract the attributes repeatedly. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Converts enumerated numbers into strings, using the XSL conversion attributes. Having this in a class helps avoid being forced to extract the attributes repeatedly. @xsl.usage internal 
class	TokenNameclass	
NumeratorFormatter	TokenNameIdentifier	 Numerator Formatter
{	TokenNameLBRACE	
/** The owning xsl:number element. */	TokenNameCOMMENT_JAVADOC	 The owning xsl:number element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
m_xslNumberElement	TokenNameIdentifier	 m xsl Number Element
;	TokenNameSEMICOLON	
/** An instance of a Tokenizer */	TokenNameCOMMENT_JAVADOC	 An instance of a Tokenizer 
NumberFormatStringTokenizer	TokenNameIdentifier	 Number Format String Tokenizer
m_formatTokenizer	TokenNameIdentifier	 m format Tokenizer
;	TokenNameSEMICOLON	
/** Locale we need to format in */	TokenNameCOMMENT_JAVADOC	 Locale we need to format in 
Locale	TokenNameIdentifier	 Locale
m_locale	TokenNameIdentifier	 m locale
;	TokenNameSEMICOLON	
/** An instance of a NumberFormat */	TokenNameCOMMENT_JAVADOC	 An instance of a NumberFormat 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
m_formatter	TokenNameIdentifier	 m formatter
;	TokenNameSEMICOLON	
/** An instance of a transformer */	TokenNameCOMMENT_JAVADOC	 An instance of a transformer 
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_processor	TokenNameIdentifier	 m processor
;	TokenNameSEMICOLON	
/** * Table to help in converting decimals to roman numerals. * @see org.apache.xalan.transformer.DecimalToRoman */	TokenNameCOMMENT_JAVADOC	 Table to help in converting decimals to roman numerals. @see org.apache.xalan.transformer.DecimalToRoman 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
900	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"CM"	TokenNameStringLiteral	CM
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"CD"	TokenNameStringLiteral	CD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
90L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"XC"	TokenNameStringLiteral	XC
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
50L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
40L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"XL"	TokenNameStringLiteral	XL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
10L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"IX"	TokenNameStringLiteral	IX
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"V"	TokenNameStringLiteral	V
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"IV"	TokenNameStringLiteral	IV
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
"I"	TokenNameStringLiteral	I
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Chars for converting integers into alpha counts. * @see TransformerImpl#int2alphaCount */	TokenNameCOMMENT_JAVADOC	 Chars for converting integers into alpha counts. @see TransformerImpl#int2alphaCount 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_alphaCountTable	TokenNameIdentifier	 m alpha Count Table
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// z for zero 	TokenNameCOMMENT_LINE	z for zero 
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'E'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'G'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'H'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'I'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'J'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'K'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'N'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'O'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'P'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Q'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'R'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'S'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'T'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'U'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'V'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'W'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'X'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Y'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Construct a NumeratorFormatter using an element * that contains XSL number conversion attributes - * format, letter-value, xml:lang, digit-group-sep, * n-digits-per-group, and sequence-src. * * @param xslNumberElement The given xsl:number element * @param processor a non-null transformer instance */	TokenNameCOMMENT_JAVADOC	 Construct a NumeratorFormatter using an element that contains XSL number conversion attributes - format, letter-value, xml:lang, digit-group-sep, n-digits-per-group, and sequence-src. * @param xslNumberElement The given xsl:number element @param processor a non-null transformer instance 
NumeratorFormatter	TokenNameIdentifier	 Numerator Formatter
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
xslNumberElement	TokenNameIdentifier	 xsl Number Element
,	TokenNameCOMMA	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xslNumberElement	TokenNameIdentifier	 m xsl Number Element
=	TokenNameEQUAL	
xslNumberElement	TokenNameIdentifier	 xsl Number Element
;	TokenNameSEMICOLON	
m_processor	TokenNameIdentifier	 m processor
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end NumeratorFormatter(Element) constructor 	TokenNameCOMMENT_LINE	end NumeratorFormatter(Element) constructor 
/** * Convert a long integer into alphabetic counting, in other words * count using the sequence A B C ... Z AA AB AC.... etc. * * @param val Value to convert -- must be greater than zero. * @param table a table containing one character for each digit in the radix * @return String representing alpha count of number. * @see org.apache.xalan.transformer.DecimalToRoman * * Note that the radix of the conversion is inferred from the size * of the table. */	TokenNameCOMMENT_JAVADOC	 Convert a long integer into alphabetic counting, in other words count using the sequence A B C ... Z AA AB AC.... etc. * @param val Value to convert -- must be greater than zero. @param table a table containing one character for each digit in the radix @return String representing alpha count of number. @see org.apache.xalan.transformer.DecimalToRoman * Note that the radix of the conversion is inferred from the size of the table. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
int2alphaCount	TokenNameIdentifier	 int2alpha Count
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
radix	TokenNameIdentifier	 radix
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// Create a buffer to hold the result 	TokenNameCOMMENT_LINE	Create a buffer to hold the result 
// TODO: size of the table can be detereined by computing 	TokenNameCOMMENT_LINE	TODO: size of the table can be detereined by computing 
// logs of the radix. For now, we fake it. 	TokenNameCOMMENT_LINE	logs of the radix. For now, we fake it. 
char	TokenNamechar	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// next character to set in the buffer 	TokenNameCOMMENT_LINE	next character to set in the buffer 
int	TokenNameint	
charPos	TokenNameIdentifier	 char Pos
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// work backward through buf[] 	TokenNameCOMMENT_LINE	work backward through buf[] 
// index in table of the last character that we stored 	TokenNameCOMMENT_LINE	index in table of the last character that we stored 
int	TokenNameint	
lookupIndex	TokenNameIdentifier	 lookup Index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// start off with anything other than zero to make correction work 	TokenNameCOMMENT_LINE	start off with anything other than zero to make correction work 
// Correction number 	TokenNameCOMMENT_LINE	Correction number 
// 	TokenNameCOMMENT_LINE	 
// Correction can take on exactly two values: 	TokenNameCOMMENT_LINE	Correction can take on exactly two values: 
// 	TokenNameCOMMENT_LINE	 
// 0 if the next character is to be emitted is usual 	TokenNameCOMMENT_LINE	0 if the next character is to be emitted is usual 
// 	TokenNameCOMMENT_LINE	 
// radix - 1 	TokenNameCOMMENT_LINE	radix - 1 
// if the next char to be emitted should be one less than 	TokenNameCOMMENT_LINE	if the next char to be emitted should be one less than 
// you would expect 	TokenNameCOMMENT_LINE	you would expect 
// 	TokenNameCOMMENT_LINE	 
// For example, consider radix 10, where 1="A" and 10="J" 	TokenNameCOMMENT_LINE	For example, consider radix 10, where 1="A" and 10="J" 
// 	TokenNameCOMMENT_LINE	 
// In this scheme, we count: A, B, C ... H, I, J (not A0 and certainly 	TokenNameCOMMENT_LINE	In this scheme, we count: A, B, C ... H, I, J (not A0 and certainly 
// not AJ), A1 	TokenNameCOMMENT_LINE	not AJ), A1 
// 	TokenNameCOMMENT_LINE	 
// So, how do we keep from emitting AJ for 10? After correctly emitting the 	TokenNameCOMMENT_LINE	So, how do we keep from emitting AJ for 10? After correctly emitting the 
// J, lookupIndex is zero. We now compute a correction number of 9 (radix-1). 	TokenNameCOMMENT_LINE	J, lookupIndex is zero. We now compute a correction number of 9 (radix-1). 
// In the following line, we'll compute (val+correction) % radix, which is, 	TokenNameCOMMENT_LINE	In the following line, we'll compute (val+correction) % radix, which is, 
// (val+9)/10. By this time, val is 1, so we compute (1+9) % 10, which 	TokenNameCOMMENT_LINE	(val+9)/10. By this time, val is 1, so we compute (1+9) % 10, which 
// is 10 % 10 or zero. So, we'll prepare to emit "JJ", but then we'll 	TokenNameCOMMENT_LINE	is 10 % 10 or zero. So, we'll prepare to emit "JJ", but then we'll 
// later suppress the leading J as representing zero (in the mod system, 	TokenNameCOMMENT_LINE	later suppress the leading J as representing zero (in the mod system, 
// it can represent either 10 or zero). In summary, the correction value of 	TokenNameCOMMENT_LINE	it can represent either 10 or zero). In summary, the correction value of 
// "radix-1" acts like "-1" when run through the mod operator, but with the 	TokenNameCOMMENT_LINE	"radix-1" acts like "-1" when run through the mod operator, but with the 
// desireable characteristic that it never produces a negative number. 	TokenNameCOMMENT_LINE	desireable characteristic that it never produces a negative number. 
int	TokenNameint	
correction	TokenNameIdentifier	 correction
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: throw error on out of range input 	TokenNameCOMMENT_LINE	TODO: throw error on out of range input 
do	TokenNamedo	
{	TokenNameLBRACE	
// most of the correction calculation is explained above, the reason for the 	TokenNameCOMMENT_LINE	most of the correction calculation is explained above, the reason for the 
// term after the "|| " is that it correctly propagates carries across 	TokenNameCOMMENT_LINE	term after the "|| " is that it correctly propagates carries across 
// multiple columns. 	TokenNameCOMMENT_LINE	multiple columns. 
correction	TokenNameIdentifier	 correction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lookupIndex	TokenNameIdentifier	 lookup Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
correction	TokenNameIdentifier	 correction
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lookupIndex	TokenNameIdentifier	 lookup Index
==	TokenNameEQUAL_EQUAL	
radix	TokenNameIdentifier	 radix
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
radix	TokenNameIdentifier	 radix
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index in "table" of the next char to emit 	TokenNameCOMMENT_LINE	index in "table" of the next char to emit 
lookupIndex	TokenNameIdentifier	 lookup Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
correction	TokenNameIdentifier	 correction
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
// shift input by one "column" 	TokenNameCOMMENT_LINE	shift input by one "column" 
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
/	TokenNameDIVIDE	
radix	TokenNameIdentifier	 radix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the next value we'd put out would be a leading zero, we're done. 	TokenNameCOMMENT_LINE	if the next value we'd put out would be a leading zero, we're done. 
if	TokenNameif	
(	TokenNameLPAREN	
lookupIndex	TokenNameIdentifier	 lookup Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// put out the next character of output 	TokenNameCOMMENT_LINE	put out the next character of output 
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
charPos	TokenNameIdentifier	 char Pos
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
lookupIndex	TokenNameIdentifier	 lookup Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
charPos	TokenNameIdentifier	 char Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
charPos	TokenNameIdentifier	 char Pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a long integer into roman numerals. * @param val Value to convert. * @param prefixesAreOK true_ to enable prefix notation (e.g. 4 = "IV"), * false_ to disable prefix notation (e.g. 4 = "IIII"). * @return Roman numeral string. * @see DecimalToRoman * @see m_romanConvertTable */	TokenNameCOMMENT_JAVADOC	 Convert a long integer into roman numerals. @param val Value to convert. @param prefixesAreOK true_ to enable prefix notation (e.g. 4 = "IV"), false_ to disable prefix notation (e.g. 4 = "IIII"). @return Roman numeral string. @see DecimalToRoman @see m_romanConvertTable 
String	TokenNameIdentifier	 String
long2roman	TokenNameIdentifier	 long2roman
(	TokenNameLPAREN	
long	TokenNamelong	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prefixesAreOK	TokenNameIdentifier	 prefixes Are OK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#E("	TokenNameStringLiteral	#E(
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
roman	TokenNameIdentifier	 roman
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<=	TokenNameLESS_EQUAL	
3999L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>=	TokenNameGREATER_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_postValue	TokenNameIdentifier	 m post Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
roman	TokenNameIdentifier	 roman
+=	TokenNamePLUS_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_postLetter	TokenNameIdentifier	 m post Letter
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
-=	TokenNameMINUS_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_postValue	TokenNameIdentifier	 m post Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixesAreOK	TokenNameIdentifier	 prefixes Are OK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>=	TokenNameGREATER_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_preValue	TokenNameIdentifier	 m pre Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
roman	TokenNameIdentifier	 roman
+=	TokenNamePLUS_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_preLetter	TokenNameIdentifier	 m pre Letter
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
-=	TokenNameMINUS_EQUAL	
m_romanConvertTable	TokenNameIdentifier	 m roman Convert Table
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_preValue	TokenNameIdentifier	 m pre Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
place	TokenNameIdentifier	 place
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
roman	TokenNameIdentifier	 roman
=	TokenNameEQUAL	
"#error"	TokenNameStringLiteral	#error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
roman	TokenNameIdentifier	 roman
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end long2roman 	TokenNameCOMMENT_LINE	end long2roman 
/** * This class returns tokens using non-alphanumberic * characters as delimiters. */	TokenNameCOMMENT_JAVADOC	 This class returns tokens using non-alphanumberic characters as delimiters. 
class	TokenNameclass	
NumberFormatStringTokenizer	TokenNameIdentifier	 Number Format String Tokenizer
{	TokenNameLBRACE	
/** Field holding the current position in the string */	TokenNameCOMMENT_JAVADOC	 Field holding the current position in the string 
private	TokenNameprivate	
int	TokenNameint	
currentPosition	TokenNameIdentifier	 current Position
;	TokenNameSEMICOLON	
/** The total length of the string */	TokenNameCOMMENT_JAVADOC	 The total length of the string 
private	TokenNameprivate	
int	TokenNameint	
maxPosition	TokenNameIdentifier	 max Position
;	TokenNameSEMICOLON	
/** The string to tokenize */	TokenNameCOMMENT_JAVADOC	 The string to tokenize 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
/** * Construct a NumberFormatStringTokenizer. * * @param str The string to tokenize */	TokenNameCOMMENT_JAVADOC	 Construct a NumberFormatStringTokenizer. * @param str The string to tokenize 
NumberFormatStringTokenizer	TokenNameIdentifier	 Number Format String Tokenizer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
maxPosition	TokenNameIdentifier	 max Position
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset tokenizer so that nextToken() starts from the beginning. * */	TokenNameCOMMENT_JAVADOC	 Reset tokenizer so that nextToken() starts from the beginning. 
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next token from this string tokenizer. * * @return the next token from this string tokenizer. * @throws NoSuchElementException if there are no more tokens in this * tokenizer's string. */	TokenNameCOMMENT_JAVADOC	 Returns the next token from this string tokenizer. * @return the next token from this string tokenizer. @throws NoSuchElementException if there are no more tokens in this tokenizer's string. 
String	TokenNameIdentifier	 String
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentPosition	TokenNameIdentifier	 current Position
>=	TokenNameGREATER_EQUAL	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
currentPosition	TokenNameIdentifier	 current Position
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentPosition	TokenNameIdentifier	 current Position
<	TokenNameLESS	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentPosition	TokenNameIdentifier	 current Position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
currentPosition	TokenNameIdentifier	 current Position
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentPosition	TokenNameIdentifier	 current Position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
currentPosition	TokenNameIdentifier	 current Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if <code>nextToken</code> will throw an exception * if it is called. * * @return true if <code>nextToken</code> can be called * without throwing an exception. */	TokenNameCOMMENT_JAVADOC	 Tells if <code>nextToken</code> will throw an exception if it is called. * @return true if <code>nextToken</code> can be called without throwing an exception. 
boolean	TokenNameboolean	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
currentPosition	TokenNameIdentifier	 current Position
>=	TokenNameGREATER_EQUAL	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the number of times that this tokenizer's * <code>nextToken</code> method can be called before it generates an * exception. * * @return the number of tokens remaining in the string using the current * delimiter set. * @see java.util.StringTokenizer#nextToken() */	TokenNameCOMMENT_JAVADOC	 Calculates the number of times that this tokenizer's <code>nextToken</code> method can be called before it generates an exception. * @return the number of tokens remaining in the string using the current delimiter set. @see java.util.StringTokenizer#nextToken() 
int	TokenNameint	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
currpos	TokenNameIdentifier	 currpos
=	TokenNameEQUAL	
currentPosition	TokenNameIdentifier	 current Position
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currpos	TokenNameIdentifier	 currpos
<	TokenNameLESS	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
currpos	TokenNameIdentifier	 currpos
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currpos	TokenNameIdentifier	 currpos
<	TokenNameLESS	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currpos	TokenNameIdentifier	 currpos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currpos	TokenNameIdentifier	 currpos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
currpos	TokenNameIdentifier	 currpos
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currpos	TokenNameIdentifier	 currpos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currpos	TokenNameIdentifier	 currpos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end NumberFormatStringTokenizer 	TokenNameCOMMENT_LINE	end NumberFormatStringTokenizer 
}	TokenNameRBRACE	
