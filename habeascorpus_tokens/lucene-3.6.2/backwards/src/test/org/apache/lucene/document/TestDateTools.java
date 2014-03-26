package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
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
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestDateTools	TokenNameIdentifier	 Test Date Tools
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStringToDate	TokenNameIdentifier	 test String To Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"2004"	TokenNameStringLiteral	2004
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-01-01 00:00:00:000"	TokenNameStringLiteral	2004-01-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"20040705"	TokenNameStringLiteral	20040705
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-07-05 00:00:00:000"	TokenNameStringLiteral	2004-07-05 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"200407050910"	TokenNameStringLiteral	200407050910
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-07-05 09:10:00:000"	TokenNameStringLiteral	2004-07-05 09:10:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"20040705091055990"	TokenNameStringLiteral	20040705091055990
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-07-05 09:10:55:990"	TokenNameStringLiteral	2004-07-05 09:10:55:990
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"97"	TokenNameStringLiteral	97
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no date 	TokenNameCOMMENT_LINE	no date 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* expected exception */	TokenNameCOMMENT_BLOCK	 expected exception 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"200401011235009999"	TokenNameStringLiteral	200401011235009999
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no date 	TokenNameCOMMENT_LINE	no date 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* expected exception */	TokenNameCOMMENT_BLOCK	 expected exception 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no date 	TokenNameCOMMENT_LINE	no date 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* expected exception */	TokenNameCOMMENT_BLOCK	 expected exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStringtoTime	TokenNameIdentifier	 test Stringto Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
"197001010000"	TokenNameStringLiteral	197001010000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=1970, month=january, day=1 	TokenNameCOMMENT_LINE	year=1970, month=january, day=1 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1980	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=1980, month=february, day=2 	TokenNameCOMMENT_LINE	year=1980, month=february, day=2 
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
"198002021105"	TokenNameStringLiteral	198002021105
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDateAndTimetoString	TokenNameIdentifier	 test Date And Timeto String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=2004, month=february(!), day=3 	TokenNameCOMMENT_LINE	year=2004, month=february(!), day=3 
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
333	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dateString	TokenNameIdentifier	 date String
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004"	TokenNameStringLiteral	2004
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-01-01 00:00:00:000"	TokenNameStringLiteral	2004-01-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"200402"	TokenNameStringLiteral	200402
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-01 00:00:00:000"	TokenNameStringLiteral	2004-02-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
DAY	TokenNameIdentifier	 DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20040203"	TokenNameStringLiteral	20040203
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 00:00:00:000"	TokenNameStringLiteral	2004-02-03 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
HOUR	TokenNameIdentifier	 HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004020322"	TokenNameStringLiteral	2004020322
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:00:00:000"	TokenNameStringLiteral	2004-02-03 22:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"200402032208"	TokenNameStringLiteral	200402032208
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:00:000"	TokenNameStringLiteral	2004-02-03 22:08:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20040203220856"	TokenNameStringLiteral	20040203220856
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:000"	TokenNameStringLiteral	2004-02-03 22:08:56:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20040203220856333"	TokenNameStringLiteral	20040203220856333
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:333"	TokenNameStringLiteral	2004-02-03 22:08:56:333
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// date before 1970: 	TokenNameCOMMENT_LINE	date before 1970: 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1961	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=1961, month=march(!), day=5 	TokenNameCOMMENT_LINE	year=1961, month=march(!), day=5 
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
444	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"19610305230951444"	TokenNameStringLiteral	19610305230951444
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1961-03-05 23:09:51:444"	TokenNameStringLiteral	1961-03-05 23:09:51:444
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
HOUR	TokenNameIdentifier	 HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1961030523"	TokenNameStringLiteral	1961030523
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1961-03-05 23:00:00:000"	TokenNameStringLiteral	1961-03-05 23:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// timeToString: 	TokenNameCOMMENT_LINE	timeToString: 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=1970, month=january, day=1 	TokenNameCOMMENT_LINE	year=1970, month=january, day=1 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"19700101000000000"	TokenNameStringLiteral	19700101000000000
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=1970, month=january, day=1 	TokenNameCOMMENT_LINE	year=1970, month=january, day=1 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateString	TokenNameIdentifier	 date String
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"19700101010203000"	TokenNameStringLiteral	19700101010203000
,	TokenNameCOMMA	
dateString	TokenNameIdentifier	 date String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRound	TokenNameIdentifier	 test Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// year=2004, month=february(!), day=3 	TokenNameCOMMENT_LINE	year=2004, month=february(!), day=3 
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hour, minute, second 	TokenNameCOMMENT_LINE	hour, minute, second 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
333	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:333"	TokenNameStringLiteral	2004-02-03 22:08:56:333
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateYear	TokenNameIdentifier	 date Year
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-01-01 00:00:00:000"	TokenNameStringLiteral	2004-01-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateYear	TokenNameIdentifier	 date Year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateMonth	TokenNameIdentifier	 date Month
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-01 00:00:00:000"	TokenNameStringLiteral	2004-02-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateMonth	TokenNameIdentifier	 date Month
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateDay	TokenNameIdentifier	 date Day
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
DAY	TokenNameIdentifier	 DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 00:00:00:000"	TokenNameStringLiteral	2004-02-03 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateDay	TokenNameIdentifier	 date Day
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateHour	TokenNameIdentifier	 date Hour
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
HOUR	TokenNameIdentifier	 HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:00:00:000"	TokenNameStringLiteral	2004-02-03 22:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateHour	TokenNameIdentifier	 date Hour
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateMinute	TokenNameIdentifier	 date Minute
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:00:000"	TokenNameStringLiteral	2004-02-03 22:08:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateMinute	TokenNameIdentifier	 date Minute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateSecond	TokenNameIdentifier	 date Second
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:000"	TokenNameStringLiteral	2004-02-03 22:08:56:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateSecond	TokenNameIdentifier	 date Second
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
dateMillisecond	TokenNameIdentifier	 date Millisecond
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:333"	TokenNameStringLiteral	2004-02-03 22:08:56:333
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
dateMillisecond	TokenNameIdentifier	 date Millisecond
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// long parameter: 	TokenNameCOMMENT_LINE	long parameter: 
long	TokenNamelong	
dateYearLong	TokenNameIdentifier	 date Year Long
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-01-01 00:00:00:000"	TokenNameStringLiteral	2004-01-01 00:00:00:000
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
dateYearLong	TokenNameIdentifier	 date Year Long
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
dateMillisecondLong	TokenNameIdentifier	 date Millisecond Long
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-02-03 22:08:56:333"	TokenNameStringLiteral	2004-02-03 22:08:56:333
,	TokenNameCOMMA	
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
dateMillisecondLong	TokenNameIdentifier	 date Millisecond Long
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
isoFormat	TokenNameIdentifier	 iso Format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd HH:mm:ss:SSS"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss:SSS
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDateToolsUTC	TokenNameIdentifier	 test Date Tools UTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Sun, 30 Oct 2005 00:00:00 +0000 -- the last second of 2005's DST in Europe/London 	TokenNameCOMMENT_LINE	Sun, 30 Oct 2005 00:00:00 +0000 -- the last second of 2005's DST in Europe/London 
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
1130630400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
/* "GMT" */	TokenNameCOMMENT_BLOCK	 "GMT" 
"Europe/London"	TokenNameStringLiteral	Europe/London
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
3600	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"different times"	TokenNameStringLiteral	different times
,	TokenNameCOMMA	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"midnight"	TokenNameStringLiteral	midnight
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"later"	TokenNameStringLiteral	later
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToTime	TokenNameIdentifier	 string To Time
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
3600	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
