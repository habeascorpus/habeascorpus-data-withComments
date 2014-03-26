package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
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
Iterator	TokenNameIdentifier	 Iterator
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
FilteredQuery	TokenNameIdentifier	 Filtered Query
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringHelper	TokenNameIdentifier	 String Helper
;	TokenNameSEMICOLON	
/** * Utility class used to extract the terms used in a query, plus any weights. * This class will not find terms for MultiTermQuery, TermRangeQuery and PrefixQuery classes * so the caller must pass a rewritten query (see Query.rewrite) to obtain a list of * expanded terms. * */	TokenNameCOMMENT_JAVADOC	 Utility class used to extract the terms used in a query, plus any weights. This class will not find terms for MultiTermQuery, TermRangeQuery and PrefixQuery classes so the caller must pass a rewritten query (see Query.rewrite) to obtain a list of expanded terms. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
QueryTermExtractor	TokenNameIdentifier	 Query Term Extractor
{	TokenNameLBRACE	
/** * Extracts all terms texts of a given Query into an array of WeightedTerms * * @param query Query to extract term texts from * @return an array of the terms used in a query, plus their weights. */	TokenNameCOMMENT_JAVADOC	 Extracts all terms texts of a given Query into an array of WeightedTerms * @param query Query to extract term texts from @return an array of the terms used in a query, plus their weights. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extracts all terms texts of a given Query into an array of WeightedTerms * * @param query Query to extract term texts from * @param reader used to compute IDF which can be used to a) score selected fragments better * b) use graded highlights eg changing intensity of font color * @param fieldName the field on which Inverse Document Frequency (IDF) calculations are based * @return an array of the terms used in a query, plus their weights. */	TokenNameCOMMENT_JAVADOC	 Extracts all terms texts of a given Query into an array of WeightedTerms * @param query Query to extract term texts from @param reader used to compute IDF which can be used to a) score selected fragments better b) use graded highlights eg changing intensity of font color @param fieldName the field on which Inverse Document Frequency (IDF) calculations are based @return an array of the terms used in a query, plus their weights. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIdfWeightedTerms	TokenNameIdentifier	 get Idf Weighted Terms
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalNumDocs	TokenNameIdentifier	 total Num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//IDF algorithm taken from DefaultSimilarity class 	TokenNameCOMMENT_LINE	IDF algorithm taken from DefaultSimilarity class 
float	TokenNamefloat	
idf	TokenNameIdentifier	 idf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
totalNumDocs	TokenNameIdentifier	 total Num Docs
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
*=	TokenNameMULTIPLY_EQUAL	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extracts all terms texts of a given Query into an array of WeightedTerms * * @param query Query to extract term texts from * @param prohibited <code>true</code> to extract "prohibited" terms, too * @param fieldName The fieldName used to filter query terms * @return an array of the terms used in a query, plus their weights. */	TokenNameCOMMENT_JAVADOC	 Extracts all terms texts of a given Query into an array of WeightedTerms * @param query Query to extract term texts from @param prohibited <code>true</code> to extract "prohibited" terms, too @param fieldName The fieldName used to filter query terms @return an array of the terms used in a query, plus their weights. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extracts all terms texts of a given Query into an array of WeightedTerms * * @param query Query to extract term texts from * @param prohibited <code>true</code> to extract "prohibited" terms, too * @return an array of the terms used in a query, plus their weights. */	TokenNameCOMMENT_JAVADOC	 Extracts all terms texts of a given Query into an array of WeightedTerms * @param query Query to extract term texts from @param prohibited <code>true</code> to extract "prohibited" terms, too @return an array of the terms used in a query, plus their weights. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//fieldname MUST be interned prior to this call 	TokenNameCOMMENT_LINE	fieldname MUST be interned prior to this call 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
getTermsFromBooleanQuery	TokenNameIdentifier	 get Terms From Boolean Query
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
FilteredQuery	TokenNameIdentifier	 Filtered Query
)	TokenNameRPAREN	
getTermsFromFilteredQuery	TokenNameIdentifier	 get Terms From Filtered Query
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FilteredQuery	TokenNameIdentifier	 Filtered Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
nonWeightedTerms	TokenNameIdentifier	 non Weighted Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
nonWeightedTerms	TokenNameIdentifier	 non Weighted Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
nonWeightedTerms	TokenNameIdentifier	 non Weighted Terms
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedTerm	TokenNameIdentifier	 Weighted Term
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this is non-fatal for our purposes 	TokenNameCOMMENT_LINE	this is non-fatal for our purposes 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * extractTerms is currently the only query-independent means of introspecting queries but it only reveals * a list of terms for that query - not the boosts each individual term in that query may or may not have. * "Container" queries such as BooleanQuery should be unwrapped to get at the boost info held * in each child element. * Some discussion around this topic here: * http://www.gossamer-threads.com/lists/lucene/java-dev/34208?search_string=introspection;#34208 * Unfortunately there seemed to be limited interest in requiring all Query objects to implement * something common which would allow access to child queries so what follows here are query-specific * implementations for accessing embedded query elements. */	TokenNameCOMMENT_JAVADOC	 extractTerms is currently the only query-independent means of introspecting queries but it only reveals a list of terms for that query - not the boosts each individual term in that query may or may not have. "Container" queries such as BooleanQuery should be unwrapped to get at the boost info held in each child element. Some discussion around this topic here: http://www.gossamer-threads.com/lists/lucene/java-dev/34208?search_string=introspection;#34208 Unfortunately there seemed to be limited interest in requiring all Query objects to implement something common which would allow access to child queries so what follows here are query-specific implementations for accessing embedded query elements. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
getTermsFromBooleanQuery	TokenNameIdentifier	 get Terms From Boolean Query
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queryClauses	TokenNameIdentifier	 query Clauses
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
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
queryClauses	TokenNameIdentifier	 query Clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prohibited	TokenNameIdentifier	 prohibited
||	TokenNameOR_OR	
queryClauses	TokenNameIdentifier	 query Clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
queryClauses	TokenNameIdentifier	 query Clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
getTermsFromFilteredQuery	TokenNameIdentifier	 get Terms From Filtered Query
(	TokenNameLPAREN	
FilteredQuery	TokenNameIdentifier	 Filtered Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
