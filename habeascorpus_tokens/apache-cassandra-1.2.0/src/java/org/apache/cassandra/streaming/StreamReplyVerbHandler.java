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
public	TokenNamepublic	
class	TokenNameclass	
StreamReplyVerbHandler	TokenNameIdentifier	 Stream Reply Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
StreamReply	TokenNameIdentifier	 Stream Reply
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
StreamReplyVerbHandler	TokenNameIdentifier	 Stream Reply Verb Handler
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
StreamReply	TokenNameIdentifier	 Stream Reply
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamReply	TokenNameIdentifier	 Stream Reply
reply	TokenNameIdentifier	 reply
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Received StreamReply {}"	TokenNameStringLiteral	Received StreamReply {}
,	TokenNameCOMMA	
reply	TokenNameIdentifier	 reply
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
StreamOutSession	TokenNameIdentifier	 Stream Out Session
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Received stream action "	TokenNameStringLiteral	Received stream action 
+	TokenNamePLUS	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
action	TokenNameIdentifier	 action
+	TokenNamePLUS	
" for an unknown session from "	TokenNameStringLiteral	 for an unknown session from 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
FILE_FINISHED	TokenNameIdentifier	 FILE  FINISHED
:	TokenNameCOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Successfully sent {} to {}"	TokenNameStringLiteral	Successfully sent {} to {}
,	TokenNameCOMMA	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
validateCurrentFile	TokenNameIdentifier	 validate Current File
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
startNext	TokenNameIdentifier	 start Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FILE_RETRY	TokenNameIdentifier	 FILE  RETRY
:	TokenNameCOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
validateCurrentFile	TokenNameIdentifier	 validate Current File
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Need to re-stream file {} to {}"	TokenNameStringLiteral	Need to re-stream file {} to {}
,	TokenNameCOMMA	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
retry	TokenNameIdentifier	 retry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SESSION_FINISHED	TokenNameIdentifier	 SESSION  FINISHED
:	TokenNameCOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SESSION_FAILURE	TokenNameIdentifier	 SESSION  FAILURE
:	TokenNameCOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot handle FileStatus.Action: "	TokenNameStringLiteral	Cannot handle FileStatus.Action: 
+	TokenNamePLUS	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
