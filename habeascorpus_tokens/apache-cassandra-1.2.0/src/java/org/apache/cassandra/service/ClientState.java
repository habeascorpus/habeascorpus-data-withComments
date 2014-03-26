/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
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
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
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
SystemTable	TokenNameIdentifier	 System Table
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
Table	TokenNameIdentifier	 Table
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
AuthenticationException	TokenNameIdentifier	 Authentication Exception
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SemanticVersion	TokenNameIdentifier	 Semantic Version
;	TokenNameSEMICOLON	
/** * State related to a client connection. */	TokenNameCOMMENT_JAVADOC	 State related to a client connection. 
public	TokenNamepublic	
class	TokenNameclass	
ClientState	TokenNameIdentifier	 Client State
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SemanticVersion	TokenNameIdentifier	 Semantic Version
DEFAULT_CQL_VERSION	TokenNameIdentifier	 DEFAULT  CQL  VERSION
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
READABLE_SYSTEM_RESOURCES	TokenNameIdentifier	 READABLE  SYSTEM  RESOURCES
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
PROTECTED_AUTH_RESOURCES	TokenNameIdentifier	 PROTECTED  AUTH  RESOURCES
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
IResource	TokenNameIdentifier	 I Resource
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// We want these system cfs to be always readable since many tools rely on them (nodetool, cqlsh, bulkloader, etc.) 	TokenNameCOMMENT_LINE	We want these system cfs to be always readable since many tools rely on them (nodetool, cqlsh, bulkloader, etc.) 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
LOCAL_CF	TokenNameIdentifier	 LOCAL  CF
,	TokenNameCOMMA	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
PEERS_CF	TokenNameIdentifier	 PEERS  CF
,	TokenNameCOMMA	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
SCHEMA_KEYSPACES_CF	TokenNameIdentifier	 SCHEMA  KEYSPACES  CF
,	TokenNameCOMMA	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
SCHEMA_COLUMNFAMILIES_CF	TokenNameIdentifier	 SCHEMA  COLUMNFAMILIES  CF
,	TokenNameCOMMA	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
SCHEMA_COLUMNS_CF	TokenNameIdentifier	 SCHEMA  COLUMNS  CF
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
READABLE_SYSTEM_RESOURCES	TokenNameIdentifier	 READABLE  SYSTEM  RESOURCES
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
SYSTEM_KS	TokenNameIdentifier	 SYSTEM  KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PROTECTED_AUTH_RESOURCES	TokenNameIdentifier	 PROTECTED  AUTH  RESOURCES
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
protectedResources	TokenNameIdentifier	 protected Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PROTECTED_AUTH_RESOURCES	TokenNameIdentifier	 PROTECTED  AUTH  RESOURCES
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
protectedResources	TokenNameIdentifier	 protected Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Current user for the session 	TokenNameCOMMENT_LINE	Current user for the session 
private	TokenNameprivate	
volatile	TokenNamevolatile	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SemanticVersion	TokenNameIdentifier	 Semantic Version
cqlVersion	TokenNameIdentifier	 cql Version
=	TokenNameEQUAL	
DEFAULT_CQL_VERSION	TokenNameIdentifier	 DEFAULT  CQL  VERSION
;	TokenNameSEMICOLON	
// internalCall is used to mark ClientState as used by some internal component 	TokenNameCOMMENT_LINE	internalCall is used to mark ClientState as used by some internal component 
// that should have an ability to modify system keyspace 	TokenNameCOMMENT_LINE	that should have an ability to modify system keyspace 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
internalCall	TokenNameIdentifier	 internal Call
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClientState	TokenNameIdentifier	 Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new, empty ClientState */	TokenNameCOMMENT_JAVADOC	 Construct a new, empty ClientState 
public	TokenNamepublic	
ClientState	TokenNameIdentifier	 Client State
(	TokenNameLPAREN	
boolean	TokenNameboolean	
internalCall	TokenNameIdentifier	 internal Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
internalCall	TokenNameIdentifier	 internal Call
=	TokenNameEQUAL	
internalCall	TokenNameIdentifier	 internal Call
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
requireAuthentication	TokenNameIdentifier	 require Authentication
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
.	TokenNameDOT	
ANONYMOUS_USER	TokenNameIdentifier	 ANONYMOUS  USER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRawKeyspace	TokenNameIdentifier	 get Raw Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"no keyspace has been specified"	TokenNameStringLiteral	no keyspace has been specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyspace	TokenNameIdentifier	 set Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getKSMetaData	TokenNameIdentifier	 get KS Meta Data
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Keyspace '"	TokenNameStringLiteral	Keyspace '
+	TokenNamePLUS	
ks	TokenNameIdentifier	 ks
+	TokenNamePLUS	
"' does not exist"	TokenNameStringLiteral	' does not exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempts to login this client with the given credentials map. */	TokenNameCOMMENT_JAVADOC	 Attempts to login this client with the given credentials map. 
public	TokenNamepublic	
void	TokenNamevoid	
login	TokenNameIdentifier	 login
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
credentials	TokenNameIdentifier	 credentials
)	TokenNameRPAREN	
throws	TokenNamethrows	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
{	TokenNameLBRACE	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
authenticate	TokenNameIdentifier	 authenticate
(	TokenNameLPAREN	
credentials	TokenNameIdentifier	 credentials
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
isAnonymous	TokenNameIdentifier	 is Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
isExistingUser	TokenNameIdentifier	 is Existing User
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"User %s doesn't exist - create it with CREATE USER query first"	TokenNameStringLiteral	User %s doesn't exist - create it with CREATE USER query first
,	TokenNameCOMMA	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
hasAllKeyspacesAccess	TokenNameIdentifier	 has All Keyspaces Access
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
internalCall	TokenNameIdentifier	 internal Call
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
validateLogin	TokenNameIdentifier	 validate Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureHasPermission	TokenNameIdentifier	 ensure Has Permission
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
hasKeyspaceAccess	TokenNameIdentifier	 has Keyspace Access
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
hasAccess	TokenNameIdentifier	 has Access
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
hasColumnFamilyAccess	TokenNameIdentifier	 has Column Family Access
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
hasAccess	TokenNameIdentifier	 has Access
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
DataResource	TokenNameIdentifier	 Data Resource
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
hasAccess	TokenNameIdentifier	 has Access
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
DataResource	TokenNameIdentifier	 Data Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
validateKeyspace	TokenNameIdentifier	 validate Keyspace
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
internalCall	TokenNameIdentifier	 internal Call
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
validateLogin	TokenNameIdentifier	 validate Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preventSystemKSSModification	TokenNameIdentifier	 prevent System KSS Modification
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
READABLE_SYSTEM_RESOURCES	TokenNameIdentifier	 READABLE  SYSTEM  RESOURCES
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
PROTECTED_AUTH_RESOURCES	TokenNameIdentifier	 PROTECTED  AUTH  RESOURCES
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Resource %s is inaccessible"	TokenNameStringLiteral	Resource %s is inaccessible
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureHasPermission	TokenNameIdentifier	 ensure Has Permission
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ensureHasPermission	TokenNameIdentifier	 ensure Has Permission
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"User %s has no %s permission on %s or any of its parents"	TokenNameStringLiteral	User %s has no %s permission on %s or any of its parents
,	TokenNameCOMMA	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
perm	TokenNameIdentifier	 perm
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
preventSystemKSSModification	TokenNameIdentifier	 prevent System KSS Modification
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
systemKeyspaceNames	TokenNameIdentifier	 system Keyspace Names
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
" keyspace is not user-modifiable."	TokenNameStringLiteral	 keyspace is not user-modifiable.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateLogin	TokenNameIdentifier	 validate Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
"You have not logged in"	TokenNameStringLiteral	You have not logged in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ensureNotAnonymous	TokenNameIdentifier	 ensure Not Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
{	TokenNameLBRACE	
validateLogin	TokenNameIdentifier	 validate Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
isAnonymous	TokenNameIdentifier	 is Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
"You have to be logged in to perform this query"	TokenNameStringLiteral	You have to be logged in to perform this query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
validateKeyspace	TokenNameIdentifier	 validate Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"You have not set a keyspace for this session"	TokenNameStringLiteral	You have not set a keyspace for this session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCQLVersion	TokenNameIdentifier	 set CQL Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
cql	TokenNameIdentifier	 cql
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
;	TokenNameSEMICOLON	
SemanticVersion	TokenNameIdentifier	 Semantic Version
cql3	TokenNameIdentifier	 cql3
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
;	TokenNameSEMICOLON	
// We've made some backward incompatible changes between CQL3 beta1 and the final. 	TokenNameCOMMENT_LINE	We've made some backward incompatible changes between CQL3 beta1 and the final. 
// It's ok because it was a beta, but it still mean we don't support 3.0.0-beta1 so reject it. 	TokenNameCOMMENT_LINE	It's ok because it was a beta, but it still mean we don't support 3.0.0-beta1 so reject it. 
SemanticVersion	TokenNameIdentifier	 Semantic Version
cql3Beta	TokenNameIdentifier	 cql3 Beta
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"3.0.0-beta1"	TokenNameStringLiteral	3.0.0-beta1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cql3Beta	TokenNameIdentifier	 cql3 Beta
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
"There has been a few syntax breaking changes between 3.0.0-beta1 and 3.0.0 "	TokenNameStringLiteral	There has been a few syntax breaking changes between 3.0.0-beta1 and 3.0.0 
+	TokenNamePLUS	
"(mainly the syntax for options of CREATE KEYSPACE and CREATE TABLE). 3.0.0-beta1 "	TokenNameStringLiteral	(mainly the syntax for options of CREATE KEYSPACE and CREATE TABLE). 3.0.0-beta1 
+	TokenNamePLUS	
" is not supported; please upgrade to 3.0.0"	TokenNameStringLiteral	 is not supported; please upgrade to 3.0.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
cql	TokenNameIdentifier	 cql
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cqlVersion	TokenNameIdentifier	 cql Version
=	TokenNameEQUAL	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
cql3	TokenNameIdentifier	 cql3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cqlVersion	TokenNameIdentifier	 cql Version
=	TokenNameEQUAL	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Provided version %s is not supported by this server (supported: %s)"	TokenNameStringLiteral	Provided version %s is not supported by this server (supported: %s)
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
getCQLSupportedVersion	TokenNameIdentifier	 get CQL Supported Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
getUser	TokenNameIdentifier	 get User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SemanticVersion	TokenNameIdentifier	 Semantic Version
getCQLVersion	TokenNameIdentifier	 get CQL Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cqlVersion	TokenNameIdentifier	 cql Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SemanticVersion	TokenNameIdentifier	 Semantic Version
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCQLSupportedVersion	TokenNameIdentifier	 get CQL Supported Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
cql	TokenNameIdentifier	 cql
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
;	TokenNameSEMICOLON	
SemanticVersion	TokenNameIdentifier	 Semantic Version
cql3	TokenNameIdentifier	 cql3
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cql	TokenNameIdentifier	 cql
,	TokenNameCOMMA	
cql3	TokenNameIdentifier	 cql3
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
IResource	TokenNameIdentifier	 I Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
authorize	TokenNameIdentifier	 authorize
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
