/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ConcurrentLinkedHashCacheProvider	TokenNameIdentifier	 Concurrent Linked Hash Cache Provider
implements	TokenNameimplements	
IRowCacheProvider	TokenNameIdentifier	 I Row Cache Provider
{	TokenNameLBRACE	
public	TokenNamepublic	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
