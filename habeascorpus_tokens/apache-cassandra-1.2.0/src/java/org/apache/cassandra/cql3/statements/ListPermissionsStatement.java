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
*	TokenNameMULTIPLY	
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
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
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
ColumnSpecification	TokenNameIdentifier	 Column Specification
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
ResultSet	TokenNameIdentifier	 Result Set
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
UTF8Type	TokenNameIdentifier	 UT F8 Type
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
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
ResultMessage	TokenNameIdentifier	 Result Message
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ListPermissionsStatement	TokenNameIdentifier	 List Permissions Statement
extends	TokenNameextends	
AuthorizationStatement	TokenNameIdentifier	 Authorization Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KS	TokenNameIdentifier	 KS
=	TokenNameEQUAL	
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CF	TokenNameIdentifier	 CF
=	TokenNameEQUAL	
"permissions"	TokenNameStringLiteral	permissions
;	TokenNameSEMICOLON	
// virtual cf to use for now. 	TokenNameCOMMENT_LINE	virtual cf to use for now. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ColumnSpecification	TokenNameIdentifier	 Column Specification
>	TokenNameGREATER	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ColumnSpecification	TokenNameIdentifier	 Column Specification
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
CF	TokenNameIdentifier	 CF
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
"username"	TokenNameStringLiteral	username
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ColumnSpecification	TokenNameIdentifier	 Column Specification
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
CF	TokenNameIdentifier	 CF
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
"resource"	TokenNameStringLiteral	resource
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ColumnSpecification	TokenNameIdentifier	 Column Specification
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
CF	TokenNameIdentifier	 CF
,	TokenNameCOMMA	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
"permission"	TokenNameStringLiteral	permission
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
permissions	TokenNameIdentifier	 permissions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DataResource	TokenNameIdentifier	 Data Resource
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ListPermissionsStatement	TokenNameIdentifier	 List Permissions Statement
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
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
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
this	TokenNamethis	
.	TokenNameDOT	
recursive	TokenNameIdentifier	 recursive
=	TokenNameEQUAL	
recursive	TokenNameIdentifier	 recursive
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
// a check to ensure the existence of the user isn't being leaked by user existence check. 	TokenNameCOMMENT_LINE	a check to ensure the existence of the user isn't being leaked by user existence check. 
if	TokenNameif	
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
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
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ensureNotAnonymous	TokenNameIdentifier	 ensure Not Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Create a new ResultMessage type (?). Rows will do for now. 	TokenNameCOMMENT_LINE	TODO: Create a new ResultMessage type (?). Rows will do for now. 
public	TokenNamepublic	
ResultMessage	TokenNameIdentifier	 Result Message
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
IResource	TokenNameIdentifier	 I Resource
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
details	TokenNameIdentifier	 details
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
details	TokenNameIdentifier	 details
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resultMessage	TokenNameIdentifier	 result Message
(	TokenNameLPAREN	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ResultMessage	TokenNameIdentifier	 Result Message
resultMessage	TokenNameIdentifier	 result Message
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
details	TokenNameIdentifier	 details
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResultSet	TokenNameIdentifier	 Result Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ResultSet	TokenNameIdentifier	 Result Set
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PermissionDetails	TokenNameIdentifier	 Permission Details
pd	TokenNameIdentifier	 pd
:	TokenNameCOLON	
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addColumnValue	TokenNameIdentifier	 add Column Value
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addColumnValue	TokenNameIdentifier	 add Column Value
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addColumnValue	TokenNameIdentifier	 add Column Value
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
Rows	TokenNameIdentifier	 Rows
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getUser	TokenNameIdentifier	 get User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
permissions	TokenNameIdentifier	 permissions
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
