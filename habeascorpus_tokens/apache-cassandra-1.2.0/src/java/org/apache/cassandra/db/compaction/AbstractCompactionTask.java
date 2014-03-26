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
Collection	TokenNameIdentifier	 Collection
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
SSTableReader	TokenNameIdentifier	 SS Table Reader
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
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
CompactionExecutorStatsCollector	TokenNameIdentifier	 Compaction Executor Stats Collector
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DiskAwareRunnable	TokenNameIdentifier	 Disk Aware Runnable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
extends	TokenNameextends	
DiskAwareRunnable	TokenNameIdentifier	 Disk Aware Runnable
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isUserDefined	TokenNameIdentifier	 is User Defined
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
OperationType	TokenNameIdentifier	 Operation Type
compactionType	TokenNameIdentifier	 compaction Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sstables	TokenNameIdentifier	 sstables
=	TokenNameEQUAL	
sstables	TokenNameIdentifier	 sstables
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isUserDefined	TokenNameIdentifier	 is User Defined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compactionType	TokenNameIdentifier	 compaction Type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
COMPACTION	TokenNameIdentifier	 COMPACTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
CompactionExecutorStatsCollector	TokenNameIdentifier	 Compaction Executor Stats Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
unmarkSSTables	TokenNameIdentifier	 unmark SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getDataTracker	TokenNameIdentifier	 get Data Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
unmarkCompacting	TokenNameIdentifier	 unmark Compacting
(	TokenNameLPAREN	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
setUserDefined	TokenNameIdentifier	 set User Defined
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isUserDefined	TokenNameIdentifier	 is User Defined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isUserDefined	TokenNameIdentifier	 is User Defined
=	TokenNameEQUAL	
isUserDefined	TokenNameIdentifier	 is User Defined
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
setCompactionType	TokenNameIdentifier	 set Compaction Type
(	TokenNameLPAREN	
OperationType	TokenNameIdentifier	 Operation Type
compactionType	TokenNameIdentifier	 compaction Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compactionType	TokenNameIdentifier	 compaction Type
=	TokenNameEQUAL	
compactionType	TokenNameIdentifier	 compaction Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CompactionTask("	TokenNameStringLiteral	CompactionTask(
+	TokenNamePLUS	
sstables	TokenNameIdentifier	 sstables
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
