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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
PerColumnSecondaryIndex	TokenNameIdentifier	 Per Column Secondary Index
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
PerRowSecondaryIndex	TokenNameIdentifier	 Per Row Secondary Index
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
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
Column	TokenNameIdentifier	 Column
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertFalse	TokenNameIdentifier	 assert False
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SecondaryIndexColumnSizeTest	TokenNameIdentifier	 Secondary Index Column Size Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test64kColumn	TokenNameIdentifier	 test64k Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Column	TokenNameIdentifier	 Column
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a byte buffer more than 64k 	TokenNameCOMMENT_LINE	a byte buffer more than 64k 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//read more than 64k 	TokenNameCOMMENT_LINE	read more than 64k 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
64	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putInt	TokenNameIdentifier	 put Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for read 	TokenNameCOMMENT_LINE	for read 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
MockRowIndex	TokenNameIdentifier	 Mock Row Index
mockRowIndex	TokenNameIdentifier	 mock Row Index
=	TokenNameEQUAL	
new	TokenNamenew	
MockRowIndex	TokenNameIdentifier	 Mock Row Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MockColumnIndex	TokenNameIdentifier	 Mock Column Index
mockColumnIndex	TokenNameIdentifier	 mock Column Index
=	TokenNameEQUAL	
new	TokenNamenew	
MockColumnIndex	TokenNameIdentifier	 Mock Column Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mockRowIndex	TokenNameIdentifier	 mock Row Index
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
mockColumnIndex	TokenNameIdentifier	 mock Column Index
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test less than 64k value 	TokenNameCOMMENT_LINE	test less than 64k value 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putInt	TokenNameIdentifier	 put Int
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mockRowIndex	TokenNameIdentifier	 mock Row Index
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mockColumnIndex	TokenNameIdentifier	 mock Column Index
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
MockRowIndex	TokenNameIdentifier	 Mock Row Index
extends	TokenNameextends	
PerRowSecondaryIndex	TokenNameIdentifier	 Per Row Secondary Index
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
validateOptions	TokenNameIdentifier	 validate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
createSecondaryIndexSearcher	TokenNameIdentifier	 create Secondary Index Searcher
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getLiveSize	TokenNameIdentifier	 get Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
getIndexCfs	TokenNameIdentifier	 get Index Cfs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
removeIndex	TokenNameIdentifier	 remove Index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
long	TokenNamelong	
truncatedAt	TokenNameIdentifier	 truncated At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reload	TokenNameIdentifier	 reload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
MockColumnIndex	TokenNameIdentifier	 Mock Column Index
extends	TokenNameextends	
PerColumnSecondaryIndex	TokenNameIdentifier	 Per Column Secondary Index
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
validateOptions	TokenNameIdentifier	 validate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
createSecondaryIndexSearcher	TokenNameIdentifier	 create Secondary Index Searcher
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getLiveSize	TokenNameIdentifier	 get Live Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
getIndexCfs	TokenNameIdentifier	 get Index Cfs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
removeIndex	TokenNameIdentifier	 remove Index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
long	TokenNamelong	
truncatedAt	TokenNameIdentifier	 truncated At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reload	TokenNameIdentifier	 reload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
