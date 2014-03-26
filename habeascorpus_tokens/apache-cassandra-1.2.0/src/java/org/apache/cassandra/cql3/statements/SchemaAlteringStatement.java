/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
CFName	TokenNameIdentifier	 CF Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
CQLStatement	TokenNameIdentifier	 CQL Statement
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
ClientState	TokenNameIdentifier	 Client State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
QueryState	TokenNameIdentifier	 Query State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
ResultMessage	TokenNameIdentifier	 Result Message
;	TokenNameSEMICOLON	
/** * Abstract class for statements that alter the schema. */	TokenNameCOMMENT_JAVADOC	 Abstract class for statements that alter the schema. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SchemaAlteringStatement	TokenNameIdentifier	 Schema Altering Statement
extends	TokenNameextends	
CFStatement	TokenNameIdentifier	 CF Statement
implements	TokenNameimplements	
CQLStatement	TokenNameIdentifier	 CQL Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SchemaAlteringStatement	TokenNameIdentifier	 Schema Altering Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SchemaAlteringStatement	TokenNameIdentifier	 Schema Altering Statement
(	TokenNameLPAREN	
CFName	TokenNameIdentifier	 CF Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
prepareKeyspace	TokenNameIdentifier	 prepare Keyspace
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
prepareKeyspace	TokenNameIdentifier	 prepare Keyspace
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Prepared	TokenNameIdentifier	 Prepared
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Prepared	TokenNameIdentifier	 Prepared
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
SchemaChange	TokenNameIdentifier	 Schema Change
.	TokenNameDOT	
Change	TokenNameIdentifier	 Change
changeType	TokenNameIdentifier	 change Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
announceMigration	TokenNameIdentifier	 announce Migration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
announceMigration	TokenNameIdentifier	 announce Migration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
=	TokenNameEQUAL	
cfName	TokenNameIdentifier	 cf Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
SchemaChange	TokenNameIdentifier	 Schema Change
(	TokenNameLPAREN	
changeType	TokenNameIdentifier	 change Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tableName	TokenNameIdentifier	 table Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
executeInternal	TokenNameIdentifier	 execute Internal
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// executeInternal is for local query only, thus altering schema is not supported 	TokenNameCOMMENT_LINE	executeInternal is for local query only, thus altering schema is not supported 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
