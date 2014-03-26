/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
TimeComparison	TokenNameIdentifier	 Time Comparison
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Selector that chooses files based on their last modified date. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that chooses files based on their last modified date. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
DateSelector	TokenNameIdentifier	 Date Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
{	TokenNameLBRACE	
/** Utilities used for file operations */	TokenNameCOMMENT_JAVADOC	 Utilities used for file operations 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeDirs	TokenNameIdentifier	 include Dirs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TimeComparison	TokenNameIdentifier	 Time Comparison
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
TimeComparison	TokenNameIdentifier	 Time Comparison
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MILLIS_KEY	TokenNameIdentifier	 MILLIS  KEY
=	TokenNameEQUAL	
"millis"	TokenNameStringLiteral	millis
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATETIME_KEY	TokenNameIdentifier	 DATETIME  KEY
=	TokenNameEQUAL	
"datetime"	TokenNameStringLiteral	datetime
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECKDIRS_KEY	TokenNameIdentifier	 CHECKDIRS  KEY
=	TokenNameEQUAL	
"checkdirs"	TokenNameStringLiteral	checkdirs
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GRANULARITY_KEY	TokenNameIdentifier	 GRANULARITY  KEY
=	TokenNameEQUAL	
"granularity"	TokenNameStringLiteral	granularity
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WHEN_KEY	TokenNameIdentifier	 WHEN  KEY
=	TokenNameEQUAL	
"when"	TokenNameStringLiteral	when
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATTERN_KEY	TokenNameIdentifier	 PATTERN  KEY
=	TokenNameEQUAL	
"pattern"	TokenNameStringLiteral	pattern
;	TokenNameSEMICOLON	
/** * Creates a new <code>DateSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>DateSelector</code> instance. 
public	TokenNamepublic	
DateSelector	TokenNameIdentifier	 Date Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{dateselector date: "	TokenNameStringLiteral	{dateselector date: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" compare: "	TokenNameStringLiteral	 compare: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" granularity: "	TokenNameStringLiteral	 granularity: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" pattern: "	TokenNameStringLiteral	 pattern: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the time; for users who prefer to express time in ms since 1970. * * @param millis the time to compare file's last modified date to, * expressed in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Set the time; for users who prefer to express time in ms since 1970. * @param millis the time to compare file's last modified date to, expressed in milliseconds. 
public	TokenNamepublic	
void	TokenNamevoid	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the millisecond value the selector is set for. * @return the millisecond value. */	TokenNameCOMMENT_JAVADOC	 Returns the millisecond value the selector is set for. @return the millisecond value. 
public	TokenNamepublic	
long	TokenNamelong	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the date. The user must supply it in MM/DD/YYYY HH:MM AM_PM format, * unless an alternate pattern is specified via the pattern attribute. * * @param dateTime a formatted date <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the date. The user must supply it in MM/DD/YYYY HH:MM AM_PM format, unless an alternate pattern is specified via the pattern attribute. * @param dateTime a formatted date <code>String</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
;	TokenNameSEMICOLON	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to check dates on directories. * * @param includeDirs whether to check the timestamp on directories. */	TokenNameCOMMENT_JAVADOC	 Set whether to check dates on directories. * @param includeDirs whether to check the timestamp on directories. 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckdirs	TokenNameIdentifier	 set Checkdirs
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeDirs	TokenNameIdentifier	 include Dirs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeDirs	TokenNameIdentifier	 include Dirs
=	TokenNameEQUAL	
includeDirs	TokenNameIdentifier	 include Dirs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of milliseconds leeway we will give before we consider * a file not to have matched a date. * @param granularity the number of milliseconds leeway. */	TokenNameCOMMENT_JAVADOC	 Sets the number of milliseconds leeway we will give before we consider a file not to have matched a date. @param granularity the number of milliseconds leeway. 
public	TokenNamepublic	
void	TokenNamevoid	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
int	TokenNameint	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
granularity	TokenNameIdentifier	 granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the type of comparison to be done on the file's last modified * date. * * @param tcmp The comparison to perform, an EnumeratedAttribute. */	TokenNameCOMMENT_JAVADOC	 Sets the type of comparison to be done on the file's last modified date. * @param tcmp The comparison to perform, an EnumeratedAttribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
tcmp	TokenNameIdentifier	 tcmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimeComparison	TokenNameIdentifier	 Time Comparison
)	TokenNameRPAREN	
tcmp	TokenNameIdentifier	 tcmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comparison type. * @param t TimeComparison object. */	TokenNameCOMMENT_JAVADOC	 Set the comparison type. @param t TimeComparison object. 
public	TokenNamepublic	
void	TokenNamevoid	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
TimeComparison	TokenNameIdentifier	 Time Comparison
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the pattern to be used for the SimpleDateFormat. * * @param pattern the pattern that defines the date format. */	TokenNameCOMMENT_JAVADOC	 Sets the pattern to be used for the SimpleDateFormat. * @param pattern the pattern that defines the date format. 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When using this as a custom selector, this method will be called. * It translates each parameter into the appropriate setXXX() call. * * @param parameters the complete set of parameters for this selector. */	TokenNameCOMMENT_JAVADOC	 When using this as a custom selector, this method will be called. It translates each parameter into the appropriate setXXX() call. * @param parameters the complete set of parameters for this selector. 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
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
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramname	TokenNameIdentifier	 paramname
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
MILLIS_KEY	TokenNameIdentifier	 MILLIS  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid millisecond setting "	TokenNameStringLiteral	Invalid millisecond setting 
+	TokenNamePLUS	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DATETIME_KEY	TokenNameIdentifier	 DATETIME  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
CHECKDIRS_KEY	TokenNameIdentifier	 CHECKDIRS  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCheckdirs	TokenNameIdentifier	 set Checkdirs
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
GRANULARITY_KEY	TokenNameIdentifier	 GRANULARITY  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid granularity setting "	TokenNameStringLiteral	Invalid granularity setting 
+	TokenNamePLUS	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WHEN_KEY	TokenNameIdentifier	 WHEN  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
new	TokenNamenew	
TimeComparison	TokenNameIdentifier	 Time Comparison
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
PATTERN_KEY	TokenNameIdentifier	 PATTERN  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid parameter "	TokenNameStringLiteral	Invalid parameter 
+	TokenNamePLUS	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is a consistency check to ensure the selector's required * values have been set. */	TokenNameCOMMENT_JAVADOC	 This is a consistency check to ensure the selector's required values have been set. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"You must provide a datetime or the number of "	TokenNameStringLiteral	You must provide a datetime or the number of 
+	TokenNamePLUS	
"milliseconds."	TokenNameStringLiteral	milliseconds.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dateTime	TokenNameIdentifier	 date Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check millis and only set it once. 	TokenNameCOMMENT_LINE	check millis and only set it once. 
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Date of "	TokenNameStringLiteral	Date of 
+	TokenNamePLUS	
dateTime	TokenNameIdentifier	 date Time
+	TokenNamePLUS	
" results in negative milliseconds value"	TokenNameStringLiteral	 results in negative milliseconds value
+	TokenNamePLUS	
" relative to epoch (January 1, 1970, 00:00:00 GMT)."	TokenNameStringLiteral	 relative to epoch (January 1, 1970, 00:00:00 GMT).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Date of "	TokenNameStringLiteral	Date of 
+	TokenNamePLUS	
dateTime	TokenNameIdentifier	 date Time
+	TokenNamePLUS	
" Cannot be parsed correctly. It should be in"	TokenNameStringLiteral	 Cannot be parsed correctly. It should be in
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" MM/DD/YYYY HH:MM AM_PM"	TokenNameStringLiteral	 MM/DD/YYYY HH:MM AM_PM
:	TokenNameCOLON	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
+	TokenNamePLUS	
" format."	TokenNameStringLiteral	 format.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. * * @param basedir the base directory from which the scan is being performed. * @param filename is the name of the file to check. * @param file is a java.io.File object the selector can use. * @return whether the file is selected. */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. * @param basedir the base directory from which the scan is being performed. @param filename is the name of the file to check. @param file is a java.io.File object the selector can use. @return whether the file is selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
includeDirs	TokenNameIdentifier	 include Dirs
)	TokenNameRPAREN	
||	TokenNameOR_OR	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
millis	TokenNameIdentifier	 millis
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values for time comparison. * <p> */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values for time comparison. <p> 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
extends	TokenNameextends	
TimeComparison	TokenNameIdentifier	 Time Comparison
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
