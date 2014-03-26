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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SliceQueryPager	TokenNameIdentifier	 Slice Query Pager
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PAGE_SIZE	TokenNameIdentifier	 DEFAULT  PAGE  SIZE
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
exhausted	TokenNameIdentifier	 exhausted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SliceQueryPager	TokenNameIdentifier	 Slice Query Pager
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slices	TokenNameIdentifier	 slices
=	TokenNameEQUAL	
slices	TokenNameIdentifier	 slices
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This will *not* do a query 	TokenNameCOMMENT_LINE	This will *not* do a query 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
exhausted	TokenNameIdentifier	 exhausted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This might return an empty column family (but never a null one) 	TokenNameCOMMENT_LINE	This might return an empty column family (but never a null one) 
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exhausted	TokenNameIdentifier	 exhausted
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamilyName	TokenNameIdentifier	 get Column Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
sliceFilter	TokenNameIdentifier	 slice Filter
=	TokenNameEQUAL	
new	TokenNamenew	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
(	TokenNameLPAREN	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
DEFAULT_PAGE_SIZE	TokenNameIdentifier	 DEFAULT  PAGE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryFilter	TokenNameIdentifier	 Query Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
QueryFilter	TokenNameIdentifier	 Query Filter
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
sliceFilter	TokenNameIdentifier	 slice Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
sliceFilter	TokenNameIdentifier	 slice Filter
.	TokenNameDOT	
getLiveCount	TokenNameIdentifier	 get Live Count
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
<	TokenNameLESS	
DEFAULT_PAGE_SIZE	TokenNameIdentifier	 DEFAULT  PAGE  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getReverseSortedColumns	TokenNameIdentifier	 get Reverse Sorted Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
lastColumn	TokenNameIdentifier	 last Column
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lastColumn	TokenNameIdentifier	 last Column
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
lastColumn	TokenNameIdentifier	 last Column
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnSlice	TokenNameIdentifier	 Column Slice
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
slices	TokenNameIdentifier	 slices
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
lastColumn	TokenNameIdentifier	 last Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
slices	TokenNameIdentifier	 slices
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
copyOfRange	TokenNameIdentifier	 copy Of Range
(	TokenNameLPAREN	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
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
}	TokenNameRBRACE	
