package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BoostingQueryTest	TokenNameIdentifier	 Boosting Query Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBoostingQueryEquals	TokenNameIdentifier	 test Boosting Query Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermQuery	TokenNameIdentifier	 Term Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"subject:"	TokenNameStringLiteral	subject:
,	TokenNameCOMMA	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"subject:"	TokenNameStringLiteral	subject:
,	TokenNameCOMMA	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Two TermQueries with same attributes should be equal"	TokenNameStringLiteral	Two TermQueries with same attributes should be equal
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoostingQuery	TokenNameIdentifier	 Boosting Query
bq1	TokenNameIdentifier	 bq1
=	TokenNameEQUAL	
new	TokenNamenew	
BoostingQuery	TokenNameIdentifier	 Boosting Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
0.1f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoostingQuery	TokenNameIdentifier	 Boosting Query
bq2	TokenNameIdentifier	 bq2
=	TokenNameEQUAL	
new	TokenNamenew	
BoostingQuery	TokenNameIdentifier	 Boosting Query
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
0.1f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"BoostingQuery with same attributes is not equal"	TokenNameStringLiteral	BoostingQuery with same attributes is not equal
,	TokenNameCOMMA	
bq1	TokenNameIdentifier	 bq1
,	TokenNameCOMMA	
bq2	TokenNameIdentifier	 bq2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
