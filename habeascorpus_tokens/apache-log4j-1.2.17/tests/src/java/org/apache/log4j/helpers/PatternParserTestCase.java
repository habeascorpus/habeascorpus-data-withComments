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
PatternLayout	TokenNameIdentifier	 Pattern Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
MDC	TokenNameIdentifier	 MDC
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
/** Test case for helpers/PatternParser.java. Tests the various conversion patterns supported by PatternParser. This test class tests PatternParser via the PatternLayout class which uses it. */	TokenNameCOMMENT_JAVADOC	 Test case for helpers/PatternParser.java. Tests the various conversion patterns supported by PatternParser. This test class tests PatternParser via the PatternLayout class which uses it. 
public	TokenNamepublic	
class	TokenNameclass	
PatternParserTestCase	TokenNameIdentifier	 Pattern Parser Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
OUTPUT_FILE	TokenNameIdentifier	 OUTPUT  FILE
=	TokenNameEQUAL	
"output/PatternParser"	TokenNameStringLiteral	output/PatternParser
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
WITNESS_FILE	TokenNameIdentifier	 WITNESS  FILE
=	TokenNameEQUAL	
"witness/PatternParser"	TokenNameStringLiteral	witness/PatternParser
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
msgPattern	TokenNameIdentifier	 msg Pattern
=	TokenNameEQUAL	
"%m%n"	TokenNameStringLiteral	%m%n
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PatternParserTestCase	TokenNameIdentifier	 Pattern Parser Test Case
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
/** Test case for MDC conversion pattern. */	TokenNameCOMMENT_JAVADOC	 Test case for MDC conversion pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
mdcPattern	TokenNameIdentifier	 mdc Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mdcMsgPattern1	TokenNameIdentifier	 mdc Msg Pattern1
=	TokenNameEQUAL	
"%m : %X%n"	TokenNameStringLiteral	%m : %X%n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mdcMsgPattern2	TokenNameIdentifier	 mdc Msg Pattern2
=	TokenNameEQUAL	
"%m : %X{key1}%n"	TokenNameStringLiteral	%m : %X{key1}%n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mdcMsgPattern3	TokenNameIdentifier	 mdc Msg Pattern3
=	TokenNameEQUAL	
"%m : %X{key2}%n"	TokenNameStringLiteral	%m : %X{key2}%n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mdcMsgPattern4	TokenNameIdentifier	 mdc Msg Pattern4
=	TokenNameEQUAL	
"%m : %X{key3}%n"	TokenNameStringLiteral	%m : %X{key3}%n
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mdcMsgPattern5	TokenNameIdentifier	 mdc Msg Pattern5
=	TokenNameEQUAL	
"%m : %X{key1},%X{key2},%X{key3}%n"	TokenNameStringLiteral	%m : %X{key1},%X{key2},%X{key3}%n
;	TokenNameSEMICOLON	
// set up appender 	TokenNameCOMMENT_LINE	set up appender 
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
msgPattern	TokenNameIdentifier	 msg Pattern
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
OUTPUT_FILE	TokenNameIdentifier	 OUTPUT  FILE
+	TokenNamePLUS	
"_mdc"	TokenNameStringLiteral	_mdc
,	TokenNameCOMMA	
false	TokenNamefalse	
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
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// output starting message 	TokenNameCOMMENT_LINE	output starting message 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"starting mdc pattern test"	TokenNameStringLiteral	starting mdc pattern test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern1	TokenNameIdentifier	 mdc Msg Pattern1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"empty mdc, no key specified in pattern"	TokenNameStringLiteral	empty mdc, no key specified in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern2	TokenNameIdentifier	 mdc Msg Pattern2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"empty mdc, key1 in pattern"	TokenNameStringLiteral	empty mdc, key1 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern3	TokenNameIdentifier	 mdc Msg Pattern3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"empty mdc, key2 in pattern"	TokenNameStringLiteral	empty mdc, key2 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern4	TokenNameIdentifier	 mdc Msg Pattern4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"empty mdc, key3 in pattern"	TokenNameStringLiteral	empty mdc, key3 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern5	TokenNameIdentifier	 mdc Msg Pattern5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"empty mdc, key1, key2, and key3 in pattern"	TokenNameStringLiteral	empty mdc, key1, key2, and key3 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"value1"	TokenNameStringLiteral	value1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"value2"	TokenNameStringLiteral	value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern1	TokenNameIdentifier	 mdc Msg Pattern1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"filled mdc, no key specified in pattern"	TokenNameStringLiteral	filled mdc, no key specified in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern2	TokenNameIdentifier	 mdc Msg Pattern2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"filled mdc, key1 in pattern"	TokenNameStringLiteral	filled mdc, key1 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern3	TokenNameIdentifier	 mdc Msg Pattern3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"filled mdc, key2 in pattern"	TokenNameStringLiteral	filled mdc, key2 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern4	TokenNameIdentifier	 mdc Msg Pattern4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"filled mdc, key3 in pattern"	TokenNameStringLiteral	filled mdc, key3 in pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
mdcMsgPattern5	TokenNameIdentifier	 mdc Msg Pattern5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"filled mdc, key1, key2, and key3 in pattern"	TokenNameStringLiteral	filled mdc, key1, key2, and key3 in pattern
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
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
msgPattern	TokenNameIdentifier	 msg Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"finished mdc pattern test"	TokenNameStringLiteral	finished mdc pattern test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
OUTPUT_FILE	TokenNameIdentifier	 OUTPUT  FILE
+	TokenNamePLUS	
"_mdc"	TokenNameStringLiteral	_mdc
,	TokenNameCOMMA	
WITNESS_FILE	TokenNameIdentifier	 WITNESS  FILE
+	TokenNamePLUS	
"_mdc"	TokenNameStringLiteral	_mdc
)	TokenNameRPAREN	
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
// 	TokenNameCOMMENT_LINE	 
// MDC requires JDK 1.2+ 	TokenNameCOMMENT_LINE	MDC requires JDK 1.2+ 
// 	TokenNameCOMMENT_LINE	 
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
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
PatternParserTestCase	TokenNameIdentifier	 Pattern Parser Test Case
(	TokenNameLPAREN	
"mdcPattern"	TokenNameStringLiteral	mdcPattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
