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
File	TokenNameIdentifier	 File
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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
/** * Special <code>InputStream</code> that will * concatenate the contents of an array of files. */	TokenNameCOMMENT_JAVADOC	 Special <code>InputStream</code> that will concatenate the contents of an array of files. 
public	TokenNamepublic	
class	TokenNameclass	
ConcatFileInputStream	TokenNameIdentifier	 Concat File Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
currentStream	TokenNameIdentifier	 current Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProjectComponent	TokenNameIdentifier	 Project Component
managingPc	TokenNameIdentifier	 managing Pc
;	TokenNameSEMICOLON	
/** * Construct a new <code>ConcatFileInputStream</code> * with the specified <code>File[]</code>. * @param file <code>File[]</code>. * @throws IOException if I/O errors occur. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>ConcatFileInputStream</code> with the specified <code>File[]</code>. @param file <code>File[]</code>. @throws IOException if I/O errors occur. 
public	TokenNamepublic	
ConcatFileInputStream	TokenNameIdentifier	 Concat File Input Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the stream. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Close the stream. @throws IOException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
closeCurrent	TokenNameIdentifier	 close Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a byte. * @return the byte (0 - 255) or -1 if this is the end of the stream. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Read a byte. @return the byte (0 - 255) or -1 if this is the end of the stream. @throws IOException if there is an error. 
public	TokenNamepublic	
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
readCurrent	TokenNameIdentifier	 read Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
EOF	TokenNameIdentifier	 EOF
&&	TokenNameAND_AND	
!	TokenNameNOT	
eof	TokenNameIdentifier	 eof
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
readCurrent	TokenNameIdentifier	 read Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a managing <code>Task</code> for * this <code>ConcatFileInputStream</code>. * @param task the managing <code>Task</code>. */	TokenNameCOMMENT_JAVADOC	 Set a managing <code>Task</code> for this <code>ConcatFileInputStream</code>. @param task the managing <code>Task</code>. 
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
/** * Set a managing <code>Task</code> for * this <code>ConcatFileInputStream</code>. * @param pc the managing <code>Task</code>. */	TokenNameCOMMENT_JAVADOC	 Set a managing <code>Task</code> for this <code>ConcatFileInputStream</code>. @param pc the managing <code>Task</code>. 
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
private	TokenNameprivate	
int	TokenNameint	
readCurrent	TokenNameIdentifier	 read Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
eof	TokenNameIdentifier	 eof
||	TokenNameOR_OR	
currentStream	TokenNameIdentifier	 current Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
EOF	TokenNameIdentifier	 EOF
:	TokenNameCOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
closeCurrent	TokenNameIdentifier	 close Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Opening "	TokenNameStringLiteral	Opening 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
eyeOhEx	TokenNameIdentifier	 eye Oh Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Failed to open "	TokenNameStringLiteral	Failed to open 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
eyeOhEx	TokenNameIdentifier	 eye Oh Ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
closeCurrent	TokenNameIdentifier	 close Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
