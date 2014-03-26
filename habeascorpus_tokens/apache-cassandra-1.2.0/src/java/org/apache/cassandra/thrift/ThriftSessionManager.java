/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketAddress	TokenNameIdentifier	 Socket Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
;	TokenNameSEMICOLON	
/** * Encapsulates the current client state (session). * * We rely on the Thrift server to tell us what socket it is * executing a request for via setCurrentSocket, after which currentSession can do its job anywhere. */	TokenNameCOMMENT_JAVADOC	 Encapsulates the current client state (session). * We rely on the Thrift server to tell us what socket it is executing a request for via setCurrentSocket, after which currentSession can do its job anywhere. 
public	TokenNamepublic	
class	TokenNameclass	
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
SocketAddress	TokenNameIdentifier	 Socket Address
>	TokenNameGREATER	
remoteSocket	TokenNameIdentifier	 remote Socket
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
SocketAddress	TokenNameIdentifier	 Socket Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
SocketAddress	TokenNameIdentifier	 Socket Address
,	TokenNameCOMMA	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
>	TokenNameGREATER	
activeSocketSessions	TokenNameIdentifier	 active Socket Sessions
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
SocketAddress	TokenNameIdentifier	 Socket Address
,	TokenNameCOMMA	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param socket the address on which the current thread will work on requests for until further notice */	TokenNameCOMMENT_JAVADOC	 @param socket the address on which the current thread will work on requests for until further notice 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentSocket	TokenNameIdentifier	 set Current Socket
(	TokenNameLPAREN	
SocketAddress	TokenNameIdentifier	 Socket Address
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remoteSocket	TokenNameIdentifier	 remote Socket
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the current session for the most recently given socket on this thread */	TokenNameCOMMENT_JAVADOC	 @return the current session for the most recently given socket on this thread 
public	TokenNamepublic	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
currentSession	TokenNameIdentifier	 current Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SocketAddress	TokenNameIdentifier	 Socket Address
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
remoteSocket	TokenNameIdentifier	 remote Socket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
cState	TokenNameIdentifier	 c State
=	TokenNameEQUAL	
activeSocketSessions	TokenNameIdentifier	 active Socket Sessions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cState	TokenNameIdentifier	 c State
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cState	TokenNameIdentifier	 c State
=	TokenNameEQUAL	
new	TokenNamenew	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activeSocketSessions	TokenNameIdentifier	 active Socket Sessions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
,	TokenNameCOMMA	
cState	TokenNameIdentifier	 c State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cState	TokenNameIdentifier	 c State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The connection associated with @param socket is permanently finished. */	TokenNameCOMMENT_JAVADOC	 The connection associated with @param socket is permanently finished. 
public	TokenNamepublic	
void	TokenNamevoid	
connectionComplete	TokenNameIdentifier	 connection Complete
(	TokenNameLPAREN	
SocketAddress	TokenNameIdentifier	 Socket Address
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
activeSocketSessions	TokenNameIdentifier	 active Socket Sessions
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
