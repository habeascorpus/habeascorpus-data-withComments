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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
github	TokenNameIdentifier	 github
.	TokenNameDOT	
jamm	TokenNameIdentifier	 jamm
.	TokenNameDOT	
MemoryMeter	TokenNameIdentifier	 Memory Meter
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
EntryWeigher	TokenNameIdentifier	 Entry Weigher
;	TokenNameSEMICOLON	
/** Wrapper so CLHM can implement ICache interface. * (this is what you get for making library classes final.) */	TokenNameCOMMENT_JAVADOC	 Wrapper so CLHM can implement ICache interface. (this is what you get for making library classes final.) 
public	TokenNamepublic	
class	TokenNameclass	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
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
public	TokenNamepublic	
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
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
MemoryMeter	TokenNameIdentifier	 Memory Meter
meter	TokenNameIdentifier	 meter
=	TokenNameEQUAL	
new	TokenNamenew	
MemoryMeter	TokenNameIdentifier	 Memory Meter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
omitSharedBufferOverhead	TokenNameIdentifier	 omit Shared Buffer Overhead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
(	TokenNameLPAREN	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize a cache with initial capacity with weightedCapacity */	TokenNameCOMMENT_JAVADOC	 Initialize a cache with initial capacity with weightedCapacity 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
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
EntryWeigher	TokenNameIdentifier	 Entry Weigher
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
entryWeiger	TokenNameIdentifier	 entry Weiger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedHashMap	TokenNameIdentifier	 Concurrent Linked Hash Map
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
weigher	TokenNameIdentifier	 weigher
(	TokenNameLPAREN	
entryWeiger	TokenNameIdentifier	 entry Weiger
)	TokenNameRPAREN	
.	TokenNameDOT	
maximumWeightedCapacity	TokenNameIdentifier	 maximum Weighted Capacity
(	TokenNameLPAREN	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
)	TokenNameRPAREN	
.	TokenNameDOT	
concurrencyLevel	TokenNameIdentifier	 concurrency Level
(	TokenNameLPAREN	
DEFAULT_CONCURENCY_LEVEL	TokenNameIdentifier	 DEFAULT  CONCURENCY  LEVEL
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
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
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
weightedCapacity	TokenNameIdentifier	 weighted Capacity
,	TokenNameCOMMA	
new	TokenNamenew	
EntryWeigher	TokenNameIdentifier	 Entry Weigher
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
weightOf	TokenNameIdentifier	 weight Of
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
meter	TokenNameIdentifier	 meter
.	TokenNameDOT	
measureDeep	TokenNameIdentifier	 measure Deep
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
+	TokenNamePLUS	
meter	TokenNameIdentifier	 meter
.	TokenNameDOT	
measureDeep	TokenNameIdentifier	 measure Deep
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
"Serialized size cannot be more than 2GB/Integer.MAX_VALUE"	TokenNameStringLiteral	Serialized size cannot be more than 2GB/Integer.MAX_VALUE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
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
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
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
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
