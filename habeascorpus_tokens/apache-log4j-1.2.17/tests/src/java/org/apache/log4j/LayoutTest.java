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
/** * Tests for Layout. * */	TokenNameCOMMENT_JAVADOC	 Tests for Layout. 
public	TokenNamepublic	
class	TokenNameclass	
LayoutTest	TokenNameIdentifier	 Layout Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Expected content type. */	TokenNameCOMMENT_JAVADOC	 Expected content type. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
/** * Expected value for ignoresThrowable. */	TokenNameCOMMENT_JAVADOC	 Expected value for ignoresThrowable. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
;	TokenNameSEMICOLON	
/** * Expected value for header. */	TokenNameCOMMENT_JAVADOC	 Expected value for header. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
/** * Expected value for footer. */	TokenNameCOMMENT_JAVADOC	 Expected value for footer. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
footer	TokenNameIdentifier	 footer
;	TokenNameSEMICOLON	
/** * Construct a new instance of LayoutTest. * @param testName test name. */	TokenNameCOMMENT_JAVADOC	 Construct a new instance of LayoutTest. @param testName test name. 
public	TokenNamepublic	
LayoutTest	TokenNameIdentifier	 Layout Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
"text/plain"	TokenNameStringLiteral	text/plain
;	TokenNameSEMICOLON	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
footer	TokenNameIdentifier	 footer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for use by derived tests. * @param testName name of test. * @param expectedContentType expected value for getContentType(). * @param expectedIgnoresThrowable expected value for ignoresThrowable(). * @param expectedHeader expected value for getHeader(). * @param expectedFooter expected value for getFooter(). */	TokenNameCOMMENT_JAVADOC	 Constructor for use by derived tests. @param testName name of test. @param expectedContentType expected value for getContentType(). @param expectedIgnoresThrowable expected value for ignoresThrowable(). @param expectedHeader expected value for getHeader(). @param expectedFooter expected value for getFooter(). 
protected	TokenNameprotected	
LayoutTest	TokenNameIdentifier	 Layout Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expectedContentType	TokenNameIdentifier	 expected Content Type
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
expectedIgnoresThrowable	TokenNameIdentifier	 expected Ignores Throwable
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expectedHeader	TokenNameIdentifier	 expected Header
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expectedFooter	TokenNameIdentifier	 expected Footer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
expectedContentType	TokenNameIdentifier	 expected Content Type
;	TokenNameSEMICOLON	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
=	TokenNameEQUAL	
expectedIgnoresThrowable	TokenNameIdentifier	 expected Ignores Throwable
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
expectedHeader	TokenNameIdentifier	 expected Header
;	TokenNameSEMICOLON	
footer	TokenNameIdentifier	 footer
=	TokenNameEQUAL	
expectedFooter	TokenNameIdentifier	 expected Footer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Layout.LINE_SEP. */	TokenNameCOMMENT_JAVADOC	 Tests Layout.LINE_SEP. 
public	TokenNamepublic	
void	TokenNamevoid	
testLineSep	TokenNameIdentifier	 test Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Layout.LINE_SEP. */	TokenNameCOMMENT_JAVADOC	 Tests Layout.LINE_SEP. 
public	TokenNamepublic	
void	TokenNamevoid	
testLineSepLen	TokenNameIdentifier	 test Line Sep Len
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP_LEN	TokenNameIdentifier	 LINE  SEP  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates layout for test. * @return new instance of Layout. */	TokenNameCOMMENT_JAVADOC	 Creates layout for test. @return new instance of Layout. 
protected	TokenNameprotected	
Layout	TokenNameIdentifier	 Layout
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MockLayout	TokenNameIdentifier	 Mock Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getContentType. */	TokenNameCOMMENT_JAVADOC	 Tests getContentType. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetContentType	TokenNameIdentifier	 test Get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests ignoresThrowable. */	TokenNameCOMMENT_JAVADOC	 Tests ignoresThrowable. 
public	TokenNamepublic	
void	TokenNamevoid	
testIgnoresThrowable	TokenNameIdentifier	 test Ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getHeader. */	TokenNameCOMMENT_JAVADOC	 Tests getHeader. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetHeader	TokenNameIdentifier	 test Get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getFooter. */	TokenNameCOMMENT_JAVADOC	 Tests getFooter. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFooter	TokenNameIdentifier	 test Get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
footer	TokenNameIdentifier	 footer
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests format. * @throws Exception derived tests, particular XMLLayoutTest, may throw exceptions. */	TokenNameCOMMENT_JAVADOC	 Tests format. @throws Exception derived tests, particular XMLLayoutTest, may throw exceptions. 
public	TokenNamepublic	
void	TokenNamevoid	
testFormat	TokenNameIdentifier	 test Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
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
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Mock"	TokenNameStringLiteral	Mock
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Concrete Layout class for tests. */	TokenNameCOMMENT_JAVADOC	 Concrete Layout class for tests. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MockLayout	TokenNameIdentifier	 Mock Layout
extends	TokenNameextends	
Layout	TokenNameIdentifier	 Layout
{	TokenNameLBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Mock"	TokenNameStringLiteral	Mock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
