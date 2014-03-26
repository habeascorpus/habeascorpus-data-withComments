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
DataInputStream	TokenNameIdentifier	 Data Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
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
*	TokenNameMULTIPLY	
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
public	TokenNamepublic	
class	TokenNameclass	
RowMutationVerbHandler	TokenNameIdentifier	 Row Mutation Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
RowMutation	TokenNameIdentifier	 Row Mutation
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
RowMutationVerbHandler	TokenNameIdentifier	 Row Mutation Verb Handler
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
RowMutation	TokenNameIdentifier	 Row Mutation
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Applying mutation"	TokenNameStringLiteral	Applying mutation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if there were any forwarding headers in this message 	TokenNameCOMMENT_LINE	Check if there were any forwarding headers in this message 
InetAddress	TokenNameIdentifier	 Inet Address
replyTo	TokenNameIdentifier	 reply To
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RowMutation	TokenNameIdentifier	 Row Mutation
.	TokenNameDOT	
FORWARD_FROM	TokenNameIdentifier	 FORWARD  FROM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
forwardBytes	TokenNameIdentifier	 forward Bytes
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RowMutation	TokenNameIdentifier	 Row Mutation
.	TokenNameDOT	
FORWARD_TO	TokenNameIdentifier	 FORWARD  TO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
forwardBytes	TokenNameIdentifier	 forward Bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
version	TokenNameIdentifier	 version
>=	TokenNameGREATER_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
forwardToLocalNodes	TokenNameIdentifier	 forward To Local Nodes
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
forwardBytes	TokenNameIdentifier	 forward Bytes
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
replyTo	TokenNameIdentifier	 reply To
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByAddress	TokenNameIdentifier	 get By Address
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WriteResponse	TokenNameIdentifier	 Write Response
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
new	TokenNamenew	
WriteResponse	TokenNameIdentifier	 Write Response
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Enqueuing response to {}"	TokenNameStringLiteral	Enqueuing response to {}
,	TokenNameCOMMA	
replyTo	TokenNameIdentifier	 reply To
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
response	TokenNameIdentifier	 response
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
replyTo	TokenNameIdentifier	 reply To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error in row mutation"	TokenNameStringLiteral	Error in row mutation
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Older version (< 1.0) will not send this message at all, hence we don't * need to check the version of the data. */	TokenNameCOMMENT_JAVADOC	 Older version (< 1.0) will not send this message at all, hence we don't need to check the version of the data. 
private	TokenNameprivate	
void	TokenNamevoid	
forwardToLocalNodes	TokenNameIdentifier	 forward To Local Nodes
(	TokenNameLPAREN	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
forwardBytes	TokenNameIdentifier	 forward Bytes
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
(	TokenNameLPAREN	
forwardBytes	TokenNameIdentifier	 forward Bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove fwds from message to avoid infinite loop 	TokenNameCOMMENT_LINE	remove fwds from message to avoid infinite loop 
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
RowMutation	TokenNameIdentifier	 Row Mutation
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
RowMutation	TokenNameIdentifier	 Row Mutation
>	TokenNameGREATER	
(	TokenNameLPAREN	
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
RowMutation	TokenNameIdentifier	 Row Mutation
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
.	TokenNameDOT	
withParameter	TokenNameIdentifier	 with Parameter
(	TokenNameLPAREN	
RowMutation	TokenNameIdentifier	 Row Mutation
.	TokenNameDOT	
FORWARD_FROM	TokenNameIdentifier	 FORWARD  FROM
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Send a message to each of the addresses on our Forward List 	TokenNameCOMMENT_LINE	Send a message to each of the addresses on our Forward List 
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Forwarding message to {}@{}"	TokenNameStringLiteral	Forwarding message to {}@{}
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Let the response go back to the coordinator 	TokenNameCOMMENT_LINE	Let the response go back to the coordinator 
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendOneWay	TokenNameIdentifier	 send One Way
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
