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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
// Contributors: Arndt Schoenewald <arndt@ibm23093i821.mc.schoenewald.de> 	TokenNameCOMMENT_LINE	Contributors: Arndt Schoenewald <arndt@ibm23093i821.mc.schoenewald.de> 
/** Formats a {@link Date} in the format "yyyy-MM-dd HH:mm:ss,SSS" for example "1999-11-27 15:49:37,459". <p>Refer to the <a href=http://www.cl.cam.ac.uk/~mgk25/iso-time.html>summary of the International Standard Date and Time Notation</a> for more information on this format. @author Ceki G&uuml;lc&uuml; @author Andrew Vajoczki @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Formats a {@link Date} in the format "yyyy-MM-dd HH:mm:ss,SSS" for example "1999-11-27 15:49:37,459". <p>Refer to the <a href=http://www.cl.cam.ac.uk/~mgk25/iso-time.html>summary of the International Standard Date and Time Notation</a> for more information on this format. @author Ceki G&uuml;lc&uuml; @author Andrew Vajoczki @since 0.7.5 
public	TokenNamepublic	
class	TokenNameclass	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
extends	TokenNameextends	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
759840745298755296L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
long	TokenNamelong	
lastTime	TokenNameIdentifier	 last Time
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastTimeString	TokenNameIdentifier	 last Time String
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Appends a date in the format "YYYY-mm-dd HH:mm:ss,SSS" to <code>sbuf</code>. For example: "1999-11-27 15:49:37,459". @param sbuf the <code>StringBuffer</code> to write to */	TokenNameCOMMENT_JAVADOC	 Appends a date in the format "YYYY-mm-dd HH:mm:ss,SSS" to <code>sbuf</code>. For example: "1999-11-27 15:49:37,459". @param sbuf the <code>StringBuffer</code> to write to 
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
lastTime	TokenNameIdentifier	 last Time
||	TokenNameOR_OR	
lastTimeString	TokenNameIdentifier	 last Time String
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
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-01-"	TokenNameStringLiteral	-01-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
FEBRUARY	TokenNameIdentifier	 FEBRUARY
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-02-"	TokenNameStringLiteral	-02-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MARCH	TokenNameIdentifier	 MARCH
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-03-"	TokenNameStringLiteral	-03-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
APRIL	TokenNameIdentifier	 APRIL
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-04-"	TokenNameStringLiteral	-04-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MAY	TokenNameIdentifier	 MAY
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-05-"	TokenNameStringLiteral	-05-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JUNE	TokenNameIdentifier	 JUNE
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-06-"	TokenNameStringLiteral	-06-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JULY	TokenNameIdentifier	 JULY
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-07-"	TokenNameStringLiteral	-07-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
AUGUST	TokenNameIdentifier	 AUGUST
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-08-"	TokenNameStringLiteral	-08-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SEPTEMBER	TokenNameIdentifier	 SEPTEMBER
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-09-"	TokenNameStringLiteral	-09-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
OCTOBER	TokenNameIdentifier	 OCTOBER
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-10-"	TokenNameStringLiteral	-10-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
NOVEMBER	TokenNameIdentifier	 NOVEMBER
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-11-"	TokenNameStringLiteral	-11-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DECEMBER	TokenNameIdentifier	 DECEMBER
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-12-"	TokenNameStringLiteral	-12-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
"-NA-"	TokenNameStringLiteral	-NA-
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
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
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
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
lastTimeString	TokenNameIdentifier	 last Time String
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastTime	TokenNameIdentifier	 last Time
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
lastTimeString	TokenNameIdentifier	 last Time String
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
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
