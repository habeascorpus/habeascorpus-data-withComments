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
Collection	TokenNameIdentifier	 Collection
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
Directories	TokenNameIdentifier	 Directories
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Range	TokenNameIdentifier	 Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
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
Descriptor	TokenNameIdentifier	 Descriptor
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
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
/** * for streaming data from other nodes in to this one. * Sends a STREAM_REQUEST Message to the source node(s), after which StreamOut on that side takes over. * See StreamOut for details. */	TokenNameCOMMENT_JAVADOC	 for streaming data from other nodes in to this one. Sends a STREAM_REQUEST Message to the source node(s), after which StreamOut on that side takes over. See StreamOut for details. 
public	TokenNamepublic	
class	TokenNameclass	
StreamIn	TokenNameIdentifier	 Stream In
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
StreamIn	TokenNameIdentifier	 Stream In
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Request ranges for all column families in the given keyspace. */	TokenNameCOMMENT_JAVADOC	 Request ranges for all column families in the given keyspace. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
requestRanges	TokenNameIdentifier	 request Ranges
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
requestRanges	TokenNameIdentifier	 request Ranges
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
tableName	TokenNameIdentifier	 table Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumnFamilyStores	TokenNameIdentifier	 get Column Family Stores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Request ranges to be transferred from specific CFs */	TokenNameCOMMENT_JAVADOC	 Request ranges to be transferred from specific CFs 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
requestRanges	TokenNameIdentifier	 request Ranges
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
>	TokenNameGREATER	
columnFamilies	TokenNameIdentifier	 column Families
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
"Requesting from {} ranges {}"	TokenNameStringLiteral	Requesting from {} ranges {}
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamInSession	TokenNameIdentifier	 Stream In Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
StreamInSession	TokenNameIdentifier	 Stream In Session
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamRequest	TokenNameIdentifier	 Stream Request
srm	TokenNameIdentifier	 srm
=	TokenNameEQUAL	
new	TokenNamenew	
StreamRequest	TokenNameIdentifier	 Stream Request
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ranges	TokenNameIdentifier	 ranges
,	TokenNameCOMMA	
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
columnFamilies	TokenNameIdentifier	 column Families
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getSessionId	TokenNameIdentifier	 get Session Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendOneWay	TokenNameIdentifier	 send One Way
(	TokenNameLPAREN	
srm	TokenNameIdentifier	 srm
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Translates remote files to local files by creating a local sstable per remote sstable. */	TokenNameCOMMENT_JAVADOC	 Translates remote files to local files by creating a local sstable per remote sstable. 
public	TokenNamepublic	
static	TokenNamestatic	
PendingFile	TokenNameIdentifier	 Pending File
getContextMapping	TokenNameIdentifier	 get Context Mapping
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
remote	TokenNameIdentifier	 remote
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* Create a local sstable for each remote sstable */	TokenNameCOMMENT_BLOCK	 Create a local sstable for each remote sstable 
Descriptor	TokenNameIdentifier	 Descriptor
remotedesc	TokenNameIdentifier	 remotedesc
=	TokenNameEQUAL	
remote	TokenNameIdentifier	 remote
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
remotedesc	TokenNameIdentifier	 remotedesc
.	TokenNameDOT	
isStreamCompatible	TokenNameIdentifier	 is Stream Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SSTable %s is not compatible with current version %s"	TokenNameStringLiteral	SSTable %s is not compatible with current version %s
,	TokenNameCOMMA	
remote	TokenNameIdentifier	 remote
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
CURRENT	TokenNameIdentifier	 CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// new local sstable 	TokenNameCOMMENT_LINE	new local sstable 
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
remotedesc	TokenNameIdentifier	 remotedesc
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfStore	TokenNameIdentifier	 cf Store
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
remotedesc	TokenNameIdentifier	 remotedesc
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
DataDirectory	TokenNameIdentifier	 Data Directory
localDir	TokenNameIdentifier	 local Dir
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
getLocationCapableOfSize	TokenNameIdentifier	 get Location Capable Of Size
(	TokenNameLPAREN	
remote	TokenNameIdentifier	 remote
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localDir	TokenNameIdentifier	 local Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Insufficient disk space to store "	TokenNameStringLiteral	Insufficient disk space to store 
+	TokenNamePLUS	
remote	TokenNameIdentifier	 remote
.	TokenNameDOT	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
localdesc	TokenNameIdentifier	 localdesc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
cfStore	TokenNameIdentifier	 cf Store
.	TokenNameDOT	
getTempSSTablePath	TokenNameIdentifier	 get Temp SS Table Path
(	TokenNameLPAREN	
cfStore	TokenNameIdentifier	 cf Store
.	TokenNameDOT	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
getLocationForDisk	TokenNameIdentifier	 get Location For Disk
(	TokenNameLPAREN	
localDir	TokenNameIdentifier	 local Dir
.	TokenNameDOT	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
localdesc	TokenNameIdentifier	 localdesc
,	TokenNameCOMMA	
remote	TokenNameIdentifier	 remote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
