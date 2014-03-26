package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
MultiFieldQueryNodeProcessor	TokenNameIdentifier	 Multi Field Query Node Processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * This attribute is used by {@link MultiFieldQueryNodeProcessor} processor and * must be defined in the {@link QueryConfigHandler}. This attribute tells the * processor to which fields the terms in the query should be expanded. <br/> * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute is used by {@link MultiFieldQueryNodeProcessor} processor and must be defined in the {@link QueryConfigHandler}. This attribute tells the processor to which fields the terms in the query should be expanded. <br/> * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
MultiFieldAttribute	TokenNameIdentifier	 Multi Field Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFields	TokenNameIdentifier	 set Fields
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
