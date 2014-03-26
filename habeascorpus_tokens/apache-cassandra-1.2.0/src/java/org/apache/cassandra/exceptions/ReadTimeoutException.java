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
ReadTimeoutException	TokenNameIdentifier	 Read Timeout Exception
extends	TokenNameextends	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
dataPresent	TokenNameIdentifier	 data Present
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReadTimeoutException	TokenNameIdentifier	 Read Timeout Exception
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
,	TokenNameCOMMA	
int	TokenNameint	
received	TokenNameIdentifier	 received
,	TokenNameCOMMA	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
,	TokenNameCOMMA	
boolean	TokenNameboolean	
dataPresent	TokenNameIdentifier	 data Present
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
READ_TIMEOUT	TokenNameIdentifier	 READ  TIMEOUT
,	TokenNameCOMMA	
consistency	TokenNameIdentifier	 consistency
,	TokenNameCOMMA	
received	TokenNameIdentifier	 received
,	TokenNameCOMMA	
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataPresent	TokenNameIdentifier	 data Present
=	TokenNameEQUAL	
dataPresent	TokenNameIdentifier	 data Present
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
