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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
Row	TokenNameIdentifier	 Row
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
IAsyncCallback	TokenNameIdentifier	 I Async Callback
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SimpleCondition	TokenNameIdentifier	 Simple Condition
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RepairCallback	TokenNameIdentifier	 Repair Callback
implements	TokenNameimplements	
IAsyncCallback	TokenNameIdentifier	 I Async Callback
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SimpleCondition	TokenNameIdentifier	 Simple Condition
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleCondition	TokenNameIdentifier	 Simple Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
received	TokenNameIdentifier	 received
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The main difference between this and ReadCallback is, ReadCallback has a ConsistencyLevel * it needs to achieve. Repair on the other hand is happy to repair whoever replies within the timeout. * * (The other main difference of course is, this is only created once we know we have a digest * mismatch, and we're going to do full-data reads from everyone -- that is, this is the final * stage in the read process.) */	TokenNameCOMMENT_JAVADOC	 The main difference between this and ReadCallback is, ReadCallback has a ConsistencyLevel it needs to achieve. Repair on the other hand is happy to repair whoever replies within the timeout. * (The other main difference of course is, this is only created once we know we have a digest mismatch, and we're going to do full-data reads from everyone -- that is, this is the final stage in the read process.) 
public	TokenNamepublic	
RepairCallback	TokenNameIdentifier	 Repair Callback
(	TokenNameLPAREN	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DigestMismatchException	TokenNameIdentifier	 Digest Mismatch Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getWriteRpcTimeout	TokenNameIdentifier	 get Write Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
received	TokenNameIdentifier	 received
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
response	TokenNameIdentifier	 response
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
preprocess	TokenNameIdentifier	 preprocess
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
received	TokenNameIdentifier	 received
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
signal	TokenNameIdentifier	 signal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLatencyForSnitch	TokenNameIdentifier	 is Latency For Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxLiveCount	TokenNameIdentifier	 get Max Live Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
getMaxLiveCount	TokenNameIdentifier	 get Max Live Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
