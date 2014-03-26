/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbsoluteDateAndTimeFilter	TokenNameIdentifier	 Absolute Date And Time Filter
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
AbsoluteTimeFilter	TokenNameIdentifier	 Absolute Time Filter
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
Compare	TokenNameIdentifier	 Compare
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
ControlFilter	TokenNameIdentifier	 Control Filter
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
Filter	TokenNameIdentifier	 Filter
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
ISO8601Filter	TokenNameIdentifier	 IS O8601 Filter
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
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
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
RelativeTimeFilter	TokenNameIdentifier	 Relative Time Filter
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
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
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
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PatternLayoutTestCase	TokenNameIdentifier	 Pattern Layout Test Case
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
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
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
String	TokenNameIdentifier	 String
PAT0	TokenNameIdentifier	 PA T0
=	TokenNameEQUAL	
"\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) .* - Message \d{1,2}"	TokenNameStringLiteral	\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) .* - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT1	TokenNameIdentifier	 PA T1
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ISO8601_PAT	TokenNameIdentifier	 IS O8601  PAT
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
PAT0	TokenNameIdentifier	 PA T0
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT2	TokenNameIdentifier	 PA T2
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_DATE_AND_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  DATE  AND  TIME  PAT
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
PAT0	TokenNameIdentifier	 PA T0
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT3	TokenNameIdentifier	 PA T3
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  TIME  PAT
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
PAT0	TokenNameIdentifier	 PA T0
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT4	TokenNameIdentifier	 PA T4
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
RELATIVE_TIME_PAT	TokenNameIdentifier	 RELATIVE  TIME  PAT
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
PAT0	TokenNameIdentifier	 PA T0
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT5	TokenNameIdentifier	 PA T5
=	TokenNameEQUAL	
"\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) .* : Message \d{1,2}"	TokenNameStringLiteral	\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) .* : Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT6	TokenNameIdentifier	 PA T6
=	TokenNameEQUAL	
"\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) org.apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java(:\d{1,4})?\): Message \d{1,2}"	TokenNameStringLiteral	\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) org.apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java(:\d{1,4})?\): Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT11a	TokenNameIdentifier	 PA T11a
=	TokenNameEQUAL	
"^(TRACE|DEBUG|INFO |WARN |ERROR|FATAL) \[main]\ log4j.PatternLayoutTestCase: Message \d{1,2}"	TokenNameStringLiteral	^(TRACE|DEBUG|INFO |WARN |ERROR|FATAL) \[main]\ log4j.PatternLayoutTestCase: Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT11b	TokenNameIdentifier	 PA T11b
=	TokenNameEQUAL	
"^(TRACE|DEBUG|INFO |WARN |ERROR|FATAL) \[main]\ root: Message \d{1,2}"	TokenNameStringLiteral	^(TRACE|DEBUG|INFO |WARN |ERROR|FATAL) \[main]\ root: Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT12	TokenNameIdentifier	 PA T12
=	TokenNameEQUAL	
"^\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) "	TokenNameStringLiteral	^\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) 
+	TokenNamePLUS	
"org.apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java:\d{3}\): "	TokenNameStringLiteral	org.apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java:\d{3}\): 
+	TokenNamePLUS	
"Message \d{1,2}"	TokenNameStringLiteral	Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT13	TokenNameIdentifier	 PA T13
=	TokenNameEQUAL	
"^\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) "	TokenNameStringLiteral	^\[main]\ (TRACE|DEBUG|INFO |WARN |ERROR|FATAL) 
+	TokenNamePLUS	
"apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java:\d{3}\): "	TokenNameStringLiteral	apache.log4j.PatternLayoutTestCase.common\(PatternLayoutTestCase.java:\d{3}\): 
+	TokenNamePLUS	
"Message \d{1,2}"	TokenNameStringLiteral	Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PAT14	TokenNameIdentifier	 PA T14
=	TokenNameEQUAL	
"^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL)\ \d{1,2}\ *- Message \d{1,2}"	TokenNameStringLiteral	^(TRACE|DEBUG| INFO| WARN|ERROR|FATAL)\ \d{1,2}\ *- Message \d{1,2}
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PatternLayoutTestCase	TokenNameIdentifier	 Pattern Layout Test Case
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
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
PatternLayoutTestCase	TokenNameIdentifier	 Pattern Layout Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout1.properties"	TokenNameStringLiteral	input/patternLayout1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
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
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.1"	TokenNameStringLiteral	witness/patternLayout.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout2.properties"	TokenNameStringLiteral	input/patternLayout2.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ISO8601Filter	TokenNameIdentifier	 IS O8601 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.2"	TokenNameStringLiteral	witness/patternLayout.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout3.properties"	TokenNameStringLiteral	input/patternLayout3.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ISO8601Filter	TokenNameIdentifier	 IS O8601 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.3"	TokenNameStringLiteral	witness/patternLayout.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Output format: 	TokenNameCOMMENT_LINE	Output format: 
// 06 avr. 2002 18:30:58,937 [main] DEBUG rnLayoutTestCase - Message 0 	TokenNameCOMMENT_LINE	06 avr. 2002 18:30:58,937 [main] DEBUG rnLayoutTestCase - Message 0 
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout4.properties"	TokenNameStringLiteral	input/patternLayout4.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AbsoluteDateAndTimeFilter	TokenNameIdentifier	 Absolute Date And Time Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.4"	TokenNameStringLiteral	witness/patternLayout.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout5.properties"	TokenNameStringLiteral	input/patternLayout5.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AbsoluteDateAndTimeFilter	TokenNameIdentifier	 Absolute Date And Time Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.5"	TokenNameStringLiteral	witness/patternLayout.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 18:54:19,201 [main] DEBUG rnLayoutTestCase - Message 0 	TokenNameCOMMENT_LINE	18:54:19,201 [main] DEBUG rnLayoutTestCase - Message 0 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout6.properties"	TokenNameStringLiteral	input/patternLayout6.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AbsoluteTimeFilter	TokenNameIdentifier	 Absolute Time Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.6"	TokenNameStringLiteral	witness/patternLayout.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout7.properties"	TokenNameStringLiteral	input/patternLayout7.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AbsoluteTimeFilter	TokenNameIdentifier	 Absolute Time Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.7"	TokenNameStringLiteral	witness/patternLayout.7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout8.properties"	TokenNameStringLiteral	input/patternLayout8.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
RelativeTimeFilter	TokenNameIdentifier	 Relative Time Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.8"	TokenNameStringLiteral	witness/patternLayout.8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout9.properties"	TokenNameStringLiteral	input/patternLayout9.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.9"	TokenNameStringLiteral	witness/patternLayout.9
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout10.properties"	TokenNameStringLiteral	input/patternLayout10.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.10"	TokenNameStringLiteral	witness/patternLayout.10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test11	TokenNameIdentifier	 test11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout11.properties"	TokenNameStringLiteral	input/patternLayout11.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT11a	TokenNameIdentifier	 PA T11a
,	TokenNameCOMMA	
PAT11b	TokenNameIdentifier	 PA T11b
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.11"	TokenNameStringLiteral	witness/patternLayout.11
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test12	TokenNameIdentifier	 test12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout12.properties"	TokenNameStringLiteral	input/patternLayout12.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT12	TokenNameIdentifier	 PA T12
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.12"	TokenNameStringLiteral	witness/patternLayout.12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test13	TokenNameIdentifier	 test13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout13.properties"	TokenNameStringLiteral	input/patternLayout13.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT13	TokenNameIdentifier	 PA T13
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.13"	TokenNameStringLiteral	witness/patternLayout.13
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test14	TokenNameIdentifier	 test14
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout14.properties"	TokenNameStringLiteral	input/patternLayout14.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ControlFilter	TokenNameIdentifier	 Control Filter
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
new	TokenNamenew	
ControlFilter	TokenNameIdentifier	 Control Filter
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PAT14	TokenNameIdentifier	 PA T14
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
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SunReflectFilter	TokenNameIdentifier	 Sun Reflect Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JunitTestRunnerFilter	TokenNameIdentifier	 Junit Test Runner Filter
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
"witness/patternLayout.14"	TokenNameStringLiteral	witness/patternLayout.14
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMDC1	TokenNameIdentifier	 test MD C1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout.mdc.1.properties"	TokenNameStringLiteral	input/patternLayout.mdc.1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"va11"	TokenNameStringLiteral	va11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"va12"	TokenNameStringLiteral	va12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
"witness/patternLayout.mdc.1"	TokenNameStringLiteral	witness/patternLayout.mdc.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMDCClear	TokenNameIdentifier	 test MDC Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/patternLayout.mdc.1.properties"	TokenNameStringLiteral	input/patternLayout.mdc.1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"va11"	TokenNameStringLiteral	va11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"va12"	TokenNameStringLiteral	va12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
TEMP	TokenNameIdentifier	 TEMP
,	TokenNameCOMMA	
"witness/patternLayout.mdc.clear"	TokenNameStringLiteral	witness/patternLayout.mdc.clear
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
}	TokenNameRBRACE	
