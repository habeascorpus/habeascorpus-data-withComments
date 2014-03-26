/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EnumSet	TokenNameIdentifier	 Enum Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
StatementType	TokenNameIdentifier	 Statement Type
{	TokenNameLBRACE	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
INSERT	TokenNameIdentifier	 INSERT
,	TokenNameCOMMA	
UPDATE	TokenNameIdentifier	 UPDATE
,	TokenNameCOMMA	
BATCH	TokenNameIdentifier	 BATCH
,	TokenNameCOMMA	
USE	TokenNameIdentifier	 USE
,	TokenNameCOMMA	
TRUNCATE	TokenNameIdentifier	 TRUNCATE
,	TokenNameCOMMA	
DELETE	TokenNameIdentifier	 DELETE
,	TokenNameCOMMA	
CREATE_KEYSPACE	TokenNameIdentifier	 CREATE  KEYSPACE
,	TokenNameCOMMA	
CREATE_COLUMNFAMILY	TokenNameIdentifier	 CREATE  COLUMNFAMILY
,	TokenNameCOMMA	
CREATE_INDEX	TokenNameIdentifier	 CREATE  INDEX
,	TokenNameCOMMA	
DROP_INDEX	TokenNameIdentifier	 DROP  INDEX
,	TokenNameCOMMA	
DROP_KEYSPACE	TokenNameIdentifier	 DROP  KEYSPACE
,	TokenNameCOMMA	
DROP_COLUMNFAMILY	TokenNameIdentifier	 DROP  COLUMNFAMILY
,	TokenNameCOMMA	
ALTER_TABLE	TokenNameIdentifier	 ALTER  TABLE
;	TokenNameSEMICOLON	
// Statement types that don't require a keyspace to be set. 	TokenNameCOMMENT_LINE	Statement types that don't require a keyspace to be set. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
StatementType	TokenNameIdentifier	 Statement Type
>	TokenNameGREATER	
topLevel	TokenNameIdentifier	 top Level
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
USE	TokenNameIdentifier	 USE
,	TokenNameCOMMA	
CREATE_KEYSPACE	TokenNameIdentifier	 CREATE  KEYSPACE
,	TokenNameCOMMA	
DROP_KEYSPACE	TokenNameIdentifier	 DROP  KEYSPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
StatementType	TokenNameIdentifier	 Statement Type
>	TokenNameGREATER	
requiresKeyspace	TokenNameIdentifier	 requires Keyspace
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
complementOf	TokenNameIdentifier	 complement Of
(	TokenNameLPAREN	
topLevel	TokenNameIdentifier	 top Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
