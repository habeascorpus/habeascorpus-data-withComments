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
/** * Primary Cassandra authorization interface. */	TokenNameCOMMENT_JAVADOC	 Primary Cassandra authorization interface. 
public	TokenNamepublic	
interface	TokenNameinterface	
IAuthorizer	TokenNameIdentifier	 I Authorizer
{	TokenNameLBRACE	
/** * The primary IAuthorizer method. Returns a set of permissions of a user on a resource. * * @param user Authenticated user requesting authorization. * @param resource Resource for which the authorization is being requested. @see DataResource. * @return Set of permissions of the user on the resource. Should never return null. Use Permission.NONE instead. */	TokenNameCOMMENT_JAVADOC	 The primary IAuthorizer method. Returns a set of permissions of a user on a resource. * @param user Authenticated user requesting authorization. @param resource Resource for which the authorization is being requested. @see DataResource. @return Set of permissions of the user on the resource. Should never return null. Use Permission.NONE instead. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Grants a set of permissions on a resource to a user. * The opposite of revoke(). * * @param performer User who grants the permissions. * @param permissions Set of permissions to grant. * @param to Grantee of the permissions. * @param resource Resource on which to grant the permissions. * * @throws UnauthorizedException if the granting user isn't allowed to grant (and revoke) the permissions on the resource. * @throws InvalidRequestException upon parameter misconfiguration or internal error. */	TokenNameCOMMENT_JAVADOC	 Grants a set of permissions on a resource to a user. The opposite of revoke(). * @param performer User who grants the permissions. @param permissions Set of permissions to grant. @param to Grantee of the permissions. @param resource Resource on which to grant the permissions. * @throws UnauthorizedException if the granting user isn't allowed to grant (and revoke) the permissions on the resource. @throws InvalidRequestException upon parameter misconfiguration or internal error. 
void	TokenNamevoid	
grant	TokenNameIdentifier	 grant
(	TokenNameLPAREN	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
performer	TokenNameIdentifier	 performer
,	TokenNameCOMMA	
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
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Revokes a set of permissions on a resource from a user. * The opposite of grant(). * * @param performer User who revokes the permissions. * @param permissions Set of permissions to revoke. * @param from Revokee of the permissions. * @param resource Resource on which to revoke the permissions. * * @throws UnauthorizedException if the revoking user isn't allowed to revoke the permissions on the resource. * @throws InvalidRequestException upon parameter misconfiguration or internal error. */	TokenNameCOMMENT_JAVADOC	 Revokes a set of permissions on a resource from a user. The opposite of grant(). * @param performer User who revokes the permissions. @param permissions Set of permissions to revoke. @param from Revokee of the permissions. @param resource Resource on which to revoke the permissions. * @throws UnauthorizedException if the revoking user isn't allowed to revoke the permissions on the resource. @throws InvalidRequestException upon parameter misconfiguration or internal error. 
void	TokenNamevoid	
revoke	TokenNameIdentifier	 revoke
(	TokenNameLPAREN	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
performer	TokenNameIdentifier	 performer
,	TokenNameCOMMA	
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
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Returns a list of permissions on a resource of a user. * * @param performer User who wants to see the permissions. * @param permissions Set of Permission values the user is interested in. The result should only include the matching ones. * @param resource The resource on which permissions are requested. Can be null, in which case permissions on all resources * should be returned. * @param of The user whose permissions are requested. Can be null, in which case permissions of every user should be returned. * * @return All of the matching permission that the requesting user is authorized to know about. * * @throws UnauthorizedException if the user isn't allowed to view the requested permissions. * @throws InvalidRequestException upon parameter misconfiguration or internal error. */	TokenNameCOMMENT_JAVADOC	 Returns a list of permissions on a resource of a user. * @param performer User who wants to see the permissions. @param permissions Set of Permission values the user is interested in. The result should only include the matching ones. @param resource The resource on which permissions are requested. Can be null, in which case permissions on all resources should be returned. @param of The user whose permissions are requested. Can be null, in which case permissions of every user should be returned. * @return All of the matching permission that the requesting user is authorized to know about. * @throws UnauthorizedException if the user isn't allowed to view the requested permissions. @throws InvalidRequestException upon parameter misconfiguration or internal error. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
PermissionDetails	TokenNameIdentifier	 Permission Details
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
performer	TokenNameIdentifier	 performer
,	TokenNameCOMMA	
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
of	TokenNameIdentifier	 of
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * This method is called before deleting a user with DROP USER query so that a new user with the same * name wouldn't inherit permissions of the deleted user in the future. * * @param droppedUser The user to revoke all permissions from. */	TokenNameCOMMENT_JAVADOC	 This method is called before deleting a user with DROP USER query so that a new user with the same name wouldn't inherit permissions of the deleted user in the future. * @param droppedUser The user to revoke all permissions from. 
void	TokenNamevoid	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
droppedUser	TokenNameIdentifier	 dropped User
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is called after a resource is removed (i.e. keyspace or a table is dropped). * * @param droppedResource The resource to revoke all permissions on. */	TokenNameCOMMENT_JAVADOC	 This method is called after a resource is removed (i.e. keyspace or a table is dropped). * @param droppedResource The resource to revoke all permissions on. 
void	TokenNamevoid	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
IResource	TokenNameIdentifier	 I Resource
droppedResource	TokenNameIdentifier	 dropped Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set of resources that should be made inaccessible to users and only accessible internally. * * @return Keyspaces, column families that will be unreadable and unmodifiable by users; other resources. */	TokenNameCOMMENT_JAVADOC	 Set of resources that should be made inaccessible to users and only accessible internally. * @return Keyspaces, column families that will be unreadable and unmodifiable by users; other resources. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
protectedResources	TokenNameIdentifier	 protected Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Validates configuration of IAuthorizer implementation (if configurable). * * @throws ConfigurationException when there is a configuration error. */	TokenNameCOMMENT_JAVADOC	 Validates configuration of IAuthorizer implementation (if configurable). * @throws ConfigurationException when there is a configuration error. 
void	TokenNamevoid	
validateConfiguration	TokenNameIdentifier	 validate Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
/** * Setup is called once upon system startup to initialize the IAuthorizer. * * For example, use this method to create any required keyspaces/column families. */	TokenNameCOMMENT_JAVADOC	 Setup is called once upon system startup to initialize the IAuthorizer. * For example, use this method to create any required keyspaces/column families. 
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
