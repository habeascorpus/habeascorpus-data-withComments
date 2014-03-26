/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** NumberCruncherClient is a simple client for factoring integers. A remote NumberCruncher is contacted and asked to factor an integer. The factors returned by the {@link NumberCruncherServer} are displayed on the screen. <p>See <a href=doc-files/NumberCruncherClient.java>source</a> code of <code>NumberCruncherClient</code> for more details. <pre> <b>Usage:</b> java org.apache.log4j.examples.NumberCruncherClient HOST &nbsp;&nbsp;&nbsp;&nbsp;where HOST is the machine where the NumberCruncherServer is running </pre> <p>Note that class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 NumberCruncherClient is a simple client for factoring integers. A remote NumberCruncher is contacted and asked to factor an integer. The factors returned by the {@link NumberCruncherServer} are displayed on the screen. <p>See <a href=doc-files/NumberCruncherClient.java>source</a> code of <code>NumberCruncherClient</code> for more details. <pre> <b>Usage:</b> java org.apache.log4j.examples.NumberCruncherClient HOST &nbsp;&nbsp;&nbsp;&nbsp;where HOST is the machine where the NumberCruncherServer is running </pre> <p>Note that class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
NumberCruncherClient	TokenNameIdentifier	 Number Cruncher Client
{	TokenNameLBRACE	
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
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
"rmi://"	TokenNameStringLiteral	rmi://
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"/Factor"	TokenNameStringLiteral	/Factor
;	TokenNameSEMICOLON	
NumberCruncher	TokenNameIdentifier	 Number Cruncher
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumberCruncher	TokenNameIdentifier	 Number Cruncher
)	TokenNameRPAREN	
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
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
else	TokenNameelse	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments."	TokenNameStringLiteral	Wrong number of arguments.
)	TokenNameRPAREN	
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
"Usage: java org.apache.log4j.examples.NumberCruncherClient HOST "	TokenNameStringLiteral	Usage: java org.apache.log4j.examples.NumberCruncherClient HOST 
+	TokenNamePLUS	
" where HOST is the machine where the NumberCruncherServer is running."	TokenNameStringLiteral	 where HOST is the machine where the NumberCruncherServer is running.
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
static	TokenNamestatic	
void	TokenNamevoid	
loop	TokenNameIdentifier	 loop
(	TokenNameLPAREN	
NumberCruncher	TokenNameIdentifier	 Number Cruncher
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Enter a number to factor, '-1' to quit: "	TokenNameStringLiteral	Enter a number to factor, '-1' to quit: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Exiting loop."	TokenNameStringLiteral	Exiting loop.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Will attempt to factor "	TokenNameStringLiteral	Will attempt to factor 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
factors	TokenNameIdentifier	 factors
=	TokenNameEQUAL	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
factor	TokenNameIdentifier	 factor
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"The factors of "	TokenNameStringLiteral	The factors of 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" are"	TokenNameStringLiteral	 are
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
factors	TokenNameIdentifier	 factors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
factors	TokenNameIdentifier	 factors
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RemoteException	TokenNameIdentifier	 Remote Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not factor "	TokenNameStringLiteral	Could not factor 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
