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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
PrefixQuery	TokenNameIdentifier	 Prefix Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
;	TokenNameSEMICOLON	
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
// do not remove in 3.0, needed for reading old indexes! 	TokenNameCOMMENT_LINE	do not remove in 3.0, needed for reading old indexes! 
/** * Provides support for converting dates to strings and vice-versa. * The strings are structured so that lexicographic sorting orders by date, * which makes them suitable for use as field values and search terms. * * <P>Note that this class saves dates with millisecond granularity, * which is bad for {@link TermRangeQuery} and {@link PrefixQuery}, as those * queries are expanded to a BooleanQuery with a potentially large number * of terms when searching. Thus you might want to use * {@link DateTools} instead. * * <P> * Note: dates before 1970 cannot be used, and therefore cannot be * indexed when using this class. See {@link DateTools} for an * alternative without such a limitation. * * <P> * Another approach is {@link NumericUtils}, which provides * a sortable binary representation (prefix encoded) of numeric values, which * date/time are. * For indexing a {@link Date} or {@link Calendar}, just get the unix timestamp as * <code>long</code> using {@link Date#getTime} or {@link Calendar#getTimeInMillis} and * index this as a numeric value with {@link NumericField} * and use {@link NumericRangeQuery} to query it. * * @deprecated If you build a new index, use {@link DateTools} or * {@link NumericField} instead. * This class is included for use with existing * indices and will be removed in a future release (possibly Lucene 4.0). */	TokenNameCOMMENT_JAVADOC	 Provides support for converting dates to strings and vice-versa. The strings are structured so that lexicographic sorting orders by date, which makes them suitable for use as field values and search terms. * <P>Note that this class saves dates with millisecond granularity, which is bad for {@link TermRangeQuery} and {@link PrefixQuery}, as those queries are expanded to a BooleanQuery with a potentially large number of terms when searching. Thus you might want to use {@link DateTools} instead. * <P> Note: dates before 1970 cannot be used, and therefore cannot be indexed when using this class. See {@link DateTools} for an alternative without such a limitation. * <P> Another approach is {@link NumericUtils}, which provides a sortable binary representation (prefix encoded) of numeric values, which date/time are. For indexing a {@link Date} or {@link Calendar}, just get the unix timestamp as <code>long</code> using {@link Date#getTime} or {@link Calendar#getTimeInMillis} and index this as a numeric value with {@link NumericField} and use {@link NumericRangeQuery} to query it. * @deprecated If you build a new index, use {@link DateTools} or {@link NumericField} instead. This class is included for use with existing indices and will be removed in a future release (possibly Lucene 4.0). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DateField	TokenNameIdentifier	 Date Field
{	TokenNameLBRACE	
private	TokenNameprivate	
DateField	TokenNameIdentifier	 Date Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// make date strings long enough to last a millenium 	TokenNameCOMMENT_LINE	make date strings long enough to last a millenium 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
1000L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
365	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
24	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
MIN_DATE_STRING	TokenNameIdentifier	 MIN  DATE  STRING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
MAX_DATE_STRING	TokenNameIdentifier	 MAX  DATE  STRING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
forDigit	TokenNameIdentifier	 for Digit
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
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
DATE_LEN	TokenNameIdentifier	 DATE  LEN
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a Date to a string suitable for indexing. * @throws RuntimeException if the date specified in the * method argument is before 1970 */	TokenNameCOMMENT_JAVADOC	 Converts a Date to a string suitable for indexing. @throws RuntimeException if the date specified in the method argument is before 1970 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a millisecond time to a string suitable for indexing. * @throws RuntimeException if the time specified in the * method argument is negative, that is, before 1970 */	TokenNameCOMMENT_JAVADOC	 Converts a millisecond time to a string suitable for indexing. @throws RuntimeException if the time specified in the method argument is negative, that is, before 1970 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"time '"	TokenNameStringLiteral	time '
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
"' is too early, must be >= 0"	TokenNameStringLiteral	' is too early, must be >= 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"time '"	TokenNameStringLiteral	time '
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
"' is too late, length of string "	TokenNameStringLiteral	' is too late, length of string 
+	TokenNamePLUS	
"representation must be <= "	TokenNameStringLiteral	representation must be <= 
+	TokenNamePLUS	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pad with leading zeros 	TokenNameCOMMENT_LINE	Pad with leading zeros 
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
DATE_LEN	TokenNameIdentifier	 DATE  LEN
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Converts a string-encoded date into a millisecond time. */	TokenNameCOMMENT_JAVADOC	 Converts a string-encoded date into a millisecond time. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Converts a string-encoded date into a Date object. */	TokenNameCOMMENT_JAVADOC	 Converts a string-encoded date into a Date object. 
public	TokenNamepublic	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
