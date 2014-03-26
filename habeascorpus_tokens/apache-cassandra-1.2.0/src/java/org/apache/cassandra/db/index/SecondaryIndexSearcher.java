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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
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
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
indexManager	TokenNameIdentifier	 index Manager
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
baseCfs	TokenNameIdentifier	 base Cfs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
(	TokenNameLPAREN	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
indexManager	TokenNameIdentifier	 index Manager
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
=	TokenNameEQUAL	
indexManager	TokenNameIdentifier	 index Manager
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseCfs	TokenNameIdentifier	 base Cfs
=	TokenNameEQUAL	
indexManager	TokenNameIdentifier	 index Manager
.	TokenNameDOT	
baseCfs	TokenNameIdentifier	 base Cfs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
,	TokenNameCOMMA	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
dataFilter	TokenNameIdentifier	 data Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
countCQL3Rows	TokenNameIdentifier	 count CQ L3 Rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true this index is able to handle given clauses. */	TokenNameCOMMENT_JAVADOC	 @return true this index is able to handle given clauses. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isIndexing	TokenNameIdentifier	 is Indexing
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexExpression	TokenNameIdentifier	 Index Expression
>	TokenNameGREATER	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isIndexValueStale	TokenNameIdentifier	 is Index Value Stale
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
liveData	TokenNameIdentifier	 live Data
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
indexedColumnName	TokenNameIdentifier	 indexed Column Name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
indexedValue	TokenNameIdentifier	 indexed Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
liveColumn	TokenNameIdentifier	 live Column
=	TokenNameEQUAL	
liveData	TokenNameIdentifier	 live Data
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
indexedColumnName	TokenNameIdentifier	 indexed Column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
liveColumn	TokenNameIdentifier	 live Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
liveColumn	TokenNameIdentifier	 live Column
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
liveValue	TokenNameIdentifier	 live Value
=	TokenNameEQUAL	
liveColumn	TokenNameIdentifier	 live Column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
liveData	TokenNameIdentifier	 live Data
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueValidator	TokenNameIdentifier	 get Value Validator
(	TokenNameLPAREN	
indexedColumnName	TokenNameIdentifier	 indexed Column Name
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
indexedValue	TokenNameIdentifier	 indexed Value
,	TokenNameCOMMA	
liveValue	TokenNameIdentifier	 live Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
