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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
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
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
FieldPosition	TokenNameIdentifier	 Field Position
;	TokenNameSEMICOLON	
/** This abstract layout takes care of all the date related options and formatting work. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 This abstract layout takes care of all the date related options and formatting work. @author Ceki G&uuml;lc&uuml; 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
DateLayout	TokenNameIdentifier	 Date Layout
extends	TokenNameextends	
Layout	TokenNameIdentifier	 Layout
{	TokenNameLBRACE	
/** String constant designating no time information. Current value of this constant is <b>NULL</b>. */	TokenNameCOMMENT_JAVADOC	 String constant designating no time information. Current value of this constant is <b>NULL</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NULL_DATE_FORMAT	TokenNameIdentifier	 NULL  DATE  FORMAT
=	TokenNameEQUAL	
"NULL"	TokenNameStringLiteral	NULL
;	TokenNameSEMICOLON	
/** String constant designating relative time. Current value of this constant is <b>RELATIVE</b>. */	TokenNameCOMMENT_JAVADOC	 String constant designating relative time. Current value of this constant is <b>RELATIVE</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
RELATIVE_TIME_DATE_FORMAT	TokenNameIdentifier	 RELATIVE  TIME  DATE  FORMAT
=	TokenNameEQUAL	
"RELATIVE"	TokenNameStringLiteral	RELATIVE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FieldPosition	TokenNameIdentifier	 Field Position
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPosition	TokenNameIdentifier	 Field Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. */	TokenNameCOMMENT_JAVADOC	 @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
DATE_FORMAT_OPTION	TokenNameIdentifier	 DATE  FORMAT  OPTION
=	TokenNameEQUAL	
"DateFormat"	TokenNameStringLiteral	DateFormat
;	TokenNameSEMICOLON	
/** @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. */	TokenNameCOMMENT_JAVADOC	 @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
TIMEZONE_OPTION	TokenNameIdentifier	 TIMEZONE  OPTION
=	TokenNameEQUAL	
"TimeZone"	TokenNameStringLiteral	TimeZone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
timeZoneID	TokenNameIdentifier	 time Zone ID
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dateFormatOption	TokenNameIdentifier	 date Format Option
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DATE_FORMAT_OPTION	TokenNameIdentifier	 DATE  FORMAT  OPTION
,	TokenNameCOMMA	
TIMEZONE_OPTION	TokenNameIdentifier	 TIMEZONE  OPTION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
DATE_FORMAT_OPTION	TokenNameIdentifier	 DATE  FORMAT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormatOption	TokenNameIdentifier	 date Format Option
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
TIMEZONE_OPTION	TokenNameIdentifier	 TIMEZONE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeZoneID	TokenNameIdentifier	 time Zone ID
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The value of the <b>DateFormat</b> option should be either an argument to the constructor of {@link SimpleDateFormat} or one of the srings "NULL", "RELATIVE", "ABSOLUTE", "DATE" or "ISO8601. */	TokenNameCOMMENT_JAVADOC	 The value of the <b>DateFormat</b> option should be either an argument to the constructor of {@link SimpleDateFormat} or one of the srings "NULL", "RELATIVE", "ABSOLUTE", "DATE" or "ISO8601. 
public	TokenNamepublic	
void	TokenNamevoid	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormatOption	TokenNameIdentifier	 date Format Option
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
dateFormatOption	TokenNameIdentifier	 date Format Option
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>DateFormat</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>DateFormat</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDateFormat	TokenNameIdentifier	 get Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dateFormatOption	TokenNameIdentifier	 date Format Option
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>TimeZoneID</b> option is a time zone ID string in the format expected by the {@link TimeZone#getTimeZone} method. */	TokenNameCOMMENT_JAVADOC	 The <b>TimeZoneID</b> option is a time zone ID string in the format expected by the {@link TimeZone#getTimeZone} method. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeZoneID	TokenNameIdentifier	 time Zone ID
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>TimeZone</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>TimeZone</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeZoneID	TokenNameIdentifier	 time Zone ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
dateFormatOption	TokenNameIdentifier	 date Format Option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timeZoneID	TokenNameIdentifier	 time Zone ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dateFormat	TokenNameIdentifier	 date Format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
timeZoneID	TokenNameIdentifier	 time Zone ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dateFormat	TokenNameIdentifier	 date Format
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sets the {@link DateFormat} used to format time and date in the zone determined by <code>timeZone</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link DateFormat} used to format time and date in the zone determined by <code>timeZone</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the DateFormat used to format date and time in the time zone determined by <code>timeZone</code> parameter. The {@link DateFormat} used will depend on the <code>dateFormatType</code>. <p>The recognized types are {@link #NULL_DATE_FORMAT}, {@link #RELATIVE_TIME_DATE_FORMAT} {@link AbsoluteTimeDateFormat#ABS_TIME_DATE_FORMAT}, {@link AbsoluteTimeDateFormat#DATE_AND_TIME_DATE_FORMAT} and {@link AbsoluteTimeDateFormat#ISO8601_DATE_FORMAT}. If the <code>dateFormatType</code> is not one of the above, then the argument is assumed to be a date pattern for {@link SimpleDateFormat}. */	TokenNameCOMMENT_JAVADOC	 Sets the DateFormat used to format date and time in the time zone determined by <code>timeZone</code> parameter. The {@link DateFormat} used will depend on the <code>dateFormatType</code>. <p>The recognized types are {@link #NULL_DATE_FORMAT}, {@link #RELATIVE_TIME_DATE_FORMAT} {@link AbsoluteTimeDateFormat#ABS_TIME_DATE_FORMAT}, {@link AbsoluteTimeDateFormat#DATE_AND_TIME_DATE_FORMAT} and {@link AbsoluteTimeDateFormat#ISO8601_DATE_FORMAT}. If the <code>dateFormatType</code> is not one of the above, then the argument is assumed to be a date pattern for {@link SimpleDateFormat}. 
public	TokenNamepublic	
void	TokenNamevoid	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateFormatType	TokenNameIdentifier	 date Format Type
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
NULL_DATE_FORMAT	TokenNameIdentifier	 NULL  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
RELATIVE_TIME_DATE_FORMAT	TokenNameIdentifier	 RELATIVE  TIME  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
RelativeTimeDateFormat	TokenNameIdentifier	 Relative Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
ABS_TIME_DATE_FORMAT	TokenNameIdentifier	 ABS  TIME  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
DATE_AND_TIME_DATE_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
ISO8601_DATE_FORMAT	TokenNameIdentifier	 IS O8601  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
dateFormatType	TokenNameIdentifier	 date Format Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
