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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Toolkit	TokenNameIdentifier	 Toolkit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
LogLevel	TokenNameIdentifier	 Log Level
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
LogRecord	TokenNameIdentifier	 Log Record
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
/** * <p>LogMonitorAdapter facilitates the usage of the LogMonitor</p> * * @author Richard Hurst */	TokenNameCOMMENT_JAVADOC	 <p>LogMonitorAdapter facilitates the usage of the LogMonitor</p> * @author Richard Hurst 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOG4J_LOG_LEVELS	TokenNameIdentifier	 LO G4 J  LOG  LEVELS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JDK14_LOG_LEVELS	TokenNameIdentifier	 JD K14  LOG  LEVELS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
_logMonitor	TokenNameIdentifier	 log Monitor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LogLevel	TokenNameIdentifier	 Log Level
_defaultLevel	TokenNameIdentifier	 default Level
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
userDefinedLevels	TokenNameIdentifier	 user Defined Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the default level to be the first entry in the list 	TokenNameCOMMENT_LINE	set the default level to be the first entry in the list 
_defaultLevel	TokenNameIdentifier	 default Level
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
userDefinedLevels	TokenNameIdentifier	 user Defined Levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_logMonitor	TokenNameIdentifier	 log Monitor
=	TokenNameEQUAL	
new	TokenNamenew	
LogBrokerMonitor	TokenNameIdentifier	 Log Broker Monitor
(	TokenNameLPAREN	
userDefinedLevels	TokenNameIdentifier	 user Defined Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_logMonitor	TokenNameIdentifier	 log Monitor
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
_logMonitor	TokenNameIdentifier	 log Monitor
.	TokenNameDOT	
setFontSize	TokenNameIdentifier	 set Font Size
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_logMonitor	TokenNameIdentifier	 log Monitor
.	TokenNameDOT	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * <p>Creates an instance of LogMonitorAdapter using the * log levels inticated by the parameter. Log4J and JDK1.4 both have default * LogLevels which are set but these levels can be overriden.<p> * * @param loglevels An integer representing either Log4J or JDK1.4 logging levels * @return LogMonitorAdapter */	TokenNameCOMMENT_JAVADOC	 <p>Creates an instance of LogMonitorAdapter using the log levels inticated by the parameter. Log4J and JDK1.4 both have default LogLevels which are set but these levels can be overriden.<p> * @param loglevels An integer representing either Log4J or JDK1.4 logging levels @return LogMonitorAdapter 
public	TokenNamepublic	
static	TokenNamestatic	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
int	TokenNameint	
loglevels	TokenNameIdentifier	 loglevels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loglevels	TokenNameIdentifier	 loglevels
==	TokenNameEQUAL_EQUAL	
JDK14_LOG_LEVELS	TokenNameIdentifier	 JD K14  LOG  LEVELS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
getJdk14Levels	TokenNameIdentifier	 get Jdk14 Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
setDefaultLevel	TokenNameIdentifier	 set Default Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
FINEST	TokenNameIdentifier	 FINEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
setSevereLevel	TokenNameIdentifier	 set Severe Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
SEVERE	TokenNameIdentifier	 SEVERE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
getLog4JLevels	TokenNameIdentifier	 get Log4 J Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
setDefaultLevel	TokenNameIdentifier	 set Default Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
setSevereLevel	TokenNameIdentifier	 set Severe Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Creates an instance of LogMonitorAdapter using the specified LogLevels. * The first LogLevel in the array is used as the default LogLevel unless * changed using the setDefaultLevel method.<p> * * @param userDefined An array of user defined LogLevel objects. * @return LogMonitorAdapter */	TokenNameCOMMENT_JAVADOC	 <p>Creates an instance of LogMonitorAdapter using the specified LogLevels. The first LogLevel in the array is used as the default LogLevel unless changed using the setDefaultLevel method.<p> * @param userDefined An array of user defined LogLevel objects. @return LogMonitorAdapter 
public	TokenNamepublic	
static	TokenNamestatic	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
userDefined	TokenNameIdentifier	 user Defined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userDefined	TokenNameIdentifier	 user Defined
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
userDefined	TokenNameIdentifier	 user Defined
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Creates an instance of LogMonitorAdapter using the specified LogLevels. * The first LogLevel in the List is used as the default LogLevel unless * changed using the setDefaultLevel method.<p> * * @param userDefinedLevels A list of user defined LogLevel objects. * @return LogMonitorAdapter */	TokenNameCOMMENT_JAVADOC	 <p>Creates an instance of LogMonitorAdapter using the specified LogLevels. The first LogLevel in the List is used as the default LogLevel unless changed using the setDefaultLevel method.<p> * @param userDefinedLevels A list of user defined LogLevel objects. @return LogMonitorAdapter 
public	TokenNamepublic	
static	TokenNamestatic	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
userDefinedLevels	TokenNameIdentifier	 user Defined Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
(	TokenNameLPAREN	
userDefinedLevels	TokenNameIdentifier	 user Defined Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Adds a LogRecord to the LogMonitor.<p> * * @param record The LogRecord object to be logged in the logging monitor. */	TokenNameCOMMENT_JAVADOC	 <p>Adds a LogRecord to the LogMonitor.<p> * @param record The LogRecord object to be logged in the logging monitor. 
public	TokenNamepublic	
void	TokenNamevoid	
addMessage	TokenNameIdentifier	 add Message
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
record	TokenNameIdentifier	 record
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
/** * <p>Set the maximum number of records to be displayed in the monitor<p> * * @param maxNumberOfRecords */	TokenNameCOMMENT_JAVADOC	 <p>Set the maximum number of records to be displayed in the monitor<p> * @param maxNumberOfRecords 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxNumberOfRecords	TokenNameIdentifier	 set Max Number Of Records
(	TokenNameLPAREN	
int	TokenNameint	
maxNumberOfRecords	TokenNameIdentifier	 max Number Of Records
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logMonitor	TokenNameIdentifier	 log Monitor
.	TokenNameDOT	
setMaxNumberOfLogRecords	TokenNameIdentifier	 set Max Number Of Log Records
(	TokenNameLPAREN	
maxNumberOfRecords	TokenNameIdentifier	 max Number Of Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set the default log level to be used when logging messages without * specifying a LogLevel.<p> * * @param level */	TokenNameCOMMENT_JAVADOC	 <p>Set the default log level to be used when logging messages without specifying a LogLevel.<p> * @param level 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultLevel	TokenNameIdentifier	 set Default Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_defaultLevel	TokenNameIdentifier	 default Level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Gets the default LogLevel for the Adapter.<p> * * @return LogLevel */	TokenNameCOMMENT_JAVADOC	 <p>Gets the default LogLevel for the Adapter.<p> * @return LogLevel 
public	TokenNamepublic	
LogLevel	TokenNameIdentifier	 Log Level
getDefaultLevel	TokenNameIdentifier	 get Default Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Sets the Severe LogLevel.</p> * * @param level */	TokenNameCOMMENT_JAVADOC	 <p>Sets the Severe LogLevel.</p> * @param level 
public	TokenNamepublic	
void	TokenNamevoid	
setSevereLevel	TokenNameIdentifier	 set Severe Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AdapterLogRecord	TokenNameIdentifier	 Adapter Log Record
.	TokenNameDOT	
setSevereLevel	TokenNameIdentifier	 set Severe Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Gets the current Severe LogLevel <p> * * @return LogLevel */	TokenNameCOMMENT_JAVADOC	 <p>Gets the current Severe LogLevel <p> * @return LogLevel 
public	TokenNamepublic	
LogLevel	TokenNameIdentifier	 Log Level
getSevereLevel	TokenNameIdentifier	 get Severe Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AdapterLogRecord	TokenNameIdentifier	 Adapter Log Record
.	TokenNameDOT	
getSevereLevel	TokenNameIdentifier	 get Severe Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Log a complete message to the Monitor.<p> * * @param category The category to be used * @param level The log level to apply to the message * @param message The message * @param t The throwable content of the message * @param NDC The NDC really only applies to Log4J and the parameter can * usually be ignored. */	TokenNameCOMMENT_JAVADOC	 <p>Log a complete message to the Monitor.<p> * @param category The category to be used @param level The log level to apply to the message @param message The message @param t The throwable content of the message @param NDC The NDC really only applies to Log4J and the parameter can usually be ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
NDC	TokenNameIdentifier	 NDC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AdapterLogRecord	TokenNameIdentifier	 Adapter Log Record
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
new	TokenNamenew	
AdapterLogRecord	TokenNameIdentifier	 Adapter Log Record
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
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setNDC	TokenNameIdentifier	 set NDC
(	TokenNameLPAREN	
NDC	TokenNameIdentifier	 NDC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setThrown	TokenNameIdentifier	 set Thrown
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
getDefaultLevel	TokenNameIdentifier	 get Default Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addMessage	TokenNameIdentifier	 add Message
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Log a message to the Monitor and use the default LogLevel.<p> * * @param category The category to be used * @param message The message */	TokenNameCOMMENT_JAVADOC	 <p>Log a message to the Monitor and use the default LogLevel.<p> * @param category The category to be used @param message The message 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Log a message to the Monitor.<p> * * @param category The category to be used * @param level The log level to apply to the message * @param message The message * @param NDC */	TokenNameCOMMENT_JAVADOC	 <p>Log a message to the Monitor.<p> * @param category The category to be used @param level The log level to apply to the message @param message The message @param NDC 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
NDC	TokenNameIdentifier	 NDC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
NDC	TokenNameIdentifier	 NDC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Log a message to the Monitor.<p> * * @param category The category to be used * @param level The log level to apply to the message * @param message The message * @param t The throwable content of the message */	TokenNameCOMMENT_JAVADOC	 <p>Log a message to the Monitor.<p> * @param category The category to be used @param level The log level to apply to the message @param message The message @param t The throwable content of the message 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Log a message to the Monitor.<p> * * @param category The category to be used * @param level The log level to apply to the message * @param message The message */	TokenNameCOMMENT_JAVADOC	 <p>Log a message to the Monitor.<p> * @param category The category to be used @param level The log level to apply to the message @param message The message 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
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
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
