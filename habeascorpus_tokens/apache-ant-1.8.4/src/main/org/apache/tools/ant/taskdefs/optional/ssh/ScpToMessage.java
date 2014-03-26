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
Session	TokenNameIdentifier	 Session
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
/** * Utility class to carry out an upload scp transfer. */	TokenNameCOMMENT_JAVADOC	 Utility class to carry out an upload scp transfer. 
public	TokenNamepublic	
class	TokenNameclass	
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
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
/** * Constructor for ScpToMessage * @param session the ssh session to use */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpToMessage @param session the ssh session to use 
public	TokenNamepublic	
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
/** * Constructor for ScpToMessage * @param verbose if true do verbose logging * @param session the ssh session to use * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpToMessage @param verbose if true do verbose logging @param session the ssh session to use @since Ant 1.7 
public	TokenNamepublic	
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
/** * Constructor for a local file to remote. * @param verbose if true do verbose logging * @param session the scp session to use * @param aLocalFile the local file * @param aRemotePath the remote path * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Constructor for a local file to remote. @param verbose if true do verbose logging @param session the scp session to use @param aLocalFile the local file @param aRemotePath the remote path @since Ant 1.6.2 
public	TokenNamepublic	
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
/** * Constructor for a local directories to remote. * @param verbose if true do verbose logging * @param session the scp session to use * @param aDirectoryList a list of directories * @param aRemotePath the remote path * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Constructor for a local directories to remote. @param verbose if true do verbose logging @param session the scp session to use @param aDirectoryList a list of directories @param aRemotePath the remote path @since Ant 1.6.2 
public	TokenNamepublic	
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
ScpToMessage	TokenNameIdentifier	 Scp To Message
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
String	TokenNameIdentifier	 String
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
"scp -t "	TokenNameStringLiteral	scp -t 
+	TokenNamePLUS	
remotePath	TokenNameIdentifier	 remote Path
;	TokenNameSEMICOLON	
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openExecChannel	TokenNameIdentifier	 open Exec Channel
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
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
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendFileToRemote	TokenNameIdentifier	 send File To Remote
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
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
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
openExecChannel	TokenNameIdentifier	 open Exec Channel
(	TokenNameLPAREN	
"scp -r -d -t "	TokenNameStringLiteral	scp -r -d -t 
+	TokenNamePLUS	
remotePath	TokenNameIdentifier	 remote Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
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
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Directory	TokenNameIdentifier	 Directory
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
sendDirectory	TokenNameIdentifier	 send Directory
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
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
Directory	TokenNameIdentifier	 Directory
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
fileIt	TokenNameIdentifier	 file It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
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
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendDirectoryToRemote	TokenNameIdentifier	 send Directory To Remote
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"D0755 0 "	TokenNameStringLiteral	D0755 0 
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
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
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendDirectory	TokenNameIdentifier	 send Directory
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"E "	TokenNameStringLiteral	E 
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendFileToRemote	TokenNameIdentifier	 send File To Remote
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// send "C0644 filesize filename", where filename should not include '/' 	TokenNameCOMMENT_LINE	send "C0644 filesize filename", where filename should not include '/' 
long	TokenNamelong	
filesize	TokenNameIdentifier	 filesize
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"C0644 "	TokenNameStringLiteral	C0644 
+	TokenNamePLUS	
filesize	TokenNameIdentifier	 filesize
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// send a content of lfile 	TokenNameCOMMENT_LINE	send a content of lfile 
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
0	TokenNameIntegerLiteral	
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
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
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
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendAck	TokenNameIdentifier	 send Ack
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
waitForAck	TokenNameIdentifier	 wait For Ack
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
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
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the local file * @return the local file */	TokenNameCOMMENT_JAVADOC	 Get the local file @return the local file 
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
/** * Get the remote path * @return the remote path */	TokenNameCOMMENT_JAVADOC	 Get the remote path @return the remote path 
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
