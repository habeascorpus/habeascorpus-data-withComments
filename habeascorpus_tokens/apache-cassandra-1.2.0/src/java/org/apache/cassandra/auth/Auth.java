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
UntypedResultSet	TokenNameIdentifier	 Untyped Result Set
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
QueryProcessor	TokenNameIdentifier	 Query Processor
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
service	TokenNameIdentifier	 service
.	TokenNameDOT	
MigrationManager	TokenNameIdentifier	 Migration Manager
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Auth	TokenNameIdentifier	 Auth
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
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_SUPERUSER_NAME	TokenNameIdentifier	 DEFAULT  SUPERUSER  NAME
=	TokenNameEQUAL	
"cassandra"	TokenNameStringLiteral	cassandra
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
AUTH_KS	TokenNameIdentifier	 AUTH  KS
=	TokenNameEQUAL	
"system_auth"	TokenNameStringLiteral	system_auth
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USERS_CF	TokenNameIdentifier	 USERS  CF
=	TokenNameEQUAL	
"users"	TokenNameStringLiteral	users
;	TokenNameSEMICOLON	
/** * Checks if the username is stored in AUTH_KS.USERS_CF. * * @param username Username to query. * @return whether or not Cassandra knows about the user. */	TokenNameCOMMENT_JAVADOC	 Checks if the username is stored in AUTH_KS.USERS_CF. * @param username Username to query. @return whether or not Cassandra knows about the user. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isExistingUser	TokenNameIdentifier	 is Existing User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SELECT * FROM %s.%s WHERE name = '%s'"	TokenNameStringLiteral	SELECT * FROM %s.%s WHERE name = '%s'
,	TokenNameCOMMA	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
,	TokenNameCOMMA	
USERS_CF	TokenNameIdentifier	 USERS  CF
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks if the user is a known superuser. * * @param username Username to query. * @return true is the user is a superuser, false if they aren't or don't exist at all. */	TokenNameCOMMENT_JAVADOC	 Checks if the user is a known superuser. * @param username Username to query. @return true is the user is a superuser, false if they aren't or don't exist at all. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSuperuser	TokenNameIdentifier	 is Superuser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SELECT super FROM %s.%s WHERE name = '%s'"	TokenNameStringLiteral	SELECT super FROM %s.%s WHERE name = '%s'
,	TokenNameCOMMA	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
,	TokenNameCOMMA	
USERS_CF	TokenNameIdentifier	 USERS  CF
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
UntypedResultSet	TokenNameIdentifier	 Untyped Result Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
one	TokenNameIdentifier	 one
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
"super"	TokenNameStringLiteral	super
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inserts the user into AUTH_KS.USERS_CF (or overwrites their superuser status as a result of an ALTER USER query). * * @param username Username to insert. * @param isSuper User's new status. */	TokenNameCOMMENT_JAVADOC	 Inserts the user into AUTH_KS.USERS_CF (or overwrites their superuser status as a result of an ALTER USER query). * @param username Username to insert. @param isSuper User's new status. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
insertUser	TokenNameIdentifier	 insert User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSuper	TokenNameIdentifier	 is Super
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
{	TokenNameLBRACE	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"INSERT INTO %s.%s (name, super) VALUES ('%s', %s)"	TokenNameStringLiteral	INSERT INTO %s.%s (name, super) VALUES ('%s', %s)
,	TokenNameCOMMA	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
,	TokenNameCOMMA	
USERS_CF	TokenNameIdentifier	 USERS  CF
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isSuper	TokenNameIdentifier	 is Super
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the user from AUTH_KS.USERS_CF. * * @param username Username to delete. */	TokenNameCOMMENT_JAVADOC	 Deletes the user from AUTH_KS.USERS_CF. * @param username Username to delete. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
deleteUser	TokenNameIdentifier	 delete User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
{	TokenNameLBRACE	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"DELETE FROM %s.%s WHERE name = '%s'"	TokenNameStringLiteral	DELETE FROM %s.%s WHERE name = '%s'
,	TokenNameCOMMA	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
,	TokenNameCOMMA	
USERS_CF	TokenNameIdentifier	 USERS  CF
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up Authenticator and Authorizer. */	TokenNameCOMMENT_JAVADOC	 Sets up Authenticator and Authorizer. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
authenticator	TokenNameIdentifier	 authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
authorizer	TokenNameIdentifier	 authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// register a custom MigrationListener for permissions cleanup after dropped keyspaces/cfs. 	TokenNameCOMMENT_LINE	register a custom MigrationListener for permissions cleanup after dropped keyspaces/cfs. 
MigrationManager	TokenNameIdentifier	 Migration Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
new	TokenNamenew	
MigrationListener	TokenNameIdentifier	 Migration Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up default superuser. */	TokenNameCOMMENT_JAVADOC	 Sets up default superuser. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setupSuperuser	TokenNameIdentifier	 setup Superuser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// insert a default superuser if AUTH_KS.USERS_CF is empty. 	TokenNameCOMMENT_LINE	insert a default superuser if AUTH_KS.USERS_CF is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SELECT * FROM %s.%s"	TokenNameStringLiteral	SELECT * FROM %s.%s
,	TokenNameCOMMA	
AUTH_KS	TokenNameIdentifier	 AUTH  KS
,	TokenNameCOMMA	
USERS_CF	TokenNameIdentifier	 USERS  CF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
insertUser	TokenNameIdentifier	 insert User
(	TokenNameLPAREN	
DEFAULT_SUPERUSER_NAME	TokenNameIdentifier	 DEFAULT  SUPERUSER  NAME
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Skipping default superuser setup: some nodes are not ready"	TokenNameStringLiteral	Skipping default superuser setup: some nodes are not ready
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we only worry about one character ('). Make sure it's properly escaped. 	TokenNameCOMMENT_LINE	we only worry about one character ('). Make sure it's properly escaped. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
"''"	TokenNameStringLiteral	''
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IAuthenticator	TokenNameIdentifier	 I Authenticator
authenticator	TokenNameIdentifier	 authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IAuthorizer	TokenNameIdentifier	 I Authorizer
authorizer	TokenNameIdentifier	 authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthorizer	TokenNameIdentifier	 get Authorizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
