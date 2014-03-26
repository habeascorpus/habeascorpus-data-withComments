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
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
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
// Contibutors: Jens Uwe Pipka <jens.pipka@gmx.de> 	TokenNameCOMMENT_LINE	Contibutors: Jens Uwe Pipka <jens.pipka@gmx.de> 
// Ben Sandee 	TokenNameCOMMENT_LINE	Ben Sandee 
/** WriterAppender appends log events to a {@link java.io.Writer} or an {@link java.io.OutputStream} depending on the user's choice. @author Ceki G&uuml;lc&uuml; @since 1.1 */	TokenNameCOMMENT_JAVADOC	 WriterAppender appends log events to a {@link java.io.Writer} or an {@link java.io.OutputStream} depending on the user's choice. @author Ceki G&uuml;lc&uuml; @since 1.1 
public	TokenNamepublic	
class	TokenNameclass	
WriterAppender	TokenNameIdentifier	 Writer Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** Immediate flush means that the underlying writer or output stream will be flushed at the end of each append operation unless shouldFlush() is overridden. Immediate flush is slower but ensures that each append request is actually written. If <code>immediateFlush</code> is set to <code>false</code>, then there is a good chance that the last few logs events are not actually written to persistent media if and when the application crashes. <p>The <code>immediateFlush</code> variable is set to <code>true</code> by default. */	TokenNameCOMMENT_JAVADOC	 Immediate flush means that the underlying writer or output stream will be flushed at the end of each append operation unless shouldFlush() is overridden. Immediate flush is slower but ensures that each append request is actually written. If <code>immediateFlush</code> is set to <code>false</code>, then there is a good chance that the last few logs events are not actually written to persistent media if and when the application crashes. <p>The <code>immediateFlush</code> variable is set to <code>true</code> by default. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
immediateFlush	TokenNameIdentifier	 immediate Flush
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The encoding to use when writing. <p>The <code>encoding</code> variable is set to <code>null</null> by default which results in the utilization of the system's default encoding. */	TokenNameCOMMENT_JAVADOC	 The encoding to use when writing. <p>The <code>encoding</code> variable is set to <code>null</null> by default which results in the utilization of the system's default encoding. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** This is the {@link QuietWriter quietWriter} where we will write to. */	TokenNameCOMMENT_JAVADOC	 This is the {@link QuietWriter quietWriter} where we will write to. 
protected	TokenNameprotected	
QuietWriter	TokenNameIdentifier	 Quiet Writer
qw	TokenNameIdentifier	 qw
;	TokenNameSEMICOLON	
/** This default constructor does nothing. */	TokenNameCOMMENT_JAVADOC	 This default constructor does nothing. 
public	TokenNamepublic	
WriterAppender	TokenNameIdentifier	 Writer Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Instantiate a WriterAppender and set the output destination to a new {@link OutputStreamWriter} initialized with <code>os</code> as its {@link OutputStream}. */	TokenNameCOMMENT_JAVADOC	 Instantiate a WriterAppender and set the output destination to a new {@link OutputStreamWriter} initialized with <code>os</code> as its {@link OutputStream}. 
public	TokenNamepublic	
WriterAppender	TokenNameIdentifier	 Writer Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a WriterAppender and set the output destination to <code>writer</code>. <p>The <code>writer</code> must have been previously opened by the user. */	TokenNameCOMMENT_JAVADOC	 Instantiate a WriterAppender and set the output destination to <code>writer</code>. <p>The <code>writer</code> must have been previously opened by the user. 
public	TokenNamepublic	
WriterAppender	TokenNameIdentifier	 Writer Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the <b>ImmediateFlush</b> option is set to <code>true</code>, the appender will flush at the end of each write. This is the default behavior. If the option is set to <code>false</code>, then the underlying stream can defer writing to physical medium to a later time. <p>Avoiding the flush operation at the end of each append results in a performance gain of 10 to 20 percent. However, there is safety tradeoff involved in skipping flushing. Indeed, when flushing is skipped, then it is likely that the last few log events will not be recorded on disk when the application exits. This is a high price to pay even for a 20% performance gain. */	TokenNameCOMMENT_JAVADOC	 If the <b>ImmediateFlush</b> option is set to <code>true</code>, the appender will flush at the end of each write. This is the default behavior. If the option is set to <code>false</code>, then the underlying stream can defer writing to physical medium to a later time. <p>Avoiding the flush operation at the end of each append results in a performance gain of 10 to 20 percent. However, there is safety tradeoff involved in skipping flushing. Indeed, when flushing is skipped, then it is likely that the last few log events will not be recorded on disk when the application exits. This is a high price to pay even for a 20% performance gain. 
public	TokenNamepublic	
void	TokenNamevoid	
setImmediateFlush	TokenNameIdentifier	 set Immediate Flush
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
immediateFlush	TokenNameIdentifier	 immediate Flush
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>ImmediateFlush</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>ImmediateFlush</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getImmediateFlush	TokenNameIdentifier	 get Immediate Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
immediateFlush	TokenNameIdentifier	 immediate Flush
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Does nothing. */	TokenNameCOMMENT_JAVADOC	 Does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** This method is called by the {@link AppenderSkeleton#doAppend} method. <p>If the output stream exists and is writable then write a log statement to the output stream. Otherwise, write a single warning message to <code>System.err</code>. <p>The format of the output will depend on this appender's layout. */	TokenNameCOMMENT_JAVADOC	 This method is called by the {@link AppenderSkeleton#doAppend} method. <p>If the output stream exists and is writable then write a log statement to the output stream. Otherwise, write a single warning message to <code>System.err</code>. <p>The format of the output will depend on this appender's layout. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reminder: the nesting of calls is: 	TokenNameCOMMENT_LINE	Reminder: the nesting of calls is: 
// 	TokenNameCOMMENT_LINE	 
// doAppend() 	TokenNameCOMMENT_LINE	doAppend() 
// - check threshold 	TokenNameCOMMENT_LINE	- check threshold 
// - filter 	TokenNameCOMMENT_LINE	- filter 
// - append(); 	TokenNameCOMMENT_LINE	- append(); 
// - checkEntryConditions(); 	TokenNameCOMMENT_LINE	- checkEntryConditions(); 
// - subAppend(); 	TokenNameCOMMENT_LINE	- subAppend(); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method determines if there is a sense in attempting to append. <p>It checks whether there is a set output target and also if there is a set layout. If these checks fail, then the boolean value <code>false</code> is returned. */	TokenNameCOMMENT_JAVADOC	 This method determines if there is a sense in attempting to append. <p>It checks whether there is a set output target and also if there is a set layout. If these checks fail, then the boolean value <code>false</code> is returned. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Not allowed to write to a closed appender."	TokenNameStringLiteral	Not allowed to write to a closed appender.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"No output stream or file set for the appender named ["	TokenNameStringLiteral	No output stream or file set for the appender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"No layout set for the appender named ["	TokenNameStringLiteral	No layout set for the appender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Close this appender instance. The underlying stream or writer is also closed. <p>Closed appenders cannot be reused. @see #setWriter @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Close this appender instance. The underlying stream or writer is also closed. <p>Closed appenders cannot be reused. @see #setWriter @since 0.8.4 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
writeFooter	TokenNameIdentifier	 write Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the underlying {@link java.io.Writer}. * */	TokenNameCOMMENT_JAVADOC	 Close the underlying {@link java.io.Writer}. 
protected	TokenNameprotected	
void	TokenNamevoid	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
qw	TokenNameIdentifier	 qw
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
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
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
// There is do need to invoke an error handler at this late 	TokenNameCOMMENT_LINE	There is do need to invoke an error handler at this late 
// stage. 	TokenNameCOMMENT_LINE	stage. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not close "	TokenNameStringLiteral	Could not close 
+	TokenNamePLUS	
qw	TokenNameIdentifier	 qw
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns an OutputStreamWriter when passed an OutputStream. The encoding used will depend on the value of the <code>encoding</code> property. If the encoding value is specified incorrectly the writer will be opened using the default system encoding (an error message will be printed to the loglog. */	TokenNameCOMMENT_JAVADOC	 Returns an OutputStreamWriter when passed an OutputStream. The encoding used will depend on the value of the <code>encoding</code> property. If the encoding value is specified incorrectly the writer will be opened using the default system encoding (an error message will be printed to the loglog. 
protected	TokenNameprotected	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enc	TokenNameIdentifier	 enc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
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
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Error initializing output writer."	TokenNameStringLiteral	Error initializing output writer.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unsupported encoding?"	TokenNameStringLiteral	Unsupported encoding?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
retval	TokenNameIdentifier	 retval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the {@link ErrorHandler} for this WriterAppender and also the underlying {@link QuietWriter} if any. */	TokenNameCOMMENT_JAVADOC	 Set the {@link ErrorHandler} for this WriterAppender and also the underlying {@link QuietWriter} if any. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"You have tried to set a null error-handler."	TokenNameStringLiteral	You have tried to set a null error-handler.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
eh	TokenNameIdentifier	 eh
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** <p>Sets the Writer where the log output will go. The specified Writer must be opened by the user and be writable. <p>The <code>java.io.Writer</code> will be closed when the appender instance is closed. <p><b>WARNING:</b> Logging to an unopened Writer will fail. <p> @param writer An already opened Writer. */	TokenNameCOMMENT_JAVADOC	 <p>Sets the Writer where the log output will go. The specified Writer must be opened by the user and be writable. <p>The <code>java.io.Writer</code> will be closed when the appender instance is closed. <p><b>WARNING:</b> Logging to an unopened Writer will fail. <p> @param writer An already opened Writer. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
new	TokenNamenew	
QuietWriter	TokenNameIdentifier	 Quiet Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//this.tp = new TracerPrintWriter(qw); 	TokenNameCOMMENT_LINE	this.tp = new TracerPrintWriter(qw); 
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Actual writing occurs here. <p>Most subclasses of <code>WriterAppender</code> will need to override this method. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Actual writing occurs here. <p>Most subclasses of <code>WriterAppender</code> will need to override this method. @since 0.9.0 
protected	TokenNameprotected	
void	TokenNamevoid	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldFlush	TokenNameIdentifier	 should Flush
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The WriterAppender requires a layout. Hence, this method returns <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 The WriterAppender requires a layout. Hence, this method returns <code>true</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clear internal references to the writer and other variables. Subclasses can override this method for an alternate closing behavior. */	TokenNameCOMMENT_JAVADOC	 Clear internal references to the writer and other variables. Subclasses can override this method for an alternate closing behavior. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//this.tp = null; 	TokenNameCOMMENT_LINE	this.tp = null; 
}	TokenNameRBRACE	
/** Write a footer as produced by the embedded layout's {@link Layout#getFooter} method. */	TokenNameCOMMENT_JAVADOC	 Write a footer as produced by the embedded layout's {@link Layout#getFooter} method. 
protected	TokenNameprotected	
void	TokenNamevoid	
writeFooter	TokenNameIdentifier	 write Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Write a header as produced by the embedded layout's {@link Layout#getHeader} method. */	TokenNameCOMMENT_JAVADOC	 Write a header as produced by the embedded layout's {@link Layout#getHeader} method. 
protected	TokenNameprotected	
void	TokenNamevoid	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines whether the writer should be flushed after * this event is written. * * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 Determines whether the writer should be flushed after this event is written. * @since 1.2.16 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldFlush	TokenNameIdentifier	 should Flush
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
immediateFlush	TokenNameIdentifier	 immediate Flush
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
