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
Properties	TokenNameIdentifier	 Properties
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
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** Tests the functionality of the abstract {@link PerfTask}. */	TokenNameCOMMENT_JAVADOC	 Tests the functionality of the abstract {@link PerfTask}. 
public	TokenNamepublic	
class	TokenNameclass	
PerfTaskTest	TokenNameIdentifier	 Perf Task Test
extends	TokenNameextends	
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MyPerfTask	TokenNameIdentifier	 My Perf Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
MyPerfTask	TokenNameIdentifier	 My Perf Task
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
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLogStep	TokenNameIdentifier	 get Log Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logStep	TokenNameIdentifier	 log Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
PerfRunData	TokenNameIdentifier	 Perf Run Data
createPerfRunData	TokenNameIdentifier	 create Perf Run Data
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setLogStep	TokenNameIdentifier	 set Log Step
,	TokenNameCOMMA	
int	TokenNameint	
logStepVal	TokenNameIdentifier	 log Step Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setTaskLogStep	TokenNameIdentifier	 set Task Log Step
,	TokenNameCOMMA	
int	TokenNameint	
taskLogStepVal	TokenNameIdentifier	 task Log Step Val
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setLogStep	TokenNameIdentifier	 set Log Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"log.step"	TokenNameStringLiteral	log.step
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
logStepVal	TokenNameIdentifier	 log Step Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setTaskLogStep	TokenNameIdentifier	 set Task Log Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"log.step.MyPerf"	TokenNameStringLiteral	log.step.MyPerf
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
taskLogStepVal	TokenNameIdentifier	 task Log Step Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"directory"	TokenNameStringLiteral	directory
,	TokenNameCOMMA	
"RAMDirectory"	TokenNameStringLiteral	RAMDirectory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no accidental FS dir. 	TokenNameCOMMENT_LINE	no accidental FS dir. 
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
new	TokenNamenew	
Config	TokenNameIdentifier	 Config
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PerfRunData	TokenNameIdentifier	 Perf Run Data
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setLogStep	TokenNameIdentifier	 set Log Step
,	TokenNameCOMMA	
int	TokenNameint	
logStepVal	TokenNameIdentifier	 log Step Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setTaskLogStep	TokenNameIdentifier	 set Task Log Step
,	TokenNameCOMMA	
int	TokenNameint	
taskLogStepVal	TokenNameIdentifier	 task Log Step Val
,	TokenNameCOMMA	
int	TokenNameint	
expLogStepValue	TokenNameIdentifier	 exp Log Step Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
=	TokenNameEQUAL	
createPerfRunData	TokenNameIdentifier	 create Perf Run Data
(	TokenNameLPAREN	
setLogStep	TokenNameIdentifier	 set Log Step
,	TokenNameCOMMA	
logStepVal	TokenNameIdentifier	 log Step Val
,	TokenNameCOMMA	
setTaskLogStep	TokenNameIdentifier	 set Task Log Step
,	TokenNameCOMMA	
taskLogStepVal	TokenNameIdentifier	 task Log Step Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MyPerfTask	TokenNameIdentifier	 My Perf Task
mpt	TokenNameIdentifier	 mpt
=	TokenNameEQUAL	
new	TokenNamenew	
MyPerfTask	TokenNameIdentifier	 My Perf Task
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expLogStepValue	TokenNameIdentifier	 exp Log Step Value
,	TokenNameCOMMA	
mpt	TokenNameIdentifier	 mpt
.	TokenNameDOT	
getLogStep	TokenNameIdentifier	 get Log Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLogStep	TokenNameIdentifier	 test Log Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PerfTask	TokenNameIdentifier	 Perf Task
.	TokenNameDOT	
DEFAULT_LOG_STEP	TokenNameIdentifier	 DEFAULT  LOG  STEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doLogStepTest	TokenNameIdentifier	 do Log Step Test
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
