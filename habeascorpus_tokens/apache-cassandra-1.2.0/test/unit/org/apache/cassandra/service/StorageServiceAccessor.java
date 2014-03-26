/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
TokenMetadata	TokenNameIdentifier	 Token Metadata
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
StorageServiceAccessor	TokenNameIdentifier	 Storage Service Accessor
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TokenMetadata	TokenNameIdentifier	 Token Metadata
setTokenMetadata	TokenNameIdentifier	 set Token Metadata
(	TokenNameLPAREN	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tmd	TokenNameIdentifier	 tmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
setTokenMetadataUnsafe	TokenNameIdentifier	 set Token Metadata Unsafe
(	TokenNameLPAREN	
tmd	TokenNameIdentifier	 tmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
