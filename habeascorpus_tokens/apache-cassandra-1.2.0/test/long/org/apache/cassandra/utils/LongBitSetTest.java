/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
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
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
public	TokenNamepublic	
class	TokenNameclass	
LongBitSetTest	TokenNameIdentifier	 Long Bit Set Test
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
LongBitSetTest	TokenNameIdentifier	 Long Bit Set Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
populateRandom	TokenNameIdentifier	 populate Random
(	TokenNameLPAREN	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBitSetOperations	TokenNameIdentifier	 test Bit Set Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size_to_test	TokenNameIdentifier	 size to test
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size_and_excess	TokenNameIdentifier	 size and excess
=	TokenNameEQUAL	
size_to_test	TokenNameIdentifier	 size to test
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
=	TokenNameEQUAL	
new	TokenNamenew	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
populateRandom	TokenNameIdentifier	 populate Random
(	TokenNameLPAREN	
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
timeit	TokenNameIdentifier	 timeit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size_to_test	TokenNameIdentifier	 size to test
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// about 214 million 	TokenNameCOMMENT_LINE	about 214 million 
long	TokenNamelong	
size_and_excess	TokenNameIdentifier	 size and excess
=	TokenNameEQUAL	
size_to_test	TokenNameIdentifier	 size to test
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
=	TokenNameEQUAL	
new	TokenNamenew	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"||Open BS set's|Open BS get's|Open BS clear's|Offheap BS set's|Offheap BS get's|Offheap BS clear's|"	TokenNameStringLiteral	||Open BS set's|Open BS get's|Open BS clear's|Offheap BS set's|Offheap BS get's|Offheap BS clear's|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("||Open BS set's|Open BS get's|Open BS clear's|Offheap BS set's|Offheap BS get's|Offheap BS clear's|"); 	TokenNameCOMMENT_LINE	System.out.println("||Open BS set's|Open BS get's|Open BS clear's|Offheap BS set's|Offheap BS get's|Offheap BS clear's|"); 
loopOnce	TokenNameIdentifier	 loop Once
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
size_to_test	TokenNameIdentifier	 size to test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
loopOnce	TokenNameIdentifier	 loop Once
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
long	TokenNamelong	
size_to_test	TokenNameIdentifier	 size to test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start off fresh. 	TokenNameCOMMENT_LINE	start off fresh. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
gc	TokenNameIdentifier	 gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"||"	TokenNameStringLiteral	||
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
gc	TokenNameIdentifier	 gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size_to_test	TokenNameIdentifier	 size to test
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
offbs	TokenNameIdentifier	 offbs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(buffer.toString()); 	TokenNameCOMMENT_LINE	System.out.println(buffer.toString()); 
}	TokenNameRBRACE	
/** * Just to make sure JIT doesn't come on our way */	TokenNameCOMMENT_JAVADOC	 Just to make sure JIT doesn't come on our way 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
// @Ignore 	TokenNameCOMMENT_LINE	@Ignore 
public	TokenNamepublic	
void	TokenNamevoid	
loopIt	TokenNameIdentifier	 loop It
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size_to_test	TokenNameIdentifier	 size to test
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// about 214 million 	TokenNameCOMMENT_LINE	about 214 million 
long	TokenNamelong	
size_and_excess	TokenNameIdentifier	 size and excess
=	TokenNameEQUAL	
size_to_test	TokenNameIdentifier	 size to test
+	TokenNamePLUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
offbs	TokenNameIdentifier	 offbs
=	TokenNameEQUAL	
new	TokenNamenew	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
(	TokenNameLPAREN	
size_and_excess	TokenNameIdentifier	 size and excess
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
// 10 times to do approx 2B keys each. 	TokenNameCOMMENT_LINE	10 times to do approx 2B keys each. 
loopOnce	TokenNameIdentifier	 loop Once
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
,	TokenNameCOMMA	
offbs	TokenNameIdentifier	 offbs
,	TokenNameCOMMA	
size_to_test	TokenNameIdentifier	 size to test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
