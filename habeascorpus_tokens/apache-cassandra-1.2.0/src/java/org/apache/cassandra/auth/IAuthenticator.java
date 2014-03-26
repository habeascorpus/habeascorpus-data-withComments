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
Map	TokenNameIdentifier	 Map
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
public	TokenNamepublic	
interface	TokenNameinterface	
IAuthenticator	TokenNameIdentifier	 I Authenticator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USERNAME_KEY	TokenNameIdentifier	 USERNAME  KEY
=	TokenNameEQUAL	
"username"	TokenNameStringLiteral	username
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PASSWORD_KEY	TokenNameIdentifier	 PASSWORD  KEY
=	TokenNameEQUAL	
"password"	TokenNameStringLiteral	password
;	TokenNameSEMICOLON	
/** * Supported CREATE USER/ALTER USER options. * Currently only PASSWORD is available. */	TokenNameCOMMENT_JAVADOC	 Supported CREATE USER/ALTER USER options. Currently only PASSWORD is available. 
enum	TokenNameenum	
Option	TokenNameIdentifier	 Option
{	TokenNameLBRACE	
PASSWORD	TokenNameIdentifier	 PASSWORD
}	TokenNameRBRACE	
/** * Whether or not the authenticator requires explicit login. * If false will instantiate user with AuthenticatedUser.ANONYMOUS_USER. */	TokenNameCOMMENT_JAVADOC	 Whether or not the authenticator requires explicit login. If false will instantiate user with AuthenticatedUser.ANONYMOUS_USER. 
boolean	TokenNameboolean	
requireAuthentication	TokenNameIdentifier	 require Authentication
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set of options supported by CREATE USER and ALTER USER queries. * Should never return null - always return an empty set instead. */	TokenNameCOMMENT_JAVADOC	 Set of options supported by CREATE USER and ALTER USER queries. Should never return null - always return an empty set instead. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Option	TokenNameIdentifier	 Option
>	TokenNameGREATER	
supportedOptions	TokenNameIdentifier	 supported Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Subset of supportedOptions that users are allowed to alter when performing ALTER USER [themselves]. * Should never return null - always return an empty set instead. */	TokenNameCOMMENT_JAVADOC	 Subset of supportedOptions that users are allowed to alter when performing ALTER USER [themselves]. Should never return null - always return an empty set instead. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Option	TokenNameIdentifier	 Option
>	TokenNameGREATER	
alterableOptions	TokenNameIdentifier	 alterable Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Authenticates a user given a Map<String, String> of credentials. * Should never return null - always throw AuthenticationException instead. * Returning AuthenticatedUser.ANONYMOUS_USER is an option as well if authentication is not required. * * @throws AuthenticationException if credentials don't match any known user. */	TokenNameCOMMENT_JAVADOC	 Authenticates a user given a Map<String, String> of credentials. Should never return null - always throw AuthenticationException instead. Returning AuthenticatedUser.ANONYMOUS_USER is an option as well if authentication is not required. * @throws AuthenticationException if credentials don't match any known user. 
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
authenticate	TokenNameIdentifier	 authenticate
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
;	TokenNameSEMICOLON	
/** * Called during execution of CREATE USER query (also may be called on startup, see seedSuperuserOptions method). * If authenticator is static then the body of the method should be left blank, but don't throw an exception. * options are guaranteed to be a subset of supportedOptions(). * * @param username Username of the user to create. * @param options Options the user will be created with. * @throws InvalidRequestException */	TokenNameCOMMENT_JAVADOC	 Called during execution of CREATE USER query (also may be called on startup, see seedSuperuserOptions method). If authenticator is static then the body of the method should be left blank, but don't throw an exception. options are guaranteed to be a subset of supportedOptions(). * @param username Username of the user to create. @param options Options the user will be created with. @throws InvalidRequestException 
void	TokenNamevoid	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Option	TokenNameIdentifier	 Option
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Called during execution of ALTER USER query. * options are always guaranteed to be a subset of supportedOptions(). Furthermore, if the user performing the query * is not a superuser and is altering himself, then options are guaranteed to be a subset of alterableOptions(). * Keep the body of the method blank if your implementation doesn't support any options. * * @param username Username of the user that will be altered. * @param options Options to alter. * @throws InvalidRequestException */	TokenNameCOMMENT_JAVADOC	 Called during execution of ALTER USER query. options are always guaranteed to be a subset of supportedOptions(). Furthermore, if the user performing the query is not a superuser and is altering himself, then options are guaranteed to be a subset of alterableOptions(). Keep the body of the method blank if your implementation doesn't support any options. * @param username Username of the user that will be altered. @param options Options to alter. @throws InvalidRequestException 
void	TokenNamevoid	
alter	TokenNameIdentifier	 alter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Option	TokenNameIdentifier	 Option
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
/** * Called during execution of DROP USER query. * * @param username Username of the user that will be dropped. * @throws InvalidRequestException */	TokenNameCOMMENT_JAVADOC	 Called during execution of DROP USER query. * @param username Username of the user that will be dropped. @throws InvalidRequestException 
void	TokenNamevoid	
drop	TokenNameIdentifier	 drop
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
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
/** * Validates configuration of IAuthenticator implementation (if configurable). * * @throws ConfigurationException when there is a configuration error. */	TokenNameCOMMENT_JAVADOC	 Validates configuration of IAuthenticator implementation (if configurable). * @throws ConfigurationException when there is a configuration error. 
void	TokenNamevoid	
validateConfiguration	TokenNameIdentifier	 validate Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
/** * Setup is called once upon system startup to initialize the IAuthenticator. * * For example, use this method to create any required keyspaces/column families. */	TokenNameCOMMENT_JAVADOC	 Setup is called once upon system startup to initialize the IAuthenticator. * For example, use this method to create any required keyspaces/column families. 
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
