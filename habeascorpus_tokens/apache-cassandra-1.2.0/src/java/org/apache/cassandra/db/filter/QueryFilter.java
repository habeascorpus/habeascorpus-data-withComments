/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
IdentityQueryFilter	TokenNameIdentifier	 Identity Query Filter
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
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
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
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
FileDataInput	TokenNameIdentifier	 File Data Input
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
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
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
MergeIterator	TokenNameIdentifier	 Merge Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
QueryFilter	TokenNameIdentifier	 Query Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
superFilter	TokenNameIdentifier	 super Filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
superFilter	TokenNameIdentifier	 super Filter
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
superColumnName	TokenNameIdentifier	 super Column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
superColumnName	TokenNameIdentifier	 super Column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
Memtable	TokenNameIdentifier	 Memtable
memtable	TokenNameIdentifier	 memtable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
memtable	TokenNameIdentifier	 memtable
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
cf	TokenNameIdentifier	 cf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
superColumnName	TokenNameIdentifier	 super Column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
superFilter	TokenNameIdentifier	 super Filter
.	TokenNameDOT	
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO move gcBefore into a field 	TokenNameCOMMENT_LINE	TODO move gcBefore into a field 
public	TokenNamepublic	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
superColumnName	TokenNameIdentifier	 super Column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
superFilter	TokenNameIdentifier	 super Filter
.	TokenNameDOT	
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
indexEntry	TokenNameIdentifier	 index Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
superColumnName	TokenNameIdentifier	 super Column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
superFilter	TokenNameIdentifier	 super Filter
.	TokenNameDOT	
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
collateOnDiskAtom	TokenNameIdentifier	 collate On Disk Atom
(	TokenNameLPAREN	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>>	TokenNameRIGHT_SHIFT	
toCollate	TokenNameIdentifier	 to Collate
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
filteredIterators	TokenNameIdentifier	 filtered Iterators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
toCollate	TokenNameIdentifier	 to Collate
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
:	TokenNameCOLON	
toCollate	TokenNameIdentifier	 to Collate
)	TokenNameRPAREN	
filteredIterators	TokenNameIdentifier	 filtered Iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gatherTombstones	TokenNameIdentifier	 gather Tombstones
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collateColumns	TokenNameIdentifier	 collate Columns
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
filteredIterators	TokenNameIdentifier	 filtered Iterators
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO move gcBefore into a field 	TokenNameCOMMENT_LINE	TODO move gcBefore into a field 
public	TokenNamepublic	
void	TokenNamevoid	
collateColumns	TokenNameIdentifier	 collate Columns
(	TokenNameLPAREN	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
toCollate	TokenNameIdentifier	 to Collate
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
topLevelFilter	TokenNameIdentifier	 top Level Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
superFilter	TokenNameIdentifier	 super Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
filter	TokenNameIdentifier	 filter
:	TokenNameCOLON	
superFilter	TokenNameIdentifier	 super Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
fcomp	TokenNameIdentifier	 fcomp
=	TokenNameEQUAL	
topLevelFilter	TokenNameIdentifier	 top Level Filter
.	TokenNameDOT	
getColumnComparator	TokenNameIdentifier	 get Column Comparator
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// define a 'reduced' iterator that merges columns w/ the same name, which 	TokenNameCOMMENT_LINE	define a 'reduced' iterator that merges columns w/ the same name, which 
// greatly simplifies computing liveColumns in the presence of tombstones. 	TokenNameCOMMENT_LINE	greatly simplifies computing liveColumns in the presence of tombstones. 
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
=	TokenNameEQUAL	
new	TokenNamenew	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
curCF	TokenNameIdentifier	 cur CF
=	TokenNameEQUAL	
returnCF	TokenNameIdentifier	 return CF
.	TokenNameDOT	
cloneMeShallow	TokenNameIdentifier	 clone Me Shallow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is the first super column we add, we must clone it since other super column may modify 	TokenNameCOMMENT_LINE	If it is the first super column we add, we must clone it since other super column may modify 
// it otherwise and it could be aliased in a memtable somewhere. We'll also don't have to care about what 	TokenNameCOMMENT_LINE	it otherwise and it could be aliased in a memtable somewhere. We'll also don't have to care about what 
// consumers make of the result (for instance CFS.getColumnFamily() call removeDeleted() on the 	TokenNameCOMMENT_LINE	consumers make of the result (for instance CFS.getColumnFamily() call removeDeleted() on the 
// result which removes column; which shouldn't be done on the original super column). 	TokenNameCOMMENT_LINE	result which removes column; which shouldn't be done on the original super column). 
assert	TokenNameassert	
current	TokenNameIdentifier	 current
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
IColumn	TokenNameIdentifier	 I Column
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
superFilter	TokenNameIdentifier	 super Filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// filterSuperColumn only looks at immediate parent (the supercolumn) when determining if a subcolumn 	TokenNameCOMMENT_LINE	filterSuperColumn only looks at immediate parent (the supercolumn) when determining if a subcolumn 
// is still live, i.e., not shadowed by the parent's tombstone. so, bump it up temporarily to the tombstone 	TokenNameCOMMENT_LINE	is still live, i.e., not shadowed by the parent's tombstone. so, bump it up temporarily to the tombstone 
// time of the cf, if that is greater. 	TokenNameCOMMENT_LINE	time of the cf, if that is greater. 
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
filterSuperColumn	TokenNameIdentifier	 filter Super Column
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
setDeletionInfo	TokenNameIdentifier	 set Deletion Info
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset sc tombstone time to what it should be 	TokenNameCOMMENT_LINE	reset sc tombstone time to what it should be 
}	TokenNameRBRACE	
curCF	TokenNameIdentifier	 cur CF
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
reduced	TokenNameIdentifier	 reduced
=	TokenNameEQUAL	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
toCollate	TokenNameIdentifier	 to Collate
,	TokenNameCOMMA	
fcomp	TokenNameIdentifier	 fcomp
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevelFilter	TokenNameIdentifier	 top Level Filter
.	TokenNameDOT	
collectReducedColumns	TokenNameIdentifier	 collect Reduced Columns
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
reduced	TokenNameIdentifier	 reduced
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an iterator of on disk atom, returns an iterator that filters the tombstone range * markers adding them to {@code returnCF} and returns the normal column. */	TokenNameCOMMENT_JAVADOC	 Given an iterator of on disk atom, returns an iterator that filters the tombstone range markers adding them to {@code returnCF} and returns the normal column. 
public	TokenNamepublic	
static	TokenNamestatic	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
gatherTombstones	TokenNameIdentifier	 gather Tombstones
(	TokenNameLPAREN	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
final	TokenNamefinal	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
IColumn	TokenNameIdentifier	 I Column
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
atom	TokenNameIdentifier	 atom
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
atom	TokenNameIdentifier	 atom
instanceof	TokenNameinstanceof	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
atom	TokenNameIdentifier	 atom
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
returnCF	TokenNameIdentifier	 return CF
.	TokenNameDOT	
addAtom	TokenNameIdentifier	 add Atom
(	TokenNameLPAREN	
atom	TokenNameIdentifier	 atom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamilyName	TokenNameIdentifier	 get Column Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
columnFamilyName	TokenNameIdentifier	 column Family Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isRelevant	TokenNameIdentifier	 is Relevant
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the column itself must be not gc-able (it is live, or a still relevant tombstone, or has live subcolumns), (1) 	TokenNameCOMMENT_LINE	the column itself must be not gc-able (it is live, or a still relevant tombstone, or has live subcolumns), (1) 
// and if its container is deleted, the column must be changed more recently than the container tombstone (2) 	TokenNameCOMMENT_LINE	and if its container is deleted, the column must be changed more recently than the container tombstone (2) 
// (since otherwise, the only thing repair cares about is the container tombstone) 	TokenNameCOMMENT_LINE	(since otherwise, the only thing repair cares about is the container tombstone) 
long	TokenNamelong	
maxChange	TokenNameIdentifier	 max Change
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
mostRecentNonGCableChangeAt	TokenNameIdentifier	 most Recent Non G Cable Change At
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
gcBefore	TokenNameIdentifier	 gc Before
||	TokenNameOR_OR	
maxChange	TokenNameIdentifier	 max Change
>	TokenNameGREATER	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getMarkedForDeleteAt	TokenNameIdentifier	 get Marked For Delete At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// (1) 	TokenNameCOMMENT_LINE	(1) 
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxChange	TokenNameIdentifier	 max Change
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (2) 	TokenNameCOMMENT_LINE	(2) 
}	TokenNameRBRACE	
/** * @return a QueryFilter object to satisfy the given slice criteria: * @param key the row to slice * @param path path to the level to slice at (CF or SuperColumn) * @param start column to start slice at, inclusive; empty for "the first column" * @param finish column to stop slice at, inclusive; empty for "the last column" * @param reversed true to start with the largest column (as determined by configured sort order) instead of smallest * @param limit maximum number of non-deleted columns to return */	TokenNameCOMMENT_JAVADOC	 @return a QueryFilter object to satisfy the given slice criteria: @param key the row to slice @param path path to the level to slice at (CF or SuperColumn) @param start column to start slice at, inclusive; empty for "the first column" @param finish column to stop slice at, inclusive; empty for "the last column" @param reversed true to start with the largest column (as determined by configured sort order) instead of smallest @param limit maximum number of non-deleted columns to return 
public	TokenNamepublic	
static	TokenNamestatic	
QueryFilter	TokenNameIdentifier	 Query Filter
getSliceFilter	TokenNameIdentifier	 get Slice Filter
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
new	TokenNamenew	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return a QueryFilter object that includes every column in the row. * This is dangerous on large rows; avoid except for test code. */	TokenNameCOMMENT_JAVADOC	 return a QueryFilter object that includes every column in the row. This is dangerous on large rows; avoid except for test code. 
public	TokenNamepublic	
static	TokenNamestatic	
QueryFilter	TokenNameIdentifier	 Query Filter
getIdentityFilter	TokenNameIdentifier	 get Identity Filter
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
new	TokenNamenew	
IdentityQueryFilter	TokenNameIdentifier	 Identity Query Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a QueryFilter object that will return columns matching the given names * @param key the row to slice * @param path path to the level to slice at (CF or SuperColumn) * @param columns the column names to restrict the results to, sorted in comparator order */	TokenNameCOMMENT_JAVADOC	 @return a QueryFilter object that will return columns matching the given names @param key the row to slice @param path path to the level to slice at (CF or SuperColumn) @param columns the column names to restrict the results to, sorted in comparator order 
public	TokenNamepublic	
static	TokenNamestatic	
QueryFilter	TokenNameIdentifier	 Query Filter
getNamesFilter	TokenNameIdentifier	 get Names Filter
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
new	TokenNamenew	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convenience method for creating a name filter matching a single column */	TokenNameCOMMENT_JAVADOC	 convenience method for creating a name filter matching a single column 
public	TokenNamepublic	
static	TokenNamestatic	
QueryFilter	TokenNameIdentifier	 Query Filter
getNamesFilter	TokenNameIdentifier	 get Names Filter
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
new	TokenNamenew	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
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
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"(key="	TokenNameStringLiteral	(key=
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
", path="	TokenNameStringLiteral	, path=
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
", filter="	TokenNameStringLiteral	, filter=
+	TokenNamePLUS	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
superFilter	TokenNameIdentifier	 super Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
", superFilter="	TokenNameStringLiteral	, superFilter=
+	TokenNamePLUS	
superFilter	TokenNameIdentifier	 super Filter
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
