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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
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
public	TokenNamepublic	
class	TokenNameclass	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
extends	TokenNameextends	
AbstractThreadUnsafeSortedColumns	TokenNameIdentifier	 Abstract Thread Unsafe Sorted Columns
implements	TokenNameimplements	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
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
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
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
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
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
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
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
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
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
/* * If we find an old column that has the same name * the ask it to resolve itself else add the new column */	TokenNameCOMMENT_BLOCK	 If we find an old column that has the same name the ask it to resolve itself else add the new column 
public	TokenNamepublic	
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
// this is a slightly unusual way to structure this; a more natural way is shown in ThreadSafeSortedColumns, 	TokenNameCOMMENT_LINE	this is a slightly unusual way to structure this; a more natural way is shown in ThreadSafeSortedColumns, 
// but TreeMap lacks putAbsent. Rather than split it into a "get, then put" check, we do it as follows, 	TokenNameCOMMENT_LINE	but TreeMap lacks putAbsent. Rather than split it into a "get, then put" check, we do it as follows, 
// which saves the extra "get" in the no-conflict case [for both normal and super columns], 	TokenNameCOMMENT_LINE	which saves the extra "get" in the no-conflict case [for both normal and super columns], 
// in exchange for a re-put in the SuperColumn case. 	TokenNameCOMMENT_LINE	in exchange for a re-put in the SuperColumn case. 
IColumn	TokenNameIdentifier	 I Column
oldColumn	TokenNameIdentifier	 old Column
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
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
return	TokenNamereturn	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// since oldColumn is where we've been accumulating results, it's usually going to be faster to 	TokenNameCOMMENT_LINE	since oldColumn is where we've been accumulating results, it's usually going to be faster to 
// add the new one to the old, then place old back in the Map, rather than copy the old contents 	TokenNameCOMMENT_LINE	add the new one to the old, then place old back in the Map, rather than copy the old contents 
// into the new Map entry. 	TokenNameCOMMENT_LINE	into the new Map entry. 
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
oldColumn	TokenNameIdentifier	 old Column
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
// calculate reconciled col from old (existing) col and new col 	TokenNameCOMMENT_LINE	calculate reconciled col from old (existing) col and new col 
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
reconciledColumn	TokenNameIdentifier	 reconciled Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// we don't use this for memtables, so we don't bother computing size 	TokenNameCOMMENT_LINE	we don't use this for memtables, so we don't bother computing size 
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * We need to go through each column in the column container and resolve it before adding */	TokenNameCOMMENT_JAVADOC	 We need to go through each column in the column container and resolve it before adding 
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
// We are not supposed to put the newColumn is either there was not 	TokenNameCOMMENT_LINE	We are not supposed to put the newColumn is either there was not 
// column or the column was not equal to oldColumn (to be coherent 	TokenNameCOMMENT_LINE	column or the column was not equal to oldColumn (to be coherent 
// with other implementation). We optimize for the common case where 	TokenNameCOMMENT_LINE	with other implementation). We optimize for the common case where 
// oldColumn do is present though. 	TokenNameCOMMENT_LINE	oldColumn do is present though. 
IColumn	TokenNameIdentifier	 I Column
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newColumn	TokenNameIdentifier	 new Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
getColumnNames	TokenNameIdentifier	 get Column Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
navigableKeySet	TokenNameIdentifier	 navigable Key Set
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
}	TokenNameRBRACE	
