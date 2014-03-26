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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Stage	TokenNameIdentifier	 Stage
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MessageIn	TokenNameIdentifier	 Message In
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verb	TokenNameIdentifier	 verb
=	TokenNameEQUAL	
verb	TokenNameIdentifier	 verb
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
parameterCount	TokenNameIdentifier	 parameter Count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameterCount	TokenNameIdentifier	 parameter Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ImmutableMap	TokenNameIdentifier	 Immutable Map
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ImmutableMap	TokenNameIdentifier	 Immutable Map
.	TokenNameDOT	
builder	TokenNameIdentifier	 builder
(	TokenNameLPAREN	
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
parameterCount	TokenNameIdentifier	 parameter Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
payloadSize	TokenNameIdentifier	 payload Size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
)	TokenNameRPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
verbSerializers	TokenNameIdentifier	 verb Serializers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
verb	TokenNameIdentifier	 verb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serializer	TokenNameIdentifier	 serializer
instanceof	TokenNameinstanceof	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
CallbackDeterminedSerializer	TokenNameIdentifier	 Callback Determined Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CallbackInfo	TokenNameIdentifier	 Callback Info
callback	TokenNameIdentifier	 callback
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRegisteredCallback	TokenNameIdentifier	 get Registered Callback
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
callback	TokenNameIdentifier	 callback
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reply for expired callback. we'll have to skip it. 	TokenNameCOMMENT_LINE	reply for expired callback. we'll have to skip it. 
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
skipBytesFully	TokenNameIdentifier	 skip Bytes Fully
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
payloadSize	TokenNameIdentifier	 payload Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
T2	TokenNameIdentifier	 T2
>	TokenNameGREATER	
)	TokenNameRPAREN	
callback	TokenNameIdentifier	 callback
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
payloadSize	TokenNameIdentifier	 payload Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
serializer	TokenNameIdentifier	 serializer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T2	TokenNameIdentifier	 T2
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
MessageIn	TokenNameIdentifier	 Message In
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
verb	TokenNameIdentifier	 verb
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Stage	TokenNameIdentifier	 Stage
getMessageType	TokenNameIdentifier	 get Message Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
verbStages	TokenNameIdentifier	 verb Stages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
verb	TokenNameIdentifier	 verb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTimeout	TokenNameIdentifier	 get Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTimeout	TokenNameIdentifier	 get Timeout
(	TokenNameLPAREN	
verb	TokenNameIdentifier	 verb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"FROM:"	TokenNameStringLiteral	FROM:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" TYPE:"	TokenNameStringLiteral	 TYPE:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getMessageType	TokenNameIdentifier	 get Message Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" VERB:"	TokenNameStringLiteral	 VERB:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
verb	TokenNameIdentifier	 verb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
