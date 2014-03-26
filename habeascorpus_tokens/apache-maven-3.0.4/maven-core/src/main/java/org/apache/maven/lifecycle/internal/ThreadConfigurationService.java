package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutorService	TokenNameIdentifier	 Executor Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Executors	TokenNameIdentifier	 Executors
;	TokenNameSEMICOLON	
/** * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 @since 3.0 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ThreadConfigurationService	TokenNameIdentifier	 Thread Configuration Service
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
ThreadConfigurationService	TokenNameIdentifier	 Thread Configuration Service
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
cpuCores	TokenNameIdentifier	 cpu Cores
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"UnusedDeclaration"	TokenNameStringLiteral	UnusedDeclaration
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
ThreadConfigurationService	TokenNameIdentifier	 Thread Configuration Service
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cpuCores	TokenNameIdentifier	 cpu Cores
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
availableProcessors	TokenNameIdentifier	 available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ThreadConfigurationService	TokenNameIdentifier	 Thread Configuration Service
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
int	TokenNameint	
cpuCores	TokenNameIdentifier	 cpu Cores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cpuCores	TokenNameIdentifier	 cpu Cores
=	TokenNameEQUAL	
cpuCores	TokenNameIdentifier	 cpu Cores
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExecutorService	TokenNameIdentifier	 Executor Service
getExecutorService	TokenNameIdentifier	 get Executor Service
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
,	TokenNameCOMMA	
boolean	TokenNameboolean	
perCoreThreadCount	TokenNameIdentifier	 per Core Thread Count
,	TokenNameCOMMA	
int	TokenNameint	
largestBuildListSize	TokenNameIdentifier	 largest Build List Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
threadCount	TokenNameIdentifier	 thread Count
=	TokenNameEQUAL	
getThreadCount	TokenNameIdentifier	 get Thread Count
(	TokenNameLPAREN	
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
,	TokenNameCOMMA	
perCoreThreadCount	TokenNameIdentifier	 per Core Thread Count
,	TokenNameCOMMA	
largestBuildListSize	TokenNameIdentifier	 largest Build List Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getExecutorService	TokenNameIdentifier	 get Executor Service
(	TokenNameLPAREN	
threadCount	TokenNameIdentifier	 thread Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ExecutorService	TokenNameIdentifier	 Executor Service
getExecutorService	TokenNameIdentifier	 get Executor Service
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
threadCount	TokenNameIdentifier	 thread Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
threadCount	TokenNameIdentifier	 thread Count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Building with unlimited threads"	TokenNameStringLiteral	Building with unlimited threads
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Executors	TokenNameIdentifier	 Executors
.	TokenNameDOT	
newCachedThreadPool	TokenNameIdentifier	 new Cached Thread Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Building with "	TokenNameStringLiteral	Building with 
+	TokenNamePLUS	
threadCount	TokenNameIdentifier	 thread Count
+	TokenNamePLUS	
" threads"	TokenNameStringLiteral	 threads
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Executors	TokenNameIdentifier	 Executors
.	TokenNameDOT	
newFixedThreadPool	TokenNameIdentifier	 new Fixed Thread Pool
(	TokenNameLPAREN	
threadCount	TokenNameIdentifier	 thread Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the thread count to use or null for unlimited threads. * * @param threadCountConfiguration The property passed from the command line. * @param perCoreThreadCount Indicates if the threa count should be scaled per cpu core. * @param largestBuildListSize the size of the largest module list (the number of modules) * @return The number of threads to use or null if unlimited */	TokenNameCOMMENT_JAVADOC	 Returns the thread count to use or null for unlimited threads. * @param threadCountConfiguration The property passed from the command line. @param perCoreThreadCount Indicates if the threa count should be scaled per cpu core. @param largestBuildListSize the size of the largest module list (the number of modules) @return The number of threads to use or null if unlimited 
Integer	TokenNameIdentifier	 Integer
getThreadCount	TokenNameIdentifier	 get Thread Count
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
,	TokenNameCOMMA	
boolean	TokenNameboolean	
perCoreThreadCount	TokenNameIdentifier	 per Core Thread Count
,	TokenNameCOMMA	
int	TokenNameint	
largestBuildListSize	TokenNameIdentifier	 largest Build List Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default to a value that is not larger than what we can use ;) 	TokenNameCOMMENT_LINE	Default to a value that is not larger than what we can use ;) 
float	TokenNamefloat	
threadCount	TokenNameIdentifier	 thread Count
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
cpuCores	TokenNameIdentifier	 cpu Cores
,	TokenNameCOMMA	
largestBuildListSize	TokenNameIdentifier	 largest Build List Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
threadCount	TokenNameIdentifier	 thread Count
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Couldn't parse thread count, will default to "	TokenNameStringLiteral	Couldn't parse thread count, will default to 
+	TokenNamePLUS	
threadCount	TokenNameIdentifier	 thread Count
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
threadCountConfiguration	TokenNameIdentifier	 thread Count Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
perCoreThreadCount	TokenNameIdentifier	 per Core Thread Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
threadCount	TokenNameIdentifier	 thread Count
=	TokenNameEQUAL	
threadCount	TokenNameIdentifier	 thread Count
*	TokenNameMULTIPLY	
cpuCores	TokenNameIdentifier	 cpu Cores
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
endResult	TokenNameIdentifier	 end Result
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
threadCount	TokenNameIdentifier	 thread Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Thread pool size: "	TokenNameStringLiteral	Thread pool size: 
+	TokenNamePLUS	
endResult	TokenNameIdentifier	 end Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
endResult	TokenNameIdentifier	 end Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
