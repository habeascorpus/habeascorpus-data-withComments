/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Toolkit	TokenNameIdentifier	 Toolkit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
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
LocationInfo	TokenNameIdentifier	 Location Info
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
/** * <code>LF5Appender</code> logs events to a swing based logging * console. The swing console supports turning categories on and off, * multiple detail level views, as well as full text searching and many * other capabilties. * * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 <code>LF5Appender</code> logs events to a swing based logging console. The swing console supports turning categories on and off, multiple detail level views, as well as full text searching and many other capabilties. * @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LF5Appender	TokenNameIdentifier	 L F5 Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
_logMonitor	TokenNameIdentifier	 log Monitor
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
AppenderFinalizer	TokenNameIdentifier	 Appender Finalizer
_finalizer	TokenNameIdentifier	 finalizer
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Constructs a <code>LF5Appender</code> using the default instance of * the <code>LogBrokerMonitor</code>. This constructor should <bold>always * </bold> be preferred over the * <code>LF5Appender(LogBrokerMonitor monitor)</code> * constructor, unless you need to spawn additional log monitoring * windows. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>LF5Appender</code> using the default instance of the <code>LogBrokerMonitor</code>. This constructor should <bold>always </bold> be preferred over the <code>LF5Appender(LogBrokerMonitor monitor)</code> constructor, unless you need to spawn additional log monitoring windows. 
public	TokenNamepublic	
LF5Appender	TokenNameIdentifier	 L F5 Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
getDefaultInstance	TokenNameIdentifier	 get Default Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a <code>LF5Appender<code> using an instance of * a <code>LogBrokerMonitor<code> supplied by the user. This * constructor should only be used when you need to spawn * additional log monitoring windows. * * @param monitor An instance of a <code>LogBrokerMonitor<code> * created by the user. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>LF5Appender<code> using an instance of a <code>LogBrokerMonitor<code> supplied by the user. This constructor should only be used when you need to spawn additional log monitoring windows. * @param monitor An instance of a <code>LogBrokerMonitor<code> created by the user. 
public	TokenNamepublic	
LF5Appender	TokenNameIdentifier	 L F5 Appender
(	TokenNameLPAREN	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
monitor	TokenNameIdentifier	 monitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
monitor	TokenNameIdentifier	 monitor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logMonitor	TokenNameIdentifier	 log Monitor
=	TokenNameEQUAL	
monitor	TokenNameIdentifier	 monitor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Appends a <code>LoggingEvent</code> record to the * <code>LF5Appender</code>. * @param event The <code>LoggingEvent</code> * to be appended. */	TokenNameCOMMENT_JAVADOC	 Appends a <code>LoggingEvent</code> record to the <code>LF5Appender</code>. @param event The <code>LoggingEvent</code> to be appended. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Retrieve the information from the log4j LoggingEvent. 	TokenNameCOMMENT_LINE	Retrieve the information from the log4j LoggingEvent. 
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
logMessage	TokenNameIdentifier	 log Message
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nestedDiagnosticContext	TokenNameIdentifier	 nested Diagnostic Context
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
threadDescription	TokenNameIdentifier	 thread Description
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
LocationInfo	TokenNameIdentifier	 Location Info
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the logging event information to a LogRecord 	TokenNameCOMMENT_LINE	Add the logging event information to a LogRecord 
Log4JLogRecord	TokenNameIdentifier	 Log4 J Log Record
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
new	TokenNamenew	
Log4JLogRecord	TokenNameIdentifier	 Log4 J Log Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setCategory	TokenNameIdentifier	 set Category
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
logMessage	TokenNameIdentifier	 log Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setThreadDescription	TokenNameIdentifier	 set Thread Description
(	TokenNameLPAREN	
threadDescription	TokenNameIdentifier	 thread Description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nestedDiagnosticContext	TokenNameIdentifier	 nested Diagnostic Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setNDC	TokenNameIdentifier	 set NDC
(	TokenNameLPAREN	
nestedDiagnosticContext	TokenNameIdentifier	 nested Diagnostic Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setNDC	TokenNameIdentifier	 set NDC
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableInformation	TokenNameIdentifier	 get Throwable Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setThrownStackTrace	TokenNameIdentifier	 set Thrown Stack Trace
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableInformation	TokenNameIdentifier	 get Throwable Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LogLevelFormatException	TokenNameIdentifier	 Log Level Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the priority level doesn't match one of the predefined 	TokenNameCOMMENT_LINE	If the priority level doesn't match one of the predefined 
// log levels, then set the level to warning. 	TokenNameCOMMENT_LINE	log levels, then set the level to warning. 
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_logMonitor	TokenNameIdentifier	 log Monitor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logMonitor	TokenNameIdentifier	 log Monitor
.	TokenNameDOT	
addMessage	TokenNameIdentifier	 add Message
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is an empty implementation of the close() method inherited * from the <code>org.apache.log4j.Appender</code> interface. */	TokenNameCOMMENT_JAVADOC	 This method is an empty implementation of the close() method inherited from the <code>org.apache.log4j.Appender</code> interface. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns a value that indicates whether this appender requires a * <code>Layout</code>. This method always returns false. * No layout is required for the <code>LF5Appender</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a value that indicates whether this appender requires a <code>Layout</code>. This method always returns false. No layout is required for the <code>LF5Appender</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to set the property that controls whether * the <code>LogBrokerMonitor</code> is hidden or closed when a user * exits * the monitor. By default, the <code>LogBrokerMonitor</code> will hide * itself when the log window is exited, and the swing thread will * continue to run in the background. If this property is * set to true, the <code>LogBrokerMonitor</code> will call System.exit(0) * and will shut down swing thread and the virtual machine. * * @param callSystemExitOnClose A boolean value indicating whether * to call System.exit(0) when closing the log window. */	TokenNameCOMMENT_JAVADOC	 This method is used to set the property that controls whether the <code>LogBrokerMonitor</code> is hidden or closed when a user exits the monitor. By default, the <code>LogBrokerMonitor</code> will hide itself when the log window is exited, and the swing thread will continue to run in the background. If this property is set to true, the <code>LogBrokerMonitor</code> will call System.exit(0) and will shut down swing thread and the virtual machine. * @param callSystemExitOnClose A boolean value indicating whether to call System.exit(0) when closing the log window. 
public	TokenNamepublic	
void	TokenNamevoid	
setCallSystemExitOnClose	TokenNameIdentifier	 set Call System Exit On Close
(	TokenNameLPAREN	
boolean	TokenNameboolean	
callSystemExitOnClose	TokenNameIdentifier	 call System Exit On Close
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logMonitor	TokenNameIdentifier	 log Monitor
.	TokenNameDOT	
setCallSystemExitOnClose	TokenNameIdentifier	 set Call System Exit On Close
(	TokenNameLPAREN	
callSystemExitOnClose	TokenNameIdentifier	 call System Exit On Close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The equals method compares two LF5Appenders and determines whether * they are equal. Two <code>Appenders</code> will be considered equal * if, and only if, they both contain references to the same <code> * LogBrokerMonitor</code>. * * @param compareTo A boolean value indicating whether * the two LF5Appenders are equal. */	TokenNameCOMMENT_JAVADOC	 The equals method compares two LF5Appenders and determines whether they are equal. Two <code>Appenders</code> will be considered equal if, and only if, they both contain references to the same <code> LogBrokerMonitor</code>. * @param compareTo A boolean value indicating whether the two LF5Appenders are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LF5Appender	TokenNameIdentifier	 L F5 Appender
compareTo	TokenNameIdentifier	 compare To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If both reference the same LogBrokerMonitor, they are equal. 	TokenNameCOMMENT_LINE	If both reference the same LogBrokerMonitor, they are equal. 
return	TokenNamereturn	
_logMonitor	TokenNameIdentifier	 log Monitor
==	TokenNameEQUAL_EQUAL	
compareTo	TokenNameIdentifier	 compare To
.	TokenNameDOT	
getLogBrokerMonitor	TokenNameIdentifier	 get Log Broker Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
getLogBrokerMonitor	TokenNameIdentifier	 get Log Broker Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_logMonitor	TokenNameIdentifier	 log Monitor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
LF5Appender	TokenNameIdentifier	 L F5 Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxNumberOfRecords	TokenNameIdentifier	 set Max Number Of Records
(	TokenNameLPAREN	
int	TokenNameint	
maxNumberOfRecords	TokenNameIdentifier	 max Number Of Records
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
.	TokenNameDOT	
setMaxNumberOfLogRecords	TokenNameIdentifier	 set Max Number Of Log Records
(	TokenNameLPAREN	
maxNumberOfRecords	TokenNameIdentifier	 max Number Of Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * @return The default instance of the <code>LogBrokerMonitor</code>. */	TokenNameCOMMENT_JAVADOC	 @return The default instance of the <code>LogBrokerMonitor</code>. 
protected	TokenNameprotected	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
getDefaultInstance	TokenNameIdentifier	 get Default Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
=	TokenNameEQUAL	
new	TokenNamenew	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
getLog4JLevels	TokenNameIdentifier	 get Log4 J Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_finalizer	TokenNameIdentifier	 finalizer
=	TokenNameEQUAL	
new	TokenNamenew	
AppenderFinalizer	TokenNameIdentifier	 Appender Finalizer
(	TokenNameLPAREN	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
.	TokenNameDOT	
setFrameSize	TokenNameIdentifier	 set Frame Size
(	TokenNameLPAREN	
getDefaultMonitorWidth	TokenNameIdentifier	 get Default Monitor Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getDefaultMonitorHeight	TokenNameIdentifier	 get Default Monitor Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
.	TokenNameDOT	
setFontSize	TokenNameIdentifier	 set Font Size
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
.	TokenNameDOT	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
_defaultLogMonitor	TokenNameIdentifier	 default Log Monitor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the screen width from Toolkit.getScreenSize() * if possible, otherwise returns 800 * @see java.awt.Toolkit */	TokenNameCOMMENT_JAVADOC	 @return the screen width from Toolkit.getScreenSize() if possible, otherwise returns 800 @see java.awt.Toolkit 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getScreenWidth	TokenNameIdentifier	 get Screen Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenSize	TokenNameIdentifier	 get Screen Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return the screen height from Toolkit.getScreenSize() * if possible, otherwise returns 600 * @see java.awt.Toolkit */	TokenNameCOMMENT_JAVADOC	 @return the screen height from Toolkit.getScreenSize() if possible, otherwise returns 600 @see java.awt.Toolkit 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getScreenHeight	TokenNameIdentifier	 get Screen Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenSize	TokenNameIdentifier	 get Screen Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getDefaultMonitorWidth	TokenNameIdentifier	 get Default Monitor Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
getScreenWidth	TokenNameIdentifier	 get Screen Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getDefaultMonitorHeight	TokenNameIdentifier	 get Default Monitor Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
getScreenHeight	TokenNameIdentifier	 get Screen Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
