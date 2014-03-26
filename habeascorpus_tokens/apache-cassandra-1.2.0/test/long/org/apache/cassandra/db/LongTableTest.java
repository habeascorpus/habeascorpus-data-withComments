/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
QueryFilter	TokenNameIdentifier	 Query Filter
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
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LongTableTest	TokenNameIdentifier	 Long Table Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetRowMultiColumn	TokenNameIdentifier	 test Get Row Multi Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
final	TokenNamefinal	
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfStore	TokenNameIdentifier	 cf Store
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
100	TokenNameIntegerLiteral	
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
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
"v"	TokenNameStringLiteral	v
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
applyUnsafe	TokenNameIdentifier	 apply Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Runnable	TokenNameIdentifier	 Runnable
verify	TokenNameIdentifier	 verify
=	TokenNameEQUAL	
new	TokenNamenew	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
cfStore	TokenNameIdentifier	 cf Store
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
QueryFilter	TokenNameIdentifier	 Query Filter
.	TokenNameDOT	
getNamesFilter	TokenNameIdentifier	 get Names Filter
(	TokenNameLPAREN	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TableTest	TokenNameIdentifier	 Table Test
.	TokenNameDOT	
assertColumns	TokenNameIdentifier	 assert Columns
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
TableTest	TokenNameIdentifier	 Table Test
.	TokenNameDOT	
reTest	TokenNameIdentifier	 re Test
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
verify	TokenNameIdentifier	 verify
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
