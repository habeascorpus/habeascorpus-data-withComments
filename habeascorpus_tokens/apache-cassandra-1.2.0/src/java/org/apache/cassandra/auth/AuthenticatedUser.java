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
/** * Returned from IAuthenticator#authenticate(), represents an authenticated user everywhere internally. */	TokenNameCOMMENT_JAVADOC	 Returned from IAuthenticator#authenticate(), represents an authenticated user everywhere internally. 
public	TokenNamepublic	
class	TokenNameclass	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANONYMOUS_USERNAME	TokenNameIdentifier	 ANONYMOUS  USERNAME
=	TokenNameEQUAL	
"anonymous"	TokenNameStringLiteral	anonymous
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
ANONYMOUS_USER	TokenNameIdentifier	 ANONYMOUS  USER
=	TokenNameEQUAL	
new	TokenNamenew	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
(	TokenNameLPAREN	
ANONYMOUS_USERNAME	TokenNameIdentifier	 ANONYMOUS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AuthenticatedUser	TokenNameIdentifier	 Authenticated User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the user's superuser status. * Only a superuser is allowed to perform CREATE USER and DROP USER queries. * Im most cased, though not necessarily, a superuser will have Permission.ALL on every resource * (depends on IAuthorizer implementation). */	TokenNameCOMMENT_JAVADOC	 Checks the user's superuser status. Only a superuser is allowed to perform CREATE USER and DROP USER queries. Im most cased, though not necessarily, a superuser will have Permission.ALL on every resource (depends on IAuthorizer implementation). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSuper	TokenNameIdentifier	 is Super
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isAnonymous	TokenNameIdentifier	 is Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Auth	TokenNameIdentifier	 Auth
.	TokenNameDOT	
isSuperuser	TokenNameIdentifier	 is Superuser
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If IAuthenticator doesn't require authentication, this method may return true. */	TokenNameCOMMENT_JAVADOC	 If IAuthenticator doesn't require authentication, this method may return true. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnonymous	TokenNameIdentifier	 is Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
ANONYMOUS_USER	TokenNameIdentifier	 ANONYMOUS  USER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"#<User %s>"	TokenNameStringLiteral	#<User %s>
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
