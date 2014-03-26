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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
extends	TokenNameextends	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
received	TokenNameIdentifier	 received
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
,	TokenNameCOMMA	
int	TokenNameint	
received	TokenNameIdentifier	 received
,	TokenNameCOMMA	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Operation timed out - received only %d responses."	TokenNameStringLiteral	Operation timed out - received only %d responses.
,	TokenNameCOMMA	
received	TokenNameIdentifier	 received
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consistency	TokenNameIdentifier	 consistency
=	TokenNameEQUAL	
consistency	TokenNameIdentifier	 consistency
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
received	TokenNameIdentifier	 received
=	TokenNameEQUAL	
received	TokenNameIdentifier	 received
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockFor	TokenNameIdentifier	 block For
=	TokenNameEQUAL	
blockFor	TokenNameIdentifier	 block For
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
