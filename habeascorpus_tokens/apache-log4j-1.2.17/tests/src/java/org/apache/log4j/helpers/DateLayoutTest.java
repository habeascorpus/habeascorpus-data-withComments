/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
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
LayoutTest	TokenNameIdentifier	 Layout Test
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
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
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** * Tests for DateLayout. * */	TokenNameCOMMENT_JAVADOC	 Tests for DateLayout. 
public	TokenNamepublic	
class	TokenNameclass	
DateLayoutTest	TokenNameIdentifier	 Date Layout Test
extends	TokenNameextends	
LayoutTest	TokenNameIdentifier	 Layout Test
{	TokenNameLBRACE	
/** * Construct a new instance of LayoutTest. * @param testName test name. */	TokenNameCOMMENT_JAVADOC	 Construct a new instance of LayoutTest. @param testName test name. 
public	TokenNamepublic	
DateLayoutTest	TokenNameIdentifier	 Date Layout Test
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
}	TokenNameRBRACE	
/** * Constructor for use by derived tests. * @param testName name of test. * @param expectedContentType expected value for getContentType(). * @param expectedIgnoresThrowable expected value for ignoresThrowable(). * @param expectedHeader expected value for getHeader(). * @param expectedFooter expected value for getFooter(). */	TokenNameCOMMENT_JAVADOC	 Constructor for use by derived tests. @param testName name of test. @param expectedContentType expected value for getContentType(). @param expectedIgnoresThrowable expected value for ignoresThrowable(). @param expectedHeader expected value for getHeader(). @param expectedFooter expected value for getFooter(). 
protected	TokenNameprotected	
DateLayoutTest	TokenNameIdentifier	 Date Layout Test
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
,	TokenNameCOMMA	
expectedContentType	TokenNameIdentifier	 expected Content Type
,	TokenNameCOMMA	
expectedIgnoresThrowable	TokenNameIdentifier	 expected Ignores Throwable
,	TokenNameCOMMA	
expectedHeader	TokenNameIdentifier	 expected Header
,	TokenNameCOMMA	
expectedFooter	TokenNameIdentifier	 expected Footer
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
MockLayout	TokenNameIdentifier	 Mock Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DateLayout.NULL_DATE_FORMAT constant. */	TokenNameCOMMENT_JAVADOC	 Tests DateLayout.NULL_DATE_FORMAT constant. 
public	TokenNamepublic	
void	TokenNamevoid	
testNullDateFormat	TokenNameIdentifier	 test Null Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"NULL"	TokenNameStringLiteral	NULL
,	TokenNameCOMMA	
DateLayout	TokenNameIdentifier	 Date Layout
.	TokenNameDOT	
NULL_DATE_FORMAT	TokenNameIdentifier	 NULL  DATE  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DateLayout.RELATIVE constant. */	TokenNameCOMMENT_JAVADOC	 Tests DateLayout.RELATIVE constant. 
public	TokenNamepublic	
void	TokenNamevoid	
testRelativeTimeDateFormat	TokenNameIdentifier	 test Relative Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"RELATIVE"	TokenNameStringLiteral	RELATIVE
,	TokenNameCOMMA	
DateLayout	TokenNameIdentifier	 Date Layout
.	TokenNameDOT	
RELATIVE_TIME_DATE_FORMAT	TokenNameIdentifier	 RELATIVE  TIME  DATE  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DateLayout.DATE_FORMAT_OPTION constant. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Tests DateLayout.DATE_FORMAT_OPTION constant. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDateFormatOption	TokenNameIdentifier	 test Date Format Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DateFormat"	TokenNameStringLiteral	DateFormat
,	TokenNameCOMMA	
DateLayout	TokenNameIdentifier	 Date Layout
.	TokenNameDOT	
DATE_FORMAT_OPTION	TokenNameIdentifier	 DATE  FORMAT  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DateLayout.TIMEZONE_OPTION constant. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Tests DateLayout.TIMEZONE_OPTION constant. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testTimeZoneOption	TokenNameIdentifier	 test Time Zone Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TimeZone"	TokenNameStringLiteral	TimeZone
,	TokenNameCOMMA	
DateLayout	TokenNameIdentifier	 Date Layout
.	TokenNameDOT	
TIMEZONE_OPTION	TokenNameIdentifier	 TIMEZONE  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getOptionStrings(). * @deprecated since getOptionStrings is deprecated. * */	TokenNameCOMMENT_JAVADOC	 Tests getOptionStrings(). @deprecated since getOptionStrings is deprecated. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetOptionStrings	TokenNameIdentifier	 test Get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setting DateFormat through setOption method. * @deprecated since setOption is deprecated. */	TokenNameCOMMENT_JAVADOC	 Tests setting DateFormat through setOption method. @deprecated since setOption is deprecated. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetOptionDateFormat	TokenNameIdentifier	 test Set Option Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
"dAtefOrmat"	TokenNameStringLiteral	dAtefOrmat
,	TokenNameCOMMA	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FOOBAR"	TokenNameStringLiteral	FOOBAR
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getDateFormat	TokenNameIdentifier	 get Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setting TimeZone through setOption method. * @deprecated since setOption is deprecated. */	TokenNameCOMMENT_JAVADOC	 Tests setting TimeZone through setOption method. @deprecated since setOption is deprecated. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetOptionTimeZone	TokenNameIdentifier	 test Set Option Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
"tImezOne"	TokenNameStringLiteral	tImezOne
,	TokenNameCOMMA	
"+05:00"	TokenNameStringLiteral	+05:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"+05:00"	TokenNameStringLiteral	+05:00
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setDateFormat. */	TokenNameCOMMENT_JAVADOC	 Tests setDateFormat. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormat	TokenNameIdentifier	 test Set Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"ABSOLUTE"	TokenNameStringLiteral	ABSOLUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ABSOLUTE"	TokenNameStringLiteral	ABSOLUTE
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getDateFormat	TokenNameIdentifier	 get Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setTimeZone. */	TokenNameCOMMENT_JAVADOC	 Tests setTimeZone. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetTimeZone	TokenNameIdentifier	 test Set Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
"+05:00"	TokenNameStringLiteral	+05:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"+05:00"	TokenNameStringLiteral	+05:00
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with null. */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with null. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatNull	TokenNameIdentifier	 test Set Date Format Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "NULL". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "NULL". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatNullString	TokenNameIdentifier	 test Set Date Format Null String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"NuLL"	TokenNameStringLiteral	NuLL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "RELATIVE". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "RELATIVE". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatRelative	TokenNameIdentifier	 test Set Date Format Relative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"rElatIve"	TokenNameStringLiteral	rElatIve
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "ABSOLUTE". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "ABSOLUTE". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatAbsolute	TokenNameIdentifier	 test Set Date Format Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"aBsolUte"	TokenNameStringLiteral	aBsolUte
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "DATETIME". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "DATETIME". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatDateTime	TokenNameIdentifier	 test Set Date Format Date Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"dAte"	TokenNameStringLiteral	dAte
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "ISO8601". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "ISO8601". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatISO8601	TokenNameIdentifier	 test Set Date Format IS O8601
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"iSo8601"	TokenNameStringLiteral	iSo8601
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests 2 parameter setDateFormat with "HH:mm:ss". */	TokenNameCOMMENT_JAVADOC	 Tests 2 parameter setDateFormat with "HH:mm:ss". 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatSimple	TokenNameIdentifier	 test Set Date Format Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"HH:mm:ss"	TokenNameStringLiteral	HH:mm:ss
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests activateOptions. */	TokenNameCOMMENT_JAVADOC	 Tests activateOptions. 
public	TokenNamepublic	
void	TokenNamevoid	
testActivateOptions	TokenNameIdentifier	 test Activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
"HH:mm:ss"	TokenNameStringLiteral	HH:mm:ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
"+05:00"	TokenNameStringLiteral	+05:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setDateFormat(DateFormat, TimeZone). */	TokenNameCOMMENT_JAVADOC	 Tests setDateFormat(DateFormat, TimeZone). 
public	TokenNamepublic	
void	TokenNamevoid	
testSetDateFormatWithFormat	TokenNameIdentifier	 test Set Date Format With Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm"	TokenNameStringLiteral	HH:mm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateLayout	TokenNameIdentifier	 Date Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateLayout	TokenNameIdentifier	 Date Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests IS08601DateFormat class. * @deprecated since ISO8601DateFormat is deprecated */	TokenNameCOMMENT_JAVADOC	 Tests IS08601DateFormat class. @deprecated since ISO8601DateFormat is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testISO8601Format	TokenNameIdentifier	 test IS O8601 Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
new	TokenNamenew	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
calendar	TokenNameIdentifier	 calendar
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1970-01-01 00:00:00,000"	TokenNameStringLiteral	1970-01-01 00:00:00,000
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests DateTimeDateFormat class. * @deprecated since DateTimeDateFormat is deprecated */	TokenNameCOMMENT_JAVADOC	 Tests DateTimeDateFormat class. @deprecated since DateTimeDateFormat is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDateTimeFormat	TokenNameIdentifier	 test Date Time Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
calendar	TokenNameIdentifier	 calendar
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"dd MMM yyyy HH:mm:ss,SSS"	TokenNameStringLiteral	dd MMM yyyy HH:mm:ss,SSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
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
DateLayout	TokenNameIdentifier	 Date Layout
{	TokenNameLBRACE	
/** * Create new instance of MockLayout. */	TokenNameCOMMENT_JAVADOC	 Create new instance of MockLayout. 
public	TokenNamepublic	
MockLayout	TokenNameIdentifier	 Mock Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// checks that protected fields are properly initialized 	TokenNameCOMMENT_LINE	checks that protected fields are properly initialized 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
