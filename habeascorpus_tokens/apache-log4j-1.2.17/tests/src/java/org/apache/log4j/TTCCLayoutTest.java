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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DateLayoutTest	TokenNameIdentifier	 Date Layout Test
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
/** * Test for TTCCLayout. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Test for TTCCLayout. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
TTCCLayoutTest	TokenNameIdentifier	 TTCC Layout Test
extends	TokenNameextends	
DateLayoutTest	TokenNameIdentifier	 Date Layout Test
{	TokenNameLBRACE	
/** * Construct new instance of TTCCLayoutTest. * * @param testName test name. */	TokenNameCOMMENT_JAVADOC	 Construct new instance of TTCCLayoutTest. * @param testName test name. 
public	TokenNamepublic	
TTCCLayoutTest	TokenNameIdentifier	 TTCC Layout Test
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
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
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
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"NDC goes here"	TokenNameStringLiteral	NDC goes here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
TTCCLayout	TokenNameIdentifier	 TTCC Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
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
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
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
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
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
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"NDC goes here"	TokenNameStringLiteral	NDC goes here
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
/** * Tests getThreadPrinting and setThreadPrinting. */	TokenNameCOMMENT_JAVADOC	 Tests getThreadPrinting and setThreadPrinting. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetSetThreadPrinting	TokenNameIdentifier	 test Get Set Thread Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getThreadPrinting	TokenNameIdentifier	 get Thread Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setThreadPrinting	TokenNameIdentifier	 set Thread Printing
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getThreadPrinting	TokenNameIdentifier	 get Thread Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setThreadPrinting	TokenNameIdentifier	 set Thread Printing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getThreadPrinting	TokenNameIdentifier	 get Thread Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getCategoryPrefixing and setCategoryPrefixing. */	TokenNameCOMMENT_JAVADOC	 Tests getCategoryPrefixing and setCategoryPrefixing. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetSetCategoryPrefixing	TokenNameIdentifier	 test Get Set Category Prefixing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getCategoryPrefixing	TokenNameIdentifier	 get Category Prefixing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setCategoryPrefixing	TokenNameIdentifier	 set Category Prefixing
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getCategoryPrefixing	TokenNameIdentifier	 get Category Prefixing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setCategoryPrefixing	TokenNameIdentifier	 set Category Prefixing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getCategoryPrefixing	TokenNameIdentifier	 get Category Prefixing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getContextPrinting and setContextPrinting. */	TokenNameCOMMENT_JAVADOC	 Tests getContextPrinting and setContextPrinting. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetSetContextPrinting	TokenNameIdentifier	 test Get Set Context Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
TTCCLayout	TokenNameIdentifier	 TTCC Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getContextPrinting	TokenNameIdentifier	 get Context Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setContextPrinting	TokenNameIdentifier	 set Context Printing
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getContextPrinting	TokenNameIdentifier	 get Context Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setContextPrinting	TokenNameIdentifier	 set Context Printing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getContextPrinting	TokenNameIdentifier	 get Context Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
