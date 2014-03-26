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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
BuildException	TokenNameIdentifier	 Build Exception
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
Resource	TokenNameIdentifier	 Resource
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
/** * Date ResourceSelector. Based on the date FileSelector, with the most * notable difference being the lack of support for the includedirs attribute. * It is recommended that the effect of includeDirs = "false" be achieved for * resources by enclosing a "dir" Type ResourceSelector and a Date * ResourceSelector in an Or ResourceSelector. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Date ResourceSelector. Based on the date FileSelector, with the most notable difference being the lack of support for the includedirs attribute. It is recommended that the effect of includeDirs = "false" be achieved for resources by enclosing a "dir" Type ResourceSelector and a Date ResourceSelector in an Or ResourceSelector. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Date	TokenNameIdentifier	 Date
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MILLIS_OR_DATETIME	TokenNameIdentifier	 MILLIS  OR  DATETIME
=	TokenNameEQUAL	
"Either the millis or the datetime attribute must be set."	TokenNameStringLiteral	Either the millis or the datetime attribute must be set.
;	TokenNameSEMICOLON	
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
Long	TokenNameIdentifier	 Long
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TimeComparison	TokenNameIdentifier	 Time Comparison
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
TimeComparison	TokenNameIdentifier	 Time Comparison
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the date/time in milliseconds since 1970. * @param m the number of millis. */	TokenNameCOMMENT_JAVADOC	 Set the date/time in milliseconds since 1970. @param m the number of millis. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
long	TokenNamelong	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the date/time in ms. * @return long number of millis since 1970. */	TokenNameCOMMENT_JAVADOC	 Get the date/time in ms. @return long number of millis since 1970. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
millis	TokenNameIdentifier	 millis
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
:	TokenNameCOLON	
millis	TokenNameIdentifier	 millis
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the date and time as a String. * @param s the date & time to use. */	TokenNameCOMMENT_JAVADOC	 Set the date and time as a String. @param s the date & time to use. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setDateTime	TokenNameIdentifier	 set Date Time
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the date & time in String format. * @return a String representing a date & time. */	TokenNameCOMMENT_JAVADOC	 Get the date & time in String format. @return a String representing a date & time. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getDatetime	TokenNameIdentifier	 get Datetime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dateTime	TokenNameIdentifier	 date Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the granularity to use for this ResourceSelector. * @param g the timestamp granularity. */	TokenNameCOMMENT_JAVADOC	 Set the granularity to use for this ResourceSelector. @param g the timestamp granularity. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
long	TokenNamelong	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the timestamp granularity used by this ResourceSelector. * @return the long granularity. */	TokenNameCOMMENT_JAVADOC	 Get the timestamp granularity used by this ResourceSelector. @return the long granularity. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getGranularity	TokenNameIdentifier	 get Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
granularity	TokenNameIdentifier	 granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the optional pattern to use with the datetime attribute. * @param p the SimpleDateFormat-compatible pattern string. */	TokenNameCOMMENT_JAVADOC	 Set the optional pattern to use with the datetime attribute. @param p the SimpleDateFormat-compatible pattern string. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the pattern for use with the datetime attribute. * @return a SimpleDateFormat-compatible pattern string. */	TokenNameCOMMENT_JAVADOC	 Get the pattern for use with the datetime attribute. @return a SimpleDateFormat-compatible pattern string. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comparison mode. * @param c a TimeComparison object. */	TokenNameCOMMENT_JAVADOC	 Set the comparison mode. @param c a TimeComparison object. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
TimeComparison	TokenNameIdentifier	 Time Comparison
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the comparison mode. * @return a TimeComparison object. */	TokenNameCOMMENT_JAVADOC	 Get the comparison mode. @return a TimeComparison object. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
TimeComparison	TokenNameIdentifier	 Time Comparison
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if this Resource is selected. * @param r the Resource to check. * @return whether the Resource was selected. */	TokenNameCOMMENT_JAVADOC	 Return true if this Resource is selected. @param r the Resource to check. @return whether the Resource was selected. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
millis	TokenNameIdentifier	 millis
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
MILLIS_OR_DATETIME	TokenNameIdentifier	 MILLIS  OR  DATETIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
long	TokenNamelong	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
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
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Date of "	TokenNameStringLiteral	Date of 
+	TokenNamePLUS	
dateTime	TokenNameIdentifier	 date Time
+	TokenNamePLUS	
" Cannot be parsed correctly. It should be in"	TokenNameStringLiteral	 Cannot be parsed correctly. It should be in
+	TokenNamePLUS	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
return	TokenNamereturn	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
millis	TokenNameIdentifier	 millis
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
