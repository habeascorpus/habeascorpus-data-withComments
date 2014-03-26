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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormatSymbols	TokenNameIdentifier	 Date Format Symbols
;	TokenNameSEMICOLON	
/** Formats a {@link Date} in the format "dd MMM yyyy HH:mm:ss,SSS" for example, "06 Nov 1994 15:49:37,459". @author Ceki G&uuml;lc&uuml; @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Formats a {@link Date} in the format "dd MMM yyyy HH:mm:ss,SSS" for example, "06 Nov 1994 15:49:37,459". @author Ceki G&uuml;lc&uuml; @since 0.7.5 
public	TokenNamepublic	
class	TokenNameclass	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
extends	TokenNameextends	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5547637772208514971L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shortMonths	TokenNameIdentifier	 short Months
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shortMonths	TokenNameIdentifier	 short Months
=	TokenNameEQUAL	
new	TokenNamenew	
DateFormatSymbols	TokenNameIdentifier	 Date Format Symbols
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getShortMonths	TokenNameIdentifier	 get Short Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** Appends to <code>sbuf</code> the date in the format "dd MMM yyyy HH:mm:ss,SSS" for example, "06 Nov 1994 08:49:37,459". @param sbuf the string buffer to write to */	TokenNameCOMMENT_JAVADOC	 Appends to <code>sbuf</code> the date in the format "dd MMM yyyy HH:mm:ss,SSS" for example, "06 Nov 1994 08:49:37,459". @param sbuf the string buffer to write to 
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
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
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
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
shortMonths	TokenNameIdentifier	 short Months
[	TokenNameLBRACKET	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
fieldPosition	TokenNameIdentifier	 field Position
)	TokenNameRPAREN	
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
