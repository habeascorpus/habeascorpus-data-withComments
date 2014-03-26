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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Abstract class for statements that apply on a given column family. */	TokenNameCOMMENT_JAVADOC	 Abstract class for statements that apply on a given column family. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CFStatement	TokenNameIdentifier	 CF Statement
extends	TokenNameextends	
ParsedStatement	TokenNameIdentifier	 Parsed Statement
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
CFName	TokenNameIdentifier	 CF Name
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CFStatement	TokenNameIdentifier	 CF Statement
(	TokenNameLPAREN	
CFName	TokenNameIdentifier	 CF Name
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
=	TokenNameEQUAL	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
!	TokenNameNOT	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
hasKeyspace	TokenNameIdentifier	 has Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX: We explicitely only want to call state.getKeyspace() in this case, don't move it outside the if. 	TokenNameCOMMENT_LINE	XXX: We explicitely only want to call state.getKeyspace() in this case, don't move it outside the if. 
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
setKeyspace	TokenNameIdentifier	 set Keyspace
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
hasKeyspace	TokenNameIdentifier	 has Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"The statement hasn't be prepared correctly"	TokenNameStringLiteral	The statement hasn't be prepared correctly
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
