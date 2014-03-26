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
SortedSet	TokenNameIdentifier	 Sorted Set
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Functions	TokenNameIdentifier	 Functions
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IIterableColumns	TokenNameIdentifier	 I Iterable Columns
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
implements	TokenNameimplements	
IColumnContainer	TokenNameIdentifier	 I Column Container
,	TokenNameCOMMA	
IIterableColumns	TokenNameIdentifier	 I Iterable Columns
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
cc2	TokenNameIdentifier	 cc2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cc2	TokenNameIdentifier	 cc2
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Contrarily to delete(), this will use the provided info even if those 	TokenNameCOMMENT_LINE	Contrarily to delete(), this will use the provided info even if those 
// are older that the current ones. Used for SuperColumn in QueryFilter. 	TokenNameCOMMENT_LINE	are older that the current ones. Used for SuperColumn in QueryFilter. 
// delete() is probably the right method in all other cases. 	TokenNameCOMMENT_LINE	delete() is probably the right method in all other cases. 
public	TokenNamepublic	
void	TokenNamevoid	
setDeletionInfo	TokenNameIdentifier	 set Deletion Info
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
setDeletionInfo	TokenNameIdentifier	 set Deletion Info
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DeletionInfo	TokenNameIdentifier	 Deletion Info
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Drops expired row-level tombstones. Normally, these are dropped once the row no longer exists, but * if new columns are inserted into the row post-deletion, they can keep the row tombstone alive indefinitely, * with non-intuitive results. See https://issues.apache.org/jira/browse/CASSANDRA-2317 */	TokenNameCOMMENT_JAVADOC	 Drops expired row-level tombstones. Normally, these are dropped once the row no longer exists, but if new columns are inserted into the row post-deletion, they can keep the row tombstone alive indefinitely, with non-intuitive results. See https://issues.apache.org/jira/browse/CASSANDRA-2317 
public	TokenNamepublic	
void	TokenNamevoid	
maybeResetDeletionTimes	TokenNameIdentifier	 maybe Reset Deletion Times
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
maybeResetDeletionTimes	TokenNameIdentifier	 maybe Reset Deletion Times
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
addAllWithSizeDelta	TokenNameIdentifier	 add All With Size Delta
(	TokenNameLPAREN	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
cc	TokenNameIdentifier	 cc
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
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
addAllWithSizeDelta	TokenNameIdentifier	 add All With Size Delta
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
transformation	TokenNameIdentifier	 transformation
,	TokenNameCOMMA	
indexer	TokenNameIdentifier	 indexer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
cc	TokenNameIdentifier	 cc
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
transformation	TokenNameIdentifier	 transformation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
cc	TokenNameIdentifier	 cc
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
,	TokenNameCOMMA	
Functions	TokenNameIdentifier	 Functions
.	TokenNameDOT	
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
identity	TokenNameIdentifier	 identity
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
,	TokenNameCOMMA	
newColumn	TokenNameIdentifier	 new Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Note that for some of the implementation backing the container, the * return set may not have implementation for tailSet, headSet and subSet. * See ColumnNamesSet in ArrayBackedSortedColumns for more details. */	TokenNameCOMMENT_BLOCK	 Note that for some of the implementation backing the container, the return set may not have implementation for tailSet, headSet and subSet. See ColumnNamesSet in ArrayBackedSortedColumns for more details. 
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getColumnNames	TokenNameIdentifier	 get Column Names
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
getReverseSortedColumns	TokenNameIdentifier	 get Reverse Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
removeColumn	TokenNameIdentifier	 remove Column
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
AbstractColumnContainer	TokenNameIdentifier	 Abstract Column Container
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
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
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasOnlyTombstones	TokenNameIdentifier	 has Only Tombstones
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
columns	TokenNameIdentifier	 columns
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
reverseIterator	TokenNameIdentifier	 reverse Iterator
(	TokenNameLPAREN	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasIrrelevantData	TokenNameIdentifier	 has Irrelevant Data
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do we have gcable deletion infos? 	TokenNameCOMMENT_LINE	Do we have gcable deletion infos? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
purge	TokenNameIdentifier	 purge
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Do we have colums that are either deleted by the container or gcable tombstone? 	TokenNameCOMMENT_LINE	Do we have colums that are either deleted by the container or gcable tombstone? 
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
||	TokenNameOR_OR	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
hasIrrelevantData	TokenNameIdentifier	 has Irrelevant Data
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
