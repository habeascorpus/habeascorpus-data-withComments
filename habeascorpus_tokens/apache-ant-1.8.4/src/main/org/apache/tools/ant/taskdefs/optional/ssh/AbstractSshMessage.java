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
ChannelExec	TokenNameIdentifier	 Channel Exec
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
ChannelSftp	TokenNameIdentifier	 Channel Sftp
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
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
OutputStream	TokenNameIdentifier	 Output Stream
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
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
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Abstract class for ssh upload and download */	TokenNameCOMMENT_JAVADOC	 Abstract class for ssh upload and download 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSshMessage	TokenNameIdentifier	 Abstract Ssh Message
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
=	TokenNameEQUAL	
1000.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LogListener	TokenNameIdentifier	 Log Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
LogListener	TokenNameIdentifier	 Log Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing; 	TokenNameCOMMENT_LINE	do nothing; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Constructor for AbstractSshMessage * @param session the ssh session to use */	TokenNameCOMMENT_JAVADOC	 Constructor for AbstractSshMessage @param session the ssh session to use 
public	TokenNamepublic	
AbstractSshMessage	TokenNameIdentifier	 Abstract Ssh Message
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for AbstractSshMessage * @param verbose if true do verbose logging * @param session the ssh session to use * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Constructor for AbstractSshMessage @param verbose if true do verbose logging @param session the ssh session to use @since Ant 1.6.2 
public	TokenNamepublic	
AbstractSshMessage	TokenNameIdentifier	 Abstract Ssh Message
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open an ssh channel. * @param command the command to use * @return the channel * @throws JSchException on error */	TokenNameCOMMENT_JAVADOC	 Open an ssh channel. @param command the command to use @return the channel @throws JSchException on error 
protected	TokenNameprotected	
Channel	TokenNameIdentifier	 Channel
openExecChannel	TokenNameIdentifier	 open Exec Channel
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
throws	TokenNamethrows	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
ChannelExec	TokenNameIdentifier	 Channel Exec
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChannelExec	TokenNameIdentifier	 Channel Exec
)	TokenNameRPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
openChannel	TokenNameIdentifier	 open Channel
(	TokenNameLPAREN	
"exec"	TokenNameStringLiteral	exec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open an ssh sftp channel. * @return the channel * @throws JSchException on error */	TokenNameCOMMENT_JAVADOC	 Open an ssh sftp channel. @return the channel @throws JSchException on error 
protected	TokenNameprotected	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
openSftpChannel	TokenNameIdentifier	 open Sftp Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
)	TokenNameRPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
openChannel	TokenNameIdentifier	 open Channel
(	TokenNameLPAREN	
"sftp"	TokenNameStringLiteral	sftp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send an ack. * @param out the output stream to use * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Send an ack. @param out the output stream to use @throws IOException on error 
protected	TokenNameprotected	
void	TokenNamevoid	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the response, throws a BuildException if the response * indicates an error. * @param in the input stream to use * @throws IOException on I/O error * @throws BuildException on other errors */	TokenNameCOMMENT_JAVADOC	 Reads the response, throws a BuildException if the response indicates an error. @param in the input stream to use @throws IOException on I/O error @throws BuildException on other errors 
protected	TokenNameprotected	
void	TokenNamevoid	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// b may be 0 for success, 	TokenNameCOMMENT_LINE	b may be 0 for success, 
// 1 for error, 	TokenNameCOMMENT_LINE	1 for error, 
// 2 for fatal error, 	TokenNameCOMMENT_LINE	2 for fatal error, 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// didn't receive any response 	TokenNameCOMMENT_LINE	didn't receive any response 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No response from server"	TokenNameStringLiteral	No response from server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"server indicated an error: "	TokenNameStringLiteral	server indicated an error: 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"server indicated a fatal error: "	TokenNameStringLiteral	server indicated a fatal error: 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"unknown response, code "	TokenNameStringLiteral	unknown response, code 
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
" message: "	TokenNameStringLiteral	 message: 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Carry out the transfer. * @throws IOException on I/O errors * @throws JSchException on ssh errors */	TokenNameCOMMENT_JAVADOC	 Carry out the transfer. @throws IOException on I/O errors @throws JSchException on ssh errors 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
;	TokenNameSEMICOLON	
/** * Set a log listener. * @param aListener the log listener */	TokenNameCOMMENT_JAVADOC	 Set a log listener. @param aListener the log listener 
public	TokenNamepublic	
void	TokenNamevoid	
setLogListener	TokenNameIdentifier	 set Log Listener
(	TokenNameLPAREN	
LogListener	TokenNameIdentifier	 Log Listener
aListener	TokenNameIdentifier	 a Listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
aListener	TokenNameIdentifier	 a Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log a message to the log listener. * @param message the message to log */	TokenNameCOMMENT_JAVADOC	 Log a message to the log listener. @param message the message to log 
protected	TokenNameprotected	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log transfer stats to the log listener. * @param timeStarted the time started * @param timeEnded the finishing time * @param totalLength the total length */	TokenNameCOMMENT_JAVADOC	 Log transfer stats to the log listener. @param timeStarted the time started @param timeEnded the finishing time @param totalLength the total length 
protected	TokenNameprotected	
void	TokenNamevoid	
logStats	TokenNameIdentifier	 log Stats
(	TokenNameLPAREN	
long	TokenNamelong	
timeStarted	TokenNameIdentifier	 time Started
,	TokenNameCOMMA	
long	TokenNamelong	
timeEnded	TokenNameIdentifier	 time Ended
,	TokenNameCOMMA	
long	TokenNamelong	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
timeEnded	TokenNameIdentifier	 time Ended
-	TokenNameMINUS	
timeStarted	TokenNameIdentifier	 time Started
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
;	TokenNameSEMICOLON	
NumberFormat	TokenNameIdentifier	 Number Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getNumberInstance	TokenNameIdentifier	 get Number Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"File transfer time: "	TokenNameStringLiteral	File transfer time: 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Average Rate: "	TokenNameStringLiteral	 Average Rate: 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
/	TokenNameDIVIDE	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
+	TokenNamePLUS	
" B/s"	TokenNameStringLiteral	 B/s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is the verbose attribute set. * @return true if the verbose attribute is set * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Is the verbose attribute set. @return true if the verbose attribute is set @since Ant 1.6.2 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Track progress every 10% if 100kb < filesize < 1mb. For larger * files track progress for every percent transmitted. * @param filesize the size of the file been transmitted * @param totalLength the total transmission size * @param percentTransmitted the current percent transmitted * @return the percent that the file is of the total */	TokenNameCOMMENT_JAVADOC	 Track progress every 10% if 100kb < filesize < 1mb. For larger files track progress for every percent transmitted. @param filesize the size of the file been transmitted @param totalLength the total transmission size @param percentTransmitted the current percent transmitted @return the percent that the file is of the total 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
trackProgress	TokenNameIdentifier	 track Progress
(	TokenNameLPAREN	
long	TokenNamelong	
filesize	TokenNameIdentifier	 filesize
,	TokenNameCOMMA	
long	TokenNamelong	
totalLength	TokenNameIdentifier	 total Length
,	TokenNameCOMMA	
int	TokenNameint	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
int	TokenNameint	
percent	TokenNameIdentifier	 percent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
filesize	TokenNameIdentifier	 filesize
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
percent	TokenNameIdentifier	 percent
>	TokenNameGREATER	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filesize	TokenNameIdentifier	 filesize
<	TokenNameLESS	
1048576	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
percent	TokenNameIdentifier	 percent
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
percent	TokenNameIdentifier	 percent
==	TokenNameEQUAL_EQUAL	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" 100%"	TokenNameStringLiteral	 100%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
percent	TokenNameIdentifier	 percent
==	TokenNameEQUAL_EQUAL	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" 50%"	TokenNameStringLiteral	 50%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
percent	TokenNameIdentifier	 percent
==	TokenNameEQUAL_EQUAL	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" 100%"	TokenNameStringLiteral	 100%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
return	TokenNamereturn	
percent	TokenNameIdentifier	 percent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ProgressMonitor	TokenNameIdentifier	 Progress Monitor
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the progress monitor. * @return the progress monitor. */	TokenNameCOMMENT_JAVADOC	 Get the progress monitor. @return the progress monitor. 
protected	TokenNameprotected	
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
getProgressMonitor	TokenNameIdentifier	 get Progress Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
monitor	TokenNameIdentifier	 monitor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressMonitor	TokenNameIdentifier	 Progress Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
monitor	TokenNameIdentifier	 monitor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ProgressMonitor	TokenNameIdentifier	 Progress Monitor
implements	TokenNameimplements	
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
initFileSize	TokenNameIdentifier	 init File Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
long	TokenNamelong	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFileSize	TokenNameIdentifier	 init File Size
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
long	TokenNamelong	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalLength	TokenNameIdentifier	 total Length
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
=	TokenNameEQUAL	
trackProgress	TokenNameIdentifier	 track Progress
(	TokenNameLPAREN	
initFileSize	TokenNameIdentifier	 init File Size
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
,	TokenNameCOMMA	
percentTransmitted	TokenNameIdentifier	 percent Transmitted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTotalLength	TokenNameIdentifier	 get Total Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalLength	TokenNameIdentifier	 total Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
