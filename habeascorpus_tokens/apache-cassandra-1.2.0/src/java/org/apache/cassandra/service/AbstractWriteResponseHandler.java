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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
exceptions	TokenNameIdentifier	 exceptions
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
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
WriteType	TokenNameIdentifier	 Write Type
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
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractWriteResponseHandler	TokenNameIdentifier	 Abstract Write Response Handler
implements	TokenNameimplements	
IAsyncCallback	TokenNameIdentifier	 I Async Callback
{	TokenNameLBRACE	
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
protected	TokenNameprotected	
final	TokenNamefinal	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistencyLevel	TokenNameIdentifier	 consistency Level
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Runnable	TokenNameIdentifier	 Runnable
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
;	TokenNameSEMICOLON	
/** * @param pendingEndpoints * @param callback A callback to be called when the write is successful. */	TokenNameCOMMENT_JAVADOC	 @param pendingEndpoints @param callback A callback to be called when the write is successful. 
protected	TokenNameprotected	
AbstractWriteResponseHandler	TokenNameIdentifier	 Abstract Write Response Handler
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
=	TokenNameEQUAL	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
;	TokenNameSEMICOLON	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consistencyLevel	TokenNameIdentifier	 consistency Level
=	TokenNameEQUAL	
consistencyLevel	TokenNameIdentifier	 consistency Level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
=	TokenNameEQUAL	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
callback	TokenNameIdentifier	 callback
=	TokenNameEQUAL	
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writeType	TokenNameIdentifier	 write Type
=	TokenNameEQUAL	
writeType	TokenNameIdentifier	 write Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
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
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
(	TokenNameLPAREN	
writeType	TokenNameIdentifier	 write Type
,	TokenNameCOMMA	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
ackCount	TokenNameIdentifier	 ack Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
blockFor	TokenNameIdentifier	 block For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
ackCount	TokenNameIdentifier	 ack Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blockForCL	TokenNameIdentifier	 block For CL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
blockForCL	TokenNameIdentifier	 block For CL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** null message means "response from local write" */	TokenNameCOMMENT_JAVADOC	 null message means "response from local write" 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
response	TokenNameIdentifier	 response
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
assureSufficientLiveNodes	TokenNameIdentifier	 assure Sufficient Live Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
signal	TokenNameIdentifier	 signal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
signal	TokenNameIdentifier	 signal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
callback	TokenNameIdentifier	 callback
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
callback	TokenNameIdentifier	 callback
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
