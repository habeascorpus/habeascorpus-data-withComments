package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Collections	TokenNameIdentifier	 Collections
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamilyType	TokenNameIdentifier	 Column Family Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
Session	TokenNameIdentifier	 Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CassandraClient	TokenNameIdentifier	 Cassandra Client
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Operation	TokenNameIdentifier	 Operation
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
Compression	TokenNameIdentifier	 Compression
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
CqlResult	TokenNameIdentifier	 Cql Result
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CqlRangeSlicer	TokenNameIdentifier	 Cql Range Slicer
extends	TokenNameextends	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cqlQuery	TokenNameIdentifier	 cql Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CqlRangeSlicer	TokenNameIdentifier	 Cql Range Slicer
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
CassandraClient	TokenNameIdentifier	 Cassandra Client
client	TokenNameIdentifier	 client
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getColumnFamilyType	TokenNameIdentifier	 get Column Family Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ColumnFamilyType	TokenNameIdentifier	 Column Family Type
.	TokenNameDOT	
Super	TokenNameIdentifier	 Super
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Super columns are not implemented for CQL"	TokenNameStringLiteral	Super columns are not implemented for CQL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cqlQuery	TokenNameIdentifier	 cql Query
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"SELECT FIRST "	TokenNameStringLiteral	SELECT FIRST 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getColumnsPerKey	TokenNameIdentifier	 get Columns Per Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ''..'' FROM Standard1"	TokenNameStringLiteral	 ''..'' FROM Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
cqlVersion	TokenNameIdentifier	 cql Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" USING CONSISTENCY "	TokenNameStringLiteral	 USING CONSISTENCY 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cqlQuery	TokenNameIdentifier	 cql Query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" WHERE KEY > ?"	TokenNameStringLiteral	 WHERE KEY > ?
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%0"	TokenNameStringLiteral	%0
+	TokenNamePLUS	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getTotalKeysLength	TokenNameIdentifier	 get Total Keys Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formattedQuery	TokenNameIdentifier	 formatted Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
exceptionMessage	TokenNameIdentifier	 exception Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
rowCount	TokenNameIdentifier	 row Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRetryTimes	TokenNameIdentifier	 get Retry Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CqlResult	TokenNameIdentifier	 Cql Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
usePreparedStatements	TokenNameIdentifier	 use Prepared Statements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
stmntId	TokenNameIdentifier	 stmnt Id
=	TokenNameEQUAL	
getPreparedStatement	TokenNameIdentifier	 get Prepared Statement
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
cqlQuery	TokenNameIdentifier	 cql Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
cqlVersion	TokenNameIdentifier	 cql Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_prepared_cql3_query	TokenNameIdentifier	 execute prepared cql3 query
(	TokenNameLPAREN	
stmntId	TokenNameIdentifier	 stmnt Id
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
getUnQuotedCqlBlob	TokenNameIdentifier	 get Un Quoted Cql Blob
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_prepared_cql_query	TokenNameIdentifier	 execute prepared cql query
(	TokenNameLPAREN	
stmntId	TokenNameIdentifier	 stmnt Id
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
getUnQuotedCqlBlob	TokenNameIdentifier	 get Un Quoted Cql Blob
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
formattedQuery	TokenNameIdentifier	 formatted Query
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
formattedQuery	TokenNameIdentifier	 formatted Query
=	TokenNameEQUAL	
formatCqlQuery	TokenNameIdentifier	 format Cql Query
(	TokenNameLPAREN	
cqlQuery	TokenNameIdentifier	 cql Query
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
getUnQuotedCqlBlob	TokenNameIdentifier	 get Un Quoted Cql Blob
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
cqlVersion	TokenNameIdentifier	 cql Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_cql3_query	TokenNameIdentifier	 execute cql3 query
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
formattedQuery	TokenNameIdentifier	 formatted Query
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Compression	TokenNameIdentifier	 Compression
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_cql_query	TokenNameIdentifier	 execute cql query
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
formattedQuery	TokenNameIdentifier	 formatted Query
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Compression	TokenNameIdentifier	 Compression
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rowCount	TokenNameIdentifier	 row Count
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
(	TokenNameLPAREN	
rowCount	TokenNameIdentifier	 row Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptionMessage	TokenNameIdentifier	 exception Message
=	TokenNameEQUAL	
getExceptionMessage	TokenNameIdentifier	 get Exception Message
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Operation [%d] retried %d times - error executing range slice with offset %s %s%n"	TokenNameStringLiteral	Operation [%d] retried %d times - error executing range slice with offset %s %s%n
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRetryTimes	TokenNameIdentifier	 get Retry Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
(	TokenNameLPAREN	
exceptionMessage	TokenNameIdentifier	 exception Message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
exceptionMessage	TokenNameIdentifier	 exception Message
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
getAndAdd	TokenNameIdentifier	 get And Add
(	TokenNameLPAREN	
rowCount	TokenNameIdentifier	 row Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
latency	TokenNameIdentifier	 latency
.	TokenNameDOT	
getAndAdd	TokenNameIdentifier	 get And Add
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
