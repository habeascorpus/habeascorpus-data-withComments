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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
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
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
/** Implements serializable to allow structured info to be returned via JMX. */	TokenNameCOMMENT_JAVADOC	 Implements serializable to allow structured info to be returned via JMX. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CompactionInfo	TokenNameIdentifier	 Compaction Info
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3695381572726744816L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
tasktype	TokenNameIdentifier	 tasktype
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
completed	TokenNameIdentifier	 completed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
long	TokenNamelong	
bytesComplete	TokenNameIdentifier	 bytes Complete
,	TokenNameCOMMA	
long	TokenNamelong	
totalBytes	TokenNameIdentifier	 total Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
bytesComplete	TokenNameIdentifier	 bytes Complete
,	TokenNameCOMMA	
totalBytes	TokenNameIdentifier	 total Bytes
,	TokenNameCOMMA	
"bytes"	TokenNameStringLiteral	bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
OperationType	TokenNameIdentifier	 Operation Type
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
long	TokenNamelong	
completed	TokenNameIdentifier	 completed
,	TokenNameCOMMA	
long	TokenNamelong	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
completed	TokenNameIdentifier	 completed
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
long	TokenNamelong	
completed	TokenNameIdentifier	 completed
,	TokenNameCOMMA	
long	TokenNamelong	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tasktype	TokenNameIdentifier	 tasktype
=	TokenNameEQUAL	
tasktype	TokenNameIdentifier	 tasktype
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
completed	TokenNameIdentifier	 completed
=	TokenNameEQUAL	
completed	TokenNameIdentifier	 completed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cfm	TokenNameIdentifier	 cfm
=	TokenNameEQUAL	
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return A copy of this CompactionInfo with updated progress. */	TokenNameCOMMENT_JAVADOC	 @return A copy of this CompactionInfo with updated progress. 
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
forProgress	TokenNameIdentifier	 for Progress
(	TokenNameLPAREN	
long	TokenNamelong	
complete	TokenNameIdentifier	 complete
,	TokenNameCOMMA	
long	TokenNamelong	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
tasktype	TokenNameIdentifier	 tasktype
,	TokenNameCOMMA	
complete	TokenNameIdentifier	 complete
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UUID	TokenNameIdentifier	 UUID
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfId	TokenNameIdentifier	 cf Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CFMetaData	TokenNameIdentifier	 CF Meta Data
getCFMetaData	TokenNameIdentifier	 get CF Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getCompleted	TokenNameIdentifier	 get Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
completed	TokenNameIdentifier	 completed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTotal	TokenNameIdentifier	 get Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OperationType	TokenNameIdentifier	 Operation Type
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tasktype	TokenNameIdentifier	 tasktype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCompleted	TokenNameIdentifier	 get Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getTotal	TokenNameIdentifier	 get Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
asMap	TokenNameIdentifier	 as Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"keyspace"	TokenNameStringLiteral	keyspace
,	TokenNameCOMMA	
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"columnfamily"	TokenNameStringLiteral	columnfamily
,	TokenNameCOMMA	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"completed"	TokenNameStringLiteral	completed
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
completed	TokenNameIdentifier	 completed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"total"	TokenNameStringLiteral	total
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"taskType"	TokenNameStringLiteral	taskType
,	TokenNameCOMMA	
tasktype	TokenNameIdentifier	 tasktype
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"unit"	TokenNameStringLiteral	unit
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stopRequested	TokenNameIdentifier	 stop Requested
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
CompactionInfo	TokenNameIdentifier	 Compaction Info
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
load	TokenNameIdentifier	 load
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getLoad	TokenNameIdentifier	 get Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reportedSeverity	TokenNameIdentifier	 reported Severity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopRequested	TokenNameIdentifier	 stop Requested
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isStopRequested	TokenNameIdentifier	 is Stop Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stopRequested	TokenNameIdentifier	 stop Requested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * report event on the size of the compaction. */	TokenNameCOMMENT_JAVADOC	 report event on the size of the compaction. 
public	TokenNamepublic	
void	TokenNamevoid	
started	TokenNameIdentifier	 started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportedSeverity	TokenNameIdentifier	 reported Severity
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
reportSeverity	TokenNameIdentifier	 report Severity
(	TokenNameLPAREN	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTotal	TokenNameIdentifier	 get Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
load	TokenNameIdentifier	 load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * remove the event complete */	TokenNameCOMMENT_JAVADOC	 remove the event complete 
public	TokenNamepublic	
void	TokenNamevoid	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reportedSeverity	TokenNameIdentifier	 reported Severity
)	TokenNameRPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
reportSeverity	TokenNameIdentifier	 report Severity
(	TokenNameLPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTotal	TokenNameIdentifier	 get Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
load	TokenNameIdentifier	 load
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reportedSeverity	TokenNameIdentifier	 reported Severity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
