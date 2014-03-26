package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NumericUtils	TokenNameIdentifier	 Numeric Utils
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
// do not remove this class in 3.0, it may be needed to decode old indexes! 	TokenNameCOMMENT_LINE	do not remove this class in 3.0, it may be needed to decode old indexes! 
/** * Provides support for converting longs to Strings, and back again. The strings * are structured so that lexicographic sorting order is preserved. * * <p> * That is, if l1 is less than l2 for any two longs l1 and l2, then * NumberTools.longToString(l1) is lexicographically less than * NumberTools.longToString(l2). (Similarly for "greater than" and "equals".) * * <p> * This class handles <b>all</b> long values (unlike * {@link org.apache.lucene.document.DateField}). * * @deprecated For new indexes use {@link NumericUtils} instead, which * provides a sortable binary representation (prefix encoded) of numeric * values. * To index and efficiently query numeric values use {@link NumericField} * and {@link NumericRangeQuery}. * This class is included for use with existing * indices and will be removed in a future release (possibly Lucene 4.0). */	TokenNameCOMMENT_JAVADOC	 Provides support for converting longs to Strings, and back again. The strings are structured so that lexicographic sorting order is preserved. * <p> That is, if l1 is less than l2 for any two longs l1 and l2, then NumberTools.longToString(l1) is lexicographically less than NumberTools.longToString(l2). (Similarly for "greater than" and "equals".) * <p> This class handles <b>all</b> long values (unlike {@link org.apache.lucene.document.DateField}). * @deprecated For new indexes use {@link NumericUtils} instead, which provides a sortable binary representation (prefix encoded) of numeric values. To index and efficiently query numeric values use {@link NumericField} and {@link NumericRangeQuery}. This class is included for use with existing indices and will be removed in a future release (possibly Lucene 4.0). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
NumberTools	TokenNameIdentifier	 Number Tools
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RADIX	TokenNameIdentifier	 RADIX
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
NEGATIVE_PREFIX	TokenNameIdentifier	 NEGATIVE  PREFIX
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// NB: NEGATIVE_PREFIX must be < POSITIVE_PREFIX 	TokenNameCOMMENT_LINE	NB: NEGATIVE_PREFIX must be < POSITIVE_PREFIX 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
POSITIVE_PREFIX	TokenNameIdentifier	 POSITIVE  PREFIX
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//NB: this must be less than 	TokenNameCOMMENT_LINE	NB: this must be less than 
/** * Equivalent to longToString(Long.MIN_VALUE) */	TokenNameCOMMENT_JAVADOC	 Equivalent to longToString(Long.MIN_VALUE) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
=	TokenNameEQUAL	
NEGATIVE_PREFIX	TokenNameIdentifier	 NEGATIVE  PREFIX
+	TokenNamePLUS	
"0000000000000"	TokenNameStringLiteral	0000000000000
;	TokenNameSEMICOLON	
/** * Equivalent to longToString(Long.MAX_VALUE) */	TokenNameCOMMENT_JAVADOC	 Equivalent to longToString(Long.MAX_VALUE) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAX_STRING_VALUE	TokenNameIdentifier	 MAX  STRING  VALUE
=	TokenNameEQUAL	
POSITIVE_PREFIX	TokenNameIdentifier	 POSITIVE  PREFIX
+	TokenNamePLUS	
"1y2p0ij32e8e7"	TokenNameStringLiteral	1y2p0ij32e8e7
;	TokenNameSEMICOLON	
/** * The length of (all) strings returned by {@link #longToString} */	TokenNameCOMMENT_JAVADOC	 The length of (all) strings returned by {@link #longToString} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
=	TokenNameEQUAL	
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Converts a long to a String suitable for indexing. */	TokenNameCOMMENT_JAVADOC	 Converts a long to a String suitable for indexing. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
longToString	TokenNameIdentifier	 long To String
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// special case, because long is not symmetric around zero 	TokenNameCOMMENT_LINE	special case, because long is not symmetric around zero 
return	TokenNamereturn	
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEGATIVE_PREFIX	TokenNameIdentifier	 NEGATIVE  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
POSITIVE_PREFIX	TokenNameIdentifier	 POSITIVE  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
RADIX	TokenNameIdentifier	 RADIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
padLen	TokenNameIdentifier	 pad Len
=	TokenNameEQUAL	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
-	TokenNameMINUS	
num	TokenNameIdentifier	 num
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
padLen	TokenNameIdentifier	 pad Len
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a String that was returned by {@link #longToString} back to a * long. * * @throws IllegalArgumentException * if the input is null * @throws NumberFormatException * if the input does not parse (it was not a String returned by * longToString()). */	TokenNameCOMMENT_JAVADOC	 Converts a String that was returned by {@link #longToString} back to a long. * @throws IllegalArgumentException if the input is null @throws NumberFormatException if the input does not parse (it was not a String returned by longToString()). 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
stringToLong	TokenNameIdentifier	 string To Long
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"string cannot be null"	TokenNameStringLiteral	string cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
STR_SIZE	TokenNameIdentifier	 STR  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"string is the wrong size"	TokenNameStringLiteral	string is the wrong size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MIN_STRING_VALUE	TokenNameIdentifier	 MIN  STRING  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RADIX	TokenNameIdentifier	 RADIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
POSITIVE_PREFIX	TokenNameIdentifier	 POSITIVE  PREFIX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nop 	TokenNameCOMMENT_LINE	nop 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
NEGATIVE_PREFIX	TokenNameIdentifier	 NEGATIVE  PREFIX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"string does not begin with the correct prefix"	TokenNameStringLiteral	string does not begin with the correct prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
