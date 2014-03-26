package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
join	TokenNameIdentifier	 join
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Utility for query time joining using {@link org.apache.lucene.search.join.TermsQuery} and {@link org.apache.lucene.search.join.TermsCollector}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utility for query time joining using {@link org.apache.lucene.search.join.TermsQuery} and {@link org.apache.lucene.search.join.TermsCollector}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JoinUtil	TokenNameIdentifier	 Join Util
{	TokenNameLBRACE	
// No instances allowed 	TokenNameCOMMENT_LINE	No instances allowed 
private	TokenNameprivate	
JoinUtil	TokenNameIdentifier	 Join Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Method for query time joining. * <p/> * Execute the returned query with a {@link org.apache.lucene.search.IndexSearcher} to retrieve all documents that have the same terms in the * to field that match with documents matching the specified fromQuery and have the same terms in the from field. * * Notice: Can't join documents with a fromField that holds more then one term. * * * @param fromField The from field to join from * @param toField The to field to join to * @param fromQuery The query to match documents on the from side * @param fromSearcher The searcher that executed the specified fromQuery * @return a {@link org.apache.lucene.search.Query} instance that can be used to join documents based on the * terms in the from and to field * @throws java.io.IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Method for query time joining. <p/> Execute the returned query with a {@link org.apache.lucene.search.IndexSearcher} to retrieve all documents that have the same terms in the to field that match with documents matching the specified fromQuery and have the same terms in the from field. * Notice: Can't join documents with a fromField that holds more then one term. * @param fromField The from field to join from @param toField The to field to join to @param fromQuery The query to match documents on the from side @param fromSearcher The searcher that executed the specified fromQuery @return a {@link org.apache.lucene.search.Query} instance that can be used to join documents based on the terms in the from and to field @throws java.io.IOException If I/O related errors occur 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
createJoinQuery	TokenNameIdentifier	 create Join Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromField	TokenNameIdentifier	 from Field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
toField	TokenNameIdentifier	 to Field
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
fromQuery	TokenNameIdentifier	 from Query
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
fromSearcher	TokenNameIdentifier	 from Searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermsCollector	TokenNameIdentifier	 Terms Collector
termsCollector	TokenNameIdentifier	 terms Collector
=	TokenNameEQUAL	
new	TokenNamenew	
TermsCollector	TokenNameIdentifier	 Terms Collector
(	TokenNameLPAREN	
fromField	TokenNameIdentifier	 from Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromSearcher	TokenNameIdentifier	 from Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
fromQuery	TokenNameIdentifier	 from Query
,	TokenNameCOMMA	
termsCollector	TokenNameIdentifier	 terms Collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TermsQuery	TokenNameIdentifier	 Terms Query
(	TokenNameLPAREN	
toField	TokenNameIdentifier	 to Field
,	TokenNameCOMMA	
termsCollector	TokenNameIdentifier	 terms Collector
.	TokenNameDOT	
getCollectorTerms	TokenNameIdentifier	 get Collector Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
