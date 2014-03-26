/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
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
Logger	TokenNameIdentifier	 Logger
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
Appender	TokenNameIdentifier	 Appender
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
FileAppender	TokenNameIdentifier	 File Appender
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
SimpleLayout	TokenNameIdentifier	 Simple Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
.	TokenNameDOT	
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
.	TokenNameDOT	
DenyAllFilter	TokenNameIdentifier	 Deny All Filter
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
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
;	TokenNameSEMICOLON	
/** Test case for varia/LevelMatchFilter.java. */	TokenNameCOMMENT_JAVADOC	 Test case for varia/LevelMatchFilter.java. 
public	TokenNamepublic	
class	TokenNameclass	
LevelMatchFilterTestCase	TokenNameIdentifier	 Level Match Filter Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ACCEPT_FILE	TokenNameIdentifier	 ACCEPT  FILE
=	TokenNameEQUAL	
"output/LevelMatchFilter_accept"	TokenNameStringLiteral	output/LevelMatchFilter_accept
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ACCEPT_FILTERED	TokenNameIdentifier	 ACCEPT  FILTERED
=	TokenNameEQUAL	
"output/LevelMatchFilter_accept_filtered"	TokenNameStringLiteral	output/LevelMatchFilter_accept_filtered
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ACCEPT_WITNESS	TokenNameIdentifier	 ACCEPT  WITNESS
=	TokenNameEQUAL	
"witness/LevelMatchFilter_accept"	TokenNameStringLiteral	witness/LevelMatchFilter_accept
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DENY_FILE	TokenNameIdentifier	 DENY  FILE
=	TokenNameEQUAL	
"output/LevelMatchFilter_deny"	TokenNameStringLiteral	output/LevelMatchFilter_deny
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DENY_FILTERED	TokenNameIdentifier	 DENY  FILTERED
=	TokenNameEQUAL	
"output/LevelMatchFilter_deny_filtered"	TokenNameStringLiteral	output/LevelMatchFilter_deny_filtered
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DENY_WITNESS	TokenNameIdentifier	 DENY  WITNESS
=	TokenNameEQUAL	
"witness/LevelMatchFilter_deny"	TokenNameStringLiteral	witness/LevelMatchFilter_deny
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LevelMatchFilterTestCase	TokenNameIdentifier	 Level Match Filter Test Case
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
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// set up appender 	TokenNameCOMMENT_LINE	set up appender 
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
ACCEPT_FILE	TokenNameIdentifier	 ACCEPT  FILE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create LevelMatchFilter 	TokenNameCOMMENT_LINE	create LevelMatchFilter 
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
matchFilter	TokenNameIdentifier	 match Filter
=	TokenNameEQUAL	
new	TokenNamenew	
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attach match filter to appender 	TokenNameCOMMENT_LINE	attach match filter to appender 
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
matchFilter	TokenNameIdentifier	 match Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attach DenyAllFilter to end of filter chain to deny neutral 	TokenNameCOMMENT_LINE	attach DenyAllFilter to end of filter chain to deny neutral 
// (non matching) messages 	TokenNameCOMMENT_LINE	(non matching) messages 
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
new	TokenNamenew	
DenyAllFilter	TokenNameIdentifier	 Deny All Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set appender on root and set level to debug 	TokenNameCOMMENT_LINE	set appender on root and set level to debug 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
levelArray	TokenNameIdentifier	 level Array
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
levelArray	TokenNameIdentifier	 level Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set the level to match 	TokenNameCOMMENT_LINE	set the level to match 
matchFilter	TokenNameIdentifier	 match Filter
.	TokenNameDOT	
setLevelToMatch	TokenNameIdentifier	 set Level To Match
(	TokenNameLPAREN	
levelArray	TokenNameIdentifier	 level Array
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"pass "	TokenNameStringLiteral	pass 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
"; filter set to accept only "	TokenNameStringLiteral	; filter set to accept only 
+	TokenNamePLUS	
levelArray	TokenNameIdentifier	 level Array
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" msgs"	TokenNameStringLiteral	 msgs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
ACCEPT_FILE	TokenNameIdentifier	 ACCEPT  FILE
,	TokenNameCOMMA	
ACCEPT_FILTERED	TokenNameIdentifier	 ACCEPT  FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ACCEPT_FILTERED	TokenNameIdentifier	 ACCEPT  FILTERED
,	TokenNameCOMMA	
ACCEPT_WITNESS	TokenNameIdentifier	 ACCEPT  WITNESS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deny	TokenNameIdentifier	 deny
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// set up appender 	TokenNameCOMMENT_LINE	set up appender 
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
DENY_FILE	TokenNameIdentifier	 DENY  FILE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create LevelMatchFilter, set to deny matches 	TokenNameCOMMENT_LINE	create LevelMatchFilter, set to deny matches 
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
matchFilter	TokenNameIdentifier	 match Filter
=	TokenNameEQUAL	
new	TokenNamenew	
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFilter	TokenNameIdentifier	 match Filter
.	TokenNameDOT	
setAcceptOnMatch	TokenNameIdentifier	 set Accept On Match
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attach match filter to appender 	TokenNameCOMMENT_LINE	attach match filter to appender 
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
matchFilter	TokenNameIdentifier	 match Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set appender on root and set level to debug 	TokenNameCOMMENT_LINE	set appender on root and set level to debug 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
levelArray	TokenNameIdentifier	 level Array
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
levelArray	TokenNameIdentifier	 level Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set the level to match 	TokenNameCOMMENT_LINE	set the level to match 
matchFilter	TokenNameIdentifier	 match Filter
.	TokenNameDOT	
setLevelToMatch	TokenNameIdentifier	 set Level To Match
(	TokenNameLPAREN	
levelArray	TokenNameIdentifier	 level Array
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
"pass "	TokenNameStringLiteral	pass 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
"; filter set to deny only "	TokenNameStringLiteral	; filter set to deny only 
+	TokenNamePLUS	
levelArray	TokenNameIdentifier	 level Array
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" msgs"	TokenNameStringLiteral	 msgs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
DENY_FILE	TokenNameIdentifier	 DENY  FILE
,	TokenNameCOMMA	
DENY_FILTERED	TokenNameIdentifier	 DENY  FILTERED
,	TokenNameCOMMA	
new	TokenNamenew	
LineNumberFilter	TokenNameIdentifier	 Line Number Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
DENY_FILTERED	TokenNameIdentifier	 DENY  FILTERED
,	TokenNameCOMMA	
DENY_WITNESS	TokenNameIdentifier	 DENY  WITNESS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
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
LevelMatchFilterTestCase	TokenNameIdentifier	 Level Match Filter Test Case
(	TokenNameLPAREN	
"accept"	TokenNameStringLiteral	accept
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
LevelMatchFilterTestCase	TokenNameIdentifier	 Level Match Filter Test Case
(	TokenNameLPAREN	
"deny"	TokenNameStringLiteral	deny
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
