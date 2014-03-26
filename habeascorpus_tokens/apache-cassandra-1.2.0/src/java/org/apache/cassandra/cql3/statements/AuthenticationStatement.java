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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AuthenticationStatement	TokenNameIdentifier	 Authentication Statement
extends	TokenNameextends	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
implements	TokenNameimplements	
CQLStatement	TokenNameIdentifier	 CQL Statement
{	TokenNameLBRACE	
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
int	TokenNameint	
getBoundsTerms	TokenNameIdentifier	 get Bounds Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
,	TokenNameCOMMA	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClientState	TokenNameIdentifier	 get Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
ResultMessage	TokenNameIdentifier	 Result Message
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
,	TokenNameCOMMA	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
executeInternal	TokenNameIdentifier	 execute Internal
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// executeInternal is for local query only, thus altering users doesn't make sense and is not supported 	TokenNameCOMMENT_LINE	executeInternal is for local query only, thus altering users doesn't make sense and is not supported 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
