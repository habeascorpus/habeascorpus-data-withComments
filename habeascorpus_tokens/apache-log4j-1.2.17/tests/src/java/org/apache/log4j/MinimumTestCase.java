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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
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
/** A superficial but general test of log4j. */	TokenNameCOMMENT_JAVADOC	 A superficial but general test of log4j. 
public	TokenNamepublic	
class	TokenNameclass	
MinimumTestCase	TokenNameIdentifier	 Minimum Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FILTERED	TokenNameIdentifier	 FILTERED
=	TokenNameEQUAL	
"output/filtered"	TokenNameStringLiteral	output/filtered
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
//18 fevr. 2002 20:02:41,551 [main] FATAL ERR - Message 0 	TokenNameCOMMENT_LINE	18 fevr. 2002 20:02:41,551 [main] FATAL ERR - Message 0 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TTCC_PAT	TokenNameIdentifier	 TTCC  PAT
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_DATE_AND_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  DATE  AND  TIME  PAT
+	TokenNamePLUS	
" \[main]\ (TRACE|DEBUG|INFO|WARN|ERROR|FATAL) .* - Message \d{1,2}"	TokenNameStringLiteral	 \[main]\ (TRACE|DEBUG|INFO|WARN|ERROR|FATAL) .* - Message \d{1,2}
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TTCC2_PAT	TokenNameIdentifier	 TTC C2  PAT
=	TokenNameEQUAL	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ABSOLUTE_DATE_AND_TIME_PAT	TokenNameIdentifier	 ABSOLUTE  DATE  AND  TIME  PAT
+	TokenNamePLUS	
" \[main]\ (TRACE|DEBUG|INFO|WARN|ERROR|FATAL) .* - Messages should bear numbers 0 through 29\."	TokenNameStringLiteral	 \[main]\ (TRACE|DEBUG|INFO|WARN|ERROR|FATAL) .* - Messages should bear numbers 0 through 29\.
;	TokenNameSEMICOLON	
//18 fvr. 2002 19:49:53,456 	TokenNameCOMMENT_LINE	18 fvr. 2002 19:49:53,456 
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MinimumTestCase	TokenNameIdentifier	 Minimum Test Case
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
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
simple	TokenNameIdentifier	 simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
"output/simple"	TokenNameStringLiteral	output/simple
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
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
"output/simple"	TokenNameStringLiteral	output/simple
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
"witness/simple"	TokenNameStringLiteral	witness/simple
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ttcc	TokenNameIdentifier	 ttcc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
DATE_AND_TIME_DATE_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  DATE  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
"output/ttcc"	TokenNameStringLiteral	output/ttcc
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldName	TokenNameIdentifier	 old Name
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
common	TokenNameIdentifier	 common
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
oldName	TokenNameIdentifier	 old Name
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
TTCC_PAT	TokenNameIdentifier	 TTCC  PAT
,	TokenNameCOMMA	
TTCC2_PAT	TokenNameIdentifier	 TTC C2  PAT
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
"output/ttcc"	TokenNameStringLiteral	output/ttcc
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
"witness/ttcc"	TokenNameStringLiteral	witness/ttcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// In the lines below, the category names are chosen as an aid in 	TokenNameCOMMENT_LINE	In the lines below, the category names are chosen as an aid in 
// remembering their level values. In general, the category names 	TokenNameCOMMENT_LINE	remembering their level values. In general, the category names 
// have no bearing to level values. 	TokenNameCOMMENT_LINE	have no bearing to level values. 
Logger	TokenNameIdentifier	 Logger
ERR	TokenNameIdentifier	 ERR
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"ERR"	TokenNameStringLiteral	ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ERR	TokenNameIdentifier	 ERR
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
INF	TokenNameIdentifier	 INF
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
INF_ERR	TokenNameIdentifier	 INF  ERR
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"INF.ERR"	TokenNameStringLiteral	INF.ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
INF_ERR	TokenNameIdentifier	 INF  ERR
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
DEB	TokenNameIdentifier	 DEB
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"DEB"	TokenNameStringLiteral	DEB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DEB	TokenNameIdentifier	 DEB
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
TRC	TokenNameIdentifier	 TRC
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"TRC"	TokenNameStringLiteral	TRC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: categories with undefined level 	TokenNameCOMMENT_LINE	Note: categories with undefined level 
Logger	TokenNameIdentifier	 Logger
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"INF.UNDEF"	TokenNameStringLiteral	INF.UNDEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"INF.ERR.UNDEF"	TokenNameStringLiteral	INF.ERR.UNDEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
UNDEF	TokenNameIdentifier	 UNDEF
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"UNDEF"	TokenNameStringLiteral	UNDEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These should all log.---------------------------- 	TokenNameCOMMENT_LINE	These should all log.---------------------------- 
ERR	TokenNameIdentifier	 ERR
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//0 	TokenNameCOMMENT_LINE	0 
ERR	TokenNameIdentifier	 ERR
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF	TokenNameIdentifier	 INF
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// 2 	TokenNameCOMMENT_LINE	2 
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//6 	TokenNameCOMMENT_LINE	6 
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR	TokenNameIdentifier	 INF  ERR
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// 10 	TokenNameCOMMENT_LINE	10 
INF_ERR	TokenNameIdentifier	 INF  ERR
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
DEB	TokenNameIdentifier	 DEB
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//14 	TokenNameCOMMENT_LINE	14 
DEB	TokenNameIdentifier	 DEB
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
DEB	TokenNameIdentifier	 DEB
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
DEB	TokenNameIdentifier	 DEB
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
DEB	TokenNameIdentifier	 DEB
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//19 	TokenNameCOMMENT_LINE	19 
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
TRC	TokenNameIdentifier	 TRC
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// defaultLevel=DEBUG 	TokenNameCOMMENT_LINE	defaultLevel=DEBUG 
UNDEF	TokenNameIdentifier	 UNDEF
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// 25 	TokenNameCOMMENT_LINE	25 
UNDEF	TokenNameIdentifier	 UNDEF
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
UNDEF	TokenNameIdentifier	 UNDEF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
UNDEF	TokenNameIdentifier	 UNDEF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
UNDEF	TokenNameIdentifier	 UNDEF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Just testing."	TokenNameStringLiteral	Just testing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
printCount	TokenNameIdentifier	 print Count
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// ------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------- 
// The following should not log 	TokenNameCOMMENT_LINE	The following should not log 
ERR	TokenNameIdentifier	 ERR
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ERR	TokenNameIdentifier	 ERR
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ERR	TokenNameIdentifier	 ERR
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_UNDEF	TokenNameIdentifier	 INF  UNDEF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR	TokenNameIdentifier	 INF  ERR
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR	TokenNameIdentifier	 INF  ERR
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR	TokenNameIdentifier	 INF  ERR
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
INF_ERR_UNDEF	TokenNameIdentifier	 INF  ERR  UNDEF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
UNDEF	TokenNameIdentifier	 UNDEF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Just testing."	TokenNameStringLiteral	Just testing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// ------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------- 
INF	TokenNameIdentifier	 INF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Messages should bear numbers 0 through "	TokenNameStringLiteral	Messages should bear numbers 0 through 
+	TokenNamePLUS	
printCount	TokenNameIdentifier	 print Count
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
MinimumTestCase	TokenNameIdentifier	 Minimum Test Case
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
MinimumTestCase	TokenNameIdentifier	 Minimum Test Case
(	TokenNameLPAREN	
"ttcc"	TokenNameStringLiteral	ttcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
