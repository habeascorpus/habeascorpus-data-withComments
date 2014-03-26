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
JSch	TokenNameIdentifier	 J Sch
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Base class for Ant tasks using jsch. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Base class for Ant tasks using jsch. * @since Ant 1.6 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SSHBase	TokenNameIdentifier	 SSH Base
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
LogListener	TokenNameIdentifier	 Log Listener
{	TokenNameLBRACE	
/** Default listen port for SSH daemon */	TokenNameCOMMENT_JAVADOC	 Default listen port for SSH daemon 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SSH_PORT	TokenNameIdentifier	 SSH  PORT
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
knownHosts	TokenNameIdentifier	 known Hosts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
SSH_PORT	TokenNameIdentifier	 SSH  PORT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
userInfo	TokenNameIdentifier	 user Info
;	TokenNameSEMICOLON	
/** * Constructor for SSHBase. */	TokenNameCOMMENT_JAVADOC	 Constructor for SSHBase. 
public	TokenNamepublic	
SSHBase	TokenNameIdentifier	 SSH Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userInfo	TokenNameIdentifier	 user Info
=	TokenNameEQUAL	
new	TokenNamenew	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remote host, either DNS name or IP. * * @param host The new host value */	TokenNameCOMMENT_JAVADOC	 Remote host, either DNS name or IP. * @param host The new host value 
public	TokenNamepublic	
void	TokenNamevoid	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the host. * @return the host */	TokenNameCOMMENT_JAVADOC	 Get the host. @return the host 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failonerror flag. * Default is true * @param failure if true throw a build exception when a failure occuries, * otherwise just log the failure and continue */	TokenNameCOMMENT_JAVADOC	 Set the failonerror flag. Default is true @param failure if true throw a build exception when a failure occuries, otherwise just log the failure and continue 
public	TokenNamepublic	
void	TokenNamevoid	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failure	TokenNameIdentifier	 failure
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
failure	TokenNameIdentifier	 failure
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the failonerror flag. * @return the failonerror flag */	TokenNameCOMMENT_JAVADOC	 Get the failonerror flag. @return the failonerror flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the verbose flag. * @param verbose if true output more verbose logging * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Set the verbose flag. @param verbose if true output more verbose logging @since Ant 1.6.2 
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
/** * Get the verbose flag. * @return the verbose flag * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Get the verbose flag. @return the verbose flag @since Ant 1.6.2 
public	TokenNamepublic	
boolean	TokenNameboolean	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Username known to remote host. * * @param username The new username value */	TokenNameCOMMENT_JAVADOC	 Username known to remote host. * @param username The new username value 
public	TokenNamepublic	
void	TokenNamevoid	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the password for the user. * * @param password The new password value */	TokenNameCOMMENT_JAVADOC	 Sets the password for the user. * @param password The new password value 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the keyfile for the user. * * @param keyfile The new keyfile value */	TokenNameCOMMENT_JAVADOC	 Sets the keyfile for the user. * @param keyfile The new keyfile value 
public	TokenNamepublic	
void	TokenNamevoid	
setKeyfile	TokenNameIdentifier	 set Keyfile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyfile	TokenNameIdentifier	 keyfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
setKeyfile	TokenNameIdentifier	 set Keyfile
(	TokenNameLPAREN	
keyfile	TokenNameIdentifier	 keyfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the passphrase for the users key. * * @param passphrase The new passphrase value */	TokenNameCOMMENT_JAVADOC	 Sets the passphrase for the users key. * @param passphrase The new passphrase value 
public	TokenNamepublic	
void	TokenNamevoid	
setPassphrase	TokenNameIdentifier	 set Passphrase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
passphrase	TokenNameIdentifier	 passphrase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
setPassphrase	TokenNameIdentifier	 set Passphrase
(	TokenNameLPAREN	
passphrase	TokenNameIdentifier	 passphrase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the path to the file that has the identities of * all known hosts. This is used by SSH protocol to validate * the identity of the host. The default is * <i>${user.home}/.ssh/known_hosts</i>. * * @param knownHosts a path to the known hosts file. */	TokenNameCOMMENT_JAVADOC	 Sets the path to the file that has the identities of all known hosts. This is used by SSH protocol to validate the identity of the host. The default is <i>${user.home}/.ssh/known_hosts</i>. * @param knownHosts a path to the known hosts file. 
public	TokenNamepublic	
void	TokenNamevoid	
setKnownhosts	TokenNameIdentifier	 set Knownhosts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
knownHosts	TokenNameIdentifier	 known Hosts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
knownHosts	TokenNameIdentifier	 known Hosts
=	TokenNameEQUAL	
knownHosts	TokenNameIdentifier	 known Hosts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setting this to true trusts hosts whose identity is unknown. * * @param yesOrNo if true trust the identity of unknown hosts. */	TokenNameCOMMENT_JAVADOC	 Setting this to true trusts hosts whose identity is unknown. * @param yesOrNo if true trust the identity of unknown hosts. 
public	TokenNamepublic	
void	TokenNamevoid	
setTrust	TokenNameIdentifier	 set Trust
(	TokenNameLPAREN	
boolean	TokenNameboolean	
yesOrNo	TokenNameIdentifier	 yes Or No
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
setTrust	TokenNameIdentifier	 set Trust
(	TokenNameLPAREN	
yesOrNo	TokenNameIdentifier	 yes Or No
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Changes the port used to connect to the remote host. * * @param port port number of remote host. */	TokenNameCOMMENT_JAVADOC	 Changes the port used to connect to the remote host. * @param port port number of remote host. 
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
/** * Get the port attribute. * @return the port */	TokenNameCOMMENT_JAVADOC	 Get the port attribute. @return the port 
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
/** * Initialize the task. * This initializizs the known hosts and sets the default port. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Initialize the task. This initializizs the known hosts and sets the default port. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
knownHosts	TokenNameIdentifier	 known Hosts
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/.ssh/known_hosts"	TokenNameStringLiteral	/.ssh/known_hosts
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
SSH_PORT	TokenNameIdentifier	 SSH  PORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open an ssh seession. * @return the opened session * @throws JSchException on error */	TokenNameCOMMENT_JAVADOC	 Open an ssh seession. @return the opened session @throws JSchException on error 
protected	TokenNameprotected	
Session	TokenNameIdentifier	 Session
openSession	TokenNameIdentifier	 open Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
JSch	TokenNameIdentifier	 J Sch
jsch	TokenNameIdentifier	 jsch
=	TokenNameEQUAL	
new	TokenNamenew	
JSch	TokenNameIdentifier	 J Sch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SSHBase	TokenNameIdentifier	 SSH Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSch	TokenNameIdentifier	 J Sch
.	TokenNameDOT	
setLogger	TokenNameIdentifier	 set Logger
(	TokenNameLPAREN	
new	TokenNamenew	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
getKeyfile	TokenNameIdentifier	 get Keyfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
addIdentity	TokenNameIdentifier	 add Identity
(	TokenNameLPAREN	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
getKeyfile	TokenNameIdentifier	 get Keyfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
getTrust	TokenNameIdentifier	 get Trust
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
knownHosts	TokenNameIdentifier	 known Hosts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using known hosts: "	TokenNameStringLiteral	Using known hosts: 
+	TokenNamePLUS	
knownHosts	TokenNameIdentifier	 known Hosts
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
setKnownHosts	TokenNameIdentifier	 set Known Hosts
(	TokenNameLPAREN	
knownHosts	TokenNameIdentifier	 known Hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
userInfo	TokenNameIdentifier	 user Info
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setUserInfo	TokenNameIdentifier	 set User Info
(	TokenNameLPAREN	
userInfo	TokenNameIdentifier	 user Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Connecting to "	TokenNameStringLiteral	Connecting to 
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the user information. * @return the user information */	TokenNameCOMMENT_JAVADOC	 Get the user information. @return the user information 
protected	TokenNameprotected	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userInfo	TokenNameIdentifier	 user Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
