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
util	TokenNameIdentifier	 util
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
PipedInputStream	TokenNameIdentifier	 Piped Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
Task	TokenNameIdentifier	 Task
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Special <code>PipedInputStream</code> that will not die * when the writing <code>Thread</code> is no longer alive. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Special <code>PipedInputStream</code> that will not die when the writing <code>Thread</code> is no longer alive. @since Ant 1.6.2 
public	TokenNamepublic	
class	TokenNameclass	
LeadPipeInputStream	TokenNameIdentifier	 Lead Pipe Input Stream
extends	TokenNameextends	
PipedInputStream	TokenNameIdentifier	 Piped Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProjectComponent	TokenNameIdentifier	 Project Component
managingPc	TokenNameIdentifier	 managing Pc
;	TokenNameSEMICOLON	
/** * Construct a new <code>LeadPipeInputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>LeadPipeInputStream</code>. 
public	TokenNamepublic	
LeadPipeInputStream	TokenNameIdentifier	 Lead Pipe Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>LeadPipeInputStream</code> * with the specified buffer size. * @param size the size of the circular buffer. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>LeadPipeInputStream</code> with the specified buffer size. @param size the size of the circular buffer. 
public	TokenNamepublic	
LeadPipeInputStream	TokenNameIdentifier	 Lead Pipe Input Stream
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>LeadPipeInputStream</code> to pull * from the specified <code>PipedOutputStream</code>. * @param src the <code>PipedOutputStream</code> source. * @throws IOException if unable to construct the stream. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>LeadPipeInputStream</code> to pull from the specified <code>PipedOutputStream</code>. @param src the <code>PipedOutputStream</code> source. @throws IOException if unable to construct the stream. 
public	TokenNamepublic	
LeadPipeInputStream	TokenNameIdentifier	 Lead Pipe Input Stream
(	TokenNameLPAREN	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>LeadPipeInputStream</code> to pull * from the specified <code>PipedOutputStream</code>, using a * circular buffer of the specified size. * @param src the <code>PipedOutputStream</code> source. * @param size the size of the circular buffer. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>LeadPipeInputStream</code> to pull from the specified <code>PipedOutputStream</code>, using a circular buffer of the specified size. @param src the <code>PipedOutputStream</code> source. @param size the size of the circular buffer. @throws IOException if there is an error. 
public	TokenNamepublic	
LeadPipeInputStream	TokenNameIdentifier	 Lead Pipe Input Stream
(	TokenNameLPAREN	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//inherit doc 	TokenNameCOMMENT_LINE	inherit doc 
/** * Read a byte from the stream. * @return the byte (0 to 255) or -1 if there are no more. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Read a byte from the stream. @return the byte (0 to 255) or -1 if there are no more. @throws IOException if there is an error. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
eyeOhEx	TokenNameIdentifier	 eye Oh Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
eyeOhEx	TokenNameIdentifier	 eye Oh Ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"write end dead"	TokenNameStringLiteral	write end dead
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"pipe broken"	TokenNameStringLiteral	pipe broken
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
<	TokenNameLESS	
super	TokenNamesuper	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
>	TokenNameGREATER	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"error at LeadPipeInputStream.read(): "	TokenNameStringLiteral	error at LeadPipeInputStream.read(): 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the size of the buffer. * @param size the new buffer size. Ignored if <= current size. */	TokenNameCOMMENT_JAVADOC	 Set the size of the buffer. @param size the new buffer size. Ignored if <= current size. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
>	TokenNameGREATER	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
-	TokenNameMINUS	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
outlen	TokenNameIdentifier	 outlen
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
outlen	TokenNameIdentifier	 outlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
outlen	TokenNameIdentifier	 outlen
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
+=	TokenNamePLUS_EQUAL	
outlen	TokenNameIdentifier	 outlen
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set a managing <code>Task</code> for * this <code>LeadPipeInputStream</code>. * @param task the managing <code>Task</code>. */	TokenNameCOMMENT_JAVADOC	 Set a managing <code>Task</code> for this <code>LeadPipeInputStream</code>. @param task the managing <code>Task</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setManagingTask	TokenNameIdentifier	 set Managing Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setManagingComponent	TokenNameIdentifier	 set Managing Component
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a managing <code>ProjectComponent</code> for * this <code>LeadPipeInputStream</code>. * @param pc the managing <code>ProjectComponent</code>. */	TokenNameCOMMENT_JAVADOC	 Set a managing <code>ProjectComponent</code> for this <code>LeadPipeInputStream</code>. @param pc the managing <code>ProjectComponent</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setManagingComponent	TokenNameIdentifier	 set Managing Component
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
managingPc	TokenNameIdentifier	 managing Pc
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log a message with the specified logging level. * @param message the <code>String</code> message. * @param loglevel the <code>int</code> logging level. */	TokenNameCOMMENT_JAVADOC	 Log a message with the specified logging level. @param message the <code>String</code> message. @param loglevel the <code>int</code> logging level. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
loglevel	TokenNameIdentifier	 loglevel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
managingPc	TokenNameIdentifier	 managing Pc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
managingPc	TokenNameIdentifier	 managing Pc
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
loglevel	TokenNameIdentifier	 loglevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loglevel	TokenNameIdentifier	 loglevel
>	TokenNameGREATER	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
