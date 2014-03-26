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
net	TokenNameIdentifier	 net
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
FileSet	TokenNameIdentifier	 File Set
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
LoaderUtils	TokenNameIdentifier	 Loader Utils
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
Retryable	TokenNameIdentifier	 Retryable
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
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
;	TokenNameSEMICOLON	
/** * Basic FTP client. Performs the following actions: * <ul> * <li> <strong>send</strong> - send files to a remote server. This is the * default action.</li> * <li> <strong>get</strong> - retrieve files from a remote server.</li> * <li> <strong>del</strong> - delete files from a remote server.</li> * <li> <strong>list</strong> - create a file listing.</li> * <li> <strong>chmod</strong> - change unix file permissions.</li> * <li> <strong>rmdir</strong> - remove directories, if empty, from a * remote server.</li> * </ul> * <strong>Note:</strong> Some FTP servers - notably the Solaris server - seem * to hold data ports open after a "retr" operation, allowing them to timeout * instead of shutting them down cleanly. This happens in active or passive * mode, and the ports will remain open even after ending the FTP session. FTP * "send" operations seem to close ports immediately. This behavior may cause * problems on some systems when downloading large sets of files. * * @since Ant 1.3 */	TokenNameCOMMENT_JAVADOC	 Basic FTP client. Performs the following actions: <ul> <li> <strong>send</strong> - send files to a remote server. This is the default action.</li> <li> <strong>get</strong> - retrieve files from a remote server.</li> <li> <strong>del</strong> - delete files from a remote server.</li> <li> <strong>list</strong> - create a file listing.</li> <li> <strong>chmod</strong> - change unix file permissions.</li> <li> <strong>rmdir</strong> - remove directories, if empty, from a remote server.</li> </ul> <strong>Note:</strong> Some FTP servers - notably the Solaris server - seem to hold data ports open after a "retr" operation, allowing them to timeout instead of shutting them down cleanly. This happens in active or passive mode, and the ports will remain open even after ending the FTP session. FTP "send" operations seem to close ports immediately. This behavior may cause problems on some systems when downloading large sets of files. * @since Ant 1.3 
public	TokenNamepublic	
class	TokenNameclass	
FTPTask	TokenNameIdentifier	 FTP Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
FTPTaskConfig	TokenNameIdentifier	 FTP Task Config
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SEND_FILES	TokenNameIdentifier	 SEND  FILES
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_FILES	TokenNameIdentifier	 GET  FILES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL_FILES	TokenNameIdentifier	 DEL  FILES
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LIST_FILES	TokenNameIdentifier	 LIST  FILES
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MK_DIR	TokenNameIdentifier	 MK  DIR
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHMOD	TokenNameIdentifier	 CHMOD
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RM_DIR	TokenNameIdentifier	 RM  DIR
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SITE_CMD	TokenNameIdentifier	 SITE  CMD
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** adjust uptodate calculations where server timestamps are HH:mm and client's * are HH:mm:ss */	TokenNameCOMMENT_JAVADOC	 adjust uptodate calculations where server timestamps are HH:mm and client's are HH:mm:ss 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
GRANULARITY_MINUTE	TokenNameIdentifier	 GRANULARITY  MINUTE
=	TokenNameEQUAL	
60000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Default port for FTP */	TokenNameCOMMENT_JAVADOC	 Default port for FTP 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_FTP_PORT	TokenNameIdentifier	 DEFAULT  FTP  PORT
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
remotedir	TokenNameIdentifier	 remotedir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userid	TokenNameIdentifier	 userid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
account	TokenNameIdentifier	 account
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
listing	TokenNameIdentifier	 listing
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
passive	TokenNameIdentifier	 passive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
newerOnly	TokenNameIdentifier	 newer Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeDiffMillis	TokenNameIdentifier	 time Diff Millis
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
granularityMillis	TokenNameIdentifier	 granularity Millis
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
timeDiffAuto	TokenNameIdentifier	 time Diff Auto
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
SEND_FILES	TokenNameIdentifier	 SEND  FILES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filesets	TokenNameIdentifier	 filesets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
remoteFileSep	TokenNameIdentifier	 remote File Sep
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
DEFAULT_FTP_PORT	TokenNameIdentifier	 DEFAULT  FTP  PORT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
skipFailedTransfers	TokenNameIdentifier	 skip Failed Transfers
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreNoncriticalErrors	TokenNameIdentifier	 ignore Noncritical Errors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
chmod	TokenNameIdentifier	 chmod
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
umask	TokenNameIdentifier	 umask
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FTPSystemType	TokenNameIdentifier	 FTP System Type
systemTypeKey	TokenNameIdentifier	 system Type Key
=	TokenNameEQUAL	
FTPSystemType	TokenNameIdentifier	 FTP System Type
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Granularity	TokenNameIdentifier	 Granularity
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
=	TokenNameEQUAL	
Granularity	TokenNameIdentifier	 Granularity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isConfigurationSet	TokenNameIdentifier	 is Configuration Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
retriesAllowed	TokenNameIdentifier	 retries Allowed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
siteCommand	TokenNameIdentifier	 site Command
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
initialSiteCommand	TokenNameIdentifier	 initial Site Command
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enableRemoteVerification	TokenNameIdentifier	 enable Remote Verification
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
mirrorLoader	TokenNameIdentifier	 mirror Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FTPTaskMirror	TokenNameIdentifier	 FTP Task Mirror
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ACTION_STRS	TokenNameIdentifier	 ACTION  STRS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"sending"	TokenNameStringLiteral	sending
,	TokenNameCOMMA	
"getting"	TokenNameStringLiteral	getting
,	TokenNameCOMMA	
"deleting"	TokenNameStringLiteral	deleting
,	TokenNameCOMMA	
"listing"	TokenNameStringLiteral	listing
,	TokenNameCOMMA	
"making directory"	TokenNameStringLiteral	making directory
,	TokenNameCOMMA	
"chmod"	TokenNameStringLiteral	chmod
,	TokenNameCOMMA	
"removing"	TokenNameStringLiteral	removing
,	TokenNameCOMMA	
"site"	TokenNameStringLiteral	site
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
COMPLETED_ACTION_STRS	TokenNameIdentifier	 COMPLETED  ACTION  STRS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"sent"	TokenNameStringLiteral	sent
,	TokenNameCOMMA	
"retrieved"	TokenNameStringLiteral	retrieved
,	TokenNameCOMMA	
"deleted"	TokenNameStringLiteral	deleted
,	TokenNameCOMMA	
"listed"	TokenNameStringLiteral	listed
,	TokenNameCOMMA	
"created directory"	TokenNameStringLiteral	created directory
,	TokenNameCOMMA	
"mode changed"	TokenNameStringLiteral	mode changed
,	TokenNameCOMMA	
"removed"	TokenNameStringLiteral	removed
,	TokenNameCOMMA	
"site command executed"	TokenNameStringLiteral	site command executed
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ACTION_TARGET_STRS	TokenNameIdentifier	 ACTION  TARGET  STRS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"files"	TokenNameStringLiteral	files
,	TokenNameCOMMA	
"files"	TokenNameStringLiteral	files
,	TokenNameCOMMA	
"files"	TokenNameStringLiteral	files
,	TokenNameCOMMA	
"files"	TokenNameStringLiteral	files
,	TokenNameCOMMA	
"directory"	TokenNameStringLiteral	directory
,	TokenNameCOMMA	
"files"	TokenNameStringLiteral	files
,	TokenNameCOMMA	
"directories"	TokenNameStringLiteral	directories
,	TokenNameCOMMA	
"site command"	TokenNameStringLiteral	site command
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Sets the remote directory where files will be placed. This may be a * relative or absolute path, and must be in the path syntax expected by * the remote server. No correction of path syntax will be performed. * * @param dir the remote directory name. */	TokenNameCOMMENT_JAVADOC	 Sets the remote directory where files will be placed. This may be a relative or absolute path, and must be in the path syntax expected by the remote server. No correction of path syntax will be performed. * @param dir the remote directory name. 
public	TokenNamepublic	
void	TokenNamevoid	
setRemotedir	TokenNameIdentifier	 set Remotedir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remotedir	TokenNameIdentifier	 remotedir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemotedir	TokenNameIdentifier	 get Remotedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remotedir	TokenNameIdentifier	 remotedir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the FTP server to send files to. * * @param server the remote server name. */	TokenNameCOMMENT_JAVADOC	 Sets the FTP server to send files to. * @param server the remote server name. 
public	TokenNamepublic	
void	TokenNamevoid	
setServer	TokenNameIdentifier	 set Server
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the FTP port used by the remote server. * * @param port the port on which the remote server is listening. */	TokenNameCOMMENT_JAVADOC	 Sets the FTP port used by the remote server. * @param port the port on which the remote server is listening. 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the login user id to use on the specified server. * * @param userid remote system userid. */	TokenNameCOMMENT_JAVADOC	 Sets the login user id to use on the specified server. * @param userid remote system userid. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserid	TokenNameIdentifier	 set Userid
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userid	TokenNameIdentifier	 userid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userid	TokenNameIdentifier	 userid
=	TokenNameEQUAL	
userid	TokenNameIdentifier	 userid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserid	TokenNameIdentifier	 get Userid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userid	TokenNameIdentifier	 userid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the login password for the given user id. * * @param password the password on the remote system. */	TokenNameCOMMENT_JAVADOC	 Sets the login password for the given user id. * @param password the password on the remote system. 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the login account to use on the specified server. * * @param pAccount the account name on remote system * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Sets the login account to use on the specified server. * @param pAccount the account name on remote system @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setAccount	TokenNameIdentifier	 set Account
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pAccount	TokenNameIdentifier	 p Account
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
account	TokenNameIdentifier	 account
=	TokenNameEQUAL	
pAccount	TokenNameIdentifier	 p Account
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAccount	TokenNameIdentifier	 get Account
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
account	TokenNameIdentifier	 account
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, uses binary mode, otherwise text mode (default is binary). * * @param binary if true use binary mode in transfers. */	TokenNameCOMMENT_JAVADOC	 If true, uses binary mode, otherwise text mode (default is binary). * @param binary if true use binary mode in transfers. 
public	TokenNamepublic	
void	TokenNamevoid	
setBinary	TokenNameIdentifier	 set Binary
(	TokenNameLPAREN	
boolean	TokenNameboolean	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
binary	TokenNameIdentifier	 binary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binary	TokenNameIdentifier	 binary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies whether to use passive mode. Set to true if you are behind a * firewall and cannot connect without it. Passive mode is disabled by * default. * * @param passive true is passive mode should be used. */	TokenNameCOMMENT_JAVADOC	 Specifies whether to use passive mode. Set to true if you are behind a firewall and cannot connect without it. Passive mode is disabled by default. * @param passive true is passive mode should be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setPassive	TokenNameIdentifier	 set Passive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
passive	TokenNameIdentifier	 passive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
passive	TokenNameIdentifier	 passive
=	TokenNameEQUAL	
passive	TokenNameIdentifier	 passive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPassive	TokenNameIdentifier	 is Passive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
passive	TokenNameIdentifier	 passive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set to true to receive notification about each file as it is * transferred. * * @param verbose true if verbose notifications are required. */	TokenNameCOMMENT_JAVADOC	 Set to true to receive notification about each file as it is transferred. * @param verbose true if verbose notifications are required. 
public	TokenNamepublic	
void	TokenNamevoid	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isVerbose	TokenNameIdentifier	 is Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A synonym for <tt>depends</tt>. Set to true to transmit only new * or changed files. * * See the related attributes timediffmillis and timediffauto. * * @param newer if true only transfer newer files. */	TokenNameCOMMENT_JAVADOC	 A synonym for <tt>depends</tt>. Set to true to transmit only new or changed files. * See the related attributes timediffmillis and timediffauto. * @param newer if true only transfer newer files. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewer	TokenNameIdentifier	 set Newer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newer	TokenNameIdentifier	 newer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
newerOnly	TokenNameIdentifier	 newer Only
=	TokenNameEQUAL	
newer	TokenNameIdentifier	 newer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNewer	TokenNameIdentifier	 is Newer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newerOnly	TokenNameIdentifier	 newer Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * number of milliseconds to add to the time on the remote machine * to get the time on the local machine. * * use in conjunction with <code>newer</code> * * @param timeDiffMillis number of milliseconds * * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 number of milliseconds to add to the time on the remote machine to get the time on the local machine. * use in conjunction with <code>newer</code> * @param timeDiffMillis number of milliseconds * @since ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeDiffMillis	TokenNameIdentifier	 set Time Diff Millis
(	TokenNameLPAREN	
long	TokenNamelong	
timeDiffMillis	TokenNameIdentifier	 time Diff Millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeDiffMillis	TokenNameIdentifier	 time Diff Millis
=	TokenNameEQUAL	
timeDiffMillis	TokenNameIdentifier	 time Diff Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTimeDiffMillis	TokenNameIdentifier	 get Time Diff Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeDiffMillis	TokenNameIdentifier	 time Diff Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * &quot;true&quot; to find out automatically the time difference * between local and remote machine. * * This requires right to create * and delete a temporary file in the remote directory. * * @param timeDiffAuto true = find automatically the time diff * * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 &quot;true&quot; to find out automatically the time difference between local and remote machine. * This requires right to create and delete a temporary file in the remote directory. * @param timeDiffAuto true = find automatically the time diff * @since ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeDiffAuto	TokenNameIdentifier	 set Time Diff Auto
(	TokenNameLPAREN	
boolean	TokenNameboolean	
timeDiffAuto	TokenNameIdentifier	 time Diff Auto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeDiffAuto	TokenNameIdentifier	 time Diff Auto
=	TokenNameEQUAL	
timeDiffAuto	TokenNameIdentifier	 time Diff Auto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isTimeDiffAuto	TokenNameIdentifier	 is Time Diff Auto
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeDiffAuto	TokenNameIdentifier	 time Diff Auto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set to true to preserve modification times for "gotten" files. * * @param preserveLastModified if true preserver modification times. */	TokenNameCOMMENT_JAVADOC	 Set to true to preserve modification times for "gotten" files. * @param preserveLastModified if true preserver modification times. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveLastModified	TokenNameIdentifier	 set Preserve Last Modified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPreserveLastModified	TokenNameIdentifier	 is Preserve Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set to true to transmit only files that are new or changed from their * remote counterparts. The default is to transmit all files. * * @param depends if true only transfer newer files. */	TokenNameCOMMENT_JAVADOC	 Set to true to transmit only files that are new or changed from their remote counterparts. The default is to transmit all files. * @param depends if true only transfer newer files. 
public	TokenNamepublic	
void	TokenNamevoid	
setDepends	TokenNameIdentifier	 set Depends
(	TokenNameLPAREN	
boolean	TokenNameboolean	
depends	TokenNameIdentifier	 depends
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
newerOnly	TokenNameIdentifier	 newer Only
=	TokenNameEQUAL	
depends	TokenNameIdentifier	 depends
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the remote file separator character. This normally defaults to the * Unix standard forward slash, but can be manually overridden using this * call if the remote server requires some other separator. Only the first * character of the string is used. * * @param separator the file separator on the remote system. */	TokenNameCOMMENT_JAVADOC	 Sets the remote file separator character. This normally defaults to the Unix standard forward slash, but can be manually overridden using this call if the remote server requires some other separator. Only the first character of the string is used. * @param separator the file separator on the remote system. 
public	TokenNamepublic	
void	TokenNamevoid	
setSeparator	TokenNameIdentifier	 set Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remoteFileSep	TokenNameIdentifier	 remote File Sep
=	TokenNameEQUAL	
separator	TokenNameIdentifier	 separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSeparator	TokenNameIdentifier	 get Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remoteFileSep	TokenNameIdentifier	 remote File Sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the file permission mode (Unix only) for files sent to the * server. * * @param theMode unix style file mode for the files sent to the remote * system. */	TokenNameCOMMENT_JAVADOC	 Sets the file permission mode (Unix only) for files sent to the server. * @param theMode unix style file mode for the files sent to the remote system. 
public	TokenNamepublic	
void	TokenNamevoid	
setChmod	TokenNameIdentifier	 set Chmod
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
theMode	TokenNameIdentifier	 the Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chmod	TokenNameIdentifier	 chmod
=	TokenNameEQUAL	
theMode	TokenNameIdentifier	 the Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getChmod	TokenNameIdentifier	 get Chmod
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chmod	TokenNameIdentifier	 chmod
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default mask for file creation on a unix server. * * @param theUmask unix style umask for files created on the remote server. */	TokenNameCOMMENT_JAVADOC	 Sets the default mask for file creation on a unix server. * @param theUmask unix style umask for files created on the remote server. 
public	TokenNamepublic	
void	TokenNamevoid	
setUmask	TokenNameIdentifier	 set Umask
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
theUmask	TokenNameIdentifier	 the Umask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
umask	TokenNameIdentifier	 umask
=	TokenNameEQUAL	
theUmask	TokenNameIdentifier	 the Umask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUmask	TokenNameIdentifier	 get Umask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
umask	TokenNameIdentifier	 umask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A set of files to upload or download * * @param set the set of files to be added to the list of files to be * transferred. */	TokenNameCOMMENT_JAVADOC	 A set of files to upload or download * @param set the set of files to be added to the list of files to be transferred. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getFilesets	TokenNameIdentifier	 get Filesets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filesets	TokenNameIdentifier	 filesets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the FTP action to be taken. Currently accepts "put", "get", "del", * "mkdir", "chmod", "list", and "site". * * @deprecated since 1.5.x. * setAction(String) is deprecated and is replaced with * setAction(FTP.Action) to make Ant's Introspection mechanism do the * work and also to encapsulate operations on the type in its own * class. * @ant.attribute ignore="true" * * @param action the FTP action to be performed. * * @throws BuildException if the action is not a valid action. */	TokenNameCOMMENT_JAVADOC	 Sets the FTP action to be taken. Currently accepts "put", "get", "del", "mkdir", "chmod", "list", and "site". * @deprecated since 1.5.x. setAction(String) is deprecated and is replaced with setAction(FTP.Action) to make Ant's Introspection mechanism do the work and also to encapsulate operations on the type in its own class. @ant.attribute ignore="true" * @param action the FTP action to be performed. * @throws BuildException if the action is not a valid action. 
public	TokenNamepublic	
void	TokenNamevoid	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The setAction(String) method has been deprecated."	TokenNameStringLiteral	DEPRECATED - The setAction(String) method has been deprecated.
+	TokenNamePLUS	
" Use setAction(FTP.Action) instead."	TokenNameStringLiteral	 Use setAction(FTP.Action) instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Action	TokenNameIdentifier	 Action
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
Action	TokenNameIdentifier	 Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the FTP action to be taken. Currently accepts "put", "get", "del", * "mkdir", "chmod", "list", and "site". * * @param action the FTP action to be performed. * * @throws BuildException if the action is not a valid action. */	TokenNameCOMMENT_JAVADOC	 Sets the FTP action to be taken. Currently accepts "put", "get", "del", "mkdir", "chmod", "list", and "site". * @param action the FTP action to be performed. * @throws BuildException if the action is not a valid action. 
public	TokenNamepublic	
void	TokenNamevoid	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
Action	TokenNameIdentifier	 Action
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The output file for the "list" action. This attribute is ignored for * any other actions. * * @param listing file in which to store the listing. */	TokenNameCOMMENT_JAVADOC	 The output file for the "list" action. This attribute is ignored for any other actions. * @param listing file in which to store the listing. 
public	TokenNamepublic	
void	TokenNamevoid	
setListing	TokenNameIdentifier	 set Listing
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
listing	TokenNameIdentifier	 listing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listing	TokenNameIdentifier	 listing
=	TokenNameEQUAL	
listing	TokenNameIdentifier	 listing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getListing	TokenNameIdentifier	 get Listing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listing	TokenNameIdentifier	 listing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, enables unsuccessful file put, delete and get * operations to be skipped with a warning and the remainder * of the files still transferred. * * @param skipFailedTransfers true if failures in transfers are ignored. */	TokenNameCOMMENT_JAVADOC	 If true, enables unsuccessful file put, delete and get operations to be skipped with a warning and the remainder of the files still transferred. * @param skipFailedTransfers true if failures in transfers are ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkipFailedTransfers	TokenNameIdentifier	 set Skip Failed Transfers
(	TokenNameLPAREN	
boolean	TokenNameboolean	
skipFailedTransfers	TokenNameIdentifier	 skip Failed Transfers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skipFailedTransfers	TokenNameIdentifier	 skip Failed Transfers
=	TokenNameEQUAL	
skipFailedTransfers	TokenNameIdentifier	 skip Failed Transfers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSkipFailedTransfers	TokenNameIdentifier	 is Skip Failed Transfers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
skipFailedTransfers	TokenNameIdentifier	 skip Failed Transfers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the flag to skip errors on directory creation. * (and maybe later other server specific errors) * * @param ignoreNoncriticalErrors true if non-critical errors should not * cause a failure. */	TokenNameCOMMENT_JAVADOC	 set the flag to skip errors on directory creation. (and maybe later other server specific errors) * @param ignoreNoncriticalErrors true if non-critical errors should not cause a failure. 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoreNoncriticalErrors	TokenNameIdentifier	 set Ignore Noncritical Errors
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreNoncriticalErrors	TokenNameIdentifier	 ignore Noncritical Errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreNoncriticalErrors	TokenNameIdentifier	 ignore Noncritical Errors
=	TokenNameEQUAL	
ignoreNoncriticalErrors	TokenNameIdentifier	 ignore Noncritical Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoreNoncriticalErrors	TokenNameIdentifier	 is Ignore Noncritical Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignoreNoncriticalErrors	TokenNameIdentifier	 ignore Noncritical Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isConfigurationSet	TokenNameIdentifier	 is Configuration Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isConfigurationSet	TokenNameIdentifier	 is Configuration Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
isConfigurationSet	TokenNameIdentifier	 is Configuration Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the systemTypeKey attribute. * Method for setting <code>FTPClientConfig</code> remote system key. * * @param systemKey the key to be set - BUT if blank * the default value of null (which signifies "autodetect") will be kept. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the systemTypeKey attribute. Method for setting <code>FTPClientConfig</code> remote system key. * @param systemKey the key to be set - BUT if blank the default value of null (which signifies "autodetect") will be kept. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemTypeKey	TokenNameIdentifier	 set System Type Key
(	TokenNameLPAREN	
FTPSystemType	TokenNameIdentifier	 FTP System Type
systemKey	TokenNameIdentifier	 system Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemKey	TokenNameIdentifier	 system Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
systemKey	TokenNameIdentifier	 system Key
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemTypeKey	TokenNameIdentifier	 system Type Key
=	TokenNameEQUAL	
systemKey	TokenNameIdentifier	 system Key
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the defaultDateFormatConfig attribute. * @param defaultDateFormat configuration to be set, unless it is * null or empty string, in which case ignored. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the defaultDateFormatConfig attribute. @param defaultDateFormat configuration to be set, unless it is null or empty string, in which case ignored. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultDateFormatConfig	TokenNameIdentifier	 set Default Date Format Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultDateFormat	TokenNameIdentifier	 default Date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultDateFormat	TokenNameIdentifier	 default Date Format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
defaultDateFormat	TokenNameIdentifier	 default Date Format
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
=	TokenNameEQUAL	
defaultDateFormat	TokenNameIdentifier	 default Date Format
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the recentDateFormatConfig attribute. * @param recentDateFormat configuration to be set, unless it is * null or empty string, in which case ignored. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the recentDateFormatConfig attribute. @param recentDateFormat configuration to be set, unless it is null or empty string, in which case ignored. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setRecentDateFormatConfig	TokenNameIdentifier	 set Recent Date Format Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
recentDateFormat	TokenNameIdentifier	 recent Date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
recentDateFormat	TokenNameIdentifier	 recent Date Format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
recentDateFormat	TokenNameIdentifier	 recent Date Format
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
=	TokenNameEQUAL	
recentDateFormat	TokenNameIdentifier	 recent Date Format
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the serverLanguageCode attribute. * @param serverLanguageCode configuration to be set, unless it is * null or empty string, in which case ignored. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the serverLanguageCode attribute. @param serverLanguageCode configuration to be set, unless it is null or empty string, in which case ignored. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setServerLanguageCodeConfig	TokenNameIdentifier	 set Server Language Code Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverLanguageCode	TokenNameIdentifier	 server Language Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverLanguageCode	TokenNameIdentifier	 server Language Code
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
serverLanguageCode	TokenNameIdentifier	 server Language Code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
=	TokenNameEQUAL	
serverLanguageCode	TokenNameIdentifier	 server Language Code
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the serverTimeZoneConfig attribute. * @param serverTimeZoneId configuration to be set, unless it is * null or empty string, in which case ignored. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the serverTimeZoneConfig attribute. @param serverTimeZoneId configuration to be set, unless it is null or empty string, in which case ignored. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setServerTimeZoneConfig	TokenNameIdentifier	 set Server Time Zone Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverTimeZoneId	TokenNameIdentifier	 server Time Zone Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverTimeZoneId	TokenNameIdentifier	 server Time Zone Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
serverTimeZoneId	TokenNameIdentifier	 server Time Zone Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
=	TokenNameEQUAL	
serverTimeZoneId	TokenNameIdentifier	 server Time Zone Id
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the shortMonthNamesConfig attribute * * @param shortMonthNames configuration to be set, unless it is * null or empty string, in which case ignored. * @see org.apache.commons.net.ftp.FTPClientConfig */	TokenNameCOMMENT_JAVADOC	 Sets the shortMonthNamesConfig attribute * @param shortMonthNames configuration to be set, unless it is null or empty string, in which case ignored. @see org.apache.commons.net.ftp.FTPClientConfig 
public	TokenNamepublic	
void	TokenNamevoid	
setShortMonthNamesConfig	TokenNameIdentifier	 set Short Month Names Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
shortMonthNames	TokenNameIdentifier	 short Month Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shortMonthNames	TokenNameIdentifier	 short Month Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
shortMonthNames	TokenNameIdentifier	 short Month Names
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
=	TokenNameEQUAL	
shortMonthNames	TokenNameIdentifier	 short Month Names
;	TokenNameSEMICOLON	
configurationHasBeenSet	TokenNameIdentifier	 configuration Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines how many times to retry executing FTP command before giving up. * Default is 0 - try once and if failure then give up. * * @param retriesAllowed number of retries to allow. -1 means * keep trying forever. "forever" may also be specified as a * synonym for -1. */	TokenNameCOMMENT_JAVADOC	 Defines how many times to retry executing FTP command before giving up. Default is 0 - try once and if failure then give up. * @param retriesAllowed number of retries to allow. -1 means keep trying forever. "forever" may also be specified as a synonym for -1. 
public	TokenNamepublic	
void	TokenNamevoid	
setRetriesAllowed	TokenNameIdentifier	 set Retries Allowed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
retriesAllowed	TokenNameIdentifier	 retries Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"FOREVER"	TokenNameStringLiteral	FOREVER
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
retriesAllowed	TokenNameIdentifier	 retries Allowed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
=	TokenNameEQUAL	
Retryable	TokenNameIdentifier	 Retryable
.	TokenNameDOT	
RETRY_FOREVER	TokenNameIdentifier	 RETRY  FOREVER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
retries	TokenNameIdentifier	 retries
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
retriesAllowed	TokenNameIdentifier	 retries Allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retries	TokenNameIdentifier	 retries
<	TokenNameLESS	
Retryable	TokenNameIdentifier	 Retryable
.	TokenNameDOT	
RETRY_FOREVER	TokenNameIdentifier	 RETRY  FOREVER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid value for retriesAllowed attribute: "	TokenNameStringLiteral	Invalid value for retriesAllowed attribute: 
+	TokenNamePLUS	
retriesAllowed	TokenNameIdentifier	 retries Allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
=	TokenNameEQUAL	
retries	TokenNameIdentifier	 retries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
px	TokenNameIdentifier	 px
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid value for retriesAllowed attribute: "	TokenNameStringLiteral	Invalid value for retriesAllowed attribute: 
+	TokenNamePLUS	
retriesAllowed	TokenNameIdentifier	 retries Allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRetriesAllowed	TokenNameIdentifier	 get Retries Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
retriesAllowed	TokenNameIdentifier	 retries Allowed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the systemTypeKey. */	TokenNameCOMMENT_JAVADOC	 @return Returns the systemTypeKey. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemTypeKey	TokenNameIdentifier	 get System Type Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
systemTypeKey	TokenNameIdentifier	 system Type Key
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the defaultDateFormatConfig. */	TokenNameCOMMENT_JAVADOC	 @return Returns the defaultDateFormatConfig. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDefaultDateFormatConfig	TokenNameIdentifier	 get Default Date Format Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the recentDateFormatConfig. */	TokenNameCOMMENT_JAVADOC	 @return Returns the recentDateFormatConfig. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRecentDateFormatConfig	TokenNameIdentifier	 get Recent Date Format Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the serverLanguageCodeConfig. */	TokenNameCOMMENT_JAVADOC	 @return Returns the serverLanguageCodeConfig. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getServerLanguageCodeConfig	TokenNameIdentifier	 get Server Language Code Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the serverTimeZoneConfig. */	TokenNameCOMMENT_JAVADOC	 @return Returns the serverTimeZoneConfig. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getServerTimeZoneConfig	TokenNameIdentifier	 get Server Time Zone Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the shortMonthNamesConfig. */	TokenNameCOMMENT_JAVADOC	 @return Returns the shortMonthNamesConfig. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getShortMonthNamesConfig	TokenNameIdentifier	 get Short Month Names Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the timestampGranularity. */	TokenNameCOMMENT_JAVADOC	 @return Returns the timestampGranularity. 
public	TokenNamepublic	
Granularity	TokenNameIdentifier	 Granularity
getTimestampGranularity	TokenNameIdentifier	 get Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the timestampGranularity attribute * @param timestampGranularity The timestampGranularity to set. */	TokenNameCOMMENT_JAVADOC	 Sets the timestampGranularity attribute @param timestampGranularity The timestampGranularity to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimestampGranularity	TokenNameIdentifier	 set Timestamp Granularity
(	TokenNameLPAREN	
Granularity	TokenNameIdentifier	 Granularity
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
||	TokenNameOR_OR	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
=	TokenNameEQUAL	
timestampGranularity	TokenNameIdentifier	 timestamp Granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the siteCommand attribute. This attribute * names the command that will be executed if the action * is "site". * @param siteCommand The siteCommand to set. */	TokenNameCOMMENT_JAVADOC	 Sets the siteCommand attribute. This attribute names the command that will be executed if the action is "site". @param siteCommand The siteCommand to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setSiteCommand	TokenNameIdentifier	 set Site Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
siteCommand	TokenNameIdentifier	 site Command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
siteCommand	TokenNameIdentifier	 site Command
=	TokenNameEQUAL	
siteCommand	TokenNameIdentifier	 site Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSiteCommand	TokenNameIdentifier	 get Site Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
siteCommand	TokenNameIdentifier	 site Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the initialSiteCommand attribute. This attribute * names a site command that will be executed immediately * after connection. * @param initialCommand The initialSiteCommand to set. */	TokenNameCOMMENT_JAVADOC	 Sets the initialSiteCommand attribute. This attribute names a site command that will be executed immediately after connection. @param initialCommand The initialSiteCommand to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setInitialSiteCommand	TokenNameIdentifier	 set Initial Site Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
initialCommand	TokenNameIdentifier	 initial Command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initialSiteCommand	TokenNameIdentifier	 initial Site Command
=	TokenNameEQUAL	
initialCommand	TokenNameIdentifier	 initial Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInitialSiteCommand	TokenNameIdentifier	 get Initial Site Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initialSiteCommand	TokenNameIdentifier	 initial Site Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getGranularityMillis	TokenNameIdentifier	 get Granularity Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
granularityMillis	TokenNameIdentifier	 granularity Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGranularityMillis	TokenNameIdentifier	 set Granularity Millis
(	TokenNameLPAREN	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
granularityMillis	TokenNameIdentifier	 granularity Millis
=	TokenNameEQUAL	
granularity	TokenNameIdentifier	 granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to verify that data and control connections are * connected to the same remote host. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether to verify that data and control connections are connected to the same remote host. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableRemoteVerification	TokenNameIdentifier	 set Enable Remote Verification
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enableRemoteVerification	TokenNameIdentifier	 enable Remote Verification
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getEnableRemoteVerification	TokenNameIdentifier	 get Enable Remote Verification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enableRemoteVerification	TokenNameIdentifier	 enable Remote Verification
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks to see that all required parameters are set. * * @throws BuildException if the configuration is not valid. */	TokenNameCOMMENT_JAVADOC	 Checks to see that all required parameters are set. * @throws BuildException if the configuration is not valid. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"server attribute must be set!"	TokenNameStringLiteral	server attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userid	TokenNameIdentifier	 userid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"userid attribute must be set!"	TokenNameStringLiteral	userid attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"password attribute must be set!"	TokenNameStringLiteral	password attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
LIST_FILES	TokenNameIdentifier	 LIST  FILES
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
listing	TokenNameIdentifier	 listing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"listing attribute must be set for list "	TokenNameStringLiteral	listing attribute must be set for list 
+	TokenNamePLUS	
"action!"	TokenNameStringLiteral	action!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
MK_DIR	TokenNameIdentifier	 MK  DIR
&&	TokenNameAND_AND	
remotedir	TokenNameIdentifier	 remotedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"remotedir attribute must be set for "	TokenNameStringLiteral	remotedir attribute must be set for 
+	TokenNamePLUS	
"mkdir action!"	TokenNameStringLiteral	mkdir action!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
CHMOD	TokenNameIdentifier	 CHMOD
&&	TokenNameAND_AND	
chmod	TokenNameIdentifier	 chmod
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"chmod attribute must be set for chmod "	TokenNameStringLiteral	chmod attribute must be set for chmod 
+	TokenNamePLUS	
"action!"	TokenNameStringLiteral	action!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
SITE_CMD	TokenNameIdentifier	 SITE  CMD
&&	TokenNameAND_AND	
siteCommand	TokenNameIdentifier	 site Command
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"sitecommand attribute must be set for site "	TokenNameStringLiteral	sitecommand attribute must be set for site 
+	TokenNamePLUS	
"action!"	TokenNameStringLiteral	action!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isConfigurationSet	TokenNameIdentifier	 is Configuration Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"org.apache.commons.net.ftp.FTPClientConfig"	TokenNameStringLiteral	org.apache.commons.net.ftp.FTPClientConfig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"commons-net.jar >= 1.4.0 is required for at least one"	TokenNameStringLiteral	commons-net.jar >= 1.4.0 is required for at least one
+	TokenNamePLUS	
" of the attributes specified."	TokenNameStringLiteral	 of the attributes specified.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Runs the task. * * @throws BuildException if the task fails or is not configured * correctly. */	TokenNameCOMMENT_JAVADOC	 Runs the task. * @throws BuildException if the task fails or is not configured correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setupFTPDelegate	TokenNameIdentifier	 setup FTP Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
doFTP	TokenNameIdentifier	 do FTP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mirrorLoader	TokenNameIdentifier	 mirror Loader
instanceof	TokenNameinstanceof	
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
)	TokenNameRPAREN	
mirrorLoader	TokenNameIdentifier	 mirror Loader
)	TokenNameRPAREN	
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mirrorLoader	TokenNameIdentifier	 mirror Loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setupFTPDelegate	TokenNameIdentifier	 setup FTP Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
myLoader	TokenNameIdentifier	 my Loader
=	TokenNameEQUAL	
FTPTask	TokenNameIdentifier	 FTP Task
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mustSplit	TokenNameIdentifier	 must Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mirrorLoader	TokenNameIdentifier	 mirror Loader
=	TokenNameEQUAL	
new	TokenNamenew	
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
(	TokenNameLPAREN	
myLoader	TokenNameIdentifier	 my Loader
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"FTPTaskMirrorImpl"	TokenNameStringLiteral	FTPTaskMirrorImpl
,	TokenNameCOMMA	
"FTPConfigurator"	TokenNameStringLiteral	FTPConfigurator
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mirrorLoader	TokenNameIdentifier	 mirror Loader
=	TokenNameEQUAL	
myLoader	TokenNameIdentifier	 my Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
createMirror	TokenNameIdentifier	 create Mirror
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
mirrorLoader	TokenNameIdentifier	 mirror Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
mustSplit	TokenNameIdentifier	 must Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
FTPTask	TokenNameIdentifier	 FTP Task
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"/org/apache/commons/net/"	TokenNameStringLiteral	/org/apache/commons/net/
+	TokenNamePLUS	
"ftp/FTP.class"	TokenNameStringLiteral	ftp/FTP.class
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
FTPTaskMirror	TokenNameIdentifier	 FTP Task Mirror
createMirror	TokenNameIdentifier	 create Mirror
(	TokenNameLPAREN	
FTPTask	TokenNameIdentifier	 FTP Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
"org.apache.commons.net.ftp.FTP"	TokenNameStringLiteral	org.apache.commons.net.ftp.FTP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check 	TokenNameCOMMENT_LINE	sanity check 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The <classpath> for <ftp> must include"	TokenNameStringLiteral	The <classpath> for <ftp> must include
+	TokenNamePLUS	
" commons-net.jar if not in Ant's own "	TokenNameStringLiteral	 commons-net.jar if not in Ant's own 
+	TokenNamePLUS	
" classpath"	TokenNameStringLiteral	 classpath
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
FTPTaskMirror	TokenNameIdentifier	 FTP Task Mirror
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"Impl"	TokenNameStringLiteral	Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Overdelegating loader"	TokenNameStringLiteral	Overdelegating loader
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Constructor	TokenNameIdentifier	 Constructor
cons	TokenNameIdentifier	 cons
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FTPTask	TokenNameIdentifier	 FTP Task
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
FTPTaskMirror	TokenNameIdentifier	 FTP Task Mirror
)	TokenNameRPAREN	
cons	TokenNameIdentifier	 cons
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * an action to perform, one of * "send", "put", "recv", "get", "del", "delete", "list", "mkdir", "chmod", * "rmdir" */	TokenNameCOMMENT_JAVADOC	 an action to perform, one of "send", "put", "recv", "get", "del", "delete", "list", "mkdir", "chmod", "rmdir" 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Action	TokenNameIdentifier	 Action
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"send"	TokenNameStringLiteral	send
,	TokenNameCOMMA	
"put"	TokenNameStringLiteral	put
,	TokenNameCOMMA	
"recv"	TokenNameStringLiteral	recv
,	TokenNameCOMMA	
"get"	TokenNameStringLiteral	get
,	TokenNameCOMMA	
"del"	TokenNameStringLiteral	del
,	TokenNameCOMMA	
"delete"	TokenNameStringLiteral	delete
,	TokenNameCOMMA	
"list"	TokenNameStringLiteral	list
,	TokenNameCOMMA	
"mkdir"	TokenNameStringLiteral	mkdir
,	TokenNameCOMMA	
"chmod"	TokenNameStringLiteral	chmod
,	TokenNameCOMMA	
"rmdir"	TokenNameStringLiteral	rmdir
,	TokenNameCOMMA	
"site"	TokenNameStringLiteral	site
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Get the valid values * * @return an array of the valid FTP actions. */	TokenNameCOMMENT_JAVADOC	 Get the valid values * @return an array of the valid FTP actions. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the symbolic equivalent of the action value. * * @return the SYMBOL representing the given action. */	TokenNameCOMMENT_JAVADOC	 Get the symbolic equivalent of the action value. * @return the SYMBOL representing the given action. 
public	TokenNamepublic	
int	TokenNameint	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
actionL	TokenNameIdentifier	 action L
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"send"	TokenNameStringLiteral	send
)	TokenNameRPAREN	
||	TokenNameOR_OR	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"put"	TokenNameStringLiteral	put
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SEND_FILES	TokenNameIdentifier	 SEND  FILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"recv"	TokenNameStringLiteral	recv
)	TokenNameRPAREN	
||	TokenNameOR_OR	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"get"	TokenNameStringLiteral	get
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
GET_FILES	TokenNameIdentifier	 GET  FILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"del"	TokenNameStringLiteral	del
)	TokenNameRPAREN	
||	TokenNameOR_OR	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"delete"	TokenNameStringLiteral	delete
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEL_FILES	TokenNameIdentifier	 DEL  FILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"list"	TokenNameStringLiteral	list
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LIST_FILES	TokenNameIdentifier	 LIST  FILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"chmod"	TokenNameStringLiteral	chmod
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CHMOD	TokenNameIdentifier	 CHMOD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"mkdir"	TokenNameStringLiteral	mkdir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MK_DIR	TokenNameIdentifier	 MK  DIR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"rmdir"	TokenNameStringLiteral	rmdir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RM_DIR	TokenNameIdentifier	 RM  DIR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
actionL	TokenNameIdentifier	 action L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"site"	TokenNameStringLiteral	site
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SITE_CMD	TokenNameIdentifier	 SITE  CMD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SEND_FILES	TokenNameIdentifier	 SEND  FILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * represents one of the valid timestamp adjustment values * recognized by the <code>timestampGranularity</code> attribute.<p> * A timestamp adjustment may be used in file transfers for checking * uptodateness. MINUTE means to add one minute to the server * timestamp. This is done because FTP servers typically list * timestamps HH:mm and client FileSystems typically use HH:mm:ss. * * The default is to use MINUTE for PUT actions and NONE for GET * actions, since GETs have the <code>preserveLastModified</code> * option, which takes care of the problem in most use cases where * this level of granularity is an issue. * */	TokenNameCOMMENT_JAVADOC	 represents one of the valid timestamp adjustment values recognized by the <code>timestampGranularity</code> attribute.<p> A timestamp adjustment may be used in file transfers for checking uptodateness. MINUTE means to add one minute to the server timestamp. This is done because FTP servers typically list timestamps HH:mm and client FileSystems typically use HH:mm:ss. * The default is to use MINUTE for PUT actions and NONE for GET actions, since GETs have the <code>preserveLastModified</code> option, which takes care of the problem in most use cases where this level of granularity is an issue. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Granularity	TokenNameIdentifier	 Granularity
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALID_GRANULARITIES	TokenNameIdentifier	 VALID  GRANULARITIES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"MINUTE"	TokenNameStringLiteral	MINUTE
,	TokenNameCOMMA	
"NONE"	TokenNameStringLiteral	NONE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Get the valid values. * @return the list of valid Granularity values */	TokenNameCOMMENT_JAVADOC	 Get the valid values. @return the list of valid Granularity values 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALID_GRANULARITIES	TokenNameIdentifier	 VALID  GRANULARITIES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the number of milliseconds associated with * the attribute, which can vary in some cases depending * on the value of the action parameter. * @param action SEND_FILES or GET_FILES * @return the number of milliseconds associated with * the attribute, in the context of the supplied action */	TokenNameCOMMENT_JAVADOC	 returns the number of milliseconds associated with the attribute, which can vary in some cases depending on the value of the action parameter. @param action SEND_FILES or GET_FILES @return the number of milliseconds associated with the attribute, in the context of the supplied action 
public	TokenNamepublic	
long	TokenNamelong	
getMilliseconds	TokenNameIdentifier	 get Milliseconds
(	TokenNameLPAREN	
int	TokenNameint	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
granularityU	TokenNameIdentifier	 granularity U
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
granularityU	TokenNameIdentifier	 granularity U
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
SEND_FILES	TokenNameIdentifier	 SEND  FILES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
GRANULARITY_MINUTE	TokenNameIdentifier	 GRANULARITY  MINUTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"MINUTE"	TokenNameStringLiteral	MINUTE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
granularityU	TokenNameIdentifier	 granularity U
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
GRANULARITY_MINUTE	TokenNameIdentifier	 GRANULARITY  MINUTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Granularity	TokenNameIdentifier	 Granularity
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Granularity	TokenNameIdentifier	 Granularity
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
new	TokenNamenew	
Granularity	TokenNameIdentifier	 Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * one of the valid system type keys recognized by the systemTypeKey * attribute. */	TokenNameCOMMENT_JAVADOC	 one of the valid system type keys recognized by the systemTypeKey attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FTPSystemType	TokenNameIdentifier	 FTP System Type
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALID_SYSTEM_TYPES	TokenNameIdentifier	 VALID  SYSTEM  TYPES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"UNIX"	TokenNameStringLiteral	UNIX
,	TokenNameCOMMA	
"VMS"	TokenNameStringLiteral	VMS
,	TokenNameCOMMA	
"WINDOWS"	TokenNameStringLiteral	WINDOWS
,	TokenNameCOMMA	
"OS/2"	TokenNameStringLiteral	OS/2
,	TokenNameCOMMA	
"OS/400"	TokenNameStringLiteral	OS/400
,	TokenNameCOMMA	
"MVS"	TokenNameStringLiteral	MVS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Get the valid values. * @return the list of valid system types. */	TokenNameCOMMENT_JAVADOC	 Get the valid values. @return the list of valid system types. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALID_SYSTEM_TYPES	TokenNameIdentifier	 VALID  SYSTEM  TYPES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
FTPSystemType	TokenNameIdentifier	 FTP System Type
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FTPSystemType	TokenNameIdentifier	 FTP System Type
ftpst	TokenNameIdentifier	 ftpst
=	TokenNameEQUAL	
new	TokenNamenew	
FTPSystemType	TokenNameIdentifier	 FTP System Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ftpst	TokenNameIdentifier	 ftpst
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ftpst	TokenNameIdentifier	 ftpst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
