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
index	TokenNameIdentifier	 index
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
Set	TokenNameIdentifier	 Set
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
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
Table	TokenNameIdentifier	 Table
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
CompactionInfo	TokenNameIdentifier	 Compaction Info
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
OperationType	TokenNameIdentifier	 Operation Type
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
CompactionInterruptedException	TokenNameIdentifier	 Compaction Interrupted Exception
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
ReducingKeyIterator	TokenNameIdentifier	 Reducing Key Iterator
;	TokenNameSEMICOLON	
/** * Manages building an entire index from column family data. Runs on to compaction manager. */	TokenNameCOMMENT_JAVADOC	 Manages building an entire index from column family data. Runs on to compaction manager. 
public	TokenNamepublic	
class	TokenNameclass	
SecondaryIndexBuilder	TokenNameIdentifier	 Secondary Index Builder
extends	TokenNameextends	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
idxNames	TokenNameIdentifier	 idx Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ReducingKeyIterator	TokenNameIdentifier	 Reducing Key Iterator
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SecondaryIndexBuilder	TokenNameIdentifier	 Secondary Index Builder
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
idxNames	TokenNameIdentifier	 idx Names
,	TokenNameCOMMA	
ReducingKeyIterator	TokenNameIdentifier	 Reducing Key Iterator
iter	TokenNameIdentifier	 iter
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
idxNames	TokenNameIdentifier	 idx Names
=	TokenNameEQUAL	
idxNames	TokenNameIdentifier	 idx Names
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
INDEX_BUILD	TokenNameIdentifier	 INDEX  BUILD
,	TokenNameCOMMA	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getTotalBytes	TokenNameIdentifier	 get Total Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isStopRequested	TokenNameIdentifier	 is Stop Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CompactionInterruptedException	TokenNameIdentifier	 Compaction Interrupted Exception
(	TokenNameLPAREN	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
indexRow	TokenNameIdentifier	 index Row
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
idxNames	TokenNameIdentifier	 idx Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
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
