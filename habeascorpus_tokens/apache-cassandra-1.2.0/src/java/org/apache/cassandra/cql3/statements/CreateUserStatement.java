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
Auth	TokenNameIdentifier	 Auth
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
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
UserOptions	TokenNameIdentifier	 User Options
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
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
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
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
ResultMessage	TokenNameIdentifier	 Result Message
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CreateUserStatement	TokenNameIdentifier	 Create User Statement
extends	TokenNameextends	
AuthenticationStatement	TokenNameIdentifier	 Authentication Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
UserOptions	TokenNameIdentifier	 User Options
opts	TokenNameIdentifier	 opts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
superuser	TokenNameIdentifier	 superuser
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CreateUserStatement	TokenNameIdentifier	 Create User Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
UserOptions	TokenNameIdentifier	 User Options
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
boolean	TokenNameboolean	
superuser	TokenNameIdentifier	 superuser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
opts	TokenNameIdentifier	 opts
=	TokenNameEQUAL	
opts	TokenNameIdentifier	 opts
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
superuser	TokenNameIdentifier	 superuser
=	TokenNameEQUAL	
superuser	TokenNameIdentifier	 superuser
;	TokenNameSEMICOLON	
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
username	TokenNameIdentifier	 username
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Username can't be an empty string"	TokenNameStringLiteral	Username can't be an empty string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opts	TokenNameIdentifier	 opts
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
isExistingUser	TokenNameIdentifier	 is Existing User
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"User %s already exists"	TokenNameStringLiteral	User %s already exists
,	TokenNameCOMMA	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
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
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
validateLogin	TokenNameIdentifier	 validate Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getUser	TokenNameIdentifier	 get User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
"Only superusers are allowed to perfrom CREATE USER queries"	TokenNameStringLiteral	Only superusers are allowed to perfrom CREATE USER queries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
{	TokenNameLBRACE	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
insertUser	TokenNameIdentifier	 insert User
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
superuser	TokenNameIdentifier	 superuser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
