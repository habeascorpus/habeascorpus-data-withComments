/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CopyOnWriteArraySet	TokenNameIdentifier	 Copy On Write Array Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Sets	TokenNameIdentifier	 Sets
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DataTracker	TokenNameIdentifier	 Data Tracker
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
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
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Deleting sstables is tricky because the mmapping might not have been finalized yet, 	TokenNameCOMMENT_LINE	Deleting sstables is tricky because the mmapping might not have been finalized yet, 
// and delete will fail (on Windows) until it is (we only force the unmapping on SUN VMs). 	TokenNameCOMMENT_LINE	and delete will fail (on Windows) until it is (we only force the unmapping on SUN VMs). 
// Additionally, we need to make sure to delete the data file first, so on restart the others 	TokenNameCOMMENT_LINE	Additionally, we need to make sure to delete the data file first, so on restart the others 
// will be recognized as GCable. 	TokenNameCOMMENT_LINE	will be recognized as GCable. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
>	TokenNameGREATER	
failedTasks	TokenNameIdentifier	 failed Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArraySet	TokenNameIdentifier	 Copy On Write Array Set
<	TokenNameLESS	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Component	TokenNameIdentifier	 Component
>	TokenNameGREATER	
components	TokenNameIdentifier	 components
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DataTracker	TokenNameIdentifier	 Data Tracker
tracker	TokenNameIdentifier	 tracker
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
referent	TokenNameIdentifier	 referent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
referent	TokenNameIdentifier	 referent
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
referent	TokenNameIdentifier	 referent
.	TokenNameDOT	
components	TokenNameIdentifier	 components
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
referent	TokenNameIdentifier	 referent
.	TokenNameDOT	
bytesOnDisk	TokenNameIdentifier	 bytes On Disk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTracker	TokenNameIdentifier	 set Tracker
(	TokenNameLPAREN	
DataTracker	TokenNameIdentifier	 Data Tracker
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tracker	TokenNameIdentifier	 tracker
=	TokenNameEQUAL	
tracker	TokenNameIdentifier	 tracker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
schedule	TokenNameIdentifier	 schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we can't successfully delete the DATA component, set the task to be retried later: see above 	TokenNameCOMMENT_LINE	If we can't successfully delete the DATA component, set the task to be retried later: see above 
File	TokenNameIdentifier	 File
datafile	TokenNameIdentifier	 datafile
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
datafile	TokenNameIdentifier	 datafile
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Unable to delete "	TokenNameStringLiteral	Unable to delete 
+	TokenNamePLUS	
datafile	TokenNameIdentifier	 datafile
+	TokenNamePLUS	
" (it will be removed on server restart; we'll also retry after GC)"	TokenNameStringLiteral	 (it will be removed on server restart; we'll also retry after GC)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
failedTasks	TokenNameIdentifier	 failed Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// let the remainder be cleaned up by delete 	TokenNameCOMMENT_LINE	let the remainder be cleaned up by delete 
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
Sets	TokenNameIdentifier	 Sets
.	TokenNameDOT	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
spaceReclaimed	TokenNameIdentifier	 space Reclaimed
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retry all deletions that failed the first time around (presumably b/c the sstable was still mmap'd.) * Useful because there are times when we know GC has been invoked; also exposed as an mbean. */	TokenNameCOMMENT_JAVADOC	 Retry all deletions that failed the first time around (presumably b/c the sstable was still mmap'd.) Useful because there are times when we know GC has been invoked; also exposed as an mbean. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
rescheduleFailedTasks	TokenNameIdentifier	 reschedule Failed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableDeletingTask	TokenNameIdentifier	 SS Table Deleting Task
task	TokenNameIdentifier	 task
:	TokenNameCOLON	
failedTasks	TokenNameIdentifier	 failed Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failedTasks	TokenNameIdentifier	 failed Tasks
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
schedule	TokenNameIdentifier	 schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** for tests */	TokenNameCOMMENT_JAVADOC	 for tests 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
waitForDeletions	TokenNameIdentifier	 wait For Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
schedule	TokenNameIdentifier	 schedule
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExecutionException	TokenNameIdentifier	 Execution Exception
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
}	TokenNameRBRACE	
