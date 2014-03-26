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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
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
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
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
CounterMutation	TokenNameIdentifier	 Counter Mutation
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
RowMutation	TokenNameIdentifier	 Row Mutation
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
/** * A <code>BATCH</code> statement parsed from a CQL query. * */	TokenNameCOMMENT_JAVADOC	 A <code>BATCH</code> statement parsed from a CQL query. 
public	TokenNamepublic	
class	TokenNameclass	
BatchStatement	TokenNameIdentifier	 Batch Statement
extends	TokenNameextends	
ModificationStatement	TokenNameIdentifier	 Modification Statement
{	TokenNameLBRACE	
// statements to execute 	TokenNameCOMMENT_LINE	statements to execute 
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModificationStatement	TokenNameIdentifier	 Modification Statement
>	TokenNameGREATER	
statements	TokenNameIdentifier	 statements
;	TokenNameSEMICOLON	
/** * Creates a new BatchStatement from a list of statements and a * Thrift consistency level. * * @param type type of the batch * @param statements a list of UpdateStatements * @param attrs additional attributes for statement (CL, timestamp, timeToLive) */	TokenNameCOMMENT_JAVADOC	 Creates a new BatchStatement from a list of statements and a Thrift consistency level. * @param type type of the batch @param statements a list of UpdateStatements @param attrs additional attributes for statement (CL, timestamp, timeToLive) 
public	TokenNamepublic	
BatchStatement	TokenNameIdentifier	 Batch Statement
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModificationStatement	TokenNameIdentifier	 Modification Statement
>	TokenNameGREATER	
statements	TokenNameIdentifier	 statements
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
=	TokenNameEQUAL	
statements	TokenNameIdentifier	 statements
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
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
statement	TokenNameIdentifier	 statement
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
void	TokenNamevoid	
checkAccess	TokenNameIdentifier	 check Access
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
cfamsSeen	TokenNameIdentifier	 cfams Seen
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Avoid unnecessary authorizations. 	TokenNameCOMMENT_LINE	Avoid unnecessary authorizations. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
cfamsSeen	TokenNameIdentifier	 cfams Seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasColumnFamilyAccess	TokenNameIdentifier	 has Column Family Access
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
MODIFY	TokenNameIdentifier	 MODIFY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfamsSeen	TokenNameIdentifier	 cfams Seen
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Global TTL on the BATCH statement is not supported."	TokenNameStringLiteral	Global TTL on the BATCH statement is not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSetTimestamp	TokenNameIdentifier	 is Set Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
isSetTimestamp	TokenNameIdentifier	 is Set Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Timestamp must be set either on BATCH or individual statements"	TokenNameStringLiteral	Timestamp must be set either on BATCH or individual statements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"A TTL must be greater or equal to 0"	TokenNameStringLiteral	A TTL must be greater or equal to 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
validateConsistency	TokenNameIdentifier	 validate Consistency
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
validateConsistency	TokenNameIdentifier	 validate Consistency
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
getMutations	TokenNameIdentifier	 get Mutations
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
,	TokenNameCOMMA	
boolean	TokenNameboolean	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
long	TokenNamelong	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
,	TokenNameCOMMA	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
,	TokenNameCOMMA	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
mutations	TokenNameIdentifier	 mutations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
,	TokenNameCOMMA	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSetTimestamp	TokenNameIdentifier	 is Set Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
setTimestamp	TokenNameIdentifier	 set Timestamp
(	TokenNameLPAREN	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Group mutation together, otherwise they won't get applied atomically 	TokenNameCOMMENT_LINE	Group mutation together, otherwise they won't get applied atomically 
for	TokenNamefor	
(	TokenNameLPAREN	
IMutation	TokenNameIdentifier	 I Mutation
m	TokenNameIdentifier	 m
:	TokenNameCOLON	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
getMutations	TokenNameIdentifier	 get Mutations
(	TokenNameLPAREN	
variables	TokenNameIdentifier	 variables
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
instanceof	TokenNameinstanceof	
CounterMutation	TokenNameIdentifier	 Counter Mutation
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
COUNTER	TokenNameIdentifier	 COUNTER
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Counter mutations are only allowed in COUNTER batches"	TokenNameStringLiteral	Counter mutations are only allowed in COUNTER batches
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
instanceof	TokenNameinstanceof	
RowMutation	TokenNameIdentifier	 Row Mutation
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
COUNTER	TokenNameIdentifier	 COUNTER
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Only counter mutations are allowed in COUNTER batches"	TokenNameStringLiteral	Only counter mutations are allowed in COUNTER batches
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getTable	TokenNameIdentifier	 get Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IMutation	TokenNameIdentifier	 I Mutation
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
mutations	TokenNameIdentifier	 mutations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
mutations	TokenNameIdentifier	 mutations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
mutations	TokenNameIdentifier	 mutations
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
.	TokenNameDOT	
Prepared	TokenNameIdentifier	 Prepared
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
ColumnSpecification	TokenNameIdentifier	 Column Specification
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
boundNames	TokenNameIdentifier	 bound Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
// XXX: we use our knowledge that Modification don't create new statement upon call to prepare() 	TokenNameCOMMENT_LINE	XXX: we use our knowledge that Modification don't create new statement upon call to prepare() 
for	TokenNamefor	
(	TokenNameLPAREN	
ModificationStatement	TokenNameIdentifier	 Modification Statement
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
boundNames	TokenNameIdentifier	 bound Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
.	TokenNameDOT	
Prepared	TokenNameIdentifier	 Prepared
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
boundNames	TokenNameIdentifier	 bound Names
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
.	TokenNameDOT	
Prepared	TokenNameIdentifier	 Prepared
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
CFDefinition	TokenNameIdentifier	 CF Definition
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
boundNames	TokenNameIdentifier	 bound Names
=	TokenNameEQUAL	
new	TokenNamenew	
CFDefinition	TokenNameIdentifier	 CF Definition
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
[	TokenNameLBRACKET	
getBoundsTerms	TokenNameIdentifier	 get Bounds Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
boundNames	TokenNameIdentifier	 bound Names
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
"BatchStatement(type=%s, statements=%s)"	TokenNameStringLiteral	BatchStatement(type=%s, statements=%s)
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
