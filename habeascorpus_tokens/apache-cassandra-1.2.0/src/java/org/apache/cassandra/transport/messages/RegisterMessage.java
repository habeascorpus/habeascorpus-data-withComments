/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
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
QueryState	TokenNameIdentifier	 Query State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RegisterMessage	TokenNameIdentifier	 Register Message
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Request	TokenNameIdentifier	 Request
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
RegisterMessage	TokenNameIdentifier	 Register Message
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
new	TokenNamenew	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
RegisterMessage	TokenNameIdentifier	 Register Message
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
RegisterMessage	TokenNameIdentifier	 Register Message
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
eventTypes	TokenNameIdentifier	 event Types
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
eventTypes	TokenNameIdentifier	 event Types
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RegisterMessage	TokenNameIdentifier	 Register Message
(	TokenNameLPAREN	
eventTypes	TokenNameIdentifier	 event Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
RegisterMessage	TokenNameIdentifier	 Register Message
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
dynamicBuffer	TokenNameIdentifier	 dynamic Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
eventTypes	TokenNameIdentifier	 event Types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
eventTypes	TokenNameIdentifier	 event Types
)	TokenNameRPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
eventTypes	TokenNameIdentifier	 event Types
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RegisterMessage	TokenNameIdentifier	 Register Message
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
eventTypes	TokenNameIdentifier	 event Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
REGISTER	TokenNameIdentifier	 REGISTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eventTypes	TokenNameIdentifier	 event Types
=	TokenNameEQUAL	
eventTypes	TokenNameIdentifier	 event Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Response	TokenNameIdentifier	 Response
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
connection	TokenNameIdentifier	 connection
instanceof	TokenNameinstanceof	
ServerConnection	TokenNameIdentifier	 Server Connection
;	TokenNameSEMICOLON	
Connection	TokenNameIdentifier	 Connection
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tracker	TokenNameIdentifier	 tracker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ServerConnection	TokenNameIdentifier	 Server Connection
)	TokenNameRPAREN	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
.	TokenNameDOT	
getTracker	TokenNameIdentifier	 get Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
tracker	TokenNameIdentifier	 tracker
instanceof	TokenNameinstanceof	
Server	TokenNameIdentifier	 Server
.	TokenNameDOT	
ConnectionTracker	TokenNameIdentifier	 Connection Tracker
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
eventTypes	TokenNameIdentifier	 event Types
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Server	TokenNameIdentifier	 Server
.	TokenNameDOT	
ConnectionTracker	TokenNameIdentifier	 Connection Tracker
)	TokenNameRPAREN	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
connection	TokenNameIdentifier	 connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ReadyMessage	TokenNameIdentifier	 Ready Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"REGISTER "	TokenNameStringLiteral	REGISTER 
+	TokenNamePLUS	
eventTypes	TokenNameIdentifier	 event Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
