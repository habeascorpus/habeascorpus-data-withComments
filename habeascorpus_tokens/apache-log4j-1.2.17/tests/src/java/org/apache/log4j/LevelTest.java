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
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * Tests of Level. * * @author Curt Arnold * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 Tests of Level. * @author Curt Arnold @since 1.2.12 
public	TokenNamepublic	
class	TokenNameclass	
LevelTest	TokenNameIdentifier	 Level Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Constructs new instance of test. * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Constructs new instance of test. @param name test name. 
public	TokenNamepublic	
LevelTest	TokenNameIdentifier	 Level Test
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
/** * Serialize Level.INFO and check against witness. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Serialize Level.INFO and check against witness. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializeINFO	TokenNameIdentifier	 test Serialize INFO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/info.bin"	TokenNameStringLiteral	witness/serialization/info.bin
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deserialize witness and see if resolved to Level.INFO. * @throws Exception if exception during test. */	TokenNameCOMMENT_JAVADOC	 Deserialize witness and see if resolved to Level.INFO. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testDeserializeINFO	TokenNameIdentifier	 test Deserialize INFO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
deserializeStream	TokenNameIdentifier	 deserialize Stream
(	TokenNameLPAREN	
"witness/serialization/info.bin"	TokenNameStringLiteral	witness/serialization/info.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// JDK 1.1 doesn't support readResolve necessary for the assertion 	TokenNameCOMMENT_LINE	JDK 1.1 doesn't support readResolve necessary for the assertion 
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
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that a custom level can be serialized and deserialized * and is not resolved to a stock level. * * @throws Exception if exception during test. */	TokenNameCOMMENT_JAVADOC	 Tests that a custom level can be serialized and deserialized and is not resolved to a stock level. * @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testCustomLevelSerialization	TokenNameIdentifier	 test Custom Level Serialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CustomLevel	TokenNameIdentifier	 Custom Level
custom	TokenNameIdentifier	 custom
=	TokenNameEQUAL	
new	TokenNamenew	
CustomLevel	TokenNameIdentifier	 Custom Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
serializeClone	TokenNameIdentifier	 serialize Clone
(	TokenNameLPAREN	
custom	TokenNameIdentifier	 custom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
CustomLevel	TokenNameIdentifier	 Custom Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CustomLevel	TokenNameIdentifier	 Custom Level
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomLevel	TokenNameIdentifier	 Custom Level
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
levelStr	TokenNameIdentifier	 level Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom level to check that custom levels are * serializable, but not resolved to a plain Level. */	TokenNameCOMMENT_JAVADOC	 Custom level to check that custom levels are serializable, but not resolved to a plain Level. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CustomLevel	TokenNameIdentifier	 Custom Level
extends	TokenNameextends	
Level	TokenNameIdentifier	 Level
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create an instance of CustomLevel. */	TokenNameCOMMENT_JAVADOC	 Create an instance of CustomLevel. 
public	TokenNamepublic	
CustomLevel	TokenNameIdentifier	 Custom Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests Level.TRACE_INT. */	TokenNameCOMMENT_JAVADOC	 Tests Level.TRACE_INT. 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceInt	TokenNameIdentifier	 test Trace Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.TRACE. */	TokenNameCOMMENT_JAVADOC	 Tests Level.TRACE. 
public	TokenNamepublic	
void	TokenNamevoid	
testTrace	TokenNameIdentifier	 test Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
.	TokenNameDOT	
getSyslogEquivalent	TokenNameIdentifier	 get Syslog Equivalent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(Level.TRACE_INT). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(Level.TRACE_INT). 
public	TokenNamepublic	
void	TokenNamevoid	
testIntToTrace	TokenNameIdentifier	 test Int To Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
trace	TokenNameIdentifier	 trace
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel("TRACE"); */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel("TRACE"); 
public	TokenNamepublic	
void	TokenNamevoid	
testStringToTrace	TokenNameIdentifier	 test String To Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
trace	TokenNameIdentifier	 trace
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that Level extends Priority. */	TokenNameCOMMENT_JAVADOC	 Tests that Level extends Priority. 
public	TokenNamepublic	
void	TokenNamevoid	
testLevelExtendsPriority	TokenNameIdentifier	 test Level Extends Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.OFF. */	TokenNameCOMMENT_JAVADOC	 Tests Level.OFF. 
public	TokenNamepublic	
void	TokenNamevoid	
testOFF	TokenNameIdentifier	 test OFF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
OFF	TokenNameIdentifier	 OFF
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.FATAL. */	TokenNameCOMMENT_JAVADOC	 Tests Level.FATAL. 
public	TokenNamepublic	
void	TokenNamevoid	
testFATAL	TokenNameIdentifier	 test FATAL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.ERROR. */	TokenNameCOMMENT_JAVADOC	 Tests Level.ERROR. 
public	TokenNamepublic	
void	TokenNamevoid	
testERROR	TokenNameIdentifier	 test ERROR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.WARN. */	TokenNameCOMMENT_JAVADOC	 Tests Level.WARN. 
public	TokenNamepublic	
void	TokenNamevoid	
testWARN	TokenNameIdentifier	 test WARN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.INFO. */	TokenNameCOMMENT_JAVADOC	 Tests Level.INFO. 
public	TokenNamepublic	
void	TokenNamevoid	
testINFO	TokenNameIdentifier	 test INFO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.DEBUG. */	TokenNameCOMMENT_JAVADOC	 Tests Level.DEBUG. 
public	TokenNamepublic	
void	TokenNamevoid	
testDEBUG	TokenNameIdentifier	 test DEBUG
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.TRACE. */	TokenNameCOMMENT_JAVADOC	 Tests Level.TRACE. 
public	TokenNamepublic	
void	TokenNamevoid	
testTRACE	TokenNameIdentifier	 test TRACE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.ALL. */	TokenNameCOMMENT_JAVADOC	 Tests Level.ALL. 
public	TokenNamepublic	
void	TokenNamevoid	
testALL	TokenNameIdentifier	 test ALL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
instanceof	TokenNameinstanceof	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.serialVersionUID. */	TokenNameCOMMENT_JAVADOC	 Tests Level.serialVersionUID. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerialVersionUID	TokenNameIdentifier	 test Serial Version UID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3491141966387921974L	TokenNameLongLiteral	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
serialVersionUID	TokenNameIdentifier	 serial Version UID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(Level.All_INT). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(Level.All_INT). 
public	TokenNamepublic	
void	TokenNamevoid	
testIntToAll	TokenNameIdentifier	 test Int To All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ALL_INT	TokenNameIdentifier	 ALL  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ALL"	TokenNameStringLiteral	ALL
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(Level.FATAL_INT). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(Level.FATAL_INT). 
public	TokenNamepublic	
void	TokenNamevoid	
testIntToFatal	TokenNameIdentifier	 test Int To Fatal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FATAL"	TokenNameStringLiteral	FATAL
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(Level.OFF_INT). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(Level.OFF_INT). 
public	TokenNamepublic	
void	TokenNamevoid	
testIntToOff	TokenNameIdentifier	 test Int To Off
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
OFF_INT	TokenNameIdentifier	 OFF  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"OFF"	TokenNameStringLiteral	OFF
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(17, Level.FATAL). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(17, Level.FATAL). 
public	TokenNamepublic	
void	TokenNamevoid	
testToLevelUnrecognizedInt	TokenNameIdentifier	 test To Level Unrecognized Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FATAL"	TokenNameStringLiteral	FATAL
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Level.toLevel(null, Level.FATAL). */	TokenNameCOMMENT_JAVADOC	 Tests Level.toLevel(null, Level.FATAL). 
public	TokenNamepublic	
void	TokenNamevoid	
testToLevelNull	TokenNameIdentifier	 test To Level Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FATAL"	TokenNameStringLiteral	FATAL
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that dotless lower I + "nfo" is recognized as INFO. */	TokenNameCOMMENT_JAVADOC	 Test that dotless lower I + "nfo" is recognized as INFO. 
public	TokenNamepublic	
void	TokenNamevoid	
testDotlessLowerI	TokenNameIdentifier	 test Dotless Lower I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
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
/** * Test that dotted lower I + "nfo" is recognized as INFO * even in Turkish locale. */	TokenNameCOMMENT_JAVADOC	 Test that dotted lower I + "nfo" is recognized as INFO even in Turkish locale. 
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
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
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
