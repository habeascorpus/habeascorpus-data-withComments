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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** A superficial but general test of log4j. */	TokenNameCOMMENT_JAVADOC	 A superficial but general test of log4j. 
public	TokenNamepublic	
class	TokenNameclass	
AsyncAppenderTestCase	TokenNameIdentifier	 Async Appender Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
AsyncAppenderTestCase	TokenNameIdentifier	 Async Appender Test Case
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this test checks whether it is possible to write to a closed AsyncAppender 	TokenNameCOMMENT_LINE	this test checks whether it is possible to write to a closed AsyncAppender 
public	TokenNamepublic	
void	TokenNamevoid	
closeTest	TokenNameIdentifier	 close Test
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
VectorAppender	TokenNameIdentifier	 Vector Appender
vectorAppender	TokenNameIdentifier	 vector Appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
asyncAppender	TokenNameIdentifier	 async Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"async-CloseTest"	TokenNameStringLiteral	async-CloseTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
vectorAppender	TokenNameIdentifier	 vector Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"m1"	TokenNameStringLiteral	m1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"m2"	TokenNameStringLiteral	m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vectorAppender	TokenNameIdentifier	 vector Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this test checks whether appenders embedded within an AsyncAppender are also 	TokenNameCOMMENT_LINE	this test checks whether appenders embedded within an AsyncAppender are also 
// closed 	TokenNameCOMMENT_LINE	closed 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
VectorAppender	TokenNameIdentifier	 Vector Appender
vectorAppender	TokenNameIdentifier	 vector Appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
asyncAppender	TokenNameIdentifier	 async Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"async-test2"	TokenNameStringLiteral	async-test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
vectorAppender	TokenNameIdentifier	 vector Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"m1"	TokenNameStringLiteral	m1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"m2"	TokenNameStringLiteral	m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vectorAppender	TokenNameIdentifier	 vector Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vectorAppender	TokenNameIdentifier	 vector Appender
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this test checks whether appenders embedded within an AsyncAppender are also 	TokenNameCOMMENT_LINE	this test checks whether appenders embedded within an AsyncAppender are also 
// closed 	TokenNameCOMMENT_LINE	closed 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LEN	TokenNameIdentifier	 LEN
=	TokenNameEQUAL	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VectorAppender	TokenNameIdentifier	 Vector Appender
vectorAppender	TokenNameIdentifier	 vector Appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
asyncAppender	TokenNameIdentifier	 async Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"async-test3"	TokenNameStringLiteral	async-test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
vectorAppender	TokenNameIdentifier	 vector Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
asyncAppender	TokenNameIdentifier	 async Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
LEN	TokenNameIdentifier	 LEN
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Done loop."	TokenNameStringLiteral	Done loop.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"m2"	TokenNameStringLiteral	m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vectorAppender	TokenNameIdentifier	 vector Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LEN	TokenNameIdentifier	 LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vectorAppender	TokenNameIdentifier	 vector Appender
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NullPointerAppender	TokenNameIdentifier	 Null Pointer Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
public	TokenNamepublic	
NullPointerAppender	TokenNameIdentifier	 Null Pointer Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** This method is called by the {@link org.apache.log4j.AppenderSkeleton#doAppend} method. */	TokenNameCOMMENT_JAVADOC	 This method is called by the {@link org.apache.log4j.AppenderSkeleton#doAppend} method. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that a bad appender will switch async back to sync. * See bug 23021 * @since 1.2.12 * @throws Exception thrown if Thread.sleep is interrupted */	TokenNameCOMMENT_JAVADOC	 Tests that a bad appender will switch async back to sync. See bug 23021 @since 1.2.12 @throws Exception thrown if Thread.sleep is interrupted 
public	TokenNamepublic	
void	TokenNamevoid	
testBadAppender	TokenNameIdentifier	 test Bad Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Appender	TokenNameIdentifier	 Appender
nullPointerAppender	TokenNameIdentifier	 null Pointer Appender
=	TokenNameEQUAL	
new	TokenNamenew	
NullPointerAppender	TokenNameIdentifier	 Null Pointer Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
asyncAppender	TokenNameIdentifier	 async Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
nullPointerAppender	TokenNameIdentifier	 null Pointer Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
asyncAppender	TokenNameIdentifier	 async Appender
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
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
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
nullPointerAppender	TokenNameIdentifier	 null Pointer Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message"	TokenNameStringLiteral	Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message"	TokenNameStringLiteral	Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should have thrown exception"	TokenNameStringLiteral	Should have thrown exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests location processing when buffer is full and locationInfo=true. * See bug 41186. */	TokenNameCOMMENT_JAVADOC	 Tests location processing when buffer is full and locationInfo=true. See bug 41186. 
public	TokenNamepublic	
void	TokenNamevoid	
testLocationInfoTrue	TokenNameIdentifier	 test Location Info True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
blockableAppender	TokenNameIdentifier	 blockable Appender
=	TokenNameEQUAL	
new	TokenNamenew	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
async	TokenNameIdentifier	 async
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setBlocking	TokenNameIdentifier	 set Blocking
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
rootLogger	TokenNameIdentifier	 root Logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
async	TokenNameIdentifier	 async
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Greeter	TokenNameIdentifier	 Greeter
greeter	TokenNameIdentifier	 greeter
=	TokenNameEQUAL	
new	TokenNamenew	
Greeter	TokenNameIdentifier	 Greeter
(	TokenNameLPAREN	
rootLogger	TokenNameIdentifier	 root Logger
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getMonitor	TokenNameIdentifier	 get Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
greeter	TokenNameIdentifier	 greeter
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"That's all folks."	TokenNameStringLiteral	That's all folks.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
initialEvent	TokenNameIdentifier	 initial Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
discardEvent	TokenNameIdentifier	 discard Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
"%C:%L %m%n"	TokenNameStringLiteral	%C:%L %m%n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
initialStr	TokenNameIdentifier	 initial Str
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
initialEvent	TokenNameIdentifier	 initial Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
AsyncAppenderTestCase	TokenNameIdentifier	 Async Appender Test Case
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
initialStr	TokenNameIdentifier	 initial Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
AsyncAppenderTestCase	TokenNameIdentifier	 Async Appender Test Case
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
discardStr	TokenNameIdentifier	 discard Str
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
discardEvent	TokenNameIdentifier	 discard Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?:? "	TokenNameStringLiteral	?:? 
,	TokenNameCOMMA	
discardStr	TokenNameIdentifier	 discard Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests location processing when buffer is full and locationInfo=false. * See bug 41186. */	TokenNameCOMMENT_JAVADOC	 Tests location processing when buffer is full and locationInfo=false. See bug 41186. 
public	TokenNamepublic	
void	TokenNamevoid	
testLocationInfoFalse	TokenNameIdentifier	 test Location Info False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
blockableAppender	TokenNameIdentifier	 blockable Appender
=	TokenNameEQUAL	
new	TokenNamenew	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
async	TokenNameIdentifier	 async
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setBlocking	TokenNameIdentifier	 set Blocking
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
rootLogger	TokenNameIdentifier	 root Logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
async	TokenNameIdentifier	 async
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Greeter	TokenNameIdentifier	 Greeter
greeter	TokenNameIdentifier	 greeter
=	TokenNameEQUAL	
new	TokenNamenew	
Greeter	TokenNameIdentifier	 Greeter
(	TokenNameLPAREN	
rootLogger	TokenNameIdentifier	 root Logger
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getMonitor	TokenNameIdentifier	 get Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
greeter	TokenNameIdentifier	 greeter
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"That's all folks."	TokenNameStringLiteral	That's all folks.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
initialEvent	TokenNameIdentifier	 initial Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
discardEvent	TokenNameIdentifier	 discard Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
"%C:%L %m%n"	TokenNameStringLiteral	%C:%L %m%n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
initialStr	TokenNameIdentifier	 initial Str
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
initialEvent	TokenNameIdentifier	 initial Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?:? "	TokenNameStringLiteral	?:? 
,	TokenNameCOMMA	
initialStr	TokenNameIdentifier	 initial Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
discardStr	TokenNameIdentifier	 discard Str
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
discardEvent	TokenNameIdentifier	 discard Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?:? "	TokenNameStringLiteral	?:? 
,	TokenNameCOMMA	
discardStr	TokenNameIdentifier	 discard Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logging request runnable. */	TokenNameCOMMENT_JAVADOC	 Logging request runnable. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Greeter	TokenNameIdentifier	 Greeter
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * Logger. */	TokenNameCOMMENT_JAVADOC	 Logger. 
private	TokenNameprivate	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
/** * Repetitions. */	TokenNameCOMMENT_JAVADOC	 Repetitions. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
/** * Create new instance. * @param logger logger, may not be null. * @param repetitions repetitions. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param logger logger, may not be null. @param repetitions repetitions. 
public	TokenNamepublic	
Greeter	TokenNameIdentifier	 Greeter
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
repetitions	TokenNameIdentifier	 repetitions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"logger"	TokenNameStringLiteral	logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repetitions	TokenNameIdentifier	 repetitions
=	TokenNameEQUAL	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Vector appender that can be explicitly blocked. */	TokenNameCOMMENT_JAVADOC	 Vector appender that can be explicitly blocked. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
extends	TokenNameextends	
VectorAppender	TokenNameIdentifier	 Vector Appender
{	TokenNameLBRACE	
/** * Monitor object used to block appender. */	TokenNameCOMMENT_JAVADOC	 Monitor object used to block appender. 
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
monitor	TokenNameIdentifier	 monitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if fatal, echo messages for testLoggingInDispatcher 	TokenNameCOMMENT_LINE	if fatal, echo messages for testLoggingInDispatcher 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get monitor object. * @return monitor. */	TokenNameCOMMENT_JAVADOC	 Get monitor object. @return monitor. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMonitor	TokenNameIdentifier	 get Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
monitor	TokenNameIdentifier	 monitor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test that a mutable message object is evaluated before * being placed in the async queue. * See bug 43559. */	TokenNameCOMMENT_JAVADOC	 Test that a mutable message object is evaluated before being placed in the async queue. See bug 43559. 
public	TokenNamepublic	
void	TokenNamevoid	
testMutableMessage	TokenNameIdentifier	 test Mutable Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
blockableAppender	TokenNameIdentifier	 blockable Appender
=	TokenNameEQUAL	
new	TokenNamenew	
BlockableVectorAppender	TokenNameIdentifier	 Blockable Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
async	TokenNameIdentifier	 async
=	TokenNameEQUAL	
new	TokenNamenew	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
rootLogger	TokenNameIdentifier	 root Logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
async	TokenNameIdentifier	 async
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Hello"	TokenNameStringLiteral	Hello
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getMonitor	TokenNameIdentifier	 get Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootLogger	TokenNameIdentifier	 root Logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", World."	TokenNameStringLiteral	, World.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
async	TokenNameIdentifier	 async
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
blockableAppender	TokenNameIdentifier	 blockable Appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
"%m"	TokenNameStringLiteral	%m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello"	TokenNameStringLiteral	Hello
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
