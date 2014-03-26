/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionManager	TokenNameIdentifier	 Compaction Manager
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
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RangeTombstoneTest	TokenNameIdentifier	 Range Tombstone Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KSNAME	TokenNameIdentifier	 KSNAME
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CFNAME	TokenNameIdentifier	 CFNAME
=	TokenNameEQUAL	
"StandardInteger1"	TokenNameStringLiteral	StandardInteger1
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
simpleQueryWithRangeTombstoneTest	TokenNameIdentifier	 simple Query With Range Tombstone Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Inserting data 	TokenNameCOMMENT_LINE	Inserting data 
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"k1"	TokenNameStringLiteral	k1
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addOrGet	TokenNameIdentifier	 add Or Get
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addOrGet	TokenNameIdentifier	 add Or Get
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We don't flush to test with both a range tomsbtone in memtable and in sstable 	TokenNameCOMMENT_LINE	We don't flush to test with both a range tomsbtone in memtable and in sstable 
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Queries by name 	TokenNameCOMMENT_LINE	Queries by name 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
live	TokenNameIdentifier	 live
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dead	TokenNameIdentifier	 dead
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
live	TokenNameIdentifier	 live
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
dead	TokenNameIdentifier	 dead
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
getNamesFilter	TokenNameIdentifier	 get Names Filter
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
live	TokenNameIdentifier	 live
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
dead	TokenNameIdentifier	 dead
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" shouldn't be live"	TokenNameStringLiteral	 shouldn't be live
;	TokenNameSEMICOLON	
// Queries by slices 	TokenNameCOMMENT_LINE	Queries by slices 
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
getSliceFilter	TokenNameIdentifier	 get Slice Filter
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" shouldn't be live"	TokenNameStringLiteral	 shouldn't be live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
overlappingRangeTest	TokenNameIdentifier	 overlapping Range Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
disableAutoCompaction	TokenNameIdentifier	 disable Auto Compaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Inserting data 	TokenNameCOMMENT_LINE	Inserting data 
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"k2"	TokenNameStringLiteral	k2
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addOrGet	TokenNameIdentifier	 add Or Get
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addOrGet	TokenNameIdentifier	 add Or Get
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addOrGet	TokenNameIdentifier	 add Or Get
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryPath	TokenNameIdentifier	 Query Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
getIdentityFilter	TokenNameIdentifier	 get Identity Filter
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" shouldn't be live"	TokenNameStringLiteral	 shouldn't be live
;	TokenNameSEMICOLON	
// Compact everything and re-test 	TokenNameCOMMENT_LINE	Compact everything and re-test 
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
performMaximal	TokenNameIdentifier	 perform Maximal
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
getIdentityFilter	TokenNameIdentifier	 get Identity Filter
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" should be live"	TokenNameStringLiteral	 should be live
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Column "	TokenNameStringLiteral	Column 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" shouldn't be live"	TokenNameStringLiteral	 shouldn't be live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
insertData	TokenNameIdentifier	 insert Data
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
CFNAME	TokenNameIdentifier	 CFNAME
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
int	TokenNameint	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
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
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
