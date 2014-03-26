/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
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
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Stopwatch	TokenNameIdentifier	 Stopwatch
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
MessageFormatter	TokenNameIdentifier	 Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Stage	TokenNameIdentifier	 Stage
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
StageManager	TokenNameIdentifier	 Stage Manager
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamily	TokenNameIdentifier	 Column Family
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
RowMutation	TokenNameIdentifier	 Row Mutation
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
StorageProxy	TokenNameIdentifier	 Storage Proxy
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * ThreadLocal state for a tracing session. The presence of an instance of this class as a ThreadLocal denotes that an * operation is being traced. */	TokenNameCOMMENT_JAVADOC	 ThreadLocal state for a tracing session. The presence of an instance of this class as a ThreadLocal denotes that an operation is being traced. 
public	TokenNamepublic	
class	TokenNameclass	
TraceState	TokenNameIdentifier	 Trace State
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
coordinator	TokenNameIdentifier	 coordinator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Stopwatch	TokenNameIdentifier	 Stopwatch
watch	TokenNameIdentifier	 watch
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
sessionIdBytes	TokenNameIdentifier	 session Id Bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isLocallyOwned	TokenNameIdentifier	 is Locally Owned
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TraceState	TokenNameIdentifier	 Trace State
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
coordinator	TokenNameIdentifier	 coordinator
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
locallyOwned	TokenNameIdentifier	 locally Owned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
coordinator	TokenNameIdentifier	 coordinator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sessionId	TokenNameIdentifier	 session Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
coordinator	TokenNameIdentifier	 coordinator
=	TokenNameEQUAL	
coordinator	TokenNameIdentifier	 coordinator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
=	TokenNameEQUAL	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isLocallyOwned	TokenNameIdentifier	 is Locally Owned
=	TokenNameEQUAL	
locallyOwned	TokenNameIdentifier	 locally Owned
;	TokenNameSEMICOLON	
sessionIdBytes	TokenNameIdentifier	 session Id Bytes
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
watch	TokenNameIdentifier	 watch
=	TokenNameEQUAL	
new	TokenNamenew	
Stopwatch	TokenNameIdentifier	 Stopwatch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
watch	TokenNameIdentifier	 watch
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
elapsed	TokenNameIdentifier	 elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
watch	TokenNameIdentifier	 watch
.	TokenNameDOT	
elapsedTime	TokenNameIdentifier	 elapsed Time
(	TokenNameLPAREN	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MICROSECONDS	TokenNameIdentifier	 MICROSECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
elapsed	TokenNameIdentifier	 elapsed
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
?	TokenNameQUESTION	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
elapsed	TokenNameIdentifier	 elapsed
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
.	TokenNameDOT	
arrayFormat	TokenNameIdentifier	 array Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
elapsed	TokenNameIdentifier	 elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
eventId	TokenNameIdentifier	 event Id
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
threadName	TokenNameIdentifier	 thread Name
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StageManager	TokenNameIdentifier	 Stage Manager
.	TokenNameDOT	
getStage	TokenNameIdentifier	 get Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
new	TokenNamenew	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfMeta	TokenNameIdentifier	 cf Meta
=	TokenNameEQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
TraceEventsCf	TokenNameIdentifier	 Trace Events Cf
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
cfMeta	TokenNameIdentifier	 cf Meta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
buildName	TokenNameIdentifier	 build Name
(	TokenNameLPAREN	
cfMeta	TokenNameIdentifier	 cf Meta
,	TokenNameCOMMA	
eventId	TokenNameIdentifier	 event Id
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"source"	TokenNameStringLiteral	source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
buildName	TokenNameIdentifier	 build Name
(	TokenNameLPAREN	
cfMeta	TokenNameIdentifier	 cf Meta
,	TokenNameCOMMA	
eventId	TokenNameIdentifier	 event Id
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"thread"	TokenNameStringLiteral	thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
threadName	TokenNameIdentifier	 thread Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
buildName	TokenNameIdentifier	 build Name
(	TokenNameLPAREN	
cfMeta	TokenNameIdentifier	 cf Meta
,	TokenNameCOMMA	
eventId	TokenNameIdentifier	 event Id
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"source_elapsed"	TokenNameStringLiteral	source_elapsed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
elapsed	TokenNameIdentifier	 elapsed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
buildName	TokenNameIdentifier	 build Name
(	TokenNameLPAREN	
cfMeta	TokenNameIdentifier	 cf Meta
,	TokenNameCOMMA	
eventId	TokenNameIdentifier	 event Id
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"activity"	TokenNameStringLiteral	activity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
mutation	TokenNameIdentifier	 mutation
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
TRACE_KS	TokenNameIdentifier	 TRACE  KS
,	TokenNameCOMMA	
sessionIdBytes	TokenNameIdentifier	 session Id Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mutation	TokenNameIdentifier	 mutation
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StorageProxy	TokenNameIdentifier	 Storage Proxy
.	TokenNameDOT	
mutate	TokenNameIdentifier	 mutate
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mutation	TokenNameIdentifier	 mutation
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
