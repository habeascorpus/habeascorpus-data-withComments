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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
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
RootLogger	TokenNameIdentifier	 Root Logger
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
LoggerRepository	TokenNameIdentifier	 Logger Repository
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
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** Used for internal unit testing the Logger class. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Used for internal unit testing the Logger class. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
LoggerTestCase	TokenNameIdentifier	 Logger Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
a2	TokenNameIdentifier	 a2
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rbUS	TokenNameIdentifier	 rb US
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rbFR	TokenNameIdentifier	 rb FR
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rbCH	TokenNameIdentifier	 rb CH
;	TokenNameSEMICOLON	
// A short message. 	TokenNameCOMMENT_LINE	A short message. 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
MSG	TokenNameIdentifier	 MSG
=	TokenNameEQUAL	
"M"	TokenNameStringLiteral	M
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LoggerTestCase	TokenNameIdentifier	 Logger Test Case
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
rbUS	TokenNameIdentifier	 rb US
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"L7D"	TokenNameStringLiteral	L7D
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"en"	TokenNameStringLiteral	en
,	TokenNameCOMMA	
"US"	TokenNameStringLiteral	US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rbFR	TokenNameIdentifier	 rb FR
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"L7D"	TokenNameStringLiteral	L7D
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"fr"	TokenNameStringLiteral	fr
,	TokenNameCOMMA	
"FR"	TokenNameStringLiteral	FR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Got a null resource bundle."	TokenNameStringLiteral	Got a null resource bundle.
,	TokenNameCOMMA	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rbCH	TokenNameIdentifier	 rb CH
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"L7D"	TokenNameStringLiteral	L7D
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"fr"	TokenNameStringLiteral	fr
,	TokenNameCOMMA	
"CH"	TokenNameStringLiteral	CH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Got a null resource bundle."	TokenNameStringLiteral	Got a null resource bundle.
,	TokenNameCOMMA	
rbCH	TokenNameIdentifier	 rb CH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Regular users should not use the clear method lightly! 	TokenNameCOMMENT_LINE	Regular users should not use the clear method lightly! 
//Logger.getDefaultHierarchy().clear(); 	TokenNameCOMMENT_LINE	Logger.getDefaultHierarchy().clear(); 
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an appender and see if it can be retrieved. */	TokenNameCOMMENT_JAVADOC	 Add an appender and see if it can be retrieved. 
public	TokenNamepublic	
void	TokenNamevoid	
testAppender1	TokenNameIdentifier	 test Appender1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"testAppender1"	TokenNameStringLiteral	testAppender1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
aHat	TokenNameIdentifier	 a Hat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
aHat	TokenNameIdentifier	 a Hat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an appender X, Y, remove X and check if Y is the only remaining appender. */	TokenNameCOMMENT_JAVADOC	 Add an appender X, Y, remove X and check if Y is the only remaining appender. 
public	TokenNamepublic	
void	TokenNamevoid	
testAppender2	TokenNameIdentifier	 test Appender2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"testAppender2.1"	TokenNameStringLiteral	testAppender2.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"testAppender2.2"	TokenNameStringLiteral	testAppender2.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
"testAppender2.1"	TokenNameStringLiteral	testAppender2.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
aHat	TokenNameIdentifier	 a Hat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
aHat	TokenNameIdentifier	 a Hat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test if logger a.b inherits its appender from a. */	TokenNameCOMMENT_JAVADOC	 Test if logger a.b inherits its appender from a. 
public	TokenNamepublic	
void	TokenNamevoid	
testAdditivity1	TokenNameIdentifier	 test Additivity1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
ab	TokenNameIdentifier	 ab
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b"	TokenNameStringLiteral	a.b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test multiple additivity. */	TokenNameCOMMENT_JAVADOC	 Test multiple additivity. 
public	TokenNamepublic	
void	TokenNamevoid	
testAdditivity2	TokenNameIdentifier	 test Additivity2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
ab	TokenNameIdentifier	 ab
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b"	TokenNameStringLiteral	a.b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
abc	TokenNameIdentifier	 abc
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b.c"	TokenNameStringLiteral	a.b.c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
ca1	TokenNameIdentifier	 ca1
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
ca2	TokenNameIdentifier	 ca2
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
ca1	TokenNameIdentifier	 ca1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abc	TokenNameIdentifier	 abc
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
ca2	TokenNameIdentifier	 ca2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abc	TokenNameIdentifier	 abc
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test additivity flag. */	TokenNameCOMMENT_JAVADOC	 Test additivity flag. 
public	TokenNamepublic	
void	TokenNamevoid	
testAdditivity3	TokenNameIdentifier	 test Additivity3
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
Logger	TokenNameIdentifier	 Logger
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
ab	TokenNameIdentifier	 ab
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b"	TokenNameStringLiteral	a.b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
abc	TokenNameIdentifier	 abc
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b.c"	TokenNameStringLiteral	a.b.c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
caRoot	TokenNameIdentifier	 ca Root
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
caA	TokenNameIdentifier	 ca A
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
caABC	TokenNameIdentifier	 ca ABC
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
caA	TokenNameIdentifier	 ca A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abc	TokenNameIdentifier	 abc
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
caABC	TokenNameIdentifier	 ca ABC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caA	TokenNameIdentifier	 ca A
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caABC	TokenNameIdentifier	 ca ABC
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
setAdditivity	TokenNameIdentifier	 set Additivity
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caA	TokenNameIdentifier	 ca A
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caABC	TokenNameIdentifier	 ca ABC
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caA	TokenNameIdentifier	 ca A
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caABC	TokenNameIdentifier	 ca ABC
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abc	TokenNameIdentifier	 abc
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caA	TokenNameIdentifier	 ca A
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caABC	TokenNameIdentifier	 ca ABC
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDisable1	TokenNameIdentifier	 test Disable1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingAppender	TokenNameIdentifier	 Counting Appender
caRoot	TokenNameIdentifier	 ca Root
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
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
caRoot	TokenNameIdentifier	 ca Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggerRepository	TokenNameIdentifier	 Logger Repository
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//h.disableDebug(); 	TokenNameCOMMENT_LINE	h.disableDebug(); 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//h.disableInfo(); 	TokenNameCOMMENT_LINE	h.disableInfo(); 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//h.disableAll(); 	TokenNameCOMMENT_LINE	h.disableAll(); 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
OFF	TokenNameIdentifier	 OFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//h.disable(Level.FATAL); 	TokenNameCOMMENT_LINE	h.disable(Level.FATAL); 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
OFF	TokenNameIdentifier	 OFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
caRoot	TokenNameIdentifier	 ca Root
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRB1	TokenNameIdentifier	 test R B1
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y	TokenNameIdentifier	 x y
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y"	TokenNameStringLiteral	x.y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y_z	TokenNameIdentifier	 x y z
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y.z"	TokenNameStringLiteral	x.y.z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y	TokenNameIdentifier	 x y
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y_z	TokenNameIdentifier	 x y z
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRB2	TokenNameIdentifier	 test R B2
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y	TokenNameIdentifier	 x y
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y"	TokenNameStringLiteral	x.y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y_z	TokenNameIdentifier	 x y z
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y.z"	TokenNameStringLiteral	x.y.z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x_y	TokenNameIdentifier	 x y
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y	TokenNameIdentifier	 x y
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y_z	TokenNameIdentifier	 x y z
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRB3	TokenNameIdentifier	 test R B3
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
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y	TokenNameIdentifier	 x y
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y"	TokenNameStringLiteral	x.y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
x_y_z	TokenNameIdentifier	 x y z
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x.y.z"	TokenNameStringLiteral	x.y.z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x_y	TokenNameIdentifier	 x y
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x_y_z	TokenNameIdentifier	 x y z
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
rbCH	TokenNameIdentifier	 rb CH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbUS	TokenNameIdentifier	 rb US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y	TokenNameIdentifier	 x y
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbFR	TokenNameIdentifier	 rb FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
x_y_z	TokenNameIdentifier	 x y z
.	TokenNameDOT	
getResourceBundle	TokenNameIdentifier	 get Resource Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
rbCH	TokenNameIdentifier	 rb CH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExists	TokenNameIdentifier	 test Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
a_b	TokenNameIdentifier	 a b
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b"	TokenNameStringLiteral	a.b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
a_b_c	TokenNameIdentifier	 a b c
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a.b.c"	TokenNameStringLiteral	a.b.c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
"a.b"	TokenNameStringLiteral	a.b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a_b	TokenNameIdentifier	 a b
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
"a.b.c"	TokenNameStringLiteral	a.b.c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a_b_c	TokenNameIdentifier	 a b c
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHierarchy1	TokenNameIdentifier	 test Hierarchy1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hierarchy	TokenNameIdentifier	 Hierarchy
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
new	TokenNamenew	
RootLogger	TokenNameIdentifier	 Root Logger
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
a0	TokenNameIdentifier	 a0
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
a0	TokenNameIdentifier	 a0
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests logger.trace(Object). * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 Tests logger.trace(Object). @since 1.2.12 
public	TokenNamepublic	
void	TokenNamevoid	
testTrace	TokenNameIdentifier	 test Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VectorAppender	TokenNameIdentifier	 Vector Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
tracer	TokenNameIdentifier	 tracer
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"com.example.Tracer"	TokenNameStringLiteral	com.example.Tracer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message 1"	TokenNameStringLiteral	Message 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Discarded Message"	TokenNameStringLiteral	Discarded Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Discarded Message"	TokenNameStringLiteral	Discarded Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
msgs	TokenNameIdentifier	 msgs
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
msgs	TokenNameIdentifier	 msgs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
msgs	TokenNameIdentifier	 msgs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Message 1"	TokenNameStringLiteral	Message 1
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests logger.trace(Object, Exception). * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 Tests logger.trace(Object, Exception). @since 1.2.12 
public	TokenNamepublic	
void	TokenNamevoid	
testTraceWithException	TokenNameIdentifier	 test Trace With Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VectorAppender	TokenNameIdentifier	 Vector Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
tracer	TokenNameIdentifier	 tracer
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"com.example.Tracer"	TokenNameStringLiteral	com.example.Tracer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Message 1"	TokenNameStringLiteral	Message 1
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Discarded Message"	TokenNameStringLiteral	Discarded Message
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Discarded Message"	TokenNameStringLiteral	Discarded Message
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
msgs	TokenNameIdentifier	 msgs
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
msgs	TokenNameIdentifier	 msgs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
msgs	TokenNameIdentifier	 msgs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Message 1"	TokenNameStringLiteral	Message 1
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests isTraceEnabled. * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 Tests isTraceEnabled. @since 1.2.12 
public	TokenNamepublic	
void	TokenNamevoid	
testIsTraceEnabled	TokenNameIdentifier	 test Is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VectorAppender	TokenNameIdentifier	 Vector Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
tracer	TokenNameIdentifier	 tracer
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"com.example.Tracer"	TokenNameStringLiteral	com.example.Tracer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tracer	TokenNameIdentifier	 tracer
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
implements	TokenNameimplements	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
addEventCount	TokenNameIdentifier	 add Event Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
removeEventCount	TokenNameIdentifier	 remove Event Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addEventCount	TokenNameIdentifier	 add Event Count
=	TokenNameEQUAL	
removeEventCount	TokenNameIdentifier	 remove Event Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAppenderEvent	TokenNameIdentifier	 add Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addEventCount	TokenNameIdentifier	 add Event Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeAppenderEvent	TokenNameIdentifier	 remove Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEventCount	TokenNameIdentifier	 remove Event Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addEventCount	TokenNameIdentifier	 add Event Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
removeEventCount	TokenNameIdentifier	 remove Event Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppenderEvent1	TokenNameIdentifier	 test Appender Event1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppenderEvent2	TokenNameIdentifier	 test Appender Event2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"A1"	TokenNameStringLiteral	A1
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppenderEvent3	TokenNameIdentifier	 test Appender Event3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppenderEvent4	TokenNameIdentifier	 test Appender Event4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHierarchyEventListener	TokenNameIdentifier	 Counting Hierarchy Event Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
CountingAppender	TokenNameIdentifier	 Counting Appender
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
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getAddEventCount	TokenNameIdentifier	 get Add Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
getRemoveEventCount	TokenNameIdentifier	 get Remove Event Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
CountingAppender	TokenNameIdentifier	 Counting Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
CountingAppender	TokenNameIdentifier	 Counting Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
