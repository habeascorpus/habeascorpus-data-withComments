/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Util	TokenNameIdentifier	 Util
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
IntegerType	TokenNameIdentifier	 Integer Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableSimpleWriterTest	TokenNameIdentifier	 SS Table Simple Writer Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSSTableSimpleUnsortedWriter	TokenNameIdentifier	 test SS Table Simple Unsorted Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
INC	TokenNameIdentifier	 INC
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
NBCOL	TokenNameIdentifier	 NBCOL
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tablename	TokenNameIdentifier	 tablename
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
=	TokenNameEQUAL	
"StandardInteger1"	TokenNameStringLiteral	StandardInteger1
;	TokenNameSEMICOLON	
Table	TokenNameIdentifier	 Table
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
tablename	TokenNameIdentifier	 tablename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure we create the directory 	TokenNameCOMMENT_LINE	make sure we create the directory 
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirectoryForNewSSTables	TokenNameIdentifier	 get Directory For New SS Tables
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableSimpleUnsortedWriter	TokenNameIdentifier	 SS Table Simple Unsorted Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableSimpleUnsortedWriter	TokenNameIdentifier	 SS Table Simple Unsorted Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Adding a few rows first 	TokenNameCOMMENT_LINE	Adding a few rows first 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newRow	TokenNameIdentifier	 new Row
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Key"	TokenNameStringLiteral	Key
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Testing multiple opening of the same row 	TokenNameCOMMENT_LINE	Testing multiple opening of the same row 
// We'll write column 0, 5, 10, .., on the first row, then 1, 6, 11, ... on the second one, etc. 	TokenNameCOMMENT_LINE	We'll write column 0, 5, 10, .., on the first row, then 1, 6, 11, ... on the second one, etc. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
INC	TokenNameIdentifier	 INC
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newRow	TokenNameIdentifier	 new Row
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Key"	TokenNameStringLiteral	Key
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
NBCOL	TokenNameIdentifier	 NBCOL
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
INC	TokenNameIdentifier	 INC
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Adding a few more rows 	TokenNameCOMMENT_LINE	Adding a few more rows 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newRow	TokenNameIdentifier	 new Row
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Key"	TokenNameStringLiteral	Key
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now add that newly created files to the column family 	TokenNameCOMMENT_LINE	Now add that newly created files to the column family 
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
loadNewSSTables	TokenNameIdentifier	 load New SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check we get expected results 	TokenNameCOMMENT_LINE	Check we get expected results 
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"Key10"	TokenNameStringLiteral	Key10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
INC	TokenNameIdentifier	 INC
*	TokenNameMULTIPLY	
NBCOL	TokenNameIdentifier	 NBCOL
:	TokenNameCOLON	
"expecting "	TokenNameStringLiteral	expecting 
+	TokenNamePLUS	
(	TokenNameLPAREN	
INC	TokenNameIdentifier	 INC
*	TokenNameMULTIPLY	
NBCOL	TokenNameIdentifier	 NBCOL
)	TokenNameRPAREN	
+	TokenNamePLUS	
" columns, got "	TokenNameStringLiteral	 columns, got 
+	TokenNamePLUS	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
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
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
"Column name should be "	TokenNameStringLiteral	Column name should be 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
", got "	TokenNameStringLiteral	, got 
+	TokenNamePLUS	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"Key19"	TokenNameStringLiteral	Key19
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expecting 3 columns, got "	TokenNameStringLiteral	expecting 3 columns, got 
+	TokenNamePLUS	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
