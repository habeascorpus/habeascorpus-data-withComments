/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ChoiceFormat	TokenNameIdentifier	 Choice Format
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
MessageFormat	TokenNameIdentifier	 Message Format
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
/** * Helper methods to deal with date/time formatting with a specific * defined format (<a href="http://www.w3.org/TR/NOTE-datetime">ISO8601</a>) * or a plurialization correct elapsed time in minutes and seconds. * * @since Ant 1.5 * */	TokenNameCOMMENT_JAVADOC	 Helper methods to deal with date/time formatting with a specific defined format (<a href="http://www.w3.org/TR/NOTE-datetime">ISO8601</a>) or a plurialization correct elapsed time in minutes and seconds. * @since Ant 1.5 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DateUtils	TokenNameIdentifier	 Date Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TEN	TokenNameIdentifier	 TEN
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * ISO8601-like pattern for date-time. It does not support timezone. * <tt>yyyy-MM-ddTHH:mm:ss</tt> */	TokenNameCOMMENT_JAVADOC	 ISO8601-like pattern for date-time. It does not support timezone. <tt>yyyy-MM-ddTHH:mm:ss</tt> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_DATETIME_PATTERN	TokenNameIdentifier	 IS O8601  DATETIME  PATTERN
=	TokenNameEQUAL	
"yyyy-MM-dd'T'HH:mm:ss"	TokenNameStringLiteral	yyyy-MM-dd'T'HH:mm:ss
;	TokenNameSEMICOLON	
/** * ISO8601-like pattern for date. <tt>yyyy-MM-dd</tt> */	TokenNameCOMMENT_JAVADOC	 ISO8601-like pattern for date. <tt>yyyy-MM-dd</tt> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_DATE_PATTERN	TokenNameIdentifier	 IS O8601  DATE  PATTERN
=	TokenNameEQUAL	
"yyyy-MM-dd"	TokenNameStringLiteral	yyyy-MM-dd
;	TokenNameSEMICOLON	
/** * ISO8601-like pattern for time. <tt>HH:mm:ss</tt> */	TokenNameCOMMENT_JAVADOC	 ISO8601-like pattern for time. <tt>HH:mm:ss</tt> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_TIME_PATTERN	TokenNameIdentifier	 IS O8601  TIME  PATTERN
=	TokenNameEQUAL	
"HH:mm:ss"	TokenNameStringLiteral	HH:mm:ss
;	TokenNameSEMICOLON	
/** * Format used for SMTP (and probably other) Date headers. * @deprecated DateFormat is not thread safe, and we cannot guarantee that * some other code is using the format in parallel. * Deprecated since ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Format used for SMTP (and probably other) Date headers. @deprecated DateFormat is not thread safe, and we cannot guarantee that some other code is using the format in parallel. Deprecated since ant 1.8 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
DATE_HEADER_FORMAT	TokenNameIdentifier	 DATE  HEADER  FORMAT
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"EEE, dd MMM yyyy HH:mm:ss "	TokenNameStringLiteral	EEE, dd MMM yyyy HH:mm:ss 
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
DATE_HEADER_FORMAT_INT	TokenNameIdentifier	 DATE  HEADER  FORMAT  INT
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"EEE, dd MMM yyyy HH:mm:ss "	TokenNameStringLiteral	EEE, dd MMM yyyy HH:mm:ss 
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// code from Magesh moved from DefaultLogger and slightly modified 	TokenNameCOMMENT_LINE	code from Magesh moved from DefaultLogger and slightly modified 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
MessageFormat	TokenNameIdentifier	 Message Format
MINUTE_SECONDS	TokenNameIdentifier	 MINUTE  SECONDS
=	TokenNameEQUAL	
new	TokenNamenew	
MessageFormat	TokenNameIdentifier	 Message Format
(	TokenNameLPAREN	
"{0}{1}"	TokenNameStringLiteral	{0}{1}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LIMITS	TokenNameIdentifier	 LIMITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MINUTES_PART	TokenNameIdentifier	 MINUTES  PART
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1 minute "	TokenNameStringLiteral	1 minute 
,	TokenNameCOMMA	
"{0,number,###############} minutes "	TokenNameStringLiteral	{0,number,###############} minutes 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SECONDS_PART	TokenNameIdentifier	 SECONDS  PART
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"0 seconds"	TokenNameStringLiteral	0 seconds
,	TokenNameCOMMA	
"1 second"	TokenNameStringLiteral	1 second
,	TokenNameCOMMA	
"{1,number} seconds"	TokenNameStringLiteral	{1,number} seconds
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ChoiceFormat	TokenNameIdentifier	 Choice Format
MINUTES_FORMAT	TokenNameIdentifier	 MINUTES  FORMAT
=	TokenNameEQUAL	
new	TokenNamenew	
ChoiceFormat	TokenNameIdentifier	 Choice Format
(	TokenNameLPAREN	
LIMITS	TokenNameIdentifier	 LIMITS
,	TokenNameCOMMA	
MINUTES_PART	TokenNameIdentifier	 MINUTES  PART
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ChoiceFormat	TokenNameIdentifier	 Choice Format
SECONDS_FORMAT	TokenNameIdentifier	 SECONDS  FORMAT
=	TokenNameEQUAL	
new	TokenNamenew	
ChoiceFormat	TokenNameIdentifier	 Choice Format
(	TokenNameLPAREN	
LIMITS	TokenNameIdentifier	 LIMITS
,	TokenNameCOMMA	
SECONDS_PART	TokenNameIdentifier	 SECONDS  PART
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
MINUTE_SECONDS	TokenNameIdentifier	 MINUTE  SECONDS
.	TokenNameDOT	
setFormat	TokenNameIdentifier	 set Format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MINUTES_FORMAT	TokenNameIdentifier	 MINUTES  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MINUTE_SECONDS	TokenNameIdentifier	 MINUTE  SECONDS
.	TokenNameDOT	
setFormat	TokenNameIdentifier	 set Format
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SECONDS_FORMAT	TokenNameIdentifier	 SECONDS  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** private constructor */	TokenNameCOMMENT_JAVADOC	 private constructor 
private	TokenNameprivate	
DateUtils	TokenNameIdentifier	 Date Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Format a date/time into a specific pattern. * @param date the date to format expressed in milliseconds. * @param pattern the pattern to use to format the date. * @return the formatted date. */	TokenNameCOMMENT_JAVADOC	 Format a date/time into a specific pattern. @param date the date to format expressed in milliseconds. @param pattern the pattern to use to format the date. @return the formatted date. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
long	TokenNamelong	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format a date/time into a specific pattern. * @param date the date to format expressed in milliseconds. * @param pattern the pattern to use to format the date. * @return the formatted date. */	TokenNameCOMMENT_JAVADOC	 Format a date/time into a specific pattern. @param date the date to format expressed in milliseconds. @param pattern the pattern to use to format the date. @return the formatted date. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
createDateFormat	TokenNameIdentifier	 create Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format an elapsed time into a plurialization correct string. * It is limited only to report elapsed time in minutes and * seconds and has the following behavior. * <ul> * <li>minutes are not displayed when 0. (ie: "45 seconds")</li> * <li>seconds are always displayed in plural form (ie "0 seconds" or * "10 seconds") except for 1 (ie "1 second")</li> * </ul> * @param millis the elapsed time to report in milliseconds. * @return the formatted text in minutes/seconds. */	TokenNameCOMMENT_JAVADOC	 Format an elapsed time into a plurialization correct string. It is limited only to report elapsed time in minutes and seconds and has the following behavior. <ul> <li>minutes are not displayed when 0. (ie: "45 seconds")</li> <li>seconds are always displayed in plural form (ie "0 seconds" or "10 seconds") except for 1 (ie "1 second")</li> </ul> @param millis the elapsed time to report in milliseconds. @return the formatted text in minutes/seconds. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
millis	TokenNameIdentifier	 millis
/	TokenNameDIVIDE	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
;	TokenNameSEMICOLON	
long	TokenNamelong	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
/	TokenNameDIVIDE	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
%	TokenNameREMAINDER	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
MINUTE_SECONDS	TokenNameIdentifier	 MINUTE  SECONDS
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return a lenient date format set to GMT time zone. * @param pattern the pattern used for date/time formatting. * @return the configured format for this pattern. */	TokenNameCOMMENT_JAVADOC	 return a lenient date format set to GMT time zone. @param pattern the pattern used for date/time formatting. @return the configured format for this pattern. 
private	TokenNameprivate	
static	TokenNamestatic	
DateFormat	TokenNameIdentifier	 Date Format
createDateFormat	TokenNameIdentifier	 create Date Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
gmt	TokenNameIdentifier	 gmt
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
gmt	TokenNameIdentifier	 gmt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sdf	TokenNameIdentifier	 sdf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the phase of the moon for a given date. * * <p>Code heavily influenced by hacklib.c in <a * href="http://www.nethack.org/">Nethack</a></p> * * <p>The Algorithm: * * <pre> * moon period = 29.53058 days ~= 30, year = 365.2422 days * * days moon phase advances on first day of year compared to preceding year * = 365.2422 - 12*29.53058 ~= 11 * * years in Metonic cycle (time until same phases fall on the same days of * the month) = 18.6 ~= 19 * * moon phase on first day of year (epact) ~= (11*(year%19) + 18) % 30 * (18 as initial condition for 1900) * * current phase in days = first day phase + days elapsed in year * * 6 moons ~= 177 days * 177 ~= 8 reported phases * 22 * + 11/22 for rounding * </pre> * * @param cal the calander. * * @return The phase of the moon as a number between 0 and 7 with * 0 meaning new moon and 4 meaning full moon. * * @since 1.2, Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Calculate the phase of the moon for a given date. * <p>Code heavily influenced by hacklib.c in <a href="http://www.nethack.org/">Nethack</a></p> * <p>The Algorithm: * <pre> moon period = 29.53058 days ~= 30, year = 365.2422 days * days moon phase advances on first day of year compared to preceding year = 365.2422 - 12*29.53058 ~= 11 * years in Metonic cycle (time until same phases fall on the same days of the month) = 18.6 ~= 19 * moon phase on first day of year (epact) ~= (11*(year%19) + 18) % 30 (18 as initial condition for 1900) * current phase in days = first day phase + days elapsed in year * 6 moons ~= 177 days 177 ~= 8 reported phases 22 + 11/22 for rounding </pre> * @param cal the calander. * @return The phase of the moon as a number between 0 and 7 with 0 meaning new moon and 4 meaning full moon. * @since 1.2, Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getPhaseOfMoon	TokenNameIdentifier	 get Phase Of Moon
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
int	TokenNameint	
dayOfTheYear	TokenNameIdentifier	 day Of The Year
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_YEAR	TokenNameIdentifier	 DAY  OF  YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yearInMetonicCycle	TokenNameIdentifier	 year In Metonic Cycle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
-	TokenNameMINUS	
1900	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
epact	TokenNameIdentifier	 epact
=	TokenNameEQUAL	
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
yearInMetonicCycle	TokenNameIdentifier	 year In Metonic Cycle
+	TokenNamePLUS	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
epact	TokenNameIdentifier	 epact
==	TokenNameEQUAL_EQUAL	
25	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
yearInMetonicCycle	TokenNameIdentifier	 year In Metonic Cycle
>	TokenNameGREATER	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
epact	TokenNameIdentifier	 epact
==	TokenNameEQUAL_EQUAL	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
epact	TokenNameIdentifier	 epact
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dayOfTheYear	TokenNameIdentifier	 day Of The Year
+	TokenNamePLUS	
epact	TokenNameIdentifier	 epact
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
177	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
22	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * Returns the current Date in a format suitable for a SMTP date * header. * @return the current date. * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Returns the current Date in a format suitable for a SMTP date header. @return the current date. @since Ant 1.5.2 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getDateForHeader	TokenNameIdentifier	 get Date For Header
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
TimeZone	TokenNameIdentifier	 Time Zone
tz	TokenNameIdentifier	 tz
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
tz	TokenNameIdentifier	 tz
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK	TokenNameIdentifier	 DAY  OF  WEEK
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
tzMarker	TokenNameIdentifier	 tz Marker
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"-"	TokenNameStringLiteral	-
:	TokenNameCOLON	
"+"	TokenNameStringLiteral	+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
*	TokenNameMULTIPLY	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
*	TokenNameMULTIPLY	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
*	TokenNameMULTIPLY	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
)	TokenNameRPAREN	
-	TokenNameMINUS	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
*	TokenNameMULTIPLY	
hours	TokenNameIdentifier	 hours
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
<	TokenNameLESS	
TEN	TokenNameIdentifier	 TEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tzMarker	TokenNameIdentifier	 tz Marker
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tzMarker	TokenNameIdentifier	 tz Marker
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
<	TokenNameLESS	
TEN	TokenNameIdentifier	 TEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tzMarker	TokenNameIdentifier	 tz Marker
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tzMarker	TokenNameIdentifier	 tz Marker
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
DATE_HEADER_FORMAT_INT	TokenNameIdentifier	 DATE  HEADER  FORMAT  INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DATE_HEADER_FORMAT_INT	TokenNameIdentifier	 DATE  HEADER  FORMAT  INT
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
tzMarker	TokenNameIdentifier	 tz Marker
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses the string in a format suitable for a SMTP date header. * * @param datestr string to be parsed * * @return a java.util.Date object as parsed by the format. * @exception ParseException if the supplied string cannot be parsed by * this pattern. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Parses the string in a format suitable for a SMTP date header. * @param datestr string to be parsed * @return a java.util.Date object as parsed by the format. @exception ParseException if the supplied string cannot be parsed by this pattern. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
parseDateFromHeader	TokenNameIdentifier	 parse Date From Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
DATE_HEADER_FORMAT_INT	TokenNameIdentifier	 DATE  HEADER  FORMAT  INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DATE_HEADER_FORMAT_INT	TokenNameIdentifier	 DATE  HEADER  FORMAT  INT
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parse a string as a datetime using the ISO8601_DATETIME format which is * <code>yyyy-MM-dd'T'HH:mm:ss</code> * * @param datestr string to be parsed * * @return a java.util.Date object as parsed by the format. * @exception ParseException if the supplied string cannot be parsed by * this pattern. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Parse a string as a datetime using the ISO8601_DATETIME format which is <code>yyyy-MM-dd'T'HH:mm:ss</code> * @param datestr string to be parsed * @return a java.util.Date object as parsed by the format. @exception ParseException if the supplied string cannot be parsed by this pattern. @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
parseIso8601DateTime	TokenNameIdentifier	 parse Iso8601 Date Time
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
ISO8601_DATETIME_PATTERN	TokenNameIdentifier	 IS O8601  DATETIME  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a string as a date using the ISO8601_DATE format which is * <code>yyyy-MM-dd</code> * * @param datestr string to be parsed * * @return a java.util.Date object as parsed by the format. * @exception ParseException if the supplied string cannot be parsed by * this pattern. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Parse a string as a date using the ISO8601_DATE format which is <code>yyyy-MM-dd</code> * @param datestr string to be parsed * @return a java.util.Date object as parsed by the format. @exception ParseException if the supplied string cannot be parsed by this pattern. @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
parseIso8601Date	TokenNameIdentifier	 parse Iso8601 Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
ISO8601_DATE_PATTERN	TokenNameIdentifier	 IS O8601  DATE  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a string as a date using the either the ISO8601_DATETIME * or ISO8601_DATE formats. * * @param datestr string to be parsed * * @return a java.util.Date object as parsed by the formats. * @exception ParseException if the supplied string cannot be parsed by * either of these patterns. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Parse a string as a date using the either the ISO8601_DATETIME or ISO8601_DATE formats. * @param datestr string to be parsed * @return a java.util.Date object as parsed by the formats. @exception ParseException if the supplied string cannot be parsed by either of these patterns. @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
Date	TokenNameIdentifier	 Date
parseIso8601DateTimeOrDate	TokenNameIdentifier	 parse Iso8601 Date Time Or Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
parseIso8601DateTime	TokenNameIdentifier	 parse Iso8601 Date Time
(	TokenNameLPAREN	
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
px	TokenNameIdentifier	 px
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parseIso8601Date	TokenNameIdentifier	 parse Iso8601 Date
(	TokenNameLPAREN	
datestr	TokenNameIdentifier	 datestr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
