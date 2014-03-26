package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Ignore	TokenNameIdentifier	 Ignore
;	TokenNameSEMICOLON	
/** * Estimates how {@link RamUsageEstimator} estimates physical memory consumption * of Java objects. */	TokenNameCOMMENT_JAVADOC	 Estimates how {@link RamUsageEstimator} estimates physical memory consumption of Java objects. 
public	TokenNamepublic	
class	TokenNameclass	
StressRamUsageEstimator	TokenNameIdentifier	 Stress Ram Usage Estimator
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
createNext	TokenNameIdentifier	 create Next
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This shows an easy stack overflow because we're counting recursively. 	TokenNameCOMMENT_LINE	This shows an easy stack overflow because we're counting recursively. 
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testChainedEstimation	TokenNameIdentifier	 test Chained Estimation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MemoryMXBean	TokenNameIdentifier	 Memory MX Bean
memoryMXBean	TokenNameIdentifier	 memory MX Bean
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getMemoryMXBean	TokenNameIdentifier	 get Memory MX Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
rnd	TokenNameIdentifier	 rnd
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check the current memory consumption and provide the estimate. 	TokenNameCOMMENT_LINE	Check the current memory consumption and provide the estimate. 
long	TokenNamelong	
jvmUsed	TokenNameIdentifier	 jvm Used
=	TokenNameEQUAL	
memoryMXBean	TokenNameIdentifier	 memory MX Bean
.	TokenNameDOT	
getHeapMemoryUsage	TokenNameIdentifier	 get Heap Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
estimated	TokenNameIdentifier	 estimated
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
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
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
"%10d, %10d"	TokenNameStringLiteral	%10d, %10d
,	TokenNameCOMMA	
jvmUsed	TokenNameIdentifier	 jvm Used
,	TokenNameCOMMA	
estimated	TokenNameIdentifier	 estimated
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make a batch of objects. 	TokenNameCOMMENT_LINE	Make a batch of objects. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
createNext	TokenNameIdentifier	 create Next
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Release and quit. 	TokenNameCOMMENT_LINE	Release and quit. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
volatile	TokenNamevolatile	
Object	TokenNameIdentifier	 Object
guard	TokenNameIdentifier	 guard
;	TokenNameSEMICOLON	
// This shows an easy stack overflow because we're counting recursively. 	TokenNameCOMMENT_LINE	This shows an easy stack overflow because we're counting recursively. 
public	TokenNamepublic	
void	TokenNamevoid	
testLargeSetOfByteArrays	TokenNameIdentifier	 test Large Set Of Byte Arrays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MemoryMXBean	TokenNameIdentifier	 Memory MX Bean
memoryMXBean	TokenNameIdentifier	 memory MX Bean
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getMemoryMXBean	TokenNameIdentifier	 get Memory MX Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
causeGc	TokenNameIdentifier	 cause Gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
memoryMXBean	TokenNameIdentifier	 memory MX Bean
.	TokenNameDOT	
getHeapMemoryUsage	TokenNameIdentifier	 get Heap Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1000000	TokenNameIntegerLiteral	
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
all	TokenNameIdentifier	 all
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
all	TokenNameIdentifier	 all
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
causeGc	TokenNameIdentifier	 cause Gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
memoryMXBean	TokenNameIdentifier	 memory MX Bean
.	TokenNameDOT	
getHeapMemoryUsage	TokenNameIdentifier	 get Heap Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"mx: "	TokenNameStringLiteral	mx: 
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"rue: "	TokenNameStringLiteral	rue: 
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
guard	TokenNameIdentifier	 guard
=	TokenNameEQUAL	
all	TokenNameIdentifier	 all
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
:	TokenNameCOLON	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleByteArrays	TokenNameIdentifier	 test Simple Byte Arrays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MemoryMXBean	TokenNameIdentifier	 Memory MX Bean
memoryMXBean	TokenNameIdentifier	 memory MX Bean
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getMemoryMXBean	TokenNameIdentifier	 get Memory MX Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check the current memory consumption and provide the estimate. 	TokenNameCOMMENT_LINE	Check the current memory consumption and provide the estimate. 
causeGc	TokenNameIdentifier	 cause Gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MemoryUsage	TokenNameIdentifier	 Memory Usage
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
memoryMXBean	TokenNameIdentifier	 memory MX Bean
.	TokenNameDOT	
getHeapMemoryUsage	TokenNameIdentifier	 get Heap Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
estimated	TokenNameIdentifier	 estimated
=	TokenNameEQUAL	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
estimated	TokenNameIdentifier	 estimated
>	TokenNameGREATER	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
ONE_MB	TokenNameIdentifier	 ONE  MB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
"%10s %10s %10s"	TokenNameStringLiteral	%10s %10s %10s
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
mu	TokenNameIdentifier	 mu
.	TokenNameDOT	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
mu	TokenNameIdentifier	 mu
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
estimated	TokenNameIdentifier	 estimated
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make another batch of objects. 	TokenNameCOMMENT_LINE	Make another batch of objects. 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
10000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
all2	TokenNameIdentifier	 all2
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
all	TokenNameIdentifier	 all
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
all2	TokenNameIdentifier	 all2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
all2	TokenNameIdentifier	 all2
;	TokenNameSEMICOLON	
all	TokenNameIdentifier	 all
[	TokenNameLBRACKET	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
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
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Release and quit. 	TokenNameCOMMENT_LINE	Release and quit. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Very hacky, very crude, but (sometimes) works. * Don't look, it will burn your eyes out. */	TokenNameCOMMENT_JAVADOC	 Very hacky, very crude, but (sometimes) works. Don't look, it will burn your eyes out. 
private	TokenNameprivate	
void	TokenNamevoid	
causeGc	TokenNameIdentifier	 cause Gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
>	TokenNameGREATER	
garbageCollectorMXBeans	TokenNameIdentifier	 garbage Collector MX Beans
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getGarbageCollectorMXBeans	TokenNameIdentifier	 get Garbage Collector MX Beans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
ccounts	TokenNameIdentifier	 ccounts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
g	TokenNameIdentifier	 g
:	TokenNameCOLON	
garbageCollectorMXBeans	TokenNameIdentifier	 garbage Collector MX Beans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ccounts	TokenNameIdentifier	 ccounts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getCollectionCount	TokenNameIdentifier	 get Collection Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
ccounts2	TokenNameIdentifier	 ccounts2
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
gc	TokenNameIdentifier	 gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ccounts	TokenNameIdentifier	 ccounts
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GarbageCollectorMXBean	TokenNameIdentifier	 Garbage Collector MX Bean
g	TokenNameIdentifier	 g
:	TokenNameCOLON	
garbageCollectorMXBeans	TokenNameIdentifier	 garbage Collector MX Beans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ccounts2	TokenNameIdentifier	 ccounts2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getCollectionCount	TokenNameIdentifier	 get Collection Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
ccounts2	TokenNameIdentifier	 ccounts2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ccounts	TokenNameIdentifier	 ccounts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
