/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
UUID	TokenNameIdentifier	 UUID
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
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
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
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractStreamSession	TokenNameIdentifier	 Abstract Stream Session
implements	TokenNameimplements	
IEndpointStateChangeSubscriber	TokenNameIdentifier	 I Endpoint State Change Subscriber
,	TokenNameCOMMA	
IFailureDetectionEventListener	TokenNameIdentifier	 I Failure Detection Event Listener
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
AbstractStreamSession	TokenNameIdentifier	 Abstract Stream Session
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
isClosed	TokenNameIdentifier	 is Closed
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractStreamSession	TokenNameIdentifier	 Abstract Stream Session
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
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
=	TokenNameEQUAL	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
callback	TokenNameIdentifier	 callback
=	TokenNameEQUAL	
callback	TokenNameIdentifier	 callback
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FailureDetector	TokenNameIdentifier	 Failure Detector
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
registerFailureDetectionEventListener	TokenNameIdentifier	 register Failure Detection Event Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UUID	TokenNameIdentifier	 UUID
getSessionId	TokenNameIdentifier	 get Session Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InetAddress	TokenNameIdentifier	 Inet Address
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClosed	TokenNameIdentifier	 is Closed
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Stream session {} already closed"	TokenNameStringLiteral	Stream session {} already closed
,	TokenNameCOMMA	
getSessionId	TokenNameIdentifier	 get Session Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
closeInternal	TokenNameIdentifier	 close Internal
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
unregister	TokenNameIdentifier	 unregister
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FailureDetector	TokenNameIdentifier	 Failure Detector
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
unregisterFailureDetectionEventListener	TokenNameIdentifier	 unregister Failure Detection Event Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"closing with status "	TokenNameStringLiteral	closing with status 
+	TokenNamePLUS	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
callback	TokenNameIdentifier	 callback
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
callback	TokenNameIdentifier	 callback
.	TokenNameDOT	
onSuccess	TokenNameIdentifier	 on Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
callback	TokenNameIdentifier	 callback
.	TokenNameDOT	
onFailure	TokenNameIdentifier	 on Failure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
closeInternal	TokenNameIdentifier	 close Internal
(	TokenNameLPAREN	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
onJoin	TokenNameIdentifier	 on Join
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onChange	TokenNameIdentifier	 on Change
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
ApplicationState	TokenNameIdentifier	 Application State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onAlive	TokenNameIdentifier	 on Alive
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onDead	TokenNameIdentifier	 on Dead
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onRemove	TokenNameIdentifier	 on Remove
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
convict	TokenNameIdentifier	 convict
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onRestart	TokenNameIdentifier	 on Restart
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
convict	TokenNameIdentifier	 convict
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
convict	TokenNameIdentifier	 convict
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
double	TokenNamedouble	
phi	TokenNameIdentifier	 phi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// We want a higher confidence in the failure detection than usual because failing a streaming wrongly has a high cost. 	TokenNameCOMMENT_LINE	We want a higher confidence in the failure detection than usual because failing a streaming wrongly has a high cost. 
if	TokenNameif	
(	TokenNameLPAREN	
phi	TokenNameIdentifier	 phi
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPhiConvictThreshold	TokenNameIdentifier	 get Phi Convict Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Stream failed because {} died or was restarted/removed (streams may still be active "	TokenNameStringLiteral	Stream failed because {} died or was restarted/removed (streams may still be active 
+	TokenNamePLUS	
"in background, but further streams won't be started)"	TokenNameStringLiteral	in background, but further streams won't be started)
,	TokenNameCOMMA	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
