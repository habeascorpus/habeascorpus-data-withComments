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
builders	TokenNameIdentifier	 builders
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
QueryNode	TokenNameIdentifier	 Query Node
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
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
MultiTermRewriteMethodProcessor	TokenNameIdentifier	 Multi Term Rewrite Method Processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
PrefixQuery	TokenNameIdentifier	 Prefix Query
;	TokenNameSEMICOLON	
/** * Builds a {@link PrefixQuery} object from a {@link PrefixWildcardQueryNode} * object. */	TokenNameCOMMENT_JAVADOC	 Builds a {@link PrefixQuery} object from a {@link PrefixWildcardQueryNode} object. 
public	TokenNamepublic	
class	TokenNameclass	
PrefixWildcardQueryNodeBuilder	TokenNameIdentifier	 Prefix Wildcard Query Node Builder
implements	TokenNameimplements	
StandardQueryBuilder	TokenNameIdentifier	 Standard Query Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
PrefixWildcardQueryNodeBuilder	TokenNameIdentifier	 Prefix Wildcard Query Node Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
PrefixQuery	TokenNameIdentifier	 Prefix Query
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryNode	TokenNameIdentifier	 query Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
wildcardNode	TokenNameIdentifier	 wildcard Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
)	TokenNameRPAREN	
queryNode	TokenNameIdentifier	 query Node
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
wildcardNode	TokenNameIdentifier	 wildcard Node
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wildcardNode	TokenNameIdentifier	 wildcard Node
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixQuery	TokenNameIdentifier	 Prefix Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixQuery	TokenNameIdentifier	 Prefix Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
wildcardNode	TokenNameIdentifier	 wildcard Node
.	TokenNameDOT	
getFieldAsString	TokenNameIdentifier	 get Field As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
)	TokenNameRPAREN	
queryNode	TokenNameIdentifier	 query Node
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
MultiTermRewriteMethodProcessor	TokenNameIdentifier	 Multi Term Rewrite Method Processor
.	TokenNameDOT	
TAG_ID	TokenNameIdentifier	 TAG  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
