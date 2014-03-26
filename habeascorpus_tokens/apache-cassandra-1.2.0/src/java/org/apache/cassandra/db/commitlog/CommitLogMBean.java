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
commitlog	TokenNameIdentifier	 commitlog
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
CommitLogMBean	TokenNameIdentifier	 Commit Log M Bean
{	TokenNameLBRACE	
/** * Get the number of completed tasks * @see org.apache.cassandra.metrics.CommitLogMetrics#completedTasks */	TokenNameCOMMENT_JAVADOC	 Get the number of completed tasks @see org.apache.cassandra.metrics.CommitLogMetrics#completedTasks 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getCompletedTasks	TokenNameIdentifier	 get Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the number of tasks waiting to be executed * @see org.apache.cassandra.metrics.CommitLogMetrics#pendingTasks */	TokenNameCOMMENT_JAVADOC	 Get the number of tasks waiting to be executed @see org.apache.cassandra.metrics.CommitLogMetrics#pendingTasks 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current size used by all the commitlog segments. * @see org.apache.cassandra.metrics.CommitLogMetrics#totalCommitLogSize */	TokenNameCOMMENT_JAVADOC	 Get the current size used by all the commitlog segments. @see org.apache.cassandra.metrics.CommitLogMetrics#totalCommitLogSize 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalCommitlogSize	TokenNameIdentifier	 get Total Commitlog Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Recover a single file. */	TokenNameCOMMENT_JAVADOC	 Recover a single file. 
public	TokenNamepublic	
void	TokenNamevoid	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * @return file names (not full paths) of active commit log segments (segments containing unflushed data) */	TokenNameCOMMENT_JAVADOC	 @return file names (not full paths) of active commit log segments (segments containing unflushed data) 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveSegmentNames	TokenNameIdentifier	 get Active Segment Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return Files which are pending for archival attempt. Does NOT include failed archive attempts. */	TokenNameCOMMENT_JAVADOC	 @return Files which are pending for archival attempt. Does NOT include failed archive attempts. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getArchivingSegmentNames	TokenNameIdentifier	 get Archiving Segment Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
