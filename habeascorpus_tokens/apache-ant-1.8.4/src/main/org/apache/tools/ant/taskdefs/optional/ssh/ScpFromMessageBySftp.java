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
SftpException	TokenNameIdentifier	 Sftp Exception
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
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
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
ScpFromMessageBySftp	TokenNameIdentifier	 Scp From Message By Sftp
extends	TokenNameextends	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
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
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for ScpFromMessageBySftp. * @param verbose if true log extra information * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessageBySftp. @param verbose if true log extra information @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion @since Ant 1.7 
public	TokenNamepublic	
ScpFromMessageBySftp	TokenNameIdentifier	 Scp From Message By Sftp
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
verbose	TokenNameIdentifier	 verbose
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
/** * Constructor for ScpFromMessageBySftp. * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessageBySftp. @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion 
public	TokenNamepublic	
ScpFromMessageBySftp	TokenNameIdentifier	 Scp From Message By Sftp
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
/** * Constructor for ScpFromMessageBySftp. * @param verbose if true log extra information * @param session the Scp session to use * @param aRemoteFile the remote file name * @param aLocalFile the local file * @param recursive if true use recursion * @param preserveLastModified whether to preserve file * modification times * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Constructor for ScpFromMessageBySftp. @param verbose if true log extra information @param session the Scp session to use @param aRemoteFile the remote file name @param aLocalFile the local file @param recursive if true use recursion @param preserveLastModified whether to preserve file modification times @since Ant 1.8.0 
public	TokenNamepublic	
ScpFromMessageBySftp	TokenNameIdentifier	 Scp From Message By Sftp
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
,	TokenNameCOMMA	
aRemoteFile	TokenNameIdentifier	 a Remote File
,	TokenNameCOMMA	
aLocalFile	TokenNameIdentifier	 a Local File
,	TokenNameCOMMA	
recursive	TokenNameIdentifier	 recursive
,	TokenNameCOMMA	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
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
SftpATTRS	TokenNameIdentifier	 Sftp ATTRS
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
stat	TokenNameIdentifier	 stat
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remoteFile	TokenNameIdentifier	 remote File
=	TokenNameEQUAL	
remoteFile	TokenNameIdentifier	 remote File
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SftpException	TokenNameIdentifier	 Sftp Exception
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignored 	TokenNameCOMMENT_LINE	Ignored 
}	TokenNameRBRACE	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
remoteFile	TokenNameIdentifier	 remote File
,	TokenNameCOMMA	
localFile	TokenNameIdentifier	 local File
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
"Could not get '"	TokenNameStringLiteral	Could not get '
+	TokenNamePLUS	
remoteFile	TokenNameIdentifier	 remote File
+	TokenNamePLUS	
"' to '"	TokenNameStringLiteral	' to '
+	TokenNamePLUS	
localFile	TokenNameIdentifier	 local File
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
private	TokenNameprivate	
void	TokenNamevoid	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
remoteFile	TokenNameIdentifier	 remote File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SftpException	TokenNameIdentifier	 Sftp Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pwd	TokenNameIdentifier	 pwd
=	TokenNameEQUAL	
remoteFile	TokenNameIdentifier	 remote File
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pwd	TokenNameIdentifier	 pwd
=	TokenNameEQUAL	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
remoteFile	TokenNameIdentifier	 remote File
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
cd	TokenNameIdentifier	 cd
(	TokenNameLPAREN	
pwd	TokenNameIdentifier	 pwd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
.	TokenNameDOT	
LsEntry	TokenNameIdentifier	 Ls Entry
le	TokenNameIdentifier	 le
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
.	TokenNameDOT	
LsEntry	TokenNameIdentifier	 Ls Entry
)	TokenNameRPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getAttrs	TokenNameIdentifier	 get Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
pwd	TokenNameIdentifier	 pwd
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
le	TokenNameIdentifier	 le
,	TokenNameCOMMA	
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
ChannelSftp	TokenNameIdentifier	 Channel Sftp
.	TokenNameDOT	
LsEntry	TokenNameIdentifier	 Ls Entry
le	TokenNameIdentifier	 le
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SftpException	TokenNameIdentifier	 Sftp Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
remoteFile	TokenNameIdentifier	 remote File
=	TokenNameEQUAL	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localFile	TokenNameIdentifier	 local File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
,	TokenNameCOMMA	
remoteFile	TokenNameIdentifier	 remote File
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
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getAttrs	TokenNameIdentifier	 get Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SftpProgressMonitor	TokenNameIdentifier	 Sftp Progress Monitor
monitor	TokenNameIdentifier	 monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
trackProgress	TokenNameIdentifier	 track Progress
=	TokenNameEQUAL	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
totalLength	TokenNameIdentifier	 total Length
>	TokenNameGREATER	
HUNDRED_KILOBYTES	TokenNameIdentifier	 HUNDRED  KILOBYTES
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
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Receiving: "	TokenNameStringLiteral	Receiving: 
+	TokenNamePLUS	
remoteFile	TokenNameIdentifier	 remote File
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getAttrs	TokenNameIdentifier	 get Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
remoteFile	TokenNameIdentifier	 remote File
,	TokenNameCOMMA	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
monitor	TokenNameIdentifier	 monitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
totalLength	TokenNameIdentifier	 total Length
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
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getAttrs	TokenNameIdentifier	 get Attrs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
