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
/** * A sorted map of columns. * This represents the backing map of a colum family. * * Whether the implementation is thread safe or not is left to the * implementing classes. */	TokenNameCOMMENT_JAVADOC	 A sorted map of columns. This represents the backing map of a colum family. * Whether the implementation is thread safe or not is left to the implementing classes. 
public	TokenNamepublic	
interface	TokenNameinterface	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
extends	TokenNameextends	
IIterableColumns	TokenNameIdentifier	 I Iterable Columns
{	TokenNameLBRACE	
/** * Shallow cloning of the column map. */	TokenNameCOMMENT_JAVADOC	 Shallow cloning of the column map. 
public	TokenNamepublic	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
cloneMe	TokenNameIdentifier	 clone Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the factory used for this ISortedColumns implementation. */	TokenNameCOMMENT_JAVADOC	 Returns the factory used for this ISortedColumns implementation. 
public	TokenNamepublic	
Factory	TokenNameIdentifier	 Factory
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DeletionInfo	TokenNameIdentifier	 Deletion Info
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setDeletionInfo	TokenNameIdentifier	 set Deletion Info
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
maybeResetDeletionTimes	TokenNameIdentifier	 maybe Reset Deletion Times
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a column to this column map. * If a column with the same name is already present in the map, it will * be replaced by the newly added column. */	TokenNameCOMMENT_JAVADOC	 Adds a column to this column map. If a column with the same name is already present in the map, it will be replaced by the newly added column. 
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
;	TokenNameSEMICOLON	
/** * Adds all the columns of a given column map to this column map. * This is equivalent to: * <code> * for (Column c : cm) * add(c); * </code> * but is potentially faster. * * @return the difference in size seen after merging the given columns */	TokenNameCOMMENT_JAVADOC	 Adds all the columns of a given column map to this column map. This is equivalent to: <code> for (Column c : cm) add(c); </code> but is potentially faster. * @return the difference in size seen after merging the given columns 
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
;	TokenNameSEMICOLON	
/** * Adds the columns without necessarily computing the size delta */	TokenNameCOMMENT_JAVADOC	 Adds the columns without necessarily computing the size delta 
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
;	TokenNameSEMICOLON	
/** * Replace oldColumn if present by newColumn. * Returns true if oldColumn was present and thus replaced. * oldColumn and newColumn should have the same name. */	TokenNameCOMMENT_JAVADOC	 Replace oldColumn if present by newColumn. Returns true if oldColumn was present and thus replaced. oldColumn and newColumn should have the same name. 
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
;	TokenNameSEMICOLON	
/** * Remove if present a column by name. */	TokenNameCOMMENT_JAVADOC	 Remove if present a column by name. 
public	TokenNamepublic	
void	TokenNamevoid	
removeColumn	TokenNameIdentifier	 remove Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Clear this column map, removing all columns. */	TokenNameCOMMENT_JAVADOC	 Clear this column map, removing all columns. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a column given its name, returning null if the column is not * present. */	TokenNameCOMMENT_JAVADOC	 Get a column given its name, returning null if the column is not present. 
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a set with the names of columns in this column map. * The resulting set is sorted and the order is the one of the columns in * this column map. */	TokenNameCOMMENT_JAVADOC	 Returns a set with the names of columns in this column map. The resulting set is sorted and the order is the one of the columns in this column map. 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
getColumnNames	TokenNameIdentifier	 get Column Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the columns of this column map as a collection. * The columns in the returned collection should be sorted as the columns * in this map. */	TokenNameCOMMENT_JAVADOC	 Returns the columns of this column map as a collection. The columns in the returned collection should be sorted as the columns in this map. 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getSortedColumns	TokenNameIdentifier	 get Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the columns of this column map as a collection. * The columns in the returned collection should be sorted in reverse * order of the columns in this map. */	TokenNameCOMMENT_JAVADOC	 Returns the columns of this column map as a collection. The columns in the returned collection should be sorted in reverse order of the columns in this map. 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getReverseSortedColumns	TokenNameIdentifier	 get Reverse Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of columns in this map. */	TokenNameCOMMENT_JAVADOC	 Returns the number of columns in this map. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this map is empty, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if this map is empty, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an iterator over the columns of this map that returns only the matching @param slices. * The provided slices must be in order and must be non-overlapping. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the columns of this map that returns only the matching @param slices. The provided slices must be in order and must be non-overlapping. 
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
;	TokenNameSEMICOLON	
/** * Returns a reversed iterator over the columns of this map that returns only the matching @param slices. * The provided slices must be in reversed order and must be non-overlapping. */	TokenNameCOMMENT_JAVADOC	 Returns a reversed iterator over the columns of this map that returns only the matching @param slices. The provided slices must be in reversed order and must be non-overlapping. 
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
;	TokenNameSEMICOLON	
/** * Returns if this map only support inserts in reverse order. */	TokenNameCOMMENT_JAVADOC	 Returns if this map only support inserts in reverse order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInsertReversed	TokenNameIdentifier	 is Insert Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
Factory	TokenNameIdentifier	 Factory
{	TokenNameLBRACE	
/** * Returns a (initially empty) column map whose columns are sorted * according to the provided comparator. * The {@code insertReversed} flag is an hint on how we expect insertion to be perfomed, * either in sorted or reverse sorted order. This is used by ArrayBackedSortedColumns to * allow optimizing for both forward and reversed slices. This does not matter for ThreadSafeSortedColumns. * Note that this is only an hint on how we expect to do insertion, this does not change the map sorting. */	TokenNameCOMMENT_JAVADOC	 Returns a (initially empty) column map whose columns are sorted according to the provided comparator. The {@code insertReversed} flag is an hint on how we expect insertion to be perfomed, either in sorted or reverse sorted order. This is used by ArrayBackedSortedColumns to allow optimizing for both forward and reversed slices. This does not matter for ThreadSafeSortedColumns. Note that this is only an hint on how we expect to do insertion, this does not change the map sorting. 
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
;	TokenNameSEMICOLON	
/** * Returns a column map whose columns are sorted according to the comparator of the provided sorted * map (which thus, is assumed to _not_ be sorted by natural order) and that initially contains the * columns in the provided sorted map. * See {@code create} for the description of {@code insertReversed} */	TokenNameCOMMENT_JAVADOC	 Returns a column map whose columns are sorted according to the comparator of the provided sorted map (which thus, is assumed to _not_ be sorted by natural order) and that initially contains the columns in the provided sorted map. See {@code create} for the description of {@code insertReversed} 
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
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
boolean	TokenNameboolean	
insertReversed	TokenNameIdentifier	 insert Reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
