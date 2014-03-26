/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
customLogger	TokenNameIdentifier	 custom Logger
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
DOMConfigurator	TokenNameIdentifier	 DOM Configurator
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
/** Tests handling of custom loggers. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Tests handling of custom loggers. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
XLoggerTestCase	TokenNameIdentifier	 X Logger Test Case
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
XLogger	TokenNameIdentifier	 X Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XLogger	TokenNameIdentifier	 X Logger
)	TokenNameRPAREN	
XLogger	TokenNameIdentifier	 X Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
XLoggerTestCase	TokenNameIdentifier	 X Logger Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XLoggerTestCase	TokenNameIdentifier	 X Logger Test Case
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
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
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
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DOMConfigurator	TokenNameIdentifier	 DOM Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/xml/customLogger"	TokenNameStringLiteral	input/xml/customLogger
+	TokenNamePLUS	
number	TokenNameIdentifier	 number
+	TokenNamePLUS	
".xml"	TokenNameStringLiteral	.xml
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
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
++	TokenNamePLUS_PLUS	
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
Transformer	TokenNameIdentifier	 Transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
"output/temp"	TokenNameStringLiteral	output/temp
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
"witness/customLogger."	TokenNameStringLiteral	witness/customLogger.
+	TokenNamePLUS	
number	TokenNameIdentifier	 number
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
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
XLoggerTestCase	TokenNameIdentifier	 X Logger Test Case
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
XLoggerTestCase	TokenNameIdentifier	 X Logger Test Case
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
