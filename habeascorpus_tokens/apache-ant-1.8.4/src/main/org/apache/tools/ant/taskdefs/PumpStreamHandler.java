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
/** * Copies standard output and error of subprocesses to standard output and * error of the parent process. * * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Copies standard output and error of subprocesses to standard output and error of the parent process. * @since Ant 1.2 
public	TokenNamepublic	
class	TokenNameclass	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
implements	TokenNameimplements	
ExecuteStreamHandler	TokenNameIdentifier	 Execute Stream Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
outputThread	TokenNameIdentifier	 output Thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
errorThread	TokenNameIdentifier	 error Thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
inputThread	TokenNameIdentifier	 input Thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
nonBlockingRead	TokenNameIdentifier	 non Blocking Read
;	TokenNameSEMICOLON	
/** * Construct a new <code>PumpStreamHandler</code>. * @param out the output <code>OutputStream</code>. * @param err the error <code>OutputStream</code>. * @param input the input <code>InputStream</code>. * @param nonBlockingRead set it to <code>true</code> if the input should be * read with simulated non blocking IO. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>PumpStreamHandler</code>. @param out the output <code>OutputStream</code>. @param err the error <code>OutputStream</code>. @param input the input <code>InputStream</code>. @param nonBlockingRead set it to <code>true</code> if the input should be read with simulated non blocking IO. 
public	TokenNamepublic	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
boolean	TokenNameboolean	
nonBlockingRead	TokenNameIdentifier	 non Blocking Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nonBlockingRead	TokenNameIdentifier	 non Blocking Read
=	TokenNameEQUAL	
nonBlockingRead	TokenNameIdentifier	 non Blocking Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>PumpStreamHandler</code>. * @param out the output <code>OutputStream</code>. * @param err the error <code>OutputStream</code>. * @param input the input <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>PumpStreamHandler</code>. @param out the output <code>OutputStream</code>. @param err the error <code>OutputStream</code>. @param input the input <code>InputStream</code>. 
public	TokenNamepublic	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>PumpStreamHandler</code>. * @param out the output <code>OutputStream</code>. * @param err the error <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>PumpStreamHandler</code>. @param out the output <code>OutputStream</code>. @param err the error <code>OutputStream</code>. 
public	TokenNamepublic	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>PumpStreamHandler</code>. * @param outAndErr the output/error <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>PumpStreamHandler</code>. @param outAndErr the output/error <code>OutputStream</code>. 
public	TokenNamepublic	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
outAndErr	TokenNameIdentifier	 out And Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
outAndErr	TokenNameIdentifier	 out And Err
,	TokenNameCOMMA	
outAndErr	TokenNameIdentifier	 out And Err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>PumpStreamHandler</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>PumpStreamHandler</code>. 
public	TokenNamepublic	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the <code>InputStream</code> from which to read the * standard output of the process. * @param is the <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Set the <code>InputStream</code> from which to read the standard output of the process. @param is the <code>InputStream</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessOutputStream	TokenNameIdentifier	 set Process Output Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createProcessOutputPump	TokenNameIdentifier	 create Process Output Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the <code>InputStream</code> from which to read the * standard error of the process. * @param is the <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Set the <code>InputStream</code> from which to read the standard error of the process. @param is the <code>InputStream</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessErrorStream	TokenNameIdentifier	 set Process Error Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createProcessErrorPump	TokenNameIdentifier	 create Process Error Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the <code>OutputStream</code> by means of which * input can be sent to the process. * @param os the <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Set the <code>OutputStream</code> by means of which input can be sent to the process. @param os the <code>OutputStream</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessInputStream	TokenNameIdentifier	 set Process Input Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputThread	TokenNameIdentifier	 input Thread
=	TokenNameEQUAL	
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
nonBlockingRead	TokenNameIdentifier	 non Blocking Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
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
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Start the <code>Thread</code>s. */	TokenNameCOMMENT_JAVADOC	 Start the <code>Thread</code>s. 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputThread	TokenNameIdentifier	 output Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorThread	TokenNameIdentifier	 error Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputThread	TokenNameIdentifier	 input Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputThread	TokenNameIdentifier	 input Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Stop pumping the streams. */	TokenNameCOMMENT_JAVADOC	 Stop pumping the streams. 
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
inputThread	TokenNameIdentifier	 input Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
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
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
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
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
outputThread	TokenNameIdentifier	 output Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
errorThread	TokenNameIdentifier	 error Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
JOIN_TIMEOUT	TokenNameIdentifier	 JOIN  TIMEOUT
=	TokenNameEQUAL	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Waits for a thread to finish while trying to make it finish * quicker by stopping the pumper (if the thread is a {@link * ThreadWithPumper ThreadWithPumper} instance) or interrupting * the thread. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Waits for a thread to finish while trying to make it finish quicker by stopping the pumper (if the thread is a {@link ThreadWithPumper ThreadWithPumper} instance) or interrupting the thread. * @since Ant 1.8.0 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to terminate 	TokenNameCOMMENT_LINE	nothing to terminate 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
StreamPumper	TokenNameIdentifier	 Stream Pumper
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
ThreadWithPumper	TokenNameIdentifier	 Thread With Pumper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadWithPumper	TokenNameIdentifier	 Thread With Pumper
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getPumper	TokenNameIdentifier	 get Pumper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
JOIN_TIMEOUT	TokenNameIdentifier	 JOIN  TIMEOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
JOIN_TIMEOUT	TokenNameIdentifier	 JOIN  TIMEOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the error stream. * @return <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Get the error stream. @return <code>OutputStream</code>. 
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
getErr	TokenNameIdentifier	 get Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the output stream. * @return <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Get the output stream. @return <code>OutputStream</code>. 
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
getOut	TokenNameIdentifier	 get Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the pump to handle process output. * @param is the <code>InputStream</code>. * @param os the <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Create the pump to handle process output. @param is the <code>InputStream</code>. @param os the <code>OutputStream</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
createProcessOutputPump	TokenNameIdentifier	 create Process Output Pump
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputThread	TokenNameIdentifier	 output Thread
=	TokenNameEQUAL	
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the pump to handle error output. * @param is the input stream to copy from. * @param os the output stream to copy to. */	TokenNameCOMMENT_JAVADOC	 Create the pump to handle error output. @param is the input stream to copy from. @param os the output stream to copy to. 
protected	TokenNameprotected	
void	TokenNamevoid	
createProcessErrorPump	TokenNameIdentifier	 create Process Error Pump
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorThread	TokenNameIdentifier	 error Thread
=	TokenNameEQUAL	
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream pumper to copy the given input stream to the * given output stream. * @param is the input stream to copy from. * @param os the output stream to copy to. * @return a thread object that does the pumping. */	TokenNameCOMMENT_JAVADOC	 Creates a stream pumper to copy the given input stream to the given output stream. @param is the input stream to copy from. @param os the output stream to copy to. @return a thread object that does the pumping. 
protected	TokenNameprotected	
Thread	TokenNameIdentifier	 Thread
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream pumper to copy the given input stream to the * given output stream. * @param is the input stream to copy from. * @param os the output stream to copy to. * @param closeWhenExhausted if true close the inputstream. * @return a thread object that does the pumping, subclasses * should return an instance of {@link ThreadWithPumper * ThreadWithPumper}. */	TokenNameCOMMENT_JAVADOC	 Creates a stream pumper to copy the given input stream to the given output stream. @param is the input stream to copy from. @param os the output stream to copy to. @param closeWhenExhausted if true close the inputstream. @return a thread object that does the pumping, subclasses should return an instance of {@link ThreadWithPumper ThreadWithPumper}. 
protected	TokenNameprotected	
Thread	TokenNameIdentifier	 Thread
createPump	TokenNameIdentifier	 create Pump
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
return	TokenNamereturn	
createPump	TokenNameIdentifier	 create Pump
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream pumper to copy the given input stream to the * given output stream. * @param is the input stream to copy from. * @param os the output stream to copy to. * @param closeWhenExhausted if true close the inputstream. * @param nonBlockingIO set it to <code>true</code> to use simulated non * blocking IO. * @return a thread object that does the pumping, subclasses * should return an instance of {@link ThreadWithPumper * ThreadWithPumper}. * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Creates a stream pumper to copy the given input stream to the given output stream. @param is the input stream to copy from. @param os the output stream to copy to. @param closeWhenExhausted if true close the inputstream. @param nonBlockingIO set it to <code>true</code> to use simulated non blocking IO. @return a thread object that does the pumping, subclasses should return an instance of {@link ThreadWithPumper ThreadWithPumper}. @since Ant 1.8.2 
protected	TokenNameprotected	
Thread	TokenNameIdentifier	 Thread
createPump	TokenNameIdentifier	 create Pump
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
nonBlockingIO	TokenNameIdentifier	 non Blocking IO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamPumper	TokenNameIdentifier	 Stream Pumper
pumper	TokenNameIdentifier	 pumper
=	TokenNameEQUAL	
new	TokenNamenew	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
closeWhenExhausted	TokenNameIdentifier	 close When Exhausted
,	TokenNameCOMMA	
nonBlockingIO	TokenNameIdentifier	 non Blocking IO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pumper	TokenNameIdentifier	 pumper
.	TokenNameDOT	
setAutoflush	TokenNameIdentifier	 set Autoflush
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadWithPumper	TokenNameIdentifier	 Thread With Pumper
(	TokenNameLPAREN	
pumper	TokenNameIdentifier	 pumper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specialized subclass that allows access to the running StreamPumper. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Specialized subclass that allows access to the running StreamPumper. * @since Ant 1.8.0 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ThreadWithPumper	TokenNameIdentifier	 Thread With Pumper
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
StreamPumper	TokenNameIdentifier	 Stream Pumper
pumper	TokenNameIdentifier	 pumper
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThreadWithPumper	TokenNameIdentifier	 Thread With Pumper
(	TokenNameLPAREN	
StreamPumper	TokenNameIdentifier	 Stream Pumper
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pumper	TokenNameIdentifier	 pumper
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
StreamPumper	TokenNameIdentifier	 Stream Pumper
getPumper	TokenNameIdentifier	 get Pumper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pumper	TokenNameIdentifier	 pumper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
