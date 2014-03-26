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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
IndexReader	TokenNameIdentifier	 Index Reader
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
/** The abstract base class for queries. <p>Instantiable subclasses are: <ul> <li> {@link TermQuery} <li> {@link MultiTermQuery} <li> {@link BooleanQuery} <li> {@link WildcardQuery} <li> {@link PhraseQuery} <li> {@link PrefixQuery} <li> {@link MultiPhraseQuery} <li> {@link FuzzyQuery} <li> {@link TermRangeQuery} <li> {@link NumericRangeQuery} <li> {@link org.apache.lucene.search.spans.SpanQuery} </ul> <p>A parser for queries is contained in: <ul> <li>{@link org.apache.lucene.queryParser.QueryParser QueryParser} </ul> */	TokenNameCOMMENT_JAVADOC	 The abstract base class for queries. <p>Instantiable subclasses are: <ul> <li> {@link TermQuery} <li> {@link MultiTermQuery} <li> {@link BooleanQuery} <li> {@link WildcardQuery} <li> {@link PhraseQuery} <li> {@link PrefixQuery} <li> {@link MultiPhraseQuery} <li> {@link FuzzyQuery} <li> {@link TermRangeQuery} <li> {@link NumericRangeQuery} <li> {@link org.apache.lucene.search.spans.SpanQuery} </ul> <p>A parser for queries is contained in: <ul> <li>{@link org.apache.lucene.queryParser.QueryParser QueryParser} </ul> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Query	TokenNameIdentifier	 Query
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// query boost factor 	TokenNameCOMMENT_LINE	query boost factor 
/** Sets the boost for this query clause to <code>b</code>. Documents * matching this clause will (in addition to the normal weightings) have * their score multiplied by <code>b</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the boost for this query clause to <code>b</code>. Documents matching this clause will (in addition to the normal weightings) have their score multiplied by <code>b</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Gets the boost for this clause. Documents matching * this clause will (in addition to the normal weightings) have their score * multiplied by <code>b</code>. The boost is 1.0 by default. */	TokenNameCOMMENT_JAVADOC	 Gets the boost for this clause. Documents matching this clause will (in addition to the normal weightings) have their score multiplied by <code>b</code>. The boost is 1.0 by default. 
public	TokenNamepublic	
float	TokenNamefloat	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a query to a string, with <code>field</code> assumed to be the * default field and omitted. * <p>The representation used is one that is supposed to be readable * by {@link org.apache.lucene.queryParser.QueryParser QueryParser}. However, * there are the following limitations: * <ul> * <li>If the query was created by the parser, the printed * representation may not be exactly what was parsed. For example, * characters that need to be escaped will be represented without * the required backslash.</li> * <li>Some of the more complicated queries (e.g. span queries) * don't have a representation that can be parsed by QueryParser.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Prints a query to a string, with <code>field</code> assumed to be the default field and omitted. <p>The representation used is one that is supposed to be readable by {@link org.apache.lucene.queryParser.QueryParser QueryParser}. However, there are the following limitations: <ul> <li>If the query was created by the parser, the printed representation may not be exactly what was parsed. For example, characters that need to be escaped will be represented without the required backslash.</li> <li>Some of the more complicated queries (e.g. span queries) don't have a representation that can be parsed by QueryParser.</li> </ul> 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Prints a query to a string. */	TokenNameCOMMENT_JAVADOC	 Prints a query to a string. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Constructs an appropriate Weight implementation for this query. * * <p> * Only implemented by primitive queries, which re-write to themselves. */	TokenNameCOMMENT_JAVADOC	 Expert: Constructs an appropriate Weight implementation for this query. * <p> Only implemented by primitive queries, which re-write to themselves. 
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Query "	TokenNameStringLiteral	Query 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
" does not implement createWeight"	TokenNameStringLiteral	 does not implement createWeight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Constructs and initializes a Weight for a <b>top-level</b> query. * @deprecated never ever use this method in {@link Weight} implementations. * Subclasses of {@code Query} should use {@link #createWeight}, instead. */	TokenNameCOMMENT_JAVADOC	 Expert: Constructs and initializes a Weight for a <b>top-level</b> query. @deprecated never ever use this method in {@link Weight} implementations. Subclasses of {@code Query} should use {@link #createWeight}, instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: called to re-write queries into primitive queries. For example, * a PrefixQuery will be rewritten into a BooleanQuery that consists * of TermQuerys. */	TokenNameCOMMENT_JAVADOC	 Expert: called to re-write queries into primitive queries. For example, a PrefixQuery will be rewritten into a BooleanQuery that consists of TermQuerys. 
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: called when re-writing queries under MultiSearcher. * * Create a single query suitable for use by all subsearchers (in 1-1 * correspondence with queries). This is an optimization of the OR of * all queries. We handle the common optimization cases of equal * queries and overlapping clauses of boolean OR queries (as generated * by MultiTermQuery.rewrite()). * Be careful overriding this method as queries[0] determines which * method will be called and is not necessarily of the same type as * the other queries. */	TokenNameCOMMENT_JAVADOC	 Expert: called when re-writing queries under MultiSearcher. * Create a single query suitable for use by all subsearchers (in 1-1 correspondence with queries). This is an optimization of the OR of all queries. We handle the common optimization cases of equal queries and overlapping clauses of boolean OR queries (as generated by MultiTermQuery.rewrite()). Be careful overriding this method as queries[0] determines which method will be called and is not necessarily of the same type as the other queries. 
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
combine	TokenNameIdentifier	 combine
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queries	TokenNameIdentifier	 queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
uniques	TokenNameIdentifier	 uniques
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// check if we can split the query into clauses 	TokenNameCOMMENT_LINE	check if we can split the query into clauses 
boolean	TokenNameboolean	
splittable	TokenNameIdentifier	 splittable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
splittable	TokenNameIdentifier	 splittable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
splittable	TokenNameIdentifier	 splittable
=	TokenNameEQUAL	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
isCoordDisabled	TokenNameIdentifier	 is Coord Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
splittable	TokenNameIdentifier	 splittable
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splittable	TokenNameIdentifier	 splittable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splittable	TokenNameIdentifier	 splittable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uniques	TokenNameIdentifier	 uniques
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uniques	TokenNameIdentifier	 uniques
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// optimization: if we have just one query, just return it 	TokenNameCOMMENT_LINE	optimization: if we have just one query, just return it 
if	TokenNameif	
(	TokenNameLPAREN	
uniques	TokenNameIdentifier	 uniques
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uniques	TokenNameIdentifier	 uniques
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
:	TokenNameCOLON	
uniques	TokenNameIdentifier	 uniques
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: adds all terms occurring in this query to the terms set. Only * works if this query is in its {@link #rewrite rewritten} form. * * @throws UnsupportedOperationException if this query is not yet rewritten */	TokenNameCOMMENT_JAVADOC	 Expert: adds all terms occurring in this query to the terms set. Only works if this query is in its {@link #rewrite rewritten} form. * @throws UnsupportedOperationException if this query is not yet rewritten 
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// needs to be implemented by query subclasses 	TokenNameCOMMENT_LINE	needs to be implemented by query subclasses 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: merges the clauses of a set of BooleanQuery's into a single * BooleanQuery. * *<p>A utility for use by {@link #combine(Query[])} implementations. */	TokenNameCOMMENT_JAVADOC	 Expert: merges the clauses of a set of BooleanQuery's into a single BooleanQuery. *<p>A utility for use by {@link #combine(Query[])} implementations. 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
mergeBooleanQueries	TokenNameIdentifier	 merge Boolean Queries
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
...	TokenNameELLIPSIS	
queries	TokenNameIdentifier	 queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
allClauses	TokenNameIdentifier	 all Clauses
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
booleanQuery	TokenNameIdentifier	 boolean Query
:	TokenNameCOLON	
queries	TokenNameIdentifier	 queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
booleanQuery	TokenNameIdentifier	 boolean Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allClauses	TokenNameIdentifier	 all Clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
coordDisabled	TokenNameIdentifier	 coord Disabled
=	TokenNameEQUAL	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isCoordDisabled	TokenNameIdentifier	 is Coord Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
coordDisabled	TokenNameIdentifier	 coord Disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
clause2	TokenNameIdentifier	 clause2
:	TokenNameCOLON	
allClauses	TokenNameIdentifier	 all Clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clause2	TokenNameIdentifier	 clause2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Returns the Similarity implementation to be used for this query. * Subclasses may override this method to specify their own Similarity * implementation, perhaps one that delegates through that of the Searcher. * By default the Searcher's Similarity implementation is returned. * @deprecated Instead of using "runtime" subclassing/delegation, subclass the Weight instead. */	TokenNameCOMMENT_JAVADOC	 Expert: Returns the Similarity implementation to be used for this query. Subclasses may override this method to specify their own Similarity implementation, perhaps one that delegates through that of the Searcher. By default the Searcher's Similarity implementation is returned. @deprecated Instead of using "runtime" subclassing/delegation, subclass the Weight instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a clone of this query. */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Clone not supported: "	TokenNameStringLiteral	Clone not supported: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
