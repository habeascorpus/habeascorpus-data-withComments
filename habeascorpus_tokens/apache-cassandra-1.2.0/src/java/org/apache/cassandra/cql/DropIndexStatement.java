/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
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
*	TokenNameMULTIPLY	
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
indexName	TokenNameIdentifier	 index Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
indexName	TokenNameIdentifier	 index Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexName	TokenNameIdentifier	 index Name
=	TokenNameEQUAL	
indexName	TokenNameIdentifier	 index Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyspace	TokenNameIdentifier	 set Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
findIndexedCF	TokenNameIdentifier	 find Indexed CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CFMetaData	TokenNameIdentifier	 CF Meta Data
generateCFMetadataUpdate	TokenNameIdentifier	 generate CF Metadata Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
updateCFMetadata	TokenNameIdentifier	 update CF Metadata
(	TokenNameLPAREN	
findIndexedCF	TokenNameIdentifier	 find Indexed CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CFMetaData	TokenNameIdentifier	 CF Meta Data
updateCFMetadata	TokenNameIdentifier	 update CF Metadata
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
findIndexedColumn	TokenNameIdentifier	 find Indexed Column
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
column	TokenNameIdentifier	 column
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnDefinition	TokenNameIdentifier	 Column Definition
toChange	TokenNameIdentifier	 to Change
=	TokenNameEQUAL	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
toChange	TokenNameIdentifier	 to Change
.	TokenNameDOT	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
toChange	TokenNameIdentifier	 to Change
.	TokenNameDOT	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
indexName	TokenNameIdentifier	 index Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toChange	TokenNameIdentifier	 to Change
.	TokenNameDOT	
setIndexName	TokenNameIdentifier	 set Index Name
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toChange	TokenNameIdentifier	 to Change
.	TokenNameDOT	
setIndexType	TokenNameIdentifier	 set Index Type
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cloned	TokenNameIdentifier	 cloned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CFMetaData	TokenNameIdentifier	 CF Meta Data
findIndexedCF	TokenNameIdentifier	 find Indexed CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
KSMetaData	TokenNameIdentifier	 KS Meta Data
ksm	TokenNameIdentifier	 ksm
=	TokenNameEQUAL	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
:	TokenNameCOLON	
ksm	TokenNameIdentifier	 ksm
.	TokenNameDOT	
cfMetaData	TokenNameIdentifier	 cf Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
findIndexedColumn	TokenNameIdentifier	 find Indexed Column
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Index '"	TokenNameStringLiteral	Index '
+	TokenNamePLUS	
indexName	TokenNameIdentifier	 index Name
+	TokenNamePLUS	
"' could not be found in any of the column families of keyspace '"	TokenNameStringLiteral	' could not be found in any of the column families of keyspace '
+	TokenNamePLUS	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ColumnDefinition	TokenNameIdentifier	 Column Definition
findIndexedColumn	TokenNameIdentifier	 find Indexed Column
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getIndexType	TokenNameIdentifier	 get Index Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
indexName	TokenNameIdentifier	 index Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
