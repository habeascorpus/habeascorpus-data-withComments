/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
MessageOut	TokenNameIdentifier	 Message Out
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
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ReadVerbHandler	TokenNameIdentifier	 Read Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
ReadCommand	TokenNameIdentifier	 Read Command
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
ReadVerbHandler	TokenNameIdentifier	 Read Verb Handler
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
ReadCommand	TokenNameIdentifier	 Read Command
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
isBootstrapMode	TokenNameIdentifier	 is Bootstrap Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot service reads while bootstrapping!"	TokenNameStringLiteral	Cannot service reads while bootstrapping!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ReadCommand	TokenNameIdentifier	 Read Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
reply	TokenNameIdentifier	 reply
=	TokenNameEQUAL	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
,	TokenNameCOMMA	
getResponse	TokenNameIdentifier	 get Response
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ReadResponse	TokenNameIdentifier	 Read Response
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
IOException	TokenNameIdentifier	 IO Exception
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
public	TokenNamepublic	
static	TokenNamestatic	
ReadResponse	TokenNameIdentifier	 Read Response
getResponse	TokenNameIdentifier	 get Response
(	TokenNameLPAREN	
ReadCommand	TokenNameIdentifier	 Read Command
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"digest is "	TokenNameStringLiteral	digest is 
+	TokenNamePLUS	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
