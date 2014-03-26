/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
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
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
IMigrationListener	TokenNameIdentifier	 I Migration Listener
;	TokenNameSEMICOLON	
/** * IMigrationListener implementation that cleans up permissions on dropped resources. */	TokenNameCOMMENT_JAVADOC	 IMigrationListener implementation that cleans up permissions on dropped resources. 
public	TokenNamepublic	
class	TokenNameclass	
MigrationListener	TokenNameIdentifier	 Migration Listener
implements	TokenNameimplements	
IMigrationListener	TokenNameIdentifier	 I Migration Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onDropKeyspace	TokenNameIdentifier	 on Drop Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onDropColumnFamly	TokenNameIdentifier	 on Drop Column Famly
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onCreateKeyspace	TokenNameIdentifier	 on Create Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onCreateColumnFamly	TokenNameIdentifier	 on Create Column Famly
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onUpdateKeyspace	TokenNameIdentifier	 on Update Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onUpdateColumnFamly	TokenNameIdentifier	 on Update Column Famly
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
