package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
Report	TokenNameIdentifier	 Report
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
TaskStats	TokenNameIdentifier	 Task Stats
;	TokenNameSEMICOLON	
/** * Report all statistics grouped/aggregated by name and round. * <br>Other side effects: None. */	TokenNameCOMMENT_JAVADOC	 Report all statistics grouped/aggregated by name and round. <br>Other side effects: None. 
public	TokenNamepublic	
class	TokenNameclass	
RepSumByNameRoundTask	TokenNameIdentifier	 Rep Sum By Name Round Task
extends	TokenNameextends	
ReportTask	TokenNameIdentifier	 Report Task
{	TokenNameLBRACE	
public	TokenNamepublic	
RepSumByNameRoundTask	TokenNameIdentifier	 Rep Sum By Name Round Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Report	TokenNameIdentifier	 Report
rp	TokenNameIdentifier	 rp
=	TokenNameEQUAL	
reportSumByNameRound	TokenNameIdentifier	 report Sum By Name Round
(	TokenNameLPAREN	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
taskStats	TokenNameIdentifier	 task Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"------------> Report Sum By (any) Name and Round ("	TokenNameStringLiteral	------------> Report Sum By (any) Name and Round (
+	TokenNamePLUS	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" about "	TokenNameStringLiteral	 about 
+	TokenNamePLUS	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
getReported	TokenNameIdentifier	 get Reported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" out of "	TokenNameStringLiteral	 out of 
+	TokenNamePLUS	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
getOutOf	TokenNameIdentifier	 get Out Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report statistics as a string, aggregate for tasks named the same, and from the same round. * @return the report */	TokenNameCOMMENT_JAVADOC	 Report statistics as a string, aggregate for tasks named the same, and from the same round. @return the report 
protected	TokenNameprotected	
Report	TokenNameIdentifier	 Report
reportSumByNameRound	TokenNameIdentifier	 report Sum By Name Round
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
taskStats	TokenNameIdentifier	 task Stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// aggregate by task name and round 	TokenNameCOMMENT_LINE	aggregate by task name and round 
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
reported	TokenNameIdentifier	 reported
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TaskStats	TokenNameIdentifier	 Task Stats
stat1	TokenNameIdentifier	 stat1
:	TokenNameCOLON	
taskStats	TokenNameIdentifier	 task Stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stat1	TokenNameIdentifier	 stat1
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// consider only tasks that ended 	TokenNameCOMMENT_LINE	consider only tasks that ended 
reported	TokenNameIdentifier	 reported
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
stat1	TokenNameIdentifier	 stat1
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rname	TokenNameIdentifier	 rname
=	TokenNameEQUAL	
stat1	TokenNameIdentifier	 stat1
.	TokenNameDOT	
getRound	TokenNameIdentifier	 get Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// group by round 	TokenNameCOMMENT_LINE	group by round 
TaskStats	TokenNameIdentifier	 Task Stats
stat2	TokenNameIdentifier	 stat2
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rname	TokenNameIdentifier	 rname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stat2	TokenNameIdentifier	 stat2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stat2	TokenNameIdentifier	 stat2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskStats	TokenNameIdentifier	 Task Stats
)	TokenNameRPAREN	
stat1	TokenNameIdentifier	 stat1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rname	TokenNameIdentifier	 rname
,	TokenNameCOMMA	
stat2	TokenNameIdentifier	 stat2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
stat1	TokenNameIdentifier	 stat1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now generate report from secondary list p2 	TokenNameCOMMENT_LINE	now generate report from secondary list p2 
return	TokenNamereturn	
genPartialReport	TokenNameIdentifier	 gen Partial Report
(	TokenNameLPAREN	
reported	TokenNameIdentifier	 reported
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
taskStats	TokenNameIdentifier	 task Stats
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
