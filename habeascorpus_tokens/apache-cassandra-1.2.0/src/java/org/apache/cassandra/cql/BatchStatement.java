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
LinkedList	TokenNameIdentifier	 Linked List
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
IMutation	TokenNameIdentifier	 I Mutation
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
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
ThriftClientState	TokenNameIdentifier	 Thrift Client State
;	TokenNameSEMICOLON	
/** * A <code>BATCH</code> statement parsed from a CQL query. * */	TokenNameCOMMENT_JAVADOC	 A <code>BATCH</code> statement parsed from a CQL query. 
public	TokenNamepublic	
class	TokenNameclass	
BatchStatement	TokenNameIdentifier	 Batch Statement
{	TokenNameLBRACE	
// statements to execute 	TokenNameCOMMENT_LINE	statements to execute 
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractModification	TokenNameIdentifier	 Abstract Modification
>	TokenNameGREATER	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
// global consistency level 	TokenNameCOMMENT_LINE	global consistency level 
protected	TokenNameprotected	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
;	TokenNameSEMICOLON	
// global timestamp to apply for each mutation 	TokenNameCOMMENT_LINE	global timestamp to apply for each mutation 
protected	TokenNameprotected	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
// global time to live 	TokenNameCOMMENT_LINE	global time to live 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
/** * Creates a new BatchStatement from a list of statements and a * Thrift consistency level. * * @param statements a list of UpdateStatements * @param attrs additional attributes for statement (CL, timestamp, timeToLive) */	TokenNameCOMMENT_JAVADOC	 Creates a new BatchStatement from a list of statements and a Thrift consistency level. * @param statements a list of UpdateStatements @param attrs additional attributes for statement (CL, timestamp, timeToLive) 
public	TokenNamepublic	
BatchStatement	TokenNameIdentifier	 Batch Statement
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractModification	TokenNameIdentifier	 Abstract Modification
>	TokenNameGREATER	
statements	TokenNameIdentifier	 statements
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
=	TokenNameEQUAL	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consistency	TokenNameIdentifier	 consistency
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timeToLive	TokenNameIdentifier	 time To Live
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractModification	TokenNameIdentifier	 Abstract Modification
>	TokenNameGREATER	
getStatements	TokenNameIdentifier	 get Statements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
consistency	TokenNameIdentifier	 consistency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
getMutations	TokenNameIdentifier	 get Mutations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
clientState	TokenNameIdentifier	 client State
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
batch	TokenNameIdentifier	 batch
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
AbstractModification	TokenNameIdentifier	 Abstract Modification
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
batch	TokenNameIdentifier	 batch
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
prepareRowMutations	TokenNameIdentifier	 prepare Row Mutations
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
clientState	TokenNameIdentifier	 client State
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
batch	TokenNameIdentifier	 batch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSetTimestamp	TokenNameIdentifier	 is Set Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
"BatchStatement(statements=%s, consistency=%s)"	TokenNameStringLiteral	BatchStatement(statements=%s, consistency=%s)
,	TokenNameCOMMA	
statements	TokenNameIdentifier	 statements
,	TokenNameCOMMA	
consistency	TokenNameIdentifier	 consistency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
