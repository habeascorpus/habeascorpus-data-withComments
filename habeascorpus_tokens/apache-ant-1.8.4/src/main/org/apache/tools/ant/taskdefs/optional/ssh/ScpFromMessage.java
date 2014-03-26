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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ssh	TokenNameIdentifier	 ssh
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
JSchException	TokenNameIdentifier	 J Sch Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
Session	TokenNameIdentifier	 Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
SftpATTRS	TokenNameIdentifier	 Sftp ATTRS
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
SftpException	TokenNameIdentifier	 Sftp Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
Channel	TokenNameIdentifier	 Channel
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
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
/** * A helper object representing an scp download. */	TokenNameCOMMENT_JAVADOC	 A helper object representing an scp download. 
public	TokenNamepublic	
class	TokenNameclass	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
extends	TokenNameextends	
AbstractSshMessage	TokenNameIdentifier	 Abstract Ssh Message
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HUNDRED_KILOBYTES	TokenNameIdentifier	 HUNDRED  KILOBYTES
=	TokenNameEQUAL	
102400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
=	TokenNameEQUAL	
0x0a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
remoteFile	TokenNameIdentifier	 remote File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isRecursive	TokenNameIdentifier	 is Recursive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for ScpFromMessage * @param session the ssh session to use */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessage @param session the ssh session to use 
public	TokenNamepublic	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpFromMessage * @param verbose if true do verbose logging * @param session the ssh session to use * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessage @param verbose if true do verbose logging @param session the ssh session to use @since Ant 1.7 
public	TokenNamepublic	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpFromMessage. * @param verbose if true log extra information * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion (-r option to scp) * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessage. @param verbose if true log extra information @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion (-r option to scp) @since Ant 1.6.2 
public	TokenNamepublic	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
recursive	TokenNameIdentifier	 recursive
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpFromMessage. * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion (-r option to scp) */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessage. @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion (-r option to scp) 
public	TokenNamepublic	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpFromMessage. * @param verbose if true log extra information * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion (-r option to scp) * @param preserveLastModified whether to preserve file * modification times * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessage. @param verbose if true log extra information @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion (-r option to scp) @param preserveLastModified whether to preserve file modification times @since Ant 1.8.0 
public	TokenNamepublic	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
remoteFile	TokenNameIdentifier	 remote File
=	TokenNameEQUAL	
aRemoteFile	TokenNameIdentifier	 a Remote File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localFile	TokenNameIdentifier	 local File
=	TokenNameEQUAL	
aLocalFile	TokenNameIdentifier	 a Local File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isRecursive	TokenNameIdentifier	 is Recursive
=	TokenNameEQUAL	
recursive	TokenNameIdentifier	 recursive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Carry out the transfer. * @throws IOException on i/o errors * @throws JSchException on errors detected by scp */	TokenNameCOMMENT_JAVADOC	 Carry out the transfer. @throws IOException on i/o errors @throws JSchException on errors detected by scp 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"scp -f "	TokenNameStringLiteral	scp -f 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isRecursive	TokenNameIdentifier	 is Recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
"-r "	TokenNameStringLiteral	-r 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
remoteFile	TokenNameIdentifier	 remote File
;	TokenNameSEMICOLON	
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openExecChannel	TokenNameIdentifier	 open Exec Channel
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// get I/O streams for remote scp 	TokenNameCOMMENT_LINE	get I/O streams for remote scp 
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startRemoteCpProtocol	TokenNameIdentifier	 start Remote Cp Protocol
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"done "	TokenNameStringLiteral	done 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
getPreserveLastModified	TokenNameIdentifier	 get Preserve Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
startRemoteCpProtocol	TokenNameIdentifier	 start Remote Cp Protocol
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
startFile	TokenNameIdentifier	 start File
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// C0644 filesize filename - header for a regular file 	TokenNameCOMMENT_LINE	C0644 filesize filename - header for a regular file 
// T time 0 time 0\n - present if perserve time. 	TokenNameCOMMENT_LINE	T time 0 time 0\n - present if perserve time. 
// D directory - this is the header for a directory. 	TokenNameCOMMENT_LINE	D directory - this is the header for a directory. 
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
read	TokenNameIdentifier	 read
==	TokenNameEQUAL_EQUAL	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
serverResponse	TokenNameIdentifier	 server Response
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'C'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseAndFetchFile	TokenNameIdentifier	 parse And Fetch File
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
,	TokenNameCOMMA	
startFile	TokenNameIdentifier	 start File
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'D'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startFile	TokenNameIdentifier	 start File
=	TokenNameEQUAL	
parseAndCreateDirectory	TokenNameIdentifier	 parse And Create Directory
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
,	TokenNameCOMMA	
startFile	TokenNameIdentifier	 start File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startFile	TokenNameIdentifier	 start File
=	TokenNameEQUAL	
startFile	TokenNameIdentifier	 start File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\01'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\02'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this indicates an error. 	TokenNameCOMMENT_LINE	this indicates an error. 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
parseAndCreateDirectory	TokenNameIdentifier	 parse And Create Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverResponse	TokenNameIdentifier	 server Response
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// appears that the next token is not used and it's zero. 	TokenNameCOMMENT_LINE	appears that the next token is not used and it's zero. 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
directoryName	TokenNameIdentifier	 directory Name
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
directoryName	TokenNameIdentifier	 directory Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Creating: "	TokenNameStringLiteral	Creating: 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseAndFetchFile	TokenNameIdentifier	 parse And Fetch File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverResponse	TokenNameIdentifier	 server Response
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
filesize	TokenNameIdentifier	 filesize
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
serverResponse	TokenNameIdentifier	 server Response
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Receiving: "	TokenNameStringLiteral	Receiving: 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
filesize	TokenNameIdentifier	 filesize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
transferFile	TokenNameIdentifier	 transfer File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
:	TokenNameCOLON	
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
fetchFile	TokenNameIdentifier	 fetch File
(	TokenNameLPAREN	
transferFile	TokenNameIdentifier	 transfer File
,	TokenNameCOMMA	
filesize	TokenNameIdentifier	 filesize
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fetchFile	TokenNameIdentifier	 fetch File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
long	TokenNamelong	
filesize	TokenNameIdentifier	 filesize
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read a content of lfile 	TokenNameCOMMENT_LINE	read a content of lfile 
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only track progress for files larger than 100kb in verbose mode 	TokenNameCOMMENT_LINE	only track progress for files larger than 100kb in verbose mode 
boolean	TokenNameboolean	
trackProgress	TokenNameIdentifier	 track Progress
=	TokenNameEQUAL	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
filesize	TokenNameIdentifier	 filesize
>	TokenNameGREATER	
HUNDRED_KILOBYTES	TokenNameIdentifier	 HUNDRED  KILOBYTES
;	TokenNameSEMICOLON	
// since filesize keeps on decreasing we have to store the 	TokenNameCOMMENT_LINE	since filesize keeps on decreasing we have to store the 
// initial filesize 	TokenNameCOMMENT_LINE	initial filesize 
long	TokenNamelong	
initFilesize	TokenNameIdentifier	 init Filesize
=	TokenNameEQUAL	
filesize	TokenNameIdentifier	 filesize
;	TokenNameSEMICOLON	
int	TokenNameint	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
<	TokenNameLESS	
filesize	TokenNameIdentifier	 filesize
)	TokenNameRPAREN	
?	TokenNameQUESTION	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
filesize	TokenNameIdentifier	 filesize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"Unexpected end of stream."	TokenNameStringLiteral	Unexpected end of stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fos	TokenNameIdentifier	 fos
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
filesize	TokenNameIdentifier	 filesize
-=	TokenNameMINUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filesize	TokenNameIdentifier	 filesize
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trackProgress	TokenNameIdentifier	 track Progress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
=	TokenNameEQUAL	
trackProgress	TokenNameIdentifier	 track Progress
(	TokenNameLPAREN	
initFilesize	TokenNameIdentifier	 init Filesize
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
,	TokenNameCOMMA	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
long	TokenNamelong	
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logStats	TokenNameIdentifier	 log Stats
(	TokenNameLPAREN	
startTime	TokenNameIdentifier	 start Time
,	TokenNameCOMMA	
endTime	TokenNameIdentifier	 end Time
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPreserveLastModified	TokenNameIdentifier	 get Preserve Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
throws	TokenNamethrows	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
SftpATTRS	TokenNameIdentifier	 Sftp ATTRS
fileAttributes	TokenNameIdentifier	 file Attributes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openSftpChannel	TokenNameIdentifier	 open Sftp Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fileAttributes	TokenNameIdentifier	 file Attributes
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
lstat	TokenNameIdentifier	 lstat
(	TokenNameLPAREN	
remoteDir	TokenNameIdentifier	 remote Dir
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
)	TokenNameRPAREN	
+	TokenNamePLUS	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
JSchException	TokenNameIdentifier	 J Sch Exception
(	TokenNameLPAREN	
"failed to stat remote file"	TokenNameStringLiteral	failed to stat remote file
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFileLastModified	TokenNameIdentifier	 set File Last Modified
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
fileAttributes	TokenNameIdentifier	 file Attributes
.	TokenNameDOT	
getMTime	TokenNameIdentifier	 get M Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the directory part of the remote file, if any. */	TokenNameCOMMENT_JAVADOC	 returns the directory part of the remote file, if any. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
remoteDir	TokenNameIdentifier	 remote Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
remoteFile	TokenNameIdentifier	 remote File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
