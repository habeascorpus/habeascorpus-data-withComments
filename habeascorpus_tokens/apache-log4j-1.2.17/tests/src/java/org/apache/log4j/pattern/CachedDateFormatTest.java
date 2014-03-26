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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
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
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** Unit test {@link AbsoluteTimeDateFormat}. @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Unit test {@link AbsoluteTimeDateFormat}. @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CachedDateFormatTest	TokenNameIdentifier	 Cached Date Format Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Test constructor * @param name String test name */	TokenNameCOMMENT_JAVADOC	 Test constructor @param name String test name 
public	TokenNamepublic	
CachedDateFormatTest	TokenNameIdentifier	 Cached Date Format Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
DateFormat	TokenNameIdentifier	 Date Format
createAbsoluteTimeDateFormat	TokenNameIdentifier	 create Absolute Time Date Format
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss,SSS"	TokenNameStringLiteral	HH:mm:ss,SSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Timezone representing GMT. */	TokenNameCOMMENT_JAVADOC	 Timezone representing GMT. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
TimeZone	TokenNameIdentifier	 Time Zone
GMT	TokenNameIdentifier	 GMT
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Timezone for Chicago, Ill. USA. */	TokenNameCOMMENT_JAVADOC	 Timezone for Chicago, Ill. USA. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
TimeZone	TokenNameIdentifier	 Time Zone
CHICAGO	TokenNameIdentifier	 CHICAGO
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"America/Chicago"	TokenNameStringLiteral	America/Chicago
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Test multiple calls in close intervals. */	TokenNameCOMMENT_JAVADOC	 Test multiple calls in close intervals. 
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// subsequent calls within one minute 	TokenNameCOMMENT_LINE	subsequent calls within one minute 
// are optimized to reuse previous formatted value 	TokenNameCOMMENT_LINE	are optimized to reuse previous formatted value 
// make a couple of nearly spaced calls 	TokenNameCOMMENT_LINE	make a couple of nearly spaced calls 
DateFormat	TokenNameIdentifier	 Date Format
gmtFormat	TokenNameIdentifier	 gmt Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
createAbsoluteTimeDateFormat	TokenNameIdentifier	 create Absolute Time Date Format
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
12601L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul1	TokenNameIdentifier	 jul1
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,000"	TokenNameStringLiteral	00:00:00,000
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus8ms	TokenNameIdentifier	 plus8ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,008"	TokenNameStringLiteral	00:00:00,008
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus17ms	TokenNameIdentifier	 plus17ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,017"	TokenNameStringLiteral	00:00:00,017
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus237ms	TokenNameIdentifier	 plus237ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,237"	TokenNameStringLiteral	00:00:00,237
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus1415ms	TokenNameIdentifier	 plus1415ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
1415	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:01,415"	TokenNameStringLiteral	00:00:01,415
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check for interaction between caches. */	TokenNameCOMMENT_JAVADOC	 Check for interaction between caches. 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
jul2	TokenNameIdentifier	 jul2
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
12602L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
gmtFormat	TokenNameIdentifier	 gmt Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
createAbsoluteTimeDateFormat	TokenNameIdentifier	 create Absolute Time Date Format
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
chicagoFormat	TokenNameIdentifier	 chicago Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
createAbsoluteTimeDateFormat	TokenNameIdentifier	 create Absolute Time Date Format
(	TokenNameLPAREN	
CHICAGO	TokenNameIdentifier	 CHICAGO
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,000"	TokenNameStringLiteral	00:00:00,000
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"19:00:00,000"	TokenNameStringLiteral	19:00:00,000
,	TokenNameCOMMA	
chicagoFormat	TokenNameIdentifier	 chicago Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,000"	TokenNameStringLiteral	00:00:00,000
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test multiple calls in close intervals prior to 1 Jan 1970. */	TokenNameCOMMENT_JAVADOC	 Test multiple calls in close intervals prior to 1 Jan 1970. 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// subsequent calls within one minute 	TokenNameCOMMENT_LINE	subsequent calls within one minute 
// are optimized to reuse previous formatted value 	TokenNameCOMMENT_LINE	are optimized to reuse previous formatted value 
// make a couple of nearly spaced calls 	TokenNameCOMMENT_LINE	make a couple of nearly spaced calls 
DateFormat	TokenNameIdentifier	 Date Format
gmtFormat	TokenNameIdentifier	 gmt Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
createAbsoluteTimeDateFormat	TokenNameIdentifier	 create Absolute Time Date Format
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if the first call was exactly on an integral 	TokenNameCOMMENT_LINE	if the first call was exactly on an integral 
// second, it would not test the round toward zero compensation 	TokenNameCOMMENT_LINE	second, it would not test the round toward zero compensation 
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
-	TokenNameMINUS	
7L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul1	TokenNameIdentifier	 jul1
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,008"	TokenNameStringLiteral	00:00:00,008
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus8ms	TokenNameIdentifier	 plus8ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,016"	TokenNameStringLiteral	00:00:00,016
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus17ms	TokenNameIdentifier	 plus17ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,023"	TokenNameStringLiteral	00:00:00,023
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus237ms	TokenNameIdentifier	 plus237ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
245	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,245"	TokenNameStringLiteral	00:00:00,245
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus1415ms	TokenNameIdentifier	 plus1415ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
1423	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:01,423"	TokenNameStringLiteral	00:00:01,423
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// subsequent calls within one minute are optimized to reuse previous 	TokenNameCOMMENT_LINE	subsequent calls within one minute are optimized to reuse previous 
// formatted value. make a couple of nearly spaced calls 	TokenNameCOMMENT_LINE	formatted value. make a couple of nearly spaced calls 
// (Note: 'Z' is JDK 1.4, using 'z' instead.) 	TokenNameCOMMENT_LINE	(Note: 'Z' is JDK 1.4, using 'z' instead.) 
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"EEE, MMM dd, HH:mm:ss.SSS z"	TokenNameStringLiteral	EEE, MMM dd, HH:mm:ss.SSS z
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// use a date in 2000 to attempt to confuse the millisecond locator 	TokenNameCOMMENT_LINE	use a date in 2000 to attempt to confuse the millisecond locator 
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11141L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul1	TokenNameIdentifier	 jul1
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus8ms	TokenNameIdentifier	 plus8ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus17ms	TokenNameIdentifier	 plus17ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus237ms	TokenNameIdentifier	 plus237ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus1415ms	TokenNameIdentifier	 plus1415ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
1415	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// subsequent calls within one minute 	TokenNameCOMMENT_LINE	subsequent calls within one minute 
// are optimized to reuse previous formatted value 	TokenNameCOMMENT_LINE	are optimized to reuse previous formatted value 
// make a couple of nearly spaced calls 	TokenNameCOMMENT_LINE	make a couple of nearly spaced calls 
// (Note: 'Z' is JDK 1.4, using 'z' instead.) 	TokenNameCOMMENT_LINE	(Note: 'Z' is JDK 1.4, using 'z' instead.) 
Locale	TokenNameIdentifier	 Locale
thai	TokenNameIdentifier	 thai
=	TokenNameEQUAL	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"th"	TokenNameStringLiteral	th
,	TokenNameCOMMA	
"TH"	TokenNameStringLiteral	TH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"EEE, MMM dd, HH:mm:ss.SSS z"	TokenNameStringLiteral	EEE, MMM dd, HH:mm:ss.SSS z
,	TokenNameCOMMA	
thai	TokenNameIdentifier	 thai
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// use a date in the year 2000 CE to attempt to confuse the millisecond locator 	TokenNameCOMMENT_LINE	use a date in the year 2000 CE to attempt to confuse the millisecond locator 
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11141L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sx	TokenNameIdentifier	 sx
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul1	TokenNameIdentifier	 jul1
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul1	TokenNameIdentifier	 jul1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus8ms	TokenNameIdentifier	 plus8ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus8ms	TokenNameIdentifier	 plus8ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus17ms	TokenNameIdentifier	 plus17ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus17ms	TokenNameIdentifier	 plus17ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus237ms	TokenNameIdentifier	 plus237ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus237ms	TokenNameIdentifier	 plus237ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
plus1415ms	TokenNameIdentifier	 plus1415ms
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
1415	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
plus1415ms	TokenNameIdentifier	 plus1415ms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks that getNumberFormat does not return null. */	TokenNameCOMMENT_JAVADOC	 Checks that getNumberFormat does not return null. 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumberFormat	TokenNameIdentifier	 get Number Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set time zone on cached and check that it is effective. */	TokenNameCOMMENT_JAVADOC	 Set time zone on cached and check that it is effective. 
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd HH:mm:ss,SSS"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss,SSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul4	TokenNameIdentifier	 jul4
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
12603L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-07-04 00:00:00,000"	TokenNameStringLiteral	2004-07-04 00:00:00,000
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul4	TokenNameIdentifier	 jul4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT-6"	TokenNameStringLiteral	GMT-6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2004-07-03 18:00:00,000"	TokenNameStringLiteral	2004-07-03 18:00:00,000
,	TokenNameCOMMA	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul4	TokenNameIdentifier	 jul4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test of caching when less than three millisecond digits are specified. */	TokenNameCOMMENT_JAVADOC	 Test of caching when less than three millisecond digits are specified. 
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// (Note: 'Z' is JDK 1.4, using 'z' instead.) 	TokenNameCOMMENT_LINE	(Note: 'Z' is JDK 1.4, using 'z' instead.) 
DateFormat	TokenNameIdentifier	 Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MMMM-dd HH:mm:ss,SS z"	TokenNameStringLiteral	yyyy-MMMM-dd HH:mm:ss,SS z
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
cet	TokenNameIdentifier	 cet
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT+1"	TokenNameStringLiteral	GMT+1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
cet	TokenNameIdentifier	 cet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DECEMBER	TokenNameIdentifier	 DECEMBER
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
cet	TokenNameIdentifier	 cet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2005	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
905	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test when millisecond position moves but length remains constant. */	TokenNameCOMMENT_JAVADOC	 Test when millisecond position moves but length remains constant. 
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"MMMM SSS EEEEEE"	TokenNameStringLiteral	MMMM SSS EEEEEE
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
baseFormat	TokenNameIdentifier	 base Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
cet	TokenNameIdentifier	 cet
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT+1"	TokenNameStringLiteral	GMT+1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
cet	TokenNameIdentifier	 cet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
OCTOBER	TokenNameIdentifier	 OCTOBER
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
cet	TokenNameIdentifier	 cet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
NOVEMBER	TokenNameIdentifier	 NOVEMBER
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
984	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that tests if caching is skipped if only "SS" * is specified. */	TokenNameCOMMENT_JAVADOC	 Test that tests if caching is skipped if only "SS" is specified. 
public	TokenNamepublic	
void	TokenNamevoid	
test11	TokenNameIdentifier	 test11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Earlier versions could be tricked by "SS0" patterns. 	TokenNameCOMMENT_LINE	Earlier versions could be tricked by "SS0" patterns. 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
badPattern	TokenNameIdentifier	 bad Pattern
=	TokenNameEQUAL	
"ss,SS0"	TokenNameStringLiteral	ss,SS0
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
badPattern	TokenNameIdentifier	 bad Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
baseFormat	TokenNameIdentifier	 base Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
badPattern	TokenNameIdentifier	 bad Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
gmtFormat	TokenNameIdentifier	 gmt Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
simpleFormat	TokenNameIdentifier	 simple Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// The first request has to 100 ms after an ordinal second 	TokenNameCOMMENT_LINE	The first request has to 100 ms after an ordinal second 
// to push the literal zero out of the pattern check 	TokenNameCOMMENT_LINE	to push the literal zero out of the pattern check 
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
jul2	TokenNameIdentifier	 jul2
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
120	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jul2	TokenNameIdentifier	 jul2
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
+	TokenNamePLUS	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Cache gives 00,087 	TokenNameCOMMENT_LINE	Cache gives 00,087 
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
baseFormat	TokenNameIdentifier	 base Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
gmtFormat	TokenNameIdentifier	 gmt Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check pattern location for ISO8601 */	TokenNameCOMMENT_JAVADOC	 Check pattern location for ISO8601 
public	TokenNamepublic	
void	TokenNamevoid	
test12	TokenNameIdentifier	 test12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd HH:mm:ss,SSS"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss,SSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check pattern location for DATE */	TokenNameCOMMENT_JAVADOC	 Check pattern location for DATE 
public	TokenNamepublic	
void	TokenNamevoid	
test13	TokenNameIdentifier	 test13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd"	TokenNameStringLiteral	yyyy-MM-dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
NO_MILLISECONDS	TokenNameIdentifier	 NO  MILLISECONDS
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check pattern location for ABSOLUTE */	TokenNameCOMMENT_JAVADOC	 Check pattern location for ABSOLUTE 
public	TokenNamepublic	
void	TokenNamevoid	
test14	TokenNameIdentifier	 test14
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss,SSS"	TokenNameStringLiteral	HH:mm:ss,SSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check pattern location for single S */	TokenNameCOMMENT_JAVADOC	 Check pattern location for single S 
public	TokenNamepublic	
void	TokenNamevoid	
test15	TokenNameIdentifier	 test15
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss,S"	TokenNameStringLiteral	HH:mm:ss,S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check pattern location for single SS */	TokenNameCOMMENT_JAVADOC	 Check pattern location for single SS 
public	TokenNamepublic	
void	TokenNamevoid	
test16	TokenNameIdentifier	 test16
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss,SS"	TokenNameStringLiteral	HH:mm:ss,SS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ticks	TokenNameIdentifier	 ticks
=	TokenNameEQUAL	
11142L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisecondStart	TokenNameIdentifier	 millisecond Start
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
findMillisecondStart	TokenNameIdentifier	 find Millisecond Start
(	TokenNameLPAREN	
ticks	TokenNameIdentifier	 ticks
,	TokenNameCOMMA	
formatted	TokenNameIdentifier	 formatted
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
UNRECOGNIZED_MILLISECONDS	TokenNameIdentifier	 UNRECOGNIZED  MILLISECONDS
,	TokenNameCOMMA	
millisecondStart	TokenNameIdentifier	 millisecond Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check caching when multiple SSS appear in pattern */	TokenNameCOMMENT_JAVADOC	 Check caching when multiple SSS appear in pattern 
public	TokenNamepublic	
void	TokenNamevoid	
test17	TokenNameIdentifier	 test17
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
jul2	TokenNameIdentifier	 jul2
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
12602L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
86400000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
badPattern	TokenNameIdentifier	 bad Pattern
=	TokenNameEQUAL	
"HH:mm:ss,SSS HH:mm:ss,SSS"	TokenNameStringLiteral	HH:mm:ss,SSS HH:mm:ss,SSS
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
simpleFormat	TokenNameIdentifier	 simple Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
badPattern	TokenNameIdentifier	 bad Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleFormat	TokenNameIdentifier	 simple Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
GMT	TokenNameIdentifier	 GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
cachedFormat	TokenNameIdentifier	 cached Format
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
(	TokenNameLPAREN	
simpleFormat	TokenNameIdentifier	 simple Format
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,000 00:00:00,000"	TokenNameStringLiteral	00:00:00,000 00:00:00,000
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jul2	TokenNameIdentifier	 jul2
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
120	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"00:00:00,120 00:00:00,120"	TokenNameStringLiteral	00:00:00,120 00:00:00,120
,	TokenNameCOMMA	
simpleFormat	TokenNameIdentifier	 simple Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
cachedFormat	TokenNameIdentifier	 cached Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
jul2	TokenNameIdentifier	 jul2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// TODO: why is this returning ,120 ... , 120 	TokenNameCOMMENT_LINE	TODO: why is this returning ,120 ... , 120 
// 	TokenNameCOMMENT_LINE	 
//assertEquals("00:00:00,120 00:00:00,000", s) ; 	TokenNameCOMMENT_LINE	assertEquals("00:00:00,120 00:00:00,000", s) ; 
int	TokenNameint	
maxValid	TokenNameIdentifier	 max Valid
=	TokenNameEQUAL	
CachedDateFormat	TokenNameIdentifier	 Cached Date Format
.	TokenNameDOT	
getMaximumCacheValidity	TokenNameIdentifier	 get Maximum Cache Validity
(	TokenNameLPAREN	
badPattern	TokenNameIdentifier	 bad Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxValid	TokenNameIdentifier	 max Valid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
xsuite	TokenNameIdentifier	 xsuite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestSuite	TokenNameIdentifier	 Test Suite
suite	TokenNameIdentifier	 suite
=	TokenNameEQUAL	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
CachedDateFormatTest	TokenNameIdentifier	 Cached Date Format Test
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//suite.addTest(new CachedDateFormatTest("testS2")); 	TokenNameCOMMENT_LINE	suite.addTest(new CachedDateFormatTest("testS2")); 
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
