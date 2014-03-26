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
/** Represents hits returned by {@link * Searcher#search(Query,Filter,int,Sort)}. */	TokenNameCOMMENT_JAVADOC	 Represents hits returned by {@link Searcher#search(Query,Filter,int,Sort)}. 
public	TokenNamepublic	
class	TokenNameclass	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
extends	TokenNameextends	
TopDocs	TokenNameIdentifier	 Top Docs
{	TokenNameLBRACE	
/** The fields which were used to sort results by. */	TokenNameCOMMENT_JAVADOC	 The fields which were used to sort results by. 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
/** Creates one of these objects. * @param totalHits Total number of hits for the query. * @param scoreDocs The top hits for the query. * @param fields The sort criteria used to find the top hits. * @param maxScore The maximum score encountered. */	TokenNameCOMMENT_JAVADOC	 Creates one of these objects. @param totalHits Total number of hits for the query. @param scoreDocs The top hits for the query. @param fields The sort criteria used to find the top hits. @param maxScore The maximum score encountered. 
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
(	TokenNameLPAREN	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
