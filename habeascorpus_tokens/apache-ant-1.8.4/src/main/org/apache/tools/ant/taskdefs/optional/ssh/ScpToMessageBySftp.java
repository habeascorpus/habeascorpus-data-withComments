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
JSchException	TokenNameIdentifier	 J Sch Exception
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
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Utility class to carry out an upload by sftp. */	TokenNameCOMMENT_JAVADOC	 Utility class to carry out an upload by sftp. 
public	TokenNamepublic	
class	TokenNameclass	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
extends	TokenNameextends	
ScpToMessage	TokenNameIdentifier	 Scp To Message
/*AbstractSshMessage*/	TokenNameCOMMENT_BLOCK	AbstractSshMessage
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
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
remotePath	TokenNameIdentifier	 remote Path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
directoryList	TokenNameIdentifier	 directory List
;	TokenNameSEMICOLON	
/** * Constructor for a local file to remote. * @param verbose if true do verbose logging * @param session the scp session to use * @param aLocalFile the local file * @param aRemotePath the remote path * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor for a local file to remote. @param verbose if true do verbose logging @param session the scp session to use @param aLocalFile the local file @param aRemotePath the remote path @since Ant 1.7 
public	TokenNamepublic	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localFile	TokenNameIdentifier	 local File
=	TokenNameEQUAL	
aLocalFile	TokenNameIdentifier	 a Local File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a local directories to remote. * @param verbose if true do verbose logging * @param session the scp session to use * @param aDirectoryList a list of directories * @param aRemotePath the remote path * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor for a local directories to remote. @param verbose if true do verbose logging @param session the scp session to use @param aDirectoryList a list of directories @param aRemotePath the remote path @since Ant 1.7 
public	TokenNamepublic	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
aDirectoryList	TokenNameIdentifier	 a Directory List
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directoryList	TokenNameIdentifier	 directory List
=	TokenNameEQUAL	
aDirectoryList	TokenNameIdentifier	 a Directory List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpToMessage. * @param verbose if true do verbose logging * @param session the scp session to use * @param aRemotePath the remote path * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpToMessage. @param verbose if true do verbose logging @param session the scp session to use @param aRemotePath the remote path @since Ant 1.6.2 
private	TokenNameprivate	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemotePath	TokenNameIdentifier	 a Remote Path
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
remotePath	TokenNameIdentifier	 remote Path
=	TokenNameEQUAL	
aRemotePath	TokenNameIdentifier	 a Remote Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpToMessage. * @param session the scp session to use * @param aLocalFile the local file * @param aRemotePath the remote path */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpToMessage. @param session the scp session to use @param aLocalFile the local file @param aRemotePath the remote path 
public	TokenNamepublic	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for ScpToMessage. * @param session the scp session to use * @param aDirectoryList a list of directories * @param aRemotePath the remote path */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpToMessage. @param session the scp session to use @param aDirectoryList a list of directories @param aRemotePath the remote path 
public	TokenNamepublic	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
aDirectoryList	TokenNameIdentifier	 a Directory List
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
aDirectoryList	TokenNameIdentifier	 a Directory List
,	TokenNameCOMMA	
aRemotePath	TokenNameIdentifier	 a Remote Path
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
directoryList	TokenNameIdentifier	 directory List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doMultipleTransfer	TokenNameIdentifier	 do Multiple Transfer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doSingleTransfer	TokenNameIdentifier	 do Single Transfer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"done. "	TokenNameStringLiteral	done. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doSingleTransfer	TokenNameIdentifier	 do Single Transfer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openSftpChannel	TokenNameIdentifier	 open Sftp Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sendFileToRemote	TokenNameIdentifier	 send File To Remote
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
remotePath	TokenNameIdentifier	 remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSchException	TokenNameIdentifier	 J Sch Exception
schException	TokenNameIdentifier	 sch Exception
=	TokenNameEQUAL	
new	TokenNamenew	
JSchException	TokenNameIdentifier	 J Sch Exception
(	TokenNameLPAREN	
"Could not send '"	TokenNameStringLiteral	Could not send '
+	TokenNamePLUS	
localFile	TokenNameIdentifier	 local File
+	TokenNamePLUS	
"' to '"	TokenNameStringLiteral	' to '
+	TokenNamePLUS	
remotePath	TokenNameIdentifier	 remote Path
+	TokenNamePLUS	
"' - "	TokenNameStringLiteral	' - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
schException	TokenNameIdentifier	 sch Exception
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
schException	TokenNameIdentifier	 sch Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doMultipleTransfer	TokenNameIdentifier	 do Multiple Transfer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openSftpChannel	TokenNameIdentifier	 open Sftp Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
stat	TokenNameIdentifier	 stat
(	TokenNameLPAREN	
remotePath	TokenNameIdentifier	 remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
.	TokenNameDOT	
SSH_FX_NO_SUCH_FILE	TokenNameIdentifier	 SSH  FX  NO  SUCH  FILE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// dir does not exist. 	TokenNameCOMMENT_LINE	dir does not exist. 
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
remotePath	TokenNameIdentifier	 remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
JSchException	TokenNameIdentifier	 J Sch Exception
(	TokenNameLPAREN	
"failed to access remote dir '"	TokenNameStringLiteral	failed to access remote dir '
+	TokenNamePLUS	
remotePath	TokenNameIdentifier	 remote Path
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
cd	TokenNameIdentifier	 cd
(	TokenNameLPAREN	
remotePath	TokenNameIdentifier	 remote Path
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
"Could not CD to '"	TokenNameStringLiteral	Could not CD to '
+	TokenNamePLUS	
remotePath	TokenNameIdentifier	 remote Path
+	TokenNamePLUS	
"' - "	TokenNameStringLiteral	' - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Directory	TokenNameIdentifier	 Directory
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
directoryList	TokenNameIdentifier	 directory List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Sending directory "	TokenNameStringLiteral	Sending directory 
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sendDirectory	TokenNameIdentifier	 send Directory
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Error sending directory"	TokenNameStringLiteral	Error sending directory
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
JSchException	TokenNameIdentifier	 J Sch Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendDirectory	TokenNameIdentifier	 send Directory
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SftpException	TokenNameIdentifier	 Sftp Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
fileIt	TokenNameIdentifier	 file It
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
filesIterator	TokenNameIdentifier	 files Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileIt	TokenNameIdentifier	 file It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendFileToRemote	TokenNameIdentifier	 send File To Remote
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
fileIt	TokenNameIdentifier	 file It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
dirIt	TokenNameIdentifier	 dir It
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
directoryIterator	TokenNameIdentifier	 directory Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirIt	TokenNameIdentifier	 dir It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
)	TokenNameRPAREN	
dirIt	TokenNameIdentifier	 dir It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendDirectoryToRemote	TokenNameIdentifier	 send Directory To Remote
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendDirectoryToRemote	TokenNameIdentifier	 send Directory To Remote
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SftpException	TokenNameIdentifier	 Sftp Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
stat	TokenNameIdentifier	 stat
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// dir does not exist. 	TokenNameCOMMENT_LINE	dir does not exist. 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
.	TokenNameDOT	
SSH_FX_NO_SUCH_FILE	TokenNameIdentifier	 SSH  FX  NO  SUCH  FILE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
cd	TokenNameIdentifier	 cd
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendDirectory	TokenNameIdentifier	 send Directory
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
cd	TokenNameIdentifier	 cd
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendFileToRemote	TokenNameIdentifier	 send File To Remote
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
remotePath	TokenNameIdentifier	 remote Path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SftpException	TokenNameIdentifier	 Sftp Exception
{	TokenNameLBRACE	
long	TokenNamelong	
filesize	TokenNameIdentifier	 filesize
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remotePath	TokenNameIdentifier	 remote Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remotePath	TokenNameIdentifier	 remote Path
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
filesize	TokenNameIdentifier	 filesize
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
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trackProgress	TokenNameIdentifier	 track Progress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
getProgressMonitor	TokenNameIdentifier	 get Progress Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Sending: "	TokenNameStringLiteral	Sending: 
+	TokenNamePLUS	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
filesize	TokenNameIdentifier	 filesize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
remotePath	TokenNameIdentifier	 remote Path
,	TokenNameCOMMA	
monitor	TokenNameIdentifier	 monitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the local file. * @return the local file. */	TokenNameCOMMENT_JAVADOC	 Get the local file. @return the local file. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getLocalFile	TokenNameIdentifier	 get Local File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the remote path. * @return the remote path. */	TokenNameCOMMENT_JAVADOC	 Get the remote path. @return the remote path. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemotePath	TokenNameIdentifier	 get Remote Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remotePath	TokenNameIdentifier	 remote Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
