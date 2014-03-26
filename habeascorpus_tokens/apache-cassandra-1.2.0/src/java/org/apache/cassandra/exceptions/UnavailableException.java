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
UnavailableException	TokenNameIdentifier	 Unavailable Exception
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
required	TokenNameIdentifier	 required
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
alive	TokenNameIdentifier	 alive
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
,	TokenNameCOMMA	
int	TokenNameint	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
int	TokenNameint	
alive	TokenNameIdentifier	 alive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
UNAVAILABLE	TokenNameIdentifier	 UNAVAILABLE
,	TokenNameCOMMA	
"Cannot achieve consistency level "	TokenNameStringLiteral	Cannot achieve consistency level 
+	TokenNamePLUS	
consistency	TokenNameIdentifier	 consistency
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
required	TokenNameIdentifier	 required
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
alive	TokenNameIdentifier	 alive
=	TokenNameEQUAL	
alive	TokenNameIdentifier	 alive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
