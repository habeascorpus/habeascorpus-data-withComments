package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * This is a helper class to generate prefix-encoded representations for numerical values * and supplies converters to represent float/double values as sortable integers/longs. * * <p>To quickly execute range queries in Apache Lucene, a range is divided recursively * into multiple intervals for searching: The center of the range is searched only with * the lowest possible precision in the trie, while the boundaries are matched * more exactly. This reduces the number of terms dramatically. * * <p>This class generates terms to achieve this: First the numerical integer values need to * be converted to strings. For that integer values (32 bit or 64 bit) are made unsigned * and the bits are converted to ASCII chars with each 7 bit. The resulting string is * sortable like the original integer value. Each value is also prefixed * (in the first char) by the <code>shift</code> value (number of bits removed) used * during encoding. * * <p>To also index floating point numbers, this class supplies two methods to convert them * to integer values by changing their bit layout: {@link #doubleToSortableLong}, * {@link #floatToSortableInt}. You will have no precision loss by * converting floating point numbers to integers and back (only that the integer form * is not usable). Other data types like dates can easily converted to longs or ints (e.g. * date to long: {@link java.util.Date#getTime}). * * <p>For easy usage, the trie algorithm is implemented for indexing inside * {@link NumericTokenStream} that can index <code>int</code>, <code>long</code>, * <code>float</code>, and <code>double</code>. For querying, * {@link NumericRangeQuery} and {@link NumericRangeFilter} implement the query part * for the same data types. * * <p>This class can also be used, to generate lexicographically sortable (according * {@link String#compareTo(String)}) representations of numeric data types for other * usages (e.g. sorting). * * @lucene.internal * * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 This is a helper class to generate prefix-encoded representations for numerical values and supplies converters to represent float/double values as sortable integers/longs. * <p>To quickly execute range queries in Apache Lucene, a range is divided recursively into multiple intervals for searching: The center of the range is searched only with the lowest possible precision in the trie, while the boundaries are matched more exactly. This reduces the number of terms dramatically. * <p>This class generates terms to achieve this: First the numerical integer values need to be converted to strings. For that integer values (32 bit or 64 bit) are made unsigned and the bits are converted to ASCII chars with each 7 bit. The resulting string is sortable like the original integer value. Each value is also prefixed (in the first char) by the <code>shift</code> value (number of bits removed) used during encoding. * <p>To also index floating point numbers, this class supplies two methods to convert them to integer values by changing their bit layout: {@link #doubleToSortableLong}, {@link #floatToSortableInt}. You will have no precision loss by converting floating point numbers to integers and back (only that the integer form is not usable). Other data types like dates can easily converted to longs or ints (e.g. date to long: {@link java.util.Date#getTime}). * <p>For easy usage, the trie algorithm is implemented for indexing inside {@link NumericTokenStream} that can index <code>int</code>, <code>long</code>, <code>float</code>, and <code>double</code>. For querying, {@link NumericRangeQuery} and {@link NumericRangeFilter} implement the query part for the same data types. * <p>This class can also be used, to generate lexicographically sortable (according {@link String#compareTo(String)}) representations of numeric data types for other usages (e.g. sorting). * @lucene.internal * @since 2.9 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NumericUtils	TokenNameIdentifier	 Numeric Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
NumericUtils	TokenNameIdentifier	 Numeric Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance! 	TokenNameCOMMENT_LINE	no instance! 
/** * The default precision step used by {@link NumericField}, {@link NumericTokenStream}, * {@link NumericRangeQuery}, and {@link NumericRangeFilter} as default */	TokenNameCOMMENT_JAVADOC	 The default precision step used by {@link NumericField}, {@link NumericTokenStream}, {@link NumericRangeQuery}, and {@link NumericRangeFilter} as default 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expert: Longs are stored at lower precision by shifting off lower bits. The shift count is * stored as <code>SHIFT_START_LONG+shift</code> in the first character */	TokenNameCOMMENT_JAVADOC	 Expert: Longs are stored at lower precision by shifting off lower bits. The shift count is stored as <code>SHIFT_START_LONG+shift</code> in the first character 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SHIFT_START_LONG	TokenNameIdentifier	 SHIFT  START  LONG
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expert: The maximum term length (used for <code>char[]</code> buffer size) * for encoding <code>long</code> values. * @see #longToPrefixCoded(long,int,char[]) */	TokenNameCOMMENT_JAVADOC	 Expert: The maximum term length (used for <code>char[]</code> buffer size) for encoding <code>long</code> values. @see #longToPrefixCoded(long,int,char[]) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUF_SIZE_LONG	TokenNameIdentifier	 BUF  SIZE  LONG
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
7	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expert: Integers are stored at lower precision by shifting off lower bits. The shift count is * stored as <code>SHIFT_START_INT+shift</code> in the first character */	TokenNameCOMMENT_JAVADOC	 Expert: Integers are stored at lower precision by shifting off lower bits. The shift count is stored as <code>SHIFT_START_INT+shift</code> in the first character 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SHIFT_START_INT	TokenNameIdentifier	 SHIFT  START  INT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
0x60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expert: The maximum term length (used for <code>char[]</code> buffer size) * for encoding <code>int</code> values. * @see #intToPrefixCoded(int,int,char[]) */	TokenNameCOMMENT_JAVADOC	 Expert: The maximum term length (used for <code>char[]</code> buffer size) for encoding <code>int</code> values. @see #intToPrefixCoded(int,int,char[]) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUF_SIZE_INT	TokenNameIdentifier	 BUF  SIZE  INT
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
7	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. * This is method is used by {@link NumericTokenStream}. * @param val the numeric value * @param shift how many bits to strip from the right * @param buffer that will contain the encoded chars, must be at least of {@link #BUF_SIZE_LONG} * length * @return number of chars written to buffer */	TokenNameCOMMENT_JAVADOC	 Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. This is method is used by {@link NumericTokenStream}. @param val the numeric value @param shift how many bits to strip from the right @param buffer that will contain the encoded chars, must be at least of {@link #BUF_SIZE_LONG} length @return number of chars written to buffer 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
63	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal shift value, must be 0..63"	TokenNameStringLiteral	Illegal shift value, must be 0..63
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
7	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nChars	TokenNameIdentifier	 n Chars
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
SHIFT_START_LONG	TokenNameIdentifier	 SHIFT  START  LONG
+	TokenNamePLUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sortableBits	TokenNameIdentifier	 sortable Bits
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
^	TokenNameXOR	
0x8000000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
sortableBits	TokenNameIdentifier	 sortable Bits
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nChars	TokenNameIdentifier	 n Chars
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Store 7 bits per character for good efficiency when UTF-8 encoding. 	TokenNameCOMMENT_LINE	Store 7 bits per character for good efficiency when UTF-8 encoding. 
// The whole number is right-justified so that lucene can prefix-encode 	TokenNameCOMMENT_LINE	The whole number is right-justified so that lucene can prefix-encode 
// the terms more efficiently. 	TokenNameCOMMENT_LINE	the terms more efficiently. 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
nChars	TokenNameIdentifier	 n Chars
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
sortableBits	TokenNameIdentifier	 sortable Bits
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortableBits	TokenNameIdentifier	 sortable Bits
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. * This is method is used by {@link LongRangeBuilder}. * @param val the numeric value * @param shift how many bits to strip from the right */	TokenNameCOMMENT_BLOCK	 Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. This is method is used by {@link LongRangeBuilder}. @param val the numeric value @param shift how many bits to strip from the right 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BUF_SIZE_LONG	TokenNameIdentifier	 BUF  SIZE  LONG
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This is a convenience method, that returns prefix coded bits of a long without * reducing the precision. It can be used to store the full precision value as a * stored field in index. * <p>To decode, use {@link #prefixCodedToLong}. */	TokenNameCOMMENT_BLOCK	 This is a convenience method, that returns prefix coded bits of a long without reducing the precision. It can be used to store the full precision value as a stored field in index. <p>To decode, use {@link #prefixCodedToLong}. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. * This is method is used by {@link NumericTokenStream}. * @param val the numeric value * @param shift how many bits to strip from the right * @param buffer that will contain the encoded chars, must be at least of {@link #BUF_SIZE_INT} * length * @return number of chars written to buffer */	TokenNameCOMMENT_JAVADOC	 Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. This is method is used by {@link NumericTokenStream}. @param val the numeric value @param shift how many bits to strip from the right @param buffer that will contain the encoded chars, must be at least of {@link #BUF_SIZE_INT} length @return number of chars written to buffer 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal shift value, must be 0..31"	TokenNameStringLiteral	Illegal shift value, must be 0..31
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
31	TokenNameIntegerLiteral	
-	TokenNameMINUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
7	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nChars	TokenNameIdentifier	 n Chars
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
SHIFT_START_INT	TokenNameIdentifier	 SHIFT  START  INT
+	TokenNamePLUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sortableBits	TokenNameIdentifier	 sortable Bits
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
^	TokenNameXOR	
0x80000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sortableBits	TokenNameIdentifier	 sortable Bits
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nChars	TokenNameIdentifier	 n Chars
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Store 7 bits per character for good efficiency when UTF-8 encoding. 	TokenNameCOMMENT_LINE	Store 7 bits per character for good efficiency when UTF-8 encoding. 
// The whole number is right-justified so that lucene can prefix-encode 	TokenNameCOMMENT_LINE	The whole number is right-justified so that lucene can prefix-encode 
// the terms more efficiently. 	TokenNameCOMMENT_LINE	the terms more efficiently. 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
nChars	TokenNameIdentifier	 n Chars
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
sortableBits	TokenNameIdentifier	 sortable Bits
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortableBits	TokenNameIdentifier	 sortable Bits
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. * This is method is used by {@link IntRangeBuilder}. * @param val the numeric value * @param shift how many bits to strip from the right */	TokenNameCOMMENT_BLOCK	 Expert: Returns prefix coded bits after reducing the precision by <code>shift</code> bits. This is method is used by {@link IntRangeBuilder}. @param val the numeric value @param shift how many bits to strip from the right 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BUF_SIZE_INT	TokenNameIdentifier	 BUF  SIZE  INT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This is a convenience method, that returns prefix coded bits of an int without * reducing the precision. It can be used to store the full precision value as a * stored field in index. * <p>To decode, use {@link #prefixCodedToInt}. */	TokenNameCOMMENT_BLOCK	 This is a convenience method, that returns prefix coded bits of an int without reducing the precision. It can be used to store the full precision value as a stored field in index. <p>To decode, use {@link #prefixCodedToInt}. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Returns a long from prefixCoded characters. * Rightmost bits will be zero for lower precision codes. * This method can be used to decode e.g. a stored field. * @throws NumberFormatException if the supplied string is * not correctly prefix encoded. * @see #longToPrefixCoded(long) */	TokenNameCOMMENT_BLOCK	 Returns a long from prefixCoded characters. Rightmost bits will be zero for lower precision codes. This method can be used to decode e.g. a stored field. @throws NumberFormatException if the supplied string is not correctly prefix encoded. @see #longToPrefixCoded(long) 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefixCoded	TokenNameIdentifier	 prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
SHIFT_START_LONG	TokenNameIdentifier	 SHIFT  START  LONG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
63	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Invalid shift value in prefixCoded string (is encoded value really a LONG?)"	TokenNameStringLiteral	Invalid shift value in prefixCoded string (is encoded value really a LONG?)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sortableBits	TokenNameIdentifier	 sortable Bits
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortableBits	TokenNameIdentifier	 sortable Bits
<<=	TokenNameLEFT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Invalid prefixCoded numerical value representation (char "	TokenNameStringLiteral	Invalid prefixCoded numerical value representation (char 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
+	TokenNamePLUS	
" at position "	TokenNameStringLiteral	 at position 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is invalid)"	TokenNameStringLiteral	 is invalid)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sortableBits	TokenNameIdentifier	 sortable Bits
|=	TokenNameOR_EQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
sortableBits	TokenNameIdentifier	 sortable Bits
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
^	TokenNameXOR	
0x8000000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Returns an int from prefixCoded characters. * Rightmost bits will be zero for lower precision codes. * This method can be used to decode e.g. a stored field. * @throws NumberFormatException if the supplied string is * not correctly prefix encoded. * @see #intToPrefixCoded(int) */	TokenNameCOMMENT_BLOCK	 Returns an int from prefixCoded characters. Rightmost bits will be zero for lower precision codes. This method can be used to decode e.g. a stored field. @throws NumberFormatException if the supplied string is not correctly prefix encoded. @see #intToPrefixCoded(int) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefixCoded	TokenNameIdentifier	 prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
SHIFT_START_INT	TokenNameIdentifier	 SHIFT  START  INT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shift	TokenNameIdentifier	 shift
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Invalid shift value in prefixCoded string (is encoded value really an INT?)"	TokenNameStringLiteral	Invalid shift value in prefixCoded string (is encoded value really an INT?)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sortableBits	TokenNameIdentifier	 sortable Bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortableBits	TokenNameIdentifier	 sortable Bits
<<=	TokenNameLEFT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
prefixCoded	TokenNameIdentifier	 prefix Coded
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Invalid prefixCoded numerical value representation (char "	TokenNameStringLiteral	Invalid prefixCoded numerical value representation (char 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
+	TokenNamePLUS	
" at position "	TokenNameStringLiteral	 at position 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is invalid)"	TokenNameStringLiteral	 is invalid)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sortableBits	TokenNameIdentifier	 sortable Bits
|=	TokenNameOR_EQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
sortableBits	TokenNameIdentifier	 sortable Bits
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
^	TokenNameXOR	
0x80000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a <code>double</code> value to a sortable signed <code>long</code>. * The value is converted by getting their IEEE 754 floating-point &quot;double format&quot; * bit layout and then some bits are swapped, to be able to compare the result as long. * By this the precision is not reduced, but the value can easily used as a long. * The sort order (including {@link Double#NaN}) is defined by * {@link Double#compareTo}; {@code NaN} is greater than positive infinity. * @see #sortableLongToDouble */	TokenNameCOMMENT_JAVADOC	 Converts a <code>double</code> value to a sortable signed <code>long</code>. The value is converted by getting their IEEE 754 floating-point &quot;double format&quot; bit layout and then some bits are swapped, to be able to compare the result as long. By this the precision is not reduced, but the value can easily used as a long. The sort order (including {@link Double#NaN}) is defined by {@link Double#compareTo}; {@code NaN} is greater than positive infinity. @see #sortableLongToDouble 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
^=	TokenNameXOR_EQUAL	
0x7fffffffffffffffL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Convenience method: this just returns: * longToPrefixCoded(doubleToSortableLong(val)) */	TokenNameCOMMENT_BLOCK	 Convenience method: this just returns: longToPrefixCoded(doubleToSortableLong(val)) 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
doubleToPrefixCoded	TokenNameIdentifier	 double To Prefix Coded
(	TokenNameLPAREN	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a sortable <code>long</code> back to a <code>double</code>. * @see #doubleToSortableLong */	TokenNameCOMMENT_JAVADOC	 Converts a sortable <code>long</code> back to a <code>double</code>. @see #doubleToSortableLong 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
long	TokenNamelong	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
^=	TokenNameXOR_EQUAL	
0x7fffffffffffffffL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Convenience method: this just returns: * sortableLongToDouble(prefixCodedToLong(val)) */	TokenNameCOMMENT_BLOCK	 Convenience method: this just returns: sortableLongToDouble(prefixCodedToLong(val)) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
prefixCodedToDouble	TokenNameIdentifier	 prefix Coded To Double
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a <code>float</code> value to a sortable signed <code>int</code>. * The value is converted by getting their IEEE 754 floating-point &quot;float format&quot; * bit layout and then some bits are swapped, to be able to compare the result as int. * By this the precision is not reduced, but the value can easily used as an int. * The sort order (including {@link Float#NaN}) is defined by * {@link Float#compareTo}; {@code NaN} is greater than positive infinity. * @see #sortableIntToFloat */	TokenNameCOMMENT_JAVADOC	 Converts a <code>float</code> value to a sortable signed <code>int</code>. The value is converted by getting their IEEE 754 floating-point &quot;float format&quot; bit layout and then some bits are swapped, to be able to compare the result as int. By this the precision is not reduced, but the value can easily used as an int. The sort order (including {@link Float#NaN}) is defined by {@link Float#compareTo}; {@code NaN} is greater than positive infinity. @see #sortableIntToFloat 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
^=	TokenNameXOR_EQUAL	
0x7fffffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Convenience method: this just returns: * intToPrefixCoded(floatToSortableInt(val)) */	TokenNameCOMMENT_BLOCK	 Convenience method: this just returns: intToPrefixCoded(floatToSortableInt(val)) 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
floatToPrefixCoded	TokenNameIdentifier	 float To Prefix Coded
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a sortable <code>int</code> back to a <code>float</code>. * @see #floatToSortableInt */	TokenNameCOMMENT_JAVADOC	 Converts a sortable <code>int</code> back to a <code>float</code>. @see #floatToSortableInt 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
^=	TokenNameXOR_EQUAL	
0x7fffffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Convenience method: this just returns: * sortableIntToFloat(prefixCodedToInt(val)) */	TokenNameCOMMENT_BLOCK	 Convenience method: this just returns: sortableIntToFloat(prefixCodedToInt(val)) 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
prefixCodedToFloat	TokenNameIdentifier	 prefix Coded To Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Splits a long range recursively. * You may implement a builder that adds clauses to a * {@link org.apache.lucene.search.BooleanQuery} for each call to its * {@link LongRangeBuilder#addRange(String,String)} * method. * <p>This method is used by {@link NumericRangeQuery}. */	TokenNameCOMMENT_JAVADOC	 Expert: Splits a long range recursively. You may implement a builder that adds clauses to a {@link org.apache.lucene.search.BooleanQuery} for each call to its {@link LongRangeBuilder#addRange(String,String)} method. <p>This method is used by {@link NumericRangeQuery}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
splitLongRange	TokenNameIdentifier	 split Long Range
(	TokenNameLPAREN	
final	TokenNamefinal	
LongRangeBuilder	TokenNameIdentifier	 Long Range Builder
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitRange	TokenNameIdentifier	 split Range
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Splits an int range recursively. * You may implement a builder that adds clauses to a * {@link org.apache.lucene.search.BooleanQuery} for each call to its * {@link IntRangeBuilder#addRange(String,String)} * method. * <p>This method is used by {@link NumericRangeQuery}. */	TokenNameCOMMENT_JAVADOC	 Expert: Splits an int range recursively. You may implement a builder that adds clauses to a {@link org.apache.lucene.search.BooleanQuery} for each call to its {@link IntRangeBuilder#addRange(String,String)} method. <p>This method is used by {@link NumericRangeQuery}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
splitIntRange	TokenNameIdentifier	 split Int Range
(	TokenNameLPAREN	
final	TokenNamefinal	
IntRangeBuilder	TokenNameIdentifier	 Int Range Builder
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitRange	TokenNameIdentifier	 split Range
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This helper does the splitting for both 32 and 64 bit. */	TokenNameCOMMENT_JAVADOC	 This helper does the splitting for both 32 and 64 bit. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
splitRange	TokenNameIdentifier	 split Range
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
valSize	TokenNameIdentifier	 val Size
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
long	TokenNamelong	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
long	TokenNamelong	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"precisionStep must be >=1"	TokenNameStringLiteral	precisionStep must be >=1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
>	TokenNameGREATER	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
+=	TokenNamePLUS_EQUAL	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// calculate new bounds for inner precision 	TokenNameCOMMENT_LINE	calculate new bounds for inner precision 
final	TokenNamefinal	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
+	TokenNamePLUS	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasLower	TokenNameIdentifier	 has Lower
=	TokenNameEQUAL	
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
hasUpper	TokenNameIdentifier	 has Upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
maxBound	TokenNameIdentifier	 max Bound
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
nextMinBound	TokenNameIdentifier	 next Min Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hasLower	TokenNameIdentifier	 has Lower
?	TokenNameQUESTION	
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
+	TokenNamePLUS	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
:	TokenNameCOLON	
minBound	TokenNameIdentifier	 min Bound
)	TokenNameRPAREN	
&	TokenNameAND	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
nextMaxBound	TokenNameIdentifier	 next Max Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hasUpper	TokenNameIdentifier	 has Upper
?	TokenNameQUESTION	
(	TokenNameLPAREN	
maxBound	TokenNameIdentifier	 max Bound
-	TokenNameMINUS	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
:	TokenNameCOLON	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
&	TokenNameAND	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
lowerWrapped	TokenNameIdentifier	 lower Wrapped
=	TokenNameEQUAL	
nextMinBound	TokenNameIdentifier	 next Min Bound
<	TokenNameLESS	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
upperWrapped	TokenNameIdentifier	 upper Wrapped
=	TokenNameEQUAL	
nextMaxBound	TokenNameIdentifier	 next Max Bound
>	TokenNameGREATER	
maxBound	TokenNameIdentifier	 max Bound
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
+	TokenNamePLUS	
precisionStep	TokenNameIdentifier	 precision Step
>=	TokenNameGREATER_EQUAL	
valSize	TokenNameIdentifier	 val Size
||	TokenNameOR_OR	
nextMinBound	TokenNameIdentifier	 next Min Bound
>	TokenNameGREATER	
nextMaxBound	TokenNameIdentifier	 next Max Bound
||	TokenNameOR_OR	
lowerWrapped	TokenNameIdentifier	 lower Wrapped
||	TokenNameOR_OR	
upperWrapped	TokenNameIdentifier	 upper Wrapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are in the lowest precision or the next precision is not available. 	TokenNameCOMMENT_LINE	We are in the lowest precision or the next precision is not available. 
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
valSize	TokenNameIdentifier	 val Size
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// exit the split recursion loop 	TokenNameCOMMENT_LINE	exit the split recursion loop 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasLower	TokenNameIdentifier	 has Lower
)	TokenNameRPAREN	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
valSize	TokenNameIdentifier	 val Size
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
|	TokenNameOR	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasUpper	TokenNameIdentifier	 has Upper
)	TokenNameRPAREN	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
valSize	TokenNameIdentifier	 val Size
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
&	TokenNameAND	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// recurse to next precision 	TokenNameCOMMENT_LINE	recurse to next precision 
minBound	TokenNameIdentifier	 min Bound
=	TokenNameEQUAL	
nextMinBound	TokenNameIdentifier	 next Min Bound
;	TokenNameSEMICOLON	
maxBound	TokenNameIdentifier	 max Bound
=	TokenNameEQUAL	
nextMaxBound	TokenNameIdentifier	 next Max Bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Helper that delegates to correct range builder */	TokenNameCOMMENT_JAVADOC	 Helper that delegates to correct range builder 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
valSize	TokenNameIdentifier	 val Size
,	TokenNameCOMMA	
long	TokenNamelong	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
long	TokenNamelong	
maxBound	TokenNameIdentifier	 max Bound
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for the max bound set all lower bits (that were shifted away): 	TokenNameCOMMENT_LINE	for the max bound set all lower bits (that were shifted away): 
// this is important for testing or other usages of the splitted range 	TokenNameCOMMENT_LINE	this is important for testing or other usages of the splitted range 
// (e.g. to reconstruct the full range). The prefixEncoding will remove 	TokenNameCOMMENT_LINE	(e.g. to reconstruct the full range). The prefixEncoding will remove 
// the bits anyway, so they do not hurt! 	TokenNameCOMMENT_LINE	the bits anyway, so they do not hurt! 
maxBound	TokenNameIdentifier	 max Bound
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// delegate to correct range builder 	TokenNameCOMMENT_LINE	delegate to correct range builder 
switch	TokenNameswitch	
(	TokenNameLPAREN	
valSize	TokenNameIdentifier	 val Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongRangeBuilder	TokenNameIdentifier	 Long Range Builder
)	TokenNameRPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IntRangeBuilder	TokenNameIdentifier	 Int Range Builder
)	TokenNameRPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
.	TokenNameDOT	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
maxBound	TokenNameIdentifier	 max Bound
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Should not happen! 	TokenNameCOMMENT_LINE	Should not happen! 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"valSize must be 32 or 64."	TokenNameStringLiteral	valSize must be 32 or 64.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: Callback for {@link #splitLongRange}. * You need to overwrite only one of the methods. * <p><font color="red"><b>NOTE:</b> This is a very low-level interface, * the method signatures may change in later versions.</font> */	TokenNameCOMMENT_JAVADOC	 Expert: Callback for {@link #splitLongRange}. You need to overwrite only one of the methods. <p><font color="red"><b>NOTE:</b> This is a very low-level interface, the method signatures may change in later versions.</font> 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
LongRangeBuilder	TokenNameIdentifier	 Long Range Builder
{	TokenNameLBRACE	
/** * Overwrite this method, if you like to receive the already prefix encoded range bounds. * You can directly build classical (inclusive) range queries from them. */	TokenNameCOMMENT_JAVADOC	 Overwrite this method, if you like to receive the already prefix encoded range bounds. You can directly build classical (inclusive) range queries from them. 
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overwrite this method, if you like to receive the raw long range bounds. * You can use this for e.g. debugging purposes (print out range bounds). */	TokenNameCOMMENT_JAVADOC	 Overwrite this method, if you like to receive the raw long range bounds. You can use this for e.g. debugging purposes (print out range bounds). 
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
,	TokenNameCOMMA	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: Callback for {@link #splitIntRange}. * You need to overwrite only one of the methods. * <p><font color="red"><b>NOTE:</b> This is a very low-level interface, * the method signatures may change in later versions.</font> */	TokenNameCOMMENT_JAVADOC	 Expert: Callback for {@link #splitIntRange}. You need to overwrite only one of the methods. <p><font color="red"><b>NOTE:</b> This is a very low-level interface, the method signatures may change in later versions.</font> 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
IntRangeBuilder	TokenNameIdentifier	 Int Range Builder
{	TokenNameLBRACE	
/** * Overwrite this method, if you like to receive the already prefix encoded range bounds. * You can directly build classical range (inclusive) queries from them. */	TokenNameCOMMENT_JAVADOC	 Overwrite this method, if you like to receive the already prefix encoded range bounds. You can directly build classical range (inclusive) queries from them. 
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overwrite this method, if you like to receive the raw int range bounds. * You can use this for e.g. debugging purposes (print out range bounds). */	TokenNameCOMMENT_JAVADOC	 Overwrite this method, if you like to receive the raw int range bounds. You can use this for e.g. debugging purposes (print out range bounds). 
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
,	TokenNameCOMMA	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
