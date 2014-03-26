/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
Layout	TokenNameIdentifier	 Layout
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** Test case for PatternParser.java. Tests the various conversion patterns supported by PatternParser. This test class tests PatternParser via the EnhancedPatternLayout class which uses it. */	TokenNameCOMMENT_JAVADOC	 Test case for PatternParser.java. Tests the various conversion patterns supported by PatternParser. This test class tests PatternParser via the EnhancedPatternLayout class which uses it. 
public	TokenNamepublic	
class	TokenNameclass	
PatternParserTest	TokenNameIdentifier	 Pattern Parser Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.foobar"	TokenNameStringLiteral	org.foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PatternParserTest	TokenNameIdentifier	 Pattern Parser Test
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
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"org.apache.log4j.Logger"	TokenNameStringLiteral	org.apache.log4j.Logger
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"msg 1"	TokenNameStringLiteral	msg 1
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
registry	TokenNameIdentifier	 registry
,	TokenNameCOMMA	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
converters	TokenNameIdentifier	 converters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
converters	TokenNameIdentifier	 converters
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
registry	TokenNameIdentifier	 registry
,	TokenNameCOMMA	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
getPatternLayoutRules	TokenNameIdentifier	 get Pattern Layout Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
converterIter	TokenNameIdentifier	 converter Iter
=	TokenNameEQUAL	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
fieldIter	TokenNameIdentifier	 field Iter
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
converterIter	TokenNameIdentifier	 converter Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
)	TokenNameRPAREN	
converterIter	TokenNameIdentifier	 converter Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
)	TokenNameRPAREN	
fieldIter	TokenNameIdentifier	 field Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNewWord	TokenNameIdentifier	 test New Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
ruleRegistry	TokenNameIdentifier	 rule Registry
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ruleRegistry	TokenNameIdentifier	 rule Registry
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"z343"	TokenNameStringLiteral	z343
,	TokenNameCOMMA	
Num343PatternConverter	TokenNameIdentifier	 Num343 Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%z343"	TokenNameStringLiteral	%z343
,	TokenNameCOMMA	
ruleRegistry	TokenNameIdentifier	 rule Registry
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"343"	TokenNameStringLiteral	343
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Test whether words starting with the letter 'n' are treated differently, * which was previously the case by mistake. */	TokenNameCOMMENT_BLOCK	 Test whether words starting with the letter 'n' are treated differently, which was previously the case by mistake. 
public	TokenNamepublic	
void	TokenNamevoid	
testNewWord2	TokenNameIdentifier	 test New Word2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
ruleRegistry	TokenNameIdentifier	 rule Registry
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ruleRegistry	TokenNameIdentifier	 rule Registry
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"n343"	TokenNameStringLiteral	n343
,	TokenNameCOMMA	
Num343PatternConverter	TokenNameIdentifier	 Num343 Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%n343"	TokenNameStringLiteral	%n343
,	TokenNameCOMMA	
ruleRegistry	TokenNameIdentifier	 rule Registry
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"343"	TokenNameStringLiteral	343
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBogusWord1	TokenNameIdentifier	 test Bogus Word1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%, foobar"	TokenNameStringLiteral	%, foobar
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"%, foobar"	TokenNameStringLiteral	%, foobar
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBogusWord2	TokenNameIdentifier	 test Bogus Word2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"xyz %, foobar"	TokenNameStringLiteral	xyz %, foobar
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"xyz %, foobar"	TokenNameStringLiteral	xyz %, foobar
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic1	TokenNameIdentifier	 test Basic1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"hello %-5level - %m%n"	TokenNameStringLiteral	hello %-5level - %m%n
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hello INFO - msg 1"	TokenNameStringLiteral	hello INFO - msg 1
+	TokenNamePLUS	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic2	TokenNameIdentifier	 test Basic2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%relative %-5level [%thread] %logger - %m%n"	TokenNameStringLiteral	%relative %-5level [%thread] %logger - %m%n
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
expectedRelativeTime	TokenNameIdentifier	 expected Relative Time
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
-	TokenNameMINUS	
LoggingEvent	TokenNameIdentifier	 Logging Event
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedRelativeTime	TokenNameIdentifier	 expected Relative Time
+	TokenNamePLUS	
" INFO [main] "	TokenNameStringLiteral	 INFO [main] 
+	TokenNamePLUS	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - msg 1"	TokenNameStringLiteral	 - msg 1
+	TokenNamePLUS	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiOption	TokenNameIdentifier	 test Multi Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%d{HH:mm:ss}{GMT} %d{HH:mm:ss} %c - %m"	TokenNameStringLiteral	%d{HH:mm:ss}{GMT} %d{HH:mm:ss} %c - %m
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss"	TokenNameStringLiteral	HH:mm:ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localTime	TokenNameIdentifier	 local Time
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
utcTime	TokenNameIdentifier	 utc Time
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
utcTime	TokenNameIdentifier	 utc Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localTime	TokenNameIdentifier	 local Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" org.foobar - msg 1"	TokenNameStringLiteral	 org.foobar - msg 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBogus	TokenNameIdentifier	 test Bogus
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%bogus"	TokenNameStringLiteral	%bogus
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"%bogus"	TokenNameStringLiteral	%bogus
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMore	TokenNameIdentifier	 test More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"%more"	TokenNameStringLiteral	%more
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"msg 1ore"	TokenNameStringLiteral	msg 1ore
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Options with missing close braces will be treated as a literal. * Endless looped with earlier code. * */	TokenNameCOMMENT_JAVADOC	 Options with missing close braces will be treated as a literal. Endless looped with earlier code. 
public	TokenNamepublic	
void	TokenNamevoid	
testMalformedOption	TokenNameIdentifier	 test Malformed Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
"foo%m{yyyy.MM.dd"	TokenNameStringLiteral	foo%m{yyyy.MM.dd
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foomsg 1{yyyy.MM.dd"	TokenNameStringLiteral	foomsg 1{yyyy.MM.dd
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertFactories	TokenNameIdentifier	 assert Factories
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
factorySig	TokenNameIdentifier	 factory Sig
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"[Ljava.lang.String;"	TokenNameStringLiteral	[Ljava.lang.String;
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
factoryArg	TokenNameIdentifier	 factory Arg
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
ruleClass	TokenNameIdentifier	 rule Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
ruleClass	TokenNameIdentifier	 rule Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"newInstance"	TokenNameStringLiteral	newInstance
,	TokenNameCOMMA	
factorySig	TokenNameIdentifier	 factory Sig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
converter	TokenNameIdentifier	 converter
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
factoryArg	TokenNameIdentifier	 factory Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
converter	TokenNameIdentifier	 converter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPatternLayoutFactories	TokenNameIdentifier	 test Pattern Layout Factories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertFactories	TokenNameIdentifier	 assert Factories
(	TokenNameLPAREN	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
getPatternLayoutRules	TokenNameIdentifier	 get Pattern Layout Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFileNamePatternFactories	TokenNameIdentifier	 test File Name Pattern Factories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertFactories	TokenNameIdentifier	 assert Factories
(	TokenNameLPAREN	
PatternParser	TokenNameIdentifier	 Pattern Parser
.	TokenNameDOT	
getFileNamePatternRules	TokenNameIdentifier	 get File Name Pattern Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
