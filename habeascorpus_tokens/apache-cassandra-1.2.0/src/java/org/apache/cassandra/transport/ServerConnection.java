/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
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
ClientState	TokenNameIdentifier	 Client State
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
cliffc	TokenNameIdentifier	 cliffc
.	TokenNameDOT	
high_scale_lib	TokenNameIdentifier	 high scale lib
.	TokenNameDOT	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ServerConnection	TokenNameIdentifier	 Server Connection
extends	TokenNameextends	
Connection	TokenNameIdentifier	 Connection
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Factory	TokenNameIdentifier	 Factory
FACTORY	TokenNameIdentifier	 FACTORY
=	TokenNameEQUAL	
new	TokenNamenew	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
newConnection	TokenNameIdentifier	 new Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ServerConnection	TokenNameIdentifier	 Server Connection
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
enum	TokenNameenum	
State	TokenNameIdentifier	 State
{	TokenNameLBRACE	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
,	TokenNameCOMMA	
AUTHENTICATION	TokenNameIdentifier	 AUTHENTICATION
,	TokenNameCOMMA	
READY	TokenNameIdentifier	 READY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ClientState	TokenNameIdentifier	 Client State
clientState	TokenNameIdentifier	 client State
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
QueryState	TokenNameIdentifier	 Query State
>	TokenNameGREATER	
queryStates	TokenNameIdentifier	 query States
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
QueryState	TokenNameIdentifier	 Query State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ServerConnection	TokenNameIdentifier	 Server Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clientState	TokenNameIdentifier	 client State
=	TokenNameEQUAL	
new	TokenNamenew	
ClientState	TokenNameIdentifier	 Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryState	TokenNameIdentifier	 Query State
getQueryState	TokenNameIdentifier	 get Query State
(	TokenNameLPAREN	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryState	TokenNameIdentifier	 Query State
qState	TokenNameIdentifier	 q State
=	TokenNameEQUAL	
queryStates	TokenNameIdentifier	 query States
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
streamId	TokenNameIdentifier	 stream Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qState	TokenNameIdentifier	 q State
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In theory we shouldn't get any race here, but it never hurts to be careful 	TokenNameCOMMENT_LINE	In theory we shouldn't get any race here, but it never hurts to be careful 
QueryState	TokenNameIdentifier	 Query State
newState	TokenNameIdentifier	 new State
=	TokenNameEQUAL	
new	TokenNamenew	
QueryState	TokenNameIdentifier	 Query State
(	TokenNameLPAREN	
clientState	TokenNameIdentifier	 client State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
qState	TokenNameIdentifier	 q State
=	TokenNameEQUAL	
queryStates	TokenNameIdentifier	 query States
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
newState	TokenNameIdentifier	 new State
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
qState	TokenNameIdentifier	 q State
=	TokenNameEQUAL	
newState	TokenNameIdentifier	 new State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
qState	TokenNameIdentifier	 q State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateNewMessage	TokenNameIdentifier	 validate New Message
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STARTUP	TokenNameIdentifier	 STARTUP
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
OPTIONS	TokenNameIdentifier	 OPTIONS
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unexpected message %s, expecting STARTUP or OPTIONS"	TokenNameStringLiteral	Unexpected message %s, expecting STARTUP or OPTIONS
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AUTHENTICATION	TokenNameIdentifier	 AUTHENTICATION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CREDENTIALS	TokenNameIdentifier	 CREDENTIALS
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unexpected message %s, needs authentication through CREDENTIALS message"	TokenNameStringLiteral	Unexpected message %s, needs authentication through CREDENTIALS message
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
READY	TokenNameIdentifier	 READY
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STARTUP	TokenNameIdentifier	 STARTUP
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Unexpected message STARTUP, the connection is already initialized"	TokenNameStringLiteral	Unexpected message STARTUP, the connection is already initialized
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
applyStateTransition	TokenNameIdentifier	 apply State Transition
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
requestType	TokenNameIdentifier	 request Type
,	TokenNameCOMMA	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
responseType	TokenNameIdentifier	 response Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STARTUP	TokenNameIdentifier	 STARTUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
responseType	TokenNameIdentifier	 response Type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
AUTHENTICATE	TokenNameIdentifier	 AUTHENTICATE
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
AUTHENTICATION	TokenNameIdentifier	 AUTHENTICATION
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
responseType	TokenNameIdentifier	 response Type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
READY	TokenNameIdentifier	 READY
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
READY	TokenNameIdentifier	 READY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AUTHENTICATION	TokenNameIdentifier	 AUTHENTICATION
:	TokenNameCOLON	
assert	TokenNameassert	
requestType	TokenNameIdentifier	 request Type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CREDENTIALS	TokenNameIdentifier	 CREDENTIALS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
responseType	TokenNameIdentifier	 response Type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
READY	TokenNameIdentifier	 READY
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
READY	TokenNameIdentifier	 READY
;	TokenNameSEMICOLON	
case	TokenNamecase	
READY	TokenNameIdentifier	 READY
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
