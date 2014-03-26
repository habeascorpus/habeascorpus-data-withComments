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
EnumSet	TokenNameIdentifier	 Enum Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
ImmutableSet	TokenNameIdentifier	 Immutable Set
;	TokenNameSEMICOLON	
/** * An enum encapsulating the set of possible permissions that an authenticated user can have on a resource. * * IAuthorizer implementations may encode permissions using ordinals, so the Enum order must never change order. * Adding new values is ok. */	TokenNameCOMMENT_JAVADOC	 An enum encapsulating the set of possible permissions that an authenticated user can have on a resource. * IAuthorizer implementations may encode permissions using ordinals, so the Enum order must never change order. Adding new values is ok. 
public	TokenNamepublic	
enum	TokenNameenum	
Permission	TokenNameIdentifier	 Permission
{	TokenNameLBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
READ	TokenNameIdentifier	 READ
,	TokenNameCOMMA	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
WRITE	TokenNameIdentifier	 WRITE
,	TokenNameCOMMA	
// schema management 	TokenNameCOMMENT_LINE	schema management 
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
// required for CREATE KEYSPACE and CREATE TABLE. 	TokenNameCOMMENT_LINE	required for CREATE KEYSPACE and CREATE TABLE. 
ALTER	TokenNameIdentifier	 ALTER
,	TokenNameCOMMA	
// required for ALTER KEYSPACE, ALTER TABLE, CREATE INDEX, DROP INDEX. 	TokenNameCOMMENT_LINE	required for ALTER KEYSPACE, ALTER TABLE, CREATE INDEX, DROP INDEX. 
DROP	TokenNameIdentifier	 DROP
,	TokenNameCOMMA	
// required for DROP KEYSPACE and DROP TABLE. 	TokenNameCOMMENT_LINE	required for DROP KEYSPACE and DROP TABLE. 
// data access 	TokenNameCOMMENT_LINE	data access 
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
// required for SELECT. 	TokenNameCOMMENT_LINE	required for SELECT. 
MODIFY	TokenNameIdentifier	 MODIFY
,	TokenNameCOMMA	
// required for INSERT, UPDATE, DELETE, TRUNCATE. 	TokenNameCOMMENT_LINE	required for INSERT, UPDATE, DELETE, TRUNCATE. 
// permission management 	TokenNameCOMMENT_LINE	permission management 
AUTHORIZE	TokenNameIdentifier	 AUTHORIZE
;	TokenNameSEMICOLON	
// required for GRANT and REVOKE. 	TokenNameCOMMENT_LINE	required for GRANT and REVOKE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
ALL_DATA	TokenNameIdentifier	 ALL  DATA
=	TokenNameEQUAL	
ImmutableSet	TokenNameIdentifier	 Immutable Set
.	TokenNameDOT	
copyOf	TokenNameIdentifier	 copy Of
(	TokenNameLPAREN	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
AUTHORIZE	TokenNameIdentifier	 AUTHORIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
ImmutableSet	TokenNameIdentifier	 Immutable Set
.	TokenNameDOT	
copyOf	TokenNameIdentifier	 copy Of
(	TokenNameLPAREN	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
Permission	TokenNameIdentifier	 Permission
.	TokenNameDOT	
AUTHORIZE	TokenNameIdentifier	 AUTHORIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Permission	TokenNameIdentifier	 Permission
>	TokenNameGREATER	
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
ImmutableSet	TokenNameIdentifier	 Immutable Set
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
