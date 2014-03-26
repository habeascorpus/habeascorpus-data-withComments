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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
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
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
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
Locale	TokenNameIdentifier	 Locale
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
LogLog	TokenNameIdentifier	 Log Log
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
/** DailyRollingFileAppender extends {@link FileAppender} so that the underlying file is rolled over at a user chosen frequency. DailyRollingFileAppender has been observed to exhibit synchronization issues and data loss. The log4j extras companion includes alternatives which should be considered for new deployments and which are discussed in the documentation for org.apache.log4j.rolling.RollingFileAppender. <p>The rolling schedule is specified by the <b>DatePattern</b> option. This pattern should follow the {@link SimpleDateFormat} conventions. In particular, you <em>must</em> escape literal text within a pair of single quotes. A formatted version of the date pattern is used as the suffix for the rolled file name. <p>For example, if the <b>File</b> option is set to <code>/foo/bar.log</code> and the <b>DatePattern</b> set to <code>'.'yyyy-MM-dd</code>, on 2001-02-16 at midnight, the logging file <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2001-02-16</code> and logging for 2001-02-17 will continue in <code>/foo/bar.log</code> until it rolls over the next day. <p>Is is possible to specify monthly, weekly, half-daily, daily, hourly, or minutely rollover schedules. <p><table border="1" cellpadding="2"> <tr> <th>DatePattern</th> <th>Rollover schedule</th> <th>Example</th> <tr> <td><code>'.'yyyy-MM</code> <td>Rollover at the beginning of each month</td> <td>At midnight of May 31st, 2002 <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-05</code>. Logging for the month of June will be output to <code>/foo/bar.log</code> until it is also rolled over the next month. <tr> <td><code>'.'yyyy-ww</code> <td>Rollover at the first day of each week. The first day of the week depends on the locale.</td> <td>Assuming the first day of the week is Sunday, on Saturday midnight, June 9th 2002, the file <i>/foo/bar.log</i> will be copied to <i>/foo/bar.log.2002-23</i>. Logging for the 24th week of 2002 will be output to <code>/foo/bar.log</code> until it is rolled over the next week. <tr> <td><code>'.'yyyy-MM-dd</code> <td>Rollover at midnight each day.</td> <td>At midnight, on March 8th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-08</code>. Logging for the 9th day of March will be output to <code>/foo/bar.log</code> until it is rolled over the next day. <tr> <td><code>'.'yyyy-MM-dd-a</code> <td>Rollover at midnight and midday of each day.</td> <td>At noon, on March 9th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-09-AM</code>. Logging for the afternoon of the 9th will be output to <code>/foo/bar.log</code> until it is rolled over at midnight. <tr> <td><code>'.'yyyy-MM-dd-HH</code> <td>Rollover at the top of every hour.</td> <td>At approximately 11:00.000 o'clock on March 9th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-09-10</code>. Logging for the 11th hour of the 9th of March will be output to <code>/foo/bar.log</code> until it is rolled over at the beginning of the next hour. <tr> <td><code>'.'yyyy-MM-dd-HH-mm</code> <td>Rollover at the beginning of every minute.</td> <td>At approximately 11:23,000, on March 9th, 2001, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2001-03-09-10-22</code>. Logging for the minute of 11:23 (9th of March) will be output to <code>/foo/bar.log</code> until it is rolled over the next minute. </table> <p>Do not use the colon ":" character in anywhere in the <b>DatePattern</b> option. The text before the colon is interpeted as the protocol specificaion of a URL which is probably not what you want. @author Eirik Lygre @author Ceki G&uuml;lc&uuml;*/	TokenNameCOMMENT_JAVADOC	 DailyRollingFileAppender extends {@link FileAppender} so that the underlying file is rolled over at a user chosen frequency. DailyRollingFileAppender has been observed to exhibit synchronization issues and data loss. The log4j extras companion includes alternatives which should be considered for new deployments and which are discussed in the documentation for org.apache.log4j.rolling.RollingFileAppender. <p>The rolling schedule is specified by the <b>DatePattern</b> option. This pattern should follow the {@link SimpleDateFormat} conventions. In particular, you <em>must</em> escape literal text within a pair of single quotes. A formatted version of the date pattern is used as the suffix for the rolled file name. <p>For example, if the <b>File</b> option is set to <code>/foo/bar.log</code> and the <b>DatePattern</b> set to <code>'.'yyyy-MM-dd</code>, on 2001-02-16 at midnight, the logging file <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2001-02-16</code> and logging for 2001-02-17 will continue in <code>/foo/bar.log</code> until it rolls over the next day. <p>Is is possible to specify monthly, weekly, half-daily, daily, hourly, or minutely rollover schedules. <p><table border="1" cellpadding="2"> <tr> <th>DatePattern</th> <th>Rollover schedule</th> <th>Example</th> <tr> <td><code>'.'yyyy-MM</code> <td>Rollover at the beginning of each month</td> <td>At midnight of May 31st, 2002 <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-05</code>. Logging for the month of June will be output to <code>/foo/bar.log</code> until it is also rolled over the next month. <tr> <td><code>'.'yyyy-ww</code> <td>Rollover at the first day of each week. The first day of the week depends on the locale.</td> <td>Assuming the first day of the week is Sunday, on Saturday midnight, June 9th 2002, the file <i>/foo/bar.log</i> will be copied to <i>/foo/bar.log.2002-23</i>. Logging for the 24th week of 2002 will be output to <code>/foo/bar.log</code> until it is rolled over the next week. <tr> <td><code>'.'yyyy-MM-dd</code> <td>Rollover at midnight each day.</td> <td>At midnight, on March 8th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-08</code>. Logging for the 9th day of March will be output to <code>/foo/bar.log</code> until it is rolled over the next day. <tr> <td><code>'.'yyyy-MM-dd-a</code> <td>Rollover at midnight and midday of each day.</td> <td>At noon, on March 9th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-09-AM</code>. Logging for the afternoon of the 9th will be output to <code>/foo/bar.log</code> until it is rolled over at midnight. <tr> <td><code>'.'yyyy-MM-dd-HH</code> <td>Rollover at the top of every hour.</td> <td>At approximately 11:00.000 o'clock on March 9th, 2002, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2002-03-09-10</code>. Logging for the 11th hour of the 9th of March will be output to <code>/foo/bar.log</code> until it is rolled over at the beginning of the next hour. <tr> <td><code>'.'yyyy-MM-dd-HH-mm</code> <td>Rollover at the beginning of every minute.</td> <td>At approximately 11:23,000, on March 9th, 2001, <code>/foo/bar.log</code> will be copied to <code>/foo/bar.log.2001-03-09-10-22</code>. Logging for the minute of 11:23 (9th of March) will be output to <code>/foo/bar.log</code> until it is rolled over the next minute. </table> <p>Do not use the colon ":" character in anywhere in the <b>DatePattern</b> option. The text before the colon is interpeted as the protocol specificaion of a URL which is probably not what you want. @author Eirik Lygre @author Ceki G&uuml;lc&uuml;
public	TokenNamepublic	
class	TokenNameclass	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
extends	TokenNameextends	
FileAppender	TokenNameIdentifier	 File Appender
{	TokenNameLBRACE	
// The code assumes that the following constants are in a increasing 	TokenNameCOMMENT_LINE	The code assumes that the following constants are in a increasing 
// sequence. 	TokenNameCOMMENT_LINE	sequence. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_TROUBLE	TokenNameIdentifier	 TOP  OF  TROUBLE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HALF_DAY	TokenNameIdentifier	 HALF  DAY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_DAY	TokenNameIdentifier	 TOP  OF  DAY
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_WEEK	TokenNameIdentifier	 TOP  OF  WEEK
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TOP_OF_MONTH	TokenNameIdentifier	 TOP  OF  MONTH
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The date pattern. By default, the pattern is set to "'.'yyyy-MM-dd" meaning daily rollover. */	TokenNameCOMMENT_JAVADOC	 The date pattern. By default, the pattern is set to "'.'yyyy-MM-dd" meaning daily rollover. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
datePattern	TokenNameIdentifier	 date Pattern
=	TokenNameEQUAL	
"'.'yyyy-MM-dd"	TokenNameStringLiteral	'.'yyyy-MM-dd
;	TokenNameSEMICOLON	
/** The log file will be renamed to the value of the scheduledFilename variable when the next interval is entered. For example, if the rollover period is one hour, the log file will be renamed to the value of "scheduledFilename" at the beginning of the next hour. The precise time when a rollover occurs depends on logging activity. */	TokenNameCOMMENT_JAVADOC	 The log file will be renamed to the value of the scheduledFilename variable when the next interval is entered. For example, if the rollover period is one hour, the log file will be renamed to the value of "scheduledFilename" at the beginning of the next hour. The precise time when a rollover occurs depends on logging activity. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
scheduledFilename	TokenNameIdentifier	 scheduled Filename
;	TokenNameSEMICOLON	
/** The next time we estimate a rollover should occur. */	TokenNameCOMMENT_JAVADOC	 The next time we estimate a rollover should occur. 
private	TokenNameprivate	
long	TokenNamelong	
nextCheck	TokenNameIdentifier	 next Check
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
;	TokenNameSEMICOLON	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
checkPeriod	TokenNameIdentifier	 check Period
=	TokenNameEQUAL	
TOP_OF_TROUBLE	TokenNameIdentifier	 TOP  OF  TROUBLE
;	TokenNameSEMICOLON	
// The gmtTimeZone is used only in computeCheckPeriod() method. 	TokenNameCOMMENT_LINE	The gmtTimeZone is used only in computeCheckPeriod() method. 
static	TokenNamestatic	
final	TokenNamefinal	
TimeZone	TokenNameIdentifier	 Time Zone
gmtTimeZone	TokenNameIdentifier	 gmt Time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The default constructor does nothing. */	TokenNameCOMMENT_JAVADOC	 The default constructor does nothing. 
public	TokenNamepublic	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Instantiate a <code>DailyRollingFileAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. */	TokenNameCOMMENT_JAVADOC	 Instantiate a <code>DailyRollingFileAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. 
public	TokenNamepublic	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
datePattern	TokenNameIdentifier	 date Pattern
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
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
datePattern	TokenNameIdentifier	 date Pattern
=	TokenNameEQUAL	
datePattern	TokenNameIdentifier	 date Pattern
;	TokenNameSEMICOLON	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>DatePattern</b> takes a string in the same format as expected by {@link SimpleDateFormat}. This options determines the rollover schedule. */	TokenNameCOMMENT_JAVADOC	 The <b>DatePattern</b> takes a string in the same format as expected by {@link SimpleDateFormat}. This options determines the rollover schedule. 
public	TokenNamepublic	
void	TokenNamevoid	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
datePattern	TokenNameIdentifier	 date Pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>DatePattern</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>DatePattern</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatePattern	TokenNameIdentifier	 get Date Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
datePattern	TokenNameIdentifier	 date Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printPeriodicity	TokenNameIdentifier	 print Periodicity
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Either File or DatePattern options are not set for appender ["	TokenNameStringLiteral	Either File or DatePattern options are not set for appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
printPeriodicity	TokenNameIdentifier	 print Periodicity
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled every minute."	TokenNameStringLiteral	] to be rolled every minute.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled on top of every hour."	TokenNameStringLiteral	] to be rolled on top of every hour.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
HALF_DAY	TokenNameIdentifier	 HALF  DAY
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled at midday and midnight."	TokenNameStringLiteral	] to be rolled at midday and midnight.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOP_OF_DAY	TokenNameIdentifier	 TOP  OF  DAY
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled at midnight."	TokenNameStringLiteral	] to be rolled at midnight.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOP_OF_WEEK	TokenNameIdentifier	 TOP  OF  WEEK
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled at start of week."	TokenNameStringLiteral	] to be rolled at start of week.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOP_OF_MONTH	TokenNameIdentifier	 TOP  OF  MONTH
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Appender ["	TokenNameStringLiteral	Appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to be rolled at start of every month."	TokenNameStringLiteral	] to be rolled at start of every month.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unknown periodicity for appender ["	TokenNameStringLiteral	Unknown periodicity for appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This method computes the roll over period by looping over the 	TokenNameCOMMENT_LINE	This method computes the roll over period by looping over the 
// periods, starting with the shortest, and stopping when the r0 is 	TokenNameCOMMENT_LINE	periods, starting with the shortest, and stopping when the r0 is 
// different from from r1, where r0 is the epoch formatted according 	TokenNameCOMMENT_LINE	different from from r1, where r0 is the epoch formatted according 
// the datePattern (supplied by the user) and r1 is the 	TokenNameCOMMENT_LINE	the datePattern (supplied by the user) and r1 is the 
// epoch+nextMillis(i) formatted according to datePattern. All date 	TokenNameCOMMENT_LINE	epoch+nextMillis(i) formatted according to datePattern. All date 
// formatting is done in GMT and not local format because the test 	TokenNameCOMMENT_LINE	formatting is done in GMT and not local format because the test 
// logic is based on comparisons relative to 1970-01-01 00:00:00 	TokenNameCOMMENT_LINE	logic is based on comparisons relative to 1970-01-01 00:00:00 
// GMT (the epoch). 	TokenNameCOMMENT_LINE	GMT (the epoch). 
int	TokenNameint	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rollingCalendar	TokenNameIdentifier	 rolling Calendar
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
gmtTimeZone	TokenNameIdentifier	 gmt Time Zone
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set sate to 1970-01-01 00:00:00 GMT 	TokenNameCOMMENT_LINE	set sate to 1970-01-01 00:00:00 GMT 
Date	TokenNameIdentifier	 Date
epoch	TokenNameIdentifier	 epoch
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
TOP_OF_MONTH	TokenNameIdentifier	 TOP  OF  MONTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
simpleDateFormat	TokenNameIdentifier	 simple Date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleDateFormat	TokenNameIdentifier	 simple Date Format
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
gmtTimeZone	TokenNameIdentifier	 gmt Time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do all date formatting in GMT 	TokenNameCOMMENT_LINE	do all date formatting in GMT 
String	TokenNameIdentifier	 String
r0	TokenNameIdentifier	 r0
=	TokenNameEQUAL	
simpleDateFormat	TokenNameIdentifier	 simple Date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
epoch	TokenNameIdentifier	 epoch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rollingCalendar	TokenNameIdentifier	 rolling Calendar
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
rollingCalendar	TokenNameIdentifier	 rolling Calendar
.	TokenNameDOT	
getNextCheckMillis	TokenNameIdentifier	 get Next Check Millis
(	TokenNameLPAREN	
epoch	TokenNameIdentifier	 epoch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
simpleDateFormat	TokenNameIdentifier	 simple Date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Type = "+i+", r0 = "+r0+", r1 = "+r1); 	TokenNameCOMMENT_LINE	System.out.println("Type = "+i+", r0 = "+r0+", r1 = "+r1); 
if	TokenNameif	
(	TokenNameLPAREN	
r0	TokenNameIdentifier	 r0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
r1	TokenNameIdentifier	 r1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
r0	TokenNameIdentifier	 r0
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
TOP_OF_TROUBLE	TokenNameIdentifier	 TOP  OF  TROUBLE
;	TokenNameSEMICOLON	
// Deliberately head for trouble... 	TokenNameCOMMENT_LINE	Deliberately head for trouble... 
}	TokenNameRBRACE	
/** Rollover the current file to a new file. */	TokenNameCOMMENT_JAVADOC	 Rollover the current file to a new file. 
void	TokenNamevoid	
rollOver	TokenNameIdentifier	 roll Over
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* Compute filename, but only if datePattern is specified */	TokenNameCOMMENT_BLOCK	 Compute filename, but only if datePattern is specified 
if	TokenNameif	
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Missing DatePattern option in rollOver()."	TokenNameStringLiteral	Missing DatePattern option in rollOver().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
datedFilename	TokenNameIdentifier	 dated Filename
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It is too early to roll over because we are still within the 	TokenNameCOMMENT_LINE	It is too early to roll over because we are still within the 
// bounds of the current interval. Rollover will occur once the 	TokenNameCOMMENT_LINE	bounds of the current interval. Rollover will occur once the 
// next interval is reached. 	TokenNameCOMMENT_LINE	next interval is reached. 
if	TokenNameif	
(	TokenNameLPAREN	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
datedFilename	TokenNameIdentifier	 dated Filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close current file, and rename it to datedFilename 	TokenNameCOMMENT_LINE	close current file, and rename it to datedFilename 
this	TokenNamethis	
.	TokenNameDOT	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Failed to rename ["	TokenNameStringLiteral	Failed to rename [
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"] to ["	TokenNameStringLiteral	] to [
+	TokenNamePLUS	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// This will also close the file. This is OK since multiple 	TokenNameCOMMENT_LINE	This will also close the file. This is OK since multiple 
// close operations are safe. 	TokenNameCOMMENT_LINE	close operations are safe. 
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile("	TokenNameStringLiteral	setFile(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
", true) call failed."	TokenNameStringLiteral	, true) call failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
datedFilename	TokenNameIdentifier	 dated Filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method differentiates DailyRollingFileAppender from its * super class. * * <p>Before actually logging, this method will check whether it is * time to do a rollover. If it is, it will schedule the next * rollover time and then rollover. * */	TokenNameCOMMENT_JAVADOC	 This method differentiates DailyRollingFileAppender from its super class. * <p>Before actually logging, this method will check whether it is time to do a rollover. If it is, it will schedule the next rollover time and then rollover. 
protected	TokenNameprotected	
void	TokenNamevoid	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
nextCheck	TokenNameIdentifier	 next Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextCheck	TokenNameIdentifier	 next Check
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getNextCheckMillis	TokenNameIdentifier	 get Next Check Millis
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
rollOver	TokenNameIdentifier	 roll Over
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"rollOver() failed."	TokenNameStringLiteral	rollOver() failed.
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
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
}	TokenNameRBRACE	
/** * RollingCalendar is a helper class to DailyRollingFileAppender. * Given a periodicity type and the current time, it computes the * start of the next interval. * */	TokenNameCOMMENT_JAVADOC	 RollingCalendar is a helper class to DailyRollingFileAppender. Given a periodicity type and the current time, it computes the start of the next interval. 
class	TokenNameclass	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
extends	TokenNameextends	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3560331770601814177L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_TROUBLE	TokenNameIdentifier	 TOP  OF  TROUBLE
;	TokenNameSEMICOLON	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
tz	TokenNameIdentifier	 tz
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
tz	TokenNameIdentifier	 tz
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getNextCheckMillis	TokenNameIdentifier	 get Next Check Millis
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextCheckDate	TokenNameIdentifier	 get Next Check Date
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
getNextCheckDate	TokenNameIdentifier	 get Next Check Date
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
HALF_DAY	TokenNameIdentifier	 HALF  DAY
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_DAY	TokenNameIdentifier	 TOP  OF  DAY
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_WEEK	TokenNameIdentifier	 TOP  OF  WEEK
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_WEEK	TokenNameIdentifier	 DAY  OF  WEEK
,	TokenNameCOMMA	
getFirstDayOfWeek	TokenNameIdentifier	 get First Day Of Week
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
WEEK_OF_YEAR	TokenNameIdentifier	 WEEK  OF  YEAR
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_MONTH	TokenNameIdentifier	 TOP  OF  MONTH
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
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
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unknown periodicity type."	TokenNameStringLiteral	Unknown periodicity type.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
