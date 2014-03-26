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
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
/** * @created 01 May 2001 */	TokenNameCOMMENT_JAVADOC	 @created 01 May 2001 
public	TokenNamepublic	
class	TokenNameclass	
SleepTest	TokenNameIdentifier	 Sleep Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
TRACE	TokenNameIdentifier	 TRACE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ERROR_RANGE	TokenNameIdentifier	 ERROR  RANGE
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SleepTest	TokenNameIdentifier	 Sleep Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"sleep.xml"	TokenNameStringLiteral	sleep.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Timer	TokenNameIdentifier	 Timer
timer	TokenNameIdentifier	 timer
=	TokenNameEQUAL	
new	TokenNamenew	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" test1 elapsed time="	TokenNameStringLiteral	 test1 elapsed time=
+	TokenNamePLUS	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Timer	TokenNameIdentifier	 Timer
timer	TokenNameIdentifier	 timer
=	TokenNameEQUAL	
new	TokenNamenew	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" test2 elapsed time="	TokenNameStringLiteral	 test2 elapsed time=
+	TokenNamePLUS	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Timer	TokenNameIdentifier	 Timer
timer	TokenNameIdentifier	 timer
=	TokenNameEQUAL	
new	TokenNamenew	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" test3 elapsed time="	TokenNameStringLiteral	 test3 elapsed time=
+	TokenNamePLUS	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
-	TokenNameMINUS	
ERROR_RANGE	TokenNameIdentifier	 ERROR  RANGE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Timer	TokenNameIdentifier	 Timer
timer	TokenNameIdentifier	 timer
=	TokenNameEQUAL	
new	TokenNamenew	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" test4 elapsed time="	TokenNameStringLiteral	 test4 elapsed time=
+	TokenNamePLUS	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
-	TokenNameMINUS	
ERROR_RANGE	TokenNameIdentifier	 ERROR  RANGE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
60000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
,	TokenNameCOMMA	
"Negative sleep periods are not supported"	TokenNameStringLiteral	Negative sleep periods are not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Timer	TokenNameIdentifier	 Timer
timer	TokenNameIdentifier	 timer
=	TokenNameEQUAL	
new	TokenNamenew	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" test6 elapsed time="	TokenNameStringLiteral	 test6 elapsed time=
+	TokenNamePLUS	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
timer	TokenNameIdentifier	 timer
.	TokenNameDOT	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * inner timer class */	TokenNameCOMMENT_JAVADOC	 inner timer class 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Timer	TokenNameIdentifier	 Timer
{	TokenNameLBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Timer	TokenNameIdentifier	 Timer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
time	TokenNameIdentifier	 time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stop	TokenNameIdentifier	 stop
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
