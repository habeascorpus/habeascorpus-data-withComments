/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
ParseException	TokenNameIdentifier	 Parse Exception
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
Date	TokenNameIdentifier	 Date
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
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
/** * Date format manager. * Utility class to help manage consistent date formatting and parsing. * It may be advantageous to have multiple DateFormatManagers per * application. For example, one for handling the output (formatting) of * dates, and another one for handling the input (parsing) of dates. * * @author Robert Shaw * @author Michael J. Sikorsky */	TokenNameCOMMENT_JAVADOC	 Date format manager. Utility class to help manage consistent date formatting and parsing. It may be advantageous to have multiple DateFormatManagers per application. For example, one for handling the output (formatting) of dates, and another one for handling the input (parsing) of dates. * @author Robert Shaw @author Michael J. Sikorsky 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
TimeZone	TokenNameIdentifier	 Time Zone
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DateFormat	TokenNameIdentifier	 Date Format
_dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
TimeZone	TokenNameIdentifier	 Time Zone
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_timeZone	TokenNameIdentifier	 time Zone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the pattern. i.e. "EEEEE, MMMMM d, yyyy hh:mm aaa" */	TokenNameCOMMENT_JAVADOC	 Set the pattern. i.e. "EEEEE, MMMMM d, yyyy hh:mm aaa" 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method has been deprecated in favour of getPattern(). * @deprecated Use getPattern(). */	TokenNameCOMMENT_JAVADOC	 This method has been deprecated in favour of getPattern(). @deprecated Use getPattern(). 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method has been deprecated in favour of setPattern(). * @deprecated Use setPattern(). */	TokenNameCOMMENT_JAVADOC	 This method has been deprecated in favour of setPattern(). @deprecated Use setPattern(). 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
DateFormat	TokenNameIdentifier	 Date Format
getDateFormatInstance	TokenNameIdentifier	 get Date Format Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setDateFormatInstance	TokenNameIdentifier	 set Date Format Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
// No reconfiguration necessary! 	TokenNameCOMMENT_LINE	No reconfiguration necessary! 
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDateFormatInstance	TokenNameIdentifier	 get Date Format Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
getDateFormatInstance	TokenNameIdentifier	 get Date Format Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
instanceof	TokenNameinstanceof	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
.	TokenNameDOT	
applyPattern	TokenNameIdentifier	 apply Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @throws java.text.ParseException */	TokenNameCOMMENT_JAVADOC	 @throws java.text.ParseException 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getDateFormatInstance	TokenNameIdentifier	 get Date Format Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @throws java.text.ParseException */	TokenNameCOMMENT_JAVADOC	 @throws java.text.ParseException 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
DateFormat	TokenNameIdentifier	 Date Format
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
getDateFormatInstance	TokenNameIdentifier	 get Date Format Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
instanceof	TokenNameinstanceof	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
.	TokenNameDOT	
applyPattern	TokenNameIdentifier	 apply Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
)	TokenNameRPAREN	
_dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
.	TokenNameDOT	
applyPattern	TokenNameIdentifier	 apply Pattern
(	TokenNameLPAREN	
_pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
