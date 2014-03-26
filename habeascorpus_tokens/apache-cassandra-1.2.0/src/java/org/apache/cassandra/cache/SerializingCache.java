/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
googlecode	TokenNameIdentifier	 googlecode
.	TokenNameDOT	
concurrentlinkedhashmap	TokenNameIdentifier	 concurrentlinkedhashmap
.	TokenNameDOT	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
googlecode	TokenNameIdentifier	 googlecode
.	TokenNameDOT	
concurrentlinkedhashmap	TokenNameIdentifier	 concurrentlinkedhashmap
.	TokenNameDOT	
EvictionListener	TokenNameIdentifier	 Eviction Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
googlecode	TokenNameIdentifier	 googlecode
.	TokenNameDOT	
concurrentlinkedhashmap	TokenNameIdentifier	 concurrentlinkedhashmap
.	TokenNameDOT	
Weigher	TokenNameIdentifier	 Weigher
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
ISerializer	TokenNameIdentifier	 I Serializer
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
MemoryInputStream	TokenNameIdentifier	 Memory Input Stream
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
MemoryOutputStream	TokenNameIdentifier	 Memory Output Stream
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
vint	TokenNameIdentifier	 vint
.	TokenNameDOT	
EncodedDataInputStream	TokenNameIdentifier	 Encoded Data Input Stream
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
vint	TokenNameIdentifier	 vint
.	TokenNameDOT	
EncodedDataOutputStream	TokenNameIdentifier	 Encoded Data Output Stream
;	TokenNameSEMICOLON	
/** * Serializes cache values off-heap. */	TokenNameCOMMENT_JAVADOC	 Serializes cache values off-heap. 
public	TokenNamepublic	
class	TokenNameclass	
SerializingCache	TokenNameIdentifier	 Serializing Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
implements	TokenNameimplements	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
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
SerializingCache	TokenNameIdentifier	 Serializing Cache
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
TypeSizes	TokenNameIdentifier	 Type Sizes
ENCODED_TYPE_SIZES	TokenNameIdentifier	 ENCODED  TYPE  SIZES
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
VINT	TokenNameIdentifier	 VINT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CONCURENCY_LEVEL	TokenNameIdentifier	 DEFAULT  CONCURENCY  LEVEL
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SerializingCache	TokenNameIdentifier	 Serializing Cache
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
,	TokenNameCOMMA	
Weigher	TokenNameIdentifier	 Weigher
<	TokenNameLESS	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
weigher	TokenNameIdentifier	 weigher
,	TokenNameCOMMA	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
EvictionListener	TokenNameIdentifier	 Eviction Listener
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
new	TokenNamenew	
EvictionListener	TokenNameIdentifier	 Eviction Listener
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onEviction	TokenNameIdentifier	 on Eviction
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
weigher	TokenNameIdentifier	 weigher
(	TokenNameLPAREN	
weigher	TokenNameIdentifier	 weigher
)	TokenNameRPAREN	
.	TokenNameDOT	
maximumWeightedCapacity	TokenNameIdentifier	 maximum Weighted Capacity
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
.	TokenNameDOT	
concurrencyLevel	TokenNameIdentifier	 concurrency Level
(	TokenNameLPAREN	
DEFAULT_CONCURENCY_LEVEL	TokenNameIdentifier	 DEFAULT  CONCURENCY  LEVEL
)	TokenNameRPAREN	
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
SerializingCache	TokenNameIdentifier	 Serializing Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
,	TokenNameCOMMA	
Weigher	TokenNameIdentifier	 Weigher
<	TokenNameLESS	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
weigher	TokenNameIdentifier	 weigher
,	TokenNameCOMMA	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SerializingCache	TokenNameIdentifier	 Serializing Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
,	TokenNameCOMMA	
weigher	TokenNameIdentifier	 weigher
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
SerializingCache	TokenNameIdentifier	 Serializing Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
,	TokenNameCOMMA	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
,	TokenNameCOMMA	
new	TokenNamenew	
Weigher	TokenNameIdentifier	 Weigher
<	TokenNameLESS	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
weightOf	TokenNameIdentifier	 weight Of
(	TokenNameLPAREN	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
"Serialized size cannot be more than 2GB"	TokenNameStringLiteral	Serialized size cannot be more than 2GB
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
V	TokenNameIdentifier	 V
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
EncodedDataInputStream	TokenNameIdentifier	 Encoded Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
MemoryInputStream	TokenNameIdentifier	 Memory Input Stream
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Cannot fetch in memory data, we will failback to read from disk "	TokenNameStringLiteral	Cannot fetch in memory data, we will failback to read from disk 
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ENCODED_TYPE_SIZES	TokenNameIdentifier	 ENCODED  TYPE  SIZES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serializedSize	TokenNameIdentifier	 serialized Size
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unable to allocate "	TokenNameStringLiteral	Unable to allocate 
+	TokenNamePLUS	
serializedSize	TokenNameIdentifier	 serialized Size
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
freeableMemory	TokenNameIdentifier	 freeable Memory
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
freeableMemory	TokenNameIdentifier	 freeable Memory
=	TokenNameEQUAL	
new	TokenNamenew	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
(	TokenNameLPAREN	
serializedSize	TokenNameIdentifier	 serialized Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
new	TokenNamenew	
EncodedDataOutputStream	TokenNameIdentifier	 Encoded Data Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
MemoryOutputStream	TokenNameIdentifier	 Memory Output Stream
(	TokenNameLPAREN	
freeableMemory	TokenNameIdentifier	 freeable Memory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
freeableMemory	TokenNameIdentifier	 freeable Memory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCapacity	TokenNameIdentifier	 set Capacity
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
setCapacity	TokenNameIdentifier	 set Capacity
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
weightedSize	TokenNameIdentifier	 weighted Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
weightedSize	TokenNameIdentifier	 weighted Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
reference	TokenNameIdentifier	 reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// out of memory. never mind. 	TokenNameCOMMENT_LINE	out of memory. never mind. 
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// out of memory. never mind. 	TokenNameCOMMENT_LINE	out of memory. never mind. 
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// the new value was not put, we've uselessly allocated some memory, free it 	TokenNameCOMMENT_LINE	the new value was not put, we've uselessly allocated some memory, free it 
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
old	TokenNameIdentifier	 old
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
oldToReplace	TokenNameIdentifier	 old To Replace
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if there is no old value in our map, we fail 	TokenNameCOMMENT_LINE	if there is no old value in our map, we fail 
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// see if the old value matches the one we want to replace 	TokenNameCOMMENT_LINE	see if the old value matches the one we want to replace 
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// out of memory. never mind. 	TokenNameCOMMENT_LINE	out of memory. never mind. 
V	TokenNameIdentifier	 V
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
// reference old guy before de-serializing 	TokenNameCOMMENT_LINE	reference old guy before de-serializing 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
reference	TokenNameIdentifier	 reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// we have already freed hence noop. 	TokenNameCOMMENT_LINE	we have already freed hence noop. 
try	TokenNametry	
{	TokenNameLBRACE	
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
oldValue	TokenNameIdentifier	 old Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
oldToReplace	TokenNameIdentifier	 old To Replace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// so it will be eventually be cleaned 	TokenNameCOMMENT_LINE	so it will be eventually be cleaned 
else	TokenNameelse	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
success	TokenNameIdentifier	 success
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mem	TokenNameIdentifier	 mem
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
unreference	TokenNameIdentifier	 unreference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
hotKeySet	TokenNameIdentifier	 hot Key Set
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
descendingKeySetWithLimit	TokenNameIdentifier	 descending Key Set With Limit
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPutCopying	TokenNameIdentifier	 is Put Copying
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
