/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
sink	TokenNameIdentifier	 sink
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
public	TokenNamepublic	
class	TokenNameclass	
SinkManager	TokenNameIdentifier	 Sink Manager
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IMessageSink	TokenNameIdentifier	 I Message Sink
>	TokenNameGREATER	
sinks	TokenNameIdentifier	 sinks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IMessageSink	TokenNameIdentifier	 I Message Sink
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IMessageSink	TokenNameIdentifier	 I Message Sink
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MessageOut	TokenNameIdentifier	 Message Out
processOutboundMessage	TokenNameIdentifier	 process Outbound Message
(	TokenNameLPAREN	
MessageOut	TokenNameIdentifier	 Message Out
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IMessageSink	TokenNameIdentifier	 I Message Sink
ms	TokenNameIdentifier	 ms
:	TokenNameCOLON	
sinks	TokenNameIdentifier	 sinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
ms	TokenNameIdentifier	 ms
.	TokenNameDOT	
handleMessage	TokenNameIdentifier	 handle Message
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MessageIn	TokenNameIdentifier	 Message In
processInboundMessage	TokenNameIdentifier	 process Inbound Message
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sinks	TokenNameIdentifier	 sinks
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IMessageSink	TokenNameIdentifier	 I Message Sink
ms	TokenNameIdentifier	 ms
:	TokenNameCOLON	
sinks	TokenNameIdentifier	 sinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
ms	TokenNameIdentifier	 ms
.	TokenNameDOT	
handleMessage	TokenNameIdentifier	 handle Message
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
