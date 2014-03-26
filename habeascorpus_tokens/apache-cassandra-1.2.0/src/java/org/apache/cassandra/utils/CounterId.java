/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
AtomicReference	TokenNameIdentifier	 Atomic Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CopyOnWriteArrayList	TokenNameIdentifier	 Copy On Write Array List
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
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
CounterColumn	TokenNameIdentifier	 Counter Column
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
SystemTable	TokenNameIdentifier	 System Table
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CounterId	TokenNameIdentifier	 Counter Id
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
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
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LENGTH	TokenNameIdentifier	 LENGTH
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// we assume a fixed length size for all CounterIds 	TokenNameCOMMENT_LINE	we assume a fixed length size for all CounterIds 
// Lazy holder because this opens the system table and we want to avoid 	TokenNameCOMMENT_LINE	Lazy holder because this opens the system table and we want to avoid 
// having this triggered during class initialization 	TokenNameCOMMENT_LINE	having this triggered during class initialization 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LocalIds	TokenNameIdentifier	 Local Ids
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
LocalCounterIdHistory	TokenNameIdentifier	 Local Counter Id History
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
LocalCounterIdHistory	TokenNameIdentifier	 Local Counter Id History
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
LocalCounterIdHistory	TokenNameIdentifier	 Local Counter Id History
localIds	TokenNameIdentifier	 local Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LocalIds	TokenNameIdentifier	 Local Ids
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CounterId	TokenNameIdentifier	 Counter Id
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localIds	TokenNameIdentifier	 local Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Renew the local counter id. * To use only when this strictly necessary, as using this will make all * counter context grow with time. */	TokenNameCOMMENT_JAVADOC	 Renew the local counter id. To use only when this strictly necessary, as using this will make all counter context grow with time. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
timestampMicros	TokenNameIdentifier	 timestamp Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
long	TokenNamelong	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localIds	TokenNameIdentifier	 local Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
renewCurrent	TokenNameIdentifier	 renew Current
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the list of old local counter id of this node. * It is guaranteed that the returned list is sorted by growing counter id * (and hence the first item will be the oldest counter id for this host) */	TokenNameCOMMENT_JAVADOC	 Return the list of old local counter id of this node. It is guaranteed that the returned list is sorted by growing counter id (and hence the first item will be the oldest counter id for this host) 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
getOldLocalCounterIds	TokenNameIdentifier	 get Old Local Counter Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localIds	TokenNameIdentifier	 local Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
olds	TokenNameIdentifier	 olds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Function for test purposes, do not use otherwise. * Pack an int in a valid CounterId so that the resulting ids respects the * numerical ordering. Used for creating handcrafted but easy to * understand contexts in unit tests (see CounterContextTest). */	TokenNameCOMMENT_JAVADOC	 Function for test purposes, do not use otherwise. Pack an int in a valid CounterId so that the resulting ids respects the numerical ordering. Used for creating handcrafted but easy to understand contexts in unit tests (see CounterContextTest). 
public	TokenNamepublic	
static	TokenNamestatic	
CounterId	TokenNameIdentifier	 Counter Id
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
lowBits	TokenNameIdentifier	 low Bits
=	TokenNameEQUAL	
0xC000000000000000L	TokenNameLongLiteral	
|	TokenNameOR	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
putLong	TokenNameIdentifier	 put Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
putLong	TokenNameIdentifier	 put Long
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lowBits	TokenNameIdentifier	 low Bits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * For performance reasons, this function interns the provided ByteBuffer. */	TokenNameCOMMENT_BLOCK	 For performance reasons, this function interns the provided ByteBuffer. 
public	TokenNamepublic	
static	TokenNamestatic	
CounterId	TokenNameIdentifier	 Counter Id
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CounterId	TokenNameIdentifier	 Counter Id
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
dup	TokenNameIdentifier	 dup
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dup	TokenNameIdentifier	 dup
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dup	TokenNameIdentifier	 dup
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
dup	TokenNameIdentifier	 dup
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
dup	TokenNameIdentifier	 dup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CounterId	TokenNameIdentifier	 Counter Id
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"A CounterId representation is exactly "	TokenNameStringLiteral	A CounterId representation is exactly 
+	TokenNamePLUS	
LENGTH	TokenNameIdentifier	 LENGTH
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CounterId	TokenNameIdentifier	 Counter Id
generate	TokenNameIdentifier	 generate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * For performance reasons, this function returns a reference to the internal ByteBuffer. Clients not modify the * result of this function. */	TokenNameCOMMENT_BLOCK	 For performance reasons, this function returns a reference to the internal ByteBuffer. Clients not modify the result of this function. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocalId	TokenNameIdentifier	 is Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareSubArrays	TokenNameIdentifier	 compare Sub Arrays
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
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
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getUUID	TokenNameIdentifier	 get UUID
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
otherId	TokenNameIdentifier	 other Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherId	TokenNameIdentifier	 other Id
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OneShotRenewer	TokenNameIdentifier	 One Shot Renewer
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
renewed	TokenNameIdentifier	 renewed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CounterId	TokenNameIdentifier	 Counter Id
initialId	TokenNameIdentifier	 initial Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneShotRenewer	TokenNameIdentifier	 One Shot Renewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renewed	TokenNameIdentifier	 renewed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
initialId	TokenNameIdentifier	 initial Id
=	TokenNameEQUAL	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
maybeRenew	TokenNameIdentifier	 maybe Renew
(	TokenNameLPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
renewed	TokenNameIdentifier	 renewed
&&	TokenNameAND_AND	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
hasCounterId	TokenNameIdentifier	 has Counter Id
(	TokenNameLPAREN	
initialId	TokenNameIdentifier	 initial Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renewed	TokenNameIdentifier	 renewed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LocalCounterIdHistory	TokenNameIdentifier	 Local Counter Id History
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
>	TokenNameGREATER	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
olds	TokenNameIdentifier	 olds
;	TokenNameSEMICOLON	
LocalCounterIdHistory	TokenNameIdentifier	 Local Counter Id History
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
getCurrentLocalCounterId	TokenNameIdentifier	 get Current Local Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no recorded local counter id, generating a new one and saving it 	TokenNameCOMMENT_LINE	no recorded local counter id, generating a new one and saving it 
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
generate	TokenNameIdentifier	 generate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"No saved local counter id, using newly generated: {}"	TokenNameStringLiteral	No saved local counter id, using newly generated: {}
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
writeCurrentLocalCounterId	TokenNameIdentifier	 write Current Local Counter Id
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
timestampMicros	TokenNameIdentifier	 timestamp Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
>	TokenNameGREATER	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
olds	TokenNameIdentifier	 olds
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArrayList	TokenNameIdentifier	 Copy On Write Array List
<	TokenNameLESS	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Saved local counter id: {}"	TokenNameStringLiteral	Saved local counter id: {}
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
>	TokenNameGREATER	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
olds	TokenNameIdentifier	 olds
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArrayList	TokenNameIdentifier	 Copy On Write Array List
<	TokenNameLESS	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
(	TokenNameLPAREN	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
getOldLocalCounterIds	TokenNameIdentifier	 get Old Local Counter Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
renewCurrent	TokenNameIdentifier	 renew Current
(	TokenNameLPAREN	
long	TokenNamelong	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
newCounterId	TokenNameIdentifier	 new Counter Id
=	TokenNameEQUAL	
generate	TokenNameIdentifier	 generate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
writeCurrentLocalCounterId	TokenNameIdentifier	 write Current Local Counter Id
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
newCounterId	TokenNameIdentifier	 new Counter Id
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
newCounterId	TokenNameIdentifier	 new Counter Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
olds	TokenNameIdentifier	 olds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
otherRecord	TokenNameIdentifier	 other Record
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherRecord	TokenNameIdentifier	 other Record
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
timestamp	TokenNameIdentifier	 timestamp
==	TokenNameEQUAL_EQUAL	
otherRecord	TokenNameIdentifier	 other Record
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"(%s, %d)"	TokenNameStringLiteral	(%s, %d)
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
