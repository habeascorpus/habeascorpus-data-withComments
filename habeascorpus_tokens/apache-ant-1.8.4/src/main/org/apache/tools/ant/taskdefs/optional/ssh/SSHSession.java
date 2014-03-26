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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
TaskContainer	TokenNameIdentifier	 Task Container
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
/** * Establishes an ssh session with a remote machine, optionally * establishing port forwarding, then executes any nested task(s) * before closing the session. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Establishes an ssh session with a remote machine, optionally establishing port forwarding, then executes any nested task(s) before closing the session. @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
SSHSession	TokenNameIdentifier	 SSH Session
extends	TokenNameextends	
SSHBase	TokenNameIdentifier	 SSH Base
{	TokenNameLBRACE	
/** units are milliseconds, default is 0=infinite */	TokenNameCOMMENT_JAVADOC	 units are milliseconds, default is 0=infinite 
private	TokenNameprivate	
long	TokenNamelong	
maxwait	TokenNameIdentifier	 maxwait
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
localTunnels	TokenNameIdentifier	 local Tunnels
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
localPortsUsed	TokenNameIdentifier	 local Ports Used
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
remoteTunnels	TokenNameIdentifier	 remote Tunnels
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
remotePortsUsed	TokenNameIdentifier	 remote Ports Used
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NestedSequential	TokenNameIdentifier	 Nested Sequential
nestedSequential	TokenNameIdentifier	 nested Sequential
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TIMEOUT_MESSAGE	TokenNameIdentifier	 TIMEOUT  MESSAGE
=	TokenNameEQUAL	
"Timeout period exceeded, connection dropped."	TokenNameStringLiteral	Timeout period exceeded, connection dropped.
;	TokenNameSEMICOLON	
/** Optional Vector holding the nested tasks */	TokenNameCOMMENT_JAVADOC	 Optional Vector holding the nested tasks 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
nestedTasks	TokenNameIdentifier	 nested Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a nested task to Sequential. * <p> * @param nestedTask Nested task to execute Sequential * <p> */	TokenNameCOMMENT_JAVADOC	 Add a nested task to Sequential. <p> @param nestedTask Nested task to execute Sequential <p> 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nestedTasks	TokenNameIdentifier	 nested Tasks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The connection can be dropped after a specified number of * milliseconds. This is sometimes useful when a connection may be * flaky. Default is 0, which means &quot;wait forever&quot;. * * @param timeout The new timeout value in seconds */	TokenNameCOMMENT_JAVADOC	 The connection can be dropped after a specified number of milliseconds. This is sometimes useful when a connection may be flaky. Default is 0, which means &quot;wait forever&quot;. * @param timeout The new timeout value in seconds 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxwait	TokenNameIdentifier	 maxwait
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Changes the comma-delimited list of local tunnels to establish * on the connection. * * @param tunnels a comma-delimited list of lport:rhost:rport * tunnel specifications */	TokenNameCOMMENT_JAVADOC	 Changes the comma-delimited list of local tunnels to establish on the connection. * @param tunnels a comma-delimited list of lport:rhost:rport tunnel specifications 
public	TokenNamepublic	
void	TokenNamevoid	
setLocaltunnels	TokenNameIdentifier	 set Localtunnels
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tunnels	TokenNameIdentifier	 tunnels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
specs	TokenNameIdentifier	 specs
=	TokenNameEQUAL	
tunnels	TokenNameIdentifier	 tunnels
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
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
specs	TokenNameIdentifier	 specs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
specs	TokenNameIdentifier	 specs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
specs	TokenNameIdentifier	 specs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rhost	TokenNameIdentifier	 rhost
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
createLocalTunnel	TokenNameIdentifier	 create Local Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setLPort	TokenNameIdentifier	 set L Port
(	TokenNameLPAREN	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setRHost	TokenNameIdentifier	 set R Host
(	TokenNameLPAREN	
rhost	TokenNameIdentifier	 rhost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setRPort	TokenNameIdentifier	 set R Port
(	TokenNameLPAREN	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Changes the comma-delimited list of remote tunnels to establish * on the connection. * * @param tunnels a comma-delimited list of rport:lhost:lport * tunnel specifications */	TokenNameCOMMENT_JAVADOC	 Changes the comma-delimited list of remote tunnels to establish on the connection. * @param tunnels a comma-delimited list of rport:lhost:lport tunnel specifications 
public	TokenNamepublic	
void	TokenNamevoid	
setRemotetunnels	TokenNameIdentifier	 set Remotetunnels
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tunnels	TokenNameIdentifier	 tunnels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
specs	TokenNameIdentifier	 specs
=	TokenNameEQUAL	
tunnels	TokenNameIdentifier	 tunnels
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
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
specs	TokenNameIdentifier	 specs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
specs	TokenNameIdentifier	 specs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
specs	TokenNameIdentifier	 specs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lhost	TokenNameIdentifier	 lhost
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
createRemoteTunnel	TokenNameIdentifier	 create Remote Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setRPort	TokenNameIdentifier	 set R Port
(	TokenNameLPAREN	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setLHost	TokenNameIdentifier	 set L Host
(	TokenNameLPAREN	
lhost	TokenNameIdentifier	 lhost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
setLPort	TokenNameIdentifier	 set L Port
(	TokenNameLPAREN	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Establish the ssh session and execute all nestedTasks * * @exception BuildException if one of the nested tasks fails, or * network error or bad parameter. */	TokenNameCOMMENT_JAVADOC	 Establish the ssh session and execute all nestedTasks * @exception BuildException if one of the nested tasks fails, or network error or bad parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Host is required."	TokenNameStringLiteral	Host is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Username is required."	TokenNameStringLiteral	Username is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyfile	TokenNameIdentifier	 get Keyfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Password or Keyfile is required."	TokenNameStringLiteral	Password or Keyfile is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nestedSequential	TokenNameIdentifier	 nested Sequential
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing sequential element."	TokenNameStringLiteral	Missing sequential element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// establish the session 	TokenNameCOMMENT_LINE	establish the session 
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
openSession	TokenNameIdentifier	 open Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
maxwait	TokenNameIdentifier	 maxwait
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
localTunnels	TokenNameIdentifier	 local Tunnels
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
LocalTunnel	TokenNameIdentifier	 Local Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setPortForwardingL	TokenNameIdentifier	 set Port Forwarding L
(	TokenNameLPAREN	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getLPort	TokenNameIdentifier	 get L Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getRHost	TokenNameIdentifier	 get R Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getRPort	TokenNameIdentifier	 get R Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
remoteTunnels	TokenNameIdentifier	 remote Tunnels
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
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setPortForwardingR	TokenNameIdentifier	 set Port Forwarding R
(	TokenNameLPAREN	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getRPort	TokenNameIdentifier	 get R Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getLHost	TokenNameIdentifier	 get L Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tunnel	TokenNameIdentifier	 tunnel
.	TokenNameDOT	
getLPort	TokenNameIdentifier	 get L Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nestedSequential	TokenNameIdentifier	 nested Sequential
.	TokenNameDOT	
getNested	TokenNameIdentifier	 get Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nestedTask	TokenNameIdentifier	 nested Task
.	TokenNameDOT	
perform	TokenNameIdentifier	 perform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// completed successfully 	TokenNameCOMMENT_LINE	completed successfully 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JSchException	TokenNameIdentifier	 J Sch Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"session is down"	TokenNameStringLiteral	session is down
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
TIMEOUT_MESSAGE	TokenNameIdentifier	 TIMEOUT  MESSAGE
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
TIMEOUT_MESSAGE	TokenNameIdentifier	 TIMEOUT  MESSAGE
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Caught exception: "	TokenNameStringLiteral	Caught exception: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid wrapping it into yet another BuildException further down 	TokenNameCOMMENT_LINE	avoid wrapping it into yet another BuildException further down 
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Caught exception: "	TokenNameStringLiteral	Caught exception: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
createLocalTunnel	TokenNameIdentifier	 create Local Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
new	TokenNamenew	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localTunnels	TokenNameIdentifier	 local Tunnels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tunnel	TokenNameIdentifier	 tunnel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tunnel	TokenNameIdentifier	 tunnel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
createRemoteTunnel	TokenNameIdentifier	 create Remote Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
tunnel	TokenNameIdentifier	 tunnel
=	TokenNameEQUAL	
new	TokenNamenew	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remoteTunnels	TokenNameIdentifier	 remote Tunnels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tunnel	TokenNameIdentifier	 tunnel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tunnel	TokenNameIdentifier	 tunnel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
{	TokenNameLBRACE	
public	TokenNamepublic	
LocalTunnel	TokenNameIdentifier	 Local Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rhost	TokenNameIdentifier	 rhost
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLPort	TokenNameIdentifier	 set L Port
(	TokenNameLPAREN	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
portKey	TokenNameIdentifier	 port Key
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localPortsUsed	TokenNameIdentifier	 local Ports Used
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
portKey	TokenNameIdentifier	 port Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Multiple local tunnels defined to"	TokenNameStringLiteral	Multiple local tunnels defined to
+	TokenNamePLUS	
" use same local port "	TokenNameStringLiteral	 use same local port 
+	TokenNamePLUS	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localPortsUsed	TokenNameIdentifier	 local Ports Used
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
portKey	TokenNameIdentifier	 port Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
lport	TokenNameIdentifier	 lport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRHost	TokenNameIdentifier	 set R Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rhost	TokenNameIdentifier	 rhost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rhost	TokenNameIdentifier	 rhost
=	TokenNameEQUAL	
rhost	TokenNameIdentifier	 rhost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRPort	TokenNameIdentifier	 set R Port
(	TokenNameLPAREN	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
rport	TokenNameIdentifier	 rport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLPort	TokenNameIdentifier	 get L Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lport	TokenNameIdentifier	 lport
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"lport is required for"	TokenNameStringLiteral	lport is required for
+	TokenNamePLUS	
" LocalTunnel."	TokenNameStringLiteral	 LocalTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lport	TokenNameIdentifier	 lport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRHost	TokenNameIdentifier	 get R Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhost	TokenNameIdentifier	 rhost
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"rhost is required"	TokenNameStringLiteral	rhost is required
+	TokenNamePLUS	
" for LocalTunnel."	TokenNameStringLiteral	 for LocalTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rhost	TokenNameIdentifier	 rhost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRPort	TokenNameIdentifier	 get R Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rport	TokenNameIdentifier	 rport
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"rport is required for"	TokenNameStringLiteral	rport is required for
+	TokenNamePLUS	
" LocalTunnel."	TokenNameStringLiteral	 LocalTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rport	TokenNameIdentifier	 rport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
{	TokenNameLBRACE	
public	TokenNamepublic	
RemoteTunnel	TokenNameIdentifier	 Remote Tunnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lhost	TokenNameIdentifier	 lhost
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLPort	TokenNameIdentifier	 set L Port
(	TokenNameLPAREN	
int	TokenNameint	
lport	TokenNameIdentifier	 lport
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lport	TokenNameIdentifier	 lport
=	TokenNameEQUAL	
lport	TokenNameIdentifier	 lport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLHost	TokenNameIdentifier	 set L Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lhost	TokenNameIdentifier	 lhost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lhost	TokenNameIdentifier	 lhost
=	TokenNameEQUAL	
lhost	TokenNameIdentifier	 lhost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRPort	TokenNameIdentifier	 set R Port
(	TokenNameLPAREN	
int	TokenNameint	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
portKey	TokenNameIdentifier	 port Key
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remotePortsUsed	TokenNameIdentifier	 remote Ports Used
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
portKey	TokenNameIdentifier	 port Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Multiple remote tunnels defined to"	TokenNameStringLiteral	Multiple remote tunnels defined to
+	TokenNamePLUS	
" use same remote port "	TokenNameStringLiteral	 use same remote port 
+	TokenNamePLUS	
rport	TokenNameIdentifier	 rport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remotePortsUsed	TokenNameIdentifier	 remote Ports Used
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
portKey	TokenNameIdentifier	 port Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rport	TokenNameIdentifier	 rport
=	TokenNameEQUAL	
rport	TokenNameIdentifier	 rport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLPort	TokenNameIdentifier	 get L Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lport	TokenNameIdentifier	 lport
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"lport is required for"	TokenNameStringLiteral	lport is required for
+	TokenNamePLUS	
" RemoteTunnel."	TokenNameStringLiteral	 RemoteTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lport	TokenNameIdentifier	 lport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLHost	TokenNameIdentifier	 get L Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lhost	TokenNameIdentifier	 lhost
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"lhost is required for"	TokenNameStringLiteral	lhost is required for
+	TokenNamePLUS	
" RemoteTunnel."	TokenNameStringLiteral	 RemoteTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lhost	TokenNameIdentifier	 lhost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRPort	TokenNameIdentifier	 get R Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rport	TokenNameIdentifier	 rport
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"rport is required for"	TokenNameStringLiteral	rport is required for
+	TokenNamePLUS	
" RemoteTunnel."	TokenNameStringLiteral	 RemoteTunnel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rport	TokenNameIdentifier	 rport
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is the sequential nested element of the macrodef. * * @return a sequential element to be configured. */	TokenNameCOMMENT_JAVADOC	 This is the sequential nested element of the macrodef. * @return a sequential element to be configured. 
public	TokenNamepublic	
NestedSequential	TokenNameIdentifier	 Nested Sequential
createSequential	TokenNameIdentifier	 create Sequential
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nestedSequential	TokenNameIdentifier	 nested Sequential
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one sequential allowed"	TokenNameStringLiteral	Only one sequential allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nestedSequential	TokenNameIdentifier	 nested Sequential
=	TokenNameEQUAL	
new	TokenNamenew	
NestedSequential	TokenNameIdentifier	 Nested Sequential
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
nestedSequential	TokenNameIdentifier	 nested Sequential
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The class corresponding to the sequential nested element. * This is a simple task container. */	TokenNameCOMMENT_JAVADOC	 The class corresponding to the sequential nested element. This is a simple task container. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NestedSequential	TokenNameIdentifier	 Nested Sequential
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
nested	TokenNameIdentifier	 nested
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a task or type to the container. * * @param task an unknown element. */	TokenNameCOMMENT_JAVADOC	 Add a task or type to the container. * @param task an unknown element. 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the list of unknown elements */	TokenNameCOMMENT_JAVADOC	 @return the list of unknown elements 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getNested	TokenNameIdentifier	 get Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nested	TokenNameIdentifier	 nested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
