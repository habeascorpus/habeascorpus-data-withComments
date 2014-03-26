/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
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
cliffc	TokenNameIdentifier	 cliffc
.	TokenNameDOT	
high_scale_lib	TokenNameIdentifier	 high scale lib
.	TokenNameDOT	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
;	TokenNameSEMICOLON	
/** * This abstraction represents both the HeartBeatState and the ApplicationState in an EndpointState * instance. Any state for a given endpoint can be retrieved from this instance. */	TokenNameCOMMENT_JAVADOC	 This abstraction represents both the HeartBeatState and the ApplicationState in an EndpointState instance. Any state for a given endpoint can be retrieved from this instance. 
public	TokenNamepublic	
class	TokenNameclass	
EndpointState	TokenNameIdentifier	 Endpoint State
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
EndpointStateSerializer	TokenNameIdentifier	 Endpoint State Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
hbState	TokenNameIdentifier	 hb State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
applicationState	TokenNameIdentifier	 application State
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* fields below do not get serialized */	TokenNameCOMMENT_BLOCK	 fields below do not get serialized 
private	TokenNameprivate	
volatile	TokenNamevolatile	
long	TokenNamelong	
updateTimestamp	TokenNameIdentifier	 update Timestamp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
isAlive	TokenNameIdentifier	 is Alive
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
(	TokenNameLPAREN	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
initialHbState	TokenNameIdentifier	 initial Hb State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hbState	TokenNameIdentifier	 hb State
=	TokenNameEQUAL	
initialHbState	TokenNameIdentifier	 initial Hb State
;	TokenNameSEMICOLON	
updateTimestamp	TokenNameIdentifier	 update Timestamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAlive	TokenNameIdentifier	 is Alive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
getHeartBeatState	TokenNameIdentifier	 get Heart Beat State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hbState	TokenNameIdentifier	 hb State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setHeartBeatState	TokenNameIdentifier	 set Heart Beat State
(	TokenNameLPAREN	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
newHbState	TokenNameIdentifier	 new Hb State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateTimestamp	TokenNameIdentifier	 update Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hbState	TokenNameIdentifier	 hb State
=	TokenNameEQUAL	
newHbState	TokenNameIdentifier	 new Hb State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionedValue	TokenNameIdentifier	 Versioned Value
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO replace this with operations that don't expose private state */	TokenNameCOMMENT_JAVADOC	 TODO replace this with operations that don't expose private state 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
getApplicationStateMap	TokenNameIdentifier	 get Application State Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applicationState	TokenNameIdentifier	 application State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addApplicationState	TokenNameIdentifier	 add Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* getters and setters */	TokenNameCOMMENT_BLOCK	 getters and setters 
public	TokenNamepublic	
long	TokenNamelong	
getUpdateTimestamp	TokenNameIdentifier	 get Update Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
updateTimestamp	TokenNameIdentifier	 update Timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
updateTimestamp	TokenNameIdentifier	 update Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateTimestamp	TokenNameIdentifier	 update Timestamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isAlive	TokenNameIdentifier	 is Alive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
markAlive	TokenNameIdentifier	 mark Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isAlive	TokenNameIdentifier	 is Alive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
markDead	TokenNameIdentifier	 mark Dead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isAlive	TokenNameIdentifier	 is Alive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
EndpointStateSerializer	TokenNameIdentifier	 Endpoint State Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* serialize the HeartBeatState */	TokenNameCOMMENT_BLOCK	 serialize the HeartBeatState 
HeartBeatState	TokenNameIdentifier	 Heart Beat State
hbState	TokenNameIdentifier	 hb State
=	TokenNameEQUAL	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
getHeartBeatState	TokenNameIdentifier	 get Heart Beat State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
hbState	TokenNameIdentifier	 hb State
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* serialize the map of ApplicationState objects */	TokenNameCOMMENT_BLOCK	 serialize the map of ApplicationState objects 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
EndpointState	TokenNameIdentifier	 Endpoint State
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
hbState	TokenNameIdentifier	 hb State
=	TokenNameEQUAL	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
=	TokenNameEQUAL	
new	TokenNamenew	
EndpointState	TokenNameIdentifier	 Endpoint State
(	TokenNameLPAREN	
hbState	TokenNameIdentifier	 hb State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
appStateSize	TokenNameIdentifier	 app State Size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
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
appStateSize	TokenNameIdentifier	 app State Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
addApplicationState	TokenNameIdentifier	 add Application State
(	TokenNameLPAREN	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
STATES	TokenNameIdentifier	 STATES
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
epState	TokenNameIdentifier	 ep State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
getHeartBeatState	TokenNameIdentifier	 get Heart Beat State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
applicationState	TokenNameIdentifier	 application State
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
