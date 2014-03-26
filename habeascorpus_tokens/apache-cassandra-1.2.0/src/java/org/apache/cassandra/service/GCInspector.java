/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MemoryMXBean	TokenNameIdentifier	 Memory MX Bean
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MemoryUsage	TokenNameIdentifier	 Memory Usage
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StatusLogger	TokenNameIdentifier	 Status Logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
GCInspector	TokenNameIdentifier	 GC Inspector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
GCInspector	TokenNameIdentifier	 GC Inspector
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
INTERVAL_IN_MS	TokenNameIdentifier	 INTERVAL  IN  MS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
MIN_DURATION	TokenNameIdentifier	 MIN  DURATION
=	TokenNameEQUAL	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
MIN_DURATION_TPSTATS	TokenNameIdentifier	 MIN  DURATION  TPSTATS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
GCInspector	TokenNameIdentifier	 GC Inspector
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
GCInspector	TokenNameIdentifier	 GC Inspector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
gctimes	TokenNameIdentifier	 gctimes
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
gccounts	TokenNameIdentifier	 gccounts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
>	TokenNameGREATER	
beans	TokenNameIdentifier	 beans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MemoryMXBean	TokenNameIdentifier	 Memory MX Bean
membean	TokenNameIdentifier	 membean
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getMemoryMXBean	TokenNameIdentifier	 get Memory MX Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
cacheSizesReduced	TokenNameIdentifier	 cache Sizes Reduced
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GCInspector	TokenNameIdentifier	 GC Inspector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MBeanServer	TokenNameIdentifier	 M Bean Server
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ObjectName	TokenNameIdentifier	 Object Name
gcName	TokenNameIdentifier	 gc Name
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
GARBAGE_COLLECTOR_MXBEAN_DOMAIN_TYPE	TokenNameIdentifier	 GARBAGE  COLLECTOR  MXBEAN  DOMAIN  TYPE
+	TokenNamePLUS	
",*"	TokenNameStringLiteral	,*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ObjectName	TokenNameIdentifier	 Object Name
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
queryNames	TokenNameIdentifier	 query Names
(	TokenNameLPAREN	
gcName	TokenNameIdentifier	 gc Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
gc	TokenNameIdentifier	 gc
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
newPlatformMXBeanProxy	TokenNameIdentifier	 new Platform MX Bean Proxy
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't bother starting a thread that will do nothing. 	TokenNameCOMMENT_LINE	don't bother starting a thread that will do nothing. 
if	TokenNameif	
(	TokenNameLPAREN	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logGCResults	TokenNameIdentifier	 log GC Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
scheduledTasks	TokenNameIdentifier	 scheduled Tasks
.	TokenNameDOT	
scheduleWithFixedDelay	TokenNameIdentifier	 schedule With Fixed Delay
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
INTERVAL_IN_MS	TokenNameIdentifier	 INTERVAL  IN  MS
,	TokenNameCOMMA	
INTERVAL_IN_MS	TokenNameIdentifier	 INTERVAL  IN  MS
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
logGCResults	TokenNameIdentifier	 log GC Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
gc	TokenNameIdentifier	 gc
:	TokenNameCOLON	
beans	TokenNameIdentifier	 beans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
previousTotal	TokenNameIdentifier	 previous Total
=	TokenNameEQUAL	
gctimes	TokenNameIdentifier	 gctimes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getCollectionTime	TokenNameIdentifier	 get Collection Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousTotal	TokenNameIdentifier	 previous Total
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
previousTotal	TokenNameIdentifier	 previous Total
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousTotal	TokenNameIdentifier	 previous Total
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
gctimes	TokenNameIdentifier	 gctimes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
-	TokenNameMINUS	
previousTotal	TokenNameIdentifier	 previous Total
;	TokenNameSEMICOLON	
// may be zero for a really fast collection 	TokenNameCOMMENT_LINE	may be zero for a really fast collection 
Long	TokenNameIdentifier	 Long
previousCount	TokenNameIdentifier	 previous Count
=	TokenNameEQUAL	
gccounts	TokenNameIdentifier	 gccounts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getCollectionCount	TokenNameIdentifier	 get Collection Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousCount	TokenNameIdentifier	 previous Count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
previousCount	TokenNameIdentifier	 previous Count
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
previousCount	TokenNameIdentifier	 previous Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
gccounts	TokenNameIdentifier	 gccounts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MemoryUsage	TokenNameIdentifier	 Memory Usage
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
membean	TokenNameIdentifier	 membean
.	TokenNameDOT	
getHeapMemoryUsage	TokenNameIdentifier	 get Heap Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
memoryUsed	TokenNameIdentifier	 memory Used
=	TokenNameEQUAL	
mu	TokenNameIdentifier	 mu
.	TokenNameDOT	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
memoryMax	TokenNameIdentifier	 memory Max
=	TokenNameEQUAL	
mu	TokenNameIdentifier	 mu
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"GC for %s: %s ms for %s collections, %s used; max is %s"	TokenNameStringLiteral	GC for %s: %s ms for %s collections, %s used; max is %s
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
duration	TokenNameIdentifier	 duration
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
previousCount	TokenNameIdentifier	 previous Count
,	TokenNameCOMMA	
memoryUsed	TokenNameIdentifier	 memory Used
,	TokenNameCOMMA	
memoryMax	TokenNameIdentifier	 memory Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
durationPerCollection	TokenNameIdentifier	 duration Per Collection
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
previousCount	TokenNameIdentifier	 previous Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
durationPerCollection	TokenNameIdentifier	 duration Per Collection
>	TokenNameGREATER	
MIN_DURATION	TokenNameIdentifier	 MIN  DURATION
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
durationPerCollection	TokenNameIdentifier	 duration Per Collection
>	TokenNameGREATER	
MIN_DURATION_TPSTATS	TokenNameIdentifier	 MIN  DURATION  TPSTATS
)	TokenNameRPAREN	
StatusLogger	TokenNameIdentifier	 Status Logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if we just finished a full collection and we're still using a lot of memory, try to reduce the pressure 	TokenNameCOMMENT_LINE	if we just finished a full collection and we're still using a lot of memory, try to reduce the pressure 
if	TokenNameif	
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ConcurrentMarkSweep"	TokenNameStringLiteral	ConcurrentMarkSweep
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
.	TokenNameDOT	
rescheduleFailedTasks	TokenNameIdentifier	 reschedule Failed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
usage	TokenNameIdentifier	 usage
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
memoryUsed	TokenNameIdentifier	 memory Used
/	TokenNameDIVIDE	
memoryMax	TokenNameIdentifier	 memory Max
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
memoryUsed	TokenNameIdentifier	 memory Used
>	TokenNameGREATER	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getReduceCacheSizesAt	TokenNameIdentifier	 get Reduce Cache Sizes At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
memoryMax	TokenNameIdentifier	 memory Max
&&	TokenNameAND_AND	
!	TokenNameNOT	
cacheSizesReduced	TokenNameIdentifier	 cache Sizes Reduced
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheSizesReduced	TokenNameIdentifier	 cache Sizes Reduced
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Heap is "	TokenNameStringLiteral	Heap is 
+	TokenNamePLUS	
usage	TokenNameIdentifier	 usage
+	TokenNamePLUS	
" full. You may need to reduce memtable and/or cache sizes. Cassandra is now reducing cache sizes to free up memory. Adjust reduce_cache_sizes_at threshold in cassandra.yaml if you don't want Cassandra to do this automatically"	TokenNameStringLiteral	 full. You may need to reduce memtable and/or cache sizes. Cassandra is now reducing cache sizes to free up memory. Adjust reduce_cache_sizes_at threshold in cassandra.yaml if you don't want Cassandra to do this automatically
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CacheService	TokenNameIdentifier	 Cache Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
reduceCacheSizes	TokenNameIdentifier	 reduce Cache Sizes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
memoryUsed	TokenNameIdentifier	 memory Used
>	TokenNameGREATER	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getFlushLargestMemtablesAt	TokenNameIdentifier	 get Flush Largest Memtables At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
memoryMax	TokenNameIdentifier	 memory Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Heap is "	TokenNameStringLiteral	Heap is 
+	TokenNamePLUS	
usage	TokenNameIdentifier	 usage
+	TokenNamePLUS	
" full. You may need to reduce memtable and/or cache sizes. Cassandra will now flush up to the two largest memtables to free up memory. Adjust flush_largest_memtables_at threshold in cassandra.yaml if you don't want Cassandra to do this automatically"	TokenNameStringLiteral	 full. You may need to reduce memtable and/or cache sizes. Cassandra will now flush up to the two largest memtables to free up memory. Adjust flush_largest_memtables_at threshold in cassandra.yaml if you don't want Cassandra to do this automatically
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
flushLargestMemtables	TokenNameIdentifier	 flush Largest Memtables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
