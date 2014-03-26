/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AsyncAppender	TokenNameIdentifier	 Async Appender
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
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
LogManager	TokenNameIdentifier	 Log Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PatternLayout	TokenNameIdentifier	 Pattern Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
HTMLLayout	TokenNameIdentifier	 HTML Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
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
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** * Tests for SyslogAppender * * * */	TokenNameCOMMENT_JAVADOC	 Tests for SyslogAppender * 
public	TokenNamepublic	
class	TokenNameclass	
SyslogAppenderTest	TokenNameIdentifier	 Syslog Appender Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create new instance of SyslogAppenderTest. * @param testName test name */	TokenNameCOMMENT_JAVADOC	 Create new instance of SyslogAppenderTest. @param testName test name 
public	TokenNamepublic	
SyslogAppenderTest	TokenNameIdentifier	 Syslog Appender Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets configuration after every test. */	TokenNameCOMMENT_JAVADOC	 Resets configuration after every test. 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test default constructor. */	TokenNameCOMMENT_JAVADOC	 Test default constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultConstructor	TokenNameIdentifier	 test Default Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getSyslogHost	TokenNameIdentifier	 get Syslog Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test two parameter constructor. */	TokenNameCOMMENT_JAVADOC	 Test two parameter constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
testTwoParamConstructor	TokenNameIdentifier	 test Two Param Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"daemon"	TokenNameStringLiteral	daemon
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getSyslogHost	TokenNameIdentifier	 get Syslog Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test two parameter constructor with unexpected facility. */	TokenNameCOMMENT_JAVADOC	 Test two parameter constructor with unexpected facility. 
public	TokenNamepublic	
void	TokenNamevoid	
testTwoParamConstructorBadFacility	TokenNameIdentifier	 test Two Param Constructor Bad Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getSyslogHost	TokenNameIdentifier	 get Syslog Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test three parameter constructor. */	TokenNameCOMMENT_JAVADOC	 Test three parameter constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
testThreeParamConstructor	TokenNameIdentifier	 test Three Param Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
"syslog.example.org"	TokenNameStringLiteral	syslog.example.org
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"daemon"	TokenNameStringLiteral	daemon
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"syslog.example.org"	TokenNameStringLiteral	syslog.example.org
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getSyslogHost	TokenNameIdentifier	 get Syslog Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test getFacilityString for expected facility codes. */	TokenNameCOMMENT_JAVADOC	 Test getFacilityString for expected facility codes. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilityString	TokenNameIdentifier	 test Get Facility String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"kern user mail daemon auth syslog lpr news "	TokenNameStringLiteral	kern user mail daemon auth syslog lpr news 
+	TokenNamePLUS	
"uucp cron authpriv ftp local0 local1 local2 local3 "	TokenNameStringLiteral	uucp cron authpriv ftp local0 local1 local2 local3 
+	TokenNamePLUS	
"local4 local5 local6 local7 "	TokenNameStringLiteral	local4 local5 local6 local7 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test getFacilityString for some unexpected facility codes. */	TokenNameCOMMENT_JAVADOC	 Test getFacilityString for some unexpected facility codes. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilityStringUnexpected	TokenNameIdentifier	 test Get Facility String Unexpected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test getFacility with a bogus facility name. */	TokenNameCOMMENT_JAVADOC	 Test getFacility with a bogus facility name. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilityBogus	TokenNameIdentifier	 test Get Facility Bogus
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
"bogus"	TokenNameStringLiteral	bogus
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test getFacility with a null facility name. */	TokenNameCOMMENT_JAVADOC	 Test getFacility with a null facility name. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilityNull	TokenNameIdentifier	 test Get Facility Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test getFacility for expected system facility names. */	TokenNameCOMMENT_JAVADOC	 Test getFacility for expected system facility names. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilitySystemNames	TokenNameIdentifier	 test Get Facility System Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kErn"	TokenNameStringLiteral	kErn
,	TokenNameCOMMA	
"usEr"	TokenNameStringLiteral	usEr
,	TokenNameCOMMA	
"MaIL"	TokenNameStringLiteral	MaIL
,	TokenNameCOMMA	
"daemOn"	TokenNameStringLiteral	daemOn
,	TokenNameCOMMA	
"auTh"	TokenNameStringLiteral	auTh
,	TokenNameCOMMA	
"syslOg"	TokenNameStringLiteral	syslOg
,	TokenNameCOMMA	
"lPr"	TokenNameStringLiteral	lPr
,	TokenNameCOMMA	
"newS"	TokenNameStringLiteral	newS
,	TokenNameCOMMA	
"Uucp"	TokenNameStringLiteral	Uucp
,	TokenNameCOMMA	
"croN"	TokenNameStringLiteral	croN
,	TokenNameCOMMA	
"authprIv"	TokenNameStringLiteral	authprIv
,	TokenNameCOMMA	
"ftP"	TokenNameStringLiteral	ftP
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test getFacility for expected system facility names. */	TokenNameCOMMENT_JAVADOC	 Test getFacility for expected system facility names. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacilityLocalNames	TokenNameIdentifier	 test Get Facility Local Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lOcal0"	TokenNameStringLiteral	lOcal0
,	TokenNameCOMMA	
"LOCAL1"	TokenNameStringLiteral	LOCAL1
,	TokenNameCOMMA	
"loCal2"	TokenNameStringLiteral	loCal2
,	TokenNameCOMMA	
"locAl3"	TokenNameStringLiteral	locAl3
,	TokenNameCOMMA	
"locaL4"	TokenNameStringLiteral	locaL4
,	TokenNameCOMMA	
"local5"	TokenNameStringLiteral	local5
,	TokenNameCOMMA	
"LOCal6"	TokenNameStringLiteral	LOCal6
,	TokenNameCOMMA	
"loCAL7"	TokenNameStringLiteral	loCAL7
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test setFacilityPrinting. */	TokenNameCOMMENT_JAVADOC	 Test setFacilityPrinting. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFacilityPrinting	TokenNameIdentifier	 test Set Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacilityPrinting	TokenNameIdentifier	 set Facility Printing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacilityPrinting	TokenNameIdentifier	 set Facility Printing
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test of SyslogAppender constants. */	TokenNameCOMMENT_JAVADOC	 Test of SyslogAppender constants. 
public	TokenNamepublic	
void	TokenNamevoid	
testConstants	TokenNameIdentifier	 test Constants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_KERN	TokenNameIdentifier	 LOG  KERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_USER	TokenNameIdentifier	 LOG  USER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_MAIL	TokenNameIdentifier	 LOG  MAIL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_DAEMON	TokenNameIdentifier	 LOG  DAEMON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_AUTH	TokenNameIdentifier	 LOG  AUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_SYSLOG	TokenNameIdentifier	 LOG  SYSLOG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LPR	TokenNameIdentifier	 LOG  LPR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_NEWS	TokenNameIdentifier	 LOG  NEWS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_UUCP	TokenNameIdentifier	 LOG  UUCP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_CRON	TokenNameIdentifier	 LOG  CRON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_AUTHPRIV	TokenNameIdentifier	 LOG  AUTHPRIV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_FTP	TokenNameIdentifier	 LOG  FTP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL0	TokenNameIdentifier	 LOG  LOCA L0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL1	TokenNameIdentifier	 LOG  LOCA L1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL2	TokenNameIdentifier	 LOG  LOCA L2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
19	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL3	TokenNameIdentifier	 LOG  LOCA L3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL4	TokenNameIdentifier	 LOG  LOCA L4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
21	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL5	TokenNameIdentifier	 LOG  LOCA L5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
22	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL6	TokenNameIdentifier	 LOG  LOCA L6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
23	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
LOG_LOCAL7	TokenNameIdentifier	 LOG  LOCA L7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test setFacility with null. * Should have no effect. */	TokenNameCOMMENT_JAVADOC	 Test setFacility with null. Should have no effect. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFacilityKern	TokenNameIdentifier	 test Set Facility Kern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test setFacility with null. * Should have no effect. */	TokenNameCOMMENT_JAVADOC	 Test setFacility with null. Should have no effect. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFacilityNull	TokenNameIdentifier	 test Set Facility Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test setFacility with bogus value. * Should reset to user. */	TokenNameCOMMENT_JAVADOC	 Test setFacility with bogus value. Should reset to user. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFacilityBogus	TokenNameIdentifier	 test Set Facility Bogus
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"bogus"	TokenNameStringLiteral	bogus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests calling setFacility after appender has been activated. */	TokenNameCOMMENT_JAVADOC	 Tests calling setFacility after appender has been activated. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFacilityAfterActivation	TokenNameIdentifier	 test Set Facility After Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"kern"	TokenNameStringLiteral	kern
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that append method drops messages below threshold. * Can't reach isSevereAsThreshold call in SyslogAppender.append * since it is checked in AppenderSkeleton.doAppend. */	TokenNameCOMMENT_JAVADOC	 Tests that append method drops messages below threshold. Can't reach isSevereAsThreshold call in SyslogAppender.append since it is checked in AppenderSkeleton.doAppend. 
public	TokenNamepublic	
void	TokenNamevoid	
testAppendBelowThreshold	TokenNameIdentifier	 test Append Below Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Should not be logged by SyslogAppenderTest.testAppendBelowThreshold."	TokenNameStringLiteral	Should not be logged by SyslogAppenderTest.testAppendBelowThreshold.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that append method drops messages below threshold. */	TokenNameCOMMENT_JAVADOC	 Tests that append method drops messages below threshold. 
public	TokenNamepublic	
void	TokenNamevoid	
testAppendNoHost	TokenNameIdentifier	 test Append No Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Should not be logged by SyslogAppenderTest.testAppendNoHost."	TokenNameStringLiteral	Should not be logged by SyslogAppenderTest.testAppendNoHost.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Appender is misspelled in implementation 	TokenNameCOMMENT_LINE	Appender is misspelled in implementation 
// 	TokenNameCOMMENT_LINE	 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"No syslog host is set for SyslogAppedender named "foo"."	TokenNameStringLiteral	No syslog host is set for SyslogAppedender named "foo".
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests append method under normal conditions. */	TokenNameCOMMENT_JAVADOC	 Tests append method under normal conditions. 
public	TokenNamepublic	
void	TokenNamevoid	
testAppend	TokenNameIdentifier	 test Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// wrap SyslogAppender with an Async since appender may 	TokenNameCOMMENT_LINE	wrap SyslogAppender with an Async since appender may 
// hang if syslogd is not accepting network messages 	TokenNameCOMMENT_LINE	hang if syslogd is not accepting network messages 
// 	TokenNameCOMMENT_LINE	 
AsyncAppender	TokenNameIdentifier	 Async Appender
asyncAppender	TokenNameIdentifier	 async Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Expected exception from SyslogAppenderTest.testAppend"	TokenNameStringLiteral	Expected exception from SyslogAppenderTest.testAppend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Expected message from log4j unit test SyslogAppenderTest.testAppend."	TokenNameStringLiteral	Expected message from log4j unit test SyslogAppenderTest.testAppend.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests SyslogAppender with IPv6 address. */	TokenNameCOMMENT_JAVADOC	 Tests SyslogAppender with IPv6 address. 
public	TokenNamepublic	
void	TokenNamevoid	
testIPv6	TokenNameIdentifier	 test I Pv6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"::1"	TokenNameStringLiteral	::1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests SyslogAppender with IPv6 address enclosed in square brackets. */	TokenNameCOMMENT_JAVADOC	 Tests SyslogAppender with IPv6 address enclosed in square brackets. 
public	TokenNamepublic	
void	TokenNamevoid	
testIPv6InBrackets	TokenNameIdentifier	 test I Pv6 In Brackets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"[::1]"	TokenNameStringLiteral	[::1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests SyslogAppender with IPv6 address enclosed in square brackets * followed by port specification. */	TokenNameCOMMENT_JAVADOC	 Tests SyslogAppender with IPv6 address enclosed in square brackets followed by port specification. 
public	TokenNamepublic	
void	TokenNamevoid	
testIPv6AndPort	TokenNameIdentifier	 test I Pv6 And Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"[::1]:1514"	TokenNameStringLiteral	[::1]:1514
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests SyslogAppender with host name enclosed in square brackets * followed by port specification. */	TokenNameCOMMENT_JAVADOC	 Tests SyslogAppender with host name enclosed in square brackets followed by port specification. 
public	TokenNamepublic	
void	TokenNamevoid	
testHostNameAndPort	TokenNameIdentifier	 test Host Name And Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost:1514"	TokenNameStringLiteral	localhost:1514
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests SyslogAppender with IPv4 address followed by port specification. */	TokenNameCOMMENT_JAVADOC	 Tests SyslogAppender with IPv4 address followed by port specification. 
public	TokenNamepublic	
void	TokenNamevoid	
testIPv4AndPort	TokenNameIdentifier	 test I Pv4 And Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"127.0.0.1:1514"	TokenNameStringLiteral	127.0.0.1:1514
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
packets	TokenNameIdentifier	 packets
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost:"	TokenNameStringLiteral	localhost:
+	TokenNamePLUS	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getLocalPort	TokenNameIdentifier	 get Local Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
pl	TokenNameIdentifier	 pl
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m"	TokenNameStringLiteral	%m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
packets	TokenNameIdentifier	 packets
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
packets	TokenNameIdentifier	 packets
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
receive	TokenNameIdentifier	 receive
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testActualLogging	TokenNameIdentifier	 test Actual Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"greetings"	TokenNameStringLiteral	greetings
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
"<>() "	TokenNameStringLiteral	<>() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"14"	TokenNameStringLiteral	14
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"greetings"	TokenNameStringLiteral	greetings
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exception with printStackTrace that breaks earlier SyslogAppender. */	TokenNameCOMMENT_JAVADOC	 Exception with printStackTrace that breaks earlier SyslogAppender. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MishandledException	TokenNameIdentifier	 Mishandled Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/* * Create new instance. */	TokenNameCOMMENT_BLOCK	 Create new instance. 
public	TokenNamepublic	
MishandledException	TokenNameIdentifier	 Mishandled Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * @param w print writer, may not be null. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. @param w print writer, may not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Mishandled stack trace follows:"	TokenNameStringLiteral	Mishandled stack trace follows:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"No tab here"	TokenNameStringLiteral	No tab here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" tab here"	TokenNameStringLiteral	 tab here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests fix for bug 40502. * @throws Exception on IOException. */	TokenNameCOMMENT_JAVADOC	 Tests fix for bug 40502. @throws Exception on IOException. 
public	TokenNamepublic	
void	TokenNamevoid	
testBadTabbing	TokenNameIdentifier	 test Bad Tabbing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"greetings"	TokenNameStringLiteral	greetings
,	TokenNameCOMMA	
new	TokenNamenew	
MishandledException	TokenNameIdentifier	 Mishandled Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
"<>() "	TokenNameStringLiteral	<>() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"11"	TokenNameStringLiteral	11
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"greetings"	TokenNameStringLiteral	greetings
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<11>Mishandled stack trace follows:"	TokenNameStringLiteral	<11>Mishandled stack trace follows:
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<11>"	TokenNameStringLiteral	<11>
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<11>No tab here"	TokenNameStringLiteral	<11>No tab here
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<11>"	TokenNameStringLiteral	<11>
+	TokenNamePLUS	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
TAB	TokenNameIdentifier	 TAB
+	TokenNamePLUS	
"tab here"	TokenNameStringLiteral	tab here
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<11>"	TokenNameStringLiteral	<11>
+	TokenNamePLUS	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
.	TokenNameDOT	
TAB	TokenNameIdentifier	 TAB
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests presence of timestamp if header = true. * * @throws Exception if IOException. */	TokenNameCOMMENT_JAVADOC	 Tests presence of timestamp if header = true. * @throws Exception if IOException. 
public	TokenNamepublic	
void	TokenNamevoid	
testHeaderLogging	TokenNameIdentifier	 test Header Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
preDate	TokenNameIdentifier	 pre Date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
"greetings"	TokenNameStringLiteral	greetings
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
postDate	TokenNameIdentifier	 post Date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<14>"	TokenNameStringLiteral	<14>
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
syslogDateStr	TokenNameIdentifier	 syslog Date Str
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
fmt	TokenNameIdentifier	 fmt
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"MMM dd HH:mm:ss "	TokenNameStringLiteral	MMM dd HH:mm:ss 
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
syslogDate	TokenNameIdentifier	 syslog Date
=	TokenNameEQUAL	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
syslogDateStr	TokenNameIdentifier	 syslog Date Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
syslogDate	TokenNameIdentifier	 syslog Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
syslogMonth	TokenNameIdentifier	 syslog Month
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
syslogDay	TokenNameIdentifier	 syslog Day
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
syslogDay	TokenNameIdentifier	 syslog Day
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
syslogDateStr	TokenNameIdentifier	 syslog Date Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
preDate	TokenNameIdentifier	 pre Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
preMonth	TokenNameIdentifier	 pre Month
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
preDate	TokenNameIdentifier	 pre Date
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
syslogYear	TokenNameIdentifier	 syslog Year
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preMonth	TokenNameIdentifier	 pre Month
==	TokenNameEQUAL_EQUAL	
syslogMonth	TokenNameIdentifier	 syslog Month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
syslogYear	TokenNameIdentifier	 syslog Year
=	TokenNameEQUAL	
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
else	TokenNameelse	
{	TokenNameLBRACE	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
postDate	TokenNameIdentifier	 post Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syslogYear	TokenNameIdentifier	 syslog Year
=	TokenNameEQUAL	
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
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
syslogDate	TokenNameIdentifier	 syslog Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
syslogYear	TokenNameIdentifier	 syslog Year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syslogDate	TokenNameIdentifier	 syslog Date
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
syslogDate	TokenNameIdentifier	 syslog Date
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
preDate	TokenNameIdentifier	 pre Date
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
syslogDate	TokenNameIdentifier	 syslog Date
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
postDate	TokenNameIdentifier	 post Date
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that any header or footer in layout is sent. * @throws Exception if exception during test. */	TokenNameCOMMENT_JAVADOC	 Tests that any header or footer in layout is sent. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testLayoutHeader	TokenNameIdentifier	 test Layout Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost:"	TokenNameStringLiteral	localhost:
+	TokenNamePLUS	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getLocalPort	TokenNameIdentifier	 get Local Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HTMLLayout	TokenNameIdentifier	 HTML Layout
pl	TokenNameIdentifier	 pl
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLLayout	TokenNameIdentifier	 HTML Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
receive	TokenNameIdentifier	 receive
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<14><!DOCTYPE"	TokenNameStringLiteral	<14><!DOCTYPE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<14></table>"	TokenNameStringLiteral	<14></table>
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that syslog packets do not exceed 1024 bytes. * See bug 42087. * @throws Exception if exception during test. */	TokenNameCOMMENT_JAVADOC	 Tests that syslog packets do not exceed 1024 bytes. See bug 42087. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testBigPackets	TokenNameIdentifier	 test Big Packets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
"localhost:"	TokenNameStringLiteral	localhost:
+	TokenNamePLUS	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getLocalPort	TokenNameIdentifier	 get Local Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
pl	TokenNameIdentifier	 pl
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m"	TokenNameStringLiteral	%m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
msgbuf	TokenNameIdentifier	 msgbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
msgbuf	TokenNameIdentifier	 msgbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
8000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msgbuf	TokenNameIdentifier	 msgbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
msgbuf	TokenNameIdentifier	 msgbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1200	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
receive	TokenNameIdentifier	 receive
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
rcvbuf	TokenNameIdentifier	 rcvbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
rcvbuf	TokenNameIdentifier	 rcvbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
