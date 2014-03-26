/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
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
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
ParsePosition	TokenNameIdentifier	 Parse Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
/** Formats a {@link Date} in the format "HH:mm:ss,SSS" for example, "15:49:37,459". @author Ceki G&uuml;lc&uuml; @author Andrew Vajoczki @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Formats a {@link Date} in the format "HH:mm:ss,SSS" for example, "15:49:37,459". @author Ceki G&uuml;lc&uuml; @author Andrew Vajoczki @since 0.7.5 
public	TokenNamepublic	
class	TokenNameclass	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
extends	TokenNameextends	
DateFormat	TokenNameIdentifier	 Date Format
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
388856345976723342L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** String constant used to specify {@link org.apache.log4j.helpers.AbsoluteTimeDateFormat} in layouts. Current value is <b>ABSOLUTE</b>. */	TokenNameCOMMENT_JAVADOC	 String constant used to specify {@link org.apache.log4j.helpers.AbsoluteTimeDateFormat} in layouts. Current value is <b>ABSOLUTE</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ABS_TIME_DATE_FORMAT	TokenNameIdentifier	 ABS  TIME  DATE  FORMAT
=	TokenNameEQUAL	
"ABSOLUTE"	TokenNameStringLiteral	ABSOLUTE
;	TokenNameSEMICOLON	
/** String constant used to specify {@link org.apache.log4j.helpers.DateTimeDateFormat} in layouts. Current value is <b>DATE</b>. */	TokenNameCOMMENT_JAVADOC	 String constant used to specify {@link org.apache.log4j.helpers.DateTimeDateFormat} in layouts. Current value is <b>DATE</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DATE_AND_TIME_DATE_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  DATE  FORMAT
=	TokenNameEQUAL	
"DATE"	TokenNameStringLiteral	DATE
;	TokenNameSEMICOLON	
/** String constant used to specify {@link org.apache.log4j.helpers.ISO8601DateFormat} in layouts. Current value is <b>ISO8601</b>. */	TokenNameCOMMENT_JAVADOC	 String constant used to specify {@link org.apache.log4j.helpers.ISO8601DateFormat} in layouts. Current value is <b>ISO8601</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ISO8601_DATE_FORMAT	TokenNameIdentifier	 IS O8601  DATE  FORMAT
=	TokenNameEQUAL	
"ISO8601"	TokenNameStringLiteral	ISO8601
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCalendar	TokenNameIdentifier	 set Calendar
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCalendar	TokenNameIdentifier	 set Calendar
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
previousTime	TokenNameIdentifier	 previous Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
previousTimeWithoutMillis	TokenNameIdentifier	 previous Time Without Millis
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// "HH:mm:ss." 	TokenNameCOMMENT_LINE	"HH:mm:ss." 
/** Appends to <code>sbuf</code> the time in the format "HH:mm:ss,SSS" for example, "15:49:37,459" @param date the date to format @param sbuf the string buffer to write to @param fieldPosition remains untouched */	TokenNameCOMMENT_JAVADOC	 Appends to <code>sbuf</code> the time in the format "HH:mm:ss,SSS" for example, "15:49:37,459" @param date the date to format @param sbuf the string buffer to write to @param fieldPosition remains untouched 
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
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
%	TokenNameREMAINDER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
previousTime	TokenNameIdentifier	 previous Time
||	TokenNameOR_OR	
previousTimeWithoutMillis	TokenNameIdentifier	 previous Time Without Millis
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We reach this point at most once per second 	TokenNameCOMMENT_LINE	We reach this point at most once per second 
// across all threads instead of each time format() 	TokenNameCOMMENT_LINE	across all threads instead of each time format() 
// is called. This saves considerable CPU time. 	TokenNameCOMMENT_LINE	is called. This saves considerable CPU time. 
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
mins	TokenNameIdentifier	 mins
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mins	TokenNameIdentifier	 mins
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mins	TokenNameIdentifier	 mins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
secs	TokenNameIdentifier	 secs
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secs	TokenNameIdentifier	 secs
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
secs	TokenNameIdentifier	 secs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// store the time string for next time to avoid recomputation 	TokenNameCOMMENT_LINE	store the time string for next time to avoid recomputation 
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
previousTimeWithoutMillis	TokenNameIdentifier	 previous Time Without Millis
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousTime	TokenNameIdentifier	 previous Time
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
previousTimeWithoutMillis	TokenNameIdentifier	 previous Time Without Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method does not do anything but return <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 This method does not do anything but return <code>null</code>. 
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
