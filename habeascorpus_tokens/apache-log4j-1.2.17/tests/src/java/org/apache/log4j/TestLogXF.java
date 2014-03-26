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
/** * Unit test for LogXF. */	TokenNameCOMMENT_JAVADOC	 Unit test for LogXF. 
public	TokenNamepublic	
class	TokenNameclass	
TestLogXF	TokenNameIdentifier	 Test Log XF
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
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
"org.apache.log4j.formatter.TestLogXF"	TokenNameStringLiteral	org.apache.log4j.formatter.TestLogXF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create the test case * * @param testName name of the test case */	TokenNameCOMMENT_JAVADOC	 Create the test case * @param testName name of the test case 
public	TokenNamepublic	
TestLogXF	TokenNameIdentifier	 Test Log XF
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
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
{	TokenNameLBRACE	
private	TokenNameprivate	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test LogXF.entering with null class and method. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with null class and method. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringNullNull	TokenNameIdentifier	 test Entering Null Null
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null ENTRY"	TokenNameStringLiteral	null.null ENTRY
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with null class, method and parameter. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with null class, method and parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringNullNullNull	TokenNameIdentifier	 test Entering Null Null Null
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null ENTRY null"	TokenNameStringLiteral	null.null ENTRY null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with null class, method and parameters. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with null class, method and parameters. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringNullNullNullArray	TokenNameIdentifier	 test Entering Null Null Null Array
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null ENTRY {}"	TokenNameStringLiteral	null.null ENTRY {}
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with class and method. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with class and method. 
public	TokenNamepublic	
void	TokenNamevoid	
testEntering	TokenNameIdentifier	 test Entering
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod ENTRY"	TokenNameStringLiteral	SomeClass.someMethod ENTRY
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with class, method and parameter. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with class, method and parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringWithParam	TokenNameIdentifier	 test Entering With Param
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
"someParam"	TokenNameStringLiteral	someParam
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod ENTRY someParam"	TokenNameStringLiteral	SomeClass.someMethod ENTRY someParam
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with class, method and bad parameter. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with class, method and bad parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringWithBadParam	TokenNameIdentifier	 test Entering With Bad Param
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod ENTRY ?"	TokenNameStringLiteral	SomeClass.someMethod ENTRY ?
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.entering with class, method and bad parameters. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.entering with class, method and bad parameters. 
public	TokenNamepublic	
void	TokenNamevoid	
testEnteringWithBadParams	TokenNameIdentifier	 test Entering With Bad Params
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"param1"	TokenNameStringLiteral	param1
,	TokenNameCOMMA	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod ENTRY {param1,?}"	TokenNameStringLiteral	SomeClass.someMethod ENTRY {param1,?}
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with null class and method. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with null class and method. 
public	TokenNamepublic	
void	TokenNamevoid	
testExitingNullNull	TokenNameIdentifier	 test Exiting Null Null
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null RETURN"	TokenNameStringLiteral	null.null RETURN
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with null class, method and parameter. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with null class, method and parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
testExitingNullNullNull	TokenNameIdentifier	 test Exiting Null Null Null
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null RETURN null"	TokenNameStringLiteral	null.null RETURN null
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with class and method. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with class and method. 
public	TokenNamepublic	
void	TokenNamevoid	
testExiting	TokenNameIdentifier	 test Exiting
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod RETURN"	TokenNameStringLiteral	SomeClass.someMethod RETURN
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with class, method and return value. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with class, method and return value. 
public	TokenNamepublic	
void	TokenNamevoid	
testExitingWithValue	TokenNameIdentifier	 test Exiting With Value
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
"someValue"	TokenNameStringLiteral	someValue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod RETURN someValue"	TokenNameStringLiteral	SomeClass.someMethod RETURN someValue
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with class, method and bad return value. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with class, method and bad return value. 
public	TokenNamepublic	
void	TokenNamevoid	
testExitingWithBadValue	TokenNameIdentifier	 test Exiting With Bad Value
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
BadStringifier	TokenNameIdentifier	 Bad Stringifier
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod RETURN ?"	TokenNameStringLiteral	SomeClass.someMethod RETURN ?
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.throwing with null class, method and throwable. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.throwing with null class, method and throwable. 
public	TokenNamepublic	
void	TokenNamevoid	
testThrowingNullNullNull	TokenNameIdentifier	 test Throwing Null Null Null
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
throwing	TokenNameIdentifier	 throwing
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"null.null THROW"	TokenNameStringLiteral	null.null THROW
,	TokenNameCOMMA	
capture	TokenNameIdentifier	 capture
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test LogXF.exiting with class and method. */	TokenNameCOMMENT_JAVADOC	 Test LogXF.exiting with class and method. 
public	TokenNamepublic	
void	TokenNamevoid	
testThrowing	TokenNameIdentifier	 test Throwing
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
throwing	TokenNameIdentifier	 throwing
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"SomeClass"	TokenNameStringLiteral	SomeClass
,	TokenNameCOMMA	
"someMethod"	TokenNameStringLiteral	someMethod
,	TokenNameCOMMA	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"SomeClass.someMethod THROW"	TokenNameStringLiteral	SomeClass.someMethod THROW
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
