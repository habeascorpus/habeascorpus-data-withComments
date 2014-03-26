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
index	TokenNameIdentifier	 index
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
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
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
ColumnDefinition	TokenNameIdentifier	 Column Definition
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * Implements a secondary index for a column family using a second column family * in which the row keys are indexed values, and column names are base row keys. */	TokenNameCOMMENT_JAVADOC	 Implements a secondary index for a column family using a second column family in which the row keys are indexed values, and column names are base row keys. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSimplePerColumnSecondaryIndex	TokenNameIdentifier	 Abstract Simple Per Column Secondary Index
extends	TokenNameextends	
PerColumnSecondaryIndex	TokenNameIdentifier	 Per Column Secondary Index
{	TokenNameLBRACE	
private	TokenNameprivate	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
indexCfs	TokenNameIdentifier	 index Cfs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
baseCfs	TokenNameIdentifier	 base Cfs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
columnDefs	TokenNameIdentifier	 column Defs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
columnDefs	TokenNameIdentifier	 column Defs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
=	TokenNameEQUAL	
columnDefs	TokenNameIdentifier	 column Defs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
indexComparator	TokenNameIdentifier	 index Comparator
=	TokenNameEQUAL	
SecondaryIndex	TokenNameIdentifier	 Secondary Index
.	TokenNameDOT	
getIndexComparator	TokenNameIdentifier	 get Index Comparator
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CFMetaData	TokenNameIdentifier	 CF Meta Data
indexedCfMetadata	TokenNameIdentifier	 indexed Cf Metadata
=	TokenNameEQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
newIndexMetadata	TokenNameIdentifier	 new Index Metadata
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
columnDef	TokenNameIdentifier	 column Def
,	TokenNameCOMMA	
indexComparator	TokenNameIdentifier	 index Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
=	TokenNameEQUAL	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
createColumnFamilyStore	TokenNameIdentifier	 create Column Family Store
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
indexedCfMetadata	TokenNameIdentifier	 indexed Cf Metadata
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
new	TokenNamenew	
LocalPartitioner	TokenNameIdentifier	 Local Partitioner
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
getValidator	TokenNameIdentifier	 get Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexedCfMetadata	TokenNameIdentifier	 indexed Cf Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// enable and initialize row cache based on parent's setting and indexed column's cardinality 	TokenNameCOMMENT_LINE	enable and initialize row cache based on parent's setting and indexed column's cardinality 
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
Caching	TokenNameIdentifier	 Caching
baseCaching	TokenNameIdentifier	 base Caching
=	TokenNameEQUAL	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getCaching	TokenNameIdentifier	 get Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseCaching	TokenNameIdentifier	 base Caching
==	TokenNameEQUAL_EQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
Caching	TokenNameIdentifier	 Caching
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
||	TokenNameOR_OR	
baseCaching	TokenNameIdentifier	 base Caching
==	TokenNameEQUAL_EQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
Caching	TokenNameIdentifier	 Caching
.	TokenNameDOT	
ROWS_ONLY	TokenNameIdentifier	 ROWS  ONLY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * # of index CF's key = cardinality of indexed column. * if # of keys stored in index CF is more than average column counts (means tall table), * then consider it as high cardinality. */	TokenNameCOMMENT_BLOCK	 # of index CF's key = cardinality of indexed column. if # of keys stored in index CF is more than average column counts (means tall table), then consider it as high cardinality. 
double	TokenNamedouble	
estimatedKeys	TokenNameIdentifier	 estimated Keys
=	TokenNameEQUAL	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
estimateKeys	TokenNameIdentifier	 estimate Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
averageColumnCount	TokenNameIdentifier	 average Column Count
=	TokenNameEQUAL	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
getMeanColumns	TokenNameIdentifier	 get Mean Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
averageColumnCount	TokenNameIdentifier	 average Column Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
estimatedKeys	TokenNameIdentifier	 estimated Keys
/	TokenNameDIVIDE	
averageColumnCount	TokenNameIdentifier	 average Column Count
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"turning row cache on for "	TokenNameStringLiteral	turning row cache on for 
+	TokenNamePLUS	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
getColumnFamilyName	TokenNameIdentifier	 get Column Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
caching	TokenNameIdentifier	 caching
(	TokenNameLPAREN	
baseCaching	TokenNameIdentifier	 base Caching
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
initRowCache	TokenNameIdentifier	 init Row Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
makeIndexColumnName	TokenNameIdentifier	 make Index Column Name
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
AbstractType	TokenNameIdentifier	 Abstract Type
getExpressionComparator	TokenNameIdentifier	 get Expression Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
expressionString	TokenNameIdentifier	 expression String
(	TokenNameLPAREN	
IndexExpression	TokenNameIdentifier	 Index Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"'%s.%s %s %s'"	TokenNameStringLiteral	'%s.%s %s %s'
,	TokenNameCOMMA	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
getExpressionComparator	TokenNameIdentifier	 get Expression Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
.	TokenNameDOT	
getValidator	TokenNameIdentifier	 get Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
valueKey	TokenNameIdentifier	 value Key
=	TokenNameEQUAL	
getIndexKeyFor	TokenNameIdentifier	 get Index Key For
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
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
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cfi	TokenNameIdentifier	 cfi
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfi	TokenNameIdentifier	 cfi
.	TokenNameDOT	
addTombstone	TokenNameIdentifier	 add Tombstone
(	TokenNameLPAREN	
makeIndexColumnName	TokenNameIdentifier	 make Index Column Name
(	TokenNameLPAREN	
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
valueKey	TokenNameIdentifier	 value Key
,	TokenNameCOMMA	
cfi	TokenNameIdentifier	 cfi
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
nullUpdater	TokenNameIdentifier	 null Updater
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"removed index entry for cleaned-up value {}:{}"	TokenNameStringLiteral	removed index entry for cleaned-up value {}:{}
,	TokenNameCOMMA	
valueKey	TokenNameIdentifier	 value Key
,	TokenNameCOMMA	
cfi	TokenNameIdentifier	 cfi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DecoratedKey	TokenNameIdentifier	 Decorated Key
valueKey	TokenNameIdentifier	 value Key
=	TokenNameEQUAL	
getIndexKeyFor	TokenNameIdentifier	 get Index Key For
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cfi	TokenNameIdentifier	 cfi
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
makeIndexColumnName	TokenNameIdentifier	 make Index Column Name
(	TokenNameLPAREN	
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
ec	TokenNameIdentifier	 ec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
)	TokenNameRPAREN	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
cfi	TokenNameIdentifier	 cfi
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
ec	TokenNameIdentifier	 ec
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ec	TokenNameIdentifier	 ec
.	TokenNameDOT	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ec	TokenNameIdentifier	 ec
.	TokenNameDOT	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cfi	TokenNameIdentifier	 cfi
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"applying index row {} in {}"	TokenNameStringLiteral	applying index row {} in {}
,	TokenNameCOMMA	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
valueKey	TokenNameIdentifier	 value Key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfi	TokenNameIdentifier	 cfi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
valueKey	TokenNameIdentifier	 value Key
,	TokenNameCOMMA	
cfi	TokenNameIdentifier	 cfi
,	TokenNameCOMMA	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
nullUpdater	TokenNameIdentifier	 null Updater
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeIndex	TokenNameIdentifier	 remove Index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExecutionException	TokenNameIdentifier	 Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
long	TokenNamelong	
truncatedAt	TokenNameIdentifier	 truncated At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
discardSSTables	TokenNameIdentifier	 discard SS Tables
(	TokenNameLPAREN	
truncatedAt	TokenNameIdentifier	 truncated At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
getIndexCfs	TokenNameIdentifier	 get Index Cfs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexCfs	TokenNameIdentifier	 index Cfs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLiveSize	TokenNameIdentifier	 get Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
getMemtableDataSize	TokenNameIdentifier	 get Memtable Data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reload	TokenNameIdentifier	 reload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
reloadSecondaryIndexMetadata	TokenNameIdentifier	 reload Secondary Index Metadata
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexCfs	TokenNameIdentifier	 index Cfs
.	TokenNameDOT	
reload	TokenNameIdentifier	 reload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
