/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
.	TokenNameDOT	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
.	TokenNameDOT	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
JDBCTest	TokenNameIdentifier	 JDBC Test
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.jdbc.odbc.JdbcOdbcDriver"	TokenNameStringLiteral	sun.jdbc.odbc.JdbcOdbcDriver
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Category	TokenNameIdentifier	 Category
rootLog	TokenNameIdentifier	 root Log
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%p [%t] %c - %m%n"	TokenNameStringLiteral	%p [%t] %c - %m%n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
URL_OPTION	TokenNameIdentifier	 URL  OPTION
,	TokenNameCOMMA	
"jdbc:odbc:someDB"	TokenNameStringLiteral	jdbc:odbc:someDB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
USER_OPTION	TokenNameIdentifier	 USER  OPTION
,	TokenNameCOMMA	
"auser"	TokenNameStringLiteral	auser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
,	TokenNameCOMMA	
"thepassword"	TokenNameStringLiteral	thepassword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootLog	TokenNameIdentifier	 root Log
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"main"	TokenNameStringLiteral	main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Debug 1"	TokenNameStringLiteral	Debug 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"info 1"	TokenNameStringLiteral	info 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"warn 1"	TokenNameStringLiteral	warn 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"error 1"	TokenNameStringLiteral	error 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"fatal 1"	TokenNameStringLiteral	fatal 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
BUFFER_OPTION	TokenNameIdentifier	 BUFFER  OPTION
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Debug 2"	TokenNameStringLiteral	Debug 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"info 2"	TokenNameStringLiteral	info 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"warn 2"	TokenNameStringLiteral	warn 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"error 2"	TokenNameStringLiteral	error 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"fatal 2"	TokenNameStringLiteral	fatal 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
BUFFER_OPTION	TokenNameIdentifier	 BUFFER  OPTION
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Debug 3"	TokenNameStringLiteral	Debug 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"info 3"	TokenNameStringLiteral	info 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"warn 3"	TokenNameStringLiteral	warn 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"error 3"	TokenNameStringLiteral	error 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"fatal 3"	TokenNameStringLiteral	fatal 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Interrupted"	TokenNameStringLiteral	Interrupted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
