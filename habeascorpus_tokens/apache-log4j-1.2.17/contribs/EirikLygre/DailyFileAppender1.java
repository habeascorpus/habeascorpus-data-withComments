/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
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
QuietWriter	TokenNameIdentifier	 Quiet Writer
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
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
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
ErrorCode	TokenNameIdentifier	 Error Code
;	TokenNameSEMICOLON	
/** DailyFileAppender extends FileAppender to use filenames formatted with date/time information. The filename is recomputed every day at midnight. Note that the filename doesn't have to change every day, making it possible to have logfiles which are per-week or per-month. The appender computes the proper filename using the formats specified in <a href="http://java.sun.com/j2se/1.3/docs/api/java/text/SimpleDateFormat.html"> java.text.SimpleDateFormat</a>. The format requires that most static text is enclosed in single quotes, which are removed. The examples below show how quotes are used to embed static information in the format. Sample filenames: <code> Filename pattern Filename "'/logs/trace-'yyyy-MM-dd'.log'" /logs/trace-2000-12-31.log "'/logs/trace-'yyyy-ww'.log'" /logs/trace-2000-52.log </code> @author <a HREF="mailto:eirik.lygre@evita.no">Eirik Lygre</a> */	TokenNameCOMMENT_JAVADOC	 DailyFileAppender extends FileAppender to use filenames formatted with date/time information. The filename is recomputed every day at midnight. Note that the filename doesn't have to change every day, making it possible to have logfiles which are per-week or per-month. The appender computes the proper filename using the formats specified in <a href="http://java.sun.com/j2se/1.3/docs/api/java/text/SimpleDateFormat.html"> java.text.SimpleDateFormat</a>. The format requires that most static text is enclosed in single quotes, which are removed. The examples below show how quotes are used to embed static information in the format. Sample filenames: <code> Filename pattern Filename "'/logs/trace-'yyyy-MM-dd'.log'" /logs/trace-2000-12-31.log "'/logs/trace-'yyyy-ww'.log'" /logs/trace-2000-52.log </code> @author <a HREF="mailto:eirik.lygre@evita.no">Eirik Lygre</a> 
public	TokenNamepublic	
class	TokenNameclass	
DailyFileAppender	TokenNameIdentifier	 Daily File Appender
extends	TokenNameextends	
FileAppender	TokenNameIdentifier	 File Appender
{	TokenNameLBRACE	
/** A string constant used in naming the option for setting the filename pattern. Current value of this string constant is <strong>FileNamePattern</strong>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the filename pattern. Current value of this string constant is <strong>FileNamePattern</strong>. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
FILE_NAME_PATTERN_OPTION	TokenNameIdentifier	 FILE  NAME  PATTERN  OPTION
=	TokenNameEQUAL	
"FilePattern"	TokenNameStringLiteral	FilePattern
;	TokenNameSEMICOLON	
/** The filename pattern */	TokenNameCOMMENT_JAVADOC	 The filename pattern 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fileNamePattern	TokenNameIdentifier	 file Name Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The actual formatted filename that is currently being written to */	TokenNameCOMMENT_JAVADOC	 The actual formatted filename that is currently being written to 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
currentFileName	TokenNameIdentifier	 current File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The timestamp when we shall next recompute the filename */	TokenNameCOMMENT_JAVADOC	 The timestamp when we shall next recompute the filename 
private	TokenNameprivate	
long	TokenNamelong	
nextFilenameComputingMillis	TokenNameIdentifier	 next Filename Computing Millis
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default constructor does no longer set a default layout nor a default output target. */	TokenNameCOMMENT_JAVADOC	 The default constructor does no longer set a default layout nor a default output target. 
public	TokenNamepublic	
DailyFileAppender	TokenNameIdentifier	 Daily File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Instantiate a RollingFileAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. */	TokenNameCOMMENT_JAVADOC	 Instantiate a RollingFileAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. 
public	TokenNamepublic	
DailyFileAppender	TokenNameIdentifier	 Daily File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. */	TokenNameCOMMENT_JAVADOC	 Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. 
public	TokenNamepublic	
DailyFileAppender	TokenNameIdentifier	 Daily File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the current output file. The function will compute a new filename, and open a new file only when the name has changed. The function is automatically called once a day, to allow for daily files -- the purpose of this class. */	TokenNameCOMMENT_JAVADOC	 Set the current output file. The function will compute a new filename, and open a new file only when the name has changed. The function is automatically called once a day, to allow for daily files -- the purpose of this class. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* Compute filename, but only if fileNamePattern is specified */	TokenNameCOMMENT_BLOCK	 Compute filename, but only if fileNamePattern is specified 
if	TokenNameif	
(	TokenNameLPAREN	
fileNamePattern	TokenNameIdentifier	 file Name Pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Missing file pattern ("	TokenNameStringLiteral	Missing file pattern (
+	TokenNamePLUS	
FILE_NAME_PATTERN_OPTION	TokenNameIdentifier	 FILE  NAME  PATTERN  OPTION
+	TokenNamePLUS	
") in setFile()."	TokenNameStringLiteral	) in setFile().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Date	TokenNameIdentifier	 Date
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
fileNamePattern	TokenNameIdentifier	 file Name Pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
currentFileName	TokenNameIdentifier	 current File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* Set up next filename checkpoint */	TokenNameCOMMENT_BLOCK	 Set up next filename checkpoint 
DailyFileAppenderCalendar	TokenNameIdentifier	 Daily File Appender Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
DailyFileAppenderCalendar	TokenNameIdentifier	 Daily File Appender Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
rollToNextDay	TokenNameIdentifier	 roll To Next Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextFilenameComputingMillis	TokenNameIdentifier	 next Filename Computing Millis
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentFileName	TokenNameIdentifier	 current File Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method differentiates RollingFileAppender from its super class. */	TokenNameCOMMENT_JAVADOC	 This method differentiates RollingFileAppender from its super class. 
protected	TokenNameprotected	
void	TokenNamevoid	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
nextFilenameComputingMillis	TokenNameIdentifier	 next Filename Computing Millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
super	TokenNamesuper	
.	TokenNameDOT	
fileAppend	TokenNameIdentifier	 file Append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"setFile(null, false) call failed."	TokenNameStringLiteral	setFile(null, false) call failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retuns the option names for this component, namely {@link #FILE_NAME_PATTERN_OPTION} in addition to the options of {@link FileAppender#getOptionStrings FileAppender}. */	TokenNameCOMMENT_JAVADOC	 Retuns the option names for this component, namely {@link #FILE_NAME_PATTERN_OPTION} in addition to the options of {@link FileAppender#getOptionStrings FileAppender}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
concatanateArrays	TokenNameIdentifier	 concatanate Arrays
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FILE_NAME_PATTERN_OPTION	TokenNameIdentifier	 FILE  NAME  PATTERN  OPTION
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the options for the appender */	TokenNameCOMMENT_JAVADOC	 Set the options for the appender 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
FILE_NAME_PATTERN_OPTION	TokenNameIdentifier	 FILE  NAME  PATTERN  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileNamePattern	TokenNameIdentifier	 file Name Pattern
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** If the a value for {@link #FILE_OPTION} is non-null, then {@link #setFile} is called with the values of {@link #FILE_OPTION} and {@link #APPEND_OPTION}. @since 0.8.1 */	TokenNameCOMMENT_JAVADOC	 If the a value for {@link #FILE_OPTION} is non-null, then {@link #setFile} is called with the values of {@link #FILE_OPTION} and {@link #APPEND_OPTION}. @since 0.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
super	TokenNamesuper	
.	TokenNameDOT	
fileAppend	TokenNameIdentifier	 file Append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile(null,"	TokenNameStringLiteral	setFile(null,
+	TokenNamePLUS	
fileAppend	TokenNameIdentifier	 file Append
+	TokenNamePLUS	
") call failed."	TokenNameStringLiteral	) call failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
FILE_OPEN_FAILURE	TokenNameIdentifier	 FILE  OPEN  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** DailyFileAppenderCalendar is a helper class to DailyFileAppender. Using this class, it is easy to compute and access the next Millis() It subclasses the standard <a href="http://java.sun.com/j2se/1.3/docs/api/java/text/GregorianCalendar.html"> java.util.GregorianCalendar</a>-object, to allow access to the protected function getTimeInMillis(), which it then exports. @author <a HREF="mailto:eirik.lygre@evita.no">Eirik Lygre</a> */	TokenNameCOMMENT_JAVADOC	 DailyFileAppenderCalendar is a helper class to DailyFileAppender. Using this class, it is easy to compute and access the next Millis() It subclasses the standard <a href="http://java.sun.com/j2se/1.3/docs/api/java/text/GregorianCalendar.html"> java.util.GregorianCalendar</a>-object, to allow access to the protected function getTimeInMillis(), which it then exports. @author <a HREF="mailto:eirik.lygre@evita.no">Eirik Lygre</a> 
class	TokenNameclass	
DailyFileAppenderCalendar	TokenNameIdentifier	 Daily File Appender Calendar
extends	TokenNameextends	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
{	TokenNameLBRACE	
/** Returns the current time in Millis */	TokenNameCOMMENT_JAVADOC	 Returns the current time in Millis 
public	TokenNamepublic	
long	TokenNamelong	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Roll the date to the next hour, with minute, second and millisecond set to zero. */	TokenNameCOMMENT_JAVADOC	 Roll the date to the next hour, with minute, second and millisecond set to zero. 
public	TokenNamepublic	
void	TokenNamevoid	
rollToNextDay	TokenNameIdentifier	 roll To Next Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
