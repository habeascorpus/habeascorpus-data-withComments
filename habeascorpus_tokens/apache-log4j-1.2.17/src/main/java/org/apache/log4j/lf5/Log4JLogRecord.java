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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
;	TokenNameSEMICOLON	
/** * A <code>Log4JLogRecord</code> encapsulates * the details of your log4j <code>LoggingEvent</code> in a format usable * by the <code>LogBrokerMonitor</code>. * * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 A <code>Log4JLogRecord</code> encapsulates the details of your log4j <code>LoggingEvent</code> in a format usable by the <code>LogBrokerMonitor</code>. * @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
Log4JLogRecord	TokenNameIdentifier	 Log4 J Log Record
extends	TokenNameextends	
LogRecord	TokenNameIdentifier	 Log Record
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
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Constructs an instance of a <code>Log4JLogRecord</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an instance of a <code>Log4JLogRecord</code>. 
public	TokenNamepublic	
Log4JLogRecord	TokenNameIdentifier	 Log4 J Log Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Determines which <code>Priority</code> levels will * be displayed in colored font when the <code>LogMonitorAppender</code> * renders this log message. By default, messages will be colored * red if they are of <code>Priority</code> ERROR or FATAL. * * @return true if the log level is ERROR or FATAL. */	TokenNameCOMMENT_JAVADOC	 Determines which <code>Priority</code> levels will be displayed in colored font when the <code>LogMonitorAppender</code> renders this log message. By default, messages will be colored red if they are of <code>Priority</code> ERROR or FATAL. * @return true if the log level is ERROR or FATAL. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSevereLevel	TokenNameIdentifier	 is Severe Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSevere	TokenNameIdentifier	 is Severe
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isSevere	TokenNameIdentifier	 is Severe
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isSevere	TokenNameIdentifier	 is Severe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set stack trace information associated with this Log4JLogRecord. * When this method is called, the stack trace in a * String-based format is made * available via the getThrownStackTrace() method. * * @param throwableInfo An org.apache.log4j.spi.ThrowableInformation to * associate with this Log4JLogRecord. * @see #getThrownStackTrace() */	TokenNameCOMMENT_JAVADOC	 Set stack trace information associated with this Log4JLogRecord. When this method is called, the stack trace in a String-based format is made available via the getThrownStackTrace() method. * @param throwableInfo An org.apache.log4j.spi.ThrowableInformation to associate with this Log4JLogRecord. @see #getThrownStackTrace() 
public	TokenNamepublic	
void	TokenNamevoid	
setThrownStackTrace	TokenNameIdentifier	 set Thrown Stack Trace
(	TokenNameLPAREN	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
throwableInfo	TokenNameIdentifier	 throwable Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stackTraceArray	TokenNameIdentifier	 stack Trace Array
=	TokenNameEQUAL	
throwableInfo	TokenNameIdentifier	 throwable Info
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
stackTrace	TokenNameIdentifier	 stack Trace
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nextLine	TokenNameIdentifier	 next Line
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stackTraceArray	TokenNameIdentifier	 stack Trace Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextLine	TokenNameIdentifier	 next Line
=	TokenNameEQUAL	
stackTraceArray	TokenNameIdentifier	 stack Trace Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
stackTrace	TokenNameIdentifier	 stack Trace
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nextLine	TokenNameIdentifier	 next Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_thrownStackTrace	TokenNameIdentifier	 thrown Stack Trace
=	TokenNameEQUAL	
stackTrace	TokenNameIdentifier	 stack Trace
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
