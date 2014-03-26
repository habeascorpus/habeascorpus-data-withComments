/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
FieldPosition	TokenNameIdentifier	 Field Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParsePosition	TokenNameIdentifier	 Parse Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
/** * CachedDateFormat optimizes the performance of a wrapped * DateFormat. The implementation is not thread-safe. * If the millisecond pattern is not recognized, * the class will only use the cache if the * same value is requested. * */	TokenNameCOMMENT_JAVADOC	 CachedDateFormat optimizes the performance of a wrapped DateFormat. The implementation is not thread-safe. If the millisecond pattern is not recognized, the class will only use the cache if the same value is requested. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
extends	TokenNameextends	
DateFormat	TokenNameIdentifier	 Date Format
{	TokenNameLBRACE	
/** * Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constant used to represent that there was no change * observed when changing the millisecond count. */	TokenNameCOMMENT_JAVADOC	 Constant used to represent that there was no change observed when changing the millisecond count. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_MILLISECONDS	TokenNameIdentifier	 NO  MILLISECONDS
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Supported digit set. If the wrapped DateFormat uses * a different unit set, the millisecond pattern * will not be recognized and duplicate requests * will use the cache. */	TokenNameCOMMENT_JAVADOC	 Supported digit set. If the wrapped DateFormat uses a different unit set, the millisecond pattern will not be recognized and duplicate requests will use the cache. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DIGITS	TokenNameIdentifier	 DIGITS
=	TokenNameEQUAL	
"0123456789"	TokenNameStringLiteral	0123456789
;	TokenNameSEMICOLON	
/** * Constant used to represent that there was an * observed change, but was an expected change. */	TokenNameCOMMENT_JAVADOC	 Constant used to represent that there was an observed change, but was an expected change. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * First magic number used to detect the millisecond position. */	TokenNameCOMMENT_JAVADOC	 First magic number used to detect the millisecond position. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAGIC1	TokenNameIdentifier	 MAGI C1
=	TokenNameEQUAL	
654	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expected representation of first magic number. */	TokenNameCOMMENT_JAVADOC	 Expected representation of first magic number. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAGICSTRING1	TokenNameIdentifier	 MAGICSTRIN G1
=	TokenNameEQUAL	
"654"	TokenNameStringLiteral	654
;	TokenNameSEMICOLON	
/** * Second magic number used to detect the millisecond position. */	TokenNameCOMMENT_JAVADOC	 Second magic number used to detect the millisecond position. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAGIC2	TokenNameIdentifier	 MAGI C2
=	TokenNameEQUAL	
987	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Expected representation of second magic number. */	TokenNameCOMMENT_JAVADOC	 Expected representation of second magic number. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAGICSTRING2	TokenNameIdentifier	 MAGICSTRIN G2
=	TokenNameEQUAL	
"987"	TokenNameStringLiteral	987
;	TokenNameSEMICOLON	
/** * Expected representation of 0 milliseconds. */	TokenNameCOMMENT_JAVADOC	 Expected representation of 0 milliseconds. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ZERO_STRING	TokenNameIdentifier	 ZERO  STRING
=	TokenNameEQUAL	
"000"	TokenNameStringLiteral	000
;	TokenNameSEMICOLON	
/** * Wrapped formatter. */	TokenNameCOMMENT_JAVADOC	 Wrapped formatter. 
private	TokenNameprivate	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
/** * Index of initial digit of millisecond pattern or * UNRECOGNIZED_MILLISECONDS or NO_MILLISECONDS. */	TokenNameCOMMENT_JAVADOC	 Index of initial digit of millisecond pattern or UNRECOGNIZED_MILLISECONDS or NO_MILLISECONDS. 
private	TokenNameprivate	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
;	TokenNameSEMICOLON	
/** * Integral second preceding the previous convered Date. */	TokenNameCOMMENT_JAVADOC	 Integral second preceding the previous convered Date. 
private	TokenNameprivate	
long	TokenNamelong	
slotBegin	TokenNameIdentifier	 slot Begin
;	TokenNameSEMICOLON	
/** * Cache of previous conversion. */	TokenNameCOMMENT_JAVADOC	 Cache of previous conversion. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Maximum validity period for the cache. * Typically 1, use cache for duplicate requests only, or * 1000, use cache for requests within the same integral second. */	TokenNameCOMMENT_JAVADOC	 Maximum validity period for the cache. Typically 1, use cache for duplicate requests only, or 1000, use cache for requests within the same integral second. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
expiration	TokenNameIdentifier	 expiration
;	TokenNameSEMICOLON	
/** * Date requested in previous conversion. */	TokenNameCOMMENT_JAVADOC	 Date requested in previous conversion. 
private	TokenNameprivate	
long	TokenNamelong	
previousTime	TokenNameIdentifier	 previous Time
;	TokenNameSEMICOLON	
/** * Scratch date object used to minimize date object creation. */	TokenNameCOMMENT_JAVADOC	 Scratch date object used to minimize date object creation. 
private	TokenNameprivate	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
tmpDate	TokenNameIdentifier	 tmp Date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new CachedDateFormat object. * @param dateFormat Date format, may not be null. * @param expiration maximum cached range in milliseconds. * If the dateFormat is known to be incompatible with the * caching algorithm, use a value of 0 to totally disable * caching or 1 to only use cache for duplicate requests. */	TokenNameCOMMENT_JAVADOC	 Creates a new CachedDateFormat object. @param dateFormat Date format, may not be null. @param expiration maximum cached range in milliseconds. If the dateFormat is known to be incompatible with the caching algorithm, use a value of 0 to totally disable caching or 1 to only use cache for duplicate requests. 
public	TokenNamepublic	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
expiration	TokenNameIdentifier	 expiration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"dateFormat cannot be null"	TokenNameStringLiteral	dateFormat cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expiration	TokenNameIdentifier	 expiration
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"expiration must be non-negative"	TokenNameStringLiteral	expiration must be non-negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expiration	TokenNameIdentifier	 expiration
=	TokenNameEQUAL	
expiration	TokenNameIdentifier	 expiration
;	TokenNameSEMICOLON	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// set the previousTime so the cache will be invalid 	TokenNameCOMMENT_LINE	set the previousTime so the cache will be invalid 
// for the next request. 	TokenNameCOMMENT_LINE	for the next request. 
previousTime	TokenNameIdentifier	 previous Time
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
slotBegin	TokenNameIdentifier	 slot Begin
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds start of millisecond field in formatted time. * @param time long time, must be integral number of seconds * @param formatted String corresponding formatted string * @param formatter DateFormat date format * @return int position in string of first digit of milliseconds, * -1 indicates no millisecond field, -2 indicates unrecognized * field (likely RelativeTimeDateFormat) */	TokenNameCOMMENT_JAVADOC	 Finds start of millisecond field in formatted time. @param time long time, must be integral number of seconds @param formatted String corresponding formatted string @param formatter DateFormat date format @return int position in string of first digit of milliseconds, -1 indicates no millisecond field, -2 indicates unrecognized field (likely RelativeTimeDateFormat) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
slotBegin	TokenNameIdentifier	 slot Begin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
>	TokenNameGREATER	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slotBegin	TokenNameIdentifier	 slot Begin
-=	TokenNameMINUS_EQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
slotBegin	TokenNameIdentifier	 slot Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
MAGIC1	TokenNameIdentifier	 MAGI C1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
magicString	TokenNameIdentifier	 magic String
=	TokenNameEQUAL	
MAGICSTRING1	TokenNameIdentifier	 MAGICSTRIN G1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
==	TokenNameEQUAL_EQUAL	
MAGIC1	TokenNameIdentifier	 MAGI C1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
MAGIC2	TokenNameIdentifier	 MAGI C2
;	TokenNameSEMICOLON	
magicString	TokenNameIdentifier	 magic String
=	TokenNameEQUAL	
MAGICSTRING2	TokenNameIdentifier	 MAGICSTRIN G2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
plusMagic	TokenNameIdentifier	 plus Magic
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
+	TokenNamePLUS	
magic	TokenNameIdentifier	 magic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If the string lengths differ then * we can't use the cache except for duplicate requests. */	TokenNameCOMMENT_JAVADOC	 If the string lengths differ then we can't use the cache except for duplicate requests. 
if	TokenNameif	
(	TokenNameLPAREN	
plusMagic	TokenNameIdentifier	 plus Magic
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
formatted	TokenNameIdentifier	 formatted
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// find first difference between values 	TokenNameCOMMENT_LINE	find first difference between values 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
formatted	TokenNameIdentifier	 formatted
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
formatted	TokenNameIdentifier	 formatted
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
plusMagic	TokenNameIdentifier	 plus Magic
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// determine the expected digits for the base time 	TokenNameCOMMENT_LINE	determine the expected digits for the base time 
StringBuffer	TokenNameIdentifier	 String Buffer
formattedMillis	TokenNameIdentifier	 formatted Millis
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ABC"	TokenNameStringLiteral	ABC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
millisecondFormat	TokenNameIdentifier	 millisecond Format
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
,	TokenNameCOMMA	
formattedMillis	TokenNameIdentifier	 formatted Millis
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
plusZero	TokenNameIdentifier	 plus Zero
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the next 3 characters match the magic 	TokenNameCOMMENT_LINE	If the next 3 characters match the magic 
// string and the expected string 	TokenNameCOMMENT_LINE	string and the expected string 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
plusZero	TokenNameIdentifier	 plus Zero
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
formatted	TokenNameIdentifier	 formatted
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
magicString	TokenNameIdentifier	 magic String
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
plusMagic	TokenNameIdentifier	 plus Magic
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
magicString	TokenNameIdentifier	 magic String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
formattedMillis	TokenNameIdentifier	 formatted Millis
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
magicString	TokenNameIdentifier	 magic String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ZERO_STRING	TokenNameIdentifier	 ZERO  STRING
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
plusZero	TokenNameIdentifier	 plus Zero
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ZERO_STRING	TokenNameIdentifier	 ZERO  STRING
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
NO_MILLISECONDS	TokenNameIdentifier	 NO  MILLISECONDS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats a Date into a date/time string. * * @param date the date to format. * @param sbuf the string buffer to write to. * @param fieldPosition remains untouched. * @return the formatted time string. */	TokenNameCOMMENT_JAVADOC	 Formats a Date into a date/time string. * @param date the date to format. @param sbuf the string buffer to write to. @param fieldPosition remains untouched. @return the formatted time string. 
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
FieldPosition	TokenNameIdentifier	 Field Position
fieldPosition	TokenNameIdentifier	 field Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats a millisecond count into a date/time string. * * @param now Number of milliseconds after midnight 1 Jan 1970 GMT. * @param buf the string buffer to write to. * @return the formatted time string. */	TokenNameCOMMENT_JAVADOC	 Formats a millisecond count into a date/time string. * @param now Number of milliseconds after midnight 1 Jan 1970 GMT. @param buf the string buffer to write to. @return the formatted time string. 
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
long	TokenNamelong	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If the current requested time is identical to the previously 	TokenNameCOMMENT_LINE	If the current requested time is identical to the previously 
// requested time, then append the cache contents. 	TokenNameCOMMENT_LINE	requested time, then append the cache contents. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
==	TokenNameEQUAL_EQUAL	
previousTime	TokenNameIdentifier	 previous Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If millisecond pattern was not unrecognized 	TokenNameCOMMENT_LINE	If millisecond pattern was not unrecognized 
// (that is if it was found or milliseconds did not appear) 	TokenNameCOMMENT_LINE	(that is if it was found or milliseconds did not appear) 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
millisecondStart	TokenNameIdentifier	 millisecond Start
!=	TokenNameNOT_EQUAL	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
&&	TokenNameAND_AND	
// Check if the cache is still valid. 	TokenNameCOMMENT_LINE	Check if the cache is still valid. 
// If the requested time is within the same integral second 	TokenNameCOMMENT_LINE	If the requested time is within the same integral second 
// as the last request and a shorter expiration was not requested. 	TokenNameCOMMENT_LINE	as the last request and a shorter expiration was not requested. 
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
<	TokenNameLESS	
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
+	TokenNamePLUS	
expiration	TokenNameIdentifier	 expiration
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
>=	TokenNameGREATER_EQUAL	
slotBegin	TokenNameIdentifier	 slot Begin
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
<	TokenNameLESS	
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
+	TokenNamePLUS	
1000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if there was a millisecond field then update it 	TokenNameCOMMENT_LINE	if there was a millisecond field then update it 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
millisecondStart	TokenNameIdentifier	 millisecond Start
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
millisecondFormat	TokenNameIdentifier	 millisecond Format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
slotBegin	TokenNameIdentifier	 slot Begin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// update the previously requested time 	TokenNameCOMMENT_LINE	update the previously requested time 
// (the slot begin should be unchanged) 	TokenNameCOMMENT_LINE	(the slot begin should be unchanged) 
previousTime	TokenNameIdentifier	 previous Time
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// could not use previous value. 	TokenNameCOMMENT_LINE	could not use previous value. 
// Call underlying formatter to format date. 	TokenNameCOMMENT_LINE	Call underlying formatter to format date. 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpDate	TokenNameIdentifier	 tmp Date
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
tmpDate	TokenNameIdentifier	 tmp Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousTime	TokenNameIdentifier	 previous Time
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
slotBegin	TokenNameIdentifier	 slot Begin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
previousTime	TokenNameIdentifier	 previous Time
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slotBegin	TokenNameIdentifier	 slot Begin
>	TokenNameGREATER	
previousTime	TokenNameIdentifier	 previous Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slotBegin	TokenNameIdentifier	 slot Begin
-=	TokenNameMINUS_EQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// if the milliseconds field was previous found 	TokenNameCOMMENT_LINE	if the milliseconds field was previous found 
// then reevaluate in case it moved. 	TokenNameCOMMENT_LINE	then reevaluate in case it moved. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
millisecondStart	TokenNameIdentifier	 millisecond Start
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats a count of milliseconds (0-999) into a numeric representation. * @param millis Millisecond coun between 0 and 999. * @param buf String buffer, may not be null. * @param offset Starting position in buffer, the length of the * buffer must be at least offset + 3. */	TokenNameCOMMENT_JAVADOC	 Formats a count of milliseconds (0-999) into a numeric representation. @param millis Millisecond coun between 0 and 999. @param buf String buffer, may not be null. @param offset Starting position in buffer, the length of the buffer must be at least offset + 3. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
millisecondFormat	TokenNameIdentifier	 millisecond Format
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
millis	TokenNameIdentifier	 millis
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
DIGITS	TokenNameIdentifier	 DIGITS
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
/	TokenNameDIVIDE	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DIGITS	TokenNameIdentifier	 DIGITS
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DIGITS	TokenNameIdentifier	 DIGITS
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set timezone. * * Setting the timezone using getCalendar().setTimeZone() * will likely cause caching to misbehave. * @param timeZone TimeZone new timezone */	TokenNameCOMMENT_JAVADOC	 Set timezone. * Setting the timezone using getCalendar().setTimeZone() will likely cause caching to misbehave. @param timeZone TimeZone new timezone 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
final	TokenNamefinal	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousTime	TokenNameIdentifier	 previous Time
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
slotBegin	TokenNameIdentifier	 slot Begin
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is delegated to the formatter which most * likely returns null. * @param s string representation of date. * @param pos field position, unused. * @return parsed date, likely null. */	TokenNameCOMMENT_JAVADOC	 This method is delegated to the formatter which most likely returns null. @param s string representation of date. @param pos field position, unused. @return parsed date, likely null. 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets number formatter. * * @return NumberFormat number formatter */	TokenNameCOMMENT_JAVADOC	 Gets number formatter. * @return NumberFormat number formatter 
public	TokenNamepublic	
NumberFormat	TokenNameIdentifier	 Number Format
getNumberFormat	TokenNameIdentifier	 get Number Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
getNumberFormat	TokenNameIdentifier	 get Number Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets maximum cache validity for the specified SimpleDateTime * conversion pattern. * @param pattern conversion pattern, may not be null. * @return Duration in milliseconds from an integral second * that the cache will return consistent results. */	TokenNameCOMMENT_JAVADOC	 Gets maximum cache validity for the specified SimpleDateTime conversion pattern. @param pattern conversion pattern, may not be null. @return Duration in milliseconds from an integral second that the cache will return consistent results. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getMaximumCacheValidity	TokenNameIdentifier	 get Maximum Cache Validity
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If there are more "S" in the pattern than just one "SSS" then 	TokenNameCOMMENT_LINE	If there are more "S" in the pattern than just one "SSS" then 
// (for example, "HH:mm:ss,SSS SSS"), then set the expiration to 	TokenNameCOMMENT_LINE	(for example, "HH:mm:ss,SSS SSS"), then set the expiration to 
// one millisecond which should only perform duplicate request caching. 	TokenNameCOMMENT_LINE	one millisecond which should only perform duplicate request caching. 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
firstS	TokenNameIdentifier	 first S
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstS	TokenNameIdentifier	 first S
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
firstS	TokenNameIdentifier	 first S
!=	TokenNameNOT_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"SSS"	TokenNameStringLiteral	SSS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
