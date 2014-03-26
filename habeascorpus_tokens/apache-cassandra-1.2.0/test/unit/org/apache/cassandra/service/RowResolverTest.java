package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
ColumnFamily	TokenNameIdentifier	 Column Family
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
DeletionInfo	TokenNameIdentifier	 Deletion Info
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
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
column	TokenNameIdentifier	 column
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
superColumn	TokenNameIdentifier	 super Column
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TableTest	TokenNameIdentifier	 Table Test
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RowResolverTest	TokenNameIdentifier	 Row Resolver Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveSupersetNewer	TokenNameIdentifier	 test Resolve Superset Newer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
,	TokenNameCOMMA	
"v1"	TokenNameStringLiteral	v1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
,	TokenNameCOMMA	
"v2"	TokenNameStringLiteral	v2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf2	TokenNameIdentifier	 cf2
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveSupersetDisjoint	TokenNameIdentifier	 test Resolve Superset Disjoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
,	TokenNameCOMMA	
"v1"	TokenNameStringLiteral	v1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c2"	TokenNameStringLiteral	c2
,	TokenNameCOMMA	
"v2"	TokenNameStringLiteral	v2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
,	TokenNameCOMMA	
"c2"	TokenNameStringLiteral	c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"c2"	TokenNameStringLiteral	c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf2	TokenNameIdentifier	 cf2
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveSupersetNullOne	TokenNameIdentifier	 test Resolve Superset Null One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c2"	TokenNameStringLiteral	c2
,	TokenNameCOMMA	
"v2"	TokenNameStringLiteral	v2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"c2"	TokenNameStringLiteral	c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"c2"	TokenNameStringLiteral	c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf2	TokenNameIdentifier	 cf2
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveSupersetNullTwo	TokenNameIdentifier	 test Resolve Superset Null Two
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
,	TokenNameCOMMA	
"v1"	TokenNameStringLiteral	v1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveSupersetNullBoth	TokenNameIdentifier	 test Resolve Superset Null Both
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveDeleted	TokenNameIdentifier	 test Resolve Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// one CF with columns timestamped before a delete in another cf 	TokenNameCOMMENT_LINE	one CF with columns timestamped before a delete in another cf 
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
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
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no columns in the cf 	TokenNameCOMMENT_LINE	no columns in the cf 
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
scf1	TokenNameIdentifier	 scf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf1	TokenNameIdentifier	 scf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
superColumn	TokenNameIdentifier	 super Column
(	TokenNameLPAREN	
scf1	TokenNameIdentifier	 scf1
,	TokenNameCOMMA	
"super-foo"	TokenNameStringLiteral	super-foo
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
scf2	TokenNameIdentifier	 scf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf2	TokenNameIdentifier	 scf2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
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
ColumnFamily	TokenNameIdentifier	 Column Family
superResolved	TokenNameIdentifier	 super Resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
scf1	TokenNameIdentifier	 scf1
,	TokenNameCOMMA	
scf2	TokenNameIdentifier	 scf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no columns in the cf 	TokenNameCOMMENT_LINE	no columns in the cf 
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveDeletedSuper	TokenNameIdentifier	 test Resolve Deleted Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// subcolumn is newer than a tombstone on its parent, but not newer than the row deletion 	TokenNameCOMMENT_LINE	subcolumn is newer than a tombstone on its parent, but not newer than the row deletion 
ColumnFamily	TokenNameIdentifier	 Column Family
scf1	TokenNameIdentifier	 scf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SuperColumn	TokenNameIdentifier	 Super Column
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
superColumn	TokenNameIdentifier	 super Column
(	TokenNameLPAREN	
scf1	TokenNameIdentifier	 scf1
,	TokenNameCOMMA	
"super-foo"	TokenNameStringLiteral	super-foo
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
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
scf1	TokenNameIdentifier	 scf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
scf2	TokenNameIdentifier	 scf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf2	TokenNameIdentifier	 scf2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
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
ColumnFamily	TokenNameIdentifier	 Column Family
superResolved	TokenNameIdentifier	 super Resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
scf1	TokenNameIdentifier	 scf1
,	TokenNameCOMMA	
scf2	TokenNameIdentifier	 scf2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no columns in the cf 	TokenNameCOMMENT_LINE	no columns in the cf 
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolveMultipleDeleted	TokenNameIdentifier	 test Resolve Multiple Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// deletes and columns with interleaved timestamp, with out of order return sequence 	TokenNameCOMMENT_LINE	deletes and columns with interleaved timestamp, with out of order return sequence 
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
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
// these columns created after the previous deletion 	TokenNameCOMMENT_LINE	these columns created after the previous deletion 
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//this column created after the next delete 	TokenNameCOMMENT_LINE	this column created after the next delete 
ColumnFamily	TokenNameIdentifier	 Column Family
cf3	TokenNameIdentifier	 cf3
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf3	TokenNameIdentifier	 cf3
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf4	TokenNameIdentifier	 cf4
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf4	TokenNameIdentifier	 cf4
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
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
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
,	TokenNameCOMMA	
cf2	TokenNameIdentifier	 cf2
,	TokenNameCOMMA	
cf3	TokenNameIdentifier	 cf3
,	TokenNameCOMMA	
cf4	TokenNameIdentifier	 cf4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// will have deleted marker and one column 	TokenNameCOMMENT_LINE	will have deleted marker and one column 
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertColumn	TokenNameIdentifier	 assert Column
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
scf1	TokenNameIdentifier	 scf1
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf1	TokenNameIdentifier	 scf1
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
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
// these columns created after the previous deletion 	TokenNameCOMMENT_LINE	these columns created after the previous deletion 
ColumnFamily	TokenNameIdentifier	 Column Family
scf2	TokenNameIdentifier	 scf2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf2	TokenNameIdentifier	 scf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
superColumn	TokenNameIdentifier	 super Column
(	TokenNameLPAREN	
scf2	TokenNameIdentifier	 scf2
,	TokenNameCOMMA	
"super1"	TokenNameStringLiteral	super1
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//these columns created after the next delete 	TokenNameCOMMENT_LINE	these columns created after the next delete 
ColumnFamily	TokenNameIdentifier	 Column Family
scf3	TokenNameIdentifier	 scf3
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf3	TokenNameIdentifier	 scf3
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
superColumn	TokenNameIdentifier	 super Column
(	TokenNameLPAREN	
scf3	TokenNameIdentifier	 scf3
,	TokenNameCOMMA	
"super1"	TokenNameStringLiteral	super1
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf3	TokenNameIdentifier	 scf3
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
superColumn	TokenNameIdentifier	 super Column
(	TokenNameLPAREN	
scf3	TokenNameIdentifier	 scf3
,	TokenNameCOMMA	
"super2"	TokenNameStringLiteral	super2
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
scf4	TokenNameIdentifier	 scf4
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Super1"	TokenNameStringLiteral	Super1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scf4	TokenNameIdentifier	 scf4
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
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
ColumnFamily	TokenNameIdentifier	 Column Family
superResolved	TokenNameIdentifier	 super Resolved
=	TokenNameEQUAL	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
scf1	TokenNameIdentifier	 scf1
,	TokenNameCOMMA	
scf2	TokenNameIdentifier	 scf2
,	TokenNameCOMMA	
scf3	TokenNameIdentifier	 scf3
,	TokenNameCOMMA	
scf4	TokenNameIdentifier	 scf4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// will have deleted marker and two super cols 	TokenNameCOMMENT_LINE	will have deleted marker and two super cols 
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super1"	TokenNameStringLiteral	super1
,	TokenNameCOMMA	
"super2"	TokenNameStringLiteral	super2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubColumns	TokenNameIdentifier	 assert Sub Columns
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super1"	TokenNameStringLiteral	super1
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubColumn	TokenNameIdentifier	 assert Sub Column
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super1"	TokenNameStringLiteral	super1
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubColumns	TokenNameIdentifier	 assert Sub Columns
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super2"	TokenNameStringLiteral	super2
,	TokenNameCOMMA	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubColumn	TokenNameIdentifier	 assert Sub Column
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super2"	TokenNameStringLiteral	super2
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubColumn	TokenNameIdentifier	 assert Sub Column
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
,	TokenNameCOMMA	
"super2"	TokenNameStringLiteral	super2
,	TokenNameCOMMA	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
superResolved	TokenNameIdentifier	 super Resolved
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
