package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
FilenameFilter	TokenNameIdentifier	 Filename Filter
;	TokenNameSEMICOLON	
/** * <p>CompositeRollingAppender combines RollingFileAppender and DailyRollingFileAppender<br> * It can function as either or do both at the same time (making size * based rolling files like RollingFileAppender until a data/time boundary * is crossed at which time it rolls all of those files as per the DailyRollingFileAppender) * based on the setting for <code>rollingStyle</code>.<br> * <br> * To use CompositeRollingAppender to roll log files as they reach a certain * size (like RollingFileAppender), set rollingStyle=1 (@see config.size)<br> * To use CompositeRollingAppender to roll log files at certain time intervals * (daily for example), set rollingStyle=2 and a datePattern (@see config.time)<br> * To have CompositeRollingAppender roll log files at a certain size AND rename those * according to time intervals, set rollingStyle=3 (@see config.composite)<br> * * <p>A of few additional optional features have been added:<br> * -- Attach date pattern for current log file (@see staticLogFileName)<br> * -- Backup number increments for newer files (@see countDirection)<br> * -- Infinite number of backups by file size (@see maxSizeRollBackups)<br> * <br> * <p>A few notes and warnings: For large or infinite number of backups * countDirection > 0 is highly recommended, with staticLogFileName = false if * time based rolling is also used -- this will reduce the number of file renamings * to few or none. Changing staticLogFileName or countDirection without clearing * the directory could have nasty side effects. If Date/Time based rolling * is enabled, CompositeRollingAppender will attempt to roll existing files * in the directory without a date/time tag based on the last modified date * of the base log files last modification.<br> * <br> * <p>A maximum number of backups based on date/time boundries would be nice * but is not yet implemented.<br> * * @author Kevin Steppe * @author Heinz Richter * @author Eirik Lygre * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 <p>CompositeRollingAppender combines RollingFileAppender and DailyRollingFileAppender<br> It can function as either or do both at the same time (making size based rolling files like RollingFileAppender until a data/time boundary is crossed at which time it rolls all of those files as per the DailyRollingFileAppender) based on the setting for <code>rollingStyle</code>.<br> <br> To use CompositeRollingAppender to roll log files as they reach a certain size (like RollingFileAppender), set rollingStyle=1 (@see config.size)<br> To use CompositeRollingAppender to roll log files at certain time intervals (daily for example), set rollingStyle=2 and a datePattern (@see config.time)<br> To have CompositeRollingAppender roll log files at a certain size AND rename those according to time intervals, set rollingStyle=3 (@see config.composite)<br> * <p>A of few additional optional features have been added:<br> -- Attach date pattern for current log file (@see staticLogFileName)<br> -- Backup number increments for newer files (@see countDirection)<br> -- Infinite number of backups by file size (@see maxSizeRollBackups)<br> <br> <p>A few notes and warnings: For large or infinite number of backups countDirection > 0 is highly recommended, with staticLogFileName = false if time based rolling is also used -- this will reduce the number of file renamings to few or none. Changing staticLogFileName or countDirection without clearing the directory could have nasty side effects. If Date/Time based rolling is enabled, CompositeRollingAppender will attempt to roll existing files in the directory without a date/time tag based on the last modified date of the base log files last modification.<br> <br> <p>A maximum number of backups based on date/time boundries would be nice but is not yet implemented.<br> * @author Kevin Steppe @author Heinz Richter @author Eirik Lygre @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
FileAppender	TokenNameIdentifier	 File Appender
{	TokenNameLBRACE	
// The code assumes that the following 'time' constants are in a increasing 	TokenNameCOMMENT_LINE	The code assumes that the following 'time' constants are in a increasing 
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
/** Style of rolling to use */	TokenNameCOMMENT_JAVADOC	 Style of rolling to use 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BY_SIZE	TokenNameIdentifier	 BY  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BY_DATE	TokenNameIdentifier	 BY  DATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BY_COMPOSITE	TokenNameIdentifier	 BY  COMPOSITE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//Not currently used 	TokenNameCOMMENT_LINE	Not currently used 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_BY_SIZE	TokenNameIdentifier	 S  BY  SIZE
=	TokenNameEQUAL	
"Size"	TokenNameStringLiteral	Size
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_BY_DATE	TokenNameIdentifier	 S  BY  DATE
=	TokenNameEQUAL	
"Date"	TokenNameStringLiteral	Date
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_BY_COMPOSITE	TokenNameIdentifier	 S  BY  COMPOSITE
=	TokenNameEQUAL	
"Composite"	TokenNameStringLiteral	Composite
;	TokenNameSEMICOLON	
/** The date pattern. By default, the pattern is set to "'.'yyyy-MM-dd" meaning daily rollover. */	TokenNameCOMMENT_JAVADOC	 The date pattern. By default, the pattern is set to "'.'yyyy-MM-dd" meaning daily rollover. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
datePattern	TokenNameIdentifier	 date Pattern
=	TokenNameEQUAL	
"'.'yyyy-MM-dd"	TokenNameStringLiteral	'.'yyyy-MM-dd
;	TokenNameSEMICOLON	
/** The actual formatted filename that is currently being written to or will be the file transferred to on roll over (based on staticLogFileName). */	TokenNameCOMMENT_JAVADOC	 The actual formatted filename that is currently being written to or will be the file transferred to on roll over (based on staticLogFileName). 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The timestamp when we shall next recompute the filename. */	TokenNameCOMMENT_JAVADOC	 The timestamp when we shall next recompute the filename. 
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
/** Holds date of last roll over */	TokenNameCOMMENT_JAVADOC	 Holds date of last roll over 
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
/** Helper class to determine next rollover time */	TokenNameCOMMENT_JAVADOC	 Helper class to determine next rollover time 
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Current period for roll overs */	TokenNameCOMMENT_JAVADOC	 Current period for roll overs 
int	TokenNameint	
checkPeriod	TokenNameIdentifier	 check Period
=	TokenNameEQUAL	
TOP_OF_TROUBLE	TokenNameIdentifier	 TOP  OF  TROUBLE
;	TokenNameSEMICOLON	
/** The default maximum file size is 10MB. */	TokenNameCOMMENT_JAVADOC	 The default maximum file size is 10MB. 
protected	TokenNameprotected	
long	TokenNamelong	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** There is zero backup files by default. */	TokenNameCOMMENT_JAVADOC	 There is zero backup files by default. 
protected	TokenNameprotected	
int	TokenNameint	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** How many sized based backups have been made so far */	TokenNameCOMMENT_JAVADOC	 How many sized based backups have been made so far 
protected	TokenNameprotected	
int	TokenNameint	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** not yet implemented */	TokenNameCOMMENT_JAVADOC	 not yet implemented 
protected	TokenNameprotected	
int	TokenNameint	
maxTimeRollBackups	TokenNameIdentifier	 max Time Roll Backups
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
curTimeRollBackups	TokenNameIdentifier	 cur Time Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** By default newer files have lower numbers. (countDirection < 0) * ie. log.1 is most recent, log.5 is the 5th backup, etc... * countDirection > 0 does the opposite ie. * log.1 is the first backup made, log.5 is the 5th backup made, etc. * For infinite backups use countDirection > 0 to reduce rollOver costs. */	TokenNameCOMMENT_JAVADOC	 By default newer files have lower numbers. (countDirection < 0) ie. log.1 is most recent, log.5 is the 5th backup, etc... countDirection > 0 does the opposite ie. log.1 is the first backup made, log.5 is the 5th backup made, etc. For infinite backups use countDirection > 0 to reduce rollOver costs. 
protected	TokenNameprotected	
int	TokenNameint	
countDirection	TokenNameIdentifier	 count Direction
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Style of rolling to Use. BY_SIZE (1), BY_DATE(2), BY COMPOSITE(3) */	TokenNameCOMMENT_JAVADOC	 Style of rolling to Use. BY_SIZE (1), BY_DATE(2), BY COMPOSITE(3) 
protected	TokenNameprotected	
int	TokenNameint	
rollingStyle	TokenNameIdentifier	 rolling Style
=	TokenNameEQUAL	
BY_COMPOSITE	TokenNameIdentifier	 BY  COMPOSITE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
rollDate	TokenNameIdentifier	 roll Date
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
rollSize	TokenNameIdentifier	 roll Size
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** By default file.log is always the current file. Optionally * file.log.yyyy-mm-dd for current formated datePattern can by the currently * logging file (or file.log.curSizeRollBackup or even * file.log.yyyy-mm-dd.curSizeRollBackup) This will make time based roll * overs with a large number of backups much faster -- it won't have to * rename all the backups! */	TokenNameCOMMENT_JAVADOC	 By default file.log is always the current file. Optionally file.log.yyyy-mm-dd for current formated datePattern can by the currently logging file (or file.log.curSizeRollBackup or even file.log.yyyy-mm-dd.curSizeRollBackup) This will make time based roll overs with a large number of backups much faster -- it won't have to rename all the backups! 
protected	TokenNameprotected	
boolean	TokenNameboolean	
staticLogFileName	TokenNameIdentifier	 static Log File Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** FileName provided in configuration. Used for rolling properly */	TokenNameCOMMENT_JAVADOC	 FileName provided in configuration. Used for rolling properly 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
baseFileName	TokenNameIdentifier	 base File Name
;	TokenNameSEMICOLON	
/** The default constructor does nothing. */	TokenNameCOMMENT_JAVADOC	 The default constructor does nothing. 
public	TokenNamepublic	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Instantiate a <code>CompositeRollingAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. */	TokenNameCOMMENT_JAVADOC	 Instantiate a <code>CompositeRollingAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. 
public	TokenNamepublic	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
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
this	TokenNamethis	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
datePattern	TokenNameIdentifier	 date Pattern
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. */	TokenNameCOMMENT_JAVADOC	 Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. 
public	TokenNamepublic	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
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
/** Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. */	TokenNameCOMMENT_JAVADOC	 Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. 
public	TokenNamepublic	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
datePattern	TokenNameIdentifier	 date Pattern
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
/** Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. DatePattern is default. */	TokenNameCOMMENT_JAVADOC	 Instantiate a CompositeRollingAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. DatePattern is default. 
public	TokenNamepublic	
CompositeRollingAppender	TokenNameIdentifier	 Composite Rolling Appender
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
/** Returns the value of the <b>maxSizeRollBackups</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>maxSizeRollBackups</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getMaxSizeRollBackups	TokenNameIdentifier	 get Max Size Roll Backups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the maximum size that the output file is allowed to reach before being rolled over to backup files. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get the maximum size that the output file is allowed to reach before being rolled over to backup files. @since 1.1 
public	TokenNamepublic	
long	TokenNamelong	
getMaximumFileSize	TokenNameIdentifier	 get Maximum File Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Set the maximum number of backup files to keep around based on file size. <p>The <b>MaxSizeRollBackups</b> option determines how many backup files are kept before the oldest is erased. This option takes an integer value. If set to zero, then there will be no backup files and the log file will be truncated when it reaches <code>MaxFileSize</code>. If a negative number is supplied then no deletions will be made. Note that this could result in very slow performance as a large number of files are rolled over unless {@link #setCountDirection} up is used. <p>The maximum applys to -each- time based group of files and -not- the total. Using a daily roll the maximum total files would be (#days run) * (maxSizeRollBackups) */	TokenNameCOMMENT_JAVADOC	 <p>Set the maximum number of backup files to keep around based on file size. <p>The <b>MaxSizeRollBackups</b> option determines how many backup files are kept before the oldest is erased. This option takes an integer value. If set to zero, then there will be no backup files and the log file will be truncated when it reaches <code>MaxFileSize</code>. If a negative number is supplied then no deletions will be made. Note that this could result in very slow performance as a large number of files are rolled over unless {@link #setCountDirection} up is used. <p>The maximum applys to -each- time based group of files and -not- the total. Using a daily roll the maximum total files would be (#days run) (maxSizeRollBackups) 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSizeRollBackups	TokenNameIdentifier	 set Max Size Roll Backups
(	TokenNameLPAREN	
int	TokenNameint	
maxBackups	TokenNameIdentifier	 max Backups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
=	TokenNameEQUAL	
maxBackups	TokenNameIdentifier	 max Backups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) */	TokenNameCOMMENT_JAVADOC	 Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxFileSize	TokenNameIdentifier	 set Max File Size
(	TokenNameLPAREN	
long	TokenNamelong	
maxFileSize	TokenNameIdentifier	 max File Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) */	TokenNameCOMMENT_JAVADOC	 Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMaximumFileSize	TokenNameIdentifier	 set Maximum File Size
(	TokenNameLPAREN	
long	TokenNamelong	
maxFileSize	TokenNameIdentifier	 max File Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>In configuration files, the <b>MaxFileSize</b> option takes an long integer in the range 0 - 2^63. You can specify the value with the suffixes "KB", "MB" or "GB" so that the integer is interpreted being expressed respectively in kilobytes, megabytes or gigabytes. For example, the value "10KB" will be interpreted as 10240. */	TokenNameCOMMENT_JAVADOC	 Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>In configuration files, the <b>MaxFileSize</b> option takes an long integer in the range 0 - 2^63. You can specify the value with the suffixes "KB", "MB" or "GB" so that the integer is interpreted being expressed respectively in kilobytes, megabytes or gigabytes. For example, the value "10KB" will be interpreted as 10240. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxFileSize	TokenNameIdentifier	 set Max File Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toFileSize	TokenNameIdentifier	 to File Size
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
maxFileSize	TokenNameIdentifier	 max File Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setQWForFiles	TokenNameIdentifier	 set QW For Files
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
new	TokenNamenew	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Taken verbatum from DailyRollingFileAppender 	TokenNameCOMMENT_LINE	Taken verbatum from DailyRollingFileAppender 
int	TokenNameint	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
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
String	TokenNameIdentifier	 String
r0	TokenNameIdentifier	 r0
=	TokenNameEQUAL	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
epoch	TokenNameIdentifier	 epoch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
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
c	TokenNameIdentifier	 c
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
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("Type = "+i+", r0 = "+r0+", r1 = "+r1); 	TokenNameCOMMENT_LINE	LogLog.debug("Type = "+i+", r0 = "+r0+", r1 = "+r1); 
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
//Now for the new stuff 	TokenNameCOMMENT_LINE	Now for the new stuff 
/** * Handles append time behavior for CompositeRollingAppender. This checks * if a roll over either by date (checked first) or time (checked second) * is need and then appends to the file last. */	TokenNameCOMMENT_JAVADOC	 Handles append time behavior for CompositeRollingAppender. This checks if a roll over either by date (checked first) or time (checked second) is need and then appends to the file last. 
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
rollDate	TokenNameIdentifier	 roll Date
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
rollOverTime	TokenNameIdentifier	 roll Over Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rollSize	TokenNameIdentifier	 roll Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxFileSize	TokenNameIdentifier	 max File Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollOverSize	TokenNameIdentifier	 roll Over Size
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
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseFileName	TokenNameIdentifier	 base File Name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and opens the file for logging. If <code>staticLogFileName</code> * is false then the fully qualified name is determined and used. */	TokenNameCOMMENT_JAVADOC	 Creates and opens the file for logging. If <code>staticLogFileName</code> is false then the fully qualified name is determined and used. 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
staticLogFileName	TokenNameIdentifier	 static Log File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countDirection	TokenNameIdentifier	 count Direction
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
setCount	TokenNameIdentifier	 set Count
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCountDirection	TokenNameIdentifier	 get Count Direction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
countDirection	TokenNameIdentifier	 count Direction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCountDirection	TokenNameIdentifier	 set Count Direction
(	TokenNameLPAREN	
int	TokenNameint	
direction	TokenNameIdentifier	 direction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countDirection	TokenNameIdentifier	 count Direction
=	TokenNameEQUAL	
direction	TokenNameIdentifier	 direction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRollingStyle	TokenNameIdentifier	 get Rolling Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rollingStyle	TokenNameIdentifier	 rolling Style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRollingStyle	TokenNameIdentifier	 set Rolling Style
(	TokenNameLPAREN	
int	TokenNameint	
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollingStyle	TokenNameIdentifier	 rolling Style
=	TokenNameEQUAL	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rollingStyle	TokenNameIdentifier	 rolling Style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
BY_SIZE	TokenNameIdentifier	 BY  SIZE
:	TokenNameCOLON	
rollDate	TokenNameIdentifier	 roll Date
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
rollSize	TokenNameIdentifier	 roll Size
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BY_DATE	TokenNameIdentifier	 BY  DATE
:	TokenNameCOLON	
rollDate	TokenNameIdentifier	 roll Date
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
rollSize	TokenNameIdentifier	 roll Size
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BY_COMPOSITE	TokenNameIdentifier	 BY  COMPOSITE
:	TokenNameCOLON	
rollDate	TokenNameIdentifier	 roll Date
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
rollSize	TokenNameIdentifier	 roll Size
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Invalid rolling Style, use 1 (by size only), 2 (by date only) or 3 (both)"	TokenNameStringLiteral	Invalid rolling Style, use 1 (by size only), 2 (by date only) or 3 (both)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* public void setRollingStyle(String style) { if (style == S_BY_SIZE) { rollingStyle = BY_SIZE; } else if (style == S_BY_DATE) { rollingStyle = BY_DATE; } else if (style == S_BY_COMPOSITE) { rollingStyle = BY_COMPOSITE; } } */	TokenNameCOMMENT_BLOCK	 public void setRollingStyle(String style) { if (style == S_BY_SIZE) { rollingStyle = BY_SIZE; } else if (style == S_BY_DATE) { rollingStyle = BY_DATE; } else if (style == S_BY_COMPOSITE) { rollingStyle = BY_COMPOSITE; } } 
public	TokenNamepublic	
boolean	TokenNameboolean	
getStaticLogFileName	TokenNameIdentifier	 get Static Log File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
staticLogFileName	TokenNameIdentifier	 static Log File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStaticLogFileName	TokenNameIdentifier	 set Static Log File Name
(	TokenNameLPAREN	
boolean	TokenNameboolean	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
staticLogFileName	TokenNameIdentifier	 static Log File Name
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStaticLogFileName	TokenNameIdentifier	 set Static Log File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStaticLogFileName	TokenNameIdentifier	 set Static Log File Name
(	TokenNameLPAREN	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes based on exisiting conditions at time of <code> * activateOptions</code>. The following is done:<br> * <br> * A) determine curSizeRollBackups<br> * B) determine curTimeRollBackups (not implemented)<br> * C) initiates a roll over if needed for crossing a date boundary since * the last run. */	TokenNameCOMMENT_JAVADOC	 Initializes based on exisiting conditions at time of <code> activateOptions</code>. The following is done:<br> <br> A) determine curSizeRollBackups<br> B) determine curTimeRollBackups (not implemented)<br> C) initiates a roll over if needed for crossing a date boundary since the last run. 
protected	TokenNameprotected	
void	TokenNamevoid	
existingInit	TokenNameIdentifier	 existing Init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curTimeRollBackups	TokenNameIdentifier	 cur Time Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//part A starts here 	TokenNameCOMMENT_LINE	part A starts here 
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
staticLogFileName	TokenNameIdentifier	 static Log File Name
||	TokenNameOR_OR	
!	TokenNameNOT	
rollDate	TokenNameIdentifier	 roll Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
baseFileName	TokenNameIdentifier	 base File Name
+	TokenNamePLUS	
".*"	TokenNameStringLiteral	.*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
+	TokenNamePLUS	
".*"	TokenNameStringLiteral	.*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Searching for existing files in: "	TokenNameStringLiteral	Searching for existing files in: 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
staticLogFileName	TokenNameIdentifier	 static Log File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endLength	TokenNameIdentifier	 end Length
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
endLength	TokenNameIdentifier	 end Length
!=	TokenNameNOT_EQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//file is probably scheduledFilename + .x so I don't care 	TokenNameCOMMENT_LINE	file is probably scheduledFilename + .x so I don't care 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
backup	TokenNameIdentifier	 backup
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"From file: "	TokenNameStringLiteral	From file: 
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
backup	TokenNameIdentifier	 backup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
backup	TokenNameIdentifier	 backup
>	TokenNameGREATER	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
=	TokenNameEQUAL	
backup	TokenNameIdentifier	 backup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this happens when file.log -> file.log.yyyy-mm-dd which is normal 	TokenNameCOMMENT_LINE	this happens when file.log -> file.log.yyyy-mm-dd which is normal 
//when staticLogFileName == false 	TokenNameCOMMENT_LINE	when staticLogFileName == false 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Encountered a backup file not ending in .x "	TokenNameStringLiteral	Encountered a backup file not ending in .x 
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"curSizeRollBackups starts at: "	TokenNameStringLiteral	curSizeRollBackups starts at: 
+	TokenNamePLUS	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//part A ends here 	TokenNameCOMMENT_LINE	part A ends here 
//part B not yet implemented 	TokenNameCOMMENT_LINE	part B not yet implemented 
//part C 	TokenNameCOMMENT_LINE	part C 
if	TokenNameif	
(	TokenNameLPAREN	
staticLogFileName	TokenNameIdentifier	 static Log File Name
&&	TokenNameAND_AND	
rollDate	TokenNameIdentifier	 roll Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
=	TokenNameEQUAL	
baseFileName	TokenNameIdentifier	 base File Name
+	TokenNamePLUS	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Initial roll over to: "	TokenNameStringLiteral	Initial roll over to: 
+	TokenNamePLUS	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rollOverTime	TokenNameIdentifier	 roll Over Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"curSizeRollBackups after rollOver at: "	TokenNameStringLiteral	curSizeRollBackups after rollOver at: 
+	TokenNamePLUS	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//part C ends here 	TokenNameCOMMENT_LINE	part C ends here 
}	TokenNameRBRACE	
/** * Sets initial conditions including date/time roll over information, first check, * scheduledFilename, and calls <code>existingInit</code> to initialize * the current # of backups. */	TokenNameCOMMENT_JAVADOC	 Sets initial conditions including date/time roll over information, first check, scheduledFilename, and calls <code>existingInit</code> to initialize the current # of backups. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//REMOVE removed rollDate from boolean to enable Alex's change 	TokenNameCOMMENT_LINE	REMOVE removed rollDate from boolean to enable Alex's change 
if	TokenNameif	
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
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
//printPeriodicity(type); 	TokenNameCOMMENT_LINE	printPeriodicity(type); 
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//next line added as this removes the name check in rollOver 	TokenNameCOMMENT_LINE	next line added as this removes the name check in rollOver 
nextCheck	TokenNameIdentifier	 next Check
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getNextCheckMillis	TokenNameIdentifier	 get Next Check Millis
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rollDate	TokenNameIdentifier	 roll Date
)	TokenNameRPAREN	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Either DatePattern or rollingStyle options are not set for ["	TokenNameStringLiteral	Either DatePattern or rollingStyle options are not set for [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
existingInit	TokenNameIdentifier	 existing Init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rollDate	TokenNameIdentifier	 roll Date
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
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
}	TokenNameRBRACE	
/** Rollover the file(s) to date/time tagged file(s). Opens the new file (through setFile) and resets curSizeRollBackups. */	TokenNameCOMMENT_JAVADOC	 Rollover the file(s) to date/time tagged file(s). Opens the new file (through setFile) and resets curSizeRollBackups. 
protected	TokenNameprotected	
void	TokenNamevoid	
rollOverTime	TokenNameIdentifier	 roll Over Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curTimeRollBackups	TokenNameIdentifier	 cur Time Roll Backups
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//delete the old stuff here 	TokenNameCOMMENT_LINE	delete the old stuff here 
if	TokenNameif	
(	TokenNameLPAREN	
staticLogFileName	TokenNameIdentifier	 static Log File Name
)	TokenNameRPAREN	
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
//is the new file name equivalent to the 'current' one 	TokenNameCOMMENT_LINE	is the new file name equivalent to the 'current' one 
//something has gone wrong if we hit this -- we should only 	TokenNameCOMMENT_LINE	something has gone wrong if we hit this -- we should only 
//roll over if the new file will be different from the old 	TokenNameCOMMENT_LINE	roll over if the new file will be different from the old 
String	TokenNameIdentifier	 String
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Compare "	TokenNameStringLiteral	Compare 
+	TokenNamePLUS	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
//we may have to roll over a large number of backups here 	TokenNameCOMMENT_LINE	we may have to roll over a large number of backups here 
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// This will also close the file. This is OK since multiple 	TokenNameCOMMENT_LINE	This will also close the file. This is OK since multiple 
// close operations are safe. 	TokenNameCOMMENT_LINE	close operations are safe. 
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//We're cleared out the old date and are ready for the new 	TokenNameCOMMENT_LINE	We're cleared out the old date and are ready for the new 
//new scheduled name 	TokenNameCOMMENT_LINE	new scheduled name 
scheduledFilename	TokenNameIdentifier	 scheduled Filename
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
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
,	TokenNameCOMMA	
false	TokenNamefalse	
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
", false) call failed."	TokenNameStringLiteral	, false) call failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Renames file <code>from</code> to file <code>to</code>. It * also checks for existence of target file and deletes if it does. */	TokenNameCOMMENT_JAVADOC	 Renames file <code>from</code> to file <code>to</code>. It also checks for existence of target file and deletes if it does. 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
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
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"deleting existing target file: "	TokenNameStringLiteral	deleting existing target file: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Delete's the specified file if it exists */	TokenNameCOMMENT_JAVADOC	 Delete's the specified file if it exists 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Implements roll overs base on file size. <p>If the maximum number of size based backups is reached (<code>curSizeRollBackups == maxSizeRollBackups</code) then the oldest file is deleted -- it's index determined by the sign of countDirection.<br> If <code>countDirection</code> < 0, then files {<code>File.1</code>, ..., <code>File.curSizeRollBackups -1</code>} are renamed to {<code>File.2</code>, ..., <code>File.curSizeRollBackups</code>}. Moreover, <code>File</code> is renamed <code>File.1</code> and closed.<br> A new file is created to receive further log output. <p>If <code>maxSizeRollBackups</code> is equal to zero, then the <code>File</code> is truncated with no backup files created. <p>If <code>maxSizeRollBackups</code> < 0, then <code>File</code> is renamed if needed and no files are deleted. */	TokenNameCOMMENT_JAVADOC	 Implements roll overs base on file size. <p>If the maximum number of size based backups is reached (<code>curSizeRollBackups == maxSizeRollBackups</code) then the oldest file is deleted -- it's index determined by the sign of countDirection.<br> If <code>countDirection</code> < 0, then files {<code>File.1</code>, ..., <code>File.curSizeRollBackups -1</code>} are renamed to {<code>File.2</code>, ..., <code>File.curSizeRollBackups</code>}. Moreover, <code>File</code> is renamed <code>File.1</code> and closed.<br> A new file is created to receive further log output. <p>If <code>maxSizeRollBackups</code> is equal to zero, then the <code>File</code> is truncated with no backup files created. <p>If <code>maxSizeRollBackups</code> < 0, then <code>File</code> is renamed if needed and no files are deleted. 
// synchronization not necessary since doAppend is alreasy synched 	TokenNameCOMMENT_LINE	synchronization not necessary since doAppend is alreasy synched 
protected	TokenNameprotected	
void	TokenNamevoid	
rollOverSize	TokenNameIdentifier	 roll Over Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// keep windows happy. 	TokenNameCOMMENT_LINE	keep windows happy. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"rolling over count="	TokenNameStringLiteral	rolling over count=
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"maxSizeRollBackups = "	TokenNameStringLiteral	maxSizeRollBackups = 
+	TokenNamePLUS	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"curSizeRollBackups = "	TokenNameStringLiteral	curSizeRollBackups = 
+	TokenNamePLUS	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"countDirection = "	TokenNameStringLiteral	countDirection = 
+	TokenNamePLUS	
countDirection	TokenNameIdentifier	 count Direction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If maxBackups <= 0, then there is no file renaming to be done. 	TokenNameCOMMENT_LINE	If maxBackups <= 0, then there is no file renaming to be done. 
if	TokenNameif	
(	TokenNameLPAREN	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countDirection	TokenNameIdentifier	 count Direction
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delete the oldest file, to keep Windows happy. 	TokenNameCOMMENT_LINE	Delete the oldest file, to keep Windows happy. 
if	TokenNameif	
(	TokenNameLPAREN	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
==	TokenNameEQUAL_EQUAL	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Map {(maxBackupIndex - 1), ..., 2, 1} to {maxBackupIndex, ..., 3, 2} 	TokenNameCOMMENT_LINE	Map {(maxBackupIndex - 1), ..., 2, 1} to {maxBackupIndex, ..., 3, 2} 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Rename fileName to fileName.1 	TokenNameCOMMENT_LINE	Rename fileName to fileName.1 
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
".1"	TokenNameStringLiteral	.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//REMOVE This code branching for Alexander Cerna's request 	TokenNameCOMMENT_LINE	REMOVE This code branching for Alexander Cerna's request 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
countDirection	TokenNameIdentifier	 count Direction
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//rollFile based on date pattern 	TokenNameCOMMENT_LINE	rollFile based on date pattern 
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
scheduledFilename	TokenNameIdentifier	 scheduled Filename
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
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
scheduledFilename	TokenNameIdentifier	 scheduled Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//countDirection > 0 	TokenNameCOMMENT_LINE	countDirection > 0 
if	TokenNameif	
(	TokenNameLPAREN	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
>=	TokenNameGREATER_EQUAL	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
&&	TokenNameAND_AND	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//delete the first and keep counting up. 	TokenNameCOMMENT_LINE	delete the first and keep counting up. 
int	TokenNameint	
oldestFileIndex	TokenNameIdentifier	 oldest File Index
=	TokenNameEQUAL	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
-	TokenNameMINUS	
maxSizeRollBackups	TokenNameIdentifier	 max Size Roll Backups
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
oldestFileIndex	TokenNameIdentifier	 oldest File Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
staticLogFileName	TokenNameIdentifier	 static Log File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
rollFile	TokenNameIdentifier	 roll File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
curSizeRollBackups	TokenNameIdentifier	 cur Size Roll Backups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// This will also close the file. This is OK since multiple 	TokenNameCOMMENT_LINE	This will also close the file. This is OK since multiple 
// close operations are safe. 	TokenNameCOMMENT_LINE	close operations are safe. 
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
baseFileName	TokenNameIdentifier	 base File Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile("	TokenNameStringLiteral	setFile(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
", false) call failed."	TokenNameStringLiteral	, false) call failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
