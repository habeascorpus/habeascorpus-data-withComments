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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
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
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
/** * Encapsulates a completely parsed SELECT query, including the target * column family, expression, result count, and ordering clause. * */	TokenNameCOMMENT_JAVADOC	 Encapsulates a completely parsed SELECT query, including the target column family, expression, result count, and ordering clause. 
public	TokenNamepublic	
class	TokenNameclass	
SelectStatement	TokenNameIdentifier	 Select Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SelectExpression	TokenNameIdentifier	 Select Expression
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCountOper	TokenNameIdentifier	 is Count Oper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
WhereClause	TokenNameIdentifier	 Where Clause
clause	TokenNameIdentifier	 clause
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SelectStatement	TokenNameIdentifier	 Select Statement
(	TokenNameLPAREN	
SelectExpression	TokenNameIdentifier	 Select Expression
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCountOper	TokenNameIdentifier	 is Count Oper
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
WhereClause	TokenNameIdentifier	 Where Clause
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
int	TokenNameint	
numRecords	TokenNameIdentifier	 num Records
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isCountOper	TokenNameIdentifier	 is Count Oper
=	TokenNameEQUAL	
isCountOper	TokenNameIdentifier	 is Count Oper
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
new	TokenNamenew	
WhereClause	TokenNameIdentifier	 Where Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isKeyRange	TokenNameIdentifier	 is Key Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
isKeyRange	TokenNameIdentifier	 is Key Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getKeys	TokenNameIdentifier	 get Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getKeys	TokenNameIdentifier	 get Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getKeyStart	TokenNameIdentifier	 get Key Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getStartKey	TokenNameIdentifier	 get Start Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getKeyFinish	TokenNameIdentifier	 get Key Finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getFinishKey	TokenNameIdentifier	 get Finish Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
getColumnRelations	TokenNameIdentifier	 get Column Relations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getColumnRelations	TokenNameIdentifier	 get Column Relations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnRange	TokenNameIdentifier	 is Column Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
isColumnRange	TokenNameIdentifier	 is Column Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFullWildcard	TokenNameIdentifier	 is Full Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
hasFirstSet	TokenNameIdentifier	 has First Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getColumnNames	TokenNameIdentifier	 get Column Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
getColumns	TokenNameIdentifier	 get Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getColumnStart	TokenNameIdentifier	 get Column Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getColumnFinish	TokenNameIdentifier	 get Column Finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
getFinish	TokenNameIdentifier	 get Finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSetKeyspace	TokenNameIdentifier	 is Set Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnsReversed	TokenNameIdentifier	 is Columns Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
isColumnsReversed	TokenNameIdentifier	 is Columns Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumRecords	TokenNameIdentifier	 get Num Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnsLimit	TokenNameIdentifier	 get Columns Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
getColumnsLimit	TokenNameIdentifier	 get Columns Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCountOperation	TokenNameIdentifier	 is Count Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isCountOper	TokenNameIdentifier	 is Count Oper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
includeStartKey	TokenNameIdentifier	 include Start Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
includeStartKey	TokenNameIdentifier	 include Start Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
includeFinishKey	TokenNameIdentifier	 include Finish Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
includeFinishKey	TokenNameIdentifier	 include Finish Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyAlias	TokenNameIdentifier	 get Key Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getKeyAlias	TokenNameIdentifier	 get Key Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMultiKey	TokenNameIdentifier	 is Multi Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
isMultiKey	TokenNameIdentifier	 is Multi Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
extractKeyAliasFromColumns	TokenNameIdentifier	 extract Key Alias From Columns
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
extractKeysFromColumns	TokenNameIdentifier	 extract Keys From Columns
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getValueValidator	TokenNameIdentifier	 get Value Validator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getValueValidator	TokenNameIdentifier	 get Value Validator
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SelectStatement [expression=%s, isCountOper=%s, columnFamily=%s, keyspace=%s, cLevel=%s, clause=%s, numRecords=%s]"	TokenNameStringLiteral	SelectStatement [expression=%s, isCountOper=%s, columnFamily=%s, keyspace=%s, cLevel=%s, clause=%s, numRecords=%s]
,	TokenNameCOMMA	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
isCountOper	TokenNameIdentifier	 is Count Oper
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
clause	TokenNameIdentifier	 clause
,	TokenNameCOMMA	
numRecords	TokenNameIdentifier	 num Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
