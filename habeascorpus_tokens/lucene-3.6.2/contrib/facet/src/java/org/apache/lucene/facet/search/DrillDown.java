package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Creation of drill down term or query. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Creation of drill down term or query. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DrillDown	TokenNameIdentifier	 Drill Down
{	TokenNameLBRACE	
/** * @see #term(FacetIndexingParams, CategoryPath) */	TokenNameCOMMENT_JAVADOC	 @see #term(FacetIndexingParams, CategoryPath) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a term for drilling down into a category. */	TokenNameCOMMENT_JAVADOC	 Return a term for drilling down into a category. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
=	TokenNameEQUAL	
iParams	TokenNameIdentifier	 i Params
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charsNeededForFullPath	TokenNameIdentifier	 chars Needed For Full Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iParams	TokenNameIdentifier	 i Params
.	TokenNameDOT	
drillDownTermText	TokenNameIdentifier	 drill Down Term Text
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a query for drilling down into all given categories (AND). * @see #term(FacetSearchParams, CategoryPath) * @see #query(FacetSearchParams, Query, CategoryPath...) */	TokenNameCOMMENT_JAVADOC	 Return a query for drilling down into all given categories (AND). @see #term(FacetSearchParams, CategoryPath) @see #query(FacetSearchParams, Query, CategoryPath...) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Empty category path not allowed for drill down query!"	TokenNameStringLiteral	Empty category path not allowed for drill down query!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
:	TokenNameCOLON	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a query for drilling down into all given categories (AND). * @see #term(FacetSearchParams, CategoryPath) * @see #query(FacetSearchParams, Query, CategoryPath...) */	TokenNameCOMMENT_JAVADOC	 Return a query for drilling down into all given categories (AND). @see #term(FacetSearchParams, CategoryPath) @see #query(FacetSearchParams, Query, CategoryPath...) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn a base query into a drilling-down query for all given category paths (AND). * @see #query(FacetIndexingParams, CategoryPath...) */	TokenNameCOMMENT_JAVADOC	 Turn a base query into a drilling-down query for all given category paths (AND). @see #query(FacetIndexingParams, CategoryPath...) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn a base query into a drilling-down query for all given category paths (AND). * @see #query(FacetSearchParams, CategoryPath...) */	TokenNameCOMMENT_JAVADOC	 Turn a base query into a drilling-down query for all given category paths (AND). @see #query(FacetSearchParams, CategoryPath...) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
sParams	TokenNameIdentifier	 s Params
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
sParams	TokenNameIdentifier	 s Params
.	TokenNameDOT	
getFacetIndexingParams	TokenNameIdentifier	 get Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn a base query into a drilling-down query using the default {@link FacetSearchParams} * @see #query(FacetSearchParams, Query, CategoryPath...) */	TokenNameCOMMENT_JAVADOC	 Turn a base query into a drilling-down query using the default {@link FacetSearchParams} @see #query(FacetSearchParams, Query, CategoryPath...) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
new	TokenNamenew	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseQuery	TokenNameIdentifier	 base Query
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
