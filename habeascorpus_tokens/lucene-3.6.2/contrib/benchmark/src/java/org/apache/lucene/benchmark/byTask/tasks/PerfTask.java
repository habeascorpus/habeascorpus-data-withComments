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
Points	TokenNameIdentifier	 Points
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
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** * An abstract task to be tested for performance. <br> * Every performance task extends this class, and provides its own * {@link #doLogic()} method, which performs the actual task. <br> * Tasks performing some work that should be measured for the task, can override * {@link #setup()} and/or {@link #tearDown()} and place that work there. <br> * Relevant properties: <code>task.max.depth.log</code>.<br> * Also supports the following logging attributes: * <ul> * <li>log.step - specifies how often to log messages about the current running * task. Default is 1000 {@link #doLogic()} invocations. Set to -1 to disable * logging. * <li>log.step.[class Task Name] - specifies the same as 'log.step', only for a * particular task name. For example, log.step.AddDoc will be applied only for * {@link AddDocTask}, but not for {@link DeleteDocTask}. It's a way to control * per task logging settings. If you want to omit logging for any other task, * include log.step=-1. The syntax is "log.step." together with the Task's * 'short' name (i.e., without the 'Task' part). * </ul> */	TokenNameCOMMENT_JAVADOC	 An abstract task to be tested for performance. <br> Every performance task extends this class, and provides its own {@link #doLogic()} method, which performs the actual task. <br> Tasks performing some work that should be measured for the task, can override {@link #setup()} and/or {@link #tearDown()} and place that work there. <br> Relevant properties: <code>task.max.depth.log</code>.<br> Also supports the following logging attributes: <ul> <li>log.step - specifies how often to log messages about the current running task. Default is 1000 {@link #doLogic()} invocations. Set to -1 to disable logging. <li>log.step.[class Task Name] - specifies the same as 'log.step', only for a particular task name. For example, log.step.AddDoc will be applied only for {@link AddDocTask}, but not for {@link DeleteDocTask}. It's a way to control per task logging settings. If you want to omit logging for any other task, include log.step=-1. The syntax is "log.step." together with the Task's 'short' name (i.e., without the 'Task' part). </ul> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PerfTask	TokenNameIdentifier	 Perf Task
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_LOG_STEP	TokenNameIdentifier	 DEFAULT  LOG  STEP
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
;	TokenNameSEMICOLON	
// propeties that all tasks have 	TokenNameCOMMENT_LINE	propeties that all tasks have 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
logStep	TokenNameIdentifier	 log Step
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
logStepCount	TokenNameIdentifier	 log Step Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDepthLogStart	TokenNameIdentifier	 max Depth Log Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
disableCounting	TokenNameIdentifier	 disable Counting
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
runInBackground	TokenNameIdentifier	 run In Background
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
deltaPri	TokenNameIdentifier	 delta Pri
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEW_LINE	TokenNameIdentifier	 NEW  LINE
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Should not be used externally */	TokenNameCOMMENT_JAVADOC	 Should not be used externally 
private	TokenNameprivate	
PerfTask	TokenNameIdentifier	 Perf Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"Task"	TokenNameStringLiteral	Task
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRunInBackground	TokenNameIdentifier	 set Run In Background
(	TokenNameLPAREN	
int	TokenNameint	
deltaPri	TokenNameIdentifier	 delta Pri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runInBackground	TokenNameIdentifier	 run In Background
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deltaPri	TokenNameIdentifier	 delta Pri
=	TokenNameEQUAL	
deltaPri	TokenNameIdentifier	 delta Pri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getRunInBackground	TokenNameIdentifier	 get Run In Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runInBackground	TokenNameIdentifier	 run In Background
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBackgroundDeltaPriority	TokenNameIdentifier	 get Background Delta Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deltaPri	TokenNameIdentifier	 delta Pri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stopNow	TokenNameIdentifier	 stop Now
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopNow	TokenNameIdentifier	 stop Now
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PerfTask	TokenNameIdentifier	 Perf Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
runData	TokenNameIdentifier	 run Data
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
;	TokenNameSEMICOLON	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxDepthLogStart	TokenNameIdentifier	 max Depth Log Start
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"task.max.depth.log"	TokenNameStringLiteral	task.max.depth.log
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
logStepAtt	TokenNameIdentifier	 log Step Att
=	TokenNameEQUAL	
"log.step"	TokenNameStringLiteral	log.step
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
taskLogStepAtt	TokenNameIdentifier	 task Log Step Att
=	TokenNameEQUAL	
"log.step."	TokenNameStringLiteral	log.step.
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
taskLogStepAtt	TokenNameIdentifier	 task Log Step Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logStepAtt	TokenNameIdentifier	 log Step Att
=	TokenNameEQUAL	
taskLogStepAtt	TokenNameIdentifier	 task Log Step Att
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// It's important to read this from Config, to support vals-by-round. 	TokenNameCOMMENT_LINE	It's important to read this from Config, to support vals-by-round. 
logStep	TokenNameIdentifier	 log Step
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
logStepAtt	TokenNameIdentifier	 log Step Att
,	TokenNameCOMMA	
DEFAULT_LOG_STEP	TokenNameIdentifier	 DEFAULT  LOG  STEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// To avoid the check 'if (logStep > 0)' in tearDown(). This effectively 	TokenNameCOMMENT_LINE	To avoid the check 'if (logStep > 0)' in tearDown(). This effectively 
// turns logging off. 	TokenNameCOMMENT_LINE	turns logging off. 
if	TokenNameif	
(	TokenNameLPAREN	
logStep	TokenNameIdentifier	 log Step
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logStep	TokenNameIdentifier	 log Step
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
// tasks having non primitive data structures should override this. 	TokenNameCOMMENT_LINE	tasks having non primitive data structures should override this. 
// otherwise parallel running of a task sequence might not run correctly. 	TokenNameCOMMENT_LINE	otherwise parallel running of a task sequence might not run correctly. 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Run the task, record statistics. * @return number of work items done by this task. */	TokenNameCOMMENT_JAVADOC	 Run the task, record statistics. @return number of work items done by this task. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reportStats	TokenNameIdentifier	 report Stats
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reportStats	TokenNameIdentifier	 report Stats
||	TokenNameOR_OR	
shouldNotRecordStats	TokenNameIdentifier	 should Not Record Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
disableCounting	TokenNameIdentifier	 disable Counting
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reportStats	TokenNameIdentifier	 report Stats
&&	TokenNameAND_AND	
depth	TokenNameIdentifier	 depth
<=	TokenNameLESS_EQUAL	
maxDepthLogStart	TokenNameIdentifier	 max Depth Log Start
&&	TokenNameAND_AND	
!	TokenNameNOT	
shouldNeverLogAtStart	TokenNameIdentifier	 should Never Log At Start
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
"------------> starting task: "	TokenNameStringLiteral	------------> starting task: 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Points	TokenNameIdentifier	 Points
pnts	TokenNameIdentifier	 pnts
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaskStats	TokenNameIdentifier	 Task Stats
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
pnts	TokenNameIdentifier	 pnts
.	TokenNameDOT	
markTaskStart	TokenNameIdentifier	 mark Task Start
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRoundNumber	TokenNameIdentifier	 get Round Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
disableCounting	TokenNameIdentifier	 disable Counting
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
pnts	TokenNameIdentifier	 pnts
.	TokenNameDOT	
markTaskEnd	TokenNameIdentifier	 mark Task End
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform the task once (ignoring repetitions specification) * Return number of work items done by this task. * For indexing that can be number of docs added. * For warming that can be number of scanned items, etc. * @return number of work items done by this task. */	TokenNameCOMMENT_JAVADOC	 Perform the task once (ignoring repetitions specification) Return number of work items done by this task. For indexing that can be number of docs added. For warming that can be number of scanned items, etc. @return number of work items done by this task. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * @return Returns the name. */	TokenNameCOMMENT_JAVADOC	 @return Returns the name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param name The name to set. */	TokenNameCOMMENT_JAVADOC	 @param name The name to set. 
protected	TokenNameprotected	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the run data. */	TokenNameCOMMENT_JAVADOC	 @return Returns the run data. 
public	TokenNamepublic	
PerfRunData	TokenNameIdentifier	 Perf Run Data
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runData	TokenNameIdentifier	 run Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the depth. */	TokenNameCOMMENT_JAVADOC	 @return Returns the depth. 
public	TokenNamepublic	
int	TokenNameint	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param depth The depth to set. */	TokenNameCOMMENT_JAVADOC	 @param depth The depth to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// compute a blank string padding for printing this task indented by its depth 	TokenNameCOMMENT_LINE	compute a blank string padding for printing this task indented by its depth 
String	TokenNameIdentifier	 String
getPadding	TokenNameIdentifier	 get Padding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
padd	TokenNameIdentifier	 padd
=	TokenNameEQUAL	
getPadding	TokenNameIdentifier	 get Padding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
padd	TokenNameIdentifier	 padd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
disableCounting	TokenNameIdentifier	 disable Counting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getRunInBackground	TokenNameIdentifier	 get Run In Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" &"	TokenNameStringLiteral	 &
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
getBackgroundDeltaPriority	TokenNameIdentifier	 get Background Delta Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the maxDepthLogStart. */	TokenNameCOMMENT_JAVADOC	 @return Returns the maxDepthLogStart. 
int	TokenNameint	
getMaxDepthLogStart	TokenNameIdentifier	 get Max Depth Log Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDepthLogStart	TokenNameIdentifier	 max Depth Log Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
int	TokenNameint	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"processed "	TokenNameStringLiteral	processed 
+	TokenNamePLUS	
recsCount	TokenNameIdentifier	 recs Count
+	TokenNamePLUS	
" records"	TokenNameStringLiteral	 records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tasks that should never log at start can override this. * @return true if this task should never log when it start. */	TokenNameCOMMENT_JAVADOC	 Tasks that should never log at start can override this. @return true if this task should never log when it start. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldNeverLogAtStart	TokenNameIdentifier	 should Never Log At Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tasks that should not record statistics can override this. * @return true if this task should never record its statistics. */	TokenNameCOMMENT_JAVADOC	 Tasks that should not record statistics can override this. @return true if this task should never record its statistics. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldNotRecordStats	TokenNameIdentifier	 should Not Record Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Task setup work that should not be measured for that specific task. By * default it does nothing, but tasks can implement this, moving work from * {@link #doLogic()} to this method. Only the work done in {@link #doLogic()} * is measured for this task. Notice that higher level (sequence) tasks * containing this task would then measure larger time than the sum of their * contained tasks. */	TokenNameCOMMENT_JAVADOC	 Task setup work that should not be measured for that specific task. By default it does nothing, but tasks can implement this, moving work from {@link #doLogic()} to this method. Only the work done in {@link #doLogic()} is measured for this task. Notice that higher level (sequence) tasks containing this task would then measure larger time than the sum of their contained tasks. 
public	TokenNamepublic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Task tearDown work that should not be measured for that specific task. By * default it does nothing, but tasks can implement this, moving work from * {@link #doLogic()} to this method. Only the work done in {@link #doLogic()} * is measured for this task. Notice that higher level (sequence) tasks * containing this task would then measure larger time than the sum of their * contained tasks. */	TokenNameCOMMENT_JAVADOC	 Task tearDown work that should not be measured for that specific task. By default it does nothing, but tasks can implement this, moving work from {@link #doLogic()} to this method. Only the work done in {@link #doLogic()} is measured for this task. Notice that higher level (sequence) tasks containing this task would then measure larger time than the sum of their contained tasks. 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
logStepCount	TokenNameIdentifier	 log Step Count
%	TokenNameREMAINDER	
logStep	TokenNameIdentifier	 log Step
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getStartTimeMillis	TokenNameIdentifier	 get Start Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000.0	TokenNameDoubleLiteral	
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
"%7.2f"	TokenNameStringLiteral	%7.2f
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
+	TokenNamePLUS	
" sec --> "	TokenNameStringLiteral	 sec --> 
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
logStepCount	TokenNameIdentifier	 log Step Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sub classes that support parameters must override this method to return * true. * * @return true iff this task supports command line params. */	TokenNameCOMMENT_JAVADOC	 Sub classes that support parameters must override this method to return true. * @return true iff this task supports command line params. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the params of this task. * * @exception UnsupportedOperationException * for tasks supporting command line parameters. */	TokenNameCOMMENT_JAVADOC	 Set the params of this task. * @exception UnsupportedOperationException for tasks supporting command line parameters. 
public	TokenNamepublic	
void	TokenNamevoid	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not support command line parameters."	TokenNameStringLiteral	 does not support command line parameters.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the Params. */	TokenNameCOMMENT_JAVADOC	 @return Returns the Params. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getParams	TokenNameIdentifier	 get Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if counting is disabled for this task. */	TokenNameCOMMENT_JAVADOC	 Return true if counting is disabled for this task. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDisableCounting	TokenNameIdentifier	 is Disable Counting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
disableCounting	TokenNameIdentifier	 disable Counting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See {@link #isDisableCounting()} */	TokenNameCOMMENT_JAVADOC	 See {@link #isDisableCounting()} 
public	TokenNamepublic	
void	TokenNamevoid	
setDisableCounting	TokenNameIdentifier	 set Disable Counting
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCounting	TokenNameIdentifier	 disable Counting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
disableCounting	TokenNameIdentifier	 disable Counting
=	TokenNameEQUAL	
disableCounting	TokenNameIdentifier	 disable Counting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
