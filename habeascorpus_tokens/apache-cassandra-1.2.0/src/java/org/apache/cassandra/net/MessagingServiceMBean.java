/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * MBean exposing MessagingService metrics. * - OutboundConnectionPools - Command/Response - Pending/Completed Tasks */	TokenNameCOMMENT_JAVADOC	 MBean exposing MessagingService metrics. - OutboundConnectionPools - Command/Response - Pending/Completed Tasks 
public	TokenNamepublic	
interface	TokenNameinterface	
MessagingServiceMBean	TokenNameIdentifier	 Messaging Service M Bean
{	TokenNameLBRACE	
/** * Pending tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Pending tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
getCommandPendingTasks	TokenNameIdentifier	 get Command Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Completed tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Completed tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getCommandCompletedTasks	TokenNameIdentifier	 get Command Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Dropped tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Dropped tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getCommandDroppedTasks	TokenNameIdentifier	 get Command Dropped Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Pending tasks for Response(GOSSIP & RESPONSE) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Pending tasks for Response(GOSSIP & RESPONSE) TCP Connections 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
getResponsePendingTasks	TokenNameIdentifier	 get Response Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Completed tasks for Response(GOSSIP & RESPONSE) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Completed tasks for Response(GOSSIP & RESPONSE) TCP Connections 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getResponseCompletedTasks	TokenNameIdentifier	 get Response Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * dropped message counts for server lifetime */	TokenNameCOMMENT_JAVADOC	 dropped message counts for server lifetime 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
getDroppedMessages	TokenNameIdentifier	 get Dropped Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * dropped message counts since last called */	TokenNameCOMMENT_JAVADOC	 dropped message counts since last called 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
getRecentlyDroppedMessages	TokenNameIdentifier	 get Recently Dropped Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Total number of timeouts happened on this node */	TokenNameCOMMENT_JAVADOC	 Total number of timeouts happened on this node 
public	TokenNamepublic	
long	TokenNamelong	
getTotalTimeouts	TokenNameIdentifier	 get Total Timeouts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Number of timeouts per host */	TokenNameCOMMENT_JAVADOC	 Number of timeouts per host 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getTimeoutsPerHost	TokenNameIdentifier	 get Timeouts Per Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Number of timeouts since last check. */	TokenNameCOMMENT_JAVADOC	 Number of timeouts since last check. 
public	TokenNamepublic	
long	TokenNamelong	
getRecentTotalTimouts	TokenNameIdentifier	 get Recent Total Timouts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Number of timeouts since last check per host. */	TokenNameCOMMENT_JAVADOC	 Number of timeouts since last check per host. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getRecentTimeoutsPerHost	TokenNameIdentifier	 get Recent Timeouts Per Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
