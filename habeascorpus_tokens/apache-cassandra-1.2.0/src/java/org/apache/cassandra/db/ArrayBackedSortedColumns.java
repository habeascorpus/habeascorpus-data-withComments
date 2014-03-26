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
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Lists	TokenNameIdentifier	 Lists
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
/** * A ISortedColumns backed by an ArrayList. * This implementation is not synchronized and should only be used when * thread-safety is not required. This implementation makes sense when the * main operations performed are iterating over the map and adding columns * (especially if insertion is in sorted order). */	TokenNameCOMMENT_JAVADOC	 A ISortedColumns backed by an ArrayList. This implementation is not synchronized and should only be used when thread-safety is not required. This implementation makes sense when the main operations performed are iterating over the map and adding columns (especially if insertion is in sorted order). 
public	TokenNamepublic	
class	TokenNameclass	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
extends	TokenNameextends	
AbstractThreadUnsafeSortedColumns	TokenNameIdentifier	 Abstract Thread Unsafe Sorted Columns
implements	TokenNameimplements	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
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
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
insertReversed	TokenNameIdentifier	 insert Reversed
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
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
(	TokenNameLPAREN	
sortedMap	TokenNameIdentifier	 sorted Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
sortedMap	TokenNameIdentifier	 sorted Map
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
insertReversed	TokenNameIdentifier	 insert Reversed
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
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
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
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
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
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
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
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
internalComparator	TokenNameIdentifier	 internal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
reverseComparator	TokenNameIdentifier	 reverse Comparator
:	TokenNameCOLON	
comparator	TokenNameIdentifier	 comparator
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
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * AddColumn throws an exception if the column added does not sort after * the last column in the map. * The reasoning is that this implementation can get slower if too much * insertions are done in unsorted order and right now we only use it when * *all* insertion (with this method) are done in sorted order. The * assertion throwing is thus a protection against performance regression * without knowing about (we can revisit that decision later if we have * use cases where most insert are in sorted order but a few are not). */	TokenNameCOMMENT_JAVADOC	 AddColumn throws an exception if the column added does not sort after the last column in the map. The reasoning is that this implementation can get slower if too much insertions are done in unsorted order and right now we only use it when *all* insertion (with this method) are done in sorted order. The assertion throwing is thus a protection against performance regression without knowing about (we can revisit that decision later if we have use cases where most insert are in sorted order but a few are not). 
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
if	TokenNameif	
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fast path if inserting at the tail 	TokenNameCOMMENT_LINE	Fast path if inserting at the tail 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
internalComparator	TokenNameIdentifier	 internal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note that we want an assertion here (see addColumn javadoc), but we also want that if 	TokenNameCOMMENT_LINE	note that we want an assertion here (see addColumn javadoc), but we also want that if 
// assertion are disabled, addColumn works correctly with unsorted input 	TokenNameCOMMENT_LINE	assertion are disabled, addColumn works correctly with unsorted input 
assert	TokenNameassert	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Added column does not sort as the "	TokenNameStringLiteral	Added column does not sort as the 
+	TokenNamePLUS	
(	TokenNameLPAREN	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
"first"	TokenNameStringLiteral	first
:	TokenNameCOLON	
"last"	TokenNameStringLiteral	last
)	TokenNameRPAREN	
+	TokenNamePLUS	
" column"	TokenNameStringLiteral	 column
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Insert as last 	TokenNameCOMMENT_LINE	Insert as last 
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Resolve against last 	TokenNameCOMMENT_LINE	Resolve against last 
resolveAgainst	TokenNameIdentifier	 resolve Against
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
resolveAgainst	TokenNameIdentifier	 resolve Against
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Resolve against element at position i. * Assume that i is a valid position. */	TokenNameCOMMENT_JAVADOC	 Resolve against element at position i. Assume that i is a valid position. 
private	TokenNameprivate	
void	TokenNamevoid	
resolveAgainst	TokenNameIdentifier	 resolve Against
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
oldColumn	TokenNameIdentifier	 old Column
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delegated to SuperColumn 	TokenNameCOMMENT_LINE	Delegated to SuperColumn 
assert	TokenNameassert	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
reconciledColumn	TokenNameIdentifier	 reconciled Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
internalComparator	TokenNameIdentifier	 internal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple binary search for a given column name. * The return value has the exact same meaning that the one of Collections.binarySearch(). * (We don't use Collections.binarySearch() directly because it would require us to create * a fake IColumn (as well as an IColumn comparator) to do the search, which is ugly. */	TokenNameCOMMENT_JAVADOC	 Simple binary search for a given column name. The return value has the exact same meaning that the one of Collections.binarySearch(). (We don't use Collections.binarySearch() directly because it would require us to create a fake IColumn (as well as an IColumn comparator) to do the search, which is ugly. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
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
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getDeletionInfo	TokenNameIdentifier	 get Deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
IColumn	TokenNameIdentifier	 I Column
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
reverseIterator	TokenNameIdentifier	 reverse Iterator
(	TokenNameLPAREN	
ColumnSlice	TokenNameIdentifier	 Column Slice
.	TokenNameDOT	
ALL_COLUMNS_ARRAY	TokenNameIdentifier	 ALL  COLUMNS  ARRAY
)	TokenNameRPAREN	
:	TokenNameCOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
otherColumn	TokenNameIdentifier	 other Column
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
otherColumn	TokenNameIdentifier	 other Column
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
internalComparator	TokenNameIdentifier	 internal Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
otherColumn	TokenNameIdentifier	 other Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
transformation	TokenNameIdentifier	 transformation
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
otherColumn	TokenNameIdentifier	 other Column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherColumn	TokenNameIdentifier	 other Column
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// c == 0 	TokenNameCOMMENT_LINE	c == 0 
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolveAgainst	TokenNameIdentifier	 resolve Against
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
transformation	TokenNameIdentifier	 transformation
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
otherColumn	TokenNameIdentifier	 other Column
)	TokenNameRPAREN	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
otherColumn	TokenNameIdentifier	 other Column
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
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
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherColumn	TokenNameIdentifier	 other Column
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
transformation	TokenNameIdentifier	 transformation
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
otherColumn	TokenNameIdentifier	 other Column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherColumn	TokenNameIdentifier	 other Column
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
oldColumn	TokenNameIdentifier	 old Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
newColumn	TokenNameIdentifier	 new Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
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
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
new	TokenNamenew	
ReverseSortedCollection	TokenNameIdentifier	 Reverse Sorted Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
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
// If reversed, the element are sorted reversely, so we could expect 	TokenNameCOMMENT_LINE	If reversed, the element are sorted reversely, so we could expect 
// to return *this*, but *this* redefine the iterator to be in sorted 	TokenNameCOMMENT_LINE	to return *this*, but *this* redefine the iterator to be in sorted 
// order, so we need a collection that uses the super constructor 	TokenNameCOMMENT_LINE	order, so we need a collection that uses the super constructor 
return	TokenNamereturn	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
new	TokenNamenew	
ForwardSortedCollection	TokenNameIdentifier	 Forward Sorted Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ReverseSortedCollection	TokenNameIdentifier	 Reverse Sorted Collection
(	TokenNameLPAREN	
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
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
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
// we could memoize the created set but it's unlikely we'll call this method a lot on the same object anyway 	TokenNameCOMMENT_LINE	we could memoize the created set but it's unlikely we'll call this method a lot on the same object anyway 
return	TokenNamereturn	
new	TokenNamenew	
ColumnNamesSet	TokenNameIdentifier	 Column Names Set
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
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
Lists	TokenNameIdentifier	 Lists
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
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
new	TokenNamenew	
SlicesIterator	TokenNameIdentifier	 Slices Iterator
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
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
SlicesIterator	TokenNameIdentifier	 Slices Iterator
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
!	TokenNameNOT	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SlicesIterator	TokenNameIdentifier	 Slices Iterator
extends	TokenNameextends	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
previousSliceEnd	TokenNameIdentifier	 previous Slice End
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
currentSlice	TokenNameIdentifier	 current Slice
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SlicesIterator	TokenNameIdentifier	 Slices Iterator
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
Lists	TokenNameIdentifier	 Lists
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
:	TokenNameCOLON	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slices	TokenNameIdentifier	 slices
=	TokenNameEQUAL	
slices	TokenNameIdentifier	 slices
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
reverseComparator	TokenNameIdentifier	 reverse Comparator
:	TokenNameCOLON	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
IColumn	TokenNameIdentifier	 I Column
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentSlice	TokenNameIdentifier	 current Slice
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnSlice	TokenNameIdentifier	 Column Slice
slice	TokenNameIdentifier	 slice
=	TokenNameEQUAL	
slices	TokenNameIdentifier	 slices
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// The first idx to include 	TokenNameCOMMENT_LINE	The first idx to include 
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
previousSliceEnd	TokenNameIdentifier	 previous Slice End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startIdx	TokenNameIdentifier	 start Idx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
startIdx	TokenNameIdentifier	 start Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The first idx to exclude 	TokenNameCOMMENT_LINE	The first idx to exclude 
int	TokenNameint	
finishIdx	TokenNameIdentifier	 finish Idx
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
previousSliceEnd	TokenNameIdentifier	 previous Slice End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finishIdx	TokenNameIdentifier	 finish Idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
finishIdx	TokenNameIdentifier	 finish Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
else	TokenNameelse	
finishIdx	TokenNameIdentifier	 finish Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
finishIdx	TokenNameIdentifier	 finish Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startIdx	TokenNameIdentifier	 start Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
finishIdx	TokenNameIdentifier	 finish Idx
==	TokenNameEQUAL_EQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
currentSlice	TokenNameIdentifier	 current Slice
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
currentSlice	TokenNameIdentifier	 current Slice
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
startIdx	TokenNameIdentifier	 start Idx
,	TokenNameCOMMA	
finishIdx	TokenNameIdentifier	 finish Idx
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSliceEnd	TokenNameIdentifier	 previous Slice End
=	TokenNameEQUAL	
finishIdx	TokenNameIdentifier	 finish Idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
finishIdx	TokenNameIdentifier	 finish Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentSlice	TokenNameIdentifier	 current Slice
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
currentSlice	TokenNameIdentifier	 current Slice
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentSlice	TokenNameIdentifier	 current Slice
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ReverseSortedCollection	TokenNameIdentifier	 Reverse Sorted Collection
extends	TokenNameextends	
AbstractCollection	TokenNameIdentifier	 Abstract Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
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
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ForwardSortedCollection	TokenNameIdentifier	 Forward Sorted Collection
extends	TokenNameextends	
AbstractCollection	TokenNameIdentifier	 Abstract Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
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
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ColumnNamesSet	TokenNameIdentifier	 Column Names Set
extends	TokenNameextends	
AbstractSet	TokenNameIdentifier	 Abstract Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
implements	TokenNameimplements	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
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
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
outerIterator	TokenNameIdentifier	 outer Iterator
=	TokenNameEQUAL	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handles reversed 	TokenNameCOMMENT_LINE	handles reversed 
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outerIterator	TokenNameIdentifier	 outer Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outerIterator	TokenNameIdentifier	 outer Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outerIterator	TokenNameIdentifier	 outer Iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
outerList	TokenNameIdentifier	 outer List
=	TokenNameEQUAL	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
outerList	TokenNameIdentifier	 outer List
=	TokenNameEQUAL	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
outerList	TokenNameIdentifier	 outer List
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * It is fairly hard to implement headSet, tailSet and subSet so that they respect their specification. * Namely, the part "The returned set is backed by this set, so changes in the returned set are reflected * in this set, and vice-versa". Simply keeping a lower and upper index in the backing arrayList wouldn't * ensure those property. Since we do not use those function so far, we prefer returning UnsupportedOperationException * for now and revisit this when and if the need arise. */	TokenNameCOMMENT_BLOCK	 It is fairly hard to implement headSet, tailSet and subSet so that they respect their specification. Namely, the part "The returned set is backed by this set, so changes in the returned set are reflected in this set, and vice-versa". Simply keeping a lower and upper index in the backing arrayList wouldn't ensure those property. Since we do not use those function so far, we prefer returning UnsupportedOperationException for now and revisit this when and if the need arise. 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
headSet	TokenNameIdentifier	 head Set
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromElement	TokenNameIdentifier	 from Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// see headSet 	TokenNameCOMMENT_LINE	see headSet 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
tailSet	TokenNameIdentifier	 tail Set
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
toElement	TokenNameIdentifier	 to Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// see headSet 	TokenNameCOMMENT_LINE	see headSet 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
subSet	TokenNameIdentifier	 sub Set
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromElement	TokenNameIdentifier	 from Element
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
toElement	TokenNameIdentifier	 to Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
