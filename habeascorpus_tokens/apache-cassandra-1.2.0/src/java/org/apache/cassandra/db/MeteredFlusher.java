/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterables	TokenNameIdentifier	 Iterables
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
class	TokenNameclass	
MeteredFlusher	TokenNameIdentifier	 Metered Flusher
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
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
MeteredFlusher	TokenNameIdentifier	 Metered Flusher
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first, find how much memory non-active memtables are using 	TokenNameCOMMENT_LINE	first, find how much memory non-active memtables are using 
Memtable	TokenNameIdentifier	 Memtable
activelyMeasuring	TokenNameIdentifier	 actively Measuring
=	TokenNameEQUAL	
Memtable	TokenNameIdentifier	 Memtable
.	TokenNameDOT	
activelyMeasuring	TokenNameIdentifier	 actively Measuring
;	TokenNameSEMICOLON	
long	TokenNamelong	
flushingBytes	TokenNameIdentifier	 flushing Bytes
=	TokenNameEQUAL	
activelyMeasuring	TokenNameIdentifier	 actively Measuring
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
activelyMeasuring	TokenNameIdentifier	 actively Measuring
.	TokenNameDOT	
getLiveSize	TokenNameIdentifier	 get Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushingBytes	TokenNameIdentifier	 flushing Bytes
+=	TokenNamePLUS_EQUAL	
countFlushingBytes	TokenNameIdentifier	 count Flushing Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next, flush CFs using more than 1 / (maximum number of memtables it could have in the pipeline) 	TokenNameCOMMENT_LINE	next, flush CFs using more than 1 / (maximum number of memtables it could have in the pipeline) 
// of the total size allotted. Then, flush other CFs in order of size if necessary. 	TokenNameCOMMENT_LINE	of the total size allotted. Then, flush other CFs in order of size if necessary. 
long	TokenNamelong	
liveBytes	TokenNameIdentifier	 live Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
:	TokenNameCOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
all	TokenNameIdentifier	 all
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getTotalMemtableLiveSize	TokenNameIdentifier	 get Total Memtable Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxInFlight	TokenNameIdentifier	 max In Flight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
// live memtable 	TokenNameCOMMENT_LINE	live memtable 
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
// potentially a flushed memtable being counted by jamm 	TokenNameCOMMENT_LINE	potentially a flushed memtable being counted by jamm 
+	TokenNamePLUS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getFlushWriters	TokenNameIdentifier	 get Flush Writers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getFlushQueueSize	TokenNameIdentifier	 get Flush Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
.	TokenNameDOT	
getIndexesBackedByCfs	TokenNameIdentifier	 get Indexes Backed By Cfs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTotalMemtableSpaceInMB	TokenNameIdentifier	 get Total Memtable Space In MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1048576L	TokenNameLongLiteral	
-	TokenNameMINUS	
flushingBytes	TokenNameIdentifier	 flushing Bytes
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
maxInFlight	TokenNameIdentifier	 max In Flight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"flushing high-traffic column family {} (estimated {} bytes)"	TokenNameStringLiteral	flushing high-traffic column family {} (estimated {} bytes)
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceFlush	TokenNameIdentifier	 force Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
liveBytes	TokenNameIdentifier	 live Bytes
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
flushingBytes	TokenNameIdentifier	 flushing Bytes
+	TokenNamePLUS	
liveBytes	TokenNameIdentifier	 live Bytes
<=	TokenNameLESS_EQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTotalMemtableSpaceInMB	TokenNameIdentifier	 get Total Memtable Space In MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1048576L	TokenNameLongLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"estimated {} bytes used by all memtables pre-flush"	TokenNameStringLiteral	estimated {} bytes used by all memtables pre-flush
,	TokenNameCOMMA	
liveBytes	TokenNameIdentifier	 live Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sort memtables by size 	TokenNameCOMMENT_LINE	sort memtables by size 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
>	TokenNameGREATER	
sorted	TokenNameIdentifier	 sorted
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterables	TokenNameIdentifier	 Iterables
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
,	TokenNameCOMMA	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
all	TokenNameIdentifier	 all
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size1	TokenNameIdentifier	 size1
=	TokenNameEQUAL	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
getTotalMemtableLiveSize	TokenNameIdentifier	 get Total Memtable Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size2	TokenNameIdentifier	 size2
=	TokenNameEQUAL	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
getTotalMemtableLiveSize	TokenNameIdentifier	 get Total Memtable Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size1	TokenNameIdentifier	 size1
<	TokenNameLESS	
size2	TokenNameIdentifier	 size2
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size1	TokenNameIdentifier	 size1
>	TokenNameGREATER	
size2	TokenNameIdentifier	 size2
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// flush largest first until we get below our threshold. 	TokenNameCOMMENT_LINE	flush largest first until we get below our threshold. 
// although it looks like liveBytes + flushingBytes will stay a constant, it will not if flushes finish 	TokenNameCOMMENT_LINE	although it looks like liveBytes + flushingBytes will stay a constant, it will not if flushes finish 
// while we loop, which is especially likely to happen if the flush queue fills up (so further forceFlush calls block) 	TokenNameCOMMENT_LINE	while we loop, which is especially likely to happen if the flush queue fills up (so further forceFlush calls block) 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushingBytes	TokenNameIdentifier	 flushing Bytes
=	TokenNameEQUAL	
countFlushingBytes	TokenNameIdentifier	 count Flushing Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
liveBytes	TokenNameIdentifier	 live Bytes
+	TokenNamePLUS	
flushingBytes	TokenNameIdentifier	 flushing Bytes
<=	TokenNameLESS_EQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTotalMemtableSpaceInMB	TokenNameIdentifier	 get Total Memtable Space In MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1048576L	TokenNameLongLiteral	
||	TokenNameOR_OR	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getTotalMemtableLiveSize	TokenNameIdentifier	 get Total Memtable Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"flushing {} to free up {} bytes"	TokenNameStringLiteral	flushing {} to free up {} bytes
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
liveBytes	TokenNameIdentifier	 live Bytes
-=	TokenNameMINUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceFlush	TokenNameIdentifier	 force Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"memtable memory usage is {} bytes with {} live"	TokenNameStringLiteral	memtable memory usage is {} bytes with {} live
,	TokenNameCOMMA	
liveBytes	TokenNameIdentifier	 live Bytes
+	TokenNamePLUS	
flushingBytes	TokenNameIdentifier	 flushing Bytes
,	TokenNameCOMMA	
liveBytes	TokenNameIdentifier	 live Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
countFlushingBytes	TokenNameIdentifier	 count Flushing Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
flushingBytes	TokenNameIdentifier	 flushing Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
:	TokenNameCOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
all	TokenNameIdentifier	 all
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Memtable	TokenNameIdentifier	 Memtable
memtable	TokenNameIdentifier	 memtable
:	TokenNameCOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMemtablesPendingFlush	TokenNameIdentifier	 get Memtables Pending Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
flushingBytes	TokenNameIdentifier	 flushing Bytes
+=	TokenNamePLUS_EQUAL	
memtable	TokenNameIdentifier	 memtable
.	TokenNameDOT	
getLiveSize	TokenNameIdentifier	 get Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
flushingBytes	TokenNameIdentifier	 flushing Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
