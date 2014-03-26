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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
TreeSet	TokenNameIdentifier	 Tree Set
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
CompositeType	TokenNameIdentifier	 Composite Type
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
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
IndexExpression	TokenNameIdentifier	 Index Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
IndexOperator	TokenNameIdentifier	 Index Operator
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * Extends a column filter (IFilter) to include a number of IndexExpression. */	TokenNameCOMMENT_JAVADOC	 Extends a column filter (IFilter) to include a number of IndexExpression. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ExtendedFilter	TokenNameIdentifier	 Extended Filter
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
ExtendedFilter	TokenNameIdentifier	 Extended Filter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
originalFilter	TokenNameIdentifier	 original Filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isPaging	TokenNameIdentifier	 is Paging
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ExtendedFilter	TokenNameIdentifier	 Extended Filter
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EmptyClauseFilter	TokenNameIdentifier	 Empty Clause Filter
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Cross-row paging is not supported along with index clauses"	TokenNameStringLiteral	Cross-row paging is not supported along with index clauses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CompositeType	TokenNameIdentifier	 Composite Type
?	TokenNameQUESTION	
new	TokenNamenew	
FilterWithCompositeClauses	TokenNameIdentifier	 Filter With Composite Clauses
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
FilterWithClauses	TokenNameIdentifier	 Filter With Clauses
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ExtendedFilter	TokenNameIdentifier	 Extended Filter
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
cfs	TokenNameIdentifier	 cfs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
filter	TokenNameIdentifier	 filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalFilter	TokenNameIdentifier	 original Filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxResults	TokenNameIdentifier	 max Results
=	TokenNameEQUAL	
maxResults	TokenNameIdentifier	 max Results
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
=	TokenNameEQUAL	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isPaging	TokenNameIdentifier	 is Paging
=	TokenNameEQUAL	
isPaging	TokenNameIdentifier	 is Paging
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
.	TokenNameDOT	
updateColumnsLimit	TokenNameIdentifier	 update Columns Limit
(	TokenNameLPAREN	
maxResults	TokenNameIdentifier	 max Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPaging	TokenNameIdentifier	 is Paging
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
originalFilter	TokenNameIdentifier	 original Filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Cross-row paging is only supported for SliceQueryFilter having an empty finish column"	TokenNameStringLiteral	Cross-row paging is only supported for SliceQueryFilter having an empty finish column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxRows	TokenNameIdentifier	 max Rows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
maxResults	TokenNameIdentifier	 max Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxColumns	TokenNameIdentifier	 max Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
?	TokenNameQUESTION	
maxResults	TokenNameIdentifier	 max Results
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Update the filter if necessary given the number of column already * fetched. */	TokenNameCOMMENT_JAVADOC	 Update the filter if necessary given the number of column already fetched. 
public	TokenNamepublic	
void	TokenNamevoid	
updateFilter	TokenNameIdentifier	 update Filter
(	TokenNameLPAREN	
int	TokenNameint	
currentColumnsCount	TokenNameIdentifier	 current Columns Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// As soon as we'd done our first call, we want to reset the start column if we're paging 	TokenNameCOMMENT_LINE	As soon as we'd done our first call, we want to reset the start column if we're paging 
if	TokenNameif	
(	TokenNameLPAREN	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
maxResults	TokenNameIdentifier	 max Results
-	TokenNameMINUS	
currentColumnsCount	TokenNameIdentifier	 current Columns Count
;	TokenNameSEMICOLON	
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
updateColumnsLimit	TokenNameIdentifier	 update Columns Limit
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
lastCounted	TokenNameIdentifier	 last Counted
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lastCounted	TokenNameIdentifier	 last Counted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLiveCount	TokenNameIdentifier	 get Live Count
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The initial filter we'll do our first slice with (either the original or a superset of it) */	TokenNameCOMMENT_JAVADOC	 The initial filter we'll do our first slice with (either the original or a superset of it) 
public	TokenNamepublic	
abstract	TokenNameabstract	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
originalFilter	TokenNameIdentifier	 original Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalFilter	TokenNameIdentifier	 original Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
getClause	TokenNameIdentifier	 get Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a filter to query the columns from the clause that the initial slice filter may not have caught. * @param data the data retrieve by the initial filter * @return a filter or null if there can't be any columns we missed with our initial filter (typically if it was a names query, or a slice of the entire row) */	TokenNameCOMMENT_JAVADOC	 Returns a filter to query the columns from the clause that the initial slice filter may not have caught. @param data the data retrieve by the initial filter @return a filter or null if there can't be any columns we missed with our initial filter (typically if it was a names query, or a slice of the entire row) 
public	TokenNamepublic	
abstract	TokenNameabstract	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
getExtraFilter	TokenNameIdentifier	 get Extra Filter
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return data pruned down to the columns originally asked for */	TokenNameCOMMENT_JAVADOC	 @return data pruned down to the columns originally asked for 
public	TokenNamepublic	
abstract	TokenNameabstract	
ColumnFamily	TokenNameIdentifier	 Column Family
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the provided data satisfies all the expressions from * the clause of this filter. */	TokenNameCOMMENT_JAVADOC	 @return true if the provided data satisfies all the expressions from the clause of this filter. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isSatisfiedBy	TokenNameIdentifier	 is Satisfied By
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
satisfies	TokenNameIdentifier	 satisfies
(	TokenNameLPAREN	
int	TokenNameint	
comparison	TokenNameIdentifier	 comparison
,	TokenNameCOMMA	
IndexOperator	TokenNameIdentifier	 Index Operator
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
EQ	TokenNameIdentifier	 EQ
:	TokenNameCOLON	
return	TokenNamereturn	
comparison	TokenNameIdentifier	 comparison
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GTE	TokenNameIdentifier	 GTE
:	TokenNameCOLON	
return	TokenNamereturn	
comparison	TokenNameIdentifier	 comparison
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GT	TokenNameIdentifier	 GT
:	TokenNameCOLON	
return	TokenNamereturn	
comparison	TokenNameIdentifier	 comparison
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LTE	TokenNameIdentifier	 LTE
:	TokenNameCOLON	
return	TokenNamereturn	
comparison	TokenNameIdentifier	 comparison
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LT	TokenNameIdentifier	 LT
:	TokenNameCOLON	
return	TokenNamereturn	
comparison	TokenNameIdentifier	 comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FilterWithClauses	TokenNameIdentifier	 Filter With Clauses
extends	TokenNameextends	
ExtendedFilter	TokenNameIdentifier	 Extended Filter
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
initialFilter	TokenNameIdentifier	 initial Filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterWithClauses	TokenNameIdentifier	 Filter With Clauses
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
clause	TokenNameIdentifier	 clause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initialFilter	TokenNameIdentifier	 initial Filter
=	TokenNameEQUAL	
computeInitialFilter	TokenNameIdentifier	 compute Initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets up the initial filter. */	TokenNameCOMMENT_JAVADOC	 Sets up the initial filter. 
protected	TokenNameprotected	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
computeInitialFilter	TokenNameIdentifier	 compute Initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
originalFilter	TokenNameIdentifier	 original Filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have a high chance of getting all the columns in a single index slice (and it's not too costly), do that. 	TokenNameCOMMENT_LINE	if we have a high chance of getting all the columns in a single index slice (and it's not too costly), do that. 
// otherwise, the extraFilter (lazily created) will fetch by name the columns referenced by the additional expressions. 	TokenNameCOMMENT_LINE	otherwise, the extraFilter (lazily created) will fetch by name the columns referenced by the additional expressions. 
if	TokenNameif	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMaxRowSize	TokenNameIdentifier	 get Max Row Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getColumnIndexSize	TokenNameIdentifier	 get Column Index Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Expanding slice filter to entire row to cover additional expressions"	TokenNameStringLiteral	Expanding slice filter to entire row to cover additional expressions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"adding columns to original Filter to cover additional expressions"	TokenNameStringLiteral	adding columns to original Filter to cover additional expressions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
originalFilter	TokenNameIdentifier	 original Filter
instanceof	TokenNameinstanceof	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexExpression	TokenNameIdentifier	 Index Expression
expr	TokenNameIdentifier	 expr
:	TokenNameCOLON	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
withUpdatedColumns	TokenNameIdentifier	 with Updated Columns
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
originalFilter	TokenNameIdentifier	 original Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initialFilter	TokenNameIdentifier	 initial Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
getClause	TokenNameIdentifier	 get Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * We may need an extra query only if the original was a slice query (and thus may have miss the expression for the clause). * Even then, there is no point in doing an extra query if the original filter grabbed the whole row. * Lastly, we only need the extra query if we haven't yet got all the expressions from the clause. */	TokenNameCOMMENT_BLOCK	 We may need an extra query only if the original was a slice query (and thus may have miss the expression for the clause). Even then, there is no point in doing an extra query if the original filter grabbed the whole row. Lastly, we only need the extra query if we haven't yet got all the expressions from the clause. 
private	TokenNameprivate	
boolean	TokenNameboolean	
needsExtraQuery	TokenNameIdentifier	 needs Extra Query
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
originalFilter	TokenNameIdentifier	 original Filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
;	TokenNameSEMICOLON	
// Check if we've fetch the whole row 	TokenNameCOMMENT_LINE	Check if we've fetch the whole row 
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexExpression	TokenNameIdentifier	 Index Expression
expr	TokenNameIdentifier	 expr
:	TokenNameCOLON	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"adding extraFilter to cover additional expressions"	TokenNameStringLiteral	adding extraFilter to cover additional expressions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
getExtraFilter	TokenNameIdentifier	 get Extra Filter
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
needsExtraQuery	TokenNameIdentifier	 needs Extra Query
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Note: for counters we must be careful to not add a column that was already there (to avoid overcount). That is 	TokenNameCOMMENT_LINE	Note: for counters we must be careful to not add a column that was already there (to avoid overcount). That is 
// why we do the dance of avoiding to query any column we already have (it's also more efficient anyway) 	TokenNameCOMMENT_LINE	why we do the dance of avoiding to query any column we already have (it's also more efficient anyway) 
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexExpression	TokenNameIdentifier	 Index Expression
expr	TokenNameIdentifier	 expr
:	TokenNameCOLON	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
initialFilter	TokenNameIdentifier	 initial Filter
==	TokenNameEQUAL_EQUAL	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
pruned	TokenNameIdentifier	 pruned
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
cloneMeShallow	TokenNameIdentifier	 clone Me Shallow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
originalFilter	TokenNameIdentifier	 original Filter
.	TokenNameDOT	
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalFilter	TokenNameIdentifier	 original Filter
.	TokenNameDOT	
collectReducedColumns	TokenNameIdentifier	 collect Reduced Columns
(	TokenNameLPAREN	
pruned	TokenNameIdentifier	 pruned
,	TokenNameCOMMA	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
gatherTombstones	TokenNameIdentifier	 gather Tombstones
(	TokenNameLPAREN	
pruned	TokenNameIdentifier	 pruned
,	TokenNameCOMMA	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pruned	TokenNameIdentifier	 pruned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSatisfiedBy	TokenNameIdentifier	 is Satisfied By
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We enforces even the primary clause because reads are not synchronized with writes and it is thus possible to have a race 	TokenNameCOMMENT_LINE	We enforces even the primary clause because reads are not synchronized with writes and it is thus possible to have a race 
// where the index returned a row which doesn't have the primary column when we actually read it 	TokenNameCOMMENT_LINE	where the index returned a row which doesn't have the primary column when we actually read it 
for	TokenNamefor	
(	TokenNameLPAREN	
IndexExpression	TokenNameIdentifier	 Index Expression
expression	TokenNameIdentifier	 expression
:	TokenNameCOLON	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check column data vs expression 	TokenNameCOMMENT_LINE	check column data vs expression 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
colName	TokenNameIdentifier	 col Name
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
:	TokenNameCOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
colName	TokenNameIdentifier	 col Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueValidator	TokenNameIdentifier	 get Value Validator
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
satisfies	TokenNameIdentifier	 satisfies
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
op	TokenNameIdentifier	 op
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
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FilterWithCompositeClauses	TokenNameIdentifier	 Filter With Composite Clauses
extends	TokenNameextends	
FilterWithClauses	TokenNameIdentifier	 Filter With Clauses
{	TokenNameLBRACE	
public	TokenNamepublic	
FilterWithCompositeClauses	TokenNameIdentifier	 Filter With Composite Clauses
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * For composites, the index name is not a valid column name (it's only * one of the component), which means we should not do the * NamesQueryFilter part of FilterWithClauses in particular. * Besides, CompositesSearcher doesn't really use the initial filter * expect to know the limit set by the user, so create a fake filter * with only the count information. */	TokenNameCOMMENT_BLOCK	 For composites, the index name is not a valid column name (it's only one of the component), which means we should not do the NamesQueryFilter part of FilterWithClauses in particular. Besides, CompositesSearcher doesn't really use the initial filter expect to know the limit set by the user, so create a fake filter with only the count information. 
protected	TokenNameprotected	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
computeInitialFilter	TokenNameIdentifier	 compute Initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
originalFilter	TokenNameIdentifier	 original Filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
originalFilter	TokenNameIdentifier	 original Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
(	TokenNameLPAREN	
ColumnSlice	TokenNameIdentifier	 Column Slice
.	TokenNameDOT	
ALL_COLUMNS_ARRAY	TokenNameIdentifier	 ALL  COLUMNS  ARRAY
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
EmptyClauseFilter	TokenNameIdentifier	 Empty Clause Filter
extends	TokenNameextends	
ExtendedFilter	TokenNameIdentifier	 Extended Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
EmptyClauseFilter	TokenNameIdentifier	 Empty Clause Filter
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
,	TokenNameCOMMA	
isPaging	TokenNameIdentifier	 is Paging
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
initialFilter	TokenNameIdentifier	 initial Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalFilter	TokenNameIdentifier	 original Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
getClause	TokenNameIdentifier	 get Clause
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
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
getExtraFilter	TokenNameIdentifier	 get Extra Filter
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSatisfiedBy	TokenNameIdentifier	 is Satisfied By
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
