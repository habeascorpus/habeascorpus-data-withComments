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
taskdefs	TokenNameIdentifier	 taskdefs
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
/** * Copies all data from an input stream to an output stream. * * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Copies all data from an input stream to an output stream. * @since Ant 1.2 
public	TokenNamepublic	
class	TokenNameclass	
StreamPumper	TokenNameIdentifier	 Stream Pumper
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SMALL_BUFFER_SIZE	TokenNameIdentifier	 SMALL  BUFFER  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
finish	TokenNameIdentifier	 finish
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
autoflush	TokenNameIdentifier	 autoflush
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
SMALL_BUFFER_SIZE	TokenNameIdentifier	 SMALL  BUFFER  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useAvailable	TokenNameIdentifier	 use Available
;	TokenNameSEMICOLON	
/** * Create a new StreamPumper. * * @param is input stream to read data from * @param os output stream to write data to. * @param closeWhenExhausted if true, the output stream will be closed when * the input is exhausted. */	TokenNameCOMMENT_JAVADOC	 Create a new StreamPumper. * @param is input stream to read data from @param os output stream to write data to. @param closeWhenExhausted if true, the output stream will be closed when the input is exhausted. 
public	TokenNamepublic	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new StreamPumper. * * <p><b>Note:</b> If you set useAvailable to true, you must * explicitly invoke {@link #stop stop} or interrupt the * corresponding Thread when you are done or the run method will * never finish on some JVMs (namely those where available returns * 0 on a closed stream). Setting it to true may also impact * performance negatively. This flag should only be set to true * if you intend to stop the pumper before the input stream gets * closed.</p> * * @param is input stream to read data from * @param os output stream to write data to. * @param closeWhenExhausted if true, the output stream will be closed when * the input is exhausted. * @param useAvailable whether the pumper should use {@link * java.io.InputStream#available available} to determine * whether input is ready, thus trying to emulate * non-blocking behavior. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Create a new StreamPumper. * <p><b>Note:</b> If you set useAvailable to true, you must explicitly invoke {@link #stop stop} or interrupt the corresponding Thread when you are done or the run method will never finish on some JVMs (namely those where available returns 0 on a closed stream). Setting it to true may also impact performance negatively. This flag should only be set to true if you intend to stop the pumper before the input stream gets closed.</p> * @param is input stream to read data from @param os output stream to write data to. @param closeWhenExhausted if true, the output stream will be closed when the input is exhausted. @param useAvailable whether the pumper should use {@link java.io.InputStream#available available} to determine whether input is ready, thus trying to emulate non-blocking behavior. * @since Ant 1.8.0 
public	TokenNamepublic	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useAvailable	TokenNameIdentifier	 use Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
=	TokenNameEQUAL	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useAvailable	TokenNameIdentifier	 use Available
=	TokenNameEQUAL	
useAvailable	TokenNameIdentifier	 use Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new StreamPumper. * * @param is input stream to read data from * @param os output stream to write data to. */	TokenNameCOMMENT_JAVADOC	 Create a new StreamPumper. * @param is input stream to read data from @param os output stream to write data to. 
public	TokenNamepublic	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether data should be flushed through to the output stream. * @param autoflush if true, push through data; if false, let it be buffered * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Set whether data should be flushed through to the output stream. @param autoflush if true, push through data; if false, let it be buffered @since Ant 1.6.3 
/*package*/	TokenNameCOMMENT_BLOCK	package
void	TokenNamevoid	
setAutoflush	TokenNameIdentifier	 set Autoflush
(	TokenNameLPAREN	
boolean	TokenNameboolean	
autoflush	TokenNameIdentifier	 autoflush
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
autoflush	TokenNameIdentifier	 autoflush
=	TokenNameEQUAL	
autoflush	TokenNameIdentifier	 autoflush
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies data from the input stream to the output stream. * * Terminates as soon as the input stream is closed or an error occurs. */	TokenNameCOMMENT_JAVADOC	 Copies data from the input stream to the output stream. * Terminates as soon as the input stream is closed or an error occurs. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
waitForInput	TokenNameIdentifier	 wait For Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finish	TokenNameIdentifier	 finish
||	TokenNameOR_OR	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
finish	TokenNameIdentifier	 finish
||	TokenNameOR_OR	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
autoflush	TokenNameIdentifier	 autoflush
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// likely PumpStreamHandler trying to stop us 	TokenNameCOMMENT_LINE	likely PumpStreamHandler trying to stop us 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tells whether the end of the stream has been reached. * @return true is the stream has been exhausted. */	TokenNameCOMMENT_JAVADOC	 Tells whether the end of the stream has been reached. @return true is the stream has been exhausted. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method blocks until the StreamPumper finishes. * @throws InterruptedException if interrupted. * @see #isFinished() */	TokenNameCOMMENT_JAVADOC	 This method blocks until the StreamPumper finishes. @throws InterruptedException if interrupted. @see #isFinished() 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the size in bytes of the read buffer. * @param bufferSize the buffer size to use. * @throws IllegalStateException if the StreamPumper is already running. */	TokenNameCOMMENT_JAVADOC	 Set the size in bytes of the read buffer. @param bufferSize the buffer size to use. @throws IllegalStateException if the StreamPumper is already running. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
started	TokenNameIdentifier	 started
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Cannot set buffer size on a running StreamPumper"	TokenNameStringLiteral	Cannot set buffer size on a running StreamPumper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size in bytes of the read buffer. * @return the int size of the read buffer. */	TokenNameCOMMENT_JAVADOC	 Get the size in bytes of the read buffer. @return the int size of the read buffer. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getBufferSize	TokenNameIdentifier	 get Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the exception encountered, if any. * @return the Exception encountered. */	TokenNameCOMMENT_JAVADOC	 Get the exception encountered, if any. @return the Exception encountered. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stop the pumper as soon as possible. * Note that it may continue to block on the input stream * but it will really stop the thread as soon as it gets EOF * or any byte, and it will be marked as finished. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Stop the pumper as soon as possible. Note that it may continue to block on the input stream but it will really stop the thread as soon as it gets EOF or any byte, and it will be marked as finished. @since Ant 1.6.3 
/*package*/	TokenNameCOMMENT_BLOCK	package
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
POLL_INTERVAL	TokenNameIdentifier	 POLL  INTERVAL
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
waitForInput	TokenNameIdentifier	 wait For Input
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useAvailable	TokenNameIdentifier	 use Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
finish	TokenNameIdentifier	 finish
&&	TokenNameAND_AND	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
POLL_INTERVAL	TokenNameIdentifier	 POLL  INTERVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
