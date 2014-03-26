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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
/** * LogRecord. A LogRecord encapsulates the details of your desired log * request. * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 LogRecord. A LogRecord encapsulates the details of your desired log request. * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LogRecord	TokenNameIdentifier	 Log Record
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
static	TokenNamestatic	
long	TokenNamelong	
_seqCount	TokenNameIdentifier	 seq Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
LogLevel	TokenNameIdentifier	 Log Level
_level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
_sequenceNumber	TokenNameIdentifier	 sequence Number
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
_millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_thrownStackTrace	TokenNameIdentifier	 thrown Stack Trace
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Throwable	TokenNameIdentifier	 Throwable
_thrown	TokenNameIdentifier	 thrown
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
LogRecord	TokenNameIdentifier	 Log Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
"Debug"	TokenNameStringLiteral	Debug
;	TokenNameSEMICOLON	
_message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
_level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
_sequenceNumber	TokenNameIdentifier	 sequence Number
=	TokenNameEQUAL	
getNextId	TokenNameIdentifier	 get Next Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_ndc	TokenNameIdentifier	 ndc
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
_location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Get the level of this LogRecord. * * @return The LogLevel of this record. * @see #setLevel(LogLevel) * @see LogLevel */	TokenNameCOMMENT_JAVADOC	 Get the level of this LogRecord. * @return The LogLevel of this record. @see #setLevel(LogLevel) @see LogLevel 
public	TokenNamepublic	
LogLevel	TokenNameIdentifier	 Log Level
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the level of this LogRecord. * * @param level The LogLevel for this record. * @see #getLevel() * @see LogLevel */	TokenNameCOMMENT_JAVADOC	 Set the level of this LogRecord. * @param level The LogLevel for this record. @see #getLevel() @see LogLevel 
public	TokenNamepublic	
void	TokenNamevoid	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abstract method. Must be overridden to indicate what log level * to show in red. */	TokenNameCOMMENT_JAVADOC	 Abstract method. Must be overridden to indicate what log level to show in red. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isSevereLevel	TokenNameIdentifier	 is Severe Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if getThrown().toString() is a non-empty string. */	TokenNameCOMMENT_JAVADOC	 @return true if getThrown().toString() is a non-empty string. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasThrown	TokenNameIdentifier	 has Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
getThrown	TokenNameIdentifier	 get Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
thrownString	TokenNameIdentifier	 thrown String
=	TokenNameEQUAL	
thrown	TokenNameIdentifier	 thrown
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
thrownString	TokenNameIdentifier	 thrown String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
thrownString	TokenNameIdentifier	 thrown String
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if isSevereLevel() or hasThrown() returns true. */	TokenNameCOMMENT_JAVADOC	 @return true if isSevereLevel() or hasThrown() returns true. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFatal	TokenNameIdentifier	 is Fatal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isSevereLevel	TokenNameIdentifier	 is Severe Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasThrown	TokenNameIdentifier	 has Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the category asscociated with this LogRecord. For a more detailed * description of what a category is see setCategory(). * * @return The category of this record. * @see #setCategory(String) */	TokenNameCOMMENT_JAVADOC	 Get the category asscociated with this LogRecord. For a more detailed description of what a category is see setCategory(). * @return The category of this record. @see #setCategory(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the category associated with this LogRecord. A category represents * a hierarchical dot (".") separated namespace for messages. * The definition of a category is application specific, but a common convention * is as follows: * * <p> * When logging messages * for a particluar class you can use its class name: * com.thoughtworks.framework.servlet.ServletServiceBroker.<br><br> * Futhermore, to log a message for a particular method in a class * add the method name: * com.thoughtworks.framework.servlet.ServletServiceBroker.init(). * </p> * * @param category The category for this record. * @see #getCategory() */	TokenNameCOMMENT_JAVADOC	 Set the category associated with this LogRecord. A category represents a hierarchical dot (".") separated namespace for messages. The definition of a category is application specific, but a common convention is as follows: * <p> When logging messages for a particluar class you can use its class name: com.thoughtworks.framework.servlet.ServletServiceBroker.<br><br> Futhermore, to log a message for a particular method in a class add the method name: com.thoughtworks.framework.servlet.ServletServiceBroker.init(). </p> * @param category The category for this record. @see #getCategory() 
public	TokenNamepublic	
void	TokenNamevoid	
setCategory	TokenNameIdentifier	 set Category
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the message asscociated with this LogRecord. * * @return The message of this record. * @see #setMessage(String) */	TokenNameCOMMENT_JAVADOC	 Get the message asscociated with this LogRecord. * @return The message of this record. @see #setMessage(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the message associated with this LogRecord. * * @param message The message for this record. * @see #getMessage() */	TokenNameCOMMENT_JAVADOC	 Set the message associated with this LogRecord. * @param message The message for this record. @see #getMessage() 
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the sequence number associated with this LogRecord. Sequence numbers * are generally assigned when a LogRecord is constructed. Sequence numbers * start at 0 and increase with each newly constructed LogRocord. * * @return The sequence number of this record. * @see #setSequenceNumber(long) */	TokenNameCOMMENT_JAVADOC	 Get the sequence number associated with this LogRecord. Sequence numbers are generally assigned when a LogRecord is constructed. Sequence numbers start at 0 and increase with each newly constructed LogRocord. * @return The sequence number of this record. @see #setSequenceNumber(long) 
public	TokenNamepublic	
long	TokenNamelong	
getSequenceNumber	TokenNameIdentifier	 get Sequence Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_sequenceNumber	TokenNameIdentifier	 sequence Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the sequence number assocsiated with this LogRecord. A sequence number * will automatically be assigned to evey newly constructed LogRecord, however, * this method can override the value. * * @param number The sequence number. * @see #getSequenceNumber() */	TokenNameCOMMENT_JAVADOC	 Set the sequence number assocsiated with this LogRecord. A sequence number will automatically be assigned to evey newly constructed LogRecord, however, this method can override the value. * @param number The sequence number. @see #getSequenceNumber() 
public	TokenNamepublic	
void	TokenNamevoid	
setSequenceNumber	TokenNameIdentifier	 set Sequence Number
(	TokenNameLPAREN	
long	TokenNamelong	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_sequenceNumber	TokenNameIdentifier	 sequence Number
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the event time of this record in milliseconds from 1970. * When a LogRecord is constructed the event time is set but may be * overridden by calling setMillis(); * * @return The event time of this record in milliseconds from 1970. * @see #setMillis(long) */	TokenNameCOMMENT_JAVADOC	 Get the event time of this record in milliseconds from 1970. When a LogRecord is constructed the event time is set but may be overridden by calling setMillis(); * @return The event time of this record in milliseconds from 1970. @see #setMillis(long) 
public	TokenNamepublic	
long	TokenNamelong	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the event time of this record. When a LogRecord is constructed * the event time is set but may be overridden by calling this method. * * @param millis The time in milliseconds from 1970. * @see #getMillis() */	TokenNameCOMMENT_JAVADOC	 Set the event time of this record. When a LogRecord is constructed the event time is set but may be overridden by calling this method. * @param millis The time in milliseconds from 1970. @see #getMillis() 
public	TokenNamepublic	
void	TokenNamevoid	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the thread description asscociated with this LogRecord. When a * LogRecord is constructed, the thread description is set by calling: * Thread.currentThread().toString(). You may supply a thread description * of your own by calling the setThreadDescription(String) method. * * @return The thread description of this record. * @see #setThreadDescription(String) */	TokenNameCOMMENT_JAVADOC	 Get the thread description asscociated with this LogRecord. When a LogRecord is constructed, the thread description is set by calling: Thread.currentThread().toString(). You may supply a thread description of your own by calling the setThreadDescription(String) method. * @return The thread description of this record. @see #setThreadDescription(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getThreadDescription	TokenNameIdentifier	 get Thread Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_thread	TokenNameIdentifier	 thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the thread description associated with this LogRecord. When a * LogRecord is constructed, the thread description is set by calling: * Thread.currentThread().toString(). You may supply a thread description * of your own by calling this method. * * @param threadDescription The description of the thread for this record. * @see #getThreadDescription() */	TokenNameCOMMENT_JAVADOC	 Set the thread description associated with this LogRecord. When a LogRecord is constructed, the thread description is set by calling: Thread.currentThread().toString(). You may supply a thread description of your own by calling this method. * @param threadDescription The description of the thread for this record. @see #getThreadDescription() 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadDescription	TokenNameIdentifier	 set Thread Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadDescription	TokenNameIdentifier	 thread Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
threadDescription	TokenNameIdentifier	 thread Description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the stack trace in a String-based format for the associated Throwable * of this LogRecord. The stack trace in a String-based format is set * when the setThrown(Throwable) method is called. * * <p> * Why do we need this method considering that we * have the getThrown() and setThrown() methods? * A Throwable object may not be serializable, however, a String representation * of it is. Users of LogRecords should generally call this method over * getThrown() for the reasons of serialization. * </p> * * @return The Stack Trace for the asscoiated Throwable of this LogRecord. * @see #setThrown(Throwable) * @see #getThrown() */	TokenNameCOMMENT_JAVADOC	 Get the stack trace in a String-based format for the associated Throwable of this LogRecord. The stack trace in a String-based format is set when the setThrown(Throwable) method is called. * <p> Why do we need this method considering that we have the getThrown() and setThrown() methods? A Throwable object may not be serializable, however, a String representation of it is. Users of LogRecords should generally call this method over getThrown() for the reasons of serialization. </p> * @return The Stack Trace for the asscoiated Throwable of this LogRecord. @see #setThrown(Throwable) @see #getThrown() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getThrownStackTrace	TokenNameIdentifier	 get Thrown Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_thrownStackTrace	TokenNameIdentifier	 thrown Stack Trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ThrownStackTrace for the log record. * * @param trace A String to associate with this LogRecord * @see #getThrownStackTrace() */	TokenNameCOMMENT_JAVADOC	 Set the ThrownStackTrace for the log record. * @param trace A String to associate with this LogRecord @see #getThrownStackTrace() 
public	TokenNamepublic	
void	TokenNamevoid	
setThrownStackTrace	TokenNameIdentifier	 set Thrown Stack Trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_thrownStackTrace	TokenNameIdentifier	 thrown Stack Trace
=	TokenNameEQUAL	
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Throwable associated with this LogRecord. * * @return The LogLevel of this record. * @see #setThrown(Throwable) * @see #getThrownStackTrace() */	TokenNameCOMMENT_JAVADOC	 Get the Throwable associated with this LogRecord. * @return The LogLevel of this record. @see #setThrown(Throwable) @see #getThrownStackTrace() 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getThrown	TokenNameIdentifier	 get Thrown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Throwable associated with this LogRecord. When this method * is called, the stack trace in a String-based format is made * available via the getThrownStackTrace() method. * * @param thrown A Throwable to associate with this LogRecord. * @see #getThrown() * @see #getThrownStackTrace() */	TokenNameCOMMENT_JAVADOC	 Set the Throwable associated with this LogRecord. When this method is called, the stack trace in a String-based format is made available via the getThrownStackTrace() method. * @param thrown A Throwable to associate with this LogRecord. @see #getThrown() @see #getThrownStackTrace() 
public	TokenNamepublic	
void	TokenNamevoid	
setThrown	TokenNameIdentifier	 set Thrown
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
thrown	TokenNameIdentifier	 thrown
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thrown	TokenNameIdentifier	 thrown
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_thrownStackTrace	TokenNameIdentifier	 thrown Stack Trace
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing, this should not happen as it is StringWriter. 	TokenNameCOMMENT_LINE	Do nothing, this should not happen as it is StringWriter. 
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String representation of this LogRecord. */	TokenNameCOMMENT_JAVADOC	 Return a String representation of this LogRecord. 
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"LogRecord: ["	TokenNameStringLiteral	LogRecord: [
+	TokenNamePLUS	
_level	TokenNameIdentifier	 level
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
_message	TokenNameIdentifier	 message
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the NDC (nested diagnostic context) for this record. * * @return The string representing the NDC. */	TokenNameCOMMENT_JAVADOC	 Get the NDC (nested diagnostic context) for this record. * @return The string representing the NDC. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the NDC (nested diagnostic context) for this record. * * @param ndc A string representing the NDC. */	TokenNameCOMMENT_JAVADOC	 Set the NDC (nested diagnostic context) for this record. * @param ndc A string representing the NDC. 
public	TokenNamepublic	
void	TokenNamevoid	
setNDC	TokenNameIdentifier	 set NDC
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ndc	TokenNameIdentifier	 ndc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_ndc	TokenNameIdentifier	 ndc
=	TokenNameEQUAL	
ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the location in code where this LogRecord originated. * * @return The string containing the location information. */	TokenNameCOMMENT_JAVADOC	 Get the location in code where this LogRecord originated. * @return The string containing the location information. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the location in code where this LogRecord originated. * * @param location A string containing location information. */	TokenNameCOMMENT_JAVADOC	 Set the location in code where this LogRecord originated. * @param location A string containing location information. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets that sequence number to 0. * */	TokenNameCOMMENT_JAVADOC	 Resets that sequence number to 0. 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
resetSequenceNumber	TokenNameIdentifier	 reset Sequence Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_seqCount	TokenNameIdentifier	 seq Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getNextId	TokenNameIdentifier	 get Next Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_seqCount	TokenNameIdentifier	 seq Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_seqCount	TokenNameIdentifier	 seq Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
