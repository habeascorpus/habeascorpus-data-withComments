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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
CharArrayWriter	TokenNameIdentifier	 Char Array Writer
;	TokenNameSEMICOLON	
/** * Unit test for LogSF. */	TokenNameCOMMENT_JAVADOC	 Unit test for LogSF. 
public	TokenNamepublic	
class	TokenNameclass	
TestLogSF	TokenNameIdentifier	 Test Log SF
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Trace level. */	TokenNameCOMMENT_JAVADOC	 Trace level. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
TRACE	TokenNameIdentifier	 TRACE
=	TokenNameEQUAL	
getTraceLevel	TokenNameIdentifier	 get Trace Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets Trace level. * Trace level was not defined prior to log4j 1.2.12. * @return trace level */	TokenNameCOMMENT_JAVADOC	 Gets Trace level. Trace level was not defined prior to log4j 1.2.12. @return trace level 
private	TokenNameprivate	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
getTraceLevel	TokenNameIdentifier	 get Trace Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Logger. */	TokenNameCOMMENT_JAVADOC	 Logger. 
private	TokenNameprivate	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.formatter.TestLogSF"	TokenNameStringLiteral	org.apache.log4j.formatter.TestLogSF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create the test case * * @param testName name of the test case */	TokenNameCOMMENT_JAVADOC	 Create the test case * @param testName name of the test case 
public	TokenNamepublic	
TestLogSF	TokenNameIdentifier	 Test Log SF
(	TokenNameLPAREN	
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
/** * Post test clean up. */	TokenNameCOMMENT_JAVADOC	 Post test clean up. 
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
/** * Test class name when logging through LogSF. */	TokenNameCOMMENT_JAVADOC	 Test class name when logging through LogSF. 
public	TokenNamepublic	
void	TokenNamevoid	
testClassName	TokenNameIdentifier	 test Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharArrayWriter	TokenNameIdentifier	 Char Array Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayWriter	TokenNameIdentifier	 Char Array Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%C"	TokenNameStringLiteral	%C
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WriterAppender	TokenNameIdentifier	 Writer Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
WriterAppender	TokenNameIdentifier	 Writer Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
TestLogSF	TokenNameIdentifier	 Test Log SF
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with null pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with null pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceNullPattern	TokenNameIdentifier	 test Trace Null Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceNoArg	TokenNameIdentifier	 test Trace No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceBadPattern	TokenNameIdentifier	 test Trace Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceMissingArg	TokenNameIdentifier	 test Trace Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceString	TokenNameIdentifier	 test Trace String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceNull	TokenNameIdentifier	 test Trace Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceInt	TokenNameIdentifier	 test Trace Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceByte	TokenNameIdentifier	 test Trace Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceShort	TokenNameIdentifier	 test Trace Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceLong	TokenNameIdentifier	 test Trace Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceChar	TokenNameIdentifier	 test Trace Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceBoolean	TokenNameIdentifier	 test Trace Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceFloat	TokenNameIdentifier	 test Trace Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceDouble	TokenNameIdentifier	 test Trace Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceTwoArg	TokenNameIdentifier	 test Trace Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}, {}."	TokenNameStringLiteral	{}, {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceThreeArg	TokenNameIdentifier	 test Trace Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}."	TokenNameStringLiteral	{}{} {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceFourArg	TokenNameIdentifier	 test Trace Four Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceArrayArg	TokenNameIdentifier	 test Trace Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.trace with null Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.trace with null Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceNullArrayArg	TokenNameIdentifier	 test Trace Null Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with null pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with null pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugNullPattern	TokenNameIdentifier	 test Debug Null Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugNoArg	TokenNameIdentifier	 test Debug No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugBadPattern	TokenNameIdentifier	 test Debug Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugMissingArg	TokenNameIdentifier	 test Debug Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugString	TokenNameIdentifier	 test Debug String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugNull	TokenNameIdentifier	 test Debug Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugInt	TokenNameIdentifier	 test Debug Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugByte	TokenNameIdentifier	 test Debug Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugShort	TokenNameIdentifier	 test Debug Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugLong	TokenNameIdentifier	 test Debug Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugChar	TokenNameIdentifier	 test Debug Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugBoolean	TokenNameIdentifier	 test Debug Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugFloat	TokenNameIdentifier	 test Debug Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugDouble	TokenNameIdentifier	 test Debug Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugTwoArg	TokenNameIdentifier	 test Debug Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}, {}."	TokenNameStringLiteral	{}, {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugThreeArg	TokenNameIdentifier	 test Debug Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}."	TokenNameStringLiteral	{}{} {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with four arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with four arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugFourArg	TokenNameIdentifier	 test Debug Four Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugArrayArg	TokenNameIdentifier	 test Debug Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.debug with null Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.debug with null Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugNullArrayArg	TokenNameIdentifier	 test Debug Null Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with null pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with null pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoNullPattern	TokenNameIdentifier	 test Info Null Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoNoArg	TokenNameIdentifier	 test Info No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoBadPattern	TokenNameIdentifier	 test Info Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoMissingArg	TokenNameIdentifier	 test Info Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoString	TokenNameIdentifier	 test Info String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoNull	TokenNameIdentifier	 test Info Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoInt	TokenNameIdentifier	 test Info Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoByte	TokenNameIdentifier	 test Info Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoShort	TokenNameIdentifier	 test Info Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoLong	TokenNameIdentifier	 test Info Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoChar	TokenNameIdentifier	 test Info Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoBoolean	TokenNameIdentifier	 test Info Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoFloat	TokenNameIdentifier	 test Info Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoDouble	TokenNameIdentifier	 test Info Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoTwoArg	TokenNameIdentifier	 test Info Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}, {}."	TokenNameStringLiteral	{}, {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoThreeArg	TokenNameIdentifier	 test Info Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}."	TokenNameStringLiteral	{}{} {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.info with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.info with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoArrayArg	TokenNameIdentifier	 test Info Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with null pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with null pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnNullPattern	TokenNameIdentifier	 test Warn Null Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnNoArg	TokenNameIdentifier	 test Warn No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnBadPattern	TokenNameIdentifier	 test Warn Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnMissingArg	TokenNameIdentifier	 test Warn Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnString	TokenNameIdentifier	 test Warn String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnNull	TokenNameIdentifier	 test Warn Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnInt	TokenNameIdentifier	 test Warn Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnByte	TokenNameIdentifier	 test Warn Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnShort	TokenNameIdentifier	 test Warn Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnLong	TokenNameIdentifier	 test Warn Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnChar	TokenNameIdentifier	 test Warn Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnBoolean	TokenNameIdentifier	 test Warn Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnFloat	TokenNameIdentifier	 test Warn Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnDouble	TokenNameIdentifier	 test Warn Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
3.14	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnTwoArg	TokenNameIdentifier	 test Warn Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}, {}."	TokenNameStringLiteral	{}, {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnThreeArg	TokenNameIdentifier	 test Warn Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}."	TokenNameStringLiteral	{}{} {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnFourArg	TokenNameIdentifier	 test Warn Four Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.warn with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.warn with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnArrayArg	TokenNameIdentifier	 test Warn Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with null pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with null pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogNullPattern	TokenNameIdentifier	 test Log Null Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogNoArg	TokenNameIdentifier	 test Log No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogBadPattern	TokenNameIdentifier	 test Log Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogMissingArg	TokenNameIdentifier	 test Log Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogString	TokenNameIdentifier	 test Log String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogNull	TokenNameIdentifier	 test Log Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Hello, {}"	TokenNameStringLiteral	Hello, {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogInt	TokenNameIdentifier	 test Log Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogByte	TokenNameIdentifier	 test Log Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogShort	TokenNameIdentifier	 test Log Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogLong	TokenNameIdentifier	 test Log Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogChar	TokenNameIdentifier	 test Log Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogBoolean	TokenNameIdentifier	 test Log Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogFloat	TokenNameIdentifier	 test Log Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogDouble	TokenNameIdentifier	 test Log Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Iteration {}"	TokenNameStringLiteral	Iteration {}
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogTwoArg	TokenNameIdentifier	 test Log Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"{}, {}."	TokenNameStringLiteral	{}, {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogThreeArg	TokenNameIdentifier	 test Log Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"{}{} {}."	TokenNameStringLiteral	{}{} {}.
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with four arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with four arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogFourArg	TokenNameIdentifier	 test Log Four Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.log with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.log with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogArrayArg	TokenNameIdentifier	 test Log Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"{}{} {}{}"	TokenNameStringLiteral	{}{} {}{}
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bundle name for resource bundle tests. */	TokenNameCOMMENT_JAVADOC	 Bundle name for resource bundle tests. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
=	TokenNameEQUAL	
"org.apache.log4j.TestLogSFPatterns"	TokenNameStringLiteral	org.apache.log4j.TestLogSFPatterns
;	TokenNameSEMICOLON	
/** * Test LogSF.logrb with null bundle name. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with null bundle name. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbNullBundle	TokenNameIdentifier	 test Logrb Null Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with null key. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with null key. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbNullKey	TokenNameIdentifier	 test Logrb Null Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with no-field pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with no-field pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbNoArg	TokenNameIdentifier	 test Logrb No Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello1"	TokenNameStringLiteral	Hello1
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with malformed pattern. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with malformed pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbBadPattern	TokenNameIdentifier	 test Logrb Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Malformed"	TokenNameStringLiteral	Malformed
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {."	TokenNameStringLiteral	Hello, {.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with missing argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with missing argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbMissingArg	TokenNameIdentifier	 test Logrb Missing Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello2"	TokenNameStringLiteral	Hello2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, {}World"	TokenNameStringLiteral	Hello, {}World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with string argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with string argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbString	TokenNameIdentifier	 test Logrb String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello3"	TokenNameStringLiteral	Hello3
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with null argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with null argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbNull	TokenNameIdentifier	 test Logrb Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello3"	TokenNameStringLiteral	Hello3
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, null"	TokenNameStringLiteral	Hello, null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with int argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with int argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbInt	TokenNameIdentifier	 test Logrb Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with byte argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with byte argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbByte	TokenNameIdentifier	 test Logrb Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with short argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with short argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbShort	TokenNameIdentifier	 test Logrb Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with long argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with long argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbLong	TokenNameIdentifier	 test Logrb Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration 42"	TokenNameStringLiteral	Iteration 42
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with char argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with char argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbChar	TokenNameIdentifier	 test Logrb Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration C"	TokenNameStringLiteral	Iteration C
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with boolean argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with boolean argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbBoolean	TokenNameIdentifier	 test Logrb Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iteration true"	TokenNameStringLiteral	Iteration true
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with float argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with float argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbFloat	TokenNameIdentifier	 test Logrb Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with single field pattern with double argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with single field pattern with double argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbDouble	TokenNameIdentifier	 test Logrb Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Iteration0"	TokenNameStringLiteral	Iteration0
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"Iteration "	TokenNameStringLiteral	Iteration 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with two arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with two arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbTwoArg	TokenNameIdentifier	 test Logrb Two Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello4"	TokenNameStringLiteral	Hello4
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with three arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with three arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbThreeArg	TokenNameIdentifier	 test Logrb Three Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello5"	TokenNameStringLiteral	Hello5
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with four arguments. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with four arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbFourArg	TokenNameIdentifier	 test Logrb Four Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello6"	TokenNameStringLiteral	Hello6
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogSF.logrb with Object[] argument. */	TokenNameCOMMENT_JAVADOC	 Test LogSF.logrb with Object[] argument. 
public	TokenNamepublic	
void	TokenNamevoid	
testLogrbArrayArg	TokenNameIdentifier	 test Logrb Array Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
"Hello6"	TokenNameStringLiteral	Hello6
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World."	TokenNameStringLiteral	Hello, World.
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test \\{ escape sequence when only one parameter is present. * */	TokenNameCOMMENT_JAVADOC	 Test \\{ escape sequence when only one parameter is present. 
public	TokenNamepublic	
void	TokenNamevoid	
testEscapeOneParam	TokenNameIdentifier	 test Escape One Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"\{}\{{}}, World}\{"	TokenNameStringLiteral	\{}\{{}}, World}\{
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"{}{Hello}, World}{"	TokenNameStringLiteral	{}{Hello}, World}{
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test \\{ escape sequence when more than one parameter is present. * */	TokenNameCOMMENT_JAVADOC	 Test \\{ escape sequence when more than one parameter is present. 
public	TokenNamepublic	
void	TokenNamevoid	
testEscapeTwoParam	TokenNameIdentifier	 test Escape Two Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapture	TokenNameIdentifier	 Log Capture
capture	TokenNameIdentifier	 capture
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapture	TokenNameIdentifier	 Log Capture
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"\{}\{{}}, {}}{}\{"	TokenNameStringLiteral	\{}\{{}}, {}}{}\{
,	TokenNameCOMMA	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
"World"	TokenNameStringLiteral	World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"{}{Hello}, World}{}{"	TokenNameStringLiteral	{}{Hello}, World}{}{
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
