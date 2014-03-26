/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
MD5Digest	TokenNameIdentifier	 M D5 Digest
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PreparedQueryNotFoundException	TokenNameIdentifier	 Prepared Query Not Found Exception
extends	TokenNameextends	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
MD5Digest	TokenNameIdentifier	 M D5 Digest
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PreparedQueryNotFoundException	TokenNameIdentifier	 Prepared Query Not Found Exception
(	TokenNameLPAREN	
MD5Digest	TokenNameIdentifier	 M D5 Digest
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
UNPREPARED	TokenNameIdentifier	 UNPREPARED
,	TokenNameCOMMA	
makeMsg	TokenNameIdentifier	 make Msg
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
makeMsg	TokenNameIdentifier	 make Msg
(	TokenNameLPAREN	
MD5Digest	TokenNameIdentifier	 M D5 Digest
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Prepared query with ID %s not found"	TokenNameStringLiteral	Prepared query with ID %s not found
+	TokenNamePLUS	
" (either the query was not prepared on this host (maybe the host has been restarted?)"	TokenNameStringLiteral	 (either the query was not prepared on this host (maybe the host has been restarted?)
+	TokenNamePLUS	
" or you have prepared more than %d queries and query %s has been evicted from the internal cache)"	TokenNameStringLiteral	 or you have prepared more than %d queries and query %s has been evicted from the internal cache)
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
MAX_CACHE_PREPARED	TokenNameIdentifier	 MAX  CACHE  PREPARED
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
