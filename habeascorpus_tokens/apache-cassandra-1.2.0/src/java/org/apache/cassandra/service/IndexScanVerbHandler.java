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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
ThriftValidation	TokenNameIdentifier	 Thrift Validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
.	TokenNameDOT	
Tracing	TokenNameIdentifier	 Tracing
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
// 1.1 implements index scan with RangeSliceVerb instead 	TokenNameCOMMENT_LINE	1.1 implements index scan with RangeSliceVerb instead 
public	TokenNamepublic	
class	TokenNameclass	
IndexScanVerbHandler	TokenNameIdentifier	 Index Scan Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
>	TokenNameGREATER	
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
IndexScanVerbHandler	TokenNameIdentifier	 Index Scan Verb Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
doVerb	TokenNameIdentifier	 do Verb
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
index_clause	TokenNameIdentifier	 index clause
.	TokenNameDOT	
expressions	TokenNameIdentifier	 expressions
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
index_clause	TokenNameIdentifier	 index clause
.	TokenNameDOT	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
ThriftValidation	TokenNameIdentifier	 Thrift Validation
.	TokenNameDOT	
asIFilter	TokenNameIdentifier	 as I Filter
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
predicate	TokenNameIdentifier	 predicate
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
reply	TokenNameIdentifier	 reply
=	TokenNameEQUAL	
new	TokenNamenew	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Enqueuing response to {}"	TokenNameStringLiteral	Enqueuing response to {}
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendReply	TokenNameIdentifier	 send Reply
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
