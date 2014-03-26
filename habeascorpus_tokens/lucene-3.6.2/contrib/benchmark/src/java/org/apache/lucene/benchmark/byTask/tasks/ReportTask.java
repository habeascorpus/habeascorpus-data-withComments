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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Format	TokenNameIdentifier	 Format
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Report (abstract) task - all report tasks extend this task. */	TokenNameCOMMENT_JAVADOC	 Report (abstract) task - all report tasks extend this task. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ReportTask	TokenNameIdentifier	 Report Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
ReportTask	TokenNameIdentifier	 Report Task
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
/* (non-Javadoc) * @see PerfTask#shouldNeverLogAtStart() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see PerfTask#shouldNeverLogAtStart() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldNeverLogAtStart	TokenNameIdentifier	 should Never Log At Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see PerfTask#shouldNotRecordStats() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see PerfTask#shouldNotRecordStats() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldNotRecordStats	TokenNameIdentifier	 should Not Record Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * From here start the code used to generate the reports. * Subclasses would use this part to generate reports. */	TokenNameCOMMENT_BLOCK	 From here start the code used to generate the reports. Subclasses would use this part to generate reports. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a textual summary of the benchmark results, average from all test runs. */	TokenNameCOMMENT_JAVADOC	 Get a textual summary of the benchmark results, average from all test runs. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OP	TokenNameIdentifier	 OP
=	TokenNameEQUAL	
"Operation "	TokenNameStringLiteral	Operation 
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROUND	TokenNameIdentifier	 ROUND
=	TokenNameEQUAL	
" round"	TokenNameStringLiteral	 round
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RUNCNT	TokenNameIdentifier	 RUNCNT
=	TokenNameEQUAL	
" runCnt"	TokenNameStringLiteral	 runCnt
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RECCNT	TokenNameIdentifier	 RECCNT
=	TokenNameEQUAL	
" recsPerRun"	TokenNameStringLiteral	 recsPerRun
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RECSEC	TokenNameIdentifier	 RECSEC
=	TokenNameEQUAL	
" rec/s"	TokenNameStringLiteral	 rec/s
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELAPSED	TokenNameIdentifier	 ELAPSED
=	TokenNameEQUAL	
" elapsedSec"	TokenNameStringLiteral	 elapsedSec
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USEDMEM	TokenNameIdentifier	 USEDMEM
=	TokenNameEQUAL	
" avgUsedMem"	TokenNameStringLiteral	 avgUsedMem
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOTMEM	TokenNameIdentifier	 TOTMEM
=	TokenNameEQUAL	
" avgTotalMem"	TokenNameStringLiteral	 avgTotalMem
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLS	TokenNameIdentifier	 COLS
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
RUNCNT	TokenNameIdentifier	 RUNCNT
,	TokenNameCOMMA	
RECCNT	TokenNameIdentifier	 RECCNT
,	TokenNameCOMMA	
RECSEC	TokenNameIdentifier	 RECSEC
,	TokenNameCOMMA	
ELAPSED	TokenNameIdentifier	 ELAPSED
,	TokenNameCOMMA	
USEDMEM	TokenNameIdentifier	 USEDMEM
,	TokenNameCOMMA	
TOTMEM	TokenNameIdentifier	 TOTMEM
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Compute a title line for a report table * @param longestOp size of longest op name in the table * @return the table title line. */	TokenNameCOMMENT_JAVADOC	 Compute a title line for a report table @param longestOp size of longest op name in the table @return the table title line. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
tableTitle	TokenNameIdentifier	 table Title
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
longestOp	TokenNameIdentifier	 longest Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
OP	TokenNameIdentifier	 OP
,	TokenNameCOMMA	
longestOp	TokenNameIdentifier	 longest Op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ROUND	TokenNameIdentifier	 ROUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getColsNamesForValsByRound	TokenNameIdentifier	 get Cols Names For Vals By Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
COLS	TokenNameIdentifier	 COLS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COLS	TokenNameIdentifier	 COLS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * find the longest op name out of completed tasks. * @param taskStats completed tasks to be considered. * @return the longest op name out of completed tasks. */	TokenNameCOMMENT_JAVADOC	 find the longest op name out of completed tasks. @param taskStats completed tasks to be considered. @return the longest op name out of completed tasks. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
longestOp	TokenNameIdentifier	 longest Op
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
taskStats	TokenNameIdentifier	 task Stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
longest	TokenNameIdentifier	 longest
=	TokenNameEQUAL	
OP	TokenNameIdentifier	 OP
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TaskStats	TokenNameIdentifier	 Task Stats
stat	TokenNameIdentifier	 stat
:	TokenNameCOLON	
taskStats	TokenNameIdentifier	 task Stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// consider only tasks that ended 	TokenNameCOMMENT_LINE	consider only tasks that ended 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
longest	TokenNameIdentifier	 longest
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longest	TokenNameIdentifier	 longest
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
longest	TokenNameIdentifier	 longest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a report line for the given task stat. * @param longestOp size of longest op name in the table. * @param stat task stat to be printed. * @return the report line. */	TokenNameCOMMENT_JAVADOC	 Compute a report line for the given task stat. @param longestOp size of longest op name in the table. @param stat task stat to be printed. @return the report line. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
taskReportLine	TokenNameIdentifier	 task Report Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
longestOp	TokenNameIdentifier	 longest Op
,	TokenNameCOMMA	
TaskStats	TokenNameIdentifier	 Task Stats
stat	TokenNameIdentifier	 stat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
longestOp	TokenNameIdentifier	 longest Op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
round	TokenNameIdentifier	 round
=	TokenNameEQUAL	
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getRound	TokenNameIdentifier	 get Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getRound	TokenNameIdentifier	 get Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
formatPaddLeft	TokenNameIdentifier	 format Padd Left
(	TokenNameLPAREN	
round	TokenNameIdentifier	 round
,	TokenNameCOMMA	
ROUND	TokenNameIdentifier	 ROUND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getColsValuesForValsByRound	TokenNameIdentifier	 get Cols Values For Vals By Round
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getRound	TokenNameIdentifier	 get Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RUNCNT	TokenNameIdentifier	 RUNCNT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RECCNT	TokenNameIdentifier	 RECCNT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assume at least 1ms 	TokenNameCOMMENT_LINE	assume at least 1ms 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
elapsed	TokenNameIdentifier	 elapsed
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RECSEC	TokenNameIdentifier	 RECSEC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELAPSED	TokenNameIdentifier	 ELAPSED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getMaxUsedMem	TokenNameIdentifier	 get Max Used Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
USEDMEM	TokenNameIdentifier	 USEDMEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getMaxTotMem	TokenNameIdentifier	 get Max Tot Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TOTMEM	TokenNameIdentifier	 TOTMEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Report	TokenNameIdentifier	 Report
genPartialReport	TokenNameIdentifier	 gen Partial Report
(	TokenNameLPAREN	
int	TokenNameint	
reported	TokenNameIdentifier	 reported
,	TokenNameCOMMA	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
partOfTasks	TokenNameIdentifier	 part Of Tasks
,	TokenNameCOMMA	
int	TokenNameint	
totalSize	TokenNameIdentifier	 total Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
longetOp	TokenNameIdentifier	 longet Op
=	TokenNameEQUAL	
longestOp	TokenNameIdentifier	 longest Op
(	TokenNameLPAREN	
partOfTasks	TokenNameIdentifier	 part Of Tasks
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tableTitle	TokenNameIdentifier	 table Title
(	TokenNameLPAREN	
longetOp	TokenNameIdentifier	 longet Op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lineNum	TokenNameIdentifier	 line Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TaskStats	TokenNameIdentifier	 Task Stats
stat	TokenNameIdentifier	 stat
:	TokenNameCOLON	
partOfTasks	TokenNameIdentifier	 part Of Tasks
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
taskReportLine	TokenNameIdentifier	 task Report Line
(	TokenNameLPAREN	
longetOp	TokenNameIdentifier	 longet Op
,	TokenNameCOMMA	
stat	TokenNameIdentifier	 stat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineNum	TokenNameIdentifier	 line Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
partOfTasks	TokenNameIdentifier	 part Of Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lineNum	TokenNameIdentifier	 line Num
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" - "	TokenNameStringLiteral	 - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
byTime	TokenNameIdentifier	 by Time
=	TokenNameEQUAL	
stat	TokenNameIdentifier	 stat
.	TokenNameDOT	
getCountsByTime	TokenNameIdentifier	 get Counts By Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
byTime	TokenNameIdentifier	 by Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
byTime	TokenNameIdentifier	 by Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
byTime	TokenNameIdentifier	 by Time
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" by time:"	TokenNameStringLiteral	 by time:
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
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
byTime	TokenNameIdentifier	 by Time
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
reptxt	TokenNameIdentifier	 reptxt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
reported	TokenNameIdentifier	 reported
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"No Matching Entries Were Found!"	TokenNameStringLiteral	No Matching Entries Were Found!
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Report	TokenNameIdentifier	 Report
(	TokenNameLPAREN	
reptxt	TokenNameIdentifier	 reptxt
,	TokenNameCOMMA	
partOfTasks	TokenNameIdentifier	 part Of Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reported	TokenNameIdentifier	 reported
,	TokenNameCOMMA	
totalSize	TokenNameIdentifier	 total Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
