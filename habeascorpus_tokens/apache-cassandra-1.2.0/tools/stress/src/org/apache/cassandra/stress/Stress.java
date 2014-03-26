/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
Option	TokenNameIdentifier	 Option
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketException	TokenNameIdentifier	 Socket Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Stress	TokenNameIdentifier	 Stress
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Operations	TokenNameIdentifier	 Operations
{	TokenNameLBRACE	
INSERT	TokenNameIdentifier	 INSERT
,	TokenNameCOMMA	
READ	TokenNameIdentifier	 READ
,	TokenNameCOMMA	
RANGE_SLICE	TokenNameIdentifier	 RANGE  SLICE
,	TokenNameCOMMA	
INDEXED_RANGE_SLICE	TokenNameIdentifier	 INDEXED  RANGE  SLICE
,	TokenNameCOMMA	
MULTI_GET	TokenNameIdentifier	 MULTI  GET
,	TokenNameCOMMA	
COUNTER_ADD	TokenNameIdentifier	 COUNTER  ADD
,	TokenNameCOMMA	
COUNTER_GET	TokenNameIdentifier	 COUNTER  GET
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Random	TokenNameIdentifier	 Random
randomizer	TokenNameIdentifier	 randomizer
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stopped	TokenNameIdentifier	 stopped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
new	TokenNamenew	
Session	TokenNameIdentifier	 Session
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHelpMessage	TokenNameIdentifier	 print Help Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
sendToDaemon	TokenNameIdentifier	 send To Daemon
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
sendToDaemon	TokenNameIdentifier	 send To Daemon
,	TokenNameCOMMA	
2159	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
inp	TokenNameIdentifier	 inp
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addShutdownHook	TokenNameIdentifier	 add Shutdown Hook
(	TokenNameLPAREN	
new	TokenNamenew	
ShutDown	TokenNameIdentifier	 Shut Down
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
inp	TokenNameIdentifier	 inp
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"END"	TokenNameStringLiteral	END
)	TokenNameRPAREN	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"FAILURE"	TokenNameStringLiteral	FAILURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stopped	TokenNameIdentifier	 stopped
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inp	TokenNameIdentifier	 inp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StressAction	TokenNameIdentifier	 Stress Action
stressAction	TokenNameIdentifier	 stress Action
=	TokenNameEQUAL	
new	TokenNamenew	
StressAction	TokenNameIdentifier	 Stress Action
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
outStream	TokenNameIdentifier	 out Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stressAction	TokenNameIdentifier	 stress Action
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stressAction	TokenNameIdentifier	 stress Action
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
stressAction	TokenNameIdentifier	 stress Action
.	TokenNameDOT	
getReturnCode	TokenNameIdentifier	 get Return Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Printing out help message */	TokenNameCOMMENT_JAVADOC	 Printing out help message 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
printHelpMessage	TokenNameIdentifier	 print Help Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: ./bin/cassandra-stress [options] Options:"	TokenNameStringLiteral	Usage: ./bin/cassandra-stress [options] Options:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
Session	TokenNameIdentifier	 Session
.	TokenNameDOT	
availableOptions	TokenNameIdentifier	 available Options
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Option	TokenNameIdentifier	 Option
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Option	TokenNameIdentifier	 Option
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
upperCaseName	TokenNameIdentifier	 upper Case Name
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
getLongOpt	TokenNameIdentifier	 get Long Opt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"-%s%s, --%s%s%n %s%n"	TokenNameStringLiteral	-%s%s, --%s%s%n %s%n
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
getOpt	TokenNameIdentifier	 get Opt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
upperCaseName	TokenNameIdentifier	 upper Case Name
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
getLongOpt	TokenNameIdentifier	 get Long Opt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
upperCaseName	TokenNameIdentifier	 upper Case Name
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ShutDown	TokenNameIdentifier	 Shut Down
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShutDown	TokenNameIdentifier	 Shut Down
(	TokenNameLPAREN	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
,	TokenNameCOMMA	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Control-C caught. Canceling running action and shutting down..."	TokenNameStringLiteral	Control-C caught. Canceling running action and shutting down...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopped	TokenNameIdentifier	 stopped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
