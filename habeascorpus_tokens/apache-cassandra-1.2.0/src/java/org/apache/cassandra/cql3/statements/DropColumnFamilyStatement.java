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
CFName	TokenNameIdentifier	 CF Name
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
MigrationManager	TokenNameIdentifier	 Migration Manager
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
class	TokenNameclass	
DropColumnFamilyStatement	TokenNameIdentifier	 Drop Column Family Statement
extends	TokenNameextends	
SchemaAlteringStatement	TokenNameIdentifier	 Schema Altering Statement
{	TokenNameLBRACE	
public	TokenNamepublic	
DropColumnFamilyStatement	TokenNameIdentifier	 Drop Column Family Statement
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
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasColumnFamilyAccess	TokenNameIdentifier	 has Column Family Access
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
DROP	TokenNameIdentifier	 DROP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
announceMigration	TokenNameIdentifier	 announce Migration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
MigrationManager	TokenNameIdentifier	 Migration Manager
.	TokenNameDOT	
announceColumnFamilyDrop	TokenNameIdentifier	 announce Column Family Drop
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
SchemaChange	TokenNameIdentifier	 Schema Change
.	TokenNameDOT	
Change	TokenNameIdentifier	 Change
changeType	TokenNameIdentifier	 change Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
SchemaChange	TokenNameIdentifier	 Schema Change
.	TokenNameDOT	
Change	TokenNameIdentifier	 Change
.	TokenNameDOT	
DROPPED	TokenNameIdentifier	 DROPPED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
