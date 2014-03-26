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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResult	TokenNameIdentifier	 Facet Result
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
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
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestTopKResultsHandlerRandom	TokenNameIdentifier	 Test Top K Results Handler Random
extends	TokenNameextends	
BaseTestTopK	TokenNameIdentifier	 Base Test Top K
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
countFacets	TokenNameIdentifier	 count Facets
(	TokenNameLPAREN	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
int	TokenNameint	
numResults	TokenNameIdentifier	 num Results
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
doComplement	TokenNameIdentifier	 do Complement
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
facetSearchParams	TokenNameIdentifier	 facet Search Params
=	TokenNameEQUAL	
searchParamsWithRequests	TokenNameIdentifier	 search Params With Requests
(	TokenNameLPAREN	
numResults	TokenNameIdentifier	 num Results
,	TokenNameCOMMA	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetsCollector	TokenNameIdentifier	 Facets Collector
fc	TokenNameIdentifier	 fc
=	TokenNameEQUAL	
new	TokenNamenew	
FacetsCollector	TokenNameIdentifier	 Facets Collector
(	TokenNameLPAREN	
facetSearchParams	TokenNameIdentifier	 facet Search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxoReader	TokenNameIdentifier	 taxo Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
initFacetsAccumulator	TokenNameIdentifier	 init Facets Accumulator
(	TokenNameLPAREN	
FacetSearchParams	TokenNameIdentifier	 Facet Search Params
facetSearchParams	TokenNameIdentifier	 facet Search Params
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
accumulator	TokenNameIdentifier	 accumulator
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFacetsAccumulator	TokenNameIdentifier	 Standard Facets Accumulator
(	TokenNameLPAREN	
facetSearchParams	TokenNameIdentifier	 facet Search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
complement	TokenNameIdentifier	 complement
=	TokenNameEQUAL	
doComplement	TokenNameIdentifier	 do Complement
?	TokenNameQUESTION	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
.	TokenNameDOT	
FORCE_COMPLEMENT	TokenNameIdentifier	 FORCE  COMPLEMENT
:	TokenNameCOLON	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
.	TokenNameDOT	
DISABLE_COMPLEMENT	TokenNameIdentifier	 DISABLE  COMPLEMENT
;	TokenNameSEMICOLON	
accumulator	TokenNameIdentifier	 accumulator
.	TokenNameDOT	
setComplementThreshold	TokenNameIdentifier	 set Complement Threshold
(	TokenNameLPAREN	
complement	TokenNameIdentifier	 complement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
accumulator	TokenNameIdentifier	 accumulator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fc	TokenNameIdentifier	 fc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
facetResults	TokenNameIdentifier	 facet Results
=	TokenNameEQUAL	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
facetResults	TokenNameIdentifier	 facet Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that indeed top results are returned, ordered same as all results * also when some facets have the same counts. */	TokenNameCOMMENT_JAVADOC	 Test that indeed top results are returned, ordered same as all results also when some facets have the same counts. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTopCountsOrder	TokenNameIdentifier	 test Top Counts Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
:	TokenNameCOLON	
partitionSizes	TokenNameIdentifier	 partition Sizes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initIndex	TokenNameIdentifier	 init Index
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Try out faceted search in it's most basic form (no sampling nor complement * that is). In this test lots (and lots..) of randomly generated data is * being indexed, and later on an "over-all" faceted search is performed. The * results are checked against the DF of each facet by itself */	TokenNameCOMMENT_BLOCK	 Try out faceted search in it's most basic form (no sampling nor complement that is). In this test lots (and lots..) of randomly generated data is being indexed, and later on an "over-all" faceted search is performed. The results are checked against the DF of each facet by itself 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
facetResults	TokenNameIdentifier	 facet Results
=	TokenNameEQUAL	
countFacets	TokenNameIdentifier	 count Facets
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCountsAndCardinality	TokenNameIdentifier	 assert Counts And Cardinality
(	TokenNameLPAREN	
facetCountsTruth	TokenNameIdentifier	 facet Counts Truth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
facetResults	TokenNameIdentifier	 facet Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Try out faceted search with complements. In this test lots (and lots..) of * randomly generated data is being indexed, and later on, a "beta" faceted * search is performed - retrieving ~90% of the documents so complements takes * place in here. The results are checked against the a regular (a.k.a * no-complement, no-sampling) faceted search with the same parameters. */	TokenNameCOMMENT_BLOCK	 Try out faceted search with complements. In this test lots (and lots..) of randomly generated data is being indexed, and later on, a "beta" faceted search is performed - retrieving ~90% of the documents so complements takes place in here. The results are checked against the a regular (a.k.a no-complement, no-sampling) faceted search with the same parameters. 
facetResults	TokenNameIdentifier	 facet Results
=	TokenNameEQUAL	
countFacets	TokenNameIdentifier	 count Facets
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCountsAndCardinality	TokenNameIdentifier	 assert Counts And Cardinality
(	TokenNameLPAREN	
facetCountsTruth	TokenNameIdentifier	 facet Counts Truth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
facetResults	TokenNameIdentifier	 facet Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
allFacetResults	TokenNameIdentifier	 all Facet Results
=	TokenNameEQUAL	
countFacets	TokenNameIdentifier	 count Facets
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxNumNodes	TokenNameIdentifier	 max Num Nodes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
fr	TokenNameIdentifier	 fr
:	TokenNameCOLON	
allFacetResults	TokenNameIdentifier	 all Facet Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
topResNode	TokenNameIdentifier	 top Res Node
=	TokenNameEQUAL	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxNumNodes	TokenNameIdentifier	 max Num Nodes
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxNumNodes	TokenNameIdentifier	 max Num Nodes
,	TokenNameCOMMA	
topResNode	TokenNameIdentifier	 top Res Node
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevCount	TokenNameIdentifier	 prev Count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
:	TokenNameCOLON	
topResNode	TokenNameIdentifier	 top Res Node
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"wrong counts order: prev="	TokenNameStringLiteral	wrong counts order: prev=
+	TokenNamePLUS	
prevCount	TokenNameIdentifier	 prev Count
+	TokenNamePLUS	
" curr="	TokenNameStringLiteral	 curr=
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prevCount	TokenNameIdentifier	 prev Count
>=	TokenNameGREATER_EQUAL	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevCount	TokenNameIdentifier	 prev Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
"--"	TokenNameStringLiteral	--
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"=="	TokenNameStringLiteral	==
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// will use this later to verify order of sub-results 	TokenNameCOMMENT_LINE	will use this later to verify order of sub-results 
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// verify that when asking for less results, they are always of highest counts 	TokenNameCOMMENT_LINE	verify that when asking for less results, they are always of highest counts 
// also verify that the order is stable 	TokenNameCOMMENT_LINE	also verify that the order is stable 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
maxNumNodes	TokenNameIdentifier	 max Num Nodes
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"------- verify for "	TokenNameStringLiteral	------- verify for 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" top results"	TokenNameStringLiteral	 top results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
someResults	TokenNameIdentifier	 some Results
=	TokenNameEQUAL	
countFacets	TokenNameIdentifier	 count Facets
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResult	TokenNameIdentifier	 Facet Result
fr	TokenNameIdentifier	 fr
:	TokenNameCOLON	
someResults	TokenNameIdentifier	 some Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
topResNode	TokenNameIdentifier	 top Res Node
=	TokenNameEQUAL	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"too many results: n="	TokenNameStringLiteral	too many results: n=
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
topResNode	TokenNameIdentifier	 top Res Node
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
topResNode	TokenNameIdentifier	 top Res Node
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
:	TokenNameCOLON	
topResNode	TokenNameIdentifier	 top Res Node
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
"--"	TokenNameStringLiteral	--
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"=="	TokenNameStringLiteral	==
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
origPos	TokenNameIdentifier	 orig Pos
=	TokenNameEQUAL	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"missing in all results: "	TokenNameStringLiteral	missing in all results: 
+	TokenNamePLUS	
frn	TokenNameIdentifier	 frn
,	TokenNameCOMMA	
origPos	TokenNameIdentifier	 orig Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong order of sub-results!"	TokenNameStringLiteral	wrong order of sub-results!
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
origPos	TokenNameIdentifier	 orig Pos
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify order of sub-results 	TokenNameCOMMENT_LINE	verify order of sub-results 
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
closeAll	TokenNameIdentifier	 close All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// done with this partition 	TokenNameCOMMENT_LINE	done with this partition 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
numDocsToIndex	TokenNameIdentifier	 num Docs To Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TEST_NIGHTLY	TokenNameIdentifier	 TEST  NIGHTLY
?	TokenNameQUESTION	
20000	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
