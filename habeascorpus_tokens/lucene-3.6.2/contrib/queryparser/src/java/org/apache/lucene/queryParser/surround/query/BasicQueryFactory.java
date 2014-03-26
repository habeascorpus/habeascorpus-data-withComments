package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* Create basic queries to be used during rewrite. * The basic queries are TermQuery and SpanTermQuery. * An exception can be thrown when too many of these are used. * SpanTermQuery and TermQuery use IndexReader.termEnum(Term), which causes the buffer usage. * * Use this class to limit the buffer usage for reading terms from an index. * Default is 1024, the same as the max. number of subqueries for a BooleanQuery. */	TokenNameCOMMENT_BLOCK	 Create basic queries to be used during rewrite. The basic queries are TermQuery and SpanTermQuery. An exception can be thrown when too many of these are used. SpanTermQuery and TermQuery use IndexReader.termEnum(Term), which causes the buffer usage. * Use this class to limit the buffer usage for reading terms from an index. Default is 1024, the same as the max. number of subqueries for a BooleanQuery. 
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
(	TokenNameLPAREN	
int	TokenNameint	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
=	TokenNameEQUAL	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queriesMade	TokenNameIdentifier	 queries Made
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
queriesMade	TokenNameIdentifier	 queries Made
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getNrQueriesMade	TokenNameIdentifier	 get Nr Queries Made
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queriesMade	TokenNameIdentifier	 queries Made
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxBasicQueries	TokenNameIdentifier	 get Max Basic Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
checkMax	TokenNameIdentifier	 check Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TooManyBasicQueries	TokenNameIdentifier	 Too Many Basic Queries
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queriesMade	TokenNameIdentifier	 queries Made
>=	TokenNameGREATER_EQUAL	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TooManyBasicQueries	TokenNameIdentifier	 Too Many Basic Queries
(	TokenNameLPAREN	
getMaxBasicQueries	TokenNameIdentifier	 get Max Basic Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queriesMade	TokenNameIdentifier	 queries Made
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TermQuery	TokenNameIdentifier	 Term Query
newTermQuery	TokenNameIdentifier	 new Term Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
TooManyBasicQueries	TokenNameIdentifier	 Too Many Basic Queries
{	TokenNameLBRACE	
checkMax	TokenNameIdentifier	 check Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
newSpanTermQuery	TokenNameIdentifier	 new Span Term Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
TooManyBasicQueries	TokenNameIdentifier	 Too Many Basic Queries
{	TokenNameLBRACE	
checkMax	TokenNameIdentifier	 check Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
