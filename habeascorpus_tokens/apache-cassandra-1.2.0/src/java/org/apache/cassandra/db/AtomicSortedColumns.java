/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
*	TokenNameMULTIPLY	
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
stanford	TokenNameIdentifier	 stanford
.	TokenNameDOT	
ppl	TokenNameIdentifier	 ppl
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ColumnSlice	TokenNameIdentifier	 Column Slice
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
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
Allocator	TokenNameIdentifier	 Allocator
;	TokenNameSEMICOLON	
/** * A thread-safe and atomic ISortedColumns implementation. * Operations (in particular addAll) on this implemenation are atomic and * isolated (in the sense of ACID). Typically a addAll is guaranteed that no * other thread can see the state where only parts but not all columns have * been added. * * The implementation uses snaptree (https://github.com/nbronson/snaptree), * and in particular it's copy-on-write clone operation to achieve its * atomicity guarantee. * * WARNING: removing element through getSortedColumns().iterator() is *not* * isolated of other operations and could actually be fully ignored in the * face of a concurrent. Don't use it unless in a non-concurrent context. * * TODO: check the snaptree license make it ok to use */	TokenNameCOMMENT_JAVADOC	 A thread-safe and atomic ISortedColumns implementation. Operations (in particular addAll) on this implemenation are atomic and isolated (in the sense of ACID). Typically a addAll is guaranteed that no other thread can see the state where only parts but not all columns have been added. * The implementation uses snaptree (https://github.com/nbronson/snaptree), and in particular it's copy-on-write clone operation to achieve its atomicity guarantee. * WARNING: removing element through getSortedColumns().iterator() is *not* isolated of other operations and could actually be fully ignored in the face of a concurrent. Don't use it unless in a non-concurrent context. * TODO: check the snaptree license make it ok to use 
public	TokenNamepublic	
class	TokenNameclass	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
implements	TokenNameimplements	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
Holder	TokenNameIdentifier	 Holder
>	TokenNameGREATER	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
insertReversed	TokenNameIdentifier	 insert Reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
fromSorted	TokenNameIdentifier	 from Sorted
(	TokenNameLPAREN	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
sortedMap	TokenNameIdentifier	 sorted Map
,	TokenNameCOMMA	
boolean	TokenNameboolean	
insertReversed	TokenNameIdentifier	 insert Reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
sortedMap	TokenNameIdentifier	 sorted Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
Holder	TokenNameIdentifier	 Holder
holder	TokenNameIdentifier	 holder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
Holder	TokenNameIdentifier	 Holder
>	TokenNameGREATER	
(	TokenNameLPAREN	
holder	TokenNameIdentifier	 holder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AtomicSortedColumns	TokenNameIdentifier	 Atomic Sorted Columns
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DeletionInfo	TokenNameIdentifier	 Deletion Info
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Keeping deletion info for max markedForDeleteAt value 	TokenNameCOMMENT_LINE	Keeping deletion info for max markedForDeleteAt value 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
newDelInfo	TokenNameIdentifier	 new Del Info
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newDelInfo	TokenNameIdentifier	 new Del Info
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
||	TokenNameOR_OR	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
newDelInfo	TokenNameIdentifier	 new Del Info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDeletionInfo	TokenNameIdentifier	 set Deletion Info
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
newInfo	TokenNameIdentifier	 new Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
newInfo	TokenNameIdentifier	 new Info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
maybeResetDeletionTimes	TokenNameIdentifier	 maybe Reset Deletion Times
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
purgedInfo	TokenNameIdentifier	 purged Info
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
.	TokenNameDOT	
purge	TokenNameIdentifier	 purge
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
purgedInfo	TokenNameIdentifier	 purged Info
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
||	TokenNameOR_OR	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
LIVE	TokenNameIdentifier	 LIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
.	TokenNameDOT	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
nullUpdater	TokenNameIdentifier	 null Updater
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
transformation	TokenNameIdentifier	 transformation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAllWithSizeDelta	TokenNameIdentifier	 add All With Size Delta
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
transformation	TokenNameIdentifier	 transformation
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
nullUpdater	TokenNameIdentifier	 null Updater
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
addAllWithSizeDelta	TokenNameIdentifier	 add All With Size Delta
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
transformation	TokenNameIdentifier	 transformation
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
Updater	TokenNameIdentifier	 Updater
indexer	TokenNameIdentifier	 indexer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * This operation needs to atomicity and isolation. To that end, we * add the new column to a copy of the map (a cheap O(1) snapTree * clone) and atomically compare and swap when everything has been * added. Of course, we must not forget to update the deletion times * too. * In case we are adding a lot of columns, failing the final compare * and swap could be expensive. To mitigate, we check we haven't been * beaten by another thread after every column addition. If we have, * we bail early, avoiding unnecessary work if possible. */	TokenNameCOMMENT_BLOCK	 This operation needs to atomicity and isolation. To that end, we add the new column to a copy of the map (a cheap O(1) snapTree clone) and atomically compare and swap when everything has been added. Of course, we must not forget to update the deletion times too. In case we are adding a lot of columns, failing the final compare and swap could be expensive. To mitigate, we check we haven't been beaten by another thread after every column addition. If we have, we bail early, avoiding unnecessary work if possible. 
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
long	TokenNamelong	
sizeDelta	TokenNameIdentifier	 size Delta
;	TokenNameSEMICOLON	
main_loop	TokenNameIdentifier	 main loop
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
sizeDelta	TokenNameIdentifier	 size Delta
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
newDelInfo	TokenNameIdentifier	 new Del Info
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDelInfo	TokenNameIdentifier	 new Del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sizeDelta	TokenNameIdentifier	 size Delta
+=	TokenNamePLUS_EQUAL	
modified	TokenNameIdentifier	 modified
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
transformation	TokenNameIdentifier	 transformation
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
indexer	TokenNameIdentifier	 indexer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bail early if we know we've been beaten 	TokenNameCOMMENT_LINE	bail early if we know we've been beaten 
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
continue	TokenNamecontinue	
main_loop	TokenNameIdentifier	 main loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sizeDelta	TokenNameIdentifier	 size Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
newColumn	TokenNameIdentifier	 new Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newColumn	TokenNameIdentifier	 new Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
replaced	TokenNameIdentifier	 replaced
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaced	TokenNameIdentifier	 replaced
=	TokenNameEQUAL	
modified	TokenNameIdentifier	 modified
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
newColumn	TokenNameIdentifier	 new Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
replaced	TokenNameIdentifier	 replaced
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeColumn	TokenNameIdentifier	 remove Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Holder	TokenNameIdentifier	 Holder
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
getColumnNames	TokenNameIdentifier	 get Column Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getReverseSortedColumns	TokenNameIdentifier	 get Reverse Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
descendingMap	TokenNameIdentifier	 descending Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEstimatedColumnCount	TokenNameIdentifier	 get Estimated Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ColumnSlice	TokenNameIdentifier	 Column Slice
.	TokenNameDOT	
NavigableMapIterator	TokenNameIdentifier	 Navigable Map Iterator
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
reverseIterator	TokenNameIdentifier	 reverse Iterator
(	TokenNameLPAREN	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ColumnSlice	TokenNameIdentifier	 Column Slice
.	TokenNameDOT	
NavigableMapIterator	TokenNameIdentifier	 Navigable Map Iterator
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
descendingMap	TokenNameIdentifier	 descending Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isInsertReversed	TokenNameIdentifier	 is Insert Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
final	TokenNamefinal	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DeletionInfo	TokenNameIdentifier	 Deletion Info
deletionInfo	TokenNameIdentifier	 deletion Info
;	TokenNameSEMICOLON	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
LIVE	TokenNameIdentifier	 LIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
LIVE	TokenNameIdentifier	 LIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
DeletionInfo	TokenNameIdentifier	 Deletion Info
deletionInfo	TokenNameIdentifier	 deletion Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
=	TokenNameEQUAL	
deletionInfo	TokenNameIdentifier	 deletion Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
newMap	TokenNameIdentifier	 new Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
deletionInfo	TokenNameIdentifier	 deletion Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There is no point in cloning the underlying map to clear it 	TokenNameCOMMENT_LINE	There is no point in cloning the underlying map to clear it 
// afterwards. 	TokenNameCOMMENT_LINE	afterwards. 
Holder	TokenNameIdentifier	 Holder
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
new	TokenNamenew	
SnapTreeMap	TokenNameIdentifier	 Snap Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
deletionInfo	TokenNameIdentifier	 deletion Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
Updater	TokenNameIdentifier	 Updater
indexer	TokenNameIdentifier	 indexer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
oldColumn	TokenNameIdentifier	 old Column
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexer	TokenNameIdentifier	 indexer
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
long	TokenNamelong	
previousSize	TokenNameIdentifier	 previous Size
=	TokenNameEQUAL	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
oldColumn	TokenNameIdentifier	 old Column
)	TokenNameRPAREN	
.	TokenNameDOT	
putColumn	TokenNameIdentifier	 put Column
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
previousSize	TokenNameIdentifier	 previous Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
reconciledColumn	TokenNameIdentifier	 reconciled Column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
reconcile	TokenNameIdentifier	 reconcile
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
reconciledColumn	TokenNameIdentifier	 reconciled Column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for memtable updates we only care about oldcolumn, reconciledcolumn, but when compacting 	TokenNameCOMMENT_LINE	for memtable updates we only care about oldcolumn, reconciledcolumn, but when compacting 
// we need to make sure we update indexes no matter the order we merge 	TokenNameCOMMENT_LINE	we need to make sure we update indexes no matter the order we merge 
if	TokenNameif	
(	TokenNameLPAREN	
reconciledColumn	TokenNameIdentifier	 reconciled Column
==	TokenNameEQUAL_EQUAL	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
indexer	TokenNameIdentifier	 indexer
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
reconciledColumn	TokenNameIdentifier	 reconciled Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
indexer	TokenNameIdentifier	 indexer
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
reconciledColumn	TokenNameIdentifier	 reconciled Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reconciledColumn	TokenNameIdentifier	 reconciled Column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We failed to replace column due to a concurrent update or a concurrent removal. Keep trying. 	TokenNameCOMMENT_LINE	We failed to replace column due to a concurrent update or a concurrent removal. Keep trying. 
// (Currently, concurrent removal should not happen (only updates), but let us support that anyway.) 	TokenNameCOMMENT_LINE	(Currently, concurrent removal should not happen (only updates), but let us support that anyway.) 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
toRetain	TokenNameIdentifier	 to Retain
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
retain	TokenNameIdentifier	 retain
=	TokenNameEQUAL	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
retain	TokenNameIdentifier	 retain
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
retain	TokenNameIdentifier	 retain
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
retain	TokenNameIdentifier	 retain
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
retain	TokenNameIdentifier	 retain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
retain	TokenNameIdentifier	 retain
=	TokenNameEQUAL	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// c > 0 	TokenNameCOMMENT_LINE	c > 0 
{	TokenNameLBRACE	
retain	TokenNameIdentifier	 retain
=	TokenNameEQUAL	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
toRetain	TokenNameIdentifier	 to Retain
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
