/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
/** * Test for PatternLayout. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Test for PatternLayout. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
PatternLayoutTest	TokenNameIdentifier	 Pattern Layout Test
extends	TokenNameextends	
LayoutTest	TokenNameIdentifier	 Layout Test
{	TokenNameLBRACE	
/** * Construct new instance of PatternLayoutTest. * * @param testName test name. */	TokenNameCOMMENT_JAVADOC	 Construct new instance of PatternLayoutTest. * @param testName test name. 
public	TokenNamepublic	
PatternLayoutTest	TokenNameIdentifier	 Pattern Layout Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
,	TokenNameCOMMA	
"text/plain"	TokenNameStringLiteral	text/plain
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
protected	TokenNameprotected	
Layout	TokenNameIdentifier	 Layout
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"[%t] %p %c - %m%n"	TokenNameStringLiteral	[%t] %p %c - %m%n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests format. */	TokenNameCOMMENT_JAVADOC	 Tests format. 
public	TokenNamepublic	
void	TokenNamevoid	
testFormat	TokenNameIdentifier	 test Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.LayoutTest"	TokenNameStringLiteral	org.apache.log4j.LayoutTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
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
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternLayout	TokenNameIdentifier	 Pattern Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" - "	TokenNameStringLiteral	 - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
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
/** * Tests getPatternFormat(). */	TokenNameCOMMENT_JAVADOC	 Tests getPatternFormat(). 
public	TokenNamepublic	
void	TokenNamevoid	
testGetPatternFormat	TokenNameIdentifier	 test Get Pattern Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternLayout	TokenNameIdentifier	 Pattern Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[%t] %p %c - %m%n"	TokenNameStringLiteral	[%t] %p %c - %m%n
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getConversionPattern	TokenNameIdentifier	 get Conversion Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DEFAULT_CONVERSION_PATTERN constant. */	TokenNameCOMMENT_JAVADOC	 Tests DEFAULT_CONVERSION_PATTERN constant. 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultConversionPattern	TokenNameIdentifier	 test Default Conversion Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
,	TokenNameCOMMA	
PatternLayout	TokenNameIdentifier	 Pattern Layout
.	TokenNameDOT	
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DEFAULT_CONVERSION_PATTERN constant. */	TokenNameCOMMENT_JAVADOC	 Tests DEFAULT_CONVERSION_PATTERN constant. 
public	TokenNamepublic	
void	TokenNamevoid	
testTTCCConversionPattern	TokenNameIdentifier	 test TTCC Conversion Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"%r [%t] %p %c %x - %m%n"	TokenNameStringLiteral	%r [%t] %p %c %x - %m%n
,	TokenNameCOMMA	
PatternLayout	TokenNameIdentifier	 Pattern Layout
.	TokenNameDOT	
TTCC_CONVERSION_PATTERN	TokenNameIdentifier	 TTCC  CONVERSION  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests buffer downsizing code path. */	TokenNameCOMMENT_JAVADOC	 Tests buffer downsizing code path. 
public	TokenNamepublic	
void	TokenNamevoid	
testFormatResize	TokenNameIdentifier	 test Format Resize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.xml.PatternLayoutTest"	TokenNameStringLiteral	org.apache.log4j.xml.PatternLayoutTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
event1	TokenNameIdentifier	 event1
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
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternLayout	TokenNameIdentifier	 Pattern Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event1	TokenNameIdentifier	 event1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event2	TokenNameIdentifier	 event2
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
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event2	TokenNameIdentifier	 event2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class to ensure that protected members are still available. */	TokenNameCOMMENT_JAVADOC	 Class to ensure that protected members are still available. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DerivedPatternLayout	TokenNameIdentifier	 Derived Pattern Layout
extends	TokenNameextends	
PatternLayout	TokenNameIdentifier	 Pattern Layout
{	TokenNameLBRACE	
/** * Constructs a new instance of DerivedPatternLayout. */	TokenNameCOMMENT_JAVADOC	 Constructs a new instance of DerivedPatternLayout. 
public	TokenNamepublic	
DerivedPatternLayout	TokenNameIdentifier	 Derived Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get BUF_SIZE. * @return return initial buffer size in characters. */	TokenNameCOMMENT_JAVADOC	 Get BUF_SIZE. @return return initial buffer size in characters. 
public	TokenNamepublic	
int	TokenNameint	
getBufSize	TokenNameIdentifier	 get Buf Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BUF_SIZE	TokenNameIdentifier	 BUF  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get MAX_CAPACITY. * @return maximum capacity in characters. */	TokenNameCOMMENT_JAVADOC	 Get MAX_CAPACITY. @return maximum capacity in characters. 
public	TokenNamepublic	
int	TokenNameint	
getMaxCapacity	TokenNameIdentifier	 get Max Capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MAX_CAPACITY	TokenNameIdentifier	 MAX  CAPACITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
