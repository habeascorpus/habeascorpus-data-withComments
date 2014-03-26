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
Collector	TokenNameIdentifier	 Collector
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
Scorer	TokenNameIdentifier	 Scorer
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
FacetRequest	TokenNameIdentifier	 Facet Request
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Collector for facet accumulation. * * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Collector for facet accumulation. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FacetsCollector	TokenNameIdentifier	 Facets Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
FacetsAccumulator	TokenNameIdentifier	 Facets Accumulator
facetsAccumulator	TokenNameIdentifier	 facets Accumulator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
resultsGuard	TokenNameIdentifier	 results Guard
;	TokenNameSEMICOLON	
/** * Create a collector for accumulating facets while collecting documents * during search. * * @param facetSearchParams * faceted search parameters defining which facets are required and * how. * @param indexReader * searched index. * @param taxonomyReader * taxonomy containing the facets. */	TokenNameCOMMENT_JAVADOC	 Create a collector for accumulating facets while collecting documents during search. * @param facetSearchParams faceted search parameters defining which facets are required and how. @param indexReader searched index. @param taxonomyReader taxonomy containing the facets. 
public	TokenNamepublic	
FacetsCollector	TokenNameIdentifier	 Facets Collector
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
facetsAccumulator	TokenNameIdentifier	 facets Accumulator
=	TokenNameEQUAL	
initFacetsAccumulator	TokenNameIdentifier	 init Facets Accumulator
(	TokenNameLPAREN	
facetSearchParams	TokenNameIdentifier	 facet Search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
=	TokenNameEQUAL	
initScoredDocCollector	TokenNameIdentifier	 init Scored Doc Collector
(	TokenNameLPAREN	
facetSearchParams	TokenNameIdentifier	 facet Search Params
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultsGuard	TokenNameIdentifier	 results Guard
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a {@link ScoredDocIdCollector} to be used as the first phase of * the facet collection. If all facetRequests are do not require the * document score, a ScoredDocIdCollector which does not store the document * scores would be returned. Otherwise a SDIC which does store the documents * will be returned, having an initial allocated space for 1000 such * documents' scores. */	TokenNameCOMMENT_JAVADOC	 Create a {@link ScoredDocIdCollector} to be used as the first phase of the facet collection. If all facetRequests are do not require the document score, a ScoredDocIdCollector which does not store the document scores would be returned. Otherwise a SDIC which does store the documents will be returned, having an initial allocated space for 1000 such documents' scores. 
protected	TokenNameprotected	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
initScoredDocCollector	TokenNameIdentifier	 init Scored Doc Collector
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
boolean	TokenNameboolean	
scoresNeeded	TokenNameIdentifier	 scores Needed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
frq	TokenNameIdentifier	 frq
:	TokenNameCOLON	
facetSearchParams	TokenNameIdentifier	 facet Search Params
.	TokenNameDOT	
getFacetRequests	TokenNameIdentifier	 get Facet Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frq	TokenNameIdentifier	 frq
.	TokenNameDOT	
requireDocumentScore	TokenNameIdentifier	 require Document Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scoresNeeded	TokenNameIdentifier	 scores Needed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scoresNeeded	TokenNameIdentifier	 scores Needed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the {@link FacetsAccumulator} to be used. Default is * {@link StandardFacetsAccumulator}. Called once at the constructor of the collector. * * @param facetSearchParams * The search params. * @param indexReader * A reader to the index to search in. * @param taxonomyReader * A reader to the active taxonomy. * @return The {@link FacetsAccumulator} to use. */	TokenNameCOMMENT_JAVADOC	 Create the {@link FacetsAccumulator} to be used. Default is {@link StandardFacetsAccumulator}. Called once at the constructor of the collector. * @param facetSearchParams The search params. @param indexReader A reader to the index to search in. @param taxonomyReader A reader to the active taxonomy. @return The {@link FacetsAccumulator} to use. 
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
return	TokenNamereturn	
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
}	TokenNameRBRACE	
/** * Return accumulated facets results (according to faceted search parameters) * for collected documents. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Return accumulated facets results (according to faceted search parameters) for collected documents. @throws IOException on error 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
resultsGuard	TokenNameIdentifier	 results Guard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// over protection 	TokenNameCOMMENT_LINE	over protection 
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lazy creation but just once 	TokenNameCOMMENT_LINE	lazy creation but just once 
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
facetsAccumulator	TokenNameIdentifier	 facets Accumulator
.	TokenNameDOT	
accumulate	TokenNameIdentifier	 accumulate
(	TokenNameLPAREN	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
.	TokenNameDOT	
getScoredDocIDs	TokenNameIdentifier	 get Scored Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scoreDocIdCollector	TokenNameIdentifier	 score Doc Id Collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
