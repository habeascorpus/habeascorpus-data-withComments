/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
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
Level	TokenNameIdentifier	 Level
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
MDC	TokenNameIdentifier	 MDC
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Priority	TokenNameIdentifier	 Priority
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Category	TokenNameIdentifier	 Category
;	TokenNameSEMICOLON	
/** * Tests LoggingEvent. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Tests LoggingEvent. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
LoggingEventTest	TokenNameIdentifier	 Logging Event Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create LoggingEventTest. * * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Create LoggingEventTest. * @param name test name. 
public	TokenNamepublic	
LoggingEventTest	TokenNameIdentifier	 Logging Event Test
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
/** * Serialize a simple logging event and check it against * a witness. * @throws Exception if exception during test. */	TokenNameCOMMENT_JAVADOC	 Serialize a simple logging event and check it against a witness. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializationSimple	TokenNameIdentifier	 test Serialization Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// event.prepareForDeferredProcessing(); 	TokenNameCOMMENT_LINE	event.prepareForDeferredProcessing(); 
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
352	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
354	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
355	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
356	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/simple.bin"	TokenNameStringLiteral	witness/serialization/simple.bin
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serialize a logging event with an exception and check it against * a witness. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Serialize a logging event with an exception and check it against a witness. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializationWithException	TokenNameIdentifier	 test Serialization With Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Don't panic"	TokenNameStringLiteral	Don't panic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// event.prepareForDeferredProcessing(); 	TokenNameCOMMENT_LINE	event.prepareForDeferredProcessing(); 
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
352	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
354	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
355	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
356	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/exception.bin"	TokenNameStringLiteral	witness/serialization/exception.bin
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serialize a logging event with an exception and check it against * a witness. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Serialize a logging event with an exception and check it against a witness. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializationWithLocation	TokenNameIdentifier	 test Serialization With Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// event.prepareForDeferredProcessing(); 	TokenNameCOMMENT_LINE	event.prepareForDeferredProcessing(); 
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
352	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
354	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
355	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
356	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/location.bin"	TokenNameStringLiteral	witness/serialization/location.bin
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serialize a logging event with ndc. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Serialize a logging event with ndc. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializationNDC	TokenNameIdentifier	 test Serialization NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"ndc test"	TokenNameStringLiteral	ndc test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// event.prepareForDeferredProcessing(); 	TokenNameCOMMENT_LINE	event.prepareForDeferredProcessing(); 
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
352	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
354	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
355	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
356	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/ndc.bin"	TokenNameStringLiteral	witness/serialization/ndc.bin
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serialize a logging event with mdc. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Serialize a logging event with mdc. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testSerializationMDC	TokenNameIdentifier	 test Serialization MDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mdckey"	TokenNameStringLiteral	mdckey
,	TokenNameCOMMA	
"mdcvalue"	TokenNameStringLiteral	mdcvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// event.prepareForDeferredProcessing(); 	TokenNameCOMMENT_LINE	event.prepareForDeferredProcessing(); 
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
352	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
354	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
355	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
356	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
.	TokenNameDOT	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
"witness/serialization/mdc.bin"	TokenNameStringLiteral	witness/serialization/mdc.bin
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deserialize a simple logging event. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Deserialize a simple logging event. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testDeserializationSimple	TokenNameIdentifier	 test Deserialization Simple
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
"witness/serialization/simple.bin"	TokenNameStringLiteral	witness/serialization/simple.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deserialize a logging event with an exception. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Deserialize a logging event with an exception. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testDeserializationWithException	TokenNameIdentifier	 test Deserialization With Exception
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
"witness/serialization/exception.bin"	TokenNameStringLiteral	witness/serialization/exception.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deserialize a logging event with an exception. * @throws Exception if exception during test. * */	TokenNameCOMMENT_JAVADOC	 Deserialize a logging event with an exception. @throws Exception if exception during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testDeserializationWithLocation	TokenNameIdentifier	 test Deserialization With Location
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
"witness/serialization/location.bin"	TokenNameStringLiteral	witness/serialization/location.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests LoggingEvent.fqnOfCategoryClass. */	TokenNameCOMMENT_JAVADOC	 Tests LoggingEvent.fqnOfCategoryClass. 
public	TokenNamepublic	
void	TokenNamevoid	
testFQNOfCategoryClass	TokenNameIdentifier	 test FQN Of Category Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests LoggingEvent.level. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests LoggingEvent.level. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testLevel	TokenNameIdentifier	 test Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests LoggingEvent.getLocationInfo() when no FQCN is specified. * See bug 41186. */	TokenNameCOMMENT_JAVADOC	 Tests LoggingEvent.getLocationInfo() when no FQCN is specified. See bug 41186. 
public	TokenNamepublic	
void	TokenNamevoid	
testLocationInfoNoFQCN	TokenNameIdentifier	 test Location Info No FQCN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
"Hello, world."	TokenNameStringLiteral	Hello, world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocationInfo	TokenNameIdentifier	 Location Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// log4j 1.2 returns an object, its layout doesn't check for nulls. 	TokenNameCOMMENT_LINE	log4j 1.2 returns an object, its layout doesn't check for nulls. 
// log4j 1.3 returns a null. 	TokenNameCOMMENT_LINE	log4j 1.3 returns a null. 
// 	TokenNameCOMMENT_LINE	 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Message object that throws a RuntimeException on toString(). * See bug 37182. */	TokenNameCOMMENT_JAVADOC	 Message object that throws a RuntimeException on toString(). See bug 37182. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BadMessage	TokenNameIdentifier	 Bad Message
{	TokenNameLBRACE	
public	TokenNamepublic	
BadMessage	TokenNameIdentifier	 Bad Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that an runtime exception or error during toString * on the message parameter does not propagate to caller. * See bug 37182. */	TokenNameCOMMENT_JAVADOC	 Tests that an runtime exception or error during toString on the message parameter does not propagate to caller. See bug 37182. 
public	TokenNamepublic	
void	TokenNamevoid	
testBadMessage	TokenNameIdentifier	 test Bad Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BadMessage	TokenNameIdentifier	 Bad Message
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
BadMessage	TokenNameIdentifier	 Bad Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// would result in exception in earlier versions 	TokenNameCOMMENT_LINE	would result in exception in earlier versions 
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
