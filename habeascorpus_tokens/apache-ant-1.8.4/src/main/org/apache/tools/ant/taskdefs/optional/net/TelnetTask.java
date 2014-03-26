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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
TelnetClient	TokenNameIdentifier	 Telnet Client
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
/** * Automates the telnet protocol. * */	TokenNameCOMMENT_JAVADOC	 Automates the telnet protocol. 
public	TokenNamepublic	
class	TokenNameclass	
TelnetTask	TokenNameIdentifier	 Telnet Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WAIT_INTERVAL	TokenNameIdentifier	 WAIT  INTERVAL
=	TokenNameEQUAL	
250	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TELNET_PORT	TokenNameIdentifier	 TELNET  PORT
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The userid to login with, if automated login is used */	TokenNameCOMMENT_JAVADOC	 The userid to login with, if automated login is used 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userid	TokenNameIdentifier	 userid
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The password to login with, if automated login is used */	TokenNameCOMMENT_JAVADOC	 The password to login with, if automated login is used 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The server to connect to. */	TokenNameCOMMENT_JAVADOC	 The server to connect to. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The tcp port to connect to. */	TokenNameCOMMENT_JAVADOC	 The tcp port to connect to. 
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
TELNET_PORT	TokenNameIdentifier	 TELNET  PORT
;	TokenNameSEMICOLON	
/** * The list of read/write commands for this session */	TokenNameCOMMENT_JAVADOC	 The list of read/write commands for this session 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
telnetTasks	TokenNameIdentifier	 telnet Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If true, adds a CR to beginning of login script */	TokenNameCOMMENT_JAVADOC	 If true, adds a CR to beginning of login script 
private	TokenNameprivate	
boolean	TokenNameboolean	
addCarriageReturn	TokenNameIdentifier	 add Carriage Return
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default time allowed for waiting for a valid response * for all child reads. A value of 0 means no limit. */	TokenNameCOMMENT_JAVADOC	 Default time allowed for waiting for a valid response for all child reads. A value of 0 means no limit. 
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
defaultTimeout	TokenNameIdentifier	 default Timeout
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Verify that all parameters are included. * Connect and possibly login * Iterate through the list of Reads and writes * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Verify that all parameters are included. Connect and possibly login Iterate through the list of Reads and writes @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
/** A server name is required to continue */	TokenNameCOMMENT_JAVADOC	 A server name is required to continue 
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
"No Server Specified"	TokenNameStringLiteral	No Server Specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A userid and password must appear together * if they appear. They are not required. */	TokenNameCOMMENT_JAVADOC	 A userid and password must appear together if they appear. They are not required. 
if	TokenNameif	
(	TokenNameLPAREN	
userid	TokenNameIdentifier	 userid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
password	TokenNameIdentifier	 password
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No Userid Specified"	TokenNameStringLiteral	No Userid Specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
userid	TokenNameIdentifier	 userid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No Password Specified"	TokenNameStringLiteral	No Password Specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create the telnet client object */	TokenNameCOMMENT_JAVADOC	 Create the telnet client object 
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
telnet	TokenNameIdentifier	 telnet
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
=	TokenNameEQUAL	
new	TokenNamenew	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Can't connect to "	TokenNameStringLiteral	Can't connect to 
+	TokenNamePLUS	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Login if userid and password were specified */	TokenNameCOMMENT_JAVADOC	 Login if userid and password were specified 
if	TokenNameif	
(	TokenNameLPAREN	
userid	TokenNameIdentifier	 userid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
password	TokenNameIdentifier	 password
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
login	TokenNameIdentifier	 login
(	TokenNameLPAREN	
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Process each sub command */	TokenNameCOMMENT_JAVADOC	 Process each sub command 
Enumeration	TokenNameIdentifier	 Enumeration
tasksToRun	TokenNameIdentifier	 tasks To Run
=	TokenNameEQUAL	
telnetTasks	TokenNameIdentifier	 telnet Tasks
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tasksToRun	TokenNameIdentifier	 tasks To Run
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tasksToRun	TokenNameIdentifier	 tasks To Run
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
)	TokenNameRPAREN	
tasksToRun	TokenNameIdentifier	 tasks To Run
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
TelnetRead	TokenNameIdentifier	 Telnet Read
&&	TokenNameAND_AND	
defaultTimeout	TokenNameIdentifier	 default Timeout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TelnetRead	TokenNameIdentifier	 Telnet Read
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
setDefaultTimeout	TokenNameIdentifier	 set Default Timeout
(	TokenNameLPAREN	
defaultTimeout	TokenNameIdentifier	 default Timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
telnet	TokenNameIdentifier	 telnet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error disconnecting from "	TokenNameStringLiteral	Error disconnecting from 
+	TokenNamePLUS	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a 'typical' login. If it differs, use the read * and write tasks explicitely */	TokenNameCOMMENT_JAVADOC	 Process a 'typical' login. If it differs, use the read and write tasks explicitely 
private	TokenNameprivate	
void	TokenNamevoid	
login	TokenNameIdentifier	 login
(	TokenNameLPAREN	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addCarriageReturn	TokenNameIdentifier	 add Carriage Return
)	TokenNameRPAREN	
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
sendString	TokenNameIdentifier	 send String
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
"ogin:"	TokenNameStringLiteral	ogin:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
sendString	TokenNameIdentifier	 send String
(	TokenNameLPAREN	
userid	TokenNameIdentifier	 userid
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
"assword:"	TokenNameStringLiteral	assword:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
sendString	TokenNameIdentifier	 send String
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the the login id to use on the server; * required if <tt>password</tt> is set. * @param u a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the the login id to use on the server; required if <tt>password</tt> is set. @param u a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setUserid	TokenNameIdentifier	 set Userid
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userid	TokenNameIdentifier	 userid
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the the login password to use * required if <tt>userid</tt> is set. * @param p a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the the login password to use required if <tt>userid</tt> is set. @param p a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the hostname or address of the remote server. * @param m a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the hostname or address of the remote server. @param m a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setServer	TokenNameIdentifier	 set Server
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the tcp port to connect to; default is 23. * @param p an <code>int</code> value */	TokenNameCOMMENT_JAVADOC	 Set the tcp port to connect to; default is 23. @param p an <code>int</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * send a carriage return after connecting; optional, defaults to false. * @param b a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 send a carriage return after connecting; optional, defaults to false. @param b a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setInitialCR	TokenNameIdentifier	 set Initial CR
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
addCarriageReturn	TokenNameIdentifier	 add Carriage Return
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set a default timeout in seconds to wait for a response, * zero means forever (the default) * @param i an <code>Integer</code> value */	TokenNameCOMMENT_JAVADOC	 set a default timeout in seconds to wait for a response, zero means forever (the default) @param i an <code>Integer</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultTimeout	TokenNameIdentifier	 default Timeout
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string to wait for from the server. * A subTask &lt;read&gt; tag was found. Create the object, * Save it in our list, and return it. * @return a read telnet sub task */	TokenNameCOMMENT_JAVADOC	 A string to wait for from the server. A subTask &lt;read&gt; tag was found. Create the object, Save it in our list, and return it. @return a read telnet sub task 
public	TokenNamepublic	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
createRead	TokenNameIdentifier	 create Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
)	TokenNameRPAREN	
new	TokenNamenew	
TelnetRead	TokenNameIdentifier	 Telnet Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
telnetTasks	TokenNameIdentifier	 telnet Tasks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add text to send to the server * A subTask &lt;write&gt; tag was found. Create the object, * Save it in our list, and return it. * @return a write telnet sub task */	TokenNameCOMMENT_JAVADOC	 Add text to send to the server A subTask &lt;write&gt; tag was found. Create the object, Save it in our list, and return it. @return a write telnet sub task 
public	TokenNamepublic	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
createWrite	TokenNameIdentifier	 create Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
)	TokenNameRPAREN	
new	TokenNamenew	
TelnetWrite	TokenNameIdentifier	 Telnet Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
telnetTasks	TokenNameIdentifier	 telnet Tasks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is the parent of the Read and Write tasks. * It handles the common attributes for both. */	TokenNameCOMMENT_JAVADOC	 This class is the parent of the Read and Write tasks. It handles the common attributes for both. 
public	TokenNamepublic	
class	TokenNameclass	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
taskString	TokenNameIdentifier	 task String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Execute the subtask. * @param telnet the client * @throws BuildException always as it is not allowed to instantiate this object */	TokenNameCOMMENT_JAVADOC	 Execute the subtask. @param telnet the client @throws BuildException always as it is not allowed to instantiate this object 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Shouldn't be able instantiate a SubTask directly"	TokenNameStringLiteral	Shouldn't be able instantiate a SubTask directly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the message as nested text * @param s the nested text */	TokenNameCOMMENT_JAVADOC	 the message as nested text @param s the nested text 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the message as an attribute * @param s a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 the message as an attribute @param s a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskString	TokenNameIdentifier	 task String
+=	TokenNamePLUS_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sends text to the connected server */	TokenNameCOMMENT_JAVADOC	 Sends text to the connected server 
public	TokenNamepublic	
class	TokenNameclass	
TelnetWrite	TokenNameIdentifier	 Telnet Write
extends	TokenNameextends	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
echoString	TokenNameIdentifier	 echo String
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Execute the write task. * @param telnet the task to use * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the write task. @param telnet the task to use @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
sendString	TokenNameIdentifier	 send String
(	TokenNameLPAREN	
taskString	TokenNameIdentifier	 task String
,	TokenNameCOMMA	
echoString	TokenNameIdentifier	 echo String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether or not the message should be echoed to the log. * Defaults to <code>true</code>. * @param b a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Whether or not the message should be echoed to the log. Defaults to <code>true</code>. @param b a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setEcho	TokenNameIdentifier	 set Echo
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
echoString	TokenNameIdentifier	 echo String
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads the output from the connected server * until the required string is found or we time out. */	TokenNameCOMMENT_JAVADOC	 Reads the output from the connected server until the required string is found or we time out. 
public	TokenNamepublic	
class	TokenNameclass	
TelnetRead	TokenNameIdentifier	 Telnet Read
extends	TokenNameextends	
TelnetSubTask	TokenNameIdentifier	 Telnet Sub Task
{	TokenNameLBRACE	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Execute the read task. * @param telnet the task to use * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the read task. @param telnet the task to use @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
telnet	TokenNameIdentifier	 telnet
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
telnet	TokenNameIdentifier	 telnet
.	TokenNameDOT	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
taskString	TokenNameIdentifier	 task String
,	TokenNameCOMMA	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a timeout value that overrides any task wide timeout. * @param i an <code>Integer</code> value */	TokenNameCOMMENT_JAVADOC	 a timeout value that overrides any task wide timeout. @param i an <code>Integer</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default timeout if none has been set already * @param defaultTimeout an <code>Integer</code> value * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Sets the default timeout if none has been set already @param defaultTimeout an <code>Integer</code> value @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultTimeout	TokenNameIdentifier	 set Default Timeout
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
defaultTimeout	TokenNameIdentifier	 default Timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
defaultTimeout	TokenNameIdentifier	 default Timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class handles the abstraction of the telnet protocol. * Currently it is a wrapper around <a * href="http://jakarta.apache.org/commons/net/index.html">Jakarta * Commons Net</a>. */	TokenNameCOMMENT_JAVADOC	 This class handles the abstraction of the telnet protocol. Currently it is a wrapper around <a href="http://jakarta.apache.org/commons/net/index.html">Jakarta Commons Net</a>. 
public	TokenNamepublic	
class	TokenNameclass	
AntTelnetClient	TokenNameIdentifier	 Ant Telnet Client
extends	TokenNameextends	
TelnetClient	TokenNameIdentifier	 Telnet Client
{	TokenNameLBRACE	
/** * Read from the telnet session until the string we are * waiting for is found * @param s The string to wait on */	TokenNameCOMMENT_JAVADOC	 Read from the telnet session until the string we are waiting for is found @param s The string to wait on 
public	TokenNamepublic	
void	TokenNamevoid	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read from the telnet session until the string we are * waiting for is found or the timeout has been reached * @param s The string to wait on * @param timeout The maximum number of seconds to wait */	TokenNameCOMMENT_JAVADOC	 Read from the telnet session until the string we are waiting for is found or the timeout has been reached @param s The string to wait on @param timeout The maximum number of seconds to wait 
public	TokenNamepublic	
void	TokenNamevoid	
waitForString	TokenNameIdentifier	 wait For String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
windowStart	TokenNameIdentifier	 window Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
timeout	TokenNameIdentifier	 timeout
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
windowStart	TokenNameIdentifier	 window Start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
windowStart	TokenNameIdentifier	 window Start
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
windowStart	TokenNameIdentifier	 window Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endTime	TokenNameIdentifier	 end Time
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
timeout	TokenNameIdentifier	 timeout
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
windowStart	TokenNameIdentifier	 window Start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
windowStart	TokenNameIdentifier	 window Start
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
before	TokenNameIdentifier	 before
(	TokenNameLPAREN	
endTime	TokenNameIdentifier	 end Time
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
WAIT_INTERVAL	TokenNameIdentifier	 WAIT  INTERVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Read before running into timeout: "	TokenNameStringLiteral	Read before running into timeout: 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Response timed-out waiting for ""	TokenNameStringLiteral	Response timed-out waiting for "
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
'\"'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
windowStart	TokenNameIdentifier	 window Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
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
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write this string to the telnet session. * @param s the string to write * @param echoString if true log the string sent */	TokenNameCOMMENT_JAVADOC	 Write this string to the telnet session. @param s the string to write @param echoString if true log the string sent 
public	TokenNamepublic	
void	TokenNamevoid	
sendString	TokenNameIdentifier	 send String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
echoString	TokenNameIdentifier	 echo String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
echoString	TokenNameIdentifier	 echo String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
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
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
