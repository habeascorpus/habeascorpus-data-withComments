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
/** * Simply waits for the specified (via the parameter) amount * of time. For example Wait(30s) waits for 30 seconds. * This is useful with background tasks to control how long * the tasks run. * *<p>You can specify h, m, or s (hours, minutes, seconds) as *the trailing time unit. No unit is interpreted as *seconds.</p> */	TokenNameCOMMENT_JAVADOC	 Simply waits for the specified (via the parameter) amount of time. For example Wait(30s) waits for 30 seconds. This is useful with background tasks to control how long the tasks run. *<p>You can specify h, m, or s (hours, minutes, seconds) as *the trailing time unit. No unit is interpreted as *seconds.</p> 
public	TokenNamepublic	
class	TokenNameclass	
WaitTask	TokenNameIdentifier	 Wait Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
waitTimeSec	TokenNameIdentifier	 wait Time Sec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WaitTask	TokenNameIdentifier	 Wait Task
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
void	TokenNamevoid	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"m"	TokenNameStringLiteral	m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
3600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume seconds 	TokenNameCOMMENT_LINE	Assume seconds 
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
waitTimeSec	TokenNameIdentifier	 wait Time Sec
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"you must specify the wait time, eg: 10.0s, 4.5m, 2h"	TokenNameStringLiteral	you must specify the wait time, eg: 10.0s, 4.5m, 2h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
waitTimeSec	TokenNameIdentifier	 wait Time Sec
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
