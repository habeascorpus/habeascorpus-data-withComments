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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * TestCase for DateUtils. * */	TokenNameCOMMENT_JAVADOC	 TestCase for DateUtils. 
public	TokenNamepublic	
class	TokenNameclass	
DateUtilsTest	TokenNameIdentifier	 Date Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
DateUtilsTest	TokenNameIdentifier	 Date Utils Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElapsedTime	TokenNameIdentifier	 test Elapsed Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"50 seconds"	TokenNameStringLiteral	50 seconds
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
65	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1 minute 5 seconds"	TokenNameStringLiteral	1 minute 5 seconds
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
120	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 minutes 0 seconds"	TokenNameStringLiteral	2 minutes 0 seconds
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
121	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 minutes 1 second"	TokenNameStringLiteral	2 minutes 1 second
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// https://issues.apache.org/bugzilla/show_bug.cgi?id=44659 	TokenNameCOMMENT_LINE	https://issues.apache.org/bugzilla/show_bug.cgi?id=44659 
public	TokenNamepublic	
void	TokenNamevoid	
testLongElapsedTime	TokenNameIdentifier	 test Long Elapsed Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2926 minutes 13 seconds"	TokenNameStringLiteral	2926 minutes 13 seconds
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
175573	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"153722867280912 minutes 55 seconds"	TokenNameStringLiteral	153722867280912 minutes 55 seconds
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
formatElapsedTime	TokenNameIdentifier	 format Elapsed Time
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDateTimeISO	TokenNameIdentifier	 test Date Time ISO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT+1"	TokenNameStringLiteral	GMT+1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
ISO8601_DATETIME_PATTERN	TokenNameIdentifier	 IS O8601  DATETIME  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2002-02-23T09:11:12"	TokenNameStringLiteral	2002-02-23T09:11:12
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDateISO	TokenNameIdentifier	 test Date ISO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
ISO8601_DATE_PATTERN	TokenNameIdentifier	 IS O8601  DATE  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2002-02-23"	TokenNameStringLiteral	2002-02-23
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTimeISODate	TokenNameIdentifier	 test Time ISO Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure that elapsed time in set via date works 	TokenNameCOMMENT_LINE	make sure that elapsed time in set via date works 
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT+1"	TokenNameStringLiteral	GMT+1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
ISO8601_TIME_PATTERN	TokenNameIdentifier	 IS O8601  TIME  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20:11:12"	TokenNameStringLiteral	20:11:12
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTimeISO	TokenNameIdentifier	 test Time ISO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure that elapsed time in ms works 	TokenNameCOMMENT_LINE	make sure that elapsed time in ms works 
long	TokenNamelong	
ms	TokenNameIdentifier	 ms
=	TokenNameEQUAL	
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
3600	TokenNameIntegerLiteral	
+	TokenNamePLUS	
11	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
ms	TokenNameIdentifier	 ms
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
ISO8601_TIME_PATTERN	TokenNameIdentifier	 IS O8601  TIME  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20:11:12"	TokenNameStringLiteral	20:11:12
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPhaseOfMoon	TokenNameIdentifier	 test Phase Of Moon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should be full moon 	TokenNameCOMMENT_LINE	should be full moon 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
getPhaseOfMoon	TokenNameIdentifier	 get Phase Of Moon
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should be new moon 	TokenNameCOMMENT_LINE	should be new moon 
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
getPhaseOfMoon	TokenNameIdentifier	 get Phase Of Moon
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
