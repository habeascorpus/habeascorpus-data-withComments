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
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
ImmutableMap	TokenNameIdentifier	 Immutable Map
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
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
transport	TokenNameIdentifier	 transport
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
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
public	TokenNamepublic	
class	TokenNameclass	
PrepareMessage	TokenNameIdentifier	 Prepare Message
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
PrepareMessage	TokenNameIdentifier	 Prepare Message
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
new	TokenNamenew	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
PrepareMessage	TokenNameIdentifier	 Prepare Message
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
PrepareMessage	TokenNameIdentifier	 Prepare Message
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readLongString	TokenNameIdentifier	 read Long String
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PrepareMessage	TokenNameIdentifier	 Prepare Message
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
PrepareMessage	TokenNameIdentifier	 Prepare Message
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
longStringToCB	TokenNameIdentifier	 long String To CB
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PrepareMessage	TokenNameIdentifier	 Prepare Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
PREPARE	TokenNameIdentifier	 PREPARE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
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
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Response	TokenNameIdentifier	 Response
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
tracingId	TokenNameIdentifier	 tracing Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTracingRequested	TokenNameIdentifier	 is Tracing Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tracingId	TokenNameIdentifier	 tracing Id
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
prepareTracingSession	TokenNameIdentifier	 prepare Tracing Session
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
traceNextQuery	TokenNameIdentifier	 trace Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
createTracingSession	TokenNameIdentifier	 create Tracing Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
(	TokenNameLPAREN	
"Preparing CQL3 query"	TokenNameStringLiteral	Preparing CQL3 query
,	TokenNameCOMMA	
ImmutableMap	TokenNameIdentifier	 Immutable Map
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
"query"	TokenNameStringLiteral	query
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Response	TokenNameIdentifier	 Response
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClientState	TokenNameIdentifier	 get Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setTracingId	TokenNameIdentifier	 set Tracing Id
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
response	TokenNameIdentifier	 response
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ErrorMessage	TokenNameIdentifier	 Error Message
.	TokenNameDOT	
fromException	TokenNameIdentifier	 from Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
stopSession	TokenNameIdentifier	 stop Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"PREPARE "	TokenNameStringLiteral	PREPARE 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
