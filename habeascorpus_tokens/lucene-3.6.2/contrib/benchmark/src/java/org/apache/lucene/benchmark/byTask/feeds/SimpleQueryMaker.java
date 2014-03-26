package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
;	TokenNameSEMICOLON	
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
QueryParser	TokenNameIdentifier	 Query Parser
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
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
Query	TokenNameIdentifier	 Query
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * A QueryMaker that makes queries for a collection created * using {@link org.apache.lucene.benchmark.byTask.feeds.SingleDocSource}. */	TokenNameCOMMENT_JAVADOC	 A QueryMaker that makes queries for a collection created using {@link org.apache.lucene.benchmark.byTask.feeds.SingleDocSource}. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleQueryMaker	TokenNameIdentifier	 Simple Query Maker
extends	TokenNameextends	
AbstractQueryMaker	TokenNameIdentifier	 Abstract Query Maker
{	TokenNameLBRACE	
/** * Prepare the queries for this test. * Extending classes can override this method for preparing different queries. * @return prepared queries. * @throws Exception if cannot prepare the queries. */	TokenNameCOMMENT_JAVADOC	 Prepare the queries for this test. Extending classes can override this method for preparing different queries. @return prepared queries. @throws Exception if cannot prepare the queries. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prepareQueries	TokenNameIdentifier	 prepare Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// analyzer (default is standard analyzer) 	TokenNameCOMMENT_LINE	analyzer (default is standard analyzer) 
Analyzer	TokenNameIdentifier	 Analyzer
anlzr	TokenNameIdentifier	 anlzr
=	TokenNameEQUAL	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
.	TokenNameDOT	
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"analyzer"	TokenNameStringLiteral	analyzer
,	TokenNameCOMMA	
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral	org.apache.lucene.analysis.standard.StandardAnalyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
"doc2"	TokenNameStringLiteral	doc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"synthetic body"	TokenNameStringLiteral	synthetic body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
""synthetic body""	TokenNameStringLiteral	"synthetic body"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"synthetic text"	TokenNameStringLiteral	synthetic text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
""synthetic text""	TokenNameStringLiteral	"synthetic text"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
""synthetic text"~3"	TokenNameStringLiteral	"synthetic text"~3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"zoom*"	TokenNameStringLiteral	zoom*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"synth*"	TokenNameStringLiteral	synth*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
