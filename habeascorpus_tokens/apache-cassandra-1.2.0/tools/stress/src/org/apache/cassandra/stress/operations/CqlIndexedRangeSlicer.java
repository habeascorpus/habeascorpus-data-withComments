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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
CqlRow	TokenNameIdentifier	 Cql Row
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
CqlIndexedRangeSlicer	TokenNameIdentifier	 Cql Indexed Range Slicer
extends	TokenNameextends	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cqlQuery	TokenNameIdentifier	 cql Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CqlIndexedRangeSlicer	TokenNameIdentifier	 Cql Indexed Range Slicer
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
values	TokenNameIdentifier	 values
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
generateValues	TokenNameIdentifier	 generate Values
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" WHERE C1="	TokenNameStringLiteral	 WHERE C1=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getUnQuotedCqlBlob	TokenNameIdentifier	 get Un Quoted Cql Blob
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" AND KEY > ? LIMIT "	TokenNameStringLiteral	 AND KEY > ? LIMIT 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getKeysPerCall	TokenNameIdentifier	 get Keys Per Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cqlQuery	TokenNameIdentifier	 cql Query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%0"	TokenNameStringLiteral	%0
+	TokenNamePLUS	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getTotalKeysLength	TokenNameIdentifier	 get Total Keys Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"d"	TokenNameStringLiteral	d
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expectedPerValue	TokenNameIdentifier	 expected Per Value
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getNumKeys	TokenNameIdentifier	 get Num Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
received	TokenNameIdentifier	 received
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
received	TokenNameIdentifier	 received
<	TokenNameLESS	
expectedPerValue	TokenNameIdentifier	 expected Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
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
CqlResult	TokenNameIdentifier	 Cql Result
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formattedQuery	TokenNameIdentifier	 formatted Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
queryParms	TokenNameIdentifier	 query Parms
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
getUnQuotedCqlBlob	TokenNameIdentifier	 get Un Quoted Cql Blob
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_prepared_cql3_query	TokenNameIdentifier	 execute prepared cql3 query
(	TokenNameLPAREN	
stmntId	TokenNameIdentifier	 stmnt Id
,	TokenNameCOMMA	
queryParamsAsByteBuffer	TokenNameIdentifier	 query Params As Byte Buffer
(	TokenNameLPAREN	
queryParms	TokenNameIdentifier	 query Parms
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
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
execute_prepared_cql_query	TokenNameIdentifier	 execute prepared cql query
(	TokenNameLPAREN	
stmntId	TokenNameIdentifier	 stmnt Id
,	TokenNameCOMMA	
queryParamsAsByteBuffer	TokenNameIdentifier	 query Params As Byte Buffer
(	TokenNameLPAREN	
queryParms	TokenNameIdentifier	 query Parms
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
queryParms	TokenNameIdentifier	 query Parms
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
results	TokenNameIdentifier	 results
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
results	TokenNameIdentifier	 results
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
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"Operation [%d] retried %d times - error executing indexed range query with offset %s %s%n"	TokenNameStringLiteral	Operation [%d] retried %d times - error executing indexed range query with offset %s %s%n
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRetryTimes	TokenNameIdentifier	 get Retry Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
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
received	TokenNameIdentifier	 received
+=	TokenNamePLUS_EQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert max key found back to an integer, and increment it 	TokenNameCOMMENT_LINE	convert max key found back to an integer, and increment it 
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
getMaxKey	TokenNameIdentifier	 get Max Key
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get maximum key from CqlRow list * @param rows list of the CqlRow objects * @return maximum key value of the list */	TokenNameCOMMENT_JAVADOC	 Get maximum key from CqlRow list @param rows list of the CqlRow objects @return maximum key value of the list 
private	TokenNameprivate	
int	TokenNameint	
getMaxKey	TokenNameIdentifier	 get Max Key
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CqlRow	TokenNameIdentifier	 Cql Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxKey	TokenNameIdentifier	 max Key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CqlRow	TokenNameIdentifier	 Cql Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentKey	TokenNameIdentifier	 current Key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
>	TokenNameGREATER	
maxKey	TokenNameIdentifier	 max Key
)	TokenNameRPAREN	
maxKey	TokenNameIdentifier	 max Key
=	TokenNameEQUAL	
currentKey	TokenNameIdentifier	 current Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
maxKey	TokenNameIdentifier	 max Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
