/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilenameFilter	TokenNameIdentifier	 Filename Filter
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
context	TokenNameIdentifier	 context
.	TokenNameDOT	
CounterContext	TokenNameIdentifier	 Counter Context
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
IPartitioner	TokenNameIdentifier	 I Partitioner
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
CounterId	TokenNameIdentifier	 Counter Id
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSSTableSimpleWriter	TokenNameIdentifier	 Abstract SS Table Simple Writer
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DecoratedKey	TokenNameIdentifier	 Decorated Key
currentKey	TokenNameIdentifier	 current Key
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ColumnFamily	TokenNameIdentifier	 Column Family
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SuperColumn	TokenNameIdentifier	 Super Column
currentSuperColumn	TokenNameIdentifier	 current Super Column
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
CounterId	TokenNameIdentifier	 Counter Id
counterid	TokenNameIdentifier	 counterid
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
generate	TokenNameIdentifier	 generate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractSSTableSimpleWriter	TokenNameIdentifier	 Abstract SS Table Simple Writer
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
setPartitioner	TokenNameIdentifier	 set Partitioner
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
(	TokenNameLPAREN	
makeFilename	TokenNameIdentifier	 make Filename
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// We don't care about the bloom filter 	TokenNameCOMMENT_LINE	We don't care about the bloom filter 
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
createCollector	TokenNameIdentifier	 create Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find available generation and pick up filename from that 	TokenNameCOMMENT_LINE	find available generation and pick up filename from that 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
makeFilename	TokenNameIdentifier	 make Filename
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
>	TokenNameGREATER	
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
new	TokenNamenew	
FilenameFilter	TokenNameIdentifier	 Filename Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
,	TokenNameCOMMA	
Component	TokenNameIdentifier	 Component
>	TokenNameGREATER	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
tryComponentFromFilename	TokenNameIdentifier	 try Component From Filename
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
)	TokenNameRPAREN	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxGen	TokenNameIdentifier	 max Gen
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
:	TokenNameCOLON	
existing	TokenNameIdentifier	 existing
)	TokenNameRPAREN	
maxGen	TokenNameIdentifier	 max Gen
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxGen	TokenNameIdentifier	 max Gen
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
maxGen	TokenNameIdentifier	 max Gen
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Start a new row whose key is {@code key}. * @param key the row key */	TokenNameCOMMENT_JAVADOC	 Start a new row whose key is {@code key}. @param key the row key 
public	TokenNamepublic	
void	TokenNamevoid	
newRow	TokenNameIdentifier	 new Row
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
writeRow	TokenNameIdentifier	 write Row
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentKey	TokenNameIdentifier	 current Key
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Start a new super column with name {@code name}. * @param name the name for the super column */	TokenNameCOMMENT_JAVADOC	 Start a new super column with name {@code name}. @param name the name for the super column 
public	TokenNamepublic	
void	TokenNamevoid	
newSuperColumn	TokenNameIdentifier	 new Super Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Cannot add a super column to a standard column family"	TokenNameStringLiteral	Cannot add a super column to a standard column family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentSuperColumn	TokenNameIdentifier	 current Super Column
=	TokenNameEQUAL	
new	TokenNamenew	
SuperColumn	TokenNameIdentifier	 Super Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
subcolumnComparator	TokenNameIdentifier	 subcolumn Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
currentSuperColumn	TokenNameIdentifier	 current Super Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
currentSuperColumn	TokenNameIdentifier	 current Super Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Trying to add a column to a super column family, but no super column has been started."	TokenNameStringLiteral	Trying to add a column to a super column family, but no super column has been started.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
currentSuperColumn	TokenNameIdentifier	 current Super Column
:	TokenNameCOLON	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a new "regular" column to the current row (and super column if applicable). * @param name the column name * @param value the column value * @param timestamp the column timestamp */	TokenNameCOMMENT_JAVADOC	 Insert a new "regular" column to the current row (and super column if applicable). @param name the column name @param value the column value @param timestamp the column timestamp 
public	TokenNamepublic	
void	TokenNamevoid	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a new expiring column to the current row (and super column if applicable). * @param name the column name * @param value the column value * @param timestamp the column timestamp * @param ttl the column time to live in seconds * @param expirationTimestampMS the local expiration timestamp in milliseconds. This is the server time timestamp used for actually * expiring the column, and as a consequence should be synchronized with the cassandra servers time. If {@code timestamp} represents * the insertion time in microseconds (which is not required), this should be {@code (timestamp / 1000) + (ttl * 1000)}. */	TokenNameCOMMENT_JAVADOC	 Insert a new expiring column to the current row (and super column if applicable). @param name the column name @param value the column value @param timestamp the column timestamp @param ttl the column time to live in seconds @param expirationTimestampMS the local expiration timestamp in milliseconds. This is the server time timestamp used for actually expiring the column, and as a consequence should be synchronized with the cassandra servers time. If {@code timestamp} represents the insertion time in microseconds (which is not required), this should be {@code (timestamp / 1000) + (ttl 1000)}. 
public	TokenNamepublic	
void	TokenNamevoid	
addExpiringColumn	TokenNameIdentifier	 add Expiring Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
int	TokenNameint	
ttl	TokenNameIdentifier	 ttl
,	TokenNameCOMMA	
long	TokenNamelong	
expirationTimestampMS	TokenNameIdentifier	 expiration Timestamp MS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
ttl	TokenNameIdentifier	 ttl
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
expirationTimestampMS	TokenNameIdentifier	 expiration Timestamp MS
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a new counter column to the current row (and super column if applicable). * @param name the column name * @param value the value of the counter */	TokenNameCOMMENT_JAVADOC	 Insert a new counter column to the current row (and super column if applicable). @param name the column name @param value the value of the counter 
public	TokenNamepublic	
void	TokenNamevoid	
addCounterColumn	TokenNameIdentifier	 add Counter Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
CounterContext	TokenNameIdentifier	 Counter Context
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
counterid	TokenNameIdentifier	 counterid
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close this writer. * This method should be called, otherwise the produced sstables are not * guaranteed to be complete (and won't be in practice). */	TokenNameCOMMENT_JAVADOC	 Close this writer. This method should be called, otherwise the produced sstables are not guaranteed to be complete (and won't be in practice). 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
writeRow	TokenNameIdentifier	 write Row
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
ColumnFamily	TokenNameIdentifier	 Column Family
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
