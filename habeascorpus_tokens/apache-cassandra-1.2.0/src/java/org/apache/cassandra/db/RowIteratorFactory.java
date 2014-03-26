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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
IColumnIteratorFactory	TokenNameIdentifier	 I Column Iterator Factory
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
LazyColumnIterator	TokenNameIdentifier	 Lazy Column Iterator
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
QueryFilter	TokenNameIdentifier	 Query Filter
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
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableScanner	TokenNameIdentifier	 SS Table Scanner
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
RowIteratorFactory	TokenNameIdentifier	 Row Iterator Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
COMPARE_BY_KEY	TokenNameIdentifier	 COMPARE  BY  KEY
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DecoratedKey	TokenNameIdentifier	 Decorated Key
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Get a row iterator over the provided memtables and sstables, between the provided keys * and filtered by the queryfilter. * @param memtables Memtables pending flush. * @param sstables SStables to scan through. * @param startWith Start at this key * @param stopAt Stop and this key * @param filter Used to decide which columns to pull out * @param cfs * @return A row iterator following all the given restrictions */	TokenNameCOMMENT_JAVADOC	 Get a row iterator over the provided memtables and sstables, between the provided keys and filtered by the queryfilter. @param memtables Memtables pending flush. @param sstables SStables to scan through. @param startWith Start at this key @param stopAt Stop and this key @param filter Used to decide which columns to pull out @param cfs @return A row iterator following all the given restrictions 
public	TokenNamepublic	
static	TokenNamestatic	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Memtable	TokenNameIdentifier	 Memtable
>	TokenNameGREATER	
memtables	TokenNameIdentifier	 memtables
,	TokenNameCOMMA	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
,	TokenNameCOMMA	
final	TokenNamefinal	
RowPosition	TokenNameIdentifier	 Row Position
startWith	TokenNameIdentifier	 start With
,	TokenNameCOMMA	
final	TokenNamefinal	
RowPosition	TokenNameIdentifier	 Row Position
stopAt	TokenNameIdentifier	 stop At
,	TokenNameCOMMA	
final	TokenNamefinal	
QueryFilter	TokenNameIdentifier	 Query Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fetch data from current memtable, historical memtables, and SSTables in the correct order. 	TokenNameCOMMENT_LINE	fetch data from current memtable, historical memtables, and SSTables in the correct order. 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>>	TokenNameRIGHT_SHIFT	
iterators	TokenNameIdentifier	 iterators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// memtables 	TokenNameCOMMENT_LINE	memtables 
for	TokenNamefor	
(	TokenNameLPAREN	
Memtable	TokenNameIdentifier	 Memtable
memtable	TokenNameIdentifier	 memtable
:	TokenNameCOLON	
memtables	TokenNameIdentifier	 memtables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterators	TokenNameIdentifier	 iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ConvertToColumnIterator	TokenNameIdentifier	 Convert To Column Iterator
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
memtable	TokenNameIdentifier	 memtable
.	TokenNameDOT	
getEntryIterator	TokenNameIdentifier	 get Entry Iterator
(	TokenNameLPAREN	
startWith	TokenNameIdentifier	 start With
,	TokenNameCOMMA	
stopAt	TokenNameIdentifier	 stop At
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
:	TokenNameCOLON	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SSTableScanner	TokenNameIdentifier	 SS Table Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getScanner	TokenNameIdentifier	 get Scanner
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
seekTo	TokenNameIdentifier	 seek To
(	TokenNameLPAREN	
startWith	TokenNameIdentifier	 start With
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterators	TokenNameIdentifier	 iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reduce rows from all sources into a single row 	TokenNameCOMMENT_LINE	reduce rows from all sources into a single row 
return	TokenNamereturn	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
iterators	TokenNameIdentifier	 iterators
,	TokenNameCOMMA	
COMPARE_BY_KEY	TokenNameIdentifier	 COMPARE  BY  KEY
,	TokenNameCOMMA	
new	TokenNamenew	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
,	TokenNameCOMMA	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getGcGraceSeconds	TokenNameIdentifier	 get Gc Grace Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
colIters	TokenNameIdentifier	 col Iters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnFamily	TokenNameIdentifier	 Column Family
returnCF	TokenNameIdentifier	 return CF
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
onKeyChange	TokenNameIdentifier	 on Key Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
returnCF	TokenNameIdentifier	 return CF
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
colIters	TokenNameIdentifier	 col Iters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
returnCF	TokenNameIdentifier	 return CF
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Row	TokenNameIdentifier	 Row
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First check if this row is in the rowCache. If it is we can skip the rest 	TokenNameCOMMENT_LINE	First check if this row is in the rowCache. If it is we can skip the rest 
ColumnFamily	TokenNameIdentifier	 Column Family
cached	TokenNameIdentifier	 cached
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getRawCachedRow	TokenNameIdentifier	 get Raw Cached Row
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cached	TokenNameIdentifier	 cached
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not cached: collate 	TokenNameCOMMENT_LINE	not cached: collate 
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
collateOnDiskAtom	TokenNameIdentifier	 collate On Disk Atom
(	TokenNameLPAREN	
returnCF	TokenNameIdentifier	 return CF
,	TokenNameCOMMA	
colIters	TokenNameIdentifier	 col Iters
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
QueryFilter	TokenNameIdentifier	 Query Filter
keyFilter	TokenNameIdentifier	 key Filter
=	TokenNameEQUAL	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnCF	TokenNameIdentifier	 return CF
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
filterColumnFamily	TokenNameIdentifier	 filter Column Family
(	TokenNameLPAREN	
cached	TokenNameIdentifier	 cached
,	TokenNameCOMMA	
keyFilter	TokenNameIdentifier	 key Filter
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Row	TokenNameIdentifier	 Row
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
returnCF	TokenNameIdentifier	 return CF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colIters	TokenNameIdentifier	 col Iters
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rv	TokenNameIdentifier	 rv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a ColumnIterator for a specific key in the memtable. */	TokenNameCOMMENT_JAVADOC	 Get a ColumnIterator for a specific key in the memtable. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ConvertToColumnIterator	TokenNameIdentifier	 Convert To Column Iterator
implements	TokenNameimplements	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
QueryFilter	TokenNameIdentifier	 Query Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConvertToColumnIterator	TokenNameIdentifier	 Convert To Column Iterator
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Note that when doing get_paged_slice, we reset the start of the queryFilter after we've fetched the * first row. This means that this iterator should not use in any way the filter to fetch a row before * we call next(). Which prevents us for using guava AbstractIterator. * This is obviously rather fragile and we should consider refactoring that code, but such refactor will go * deep into the storage engine code so this will have to do until then. */	TokenNameCOMMENT_BLOCK	 Note that when doing get_paged_slice, we reset the start of the queryFilter after we've fetched the first row. This means that this iterator should not use in any way the filter to fetch a row before we call next(). Which prevents us for using guava AbstractIterator. This is obviously rather fragile and we should consider refactoring that code, but such refactor will go deep into the storage engine code so this will have to do until then. 
public	TokenNamepublic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LazyColumnIterator	TokenNameIdentifier	 Lazy Column Iterator
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
IColumnIteratorFactory	TokenNameIdentifier	 I Column Iterator Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
