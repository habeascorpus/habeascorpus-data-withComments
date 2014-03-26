/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
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
RowMutation	TokenNameIdentifier	 Row Mutation
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
QueryPath	TokenNameIdentifier	 Query Path
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
public	TokenNamepublic	
class	TokenNameclass	
CassandraServerTest	TokenNameIdentifier	 Cassandra Server Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
/** * test get_count() to work correctly with 'count' settings around page size. * (CASSANDRA-4833) */	TokenNameCOMMENT_JAVADOC	 test get_count() to work correctly with 'count' settings around page size. (CASSANDRA-4833) 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test_get_count	TokenNameIdentifier	 test get count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Schema are now written on disk and will be reloaded 	TokenNameCOMMENT_LINE	Schema are now written on disk and will be reloaded 
new	TokenNamenew	
EmbeddedCassandraService	TokenNameIdentifier	 Embedded Cassandra Service
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
setCurrentSocket	TokenNameIdentifier	 set Current Socket
(	TokenNameLPAREN	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
9160	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"testkey"	TokenNameStringLiteral	testkey
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
3050	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CassandraServer	TokenNameIdentifier	 Cassandra Server
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
CassandraServer	TokenNameIdentifier	 Cassandra Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
set_keyspace	TokenNameIdentifier	 set keyspace
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same as page size 	TokenNameCOMMENT_LINE	same as page size 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
get_count	TokenNameIdentifier	 get count
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnParent	TokenNameIdentifier	 Column Parent
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
1024	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expected 1024 but was "	TokenNameStringLiteral	expected 1024 but was 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// 1 above page size 	TokenNameCOMMENT_LINE	1 above page size 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
get_count	TokenNameIdentifier	 get count
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnParent	TokenNameIdentifier	 Column Parent
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
1025	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
1025	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expected 1025 but was "	TokenNameStringLiteral	expected 1025 but was 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// above number of columns 	TokenNameCOMMENT_LINE	above number of columns 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
get_count	TokenNameIdentifier	 get count
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnParent	TokenNameIdentifier	 Column Parent
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3050	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expected 3050 but was "	TokenNameStringLiteral	expected 3050 but was 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// same as number of columns 	TokenNameCOMMENT_LINE	same as number of columns 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
get_count	TokenNameIdentifier	 get count
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnParent	TokenNameIdentifier	 Column Parent
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
3050	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3050	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expected 3050 but was "	TokenNameStringLiteral	expected 3050 but was 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// 1 above number of columns 	TokenNameCOMMENT_LINE	1 above number of columns 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
get_count	TokenNameIdentifier	 get count
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnParent	TokenNameIdentifier	 Column Parent
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
3051	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3050	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"expected 3050 but was "	TokenNameStringLiteral	expected 3050 but was 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
predicateWithCount	TokenNameIdentifier	 predicate With Count
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SliceRange	TokenNameIdentifier	 Slice Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
new	TokenNamenew	
SliceRange	TokenNameIdentifier	 Slice Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
setFinish	TokenNameIdentifier	 set Finish
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
setCount	TokenNameIdentifier	 set Count
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
predicate	TokenNameIdentifier	 predicate
=	TokenNameEQUAL	
new	TokenNamenew	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
predicate	TokenNameIdentifier	 predicate
.	TokenNameDOT	
setSlice_range	TokenNameIdentifier	 set Slice range
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
predicate	TokenNameIdentifier	 predicate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
