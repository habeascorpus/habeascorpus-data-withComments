/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
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
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
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
UUIDGen	TokenNameIdentifier	 UUID Gen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
cliffc	TokenNameIdentifier	 cliffc
.	TokenNameDOT	
high_scale_lib	TokenNameIdentifier	 high scale lib
.	TokenNameDOT	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
;	TokenNameSEMICOLON	
/** * This class manages the streaming of multiple files one after the other. */	TokenNameCOMMENT_JAVADOC	 This class manages the streaming of multiple files one after the other. 
public	TokenNamepublic	
class	TokenNameclass	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
extends	TokenNameextends	
AbstractStreamSession	TokenNameIdentifier	 Abstract Stream Session
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
StreamOutSession	TokenNameIdentifier	 Stream Out Session
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// one host may have multiple stream sessions. 	TokenNameCOMMENT_LINE	one host may have multiple stream sessions. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
<	TokenNameLESS	
UUID	TokenNameIdentifier	 UUID
,	TokenNameCOMMA	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
>	TokenNameGREATER	
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
UUID	TokenNameIdentifier	 UUID
,	TokenNameCOMMA	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
new	TokenNamenew	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
String	TokenNameIdentifier	 String
currentFile	TokenNameIdentifier	 current File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFilesToStream	TokenNameIdentifier	 add Files To Stream
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
pendingFile	TokenNameIdentifier	 pending File
:	TokenNameCOLON	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Adding file {} to be streamed."	TokenNameStringLiteral	Adding file {} to be streamed.
,	TokenNameCOMMA	
pendingFile	TokenNameIdentifier	 pending File
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pendingFile	TokenNameIdentifier	 pending File
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pendingFile	TokenNameIdentifier	 pending File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
retry	TokenNameIdentifier	 retry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streamFile	TokenNameIdentifier	 stream File
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
streamFile	TokenNameIdentifier	 stream File
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
pf	TokenNameIdentifier	 pf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Streaming {} ..."	TokenNameStringLiteral	Streaming {} ...
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentFile	TokenNameIdentifier	 current File
=	TokenNameEQUAL	
pf	TokenNameIdentifier	 pf
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
(	TokenNameLPAREN	
new	TokenNamenew	
StreamHeader	TokenNameIdentifier	 Stream Header
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
getSessionId	TokenNameIdentifier	 get Session Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pf	TokenNameIdentifier	 pf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startNext	TokenNameIdentifier	 start Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
releaseReference	TokenNameIdentifier	 release Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
streamFile	TokenNameIdentifier	 stream File
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
closeInternal	TokenNameIdentifier	 close Internal
(	TokenNameLPAREN	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Release reference on last file (or any uncompleted ones) 	TokenNameCOMMENT_LINE	Release reference on last file (or any uncompleted ones) 
for	TokenNamefor	
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
releaseReference	TokenNameIdentifier	 release Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** convenience method for use when testing */	TokenNameCOMMENT_JAVADOC	 convenience method for use when testing 
void	TokenNamevoid	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
getDestinations	TokenNameIdentifier	 get Destinations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
hosts	TokenNameIdentifier	 hosts
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
session	TokenNameIdentifier	 session
:	TokenNameCOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hosts	TokenNameIdentifier	 hosts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hosts	TokenNameIdentifier	 hosts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
getOutgoingFiles	TokenNameIdentifier	 get Outgoing Files
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
UUID	TokenNameIdentifier	 UUID
,	TokenNameCOMMA	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateCurrentFile	TokenNameIdentifier	 validate Current File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"target reports current file is %s but is %s"	TokenNameStringLiteral	target reports current file is %s but is %s
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
currentFile	TokenNameIdentifier	 current File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
begin	TokenNameIdentifier	 begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PendingFile	TokenNameIdentifier	 Pending File
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentFile	TokenNameIdentifier	 current File
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamHeader	TokenNameIdentifier	 Stream Header
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
new	TokenNamenew	
StreamHeader	TokenNameIdentifier	 Stream Header
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
getSessionId	TokenNameIdentifier	 get Session Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Streaming to {}"	TokenNameStringLiteral	Streaming to {}
,	TokenNameCOMMA	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Files are {}"	TokenNameStringLiteral	Files are {}
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
