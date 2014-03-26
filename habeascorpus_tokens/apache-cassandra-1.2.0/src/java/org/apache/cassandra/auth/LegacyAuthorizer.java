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
*	TokenNameMULTIPLY	
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
/** * Provides a transitional IAuthorizer implementation for old-style (pre-1.2) authorizers. * * Translates old-style authorize() calls to the new-style, expands Permission.READ and Permission.WRITE * into the new Permission values, translates the new resource hierarchy into the old hierarchy. * Stubs the rest of the new methods. * Subclass LegacyAuthorizer instead of implementing the old IAuthority and your old IAuthority implementation should * continue to work. */	TokenNameCOMMENT_JAVADOC	 Provides a transitional IAuthorizer implementation for old-style (pre-1.2) authorizers. * Translates old-style authorize() calls to the new-style, expands Permission.READ and Permission.WRITE into the new Permission values, translates the new resource hierarchy into the old hierarchy. Stubs the rest of the new methods. Subclass LegacyAuthorizer instead of implementing the old IAuthority and your old IAuthority implementation should continue to work. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LegacyAuthorizer	TokenNameIdentifier	 Legacy Authorizer
implements	TokenNameimplements	
IAuthorizer	TokenNameIdentifier	 I Authorizer
{	TokenNameLBRACE	
/** * @param user Authenticated user requesting authorization. * @param resource List of Objects containing Strings and byte[]s: represents a resource in the old hierarchy. * @return Set of permissions of the user on the resource. Should never return null. Use Permission.NONE instead. */	TokenNameCOMMENT_JAVADOC	 @param user Authenticated user requesting authorization. @param resource List of Objects containing Strings and byte[]s: represents a resource in the old hierarchy. @return Set of permissions of the user on the resource. Should never return null. Use Permission.NONE instead. 
public	TokenNamepublic	
abstract	TokenNameabstract	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
validateConfiguration	TokenNameIdentifier	 validate Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
/** * Translates new-style authorize() method call to the old-style (including permissions and the hierarchy). */	TokenNameCOMMENT_JAVADOC	 Translates new-style authorize() method call to the old-style (including permissions and the hierarchy). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
instanceof	TokenNameinstanceof	
DataResource	TokenNameIdentifier	 Data Resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s resource is not supported by LegacyAuthorizer"	TokenNameStringLiteral	%s resource is not supported by LegacyAuthorizer
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataResource	TokenNameIdentifier	 Data Resource
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
)	TokenNameRPAREN	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
legacyResource	TokenNameIdentifier	 legacy Resource
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legacyResource	TokenNameIdentifier	 legacy Resource
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legacyResource	TokenNameIdentifier	 legacy Resource
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
KEYSPACES	TokenNameIdentifier	 KEYSPACES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
isRootLevel	TokenNameIdentifier	 is Root Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
legacyResource	TokenNameIdentifier	 legacy Resource
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
legacyResource	TokenNameIdentifier	 legacy Resource
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
permissions	TokenNameIdentifier	 permissions
=	TokenNameEQUAL	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
legacyResource	TokenNameIdentifier	 legacy Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
permissions	TokenNameIdentifier	 permissions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
permissions	TokenNameIdentifier	 permissions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
permissions	TokenNameIdentifier	 permissions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
WRITE	TokenNameIdentifier	 WRITE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
permissions	TokenNameIdentifier	 permissions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
ALTER	TokenNameIdentifier	 ALTER
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
DROP	TokenNameIdentifier	 DROP
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
MODIFY	TokenNameIdentifier	 MODIFY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
permissions	TokenNameIdentifier	 permissions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"GRANT operation is not supported by LegacyAuthorizer"	TokenNameStringLiteral	GRANT operation is not supported by LegacyAuthorizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"REVOKE operation is not supported by LegacyAuthorizer"	TokenNameStringLiteral	REVOKE operation is not supported by LegacyAuthorizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
droppedUser	TokenNameIdentifier	 dropped User
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
revokeAll	TokenNameIdentifier	 revoke All
(	TokenNameLPAREN	
IResource	TokenNameIdentifier	 I Resource
droppedResource	TokenNameIdentifier	 dropped Resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"LIST PERMISSIONS operation is not supported by LegacyAuthorizer"	TokenNameStringLiteral	LIST PERMISSIONS operation is not supported by LegacyAuthorizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
protectedResources	TokenNameIdentifier	 protected Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
