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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
QueryTreeBuilder	TokenNameIdentifier	 Query Tree Builder
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
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
TokenizedPhraseQueryNode	TokenNameIdentifier	 Tokenized Phrase Query Node
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
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
TermQuery	TokenNameIdentifier	 Term Query
;	TokenNameSEMICOLON	
/** * Builds a {@link PhraseQuery} object from a {@link TokenizedPhraseQueryNode} * object. */	TokenNameCOMMENT_JAVADOC	 Builds a {@link PhraseQuery} object from a {@link TokenizedPhraseQueryNode} object. 
public	TokenNamepublic	
class	TokenNameclass	
PhraseQueryNodeBuilder	TokenNameIdentifier	 Phrase Query Node Builder
implements	TokenNameimplements	
StandardQueryBuilder	TokenNameIdentifier	 Standard Query Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
PhraseQueryNodeBuilder	TokenNameIdentifier	 Phrase Query Node Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
PhraseQuery	TokenNameIdentifier	 Phrase Query
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryNode	TokenNameIdentifier	 query Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
TokenizedPhraseQueryNode	TokenNameIdentifier	 Tokenized Phrase Query Node
phraseNode	TokenNameIdentifier	 phrase Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TokenizedPhraseQueryNode	TokenNameIdentifier	 Tokenized Phrase Query Node
)	TokenNameRPAREN	
queryNode	TokenNameIdentifier	 query Node
;	TokenNameSEMICOLON	
PhraseQuery	TokenNameIdentifier	 Phrase Query
phraseQuery	TokenNameIdentifier	 phrase Query
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
phraseNode	TokenNameIdentifier	 phrase Node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermQuery	TokenNameIdentifier	 Term Query
termQuery	TokenNameIdentifier	 term Query
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
QueryTreeBuilder	TokenNameIdentifier	 Query Tree Builder
.	TokenNameDOT	
QUERY_TREE_BUILDER_TAGID	TokenNameIdentifier	 QUERY  TREE  BUILDER  TAGID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
termNode	TokenNameIdentifier	 term Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
phraseQuery	TokenNameIdentifier	 phrase Query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termQuery	TokenNameIdentifier	 term Query
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termNode	TokenNameIdentifier	 term Node
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
phraseQuery	TokenNameIdentifier	 phrase Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
