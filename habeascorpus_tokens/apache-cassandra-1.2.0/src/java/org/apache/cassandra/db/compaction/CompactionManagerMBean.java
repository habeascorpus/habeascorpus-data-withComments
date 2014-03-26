/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
CompactionManagerMBean	TokenNameIdentifier	 Compaction Manager M Bean
{	TokenNameLBRACE	
/** List of running compaction objects. */	TokenNameCOMMENT_JAVADOC	 List of running compaction objects. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getCompactions	TokenNameIdentifier	 get Compactions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** List of running compaction summary strings. */	TokenNameCOMMENT_JAVADOC	 List of running compaction summary strings. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCompactionSummary	TokenNameIdentifier	 get Compaction Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CompactionMetrics#pendingTasks * @return estimated number of compactions remaining to perform */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CompactionMetrics#pendingTasks @return estimated number of compactions remaining to perform 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CompactionMetrics#completedTasks * @return number of completed compactions since server [re]start */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CompactionMetrics#completedTasks @return number of completed compactions since server [re]start 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getCompletedTasks	TokenNameIdentifier	 get Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CompactionMetrics#bytesCompacted * @return total number of bytes compacted since server [re]start */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CompactionMetrics#bytesCompacted @return total number of bytes compacted since server [re]start 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalBytesCompacted	TokenNameIdentifier	 get Total Bytes Compacted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CompactionMetrics#totalCompactionsCompleted * @return total number of compactions since server [re]start */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CompactionMetrics#totalCompactionsCompleted @return total number of compactions since server [re]start 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalCompactionsCompleted	TokenNameIdentifier	 get Total Compactions Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Triggers the compaction of user specified sstables. * * @param ksname the keyspace for the sstables to compact * @param dataFiles a comma separated list of sstable filename to compact */	TokenNameCOMMENT_JAVADOC	 Triggers the compaction of user specified sstables. * @param ksname the keyspace for the sstables to compact @param dataFiles a comma separated list of sstable filename to compact 
public	TokenNamepublic	
void	TokenNamevoid	
forceUserDefinedCompaction	TokenNameIdentifier	 force User Defined Compaction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dataFiles	TokenNameIdentifier	 data Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stop all running compaction-like tasks having the provided {@code type}. * @param type the type of compaction to stop. Can be one of: * - COMPACTION * - VALIDATION * - CLEANUP * - SCRUB * - INDEX_BUILD */	TokenNameCOMMENT_JAVADOC	 Stop all running compaction-like tasks having the provided {@code type}. @param type the type of compaction to stop. Can be one of: - COMPACTION - VALIDATION - CLEANUP - SCRUB - INDEX_BUILD 
public	TokenNamepublic	
void	TokenNamevoid	
stopCompaction	TokenNameIdentifier	 stop Compaction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
