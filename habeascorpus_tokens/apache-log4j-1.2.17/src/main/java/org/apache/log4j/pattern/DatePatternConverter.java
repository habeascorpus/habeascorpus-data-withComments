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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
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
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
/** * Convert and format the event's date in a StringBuffer. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Convert and format the event's date in a StringBuffer. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * ABSOLUTE string literal. */	TokenNameCOMMENT_JAVADOC	 ABSOLUTE string literal. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSOLUTE_FORMAT	TokenNameIdentifier	 ABSOLUTE  FORMAT
=	TokenNameEQUAL	
"ABSOLUTE"	TokenNameStringLiteral	ABSOLUTE
;	TokenNameSEMICOLON	
/** * SimpleTimePattern for ABSOLUTE. */	TokenNameCOMMENT_JAVADOC	 SimpleTimePattern for ABSOLUTE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSOLUTE_TIME_PATTERN	TokenNameIdentifier	 ABSOLUTE  TIME  PATTERN
=	TokenNameEQUAL	
"HH:mm:ss,SSS"	TokenNameStringLiteral	HH:mm:ss,SSS
;	TokenNameSEMICOLON	
/** * DATE string literal. */	TokenNameCOMMENT_JAVADOC	 DATE string literal. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE_AND_TIME_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  FORMAT
=	TokenNameEQUAL	
"DATE"	TokenNameStringLiteral	DATE
;	TokenNameSEMICOLON	
/** * SimpleTimePattern for DATE. */	TokenNameCOMMENT_JAVADOC	 SimpleTimePattern for DATE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE_AND_TIME_PATTERN	TokenNameIdentifier	 DATE  AND  TIME  PATTERN
=	TokenNameEQUAL	
"dd MMM yyyy HH:mm:ss,SSS"	TokenNameStringLiteral	dd MMM yyyy HH:mm:ss,SSS
;	TokenNameSEMICOLON	
/** * ISO8601 string literal. */	TokenNameCOMMENT_JAVADOC	 ISO8601 string literal. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_FORMAT	TokenNameIdentifier	 IS O8601  FORMAT
=	TokenNameEQUAL	
"ISO8601"	TokenNameStringLiteral	ISO8601
;	TokenNameSEMICOLON	
/** * SimpleTimePattern for ISO8601. */	TokenNameCOMMENT_JAVADOC	 SimpleTimePattern for ISO8601. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ISO8601_PATTERN	TokenNameIdentifier	 IS O8601  PATTERN
=	TokenNameEQUAL	
"yyyy-MM-dd HH:mm:ss,SSS"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss,SSS
;	TokenNameSEMICOLON	
/** * Date format. */	TokenNameCOMMENT_JAVADOC	 Date format. 
private	TokenNameprivate	
final	TokenNamefinal	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
/** * This class wraps a DateFormat and forces the time zone to the * default time zone before each format and parse request. */	TokenNameCOMMENT_JAVADOC	 This class wraps a DateFormat and forces the time zone to the default time zone before each format and parse request. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DefaultZoneDateFormat	TokenNameIdentifier	 Default Zone Date Format
extends	TokenNameextends	
DateFormat	TokenNameIdentifier	 Date Format
{	TokenNameLBRACE	
/** * Serialization version ID. */	TokenNameCOMMENT_JAVADOC	 Serialization version ID. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Wrapped instance of DateFormat. */	TokenNameCOMMENT_JAVADOC	 Wrapped instance of DateFormat. 
private	TokenNameprivate	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
/** * Construct new instance. * @param format format, may not be null. */	TokenNameCOMMENT_JAVADOC	 Construct new instance. @param format format, may not be null. 
public	TokenNamepublic	
DefaultZoneDateFormat	TokenNameIdentifier	 Default Zone Date Format
(	TokenNameLPAREN	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
FieldPosition	TokenNameIdentifier	 Field Position
fieldPosition	TokenNameIdentifier	 field Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
,	TokenNameCOMMA	
fieldPosition	TokenNameIdentifier	 field Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Private constructor. * @param options options, may be null. */	TokenNameCOMMENT_JAVADOC	 Private constructor. @param options options, may be null. 
private	TokenNameprivate	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Date"	TokenNameStringLiteral	Date
,	TokenNameCOMMA	
"date"	TokenNameStringLiteral	date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
patternOption	TokenNameIdentifier	 pattern Option
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the branch could be optimized, but here we are making explicit 	TokenNameCOMMENT_LINE	the branch could be optimized, but here we are making explicit 
// that null values for patternOption are allowed. 	TokenNameCOMMENT_LINE	that null values for patternOption are allowed. 
patternOption	TokenNameIdentifier	 pattern Option
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
patternOption	TokenNameIdentifier	 pattern Option
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
patternOption	TokenNameIdentifier	 pattern Option
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
patternOption	TokenNameIdentifier	 pattern Option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ISO8601_FORMAT	TokenNameIdentifier	 IS O8601  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
ISO8601_PATTERN	TokenNameIdentifier	 IS O8601  PATTERN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
patternOption	TokenNameIdentifier	 pattern Option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ABSOLUTE_FORMAT	TokenNameIdentifier	 ABSOLUTE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
ABSOLUTE_TIME_PATTERN	TokenNameIdentifier	 ABSOLUTE  TIME  PATTERN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
patternOption	TokenNameIdentifier	 pattern Option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
DATE_AND_TIME_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
DATE_AND_TIME_PATTERN	TokenNameIdentifier	 DATE  AND  TIME  PATTERN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
patternOption	TokenNameIdentifier	 pattern Option
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
maximumCacheValidity	TokenNameIdentifier	 maximum Cache Validity
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maximumCacheValidity	TokenNameIdentifier	 maximum Cache Validity
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
getMaximumCacheValidity	TokenNameIdentifier	 get Maximum Cache Validity
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not instantiate SimpleDateFormat with pattern "	TokenNameStringLiteral	Could not instantiate SimpleDateFormat with pattern 
+	TokenNamePLUS	
patternOption	TokenNameIdentifier	 pattern Option
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// default to the ISO8601 format 	TokenNameCOMMENT_LINE	default to the ISO8601 format 
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
ISO8601_PATTERN	TokenNameIdentifier	 IS O8601  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the option list contains a TZ option, then set it. 	TokenNameCOMMENT_LINE	if the option list contains a TZ option, then set it. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
tz	TokenNameIdentifier	 tz
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
options	TokenNameIdentifier	 options
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleFormat	TokenNameIdentifier	 simple Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
tz	TokenNameIdentifier	 tz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultZoneDateFormat	TokenNameIdentifier	 Default Zone Date Format
(	TokenNameLPAREN	
simpleFormat	TokenNameIdentifier	 simple Format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
simpleFormat	TokenNameIdentifier	 simple Format
,	TokenNameCOMMA	
maximumCacheValidity	TokenNameIdentifier	 maximum Cache Validity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of pattern converter. * @param options options, may be null. * @return instance of pattern converter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of pattern converter. @param options options, may be null. @return instance of pattern converter. 
public	TokenNamepublic	
static	TokenNamestatic	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Date	TokenNameIdentifier	 Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append formatted date to string buffer. * @param date date * @param toAppendTo buffer to which formatted date is appended. */	TokenNameCOMMENT_JAVADOC	 Append formatted date to string buffer. @param date date @param toAppendTo buffer to which formatted date is appended. 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
