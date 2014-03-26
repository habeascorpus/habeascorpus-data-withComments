/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExsltDatetime.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExsltDatetime.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XBoolean	TokenNameIdentifier	 X Boolean
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNumber	TokenNameIdentifier	 X Number
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This class contains EXSLT dates and times extension functions. * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:datetime="http://exslt.org/dates-and-times" * </pre> * * The documentation for each function has been copied from the relevant * EXSLT Implementer page. * * @see <a href="http://www.exslt.org/">EXSLT</a> * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class contains EXSLT dates and times extension functions. It is accessed by specifying a namespace URI as follows: <pre> xmlns:datetime="http://exslt.org/dates-and-times" </pre> * The documentation for each function has been copied from the relevant EXSLT Implementer page. * @see <a href="http://www.exslt.org/">EXSLT</a> @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
ExsltDatetime	TokenNameIdentifier	 Exslt Datetime
{	TokenNameLBRACE	
// Datetime formats (era and zone handled separately). 	TokenNameCOMMENT_LINE	Datetime formats (era and zone handled separately). 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
"yyyy-MM-dd'T'HH:mm:ss"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mm:ss
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
"yyyy-MM-dd"	TokenNameStringLiteral	yyyy-MM-dd
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
gym	TokenNameIdentifier	 gym
=	TokenNameEQUAL	
"yyyy-MM"	TokenNameStringLiteral	yyyy-MM
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
gy	TokenNameIdentifier	 gy
=	TokenNameEQUAL	
"yyyy"	TokenNameStringLiteral	yyyy
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
gmd	TokenNameIdentifier	 gmd
=	TokenNameEQUAL	
"--MM-dd"	TokenNameStringLiteral	--MM-dd
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
"--MM--"	TokenNameStringLiteral	--MM--
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
"---dd"	TokenNameStringLiteral	---dd
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
"HH:mm:ss"	TokenNameStringLiteral	HH:mm:ss
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * The date:date-time function returns the current date and time as a date/time string. * The date/time string that's returned must be a string in the format defined as the * lexical representation of xs:dateTime in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and * <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. * The date/time string format must include a time zone, either a Z to indicate Coordinated * Universal Time or a + or - followed by the difference between the difference from UTC * represented as hh:mm. */	TokenNameCOMMENT_JAVADOC	 The date:date-time function returns the current date and time as a date/time string. The date/time string that's returned must be a string in the format defined as the lexical representation of xs:dateTime in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. The date/time string format must include a time zone, either a Z to indicate Coordinated Universal Time or a + or - followed by the difference between the difference from UTC represented as hh:mm. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Format for date and time. 	TokenNameCOMMENT_LINE	Format for date and time. 
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must also include offset from UTF. 	TokenNameCOMMENT_LINE	Must also include offset from UTF. 
// Get the offset (in milliseconds). 	TokenNameCOMMENT_LINE	Get the offset (in milliseconds). 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ZONE_OFFSET	TokenNameIdentifier	 ZONE  OFFSET
)	TokenNameRPAREN	
+	TokenNamePLUS	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DST_OFFSET	TokenNameIdentifier	 DST  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there is no offset, we have "Coordinated 	TokenNameCOMMENT_LINE	If there is no offset, we have "Coordinated 
// Universal Time." 	TokenNameCOMMENT_LINE	Universal Time." 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Z"	TokenNameStringLiteral	Z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Convert milliseconds to hours and minutes 	TokenNameCOMMENT_LINE	Convert milliseconds to hours and minutes 
int	TokenNameint	
hrs	TokenNameIdentifier	 hrs
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// In a few cases, the time zone may be +/-hh:30. 	TokenNameCOMMENT_LINE	In a few cases, the time zone may be +/-hh:30. 
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
posneg	TokenNameIdentifier	 posneg
=	TokenNameEQUAL	
hrs	TokenNameIdentifier	 hrs
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
posneg	TokenNameIdentifier	 posneg
+	TokenNamePLUS	
formatDigits	TokenNameIdentifier	 format Digits
(	TokenNameLPAREN	
hrs	TokenNameIdentifier	 hrs
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
formatDigits	TokenNameIdentifier	 format Digits
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represent the hours and minutes with two-digit strings. * @param q hrs or minutes. * @return two-digit String representation of hrs or minutes. */	TokenNameCOMMENT_JAVADOC	 Represent the hours and minutes with two-digit strings. @param q hrs or minutes. @return two-digit String representation of hrs or minutes. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatDigits	TokenNameIdentifier	 format Digits
(	TokenNameLPAREN	
int	TokenNameint	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
dd	TokenNameIdentifier	 dd
:	TokenNameCOLON	
dd	TokenNameIdentifier	 dd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:date function returns the date specified in the date/time string given * as the argument. If no argument is given, then the current local date/time, as * returned by date:date-time is used as a default argument. * The date/time string that's returned must be a string in the format defined as the * lexical representation of xs:dateTime in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * If the argument is not in either of these formats, date:date returns an empty string (''). * The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and * <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. * The date is returned as a string with a lexical representation as defined for xs:date in * [3.2.9 date] of [XML Schema Part 2: Datatypes]. The date format is basically CCYY-MM-DD, * although implementers should consult [XML Schema Part 2: Datatypes] and [ISO 8601] for details. * If no argument is given or the argument date/time specifies a time zone, then the date string * format must include a time zone, either a Z to indicate Coordinated Universal Time or a + or - * followed by the difference between the difference from UTC represented as hh:mm. If an argument * is specified and it does not specify a time zone, then the date string format must not include * a time zone. */	TokenNameCOMMENT_JAVADOC	 The date:date function returns the date specified in the date/time string given as the argument. If no argument is given, then the current local date/time, as returned by date:date-time is used as a default argument. The date/time string that's returned must be a string in the format defined as the lexical representation of xs:dateTime in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. If the argument is not in either of these formats, date:date returns an empty string (''). The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. The date is returned as a string with a lexical representation as defined for xs:date in [3.2.9 date] of [XML Schema Part 2: Datatypes]. The date format is basically CCYY-MM-DD, although implementers should consult [XML Schema Part 2: Datatypes] and [ISO 8601] for details. If no argument is given or the argument date/time specifies a time zone, then the date string format must include a time zone, either a Z to indicate Coordinated Universal Time or a + or - followed by the difference between the difference from UTC represented as hh:mm. If an argument is specified and it does not specify a time zone, then the date string format must not include a time zone. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
leader	TokenNameIdentifier	 leader
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
zone	TokenNameIdentifier	 zone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
testFormats	TokenNameIdentifier	 test Formats
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dateOut	TokenNameIdentifier	 date Out
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dateOut	TokenNameIdentifier	 date Out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
leader	TokenNameIdentifier	 leader
+	TokenNamePLUS	
dateOut	TokenNameIdentifier	 date Out
+	TokenNamePLUS	
zone	TokenNameIdentifier	 zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"T"	TokenNameStringLiteral	T
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
getZoneStart	TokenNameIdentifier	 get Zone Start
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
+	TokenNamePLUS	
zone	TokenNameIdentifier	 zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:time function returns the time specified in the date/time string given * as the argument. If no argument is given, then the current local date/time, as * returned by date:date-time is used as a default argument. * The date/time string that's returned must be a string in the format defined as the * lexical representation of xs:dateTime in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * If the argument string is not in this format, date:time returns an empty string (''). * The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and * <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. * The date is returned as a string with a lexical representation as defined for xs:time in * <a href="http://www.w3.org/TR/xmlschema-2/#time">[3.2.8 time]</a> of [XML Schema Part 2: Datatypes]. * The time format is basically hh:mm:ss, although implementers should consult [XML Schema Part 2: * Datatypes] and [ISO 8601] for details. * If no argument is given or the argument date/time specifies a time zone, then the time string * format must include a time zone, either a Z to indicate Coordinated Universal Time or a + or - * followed by the difference between the difference from UTC represented as hh:mm. If an argument * is specified and it does not specify a time zone, then the time string format must not include * a time zone. */	TokenNameCOMMENT_JAVADOC	 The date:time function returns the time specified in the date/time string given as the argument. If no argument is given, then the current local date/time, as returned by date:date-time is used as a default argument. The date/time string that's returned must be a string in the format defined as the lexical representation of xs:dateTime in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">[3.2.7 dateTime]</a> of <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. If the argument string is not in this format, date:time returns an empty string (''). The date/time format is basically CCYY-MM-DDThh:mm:ss, although implementers should consult <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a> and <a href="http://www.iso.ch/markete/8601.pdf">[ISO 8601]</a> for details. The date is returned as a string with a lexical representation as defined for xs:time in <a href="http://www.w3.org/TR/xmlschema-2/#time">[3.2.8 time]</a> of [XML Schema Part 2: Datatypes]. The time format is basically hh:mm:ss, although implementers should consult [XML Schema Part 2: Datatypes] and [ISO 8601] for details. If no argument is given or the argument date/time specifies a time zone, then the time string format must include a time zone, either a Z to indicate Coordinated Universal Time or a + or - followed by the difference between the difference from UTC represented as hh:mm. If an argument is specified and it does not specify a time zone, then the time string format must not include a time zone. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
timeIn	TokenNameIdentifier	 time In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
timeIn	TokenNameIdentifier	 time In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
zone	TokenNameIdentifier	 zone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
testFormats	TokenNameIdentifier	 test Formats
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
+	TokenNamePLUS	
zone	TokenNameIdentifier	 zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"T"	TokenNameStringLiteral	T
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The datetime() function returns the zone on the datetime string. If we 	TokenNameCOMMENT_LINE	The datetime() function returns the zone on the datetime string. If we 
// append it, we get the zone substring duplicated. 	TokenNameCOMMENT_LINE	append it, we get the zone substring duplicated. 
// Fix for JIRA 2013 	TokenNameCOMMENT_LINE	Fix for JIRA 2013 
// String zone = datetime.substring(getZoneStart(datetime)); 	TokenNameCOMMENT_LINE	String zone = datetime.substring(getZoneStart(datetime)); 
// return (time + zone); 	TokenNameCOMMENT_LINE	return (time + zone); 
return	TokenNamereturn	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:year function returns the year of a date as a number. If no * argument is given, then the current local date/time, as returned by * date:date-time is used as a default argument. * The date/time string specified as the first argument must be a right-truncated * string in the format defined as the lexical representation of xs:dateTime in one * of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gYearMonth (CCYY-MM) * xs:gYear (CCYY) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:year function returns the year of a date as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used as a default argument. The date/time string specified as the first argument must be a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gYearMonth (CCYY-MM) xs:gYear (CCYY) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
year	TokenNameIdentifier	 year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ad	TokenNameIdentifier	 ad
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// AD (Common Era -- empty leader) 	TokenNameCOMMENT_LINE	AD (Common Era -- empty leader) 
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gy	TokenNameIdentifier	 gy
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
yr	TokenNameIdentifier	 yr
=	TokenNameEQUAL	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ad	TokenNameIdentifier	 ad
||	TokenNameOR_OR	
yr	TokenNameIdentifier	 yr
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
return	TokenNamereturn	
yr	TokenNameIdentifier	 yr
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
yr	TokenNameIdentifier	 yr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
year	TokenNameIdentifier	 year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:month-in-year function returns the month of a date as a number. If no argument * is given, then the current local date/time, as returned by date:date-time is used * as a default argument. * The date/time string specified as the first argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime in one of * the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gYearMonth (CCYY-MM) * xs:gMonth (--MM--) * xs:gMonthDay (--MM-DD) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:month-in-year function returns the month of a date as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used as a default argument. The date/time string specified as the first argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gYearMonth (CCYY-MM) xs:gMonth (--MM--) xs:gMonthDay (--MM-DD) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
monthInYear	TokenNameIdentifier	 month In Year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gm	TokenNameIdentifier	 gm
,	TokenNameCOMMA	
gmd	TokenNameIdentifier	 gmd
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
monthInYear	TokenNameIdentifier	 month In Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:week-in-year function returns the week of the year as a number. If no argument * is given, then the current local date/time, as returned by date:date-time is used as the * default argument. For the purposes of numbering, counting follows ISO 8601: week 1 in a year * is the week containing the first Thursday of the year, with new weeks beginning on a Monday. * The date/time string specified as the argument is a right-truncated string in the format * defined as the lexical representation of xs:dateTime in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The * permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:week-in-year function returns the week of the year as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used as the default argument. For the purposes of numbering, counting follows ISO 8601: week 1 in a year is the week containing the first Thursday of the year, with new weeks beginning on a Monday. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
weekInYear	TokenNameIdentifier	 week In Year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
WEEK_OF_YEAR	TokenNameIdentifier	 WEEK  OF  YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
weekInYear	TokenNameIdentifier	 week In Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
WEEK_OF_YEAR	TokenNameIdentifier	 WEEK  OF  YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-in-year function returns the day of a date in a year * as a number. If no argument is given, then the current local * date/time, as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:day-in-year function returns the day of a date in a year as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInYear	TokenNameIdentifier	 day In Year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_YEAR	TokenNameIdentifier	 DAY  OF  YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInYear	TokenNameIdentifier	 day In Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_YEAR	TokenNameIdentifier	 DAY  OF  YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-in-month function returns the day of a date as a number. * If no argument is given, then the current local date/time, as returned * by date:date-time is used the default argument. * The date/time string specified as the argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gMonthDay (--MM-DD) * xs:gDay (---DD) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:day-in-month function returns the day of a date as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gMonthDay (--MM-DD) xs:gDay (---DD) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInMonth	TokenNameIdentifier	 day In Month
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gmd	TokenNameIdentifier	 gmd
,	TokenNameCOMMA	
gd	TokenNameIdentifier	 gd
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInMonth	TokenNameIdentifier	 day In Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-of-week-in-month function returns the day-of-the-week * in a month of a date as a number (e.g. 3 for the 3rd Tuesday in May). * If no argument is given, then the current local date/time, as returned * by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated string * in the format defined as the lexical representation of xs:dateTime in one * of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:day-of-week-in-month function returns the day-of-the-week in a month of a date as a number (e.g. 3 for the 3rd Tuesday in May). If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayOfWeekInMonth	TokenNameIdentifier	 day Of Week In Month
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK_IN_MONTH	TokenNameIdentifier	 DAY  OF  WEEK  IN  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayOfWeekInMonth	TokenNameIdentifier	 day Of Week In Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK_IN_MONTH	TokenNameIdentifier	 DAY  OF  WEEK  IN  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-in-week function returns the day of the week given in a * date as a number. If no argument is given, then the current local date/time, * as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated string * in the format defined as the lexical representation of xs:dateTime in one * of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then NaN is returned. The numbering of days of the week starts at 1 for Sunday, 2 for Monday and so on up to 7 for Saturday. */	TokenNameCOMMENT_JAVADOC	 The date:day-in-week function returns the day of the week given in a date as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then NaN is returned. The numbering of days of the week starts at 1 for Sunday, 2 for Monday and so on up to 7 for Saturday. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInWeek	TokenNameIdentifier	 day In Week
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK	TokenNameIdentifier	 DAY  OF  WEEK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
dayInWeek	TokenNameIdentifier	 day In Week
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK	TokenNameIdentifier	 DAY  OF  WEEK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:hour-in-day function returns the hour of the day as a number. * If no argument is given, then the current local date/time, as returned * by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:time (hh:mm:ss) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:hour-in-day function returns the hour of the day as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:time (hh:mm:ss) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
hourInDay	TokenNameIdentifier	 hour In Day
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
hourInDay	TokenNameIdentifier	 hour In Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:minute-in-hour function returns the minute of the hour * as a number. If no argument is given, then the current local * date/time, as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:time (hh:mm:ss) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:minute-in-hour function returns the minute of the hour as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:time (hh:mm:ss) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
minuteInHour	TokenNameIdentifier	 minute In Hour
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
minuteInHour	TokenNameIdentifier	 minute In Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:second-in-minute function returns the second of the minute * as a number. If no argument is given, then the current local * date/time, as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:time (hh:mm:ss) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:second-in-minute function returns the second of the minute as a number. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:time (hh:mm:ss) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
secondInMinute	TokenNameIdentifier	 second In Minute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
secondInMinute	TokenNameIdentifier	 second In Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:leap-year function returns true if the year given in a date * is a leap year. If no argument is given, then the current local * date/time, as returned by date:date-time is used as a default argument. * The date/time string specified as the first argument must be a * right-truncated string in the format defined as the lexical representation * of xs:dateTime in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gYearMonth (CCYY-MM) * xs:gYear (CCYY) * If the date/time string is not in one of these formats, then NaN is returned. */	TokenNameCOMMENT_JAVADOC	 The date:leap-year function returns true if the year given in a date is a leap year. If no argument is given, then the current local date/time, as returned by date:date-time is used as a default argument. The date/time string specified as the first argument must be a right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gYearMonth (CCYY-MM) xs:gYear (CCYY) If the date/time string is not in one of these formats, then NaN is returned. 
public	TokenNamepublic	
static	TokenNamestatic	
XObject	TokenNameIdentifier	 X Object
leapYear	TokenNameIdentifier	 leap Year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gy	TokenNameIdentifier	 gy
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dbl	TokenNameIdentifier	 dbl
=	TokenNameEQUAL	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dbl	TokenNameIdentifier	 dbl
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yr	TokenNameIdentifier	 yr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
dbl	TokenNameIdentifier	 dbl
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XBoolean	TokenNameIdentifier	 X Boolean
(	TokenNameLPAREN	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
400	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
100	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
4	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
leapYear	TokenNameIdentifier	 leap Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yr	TokenNameIdentifier	 yr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
400	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
100	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
yr	TokenNameIdentifier	 yr
%	TokenNameREMAINDER	
4	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:month-name function returns the full name of the month of a date. * If no argument is given, then the current local date/time, as returned by * date:date-time is used the default argument. * The date/time string specified as the argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime in * one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gYearMonth (CCYY-MM) * xs:gMonth (--MM--) * If the date/time string is not in one of these formats, then an empty string ('') * is returned. * The result is an English month name: one of 'January', 'February', 'March', * 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November' * or 'December'. */	TokenNameCOMMENT_JAVADOC	 The date:month-name function returns the full name of the month of a date. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gYearMonth (CCYY-MM) xs:gMonth (--MM--) If the date/time string is not in one of these formats, then an empty string ('') is returned. The result is an English month name: one of 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November' or 'December'. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
monthName	TokenNameIdentifier	 month Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gm	TokenNameIdentifier	 gm
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
"MMMM"	TokenNameStringLiteral	MMMM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
,	TokenNameCOMMA	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
monthName	TokenNameIdentifier	 month Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"MMMM"	TokenNameStringLiteral	MMMM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:month-abbreviation function returns the abbreviation of the month of * a date. If no argument is given, then the current local date/time, as returned * by date:date-time is used the default argument. * The date/time string specified as the argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime in * one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * xs:gYearMonth (CCYY-MM) * xs:gMonth (--MM--) * If the date/time string is not in one of these formats, then an empty string ('') * is returned. * The result is a three-letter English month abbreviation: one of 'Jan', 'Feb', 'Mar', * 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov' or 'Dec'. * An implementation of this extension function in the EXSLT date namespace must conform * to the behaviour described in this document. */	TokenNameCOMMENT_JAVADOC	 The date:month-abbreviation function returns the abbreviation of the month of a date. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) xs:gYearMonth (CCYY-MM) xs:gMonth (--MM--) If the date/time string is not in one of these formats, then an empty string ('') is returned. The result is a three-letter English month abbreviation: one of 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov' or 'Dec'. An implementation of this extension function in the EXSLT date namespace must conform to the behaviour described in this document. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
monthAbbreviation	TokenNameIdentifier	 month Abbreviation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gm	TokenNameIdentifier	 gm
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
"MMM"	TokenNameStringLiteral	MMM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
,	TokenNameCOMMA	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
monthAbbreviation	TokenNameIdentifier	 month Abbreviation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"MMM"	TokenNameStringLiteral	MMM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-name function returns the full name of the day of the week * of a date. If no argument is given, then the current local date/time, * as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then the empty string ('') * is returned. * The result is an English day name: one of 'Sunday', 'Monday', 'Tuesday', 'Wednesday', * 'Thursday' or 'Friday'. * An implementation of this extension function in the EXSLT date namespace must conform * to the behaviour described in this document. */	TokenNameCOMMENT_JAVADOC	 The date:day-name function returns the full name of the day of the week of a date. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then the empty string ('') is returned. The result is an English day name: one of 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday' or 'Friday'. An implementation of this extension function in the EXSLT date namespace must conform to the behaviour described in this document. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dayName	TokenNameIdentifier	 day Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
"EEEE"	TokenNameStringLiteral	EEEE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
,	TokenNameCOMMA	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dayName	TokenNameIdentifier	 day Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"EEEE"	TokenNameStringLiteral	EEEE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:day-abbreviation function returns the abbreviation of the day * of the week of a date. If no argument is given, then the current local * date/time, as returned by date:date-time is used the default argument. * The date/time string specified as the argument is a left or right-truncated * string in the format defined as the lexical representation of xs:dateTime * in one of the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * xs:dateTime (CCYY-MM-DDThh:mm:ss) * xs:date (CCYY-MM-DD) * If the date/time string is not in one of these formats, then the empty string * ('') is returned. * The result is a three-letter English day abbreviation: one of 'Sun', 'Mon', 'Tue', * 'Wed', 'Thu' or 'Fri'. * An implementation of this extension function in the EXSLT date namespace must conform * to the behaviour described in this document. */	TokenNameCOMMENT_JAVADOC	 The date:day-abbreviation function returns the abbreviation of the day of the week of a date. If no argument is given, then the current local date/time, as returned by date:date-time is used the default argument. The date/time string specified as the argument is a left or right-truncated string in the format defined as the lexical representation of xs:dateTime in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: xs:dateTime (CCYY-MM-DDThh:mm:ss) xs:date (CCYY-MM-DD) If the date/time string is not in one of these formats, then the empty string ('') is returned. The result is a three-letter English day abbreviation: one of 'Sun', 'Mon', 'Tue', 'Wed', 'Thu' or 'Fri'. An implementation of this extension function in the EXSLT date namespace must conform to the behaviour described in this document. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dayAbbreviation	TokenNameIdentifier	 day Abbreviation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
edz	TokenNameIdentifier	 edz
=	TokenNameEQUAL	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
edz	TokenNameIdentifier	 edz
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
=	TokenNameEQUAL	
"EEE"	TokenNameStringLiteral	EEE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
datetimeIn	TokenNameIdentifier	 datetime In
,	TokenNameCOMMA	
formatsIn	TokenNameIdentifier	 formats In
,	TokenNameCOMMA	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above. */	TokenNameCOMMENT_JAVADOC	 See above. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
dayAbbreviation	TokenNameIdentifier	 day Abbreviation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"EEE"	TokenNameStringLiteral	EEE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array with the 3 components that a datetime input string * may contain: - (for BC era), datetime, and zone. If the zone is not * valid, return null for that component. */	TokenNameCOMMENT_JAVADOC	 Returns an array with the 3 components that a datetime input string may contain: - (for BC era), datetime, and zone. If the zone is not valid, return null for that component. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEraDatetimeZone	TokenNameIdentifier	 get Era Datetime Zone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
leader	TokenNameIdentifier	 leader
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leader	TokenNameIdentifier	 leader
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
// '+' is implicit , not allowed 	TokenNameCOMMENT_LINE	'+' is implicit , not allowed 
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
getZoneStart	TokenNameIdentifier	 get Zone Start
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
datetime	TokenNameIdentifier	 datetime
=	TokenNameEQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//System.out.println("'" + leader + "' " + datetime + " " + zone); 	TokenNameCOMMENT_LINE	System.out.println("'" + leader + "' " + datetime + " " + zone); 
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
leader	TokenNameIdentifier	 leader
,	TokenNameCOMMA	
datetime	TokenNameIdentifier	 datetime
,	TokenNameCOMMA	
zone	TokenNameIdentifier	 zone
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the start of zone information if the input ends * with 'Z' or +/-hh:mm. If a zone string is not * found, return -1; if the zone string is invalid, * return -2. */	TokenNameCOMMENT_JAVADOC	 Get the start of zone information if the input ends with 'Z' or +/-hh:mm. If a zone string is not found, return -1; if the zone string is invalid, return -2. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
getZoneStart	TokenNameIdentifier	 get Zone Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datetime	TokenNameIdentifier	 datetime
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Z"	TokenNameStringLiteral	Z
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
6	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm"	TokenNameStringLiteral	HH:mm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
datetime	TokenNameIdentifier	 datetime
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ParseException "	TokenNameStringLiteral	ParseException 
+	TokenNamePLUS	
pe	TokenNameIdentifier	 pe
.	TokenNameDOT	
getErrorOffset	TokenNameIdentifier	 get Error Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Invalid. 	TokenNameCOMMENT_LINE	Invalid. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// No zone information. 	TokenNameCOMMENT_LINE	No zone information. 
}	TokenNameRBRACE	
/** * Attempt to parse an input string with the allowed formats, returning * null if none of the formats work. */	TokenNameCOMMENT_JAVADOC	 Attempt to parse an input string with the allowed formats, returning null if none of the formats work. 
private	TokenNameprivate	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
testFormats	TokenNameIdentifier	 test Formats
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
formats	TokenNameIdentifier	 formats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
formats	TokenNameIdentifier	 formats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the input string and return the corresponding calendar field * number. */	TokenNameCOMMENT_JAVADOC	 Parse the input string and return the corresponding calendar field number. 
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
,	TokenNameCOMMA	
int	TokenNameint	
calField	TokenNameIdentifier	 cal Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try the allowed formats, from longest to shortest. 	TokenNameCOMMENT_LINE	Try the allowed formats, from longest to shortest. 
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
testFormats	TokenNameIdentifier	 test Formats
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
formats	TokenNameIdentifier	 formats
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
calField	TokenNameIdentifier	 cal Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the full name or abbreviation of the month or day. */	TokenNameCOMMENT_JAVADOC	 Get the full name or abbreviation of the month or day. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formatsIn	TokenNameIdentifier	 formats In
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
formatsIn	TokenNameIdentifier	 formats In
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
// from longest to shortest. 	TokenNameCOMMENT_LINE	from longest to shortest. 
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
formatsIn	TokenNameIdentifier	 formats In
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
applyPattern	TokenNameIdentifier	 apply Pattern
(	TokenNameLPAREN	
formatOut	TokenNameIdentifier	 format Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the full name or abbreviation for the current month or day * (no input string). */	TokenNameCOMMENT_JAVADOC	 Get the full name or abbreviation for the current month or day (no input string). 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getNameOrAbbrev	TokenNameIdentifier	 get Name Or Abbrev
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date:format-date function formats a date/time according to a pattern. * <p> * The first argument to date:format-date specifies the date/time to be * formatted. It must be right or left-truncated date/time strings in one of * the formats defined in * <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. * The permitted formats are as follows: * <ul> * <li>xs:dateTime (CCYY-MM-DDThh:mm:ss) * <li>xs:date (CCYY-MM-DD) * <li>xs:time (hh:mm:ss) * <li>xs:gYearMonth (CCYY-MM) * <li>xs:gYear (CCYY) * <li>xs:gMonthDay (--MM-DD) * <li>xs:gMonth (--MM--) * <li>xs:gDay (---DD) * </ul> * The second argument is a string that gives the format pattern used to * format the date. The format pattern must be in the syntax specified by * the JDK 1.1 SimpleDateFormat class. The format pattern string is * interpreted as described for the JDK 1.1 SimpleDateFormat class. * <p> * If the date/time format is right-truncated (i.e. in a format other than * xs:time, or xs:dateTime) then any missing components are assumed to be as * follows: if no month is specified, it is given a month of 01; if no day * is specified, it is given a day of 01; if no time is specified, it is * given a time of 00:00:00. * <p> * If the date/time format is left-truncated (i.e. xs:time, xs:gMonthDay, * xs:gMonth or xs:gDay) and the format pattern has a token that uses a * component that is missing from the date/time format used, then that token * is replaced with an empty string ('') within the result. * * The author is Helg Bredow (helg.bredow@kalido.com) */	TokenNameCOMMENT_JAVADOC	 The date:format-date function formats a date/time according to a pattern. <p> The first argument to date:format-date specifies the date/time to be formatted. It must be right or left-truncated date/time strings in one of the formats defined in <a href="http://www.w3.org/TR/xmlschema-2/">[XML Schema Part 2: Datatypes]</a>. The permitted formats are as follows: <ul> <li>xs:dateTime (CCYY-MM-DDThh:mm:ss) <li>xs:date (CCYY-MM-DD) <li>xs:time (hh:mm:ss) <li>xs:gYearMonth (CCYY-MM) <li>xs:gYear (CCYY) <li>xs:gMonthDay (--MM-DD) <li>xs:gMonth (--MM--) <li>xs:gDay (---DD) </ul> The second argument is a string that gives the format pattern used to format the date. The format pattern must be in the syntax specified by the JDK 1.1 SimpleDateFormat class. The format pattern string is interpreted as described for the JDK 1.1 SimpleDateFormat class. <p> If the date/time format is right-truncated (i.e. in a format other than xs:time, or xs:dateTime) then any missing components are assumed to be as follows: if no month is specified, it is given a month of 01; if no day is specified, it is given a day of 01; if no time is specified, it is given a time of 00:00:00. <p> If the date/time format is left-truncated (i.e. xs:time, xs:gMonthDay, xs:gMonth or xs:gDay) and the format pattern has a token that uses a component that is missing from the date/time format used, then that token is replaced with an empty string ('') within the result. * The author is Helg Bredow (helg.bredow@kalido.com) 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatDate	TokenNameIdentifier	 format Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
yearSymbols	TokenNameIdentifier	 year Symbols
=	TokenNameEQUAL	
"Gy"	TokenNameStringLiteral	Gy
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
monthSymbols	TokenNameIdentifier	 month Symbols
=	TokenNameEQUAL	
"M"	TokenNameStringLiteral	M
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
daySymbols	TokenNameIdentifier	 day Symbols
=	TokenNameEQUAL	
"dDEFwW"	TokenNameStringLiteral	dDEFwW
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zone	TokenNameIdentifier	 zone
;	TokenNameSEMICOLON	
// Get the timezone information if it was supplied and modify the 	TokenNameCOMMENT_LINE	Get the timezone information if it was supplied and modify the 
// dateTime so that SimpleDateFormat will understand it. 	TokenNameCOMMENT_LINE	dateTime so that SimpleDateFormat will understand it. 
if	TokenNameif	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"Z"	TokenNameStringLiteral	Z
)	TokenNameRPAREN	
||	TokenNameOR_OR	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"z"	TokenNameStringLiteral	z
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"GMT"	TokenNameStringLiteral	GMT
;	TokenNameSEMICOLON	
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
"z"	TokenNameStringLiteral	z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"+00:00"	TokenNameStringLiteral	+00:00
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"-00:00"	TokenNameStringLiteral	-00:00
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
"z"	TokenNameStringLiteral	z
;	TokenNameSEMICOLON	
// Need to adjust it since SimpleDateFormat requires GMT+hh:mm but 	TokenNameCOMMENT_LINE	Need to adjust it since SimpleDateFormat requires GMT+hh:mm but 
// we have +hh:mm. 	TokenNameCOMMENT_LINE	we have +hh:mm. 
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dateTime	TokenNameIdentifier	 date Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"GMT"	TokenNameStringLiteral	GMT
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume local time. 	TokenNameCOMMENT_LINE	Assume local time. 
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zone	TokenNameIdentifier	 zone
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Leave off the timezone since SimpleDateFormat will assume local 	TokenNameCOMMENT_LINE	Leave off the timezone since SimpleDateFormat will assume local 
// time if time zone is not included. 	TokenNameCOMMENT_LINE	time if time zone is not included. 
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
formats	TokenNameIdentifier	 formats
=	TokenNameEQUAL	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
+	TokenNamePLUS	
zone	TokenNameIdentifier	 zone
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
gym	TokenNameIdentifier	 gym
,	TokenNameCOMMA	
gy	TokenNameIdentifier	 gy
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Try the time format first. We need to do this to prevent 	TokenNameCOMMENT_LINE	Try the time format first. We need to do this to prevent 
// SimpleDateFormat from interpreting a time as a year. i.e we just need 	TokenNameCOMMENT_LINE	SimpleDateFormat from interpreting a time as a year. i.e we just need 
// to check if it's a time before we check it's a year. 	TokenNameCOMMENT_LINE	to check if it's a time before we check it's a year. 
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
inFormat	TokenNameIdentifier	 in Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
zone	TokenNameIdentifier	 zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
outFormat	TokenNameIdentifier	 out Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
strip	TokenNameIdentifier	 strip
(	TokenNameLPAREN	
yearSymbols	TokenNameIdentifier	 year Symbols
+	TokenNamePLUS	
monthSymbols	TokenNameIdentifier	 month Symbols
+	TokenNamePLUS	
daySymbols	TokenNameIdentifier	 day Symbols
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Try the right truncated formats. 	TokenNameCOMMENT_LINE	Try the right truncated formats. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
formats	TokenNameIdentifier	 formats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
inFormat	TokenNameIdentifier	 in Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
formats	TokenNameIdentifier	 formats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
outFormat	TokenNameIdentifier	 out Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now try the left truncated ones. The Java format() function doesn't 	TokenNameCOMMENT_LINE	Now try the left truncated ones. The Java format() function doesn't 
// return the correct strings in this case. We strip any pattern 	TokenNameCOMMENT_LINE	return the correct strings in this case. We strip any pattern 
// symbols that shouldn't be output so that they are not defaulted to 	TokenNameCOMMENT_LINE	symbols that shouldn't be output so that they are not defaulted to 
// inappropriate values in the output. 	TokenNameCOMMENT_LINE	inappropriate values in the output. 
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
inFormat	TokenNameIdentifier	 in Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
gmd	TokenNameIdentifier	 gmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
outFormat	TokenNameIdentifier	 out Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
strip	TokenNameIdentifier	 strip
(	TokenNameLPAREN	
yearSymbols	TokenNameIdentifier	 year Symbols
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
inFormat	TokenNameIdentifier	 in Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
gm	TokenNameIdentifier	 gm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
outFormat	TokenNameIdentifier	 out Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
strip	TokenNameIdentifier	 strip
(	TokenNameLPAREN	
yearSymbols	TokenNameIdentifier	 year Symbols
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
inFormat	TokenNameIdentifier	 in Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
inFormat	TokenNameIdentifier	 in Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
outFormat	TokenNameIdentifier	 out Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
strip	TokenNameIdentifier	 strip
(	TokenNameLPAREN	
yearSymbols	TokenNameIdentifier	 year Symbols
+	TokenNamePLUS	
monthSymbols	TokenNameIdentifier	 month Symbols
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outFormat	TokenNameIdentifier	 out Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strips occurrences of the given character from a date format pattern. * @param symbols list of symbols to strip. * @param pattern * @return */	TokenNameCOMMENT_JAVADOC	 Strips occurrences of the given character from a date format pattern. @param symbols list of symbols to strip. @param pattern @return 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
strip	TokenNameIdentifier	 strip
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbols	TokenNameIdentifier	 symbols
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
quoteSemaphore	TokenNameIdentifier	 quote Semaphore
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume it's an openening quote so simply copy the quoted 	TokenNameCOMMENT_LINE	Assume it's an openening quote so simply copy the quoted 
// text to the result. There is nothing to strip here. 	TokenNameCOMMENT_LINE	text to the result. There is nothing to strip here. 
int	TokenNameint	
endQuote	TokenNameIdentifier	 end Quote
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endQuote	TokenNameIdentifier	 end Quote
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endQuote	TokenNameIdentifier	 end Quote
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
endQuote	TokenNameIdentifier	 end Quote
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
endQuote	TokenNameIdentifier	 end Quote
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
symbols	TokenNameIdentifier	 symbols
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The char needs to be stripped. 	TokenNameCOMMENT_LINE	The char needs to be stripped. 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
