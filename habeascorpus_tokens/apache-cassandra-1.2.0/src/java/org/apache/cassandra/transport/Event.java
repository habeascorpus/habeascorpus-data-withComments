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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
TOPOLOGY_CHANGE	TokenNameIdentifier	 TOPOLOGY  CHANGE
,	TokenNameCOMMA	
STATUS_CHANGE	TokenNameIdentifier	 STATUS  CHANGE
,	TokenNameCOMMA	
SCHEMA_CHANGE	TokenNameIdentifier	 SCHEMA  CHANGE
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Event	TokenNameIdentifier	 Event
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Event	TokenNameIdentifier	 Event
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TOPOLOGY_CHANGE	TokenNameIdentifier	 TOPOLOGY  CHANGE
:	TokenNameCOLON	
return	TokenNamereturn	
TopologyChange	TokenNameIdentifier	 Topology Change
.	TokenNameDOT	
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STATUS_CHANGE	TokenNameIdentifier	 STATUS  CHANGE
:	TokenNameCOLON	
return	TokenNamereturn	
StatusChange	TokenNameIdentifier	 Status Change
.	TokenNameDOT	
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SCHEMA_CHANGE	TokenNameIdentifier	 SCHEMA  CHANGE
:	TokenNameCOLON	
return	TokenNamereturn	
SchemaChange	TokenNameIdentifier	 Schema Change
.	TokenNameDOT	
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
serializeEvent	TokenNameIdentifier	 serialize Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
serializeEvent	TokenNameIdentifier	 serialize Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TopologyChange	TokenNameIdentifier	 Topology Change
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Change	TokenNameIdentifier	 Change
{	TokenNameLBRACE	
NEW_NODE	TokenNameIdentifier	 NEW  NODE
,	TokenNameCOMMA	
REMOVED_NODE	TokenNameIdentifier	 REMOVED  NODE
,	TokenNameCOMMA	
MOVED_NODE	TokenNameIdentifier	 MOVED  NODE
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TopologyChange	TokenNameIdentifier	 Topology Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
TOPOLOGY_CHANGE	TokenNameIdentifier	 TOPOLOGY  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TopologyChange	TokenNameIdentifier	 Topology Change
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopologyChange	TokenNameIdentifier	 Topology Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
NEW_NODE	TokenNameIdentifier	 NEW  NODE
,	TokenNameCOMMA	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TopologyChange	TokenNameIdentifier	 Topology Change
removedNode	TokenNameIdentifier	 removed Node
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopologyChange	TokenNameIdentifier	 Topology Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
REMOVED_NODE	TokenNameIdentifier	 REMOVED  NODE
,	TokenNameCOMMA	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TopologyChange	TokenNameIdentifier	 Topology Change
movedNode	TokenNameIdentifier	 moved Node
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopologyChange	TokenNameIdentifier	 Topology Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
MOVED_NODE	TokenNameIdentifier	 MOVED  NODE
,	TokenNameCOMMA	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assumes the type has already by been deserialized 	TokenNameCOMMENT_LINE	Assumes the type has already by been deserialized 
private	TokenNameprivate	
static	TokenNamestatic	
TopologyChange	TokenNameIdentifier	 Topology Change
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readInet	TokenNameIdentifier	 read Inet
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TopologyChange	TokenNameIdentifier	 Topology Change
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
serializeEvent	TokenNameIdentifier	 serialize Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
inetToCB	TokenNameIdentifier	 inet To CB
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
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
change	TokenNameIdentifier	 change
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
StatusChange	TokenNameIdentifier	 Status Change
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Status	TokenNameIdentifier	 Status
{	TokenNameLBRACE	
UP	TokenNameIdentifier	 UP
,	TokenNameCOMMA	
DOWN	TokenNameIdentifier	 DOWN
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Status	TokenNameIdentifier	 Status
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StatusChange	TokenNameIdentifier	 Status Change
(	TokenNameLPAREN	
Status	TokenNameIdentifier	 Status
status	TokenNameIdentifier	 status
,	TokenNameCOMMA	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STATUS_CHANGE	TokenNameIdentifier	 STATUS  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
StatusChange	TokenNameIdentifier	 Status Change
nodeUp	TokenNameIdentifier	 node Up
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StatusChange	TokenNameIdentifier	 Status Change
(	TokenNameLPAREN	
Status	TokenNameIdentifier	 Status
.	TokenNameDOT	
UP	TokenNameIdentifier	 UP
,	TokenNameCOMMA	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
StatusChange	TokenNameIdentifier	 Status Change
nodeDown	TokenNameIdentifier	 node Down
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StatusChange	TokenNameIdentifier	 Status Change
(	TokenNameLPAREN	
Status	TokenNameIdentifier	 Status
.	TokenNameDOT	
DOWN	TokenNameIdentifier	 DOWN
,	TokenNameCOMMA	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assumes the type has already by been deserialized 	TokenNameCOMMENT_LINE	Assumes the type has already by been deserialized 
private	TokenNameprivate	
static	TokenNamestatic	
StatusChange	TokenNameIdentifier	 Status Change
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Status	TokenNameIdentifier	 Status
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Status	TokenNameIdentifier	 Status
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readInet	TokenNameIdentifier	 read Inet
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StatusChange	TokenNameIdentifier	 Status Change
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
serializeEvent	TokenNameIdentifier	 serialize Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
inetToCB	TokenNameIdentifier	 inet To CB
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
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
status	TokenNameIdentifier	 status
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SchemaChange	TokenNameIdentifier	 Schema Change
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Change	TokenNameIdentifier	 Change
{	TokenNameLBRACE	
CREATED	TokenNameIdentifier	 CREATED
,	TokenNameCOMMA	
UPDATED	TokenNameIdentifier	 UPDATED
,	TokenNameCOMMA	
DROPPED	TokenNameIdentifier	 DROPPED
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SchemaChange	TokenNameIdentifier	 Schema Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SCHEMA_CHANGE	TokenNameIdentifier	 SCHEMA  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SchemaChange	TokenNameIdentifier	 Schema Change
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assumes the type has already by been deserialized 	TokenNameCOMMENT_LINE	Assumes the type has already by been deserialized 
private	TokenNameprivate	
static	TokenNamestatic	
SchemaChange	TokenNameIdentifier	 Schema Change
deserializeEvent	TokenNameIdentifier	 deserialize Event
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Change	TokenNameIdentifier	 Change
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SchemaChange	TokenNameIdentifier	 Schema Change
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
serializeEvent	TokenNameIdentifier	 serialize Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
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
change	TokenNameIdentifier	 change
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
