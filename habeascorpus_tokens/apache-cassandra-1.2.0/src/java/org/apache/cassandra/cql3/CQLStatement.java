/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
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
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
ResultMessage	TokenNameIdentifier	 Result Message
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
CQLStatement	TokenNameIdentifier	 CQL Statement
{	TokenNameLBRACE	
/** * Returns the number of bound terms in this statement. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bound terms in this statement. 
public	TokenNamepublic	
int	TokenNameint	
getBoundsTerms	TokenNameIdentifier	 get Bounds Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Perform any access verification necessary for the statement. * * @param state the current client state */	TokenNameCOMMENT_JAVADOC	 Perform any access verification necessary for the statement. * @param state the current client state 
public	TokenNamepublic	
void	TokenNamevoid	
checkAccess	TokenNameIdentifier	 check Access
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Perform additional validation required by the statment. * To be overriden by subclasses if needed. * * @param state the current client state */	TokenNameCOMMENT_JAVADOC	 Perform additional validation required by the statment. To be overriden by subclasses if needed. * @param state the current client state 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
/** * Execute the statement and return the resulting result or null if there is no result. * * @param state the current query state * @param variables the values for bounded variables. The implementation * can assume that each bound term have a corresponding value. */	TokenNameCOMMENT_JAVADOC	 Execute the statement and return the resulting result or null if there is no result. * @param state the current query state @param variables the values for bounded variables. The implementation can assume that each bound term have a corresponding value. 
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
,	TokenNameCOMMA	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
;	TokenNameSEMICOLON	
/** * Variante of execute used for internal query against the system tables, and thus only query the local node. * * @param state the current query state */	TokenNameCOMMENT_JAVADOC	 Variante of execute used for internal query against the system tables, and thus only query the local node. * @param state the current query state 
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
executeInternal	TokenNameIdentifier	 execute Internal
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
,	TokenNameCOMMA	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
