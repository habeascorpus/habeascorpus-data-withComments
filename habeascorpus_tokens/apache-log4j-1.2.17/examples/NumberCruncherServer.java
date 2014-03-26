/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
UnicastRemoteObject	TokenNameIdentifier	 Unicast Remote Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
Naming	TokenNameIdentifier	 Naming
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
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
NDC	TokenNameIdentifier	 NDC
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
;	TokenNameSEMICOLON	
/** A simple {@link NumberCruncher} implementation that logs its progress when factoring numbers. The purpose of the whole exercise is to show the use of nested diagnostic contexts in order to distinguish the log output from different client requests. <pre> <b>Usage:</b> java org.apache.log4j.examples.NumberCruncherServer <em>configFile</em> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;where <em>configFile</em> is a log4j configuration file. </pre> We supply a simple config file <a href=doc-files/factor.lcf>factor.lcf</a> for directing log output to the file <code>factor.log</code>. <p>Try it yourself by starting a <code>NumberCruncherServer</code> and make queries from multiple {@link NumberCruncherClient NumberCruncherClients} to factor numbers. <p><b><a href="doc-files/factor.html">Sample output</a></b> shows the log output when two clients connect to the server near simultaneously. <p>See <a href=doc-files/NumberCruncherServer.java>source</a> code of <code>NumberCruncherServer</code> for more details. <p>Note that class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. */	TokenNameCOMMENT_JAVADOC	 A simple {@link NumberCruncher} implementation that logs its progress when factoring numbers. The purpose of the whole exercise is to show the use of nested diagnostic contexts in order to distinguish the log output from different client requests. <pre> <b>Usage:</b> java org.apache.log4j.examples.NumberCruncherServer <em>configFile</em> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;where <em>configFile</em> is a log4j configuration file. </pre> We supply a simple config file <a href=doc-files/factor.lcf>factor.lcf</a> for directing log output to the file <code>factor.log</code>. <p>Try it yourself by starting a <code>NumberCruncherServer</code> and make queries from multiple {@link NumberCruncherClient NumberCruncherClients} to factor numbers. <p><b><a href="doc-files/factor.html">Sample output</a></b> shows the log output when two clients connect to the server near simultaneously. <p>See <a href=doc-files/NumberCruncherServer.java>source</a> code of <code>NumberCruncherServer</code> for more details. <p>Note that class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. 
public	TokenNamepublic	
class	TokenNameclass	
NumberCruncherServer	TokenNameIdentifier	 Number Cruncher Server
extends	TokenNameextends	
UnicastRemoteObject	TokenNameIdentifier	 Unicast Remote Object
implements	TokenNameimplements	
NumberCruncher	TokenNameIdentifier	 Number Cruncher
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2626753561969426769L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
NumberCruncherServer	TokenNameIdentifier	 Number Cruncher Server
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NumberCruncherServer	TokenNameIdentifier	 Number Cruncher Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RemoteException	TokenNameIdentifier	 Remote Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
factor	TokenNameIdentifier	 factor
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
throws	TokenNamethrows	
RemoteException	TokenNameIdentifier	 Remote Exception
{	TokenNameLBRACE	
// The client's host is an important source of information. 	TokenNameCOMMENT_LINE	The client's host is an important source of information. 
try	TokenNametry	
{	TokenNameLBRACE	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
getClientHost	TokenNameIdentifier	 get Client Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
ServerNotActiveException	TokenNameIdentifier	 Server Not Active Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are being called from same VM 	TokenNameCOMMENT_LINE	we are being called from same VM 
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The information contained within the request is another source of 	TokenNameCOMMENT_LINE	The information contained within the request is another source of 
// distinctive information. It might reveal the users name, date of request, 	TokenNameCOMMENT_LINE	distinctive information. It might reveal the users name, date of request, 
// request ID etc. In servlet type environments, much information is 	TokenNameCOMMENT_LINE	request ID etc. In servlet type environments, much information is 
// contained in cookies. 	TokenNameCOMMENT_LINE	contained in cookies. 
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Beginning to factor."	TokenNameStringLiteral	Beginning to factor.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
+	TokenNamePLUS	
" is not a positive integer."	TokenNameStringLiteral	 is not a positive integer.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
factors	TokenNameIdentifier	 factors
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It is bad practice to place log requests within tight loops. 	TokenNameCOMMENT_LINE	It is bad practice to place log requests within tight loops. 
// It is done here to show interleaved log output from 	TokenNameCOMMENT_LINE	It is done here to show interleaved log output from 
// different requests. 	TokenNameCOMMENT_LINE	different requests. 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Trying to see if "	TokenNameStringLiteral	Trying to see if 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is a factor."	TokenNameStringLiteral	 is a factor.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Found factor "	TokenNameStringLiteral	Found factor 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factors	TokenNameIdentifier	 factors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
/=	TokenNameDIVIDE_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Placing artificial delays in tight-loops will also lead to sub-optimal 	TokenNameCOMMENT_LINE	Placing artificial delays in tight-loops will also lead to sub-optimal 
// resuts. :-) 	TokenNameCOMMENT_LINE	resuts. :-) 
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Found factor "	TokenNameStringLiteral	Found factor 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factors	TokenNameIdentifier	 factors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
factors	TokenNameIdentifier	 factors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
factors	TokenNameIdentifier	 factors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Before leaving a thread we call NDC.remove. This deletes the reference 	TokenNameCOMMENT_LINE	Before leaving a thread we call NDC.remove. This deletes the reference 
// to the thread in the internal hash table. Version 0.8.5 introduces a 	TokenNameCOMMENT_LINE	to the thread in the internal hash table. Version 0.8.5 introduces a 
// a lazy removal mechanism in case you forget to call remove when 	TokenNameCOMMENT_LINE	a lazy removal mechanism in case you forget to call remove when 
// exiting a thread. See the java documentation in NDC.remove for further 	TokenNameCOMMENT_LINE	exiting a thread. See the java documentation in NDC.remove for further 
// details. 	TokenNameCOMMENT_LINE	details. 
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java org.apache.log4j.examples.NumberCruncherServer configFile "	TokenNameStringLiteral	Usage: java org.apache.log4j.examples.NumberCruncherServer configFile 
+	TokenNamePLUS	
" where configFile is a log4j configuration file."	TokenNameStringLiteral	 where configFile is a log4j configuration file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
delay	TokenNameIdentifier	 delay
(	TokenNameLPAREN	
int	TokenNameint	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments."	TokenNameStringLiteral	Wrong number of arguments.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumberCruncherServer	TokenNameIdentifier	 Number Cruncher Server
ncs	TokenNameIdentifier	 ncs
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ncs	TokenNameIdentifier	 ncs
=	TokenNameEQUAL	
new	TokenNamenew	
NumberCruncherServer	TokenNameIdentifier	 Number Cruncher Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
rebind	TokenNameIdentifier	 rebind
(	TokenNameLPAREN	
"Factor"	TokenNameStringLiteral	Factor
,	TokenNameCOMMA	
ncs	TokenNameIdentifier	 ncs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"NumberCruncherServer bound and ready to serve."	TokenNameStringLiteral	NumberCruncherServer bound and ready to serve.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not bind NumberCruncherServer."	TokenNameStringLiteral	Could not bind NumberCruncherServer.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NumberCruncherClient	TokenNameIdentifier	 Number Cruncher Client
.	TokenNameDOT	
loop	TokenNameIdentifier	 loop
(	TokenNameLPAREN	
ncs	TokenNameIdentifier	 ncs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
