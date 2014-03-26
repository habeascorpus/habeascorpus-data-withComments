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
auth	TokenNameIdentifier	 auth
.	TokenNameDOT	
DataResource	TokenNameIdentifier	 Data Resource
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
IResource	TokenNameIdentifier	 I Resource
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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PermissionAlteringStatement	TokenNameIdentifier	 Permission Altering Statement
extends	TokenNameextends	
AuthorizationStatement	TokenNameIdentifier	 Authorization Statement
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
permissions	TokenNameIdentifier	 permissions
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DataResource	TokenNameIdentifier	 Data Resource
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
PermissionAlteringStatement	TokenNameIdentifier	 Permission Altering Statement
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
permissions	TokenNameIdentifier	 permissions
,	TokenNameCOMMA	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
permissions	TokenNameIdentifier	 permissions
=	TokenNameEQUAL	
permissions	TokenNameIdentifier	 permissions
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
)	TokenNameRPAREN	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
username	TokenNameIdentifier	 username
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
// check that the user has AUTHORIZE permission on the resource or its parents, otherwise reject GRANT/REVOKE. 	TokenNameCOMMENT_LINE	check that the user has AUTHORIZE permission on the resource or its parents, otherwise reject GRANT/REVOKE. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
ensureHasPermission	TokenNameIdentifier	 ensure Has Permission
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
AUTHORIZE	TokenNameIdentifier	 AUTHORIZE
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check that the user has [a single permission or all in case of ALL] on the resource or its parents. 	TokenNameCOMMENT_LINE	check that the user has [a single permission or all in case of ALL] on the resource or its parents. 
for	TokenNamefor	
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
p	TokenNameIdentifier	 p
:	TokenNameCOLON	
permissions	TokenNameIdentifier	 permissions
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
ensureHasPermission	TokenNameIdentifier	 ensure Has Permission
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
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
!	TokenNameNOT	
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
"User %s doesn't exist"	TokenNameStringLiteral	User %s doesn't exist
,	TokenNameCOMMA	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if a keyspace is omitted when GRANT/REVOKE ON TABLE <table>, we need to correct the resource. 	TokenNameCOMMENT_LINE	if a keyspace is omitted when GRANT/REVOKE ON TABLE <table>, we need to correct the resource. 
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
maybeCorrectResource	TokenNameIdentifier	 maybe Correct Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
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
"%s doesn't exist"	TokenNameStringLiteral	%s doesn't exist
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
