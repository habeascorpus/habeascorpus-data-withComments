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
public	TokenNamepublic	
class	TokenNameclass	
ReplicationFinishedVerbHandler	TokenNameIdentifier	 Replication Finished Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
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
ReplicationFinishedVerbHandler	TokenNameIdentifier	 Replication Finished Verb Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
doVerb	TokenNameIdentifier	 do Verb
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
confirmReplication	TokenNameIdentifier	 confirm Replication
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessageOut	TokenNameIdentifier	 Message Out
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
)	TokenNameRPAREN	
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
"Replying to "	TokenNameStringLiteral	Replying to 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
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
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
