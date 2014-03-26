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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
NDC	TokenNameIdentifier	 NDC
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XLevel	TokenNameIdentifier	 X Level
;	TokenNameSEMICOLON	
/** @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TEMP	TokenNameIdentifier	 TEMP
=	TokenNameEQUAL	
"output/temp"	TokenNameStringLiteral	output/temp
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FILTERED	TokenNameIdentifier	 FILTERED
=	TokenNameEQUAL	
"output/filtered"	TokenNameStringLiteral	output/filtered
;	TokenNameSEMICOLON	
// %5p %x [%t] %c %m%n 	TokenNameCOMMENT_LINE	%5p %x [%t] %c %m%n 
// DEBUG T1 [main] org.apache.log4j.net.SocketAppenderTestCase Message 1 	TokenNameCOMMENT_LINE	DEBUG T1 [main] org.apache.log4j.net.SocketAppenderTestCase Message 1 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT1	TokenNameIdentifier	 PA T1
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T1 \[main]\ "	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T1 \[main]\ 
+	TokenNamePLUS	
".* Message \d{1,2}"	TokenNameStringLiteral	.* Message \d{1,2}
;	TokenNameSEMICOLON	
// DEBUG T2 [main] ? (?:?) Message 1 	TokenNameCOMMENT_LINE	DEBUG T2 [main] ? (?:?) Message 1 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT2	TokenNameIdentifier	 PA T2
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T2 \[main]\ "	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T2 \[main]\ 
+	TokenNamePLUS	
"\? \(\?:\?\) Message \d{1,2}"	TokenNameStringLiteral	\? \(\?:\?\) Message \d{1,2}
;	TokenNameSEMICOLON	
// DEBUG T3 [main] org.apache.log4j.net.SocketServerTestCase (SocketServerTestCase.java:121) Message 1 	TokenNameCOMMENT_LINE	DEBUG T3 [main] org.apache.log4j.net.SocketServerTestCase (SocketServerTestCase.java:121) Message 1 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT3	TokenNameIdentifier	 PA T3
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T3 \[main]\ "	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) T3 \[main]\ 
+	TokenNamePLUS	
"org.apache.log4j.net.SocketServerTestCase "	TokenNameStringLiteral	org.apache.log4j.net.SocketServerTestCase 
+	TokenNamePLUS	
"\(SocketServerTestCase.java:\d{3}\) Message \d{1,2}"	TokenNameStringLiteral	\(SocketServerTestCase.java:\d{3}\) Message \d{1,2}
;	TokenNameSEMICOLON	
// DEBUG some T4 MDC-TEST4 [main] SocketAppenderTestCase - Message 1 	TokenNameCOMMENT_LINE	DEBUG some T4 MDC-TEST4 [main] SocketAppenderTestCase - Message 1 
// DEBUG some T4 MDC-TEST4 [main] SocketAppenderTestCase - Message 1 	TokenNameCOMMENT_LINE	DEBUG some T4 MDC-TEST4 [main] SocketAppenderTestCase - Message 1 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT4	TokenNameIdentifier	 PA T4
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some T4 MDC-TEST4 \[main]\"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some T4 MDC-TEST4 \[main]\
+	TokenNamePLUS	
" (root|SocketServerTestCase) - Message \d{1,2}"	TokenNameStringLiteral	 (root|SocketServerTestCase) - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT5	TokenNameIdentifier	 PA T5
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some5 T5 MDC-TEST5 \[main]\"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some5 T5 MDC-TEST5 \[main]\
+	TokenNamePLUS	
" (root|SocketServerTestCase) - Message \d{1,2}"	TokenNameStringLiteral	 (root|SocketServerTestCase) - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT6	TokenNameIdentifier	 PA T6
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some6 T6 client-test6 MDC-TEST6"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some6 T6 client-test6 MDC-TEST6
+	TokenNamePLUS	
" \[main]\ (root|SocketServerTestCase) - Message \d{1,2}"	TokenNameStringLiteral	 \[main]\ (root|SocketServerTestCase) - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT7	TokenNameIdentifier	 PA T7
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some7 T7 client-test7 MDC-TEST7"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some7 T7 client-test7 MDC-TEST7
+	TokenNamePLUS	
" \[main]\ (root|SocketServerTestCase) - Message \d{1,2}"	TokenNameStringLiteral	 \[main]\ (root|SocketServerTestCase) - Message \d{1,2}
;	TokenNameSEMICOLON	
// DEBUG some8 T8 shortSocketServer MDC-TEST7 [main] SocketServerTestCase - Message 1 	TokenNameCOMMENT_LINE	DEBUG some8 T8 shortSocketServer MDC-TEST7 [main] SocketServerTestCase - Message 1 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT8	TokenNameIdentifier	 PA T8
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some8 T8 shortSocketServer"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL|LETHAL) some8 T8 shortSocketServer
+	TokenNamePLUS	
" MDC-TEST8 \[main]\ (root|SocketServerTestCase) - Message \d{1,2}"	TokenNameStringLiteral	 MDC-TEST8 \[main]\ (root|SocketServerTestCase) - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
=	TokenNameEQUAL	
"java.lang.Exception: Just testing"	TokenNameStringLiteral	java.lang.Exception: Just testing
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
=	TokenNameEQUAL	
"\s*at .*\(.*\)"	TokenNameStringLiteral	\s*at .*\(.*\)
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
=	TokenNameEQUAL	
"\s*at .*\(Native Method\)"	TokenNameStringLiteral	\s*at .*\(Native Method\)
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
=	TokenNameEQUAL	
"\s*at .*\(.*Compiled Code\)"	TokenNameStringLiteral	\s*at .*\(.*Compiled Code\)
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
=	TokenNameEQUAL	
"\s*at .*\(.*libgcj.*\)"	TokenNameStringLiteral	\s*at .*\(.*libgcj.*\)
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
PORT	TokenNameIdentifier	 PORT
=	TokenNameEQUAL	
12345	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
rootLogger	TokenNameIdentifier	 root Logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SocketAppender	TokenNameIdentifier	 Socket Appender
socketAppender	TokenNameIdentifier	 socket Appender
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
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
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Setting up test case."	TokenNameStringLiteral	Setting up test case.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Tearing down test case."	TokenNameStringLiteral	Tearing down test case.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x [%t] %c %m%n * * We are testing NDC functionality across the wire. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x [%t] %c %m%n * We are testing NDC functionality across the wire. 
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T1"	TokenNameStringLiteral	T1
,	TokenNameCOMMA	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"MDC-TEST1"	TokenNameStringLiteral	MDC-TEST1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT1	TokenNameIdentifier	 PA T1
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.1"	TokenNameStringLiteral	witness/socketServer.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x [%t] %C (%F:%L) %m%n * * We are testing NDC across the wire. Localization is turned off by * default so it is not tested here even if the conversion pattern * uses localization. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x [%t] %C (%F:%L) %m%n * We are testing NDC across the wire. Localization is turned off by default so it is not tested here even if the conversion pattern uses localization. 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T2"	TokenNameStringLiteral	T2
,	TokenNameCOMMA	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"MDC-TEST2"	TokenNameStringLiteral	MDC-TEST2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT2	TokenNameIdentifier	 PA T2
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.2"	TokenNameStringLiteral	witness/socketServer.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x [%t] %C (%F:%L) %m%n * meaning that we are testing NDC and locatization functionality * across the wire. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x [%t] %C (%F:%L) %m%n meaning that we are testing NDC and locatization functionality across the wire. 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T3"	TokenNameStringLiteral	T3
,	TokenNameCOMMA	
"key3"	TokenNameStringLiteral	key3
,	TokenNameCOMMA	
"MDC-TEST3"	TokenNameStringLiteral	MDC-TEST3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT3	TokenNameIdentifier	 PA T3
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.3"	TokenNameStringLiteral	witness/socketServer.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x %X{key1}%X{key4} [%t] %c{1} - %m%n * meaning that we are testing NDC, MDC and localization functionality across * the wire. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x %X{key1}%X{key4} [%t] %c{1} - %m%n meaning that we are testing NDC, MDC and localization functionality across the wire. 
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"some"	TokenNameStringLiteral	some
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T4"	TokenNameStringLiteral	T4
,	TokenNameCOMMA	
"key4"	TokenNameStringLiteral	key4
,	TokenNameCOMMA	
"MDC-TEST4"	TokenNameStringLiteral	MDC-TEST4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// These tests check MDC operation which 	TokenNameCOMMENT_LINE	These tests check MDC operation which 
// requires JDK 1.2 or later 	TokenNameCOMMENT_LINE	requires JDK 1.2 or later 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT4	TokenNameIdentifier	 PA T4
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.4"	TokenNameStringLiteral	witness/socketServer.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x %X{key1}%X{key5} [%t] %c{1} - %m%n * * The test case uses wraps an AsyncAppender around the * SocketAppender. This tests was written specifically for bug * report #9155. * Prior to the bug fix the output on the server did not contain the * MDC-TEST5 string because the MDC clone operation (in getMDCCopy * method) operation is performed twice, once from the main thread * which is correct, and a second time from the AsyncAppender's * dispatch thread which is incrorrect. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x %X{key1}%X{key5} [%t] %c{1} - %m%n * The test case uses wraps an AsyncAppender around the SocketAppender. This tests was written specifically for bug report #9155. Prior to the bug fix the output on the server did not contain the MDC-TEST5 string because the MDC clone operation (in getMDCCopy method) operation is performed twice, once from the main thread which is correct, and a second time from the AsyncAppender's dispatch thread which is incrorrect. 
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"some5"	TokenNameStringLiteral	some5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T5"	TokenNameStringLiteral	T5
,	TokenNameCOMMA	
"key5"	TokenNameStringLiteral	key5
,	TokenNameCOMMA	
"MDC-TEST5"	TokenNameStringLiteral	MDC-TEST5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// These tests check MDC operation which 	TokenNameCOMMENT_LINE	These tests check MDC operation which 
// requires JDK 1.2 or later 	TokenNameCOMMENT_LINE	requires JDK 1.2 or later 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT5	TokenNameIdentifier	 PA T5
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.5"	TokenNameStringLiteral	witness/socketServer.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x %X{hostID}${key6} [%t] %c{1} - %m%n * * This test checks whether client-side MDC overrides the server side. * It uses an AsyncAppender encapsulating a SocketAppender */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x %X{hostID}${key6} [%t] %c{1} - %m%n * This test checks whether client-side MDC overrides the server side. It uses an AsyncAppender encapsulating a SocketAppender 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"some6"	TokenNameStringLiteral	some6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"hostID"	TokenNameStringLiteral	hostID
,	TokenNameCOMMA	
"client-test6"	TokenNameStringLiteral	client-test6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T6"	TokenNameStringLiteral	T6
,	TokenNameCOMMA	
"key6"	TokenNameStringLiteral	key6
,	TokenNameCOMMA	
"MDC-TEST6"	TokenNameStringLiteral	MDC-TEST6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"hostID"	TokenNameStringLiteral	hostID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// These tests check MDC operation which 	TokenNameCOMMENT_LINE	These tests check MDC operation which 
// requires JDK 1.2 or later 	TokenNameCOMMENT_LINE	requires JDK 1.2 or later 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT6	TokenNameIdentifier	 PA T6
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.6"	TokenNameStringLiteral	witness/socketServer.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x %X{hostID}${key7} [%t] %c{1} - %m%n * * This test checks whether client-side MDC overrides the server side. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x %X{hostID}${key7} [%t] %c{1} - %m%n * This test checks whether client-side MDC overrides the server side. 
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"some7"	TokenNameStringLiteral	some7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"hostID"	TokenNameStringLiteral	hostID
,	TokenNameCOMMA	
"client-test7"	TokenNameStringLiteral	client-test7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T7"	TokenNameStringLiteral	T7
,	TokenNameCOMMA	
"key7"	TokenNameStringLiteral	key7
,	TokenNameCOMMA	
"MDC-TEST7"	TokenNameStringLiteral	MDC-TEST7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"hostID"	TokenNameStringLiteral	hostID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// These tests check MDC operation which 	TokenNameCOMMENT_LINE	These tests check MDC operation which 
// requires JDK 1.2 or later 	TokenNameCOMMENT_LINE	requires JDK 1.2 or later 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT7	TokenNameIdentifier	 PA T7
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.7"	TokenNameStringLiteral	witness/socketServer.7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The pattern on the server side: %5p %x %X{hostID} ${key8} [%t] %c{1} - %m%n * * This test checks whether server side MDC works. */	TokenNameCOMMENT_JAVADOC	 The pattern on the server side: %5p %x %X{hostID} ${key8} [%t] %c{1} - %m%n * This test checks whether server side MDC works. 
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
socketAppender	TokenNameIdentifier	 socket Appender
=	TokenNameEQUAL	
new	TokenNamenew	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
PORT	TokenNameIdentifier	 PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socketAppender	TokenNameIdentifier	 socket Appender
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
socketAppender	TokenNameIdentifier	 socket Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"some8"	TokenNameStringLiteral	some8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// The test has relied on the receiving code to 	TokenNameCOMMENT_LINE	The test has relied on the receiving code to 
// combine the sent MDC with the receivers MDC 	TokenNameCOMMENT_LINE	combine the sent MDC with the receivers MDC 
// (which contains a value for hostID). 	TokenNameCOMMENT_LINE	(which contains a value for hostID). 
// The mechanism of how that happens is not clear 	TokenNameCOMMENT_LINE	The mechanism of how that happens is not clear 
// and it does not work with Apache Harmony. 	TokenNameCOMMENT_LINE	and it does not work with Apache Harmony. 
// Unclear if it is a Harmony issue. 	TokenNameCOMMENT_LINE	Unclear if it is a Harmony issue. 
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vendor"	TokenNameStringLiteral	java.vendor
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Apache"	TokenNameStringLiteral	Apache
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"hostID"	TokenNameStringLiteral	hostID
,	TokenNameCOMMA	
"shortSocketServer"	TokenNameStringLiteral	shortSocketServer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"T8"	TokenNameStringLiteral	T8
,	TokenNameCOMMA	
"key8"	TokenNameStringLiteral	key8
,	TokenNameCOMMA	
"MDC-TEST8"	TokenNameStringLiteral	MDC-TEST8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// These tests check MDC operation which 	TokenNameCOMMENT_LINE	These tests check MDC operation which 
// requires JDK 1.2 or later 	TokenNameCOMMENT_LINE	requires JDK 1.2 or later 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ControlFilter	TokenNameIdentifier	 Control Filter
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT8	TokenNameIdentifier	 PA T8
,	TokenNameCOMMA	
EXCEPTION1	TokenNameIdentifier	 EXCEPTIO N1
,	TokenNameCOMMA	
EXCEPTION2	TokenNameIdentifier	 EXCEPTIO N2
,	TokenNameCOMMA	
EXCEPTION3	TokenNameIdentifier	 EXCEPTIO N3
,	TokenNameCOMMA	
EXCEPTION4	TokenNameIdentifier	 EXCEPTIO N4
,	TokenNameCOMMA	
EXCEPTION5	TokenNameIdentifier	 EXCEPTIO N5
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FILTERED	TokenNameIdentifier	 FILTERED
,	TokenNameCOMMA	
"witness/socketServer.8"	TokenNameStringLiteral	witness/socketServer.8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
oldThreadName	TokenNameIdentifier	 old Thread Name
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"main"	TokenNameStringLiteral	main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//5 	TokenNameCOMMENT_LINE	5 
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Just testing"	TokenNameStringLiteral	Just testing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
oldThreadName	TokenNameIdentifier	 old Thread Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
int	TokenNameint	
secs	TokenNameIdentifier	 secs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
secs	TokenNameIdentifier	 secs
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
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
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test7"	TokenNameStringLiteral	test7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
SocketServerTestCase	TokenNameIdentifier	 Socket Server Test Case
(	TokenNameLPAREN	
"test8"	TokenNameStringLiteral	test8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
