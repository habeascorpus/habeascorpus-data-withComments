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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * Tests of Priority. * * @author Curt Arnold * @since 1.2.14 */	TokenNameCOMMENT_JAVADOC	 Tests of Priority. * @author Curt Arnold @since 1.2.14 
public	TokenNamepublic	
class	TokenNameclass	
PriorityTest	TokenNameIdentifier	 Priority Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Constructs new instance of test. * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Constructs new instance of test. @param name test name. 
public	TokenNamepublic	
PriorityTest	TokenNameIdentifier	 Priority Test
(	TokenNameLPAREN	
final	TokenNamefinal	
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
/** * Tests Priority.OFF_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.OFF_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testOffInt	TokenNameIdentifier	 test Off Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
OFF_INT	TokenNameIdentifier	 OFF  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.FATAL_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.FATAL_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testFatalInt	TokenNameIdentifier	 test Fatal Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
50000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.ERROR_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.ERROR_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testErrorInt	TokenNameIdentifier	 test Error Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
40000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ERROR_INT	TokenNameIdentifier	 ERROR  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.WARN_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.WARN_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testWarnInt	TokenNameIdentifier	 test Warn Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
30000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
WARN_INT	TokenNameIdentifier	 WARN  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.INFO_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.INFO_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfoInt	TokenNameIdentifier	 test Info Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
INFO_INT	TokenNameIdentifier	 INFO  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.DEBUG_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.DEBUG_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugInt	TokenNameIdentifier	 test Debug Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.ALL_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Priority.ALL_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testAllInt	TokenNameIdentifier	 test All Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ALL_INT	TokenNameIdentifier	 ALL  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.FATAL. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.FATAL. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testFatal	TokenNameIdentifier	 test Fatal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.ERROR. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.ERROR. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testERROR	TokenNameIdentifier	 test ERROR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.WARN. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.WARN. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testWARN	TokenNameIdentifier	 test WARN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.INFO. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.INFO. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testINFO	TokenNameIdentifier	 test INFO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.DEBUG. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.DEBUG. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDEBUG	TokenNameIdentifier	 test DEBUG
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.equals(null). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.equals(null). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsNull	TokenNameIdentifier	 test Equals Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Priority.equals(Level.DEBUG). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests Priority.equals(Level.DEBUG). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsLevel	TokenNameIdentifier	 test Equals Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// this behavior violates the equals contract. 	TokenNameCOMMENT_LINE	this behavior violates the equals contract. 
// 	TokenNameCOMMENT_LINE	 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getAllPossiblePriorities(). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests getAllPossiblePriorities(). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testGetAllPossiblePriorities	TokenNameIdentifier	 test Get All Possible Priorities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
priorities	TokenNameIdentifier	 priorities
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
getAllPossiblePriorities	TokenNameIdentifier	 get All Possible Priorities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests toPriority(String). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests toPriority(String). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testToPriorityString	TokenNameIdentifier	 test To Priority String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
"DEBUG"	TokenNameStringLiteral	DEBUG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests toPriority(int). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests toPriority(int). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testToPriorityInt	TokenNameIdentifier	 test To Priority Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests toPriority(String, Priority). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests toPriority(String, Priority). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testToPriorityStringPriority	TokenNameIdentifier	 test To Priority String Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests toPriority(int, Priority). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests toPriority(int, Priority). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testToPriorityIntPriority	TokenNameIdentifier	 test To Priority Int Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that dotless lower I + "nfo" is recognized as INFO. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Test that dotless lower I + "nfo" is recognized as INFO. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDotlessLowerI	TokenNameIdentifier	 test Dotless Lower I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
"õnfo"	TokenNameStringLiteral	õnfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that dotted lower I + "nfo" is recognized as INFO * even in Turkish locale. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Test that dotted lower I + "nfo" is recognized as INFO even in Turkish locale. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDottedLowerI	TokenNameIdentifier	 test Dotted Lower I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
defaultLocale	TokenNameIdentifier	 default Locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
turkey	TokenNameIdentifier	 turkey
=	TokenNameEQUAL	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"tr"	TokenNameStringLiteral	tr
,	TokenNameCOMMA	
"TR"	TokenNameStringLiteral	TR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
turkey	TokenNameIdentifier	 turkey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
defaultLocale	TokenNameIdentifier	 default Locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
